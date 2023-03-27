package com.android.tugasbundleserializableparcelable

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.android.tugasbundleserializableparcelable.databinding.ActivityParcelPage2Binding

class ParcelPage2 : AppCompatActivity() {
    lateinit var binding : ActivityParcelPage2Binding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        //get data dari page 1
        val getakun = intent.getParcelableExtra("dataakun") as AccountPar?
        binding.tvNama.text = getakun!!.nama
        binding.tvEmail.text = getakun.email
        binding.tvNohp.text = getakun.nohp
        binding.tvAlamat.text = getakun.alamat
        binding.tvUmur.text = getakun.umur

    }
}