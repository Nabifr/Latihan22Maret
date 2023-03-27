package com.android.tugasbundleserializableparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.tugasbundleserializableparcelable.databinding.ActivityBundleBinding

class Bundle : AppCompatActivity() {
    private lateinit var binding : ActivityBundleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveBun.setOnClickListener{
        val name = binding.etNamaBun.text.toString()
        val birth = 2023 - binding.etTahunLahirBun.text.toString().toInt()
        val bundle = Bundle()
        val move = Intent(this, BundlePage2::class.java)
        bundle.putString("nama", name)
        bundle.putInt("lahir", birth)
        move.putExtras(bundle)
        startActivity(move)

        }
    }
}