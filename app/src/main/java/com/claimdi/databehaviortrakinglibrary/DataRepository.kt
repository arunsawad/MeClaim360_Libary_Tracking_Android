package com.claimdi.databehaviortrakinglibrary

import android.content.Context
import com.claimdi.databehaviortracking.model.GetDataTrackInfoResponse
import com.claimdi.databehaviortracking.model.MqttConfig
import com.claimdi.networklibrary.NetworkCall

class DataRepository constructor(private val context: Context, private val apiService: DataApi) {
    fun getConfig() = NetworkCall<MqttConfig>().makeCall(context, apiService.getConfigMqtt())
    fun getDataTrackInfo(acc : String) =
        NetworkCall<GetDataTrackInfoResponse>().makeCall(context, apiService.getDataTrackInfo(acc))
}