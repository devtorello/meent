package com.meent.app.domain

import java.util.*

enum class SubmissionStatus {
    // TODO: 30/06/2022 implement submission status
}

data class MentorshipSubmission(
    val id: String,
    val menteeId: String,
    val mentorId: String,
    val status: SubmissionStatus,
    val intentText: String? = null,
    val submissionDate: Date
)
