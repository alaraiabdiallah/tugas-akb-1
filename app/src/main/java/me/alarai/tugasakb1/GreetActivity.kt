package me.alarai.tugasakb1
/*
* NIM : 10116006
* Nama: Ala Rai AbdiAllah
* Kelas: IF-6K
* Tanggal Pengerjaan : 4 April 2020
* Deskripsi Pekerjaan: Halaman Say Hi!
* Tanggal Pengerjaan : 5 April 2020
* Deskripsi Pekerjaan: Nama dari activity sebelumnya
* */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greet.*

class GreetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)
        val nama = intent.getStringExtra("nama")
        greeting.text = "Beres! Sekarang "+nama+" sudah bisa ngecek penggunaan HP "+nama+" tiap hari buat bantu "+nama+" ngatur waktu :)"
    }
}
