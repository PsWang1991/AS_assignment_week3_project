package com.example.editableprofile.database

import androidx.lifecycle.MutableLiveData
import androidx.room.*

@Dao
interface ProfileDatabaseDao {
    @Insert
    fun insert(profile: TextProfile)

    @Update
    fun update(night: TextProfile)

    @Query("SELECT * from profile_table")
    fun getProfile(): TextProfile?

    @Query("SELECT * from profile_table")
    fun getProfileNotNull(): TextProfile
}