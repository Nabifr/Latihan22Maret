package com.android.tugasbundleserializableparcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.tugasbundleserializableparcelable.databinding.ActivitySerialPage2Binding

class SerialPage2 : AppCompatActivity() {
    //Aktivasi ViewBinding
    lateinit var binding: ActivitySerialPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //agar dapat mengakses view pada layout
        binding = ActivitySerialPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //mengambil data dari page1 serializable
        val getDataSerial = intent.getSerializableExtra("DATASERIAL") as AccountSer
        binding.tvNama.text = getDataSerial.nama
        binding.tvEmail.text = getDataSerial.email
        binding.tvNohp.text = getDataSerial.nohp
        binding.tvAlamat.text = getDataSerial.alamat
        binding.tvUmur.text = getDataSerial.umur

    }
}