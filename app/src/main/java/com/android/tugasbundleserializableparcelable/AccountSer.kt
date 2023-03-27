package com.android.tugasbundleserializableparcelable

import java.io.Serializable

data class AccountSer(
    val nama : String,
    val email : String,
    val nohp : String,
    val alamat : String,
    val umur : String) : Serializable
