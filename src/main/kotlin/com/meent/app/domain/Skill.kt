package com.meent.app.domain

enum class SkillType {
    // TODO: 30/06/2022 implement skill types
}

data class Skill(
    val id: String,
    val skillName: String,
    val type: SkillType
)
