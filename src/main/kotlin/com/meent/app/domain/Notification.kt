package com.meent.app.domain

import java.util.Date

enum class NotificationStatus {
    // TODO: 30/06/2022 implement notification status
}

enum class NotificationType {
    // TODO: 30/06/2022 implement notification type
}

data class Notification(
    val id: String,
    val userId: String,
    val subject: String,
    val content: String,
    val sentAt: Date,
    val status: NotificationStatus,
    val type: NotificationType
)
