package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class PostmanEchoTest {
    @Test
    void shouldPostEcho() {
        // Given - When - Then

        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data dgdgd"))
        ;
    }

}
