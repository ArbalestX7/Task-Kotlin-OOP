package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    println("Positive case")
    evenNumberPositive()

    println("Negative case")
    evenNumberException()
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun evenNumberPositive() {
        val nilaiGenap = "132109"

        try {
            val converter = nilaiGenap.toInt()
            println("Nilai berhasil dikonversi ke tipe data Integer: $converter ")
        } catch (e: NumberFormatException) {
            println("Error : Nilai tidak bisa dikonversi ke tipe data Integer")
        }
    }

    fun evenNumberException() {
        val nilaiGenap = "Dito"

        try {
            val converter = nilaiGenap.toInt()
            println("Nilai berhasil dikonversi ke tipe data Integer: $converter ")
        } catch (e: NumberFormatException) {
            println("Error : Nilai tidak bisa dikonversi ke tipe data Integer")
        }
    }

