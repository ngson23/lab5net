package com.example.demo5;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterUpdate {
    @FormUrlEncoded
    @POST("update_product.php")
    Call<SvrResponseUpdate> updateDB(
            @Field("pid") String pid,
            @Field("name") String name,
            @Field("price") String price,
            @Field("description") String description
    );
}
