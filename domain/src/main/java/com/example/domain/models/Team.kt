package com.example.domain.models

import android.os.Parcel
import android.os.Parcelable


open class Team( val id: Int,
         val name: String?,
         val stadium: String?,
         val badge: String?,
         val descripcion: String?,
         val formedYear: String?,
         val jersey: String?,
         val webSite: String?,
         val facebook: String?,
         val twitter: String?,
         val instagram: String?,
         val youtube: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(stadium)
        parcel.writeString(badge)
        parcel.writeString(descripcion)
        parcel.writeString(formedYear)
        parcel.writeString(jersey)
        parcel.writeString(webSite)
        parcel.writeString(facebook)
        parcel.writeString(twitter)
        parcel.writeString(instagram)
        parcel.writeString(youtube)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Team> {
        override fun createFromParcel(parcel: Parcel): Team {
            return Team(parcel)
        }

        override fun newArray(size: Int): Array<Team?> {
            return arrayOfNulls(size)
        }
    }


}