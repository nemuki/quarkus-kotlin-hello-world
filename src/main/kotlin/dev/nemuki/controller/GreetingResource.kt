package dev.nemuki.controller

import dev.nemuki.entity.Greeting
import io.quarkus.logging.Log
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.jboss.resteasy.reactive.RestQuery
import javax.validation.constraints.Size
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/hello")
class GreetingResource(
    @ConfigProperty(name = "greeting.message") private val text: String,
) {
    @GET
    fun hello(
        @Size(min = 3, max = 10) @RestQuery name: String?
    ): Response {
        Log.debug("request name: $name")
        return Response.status(Response.Status.ACCEPTED).entity(Greeting(message = "hello $text, ${name ?: "world"}"))
            .build()
    }
}
