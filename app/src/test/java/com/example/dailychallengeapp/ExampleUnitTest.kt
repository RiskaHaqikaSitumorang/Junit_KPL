package com.example.dailychallengeapp

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        /* Test Case:
           Menguji operasi penjumlahan dasar.
           Input: 2 + 2
           Ekspektasi: 4
        */
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addChallengeToRepository() {
        /* Test Case:
           Menguji apakah challenge berhasil ditambahkan ke repository.
           Langkah:
           - Buat repository kosong
           - Tambahkan challenge
           - Cek apakah jumlah challenge = 1
        */
        val repo = ChallengeRepository()
        val challenge = Challenge(id = 1, title = "Ngoding")
        repo.addChallenge(challenge)
        assertEquals(1, repo.getChallenges().size)
    }

    @Test
    fun editChallengeTitle() {
        /* Test Case:
           Menguji apakah title challenge bisa diubah.
           Langkah:
           - Tambahkan challenge
           - Ubah title challenge
           - Cek apakah title-nya sesuai
        */
        val repo = ChallengeRepository()
        val challenge = Challenge(id = 2, title = "Belajar")
        repo.addChallenge(challenge)

        val item = repo.getChallenges().first { it.id == 2 }
        item.title = "Belajar Kotlin"
        assertEquals("Belajar Kotlin", item.title)
    }

    @Test
    fun clearChallenges_shouldEmptyList() {
        /* Test Case:
           Menguji fungsi clearChallenges menghapus semua item.
           Langkah:
           - Tambahkan beberapa challenge
           - Panggil clearChallenges()
           - Cek apakah list menjadi kosong
        */
        val repo = ChallengeRepository()
        repo.addChallenge(Challenge(1, "Challenge 1"))
        repo.addChallenge(Challenge(2, "Challenge 2"))

        repo.clearChallenges()
        assertTrue(repo.getChallenges().isEmpty())
    }
}
