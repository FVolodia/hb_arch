package com.homebody.core.exception

import java.io.PrintWriter

@Suppress("MemberVisibilityCanBePrivate")
class UnknownApiErrorException(
    val errorObject: Any,
    val httpMethod: String? = null,
    val requestURL: String? = null,
    val httpStatusCode: Int? = null,
) : AppException() {
    override val message
        get() = "API $httpStatusCode Error" + errorObject.toString().let {
            if (it.isBlank()) "" else ": $it"
        }

    /**
     * Overriding this for nicer logging in `Timber`.
     */
    override fun printStackTrace(s: PrintWriter) {
        synchronized(s) {
            // Print our stack trace
            s.println(toString())
            s.println("\tdue to $errorObject")
            s.println("\tduring $httpMethod $requestURL")
        }
    }
}