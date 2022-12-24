package com.google.retrofitapp

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET("people")
    fun getData() : Call<List<MyDataItem>>

//    @POST("process_login")
//    fun requestLogin(@Body requestModel: RequestModel) : Call<ResponseClass>
}