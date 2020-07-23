package com.juliarman.appgithubuser

/*************************************
Name       : Juliarman Umar
Email      : juliarmanbone@gmail.com
No Whatsapp: +6285254402647
 **************************************/

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class GithubUser(

    val userName: String= "",
    var nameGithubUser: String ="",
    var location: String = "",
    val company: String = "",
    val avatarUser: Int?,
    val repository: String ="",
    val follower: String ="",
    val following: String = ""

) : Parcelable

