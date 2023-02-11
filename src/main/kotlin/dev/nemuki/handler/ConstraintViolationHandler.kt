package dev.nemuki.handler

import dev.nemuki.entity.ErrorResponse
import javax.validation.ConstraintViolationException
import javax.ws.rs.core.Response
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider

@Provider
class ConstraintViolationHandler : ExceptionMapper<ConstraintViolationException> {

    override fun toResponse(exception: ConstraintViolationException): Response =
        Response.status(Response.Status.BAD_REQUEST)
            .entity(ErrorResponse("invalid parameter: detail: ${exception.message}")).build()
}
