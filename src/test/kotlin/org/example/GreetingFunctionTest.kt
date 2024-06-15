package org.example

import io.restassured.RestAssured.`when`
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test
import io.quarkus.google.cloud.functions.test.FunctionType
import io.quarkus.google.cloud.functions.test.WithFunction
import io.quarkus.test.junit.QuarkusTest

@QuarkusTest 
@WithFunction(FunctionType.HTTP) 
class GreetingFunctionTest {
    @Test
    fun `should say hello`() {
        `when`()
          .get()
          .then()
          .statusCode(200)
          .body(`is`("Hello Quarkus"))
    }
}