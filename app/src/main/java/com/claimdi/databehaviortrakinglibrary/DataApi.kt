package com.claimdi.databehaviortrakinglibrary

import com.claimdi.databehaviortracking.model.GetDataTrackInfoResponse
import com.claimdi.databehaviortracking.model.MqttConfig
import com.claimdi.databehaviortrakinglibrary.MainActivity.Companion.API_ROOT
import com.claimdi.databehaviortrakinglibrary.MainActivity.Companion.API_ROOT1
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface DataApi {
    @GET(API_ROOT)
    fun getConfigMqtt(): Call<MqttConfig>

    @GET("$API_ROOT1/{data}")
    fun getDataTrackInfo(@Path("data") id: String): Call<GetDataTrackInfoResponse>
}