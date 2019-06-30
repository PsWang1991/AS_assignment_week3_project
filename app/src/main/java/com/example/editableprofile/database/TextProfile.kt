package com.example.editableprofile.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile_table")
data class TextProfile(
    @PrimaryKey(autoGenerate = true)
    var profileId: Long = 0L,

    @ColumnInfo(name = "profile_name")
    var profileName: String = "",

    @ColumnInfo(name = "profile_Nickname")
    var profileNickname: String = "",

    @ColumnInfo(name = "profile_how_about_me")
    var profileHowAboutMe: String = ""

)