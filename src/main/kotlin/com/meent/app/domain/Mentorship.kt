package com.meent.app.domain

import java.util.*

enum class MentorshipType {
    // TODO: 30/06/2022 implement mentorship types
}

data class Mentorship(
    val id: String,
    val mentorId: String,
    val menteeId: String,
    val startedAt: Date,
    val endedAt: Date,
    val type: MentorshipType
)
