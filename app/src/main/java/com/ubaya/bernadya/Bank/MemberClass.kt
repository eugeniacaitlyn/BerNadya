package com.ubaya.bernadya.Bank

import android.os.Parcel
import android.os.Parcelable

data class MemberClass(val namaMember: String,
                       val gambar: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaMember)
        parcel.writeString(gambar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MemberClass> {
        override fun createFromParcel(parcel: Parcel): MemberClass {
            return MemberClass(parcel)
        }

        override fun newArray(size: Int): Array<MemberClass?> {
            return arrayOfNulls(size)
        }
    }
}
