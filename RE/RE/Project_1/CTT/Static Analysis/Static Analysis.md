# Retrieve the application from the PlayStore
## Download the app to the Android VM
![[Pasted image 20230225162317.png]]
## Extract APK from VM
### List packages installed on the vm
```powershell
PS C:\Users\rodri\AndroidStudioProjects\MyApplication> adb shell
generic_x86:/ $ whoami
shell
generic_x86:/ $ pm list packages
package:com.android.cts.priv.ctsshim
<SNIP>
generic_x86:/ $
```

### List path of the application
```powershell
generic_x86:/ $ pm path pt.ctt.outsystems.CTT
package:/data/app/pt.ctt.outsystems.CTT-xOOOJRl2T-fKdEyEqo9pVw==/base.apk
package:/data/app/pt.ctt.outsystems.CTT-xOOOJRl2T-fKdEyEqo9pVw==/split_config.en.apk
package:/data/app/pt.ctt.outsystems.CTT-xOOOJRl2T-fKdEyEqo9pVw==/split_config.pt.apk
package:/data/app/pt.ctt.outsystems.CTT-xOOOJRl2T-fKdEyEqo9pVw==/split_config.x86.apk
package:/data/app/pt.ctt.outsystems.CTT-xOOOJRl2T-fKdEyEqo9pVw==/split_config.xxhdpi.apk
generic_x86:/ $ ^
```

### Pull apk from VM
```powershell
PS C:\Users\rodri\Desktop> mkdir APKFolder
PS C:\Users\rodri\Desktop> cd .\APKFolder\
PS C:\Users\rodri\Desktop\APKFolder> adb pull /data/app/pt.ctt.outsystems.CTT-xOOOJRl2T-fKdEyEqo9pVw==/base.apk ctt_pulled.apk
/data/app/pt.ctt.outsystems.CTT-xOOOJRl2T-fKdEyEqo9pVw==/base.apk: 1 file pulled, 0 skipped. 133.2 MB/s (27980911 bytes in 0.200s)
PS C:\Users\rodri\Desktop\APKFolder>
```

# Manual Static Analysis
## Decompile the application with the help of JADX
### Select the extracted apk
![[Pasted image 20230225163524.png]]

### Summary
![[Pasted image 20230225163739.png]]

