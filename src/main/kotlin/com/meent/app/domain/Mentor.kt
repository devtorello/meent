package com.meent.app.domain

enum class MentorMentorshipDuration {
    // TODO: 30/06/2022 implement mentor mentorship duration
}

data class Mentor(
    val id: String,
    val userId: String,
    val description: String,
    val subjects: String? = null,
    val durationLength: Int? = null,
    val durationType: MentorMentorshipDuration,
    val menteesCount: Int,
    val menteesLimit: Int
)
