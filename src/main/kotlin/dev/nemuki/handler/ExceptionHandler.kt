package dev.nemuki.handler

import dev.nemuki.entity.ErrorResponse
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class ExceptionHandler : ExceptionMapper<Throwable> {

    override fun toResponse(exception: Throwable): Response =
        Response.serverError().entity(ErrorResponse("something wrong ;-(")).build()
}
