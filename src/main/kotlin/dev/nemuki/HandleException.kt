package dev.nemuki

import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class HandleException : ExceptionMapper<Throwable> {

    override fun toResponse(exception: Throwable?): Response? =
        Response.serverError().entity(ErrorResponse("something wrong ;-(")).build()
}
