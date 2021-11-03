package net.coremotion.challenge1.domain.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserDetail(
    @Json(name = "data")
    val `data`: Data,
)