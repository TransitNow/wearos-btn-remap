package com.jsyntax.remapbutton

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.jsyntax.remapbutton.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("MyAccessibilityService", "MainActivity on create")

//        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
//        startActivity(intent)

        // Start AnotherActivity
        // Start AnotherActivity
        val i = Intent()
        i.setClassName(
            "com.google.android.apps.assistant",
            "com.google.android.apps.assistant.go.MainActivity"
        )
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(i)

        // Finish MainActivity

        // Finish MainActivity
        finish()
    }
}