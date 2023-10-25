package com.academy.techcenture.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoriesResponse {
    private String electronics;
    private String jewelery;

    @JsonProperty("men's clothing")
    private String mensClothing;

    @JsonProperty("women's clothing")
    private String womensClothing;
}
