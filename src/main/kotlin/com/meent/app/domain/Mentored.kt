package com.meent.app.domain

data class Mentored(
    val id: String,
    val userId: String,
    val mentorId: String? = null
)
