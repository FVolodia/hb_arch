package com.homebody.core.exception

import java.io.IOException
import java.io.PrintWriter

abstract class AppException(
    override val message: String? = null,
    override val cause: Throwable? = null,
) : IOException() {

    open val errorName: String
        get() = this::class.simpleName ?: "AppError"

    override fun toString(): String = errorName + message.orEmpty()

    /**
     * Overriding this for nicer logging.
     */
    override fun printStackTrace(s: PrintWriter) {
        synchronized(s) {
            // Print our stack trace
            s.println(toString())
            cause?.let { s.println("\tcaused by $cause") }

            // And part of the real stack trace
            val trace = stackTrace
            for (traceElement in trace.take(4))
                s.println("\tat $traceElement")
            if (trace.size > 4)
                s.println("\t...")
        }
    }
}