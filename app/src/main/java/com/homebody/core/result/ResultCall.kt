package com.homebody.core.result

import com.homebody.core.exception.AppException
import com.homebody.core.exception.ResultException
import com.homebody.core.exception.UnknownApiErrorException
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ResultCall<T : Any>(
    private val proxy: Call<T>
) : Call<Result<T>> {

    override fun enqueue(callback: Callback<Result<T>>) {
        proxy.enqueue(
            object : Callback<T> {
                override fun onResponse(call: Call<T>, response: Response<T>) {
                    if (response.isSuccessful) {
                        val result = Result.success(response.body())
                        callback.onResponse(this@ResultCall, Response.success(result as Result<T>))
                    } else {
                        response.let {
                            UnknownApiErrorException(
                                it.errorBody().toString(),
                                it.raw().request.method,
                                it.raw().request.url.toString(),
                                it.code(),
                            )
                        }
                            .let { Result.failure<T>(it) }
                            .let { callback.onResponse(this@ResultCall, Response.success(it)) }
                    }
                }

                override fun onFailure(call: Call<T>, t: Throwable) {
                    val error = if (t is AppException) t else ResultException(t)
                    val result = Result.failure<T>(error)
                    callback.onResponse(this@ResultCall, Response.success(result))
                }
            },
        )
    }

    override fun execute(): Response<Result<T>> = throw NotImplementedError()
    override fun clone(): Call<Result<T>> = ResultCall(proxy.clone())
    override fun request(): Request = proxy.request()
    override fun timeout(): Timeout = proxy.timeout()
    override fun isExecuted(): Boolean = proxy.isExecuted
    override fun isCanceled(): Boolean = proxy.isCanceled
    override fun cancel() = proxy.cancel()
}
