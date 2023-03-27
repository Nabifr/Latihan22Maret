package com.android.tugasbundleserializableparcelable

import android.os.Parcelable
import android.os.Parcel


data class AccountPar(
    val nama : String?,
    val email : String?,
    val nohp : String?,
    val alamat : String?,
    val umur : String?,
    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(email)
        parcel.writeString(nohp)
        parcel.writeString(alamat)
        parcel.writeString(umur)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : android.os.Parcelable.Creator<AccountPar> {
        override fun createFromParcel(parcel: Parcel): AccountPar {
            return AccountPar(parcel)
        }

        override fun newArray(size: Int): Array<AccountPar?> {
            return arrayOfNulls(size)
        }
    }
}
