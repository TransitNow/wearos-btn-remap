package com.jsyntax.remapbutton

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class RecentAppActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recent_app)

        val i = Intent()
//        i.setClassName("com.google.android.apps.assistant", "com.google.android.apps.assistant.go.MainActivity")
        i.setClassName("com.google.android.clockwork.flashlight", "com.google.android.clockwork.flashlight.FlashlightActivity")
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(i)
        finish()
    }
}