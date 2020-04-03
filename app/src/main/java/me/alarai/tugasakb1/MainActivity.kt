package me.alarai.tugasakb1
/*
* NIM : 10116006
* Nama: Ala Rai AbdiAllah
* Kelas: IF-6K
* Tanggal Pengerjaan : 2 April 2020
* Deskripsi Pekerjaan: Halaman Pertama
* Tanggal Pengerjaan : 4 April 2020
* Deskripsi Pekerjaan: Custom Button
* */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mulai_button.setOnClickListener {
            val intent = Intent(this, LoginCodeActivity::class.java).apply {}
            startActivity(intent)
        }
    }

}
