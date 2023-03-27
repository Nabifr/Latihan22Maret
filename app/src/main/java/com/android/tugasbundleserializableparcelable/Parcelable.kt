package com.android.tugasbundleserializableparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.tugasbundleserializableparcelable.databinding.ActivityParcelableBinding

class Parcelable : AppCompatActivity() {
    lateinit var binding : ActivityParcelableBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //if button save clicked
        binding.btnSavePar.setOnClickListener{
        //move activity to parcelable page2
        val move = Intent(this, AccountPar::class.java)
        //mengambil data dari input user
        val innama = binding.etNamaPar.text.toString()
        val inemail = binding.etEmailPar.text.toString()
        val innohp = binding.etNohpPar.text.toString()
        val inalamat = binding.etAlamatPar.text.toString()
        val inumur = binding.etUmurPar.text.toString()

        //put data with parcelable method
        val accountPar = AccountPar(
            innama,
            inemail,
            innohp,
            inalamat,
            inumur,
        )
            move.putExtra("dataakun", accountPar)
            startActivity(move)
        }

    }
}