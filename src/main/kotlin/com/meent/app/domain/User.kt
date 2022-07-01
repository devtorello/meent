package com.meent.app.domain

import java.util.*

enum class Gender {
    // TODO: 30/06/2022 implement genders
}

enum class Minority {
    // TODO: 30/06/2022 implement minorities
}

enum class UserType {
    // TODO: 30/06/2022 implement user types
}

data class User(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val biography: String? = null,
    val birthDate: Date? = null,
    val title: String? = null,
    val interests: String? = null,
    val skills: List<Skill>? = null,
    val twitter: String? = null,
    val devto: String? = null,
    val github: String? = null,
    val linkedin: String? = null,
    val gender: Gender? = null,
    val minority: Minority? = null
)
