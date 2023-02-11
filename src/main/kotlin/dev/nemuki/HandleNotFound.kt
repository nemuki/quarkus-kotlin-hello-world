package dev.nemuki

import javax.ws.rs.NotFoundException
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class HandleNotFound : ExceptionMapper<NotFoundException> {

    override fun toResponse(exception: NotFoundException): Response =
        Response.status(Response.Status.NOT_FOUND).entity("no handler found").build()
}
