package com.alexis.postapimvvm

data class User(val id: String?, val name: String?, val email: String?, val gender: String?, val status: String?)
data class UserResponse(val code: Int?, val meta: String?, val data: User? )
