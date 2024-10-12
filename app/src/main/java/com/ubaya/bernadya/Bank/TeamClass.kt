package com.ubaya.bernadya.Bank

import android.os.Parcel
import android.os.Parcelable

data class TeamClass(val namaTeam: String,
                     val namaMember: List<MemberClass>): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.createTypedArrayList(MemberClass.CREATOR) ?: listOf()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(namaTeam)
        parcel.writeTypedList(namaMember)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TeamClass> {
        override fun createFromParcel(parcel: Parcel): TeamClass {
            return TeamClass(parcel)
        }

        override fun newArray(size: Int): Array<TeamClass?> {
            return arrayOfNulls(size)
        }
    }
}
