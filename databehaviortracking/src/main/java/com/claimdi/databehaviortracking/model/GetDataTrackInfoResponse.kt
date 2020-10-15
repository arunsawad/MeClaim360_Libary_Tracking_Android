package com.claimdi.databehaviortracking.model

import com.claimdi.databehaviortracking.model.TrackInfo

data class GetDataTrackInfoResponse(
    val isTrackingBehavior: Boolean,
    val trackInfo: TrackInfo
)