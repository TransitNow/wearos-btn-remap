package com.jsyntax.remapbutton;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class AccessibilityWalletOverrideLauncherService extends AccessibilityService {
    private static final int DEBOUNCE_TIME = 3000; // debounce time in milliseconds
    private boolean isDebounced = false;
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
//        Log.d("MyAccessibilityService", String.format(
//                "Package: %s%nClass: %s%nAction: %d%nEvent: %s%nContent Description: %s",
//                event.getPackageName(),
//                event.getClassName(),
//                event.getAction(),
//                event.toString(),
//                event.getContentDescription()
//        ));

        if (!event.getPackageName().equals("com.google.android.apps.walletnfcrel")) {
            return;
        }

        if (isDebounced) return;

        isDebounced = true;

        // Mimic the home button press to hide the app
        Intent startHomeScreen = new Intent(Intent.ACTION_MAIN);
        startHomeScreen.addCategory(Intent.CATEGORY_HOME);
        startHomeScreen.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startHomeScreen);

//        i.setClassName("com.google.android.apps.assistant", "com.google.android.apps.assistant.go.MainActivity");
//        i.setClassName("com.amazon.dee.alexaonwearos", "com.amazon.dee.alexaonwearos.MainActivity");
        Intent i = new Intent();
        i.setClassName("com.google.android.clockwork.flashlight", "com.google.android.clockwork.flashlight.FlashlightActivity");
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);


        handler.postDelayed(() -> isDebounced = false, DEBOUNCE_TIME);
    }

    @Override
    public void onInterrupt() {
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
    }
}
