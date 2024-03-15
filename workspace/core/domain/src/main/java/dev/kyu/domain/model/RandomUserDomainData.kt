package dev.kyu.domain.model

data class RandomUserDomainData(
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
