# 🎯 DaylichallangeApp

Aplikasi Android sederhana untuk mencatat dan menyelesaikan tantangan harian. Pengguna dapat menambahkan challenge, mengedit, menandai sebagai selesai, dan menghapusnya.

---
## ✍️ Author
Riska Haqika Situmorang | 2208107010086


## 🧪 Unit & Instrumented Testing

Aplikasi ini telah dilengkapi dengan **unit test (local test)** dan **instrumented test** untuk memastikan fungsionalitas dasar berjalan dengan baik.

---

## 🚀 Fitur Aplikasi
- Menambahkan tantangan baru
- Mengedit tantangan yang ada
- Menandai tantangan yang sudah selesai
- Menghapus tantangan

## 🚀 Teknologi yang Digunakan
- Kotlin
- Android SDK
- RecyclerView
- AlertDialog
- Unit Testing (JUnit)
- Instrumented Testing (AndroidJUnit4)

 
### ✅ Unit Tests (Local Test)

File: `app/src/test/java/.../ExampleUnitTest.kt`

| Nama Test                        | Deskripsi                                                                 |
|----------------------------------|--------------------------------------------------------------------------|
| `addition_isCorrect()`           | Test sederhana untuk validasi operasi penjumlahan.                        |
| `addChallengeToRepository()`     | Memastikan data challenge berhasil ditambahkan ke repository.             |
| `editChallengeTitle()`           | Memastikan judul challenge bisa diedit dan tersimpan dengan benar.        |
| `clearChallenges_shouldEmptyList()` | Memastikan semua data challenge bisa dihapus dari repository.             |

---

### ✅ Instrumented Tests (Android Test)

File: `app/src/androidTest/java/.../ExampleInstrumentedTest.kt`

| Nama Test             | Deskripsi                                                       |
|------------------------|-----------------------------------------------------------------|
| `useAppContext()`      | Memastikan context aplikasi sesuai dengan package yang diharapkan. |
| `context_isNotNull()`  | Memastikan context tidak `null` saat aplikasi berjalan.        |

---

### 📸 Bukti Hasil Test

| Unit Test Results | Instrumented Test Results |
|-------------------|---------------------------|
| ![Unit Test](screenshots/unit_test_result.png) | ![Instrumented Test](screenshots/instrumented_test_result.png) |

---

## 📂 Struktur Folder Utama

```bash
├── app/
│   ├── src/
│   │   ├── main/java/com/example/dailychallengeapp/
│   │   │   ├── MainActivity.kt
│   │   │   ├── Challenge.kt
│   │   │   ├── ChallengeAdapter.kt
│   │   │   └── ChallengeRepository.kt
│   │   ├── androidTest/java/.../ExampleInstrumentedTest.kt
│   │   └── test/java/.../ExampleUnitTest.kt

```

## ⚙️ **Cara Instalasi**

Untuk menjalankan proyek ini di komputer lokal:

1. **Clone repository:**

```bash
git clone https://github.com/RiskaHaqikaSitumorang/Junit_KPL.git
```
2. Buka proyek di Android Studio

- Pastikan Android Studio telah terpasang dan diatur dengan benar.
- Import proyek ini dengan membuka folder DaylichallangeApp di Android Studio.

3. Jalankan aplikasi:
- Klik Run di Android Studio dan pilih emulator atau perangkat Android yang terhubung.


## 🧪 **Pengujian**

Aplikasi ini sudah dilengkapi dengan dua jenis pengujian:

- **Unit Test** (local test) – untuk memeriksa fungsionalitas kode secara lokal.
- **Instrumented Test** – untuk memeriksa fungsionalitas aplikasi di perangkat Android atau emulator.

### Cara menjalankan test:

#### 1. **Unit Test**:
- Buka file `ExampleUnitTest.kt`
- Klik **Run** pada fungsi test atau jalankan seluruh kelas unit test.

#### 2. **Instrumented Test**:
- Buka file `ExampleInstrumentedTest.kt`
- Klik **Run** pada fungsi test atau jalankan seluruh kelas instrumented test.
