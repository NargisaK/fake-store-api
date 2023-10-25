package com.academy.techcenture.api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiOperations {
    public static Response performGetRequest(String path){
        RequestSpecification requestSpecification = given();
        return requestSpecification
                .when()
                .get(path);
    }
}
