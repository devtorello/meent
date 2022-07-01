package com.meent.app.domain

import java.util.*

enum class SessionStatus {
    // TODO: 30/06/2022 implement session status 
}

data class MentorshipSession(
    val id: String,
    val mentorshipId: String,
    val subjects: String? = null,
    val mentorComments: String? = null,
    val menteeComments: String? = null,
    val activityId: String? = null,
    val scheduledDate: Date,
    val status: SessionStatus
)
