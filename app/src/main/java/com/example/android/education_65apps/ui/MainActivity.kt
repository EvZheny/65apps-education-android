package com.example.android.education_65apps.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.education_65apps.R
import com.example.android.education_65apps.ui.contact.ContactDetailsFragment
import com.example.android.education_65apps.ui.contact.ContactListFragment

class MainActivity : AppCompatActivity() {

    private val container = R.id.container

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContactListFragment()
    }

    private fun setContactListFragment() {
//        val fragment = supportFragmentManager.findFragmentById(container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(container, ContactListFragment.newInstance())
        transaction.commit()
    }

    fun setContactDetailsFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(container, ContactDetailsFragment.newInstance())
        transaction.commit()
    }

}
