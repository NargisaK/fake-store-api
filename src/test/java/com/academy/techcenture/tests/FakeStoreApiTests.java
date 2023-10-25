package com.academy.techcenture.tests;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static com.academy.techcenture.api.ApiOperations.performGetRequest;
import static com.academy.techcenture.end_points.ApiEndPoints.*;

public class FakeStoreApiTests {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI = BASE_URI;
    }

    @Test
    public void getAllProductsApiTest(){
        performGetRequest(GET_ALL_PRODUCTS)
                .then()
                .statusCode(200)
                .body("", Matchers.instanceOf(List.class));
    }


}
