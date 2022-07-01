package com.meent.app.domain

import java.util.*

data class Rating(
    val id: String,
    val userId: String,
    val feedback: String,
    val stars: Int,
    val userType: UserType,
    val ratedAt: Date
)
