package org.example

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Named
import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse

@Named("greetingFunction") 
@ApplicationScoped 
class GreetingFunction : HttpFunction {
    override fun service(httpRequest: HttpRequest, httpResponse: HttpResponse) {
        val writer = httpResponse.writer
        writer.write("Hello Quarkus")
    }
}