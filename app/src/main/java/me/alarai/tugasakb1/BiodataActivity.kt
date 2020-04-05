package me.alarai.tugasakb1
/*
* NIM : 10116006
* Nama: Ala Rai AbdiAllah
* Kelas: IF-6K
* Tanggal Pengerjaan : 4 April 2020
* Deskripsi Pekerjaan: Halaman input biodata
* */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_biodata.*

class BiodataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        submit_button.setOnClickListener {

            if(!nama.text.isEmpty() && !umur.text.isEmpty()){
                val intent = Intent(this, GreetActivity::class.java)
                intent.putExtra("nama", nama.text.toString())
                startActivity(intent)
            } else if(nama.text.isEmpty()) {
                val snack = Snackbar.make(it,"Nama tidak boleh kosong.",Snackbar.LENGTH_LONG)
                snack.show()
            } else if(umur.text.isEmpty()) {
                val snack = Snackbar.make(it,"Usia tidak boleh kosong.",Snackbar.LENGTH_LONG)
                snack.show()
            }
        }
    }
}
