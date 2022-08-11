package com.alexis.postapimvvm

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetroServiceInterface {
    @POST("users")
    @Headers("Accept:application/json", "Content-Type:application/json",
    "Authorization: Bearer c6876ba874588156e5ae7316ac55f71adbe0fea4838b11cf7508096897751c46")
    fun createUser(@Body params: User) : Call<UserResponse>
}