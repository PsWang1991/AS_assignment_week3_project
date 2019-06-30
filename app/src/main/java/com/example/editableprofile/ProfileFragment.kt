package com.example.editableprofile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.editableprofile.database.ProfileDatabase
import com.example.editableprofile.databinding.FragmentProfileBinding

import kotlin.requireNotNull as requireNotNull1

class ProfileFragment: Fragment() {

//    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Get a reference to the binding object and inflate the fragment views.
        val binding: FragmentProfileBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_profile, container, false)


        val application = requireNotNull1(this.activity).application

        // Create an instance of the ViewModel Factory.
        val dataSource = ProfileDatabase.getInstance(application).profileDatabaseDao
        val viewModelFactory = ProfileViewModelFactory(dataSource, application)

//         Get a reference to the ViewModel associated with this fragment.
        val profileViewModel = ViewModelProviders.of(
                this, viewModelFactory).get(ProfileViewModel::class.java)
//        binding.profileViewModel = profileViewModel
        binding.setLifecycleOwner(this)

        return binding.root
    }
}