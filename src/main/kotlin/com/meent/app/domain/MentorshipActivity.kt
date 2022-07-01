package com.meent.app.domain

import java.util.*

enum class ActivityStatus {
    // TODO: 30/06/2022 implement activity status
}

data class MentorshipActivity(
    val id: String,
    val mentorshipId: String,
    val description: String,
    val status: ActivityStatus,
    val dueDate: Date
)
