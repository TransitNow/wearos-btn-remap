# Common ADB (Android Debug Bridge) Commands

ADB (Android Debug Bridge) is a versatile command-line tool that lets you communicate with a device. Here are some common commands which you can use.

## DPI Related Commands

1. **Display Current DPI**: This command will show the current DPI. The default DPI is usually around 340.  
   Command: `adb shell wm density`  
   Example: `adb shell wm density`

2. **Change DPI**: You can change the DPI using this command. For example, you can try 225.  
   Command: `adb shell wm density xxx`  
   Example: `adb shell wm density 225`

3. **Reset DPI to Default**: This command will reset the DPI back to its default value.  
   Command: `adb shell wm density reset`  
   Example: `adb shell wm density reset`

## System Related Commands

4. **Close System Dialogs**: This command will close system dialogs.  
   Command: `adb shell am broadcast -a android.intent.action.CLOSE_SYSTEM_DIALOGS`  
   Example: `adb shell am broadcast -a android.intent.action.CLOSE_SYSTEM_DIALOGS`

5. **Connect to a Device**: Connect to a device with IP 10.0.0.X  
   Command: `adb connect 10.0.0...`  
   Example: `adb connect 10.0.0.2`

## Package Related Commands

6. **List All Packages**: This command will list all the installed packages.  
   Command: `adb shell pm list packages`  
   Example: `adb shell pm list packages`

7. **Uninstall app**: You can uninstall any installed package using its package name.  
   Command: `adb uninstall com....`  
   Example: `adb uninstall com.facebook.mlite`

8. **Display Version of a Specific Package**: This command will display the version of a specific package.  
   Command: `adb shell dumpsys package <package_name> | findstr versionName`  
   Example: `adb shell dumpsys package com.google.android.apps.searchlite | findstr versionName`

9. **Install a Specific APK**: You can install a specific APK using its file path.  
   Command: `adb install "<file_path>"`  
   Example: `adb install "..\\wear os apks\\com.facebook.mlite_338.0.0.3.102-436638495_minAPI14(armeabi-v7a)(120,160dpi)_apkmirror.com.apk"`

