package com.meent.app.domain

data class Mentee(
    val id: String,
    val userId: String,
    val mentorId: String? = null
)
