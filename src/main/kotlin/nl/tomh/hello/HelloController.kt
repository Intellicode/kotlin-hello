package nl.tomh.hello

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class HelloController {
    @QueryMapping
    fun hello(): String {
        return "Hello, world!"
    }

    @QueryMapping
    fun prime(): Tokemon {
        return Tokemon("Prime", "Fire", "A fiery Tokemon.")
    }
}