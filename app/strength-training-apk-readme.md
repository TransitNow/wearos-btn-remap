# Setup strength training apk
adb shell dumpsys package com.google.android.apps.fitness | findstr versionName

adb uninstall "com.google.android.apps.fitness"
adb install "...\wear os apks\strength training google fit\com.google.android.apps.fitness_2.54.27-230-2025427230_minAPI25(armeabi-v7a)(nodpi)_apkmirror.com.apk"
adb install "...\wear os apks\strength training google fit\FitST_wear.apk"
