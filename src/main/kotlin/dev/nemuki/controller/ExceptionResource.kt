package dev.nemuki.controller

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/ex")
class ExceptionResource {

    @GET
    fun ex() {
        @Suppress("TooGenericExceptionThrown", "ThrowingExceptionsWithoutMessageOrCause")
        throw Exception()
    }
}
