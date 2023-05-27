# COMMON ADB COMMANDS
Display Current DPI (default is around 340?)
adb shell wm density
Change DPI (try 225)
adb shell wm density xxx
adb shell wm density reset
adb shell am broadcast -a android.intent.action.CLOSE_SYSTEM_DIALOGS
adb connect 10.0.0...
adb uninstall com.jsyntax.remapbutton
adb -s 192.168.68.73:41217 shell am start -a android.settings.ACCESSIBILITY_SETTINGS
adb shell pm list packages
adb uninstall com....
adb uninstall com.facebook.mlite
adb shell input text '@gmail.com'


adb shell dumpsys package <package_name> | findstr  versionName
adb shell dumpsys package com.google.android.apps.searchlite | findstr versionName
adb shell dumpsys package package:de.stocard.stocard | findstr versionName
adb shell dumpsys package com.google.android.apps.assistant | findstr versionName

# APK version
GAG2.8 is at .armeabi-v7a.release
arm-v7a / armeabi-v7a works, not arm64-v8a

## Common ADB Commands

Here are some commonly used ADB commands that may be useful during development and debugging:

- Display current DPI (default is around 340): adb shell wm density
- Change DPI (try 225): adb shell wm density xxx
- Reset DPI to default: adb shell wm density reset
- Display version of a specific package: adb shell dumpsys package <package_name> | findstr versionName
- List all packages: adb shell pm list packages
- Uninstall a specific package: adb uninstall com....

Please note that arm-v7a / armeabi-v7a works, not arm64-v8a.

For further information, refer to the official Android documentation.

# Intents
START u0 {act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000100 cmp=com.mobvoi.wear.refsysui/com.google.android.clockwork.sysui.mainui.activity.SysUiActivity (has extras)} from uid 0
START u0 {act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000100 cmp=com.mobvoi.wear.refsysui/com.google.android.clockwork.sysui.mainui.activity.SysUiActivity (has extras)} from uid 0
START u0 {act=android.intent.action.ALL_APPS cmp=com.mobvoi.wear.refsysui/com.google.android.clockwork.sysui.experiences.globallauncher.GlobalLauncherActivity} RECENY
START u0 {act=android.intent.action.VOICE_ASSIST cmp=com.jsyntax.remapbutton/.VoiceActivity} from uid 1000
