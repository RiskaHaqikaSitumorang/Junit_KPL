package com.example.dailychallengeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var etChallenge: EditText
    private lateinit var btnAdd: Button
    private lateinit var rvChallenges: RecyclerView
    private lateinit var challengeAdapter: ChallengeAdapter
    private var challengeList = mutableListOf<Challenge>()
    private var nextId = 1 // Untuk generate ID unik secara sederhana

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etChallenge = findViewById(R.id.etChallenge)
        btnAdd = findViewById(R.id.btnAdd)
        rvChallenges = findViewById(R.id.rvChallenges)

        // Set up RecyclerView
        rvChallenges.layoutManager = LinearLayoutManager(this)
        challengeAdapter = ChallengeAdapter(challengeList)
        rvChallenges.adapter = challengeAdapter

        // Add challenge when the button is clicked
        btnAdd.setOnClickListener {
            val challengeTitle = etChallenge.text.toString().trim()
            if (challengeTitle.isNotEmpty() && challengeTitle != etChallenge.hint.toString()) {
                val challenge = Challenge(id = nextId, title = challengeTitle)
                challengeList.add(challenge)
                challengeAdapter.notifyDataSetChanged()
                etChallenge.text.clear()
                nextId++
            }
        }

    }
}
