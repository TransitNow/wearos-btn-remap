# How to setup strength training apk

### Note
- Only tested on TicWatch Pro 5
- You will need to disable auto-update on your watch

### Instructions
- You will need to make sure `adb` is installed on your computer (on your PATH) and that you have enabled developer mode on your watch (https://developer.android.com/studio/command-line/adb)
- Uninstall the existing Google Fit app on your watch if already present
    - `adb uninstall "com.google.android.apps.fitness"`
- Download and install the following apks:
    - `adb install "...\wear os apks\strength training google fit\com.google.android.apps.fitness_2.54.27-230-2025427230_minAPI25(armeabi-v7a)(nodpi)_apkmirror.com.apk"`
    - `adb install "...\wear os apks\strength training google fit\FitST_wear.apk"` download from https://freepoc.org/downloads/





