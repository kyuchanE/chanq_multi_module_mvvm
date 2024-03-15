package dev.kyu.data.model

import com.google.gson.annotations.SerializedName
import dev.kyu.domain.model.RandomUserDomainData

data class RandomUserResponse(
    @SerializedName("results")
    val results: List<RandomUserData>,
    @SerializedName("info")
    val info: Info,
) {

    fun toDomain(): MutableList<RandomUserDomainData> {
        val returnDomainData = mutableListOf<RandomUserDomainData>()
        results.forEach {
            returnDomainData.add(
                RandomUserDomainData(
                    it.gender,
                    RandomUserDomainData.UserName(
                        it.name.title,
                        it.name.first,
                        it.name.last
                    ),
                    RandomUserDomainData.UserLocation(
                        it.location.city,
                        it.location.state,
                        it.location.country,
                        it.location.postcode,
                        RandomUserDomainData.UserLocation.latLong(
                            it.location.coordinates.latitude,
                            it.location.coordinates.longitude,
                        )
                    ),
                    it.email,
                    RandomUserDomainData.UserLogin(
                        it.login.uuid,
                        it.login.username,
                        it.login.password,
                    ),
                    it.phone,
                    it.cell,
                    RandomUserDomainData.UserId(
                        it.id.name,
                        it.id.value
                    ),
                    RandomUserDomainData.UserPicture(
                        it.picture.large,
                        it.picture.thumbnail,
                    )
                )
            )
        }
        return returnDomainData
    }

    data class RandomUserData(
        val gender: String,
        val name: UserName,
        val location: UserLocation,
        val email: String,
        val login: UserLogin,
        val phone: String,
        val cell: String,
        val id: UserId,
        val picture: UserPicture
    ) {
        data class UserName(
            val title: String,
            val first: String,
            val last: String,
        )

        data class UserLocation(
            val city: String,
            val state: String,
            val country: String,
            val postcode: String,
            val coordinates: latLong
        ) {
            data class latLong(
                val latitude: String,
                val longitude: String,
            )
        }

        data class UserLogin(
            val uuid: String,
            val username: String,
            val password: String,
        )

        data class UserId(
            val name: String,
            val value: String,
        )

        data class UserPicture(
            val large: String,
            val thumbnail: String,
        )
    }

    data class Info(
        val seed: String,
        val results: Int,
        val page: Int,
        val version: String,
    )
}
