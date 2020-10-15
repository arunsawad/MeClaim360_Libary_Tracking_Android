package com.claimdi.databehaviortracking

import android.location.Location
import com.claimdi.databehaviortracking.model.GetDataTrackInfoResponse
import com.claimdi.databehaviortracking.model.MqttConfig
import com.claimdi.databehaviortracking.model.TrackInfo

interface DataBehabviorInterface {
    fun startTracking(time: Long)
    fun setConfigMqtt(data: MqttConfig)
    fun getLastLocation() : Location?
    fun sendDataWithInfo(data: GetDataTrackInfoResponse)
    fun sendDataInfo(data: TrackInfo)
    fun getDataInfo(acc: String)
}