package dev.nemuki.controller

import dev.nemuki.entity.Greeting
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.jboss.resteasy.reactive.RestQuery
import javax.validation.constraints.Size
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class GreetingResource(
    @ConfigProperty(name = "greeting.message") private val text: String,
) {
    @GET
    fun hello(
        @Size(min = 3, max = 10)
        @RestQuery
        name: String?
    ) = Greeting(message = "hello $text, ${name ?: "world"}")
}
