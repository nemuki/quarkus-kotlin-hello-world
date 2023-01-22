package dev.nemuki

import org.jboss.resteasy.reactive.RestQuery
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class GreetingResource {

    @GET
    fun hello(@RestQuery name: String?) = Greeting(message = "hello, ${name ?: "world"}")
}
