package com.example.demo5;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface InterDelete {
    @FormUrlEncoded
    @POST("delete_product.php")
    Call<SvrResponseDelete> deleteDB(@Field("pid") String pid);
}
