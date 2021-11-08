package com.reivik.emptyactivityproject.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reivik.emptyactivityproject.R
import com.reivik.emptyactivityproject.ui.fragments.FragmentContactList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        if (savedInstanceState == null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction
                .add(R.id.fragmentСontainer, FragmentContactList())
                .commit()
        }
    }
}