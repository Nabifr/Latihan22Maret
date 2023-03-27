package com.android.tugasbundleserializableparcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.tugasbundleserializableparcelable.databinding.ActivityBundlePage2Binding



class BundlePage2 : AppCompatActivity() {
    private lateinit var binding : ActivityBundlePage2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundlePage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //mengambil data
        val getbundle = intent.extras
        val name = getbundle?.getString("nama")
        val birth = getbundle?.getInt("lahir")
        binding.tvNamaBun.text = "Halo, $name"
        binding.tvUmurBun.text = "Umur Kamu : $birth"
    }
}



