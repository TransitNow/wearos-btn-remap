package com.jsyntax.remapbutton

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS
import android.util.Log
import com.jsyntax.remapbutton.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("MyAccessibilityService", "MainActivity on create")

        val intent = Intent(ACTION_ACCESSIBILITY_SETTINGS)
        startActivity(intent)
    }
}