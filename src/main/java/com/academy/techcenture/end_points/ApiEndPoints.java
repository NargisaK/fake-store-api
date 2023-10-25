package com.academy.techcenture.end_points;

public class ApiEndPoints {
    public final static String BASE_URI = "https://fakestoreapi.com";
    public final static String GET_ALL_PRODUCTS = "/products";
    public final static String GET_SINGLE_PRODUCT = "/products/1";
    public final static String GET_LIMIT_RESULTS =  "/products?limit=5";
    public final static String GET_SORT_RESULTS = "/products?sort=desc";
    public final static String GET_ALL_CATEGORIES = "/products/categories";
    public final static String GET_PRODUCT_IN_SPECIFIC_CATEGORY = "/products/category/jewelery";
    public final static String POST_ADD_NEW_PRODUCT = "/products";
    public final static String PUT_UPDATE_PRODUCT = "/products/7";
    public final static String PATCH_UPDATE_PRODUCT = "/products/7";
    public final static String DELETE_PRODUCT = "/products/6";
}
