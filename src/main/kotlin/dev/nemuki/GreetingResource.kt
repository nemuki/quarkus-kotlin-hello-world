package dev.nemuki

import org.jboss.resteasy.reactive.RestQuery
import javax.validation.constraints.Size
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class GreetingResource {

    @GET
    fun hello(
        @Size(min = 3, max = 10)
        @RestQuery
        name: String?
    ) = Greeting(message = "hello, ${name ?: "world"}")
}
