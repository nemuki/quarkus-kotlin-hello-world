package dev.nemuki.handler

import dev.nemuki.entity.ErrorResponse
import javax.ws.rs.NotFoundException
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class NotFoundHandler : ExceptionMapper<NotFoundException> {

    override fun toResponse(exception: NotFoundException): Response =
        Response.status(Response.Status.NOT_FOUND).entity(ErrorResponse("no handler found")).build()
}
