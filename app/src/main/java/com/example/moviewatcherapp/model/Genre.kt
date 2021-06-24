package com.example.moviewatcherapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class Genre : Parcelable {
    DRAMA, COMEDY, ACTION, ADVENTURE, HORROR, FANTASY, CRIME, ROMANCE, THRILLER, ANIMATION,
    WAR, DOCUMENTARY, MUSICAL, BIOGRAPHY, SCIFI, WESTERN, MELODRAMAS, DETECTIVE, UNKNOWN
}

