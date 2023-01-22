package dev.nemuki

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class GreetingResource {

    @GET
    fun hello() = Greeting(message = "hello")
}