## Manifest Analysis
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android" android:versionCode="95" android:versionName="1.0.960" android:hardwareAccelerated="true" android:compileSdkVersion="33" android:compileSdkVersionCodename="13" package="pt.ctt.outsystems.CTT" platformBuildVersionCode="33" platformBuildVersionName="13">
    <uses-sdk android:minSdkVersion="26" android:targetSdkVersion="33"/>
    <supports-screens android:anyDensity="true" android:smallScreens="true" android:normalScreens="true" android:largeScreens="true" android:resizeable="true" android:xlargeScreens="true"/>
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.CAMERA"/>
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.READ_MEDIA_AUDIO"/>
    <uses-permission android:name="android.permission.READ_MEDIA_IMAGES"/>
    <uses-permission android:name="android.permission.READ_MEDIA_VIDEO"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
    <uses-feature android:name="android.hardware.location.gps"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <queries>
        <intent>
            <action android:name="android.media.action.IMAGE_CAPTURE"/>
        </intent>
        <intent>
            <action android:name="android.intent.action.GET_CONTENT"/>
        </intent>
        <intent>
            <action android:name="android.intent.action.PICK"/>
        </intent>
    </queries>
    <uses-permission android:name="com.amazon.device.messaging.permission.RECEIVE"/>
    <permission android:name="pt.ctt.outsystems.CTT.permission.RECEIVE_ADM_MESSAGE" android:protectionLevel="signature"/>
    <uses-permission android:name="pt.ctt.outsystems.CTT.permission.RECEIVE_ADM_MESSAGE"/>
    <uses-permission android:name="android.permission.RECORD_AUDIO"/>
    <uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS"/>
    <queries>
        <intent>
            <action android:name="android.media.action.IMAGE_CAPTURE"/>
        </intent>
        <intent>
            <action android:name="android.intent.action.GET_CONTENT"/>
        </intent>
    </queries>
    <permission android:name="pt.ctt.outsystems.CTT.permission.C2D_MESSAGE" android:protectionLevel="signature"/>
    <uses-permission android:name="pt.ctt.outsystems.CTT.permission.C2D_MESSAGE"/>
    <uses-permission android:name="com.google.android.c2dm.permission.RECEIVE"/>
    <uses-permission android:name="android.permission.WAKE_LOCK"/>
    <uses-permission android:name="android.permission.VIBRATE"/>
    <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"/>
    <uses-permission android:name="com.sec.android.provider.badge.permission.READ"/>
    <uses-permission android:name="com.sec.android.provider.badge.permission.WRITE"/>
    <uses-permission android:name="com.htc.launcher.permission.READ_SETTINGS"/>
    <uses-permission android:name="com.htc.launcher.permission.UPDATE_SHORTCUT"/>
    <uses-permission android:name="com.sonyericsson.home.permission.BROADCAST_BADGE"/>
    <uses-permission android:name="com.sonymobile.home.permission.PROVIDER_INSERT_BADGE"/>
    <uses-permission android:name="com.anddoes.launcher.permission.UPDATE_COUNT"/>
    <uses-permission android:name="com.majeur.launcher.permission.UPDATE_BADGE"/>
    <uses-permission android:name="com.huawei.android.launcher.permission.CHANGE_BADGE"/>
    <uses-permission android:name="com.huawei.android.launcher.permission.READ_SETTINGS"/>
    <uses-permission android:name="com.huawei.android.launcher.permission.WRITE_SETTINGS"/>
    <uses-permission android:name="android.permission.READ_APP_BADGE"/>
    <uses-permission android:name="com.oppo.launcher.permission.READ_SETTINGS"/>
    <uses-permission android:name="com.oppo.launcher.permission.WRITE_SETTINGS"/>
    <uses-permission android:name="me.everything.badger.permission.BADGE_COUNT_READ"/>
    <uses-permission android:name="me.everything.badger.permission.BADGE_COUNT_WRITE"/>
    <uses-feature android:name="android.hardware.camera" android:required="false"/>
    <uses-feature android:name="android.hardware.camera.front" android:required="false"/>
    <uses-feature android:name="android.hardware.camera.autofocus" android:required="false"/>
    <uses-feature android:name="android.hardware.camera.flash" android:required="false"/>
    <uses-feature android:name="android.hardware.screen.landscape" android:required="false"/>
    <uses-feature android:name="android.hardware.wifi" android:required="false"/>
    <application android:label="@string/app_name" android:icon="@mipmap/ic_launcher" android:hardwareAccelerated="true" android:supportsRtl="true" android:extractNativeLibs="false" android:networkSecurityConfig="@xml/network_security_config" android:appComponentFactory="androidx.core.app.CoreComponentFactory" android:isSplitRequired="true">
        <activity android:theme="@style/Theme.App.SplashScreen" android:label="@string/activity_name" android:name="pt.ctt.outsystems.CTT.MainActivity" android:exported="true" android:launchMode="singleTop" android:screenOrientation="portrait" android:configChanges="smallestScreenSize|screenSize|uiMode|screenLayout|orientation|keyboardHidden|keyboard|locale" android:windowSoftInputMode="adjustResize">
            <intent-filter android:label="@string/launcher_name">
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data android:scheme="pt.ctt.outsystems.ctt"/>
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.DEFAULT"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <data android:scheme="pt.ctt.outsystems.ctt" android:host="appserver.ctt.pt"/>
            </intent-filter>
        </activity>
        <activity android:theme="@style/zxing_CaptureTheme" android:name="com.outsystems.plugins.barcodescanner.CustomScannerActivity" android:exported="false" android:stateNotNeeded="true" android:screenOrientation="fullSensor" android:windowSoftInputMode="stateAlwaysHidden"/>
        <provider android:name="org.apache.cordova.camera.FileProvider" android:exported="false" android:authorities="pt.ctt.outsystems.CTT.camera.provider" android:grantUriPermissions="true">
            <meta-data android:name="android.support.FILE_PROVIDER_PATHS" android:resource="@xml/camera_provider_paths"/>
        </provider>
        <activity android:theme="@android:style/Theme.Black.NoTitleBar" android:name="com.outsystems.imageeditor.view.ImageEditorActivity"/>
        <enable-feature android:name="com.amazon.device.messaging" android:required="false"/>
        <service android:name="com.onesignal.ADMMessageHandler" android:exported="true"/>
        <receiver android:name="com.onesignal.ADMMessageHandler.Receiver" android:permission="com.amazon.device.messaging.permission.SEND" android:exported="true">
            <intent-filter>
                <action android:name="com.amazon.device.messaging.intent.REGISTRATION"/>
                <action android:name="com.amazon.device.messaging.intent.RECEIVE"/>
                <category android:name="pt.ctt.outsystems.CTT"/>
            </intent-filter>
        </receiver>
        <meta-data android:name="onesignal_app_id" android:value=""/>
        <meta-data android:name="onesignal_google_project_number" android:value="str:REMOTE"/>
        <receiver android:name="com.onesignal.GcmBroadcastReceiver" android:permission="com.google.android.c2dm.permission.SEND" android:exported="true">
            <intent-filter android:priority="999">
                <action android:name="com.google.android.c2dm.intent.RECEIVE"/>
                <category android:name="pt.ctt.outsystems.CTT"/>
            </intent-filter>
        </receiver>
        <receiver android:name="com.onesignal.NotificationOpenedReceiver" android:exported="true"/>
        <service android:name="com.onesignal.HmsMessageServiceOneSignal" android:exported="false">
            <intent-filter>
                <action android:name="com.huawei.push.action.MESSAGING_EVENT"/>
            </intent-filter>
        </service>
        <activity android:theme="@android:style/Theme.Translucent.NoTitleBar" android:name="com.onesignal.NotificationOpenedActivityHMS" android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
            </intent-filter>
        </activity>
        <service android:name="com.onesignal.GcmIntentService" exported="false"/>
        <service android:name="com.onesignal.GcmIntentJobService" android:permission="android.permission.BIND_JOB_SERVICE" exported="false"/>
        <service android:name="com.onesignal.RestoreJobService" android:permission="android.permission.BIND_JOB_SERVICE" android:exported="false"/>
        <service android:name="com.onesignal.RestoreKickoffJobService" android:permission="android.permission.BIND_JOB_SERVICE" android:exported="false"/>
        <service android:name="com.onesignal.SyncService" android:stopWithTask="true"/>
        <service android:name="com.onesignal.SyncJobService" android:permission="android.permission.BIND_JOB_SERVICE" android:exported="false"/>
        <activity android:theme="@android:style/Theme.Translucent.NoTitleBar" android:name="com.onesignal.PermissionsActivity" android:exported="false"/>
        <service android:name="com.onesignal.NotificationRestoreService" android:exported="false"/>
        <receiver android:name="com.onesignal.BootUpReceiver" android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.BOOT_COMPLETED"/>
                <action android:name="android.intent.action.QUICKBOOT_POWERON"/>
            </intent-filter>
        </receiver>
        <receiver android:name="com.onesignal.UpgradeReceiver" android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MY_PACKAGE_REPLACED"/>
            </intent-filter>
        </receiver>
        <service android:name="com.google.firebase.messaging.FirebaseMessagingService" android:exported="true">
            <intent-filter android:priority="-500">
                <action android:name="com.google.firebase.MESSAGING_EVENT"/>
            </intent-filter>
        </service>
        <service android:name="com.google.firebase.components.ComponentDiscoveryService" android:exported="false">
            <meta-data android:name="com.google.firebase.components:com.google.firebase.iid.Registrar" android:value="com.google.firebase.components.ComponentRegistrar"/>
        </service>
        <receiver android:name="com.google.firebase.iid.FirebaseInstanceIdReceiver" android:permission="com.google.android.c2dm.permission.SEND" android:exported="true">
            <intent-filter>
                <action android:name="com.google.android.c2dm.intent.RECEIVE"/>
            </intent-filter>
        </receiver>
        <service android:name="com.google.firebase.iid.FirebaseInstanceIdService" android:exported="true">
            <intent-filter android:priority="-500">
                <action android:name="com.google.firebase.INSTANCE_ID_EVENT"/>
            </intent-filter>
        </service>
        <activity android:theme="@android:style/Theme.Translucent.NoTitleBar" android:name="com.google.android.gms.common.api.GoogleApiActivity" android:exported="false"/>
        <provider android:name="com.google.firebase.provider.FirebaseInitProvider" android:exported="false" android:authorities="pt.ctt.outsystems.CTT.firebaseinitprovider" android:initOrder="100"/>
        <meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version"/>
        <provider android:name="androidx.startup.InitializationProvider" android:exported="false" android:authorities="pt.ctt.outsystems.CTT.androidx-startup">
            <meta-data android:name="androidx.emoji2.text.EmojiCompatInitializer" android:value="androidx.startup"/>
            <meta-data android:name="androidx.lifecycle.ProcessLifecycleInitializer" android:value="androidx.startup"/>
        </provider>
        <activity android:theme="@style/zxing_CaptureTheme" android:name="com.journeyapps.barcodescanner.CaptureActivity" android:clearTaskOnLaunch="true" android:stateNotNeeded="true" android:screenOrientation="sensorLandscape" android:windowSoftInputMode="stateAlwaysHidden"/>
        <meta-data android:name="com.android.vending.splits.required" android:value="true"/>
        <meta-data android:name="com.android.stamp.source" android:value="https://play.google.com/store"/>
        <meta-data android:name="com.android.stamp.type" android:value="STAMP_TYPE_DISTRIBUTION_APK"/>
        <meta-data android:name="com.android.vending.splits" android:resource="@xml/splits0"/>
        <meta-data android:name="com.android.vending.derived.apk.id" android:value="3"/>
    </application>
</manifest>
```

## Cordova url probbing
![[Pasted image 20230302151217.png]]


# Automated Static Analysis
![[transferir.pdf]]

