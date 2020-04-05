package me.alarai.tugasakb1
/*
* NIM : 10116006
* Nama: Ala Rai AbdiAllah
* Kelas: IF-6K
* Tanggal Pengerjaan : 4 April 2020
* Deskripsi Pekerjaan: Halaman login
* */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_code.*

class LoginCodeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_code)
        masuk_btn.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java).apply {}
            startActivity(intent)
        }
    }
}
