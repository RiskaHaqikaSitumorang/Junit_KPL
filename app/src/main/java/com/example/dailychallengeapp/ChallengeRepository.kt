package com.example.dailychallengeapp

class ChallengeRepository {
    private val challenges = mutableListOf<Challenge>()

    fun addChallenge(challenge: Challenge) {
        challenges.add(challenge)
    }

    fun getChallenges(): List<Challenge> = challenges

    fun markCompleted(id: Int) {
        challenges.find { it.id == id }?.isCompleted = true
    }

    fun clearChallenges() {
        challenges.clear()
    }
}
