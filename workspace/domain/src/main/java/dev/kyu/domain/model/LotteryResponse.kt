package dev.kyu.domain.model

import com.google.gson.annotations.SerializedName

data class LotteryResponse(
    @SerializedName("returnValue")
    val returnValue: String,
    @SerializedName("drwNoDate")
    val drwNoDate: String,
    @SerializedName("drwNo")
    val drwNo: Int,
    @SerializedName("drwtNo1")
    val drwtNo1: Int,
    @SerializedName("drwtNo2")
    val drwtNo2: Int,
    @SerializedName("drwtNo3")
    val drwtNo3: Int,
    @SerializedName("drwtNo4")
    val drwtNo4: Int,
    @SerializedName("drwtNo5")
    val drwtNo5: Int,
    @SerializedName("drwtNo6")
    val drwtNo6: Int,
)
