package com.example.dailychallengeapp

data class Challenge(
    val id: Int,
    var title: String,
    var isCompleted: Boolean = false
)
