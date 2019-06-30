package com.example.editableprofile

import android.app.Application
import android.widget.EditText
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.editableprofile.database.ProfileDatabaseDao
import com.example.editableprofile.database.TextProfile
import kotlinx.coroutines.*

class ProfileViewModel(
    val database: ProfileDatabaseDao,
    application: Application) : AndroidViewModel(application) {

//    private var viewModelJob = Job()
//    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var profile = MutableLiveData<TextProfile?>()

    // initialize profile
    init {
//        profile.value = database.getProfile()
//        if (profile.value == null) {
//            val newProfile = TextProfile()
//            database.insert(newProfile)
//            profile.value = database.getProfileNotNull()
//        }
    }

//    // co-routine
//    private fun initializeProfile() {
//        uiScope.launch {
//            profile.value = getProfileFromDatabase()
//            if (profile.value == null) {
//                val newProfile = TextProfile()
//                database.insert(newProfile)
//                profile.value = getProfileFromDatabase()
//            }
//        }
//    }
//    private suspend fun getProfileFromDatabase(): TextProfile? {
//        return withContext(Dispatchers.IO) {
//            var textProfile = database.get()
//            textProfile
//        }
//    }

    fun onSave() {

        val newProfile = profile.value
//      newProfile.profileName = nameString.toString()
//      newProfile.profileNickname = nicknameString.toString()
//      newProfile.profileHowAboutMe = howAboutMeString.toString()
        database.update(newProfile!!)
    }


//    override fun onCleared() {
//        super.onCleared()
//        viewModelJob.cancel()
//    }
}