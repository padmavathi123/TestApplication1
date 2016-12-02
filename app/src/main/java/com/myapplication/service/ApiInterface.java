package com.myapplication.service;

import com.myapplication.entities.ProductEntity;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pcs-155 on 27/10/16.
 */

public interface ApiInterface {


    @GET("/mobmerry/cloths.json")
    Call<ProductEntity> getClothProducts();

    @GET("mobmerry/food.json")
    Call<ProductEntity> getFoodProducts();

}
