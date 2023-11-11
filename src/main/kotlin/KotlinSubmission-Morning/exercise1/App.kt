package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Dito"
    val namaBelakang = "Iqbal Kusuma"
    val umur = 21
    val isSingle = true

    println("Nama saya adalah ${namaDepan + namaBelakang}")
    println("Umur saya $umur")
    println("Apakah saya single ? $isSingle")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return println("groupId : $groupId\ngroupMember : $groupMember\nSession : $session ")
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val anggota = listOf(
        "Austin Nicholas Tham",
        "Muhammad Firdaus",
        "Dito Iqbal Kusuma",
        "Mutiara Sabrina Jauhari",
        "Rahmad Noor Ikhsan",
        "Fadhila Risfania",
        "Aina Fazla",
        "Adityo Khori Ramadhan",
        "Rizka Hilmi Putri",
        "Alfin Syatriawan",
        "Kayla Vyanca Atalaya"
    )

    return listOf(anggota.filter { it == "Dito Iqbal Kusuma" })
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Jovian", "Kak Imam")
    val countOfGroup = arrayOf<String>(
        "Austin Nicholas Tham",
        "Muhammad Firdaus",
        "Dito Iqbal Kusuma",
        "Mutiara Sabrina Jauhari",
        "Rahmad Noor Ikhsan",
        "Fadhila Risfania",
        "Aina Fazla",
        "Adityo Khori Ramadhan",
        "Rizka Hilmi Putri",
        "Alfin Syatriawan",
        "Kayla Vyanca Atalaya"
    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(
        "Eternal Light",
        listOf("Austin Nicholas Tham",
            "Muhammad Firdaus",
            "Dito Iqbal Kusuma",
            "Mutiara Sabrina Jauhari",
            "Rahmad Noor Ikhsan",
            "Fadhila Risfania",
            "Aina Fazla",
            "Adityo Khori Ramadhan",
            "Rizka Hilmi Putri",
            "Alfin Syatriawan",
            "Kayla Vyanca Atalaya"),
        "Morning")

}