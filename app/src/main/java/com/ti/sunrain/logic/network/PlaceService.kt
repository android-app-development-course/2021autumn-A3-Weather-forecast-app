package com.ti.sunrain.logic.network

import com.ti.sunrain.SunRainApplication
import com.ti.sunrain.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface PlaceService {

    /**
     * 查询城市接口
     */
    @GET("v2/place?token=${SunRainApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query")query: String) : Call<PlaceResponse>
}