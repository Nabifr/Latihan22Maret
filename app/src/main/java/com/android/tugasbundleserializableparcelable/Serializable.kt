package com.android.tugasbundleserializableparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.tugasbundleserializableparcelable.databinding.ActivityBundleBinding
import com.android.tugasbundleserializableparcelable.databinding.ActivitySerializableBinding

class Serializable : AppCompatActivity() {
    lateinit var binding : ActivitySerializableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerializableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //jika tombol save ditekan
        binding.btnSaveSer.setOnClickListener{
            //berpindah activity dari ke serialpage2
            val pindah = Intent(this, SerialPage2::class.java)
            //mengambil data dari input user
            val nama = binding.etNamaSer.text.toString()
            val email = binding.etEmailSer.text.toString()
            val nohp = binding.etNohpSer.text.toString()
            val alamat = binding.etAlamatSer.text.toString()
            val umur = binding.etUmurSer.text.toString()
            //membawa data serial dari data class
            val DataSerial = AccountSer(
                nama,
                email,
                nohp,
                alamat,
                umur,
            )
            pindah.putExtra("DATASERIAL", DataSerial)
            startActivity(pindah)

        }

    }
}