# Introduction
The purpose of this report is to present the findings of a project that involved the reverse engineering of two mobile applications: the CTT app and the Pingodoce app. The project was conducted with the aim of analyzing the functionality, security, and overall design of these two popular applications.

The reverse engineering process involved both static and dynamic analysis techniques. Static analysis was used to examine the application's source code, binaries, and resources, while dynamic analysis involved the use of various tools to observe the behavior of the applications in real-time.

Through this analysis, we aimed to identify any potential security vulnerabilities, performance issues, or design flaws in the applications. Additionally, we sought to gain a better understanding of the functionality of each application and how they interact with the users.

The CTT app and the Pingodoce app were chosen due to their widespread use and popularity in Portugal. By conducting this reverse engineering project, we hope to contribute to the improvement of these applications and to enhance the overall user experience for their users.

In the following sections, we will provide a detailed analysis of each application, including the tools and techniques used for analysis, the vulnerabilities and flaws identified, and recommendations for improvement.

# CTT
## Static Analysis
### Manifest
#### Activities
The first step in our static analysis of the CTT app involved examining its manifest file. The manifest provides important information about the application, such as its package name, version number, and the permissions it requires to run.
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

During our analysis, we identified a launcher activity defined in the manifest file. The launcher activity in the CTT app is `ctt.mobile.android.app.ctt.MainActivity`. This activity is declared in the Android manifest file and has an intent filter with the `android.intent.action.MAIN` action and `android.intent.category.LAUNCHER` category, which makes it the entry point for the application. The `android:exported` attribute is set to `true`, which means that it can be launched by other applications or components.
```xml
<activity
    android:name="ctt.mobile.android.app.ctt.MainActivity"
    android:label="@string/activity_name"
    android:theme="@style/Theme.OutSystems"
    android:launchMode="singleTop"
    android:screenOrientation="portrait"
    android:configChanges="smallestScreenSize|screenSize|uiMode|screenLayout|orientation|keyboardHidden|keyboard|locale"
    android:windowSoftInputMode="adjustResize"
    android:exported="true">

    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>

    <intent-filter>
        <action android:name="android.intent.action.VIEW" />
        <category android:name="android.intent.category.DEFAULT" />
        <category android:name="android.intent.category.BROWSABLE" />
        <data android:scheme="ctt.mobile.android.app.ctt" />
    </intent-filter>

</activity>
```

The `MainActivity` class extends `CordovaActivity`, which is a class provided by the Apache Cordova framework that enables developers to build mobile applications using HTML, CSS, and JavaScript. The `MainActivity` class overrides the `onCreate` method, which is called when the activity is created. 
```java
public class MainActivity extends CordovaActivity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        loadUrl(this.launchUrl);
    }
}
```

The `launchUrl` variable is defined and has its value set in `CordovaActivity`, and is imported from config preferences:
```java
this.launchUrl = configXmlParser.getLaunchUrl();
```

The `loadUrl` method in the launcher activity starts a Cordova application based on JS/HTML, which is outside the scope of this project's analysis. However, it was possible to identify the application's URL as `https://appserver.ctt.pt/CTT_SuperApp/CTT_Begin`, which can be accessed through any modern browser.
![[Pasted image 20230302151217.png]]

#### Broadcast Receivers
Furthermore, we identified several Broadcast Receivers being used by the CTT app, including the CurrentAccessTokenExpirationBroadcastReceiver. 
```xml
<receiver android:name="com.facebook.CurrentAccessTokenExpirationBroadcastReceiver" android:exported="false">  
            <intent-filter>  
                <action android:name="com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"/>  
            </intent-filter>  
        </receiver>
```

We found that this receiver was not exported, meaning it cannot be accessed by other applications or components.

Additionally, we found that the CampaignTrackingReceiver used by the CTT app was exported. While this receiver is a Facebook utility and not directly related to the CTT app's functionality, it can still be used as an entry point for analyzing the application.

The code defined in `com.facebook.CampaignTrackingReceiver` receives the `"com.android.vending.INSTALL_REFERRER"` intent.

```java
public final class CampaignTrackingReceiver extends BroadcastReceiver {  
    static final String INSTALL_REFERRER = "referrer";  
  
    @Override // android.content.BroadcastReceiver  
    public void onReceive(Context context, Intent intent) {  
        String stringExtra = intent.getStringExtra("referrer");  
        if (stringExtra == null || !stringExtra.startsWith("fb")) {  
            return;  
        }  
        AppEventsLogger.setInstallReferrer(intent.getStringExtra("referrer"));  
    }
```

This intent should have a `referrer` field, which must be a string starting with `fb`.
Then, the `InstallReferrer` will be set to what's in the `referrer` value.

This `InstallReferrer` is later accessed by this method `getInstallReferrer`, defined in `com.facebook.appevents.AppEventsLoggerImpl`:

```java
/* JADX INFO: Access modifiers changed from: package-private */  
public static String getInstallReferrer() {  
    return FacebookSdk.getApplicationContext()
			.getSharedPreferences("com.facebook.sdk.appEventPreferences",
			 0).getString("install_referrer", null);  
    }
```

This is called only by the method `buildRequestForSession`, defined in `com.facebook.appevents.AppEventQueue` , which builds a Post request, later sent to the server in `sendEventsToServer` (in the same package).

This seems to be log/analytics for Facebook, and 'installReferrer' is one of the parameters sent to the server as part of the post request.

Despite this value being seemingly easy to alter, by broadcasting an intent and following the restrictions mentioned above, the only effect this has is changing a bit of the logging information sent to the servers, and nothing else.

## Dynamic Analysis
During the dynamic analysis of the CTT app, we encountered some challenges due to SSL pinning implemented by the app. This prevented us from intercepting traffic using the certificate we installed on the testing emulator.
![[Pasted image 20230302184911.png]]

To overcome this issue, we turned to Frida, an open-source dynamic instrumentation toolkit, which allows us to bypass SSL Pinning.

After installing and setting up Frida, we used an SSL unpinning script to intercept the app's traffic using BurpSuite.
```powershell
PS > adb push .\frida_multiple_unpinning.js /data/local/tmp
PS > adb shell pm list packages | findstr ctt
package:pt.ctt.outsystems.CTT
PS > frida -U -l frida_multiple_unpinning.js -f pt.ctt.outsystems.CTT
     ____
    / _  |   Frida 16.0.10 - A world-class dynamic instrumentation toolkit
   | (_| |
    > _  |   Commands:
   /_/ |_|       help      -> Displays the help system
   . . . .       object?   -> Display information about 'object'
   . . . .       exit/quit -> Exit
   . . . .
   . . . .   More info at https://frida.re/docs/home/
   . . . .
   . . . .   Connected to Android Emulator 5554 (id=emulator-5554)
Spawned `pt.ctt.outsystems.CTT`. Resuming main thread!
[Android Emulator 5554::pt.ctt.outsystems.CTT ]->
======
[#] Android Bypass for various Certificate Pinning methods [#]
======
[-] OkHTTPv3 {2} pinner not found
[-] Trustkit {1} pinner not found
[-] Trustkit {2} pinner not found
[-] Trustkit {3} pinner not found
[-] Appcelerator PinningTrustManager pinner not found
[-] Fabric PinningTrustManager pinner not found
[-] OpenSSLSocketImpl Conscrypt {1} pinner not found
[-] OpenSSLSocketImpl Conscrypt {2} pinner not found
[-] OpenSSLEngineSocketImpl Conscrypt pinner not found
[-] OpenSSLSocketImpl Apache Harmony pinner not found
[-] PhoneGap sslCertificateChecker pinner not found
[-] IBM MobileFirst pinTrustedCertificatePublicKey {1} pinner not found
[-] IBM MobileFirst pinTrustedCertificatePublicKey {2} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {1} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {2} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {3} pinner not found
[-] IBM WorkLight HostNameVerifierWithCertificatePinning {4} pinner not found
[-] Conscrypt CertPinManager (Legacy) pinner not found
[-] CWAC-Netsecurity CertPinManager pinner not found
[-] Worklight Androidgap WLCertificatePinningPlugin pinner not found
[-] Netty FingerprintTrustManagerFactory pinner not found
[-] Squareup CertificatePinner {1} pinner not found
[-] Squareup CertificatePinner {2} pinner not found
[-] Squareup OkHostnameVerifier check not found
[-] Squareup OkHostnameVerifier check not found
[-] Android WebViewClient {2} check not found
[-] Apache Cordova WebViewClient check not found
[-] Boye AbstractVerifier check not found
[-] Apache AbstractVerifier check not found
[-] Chromium Cronet pinner not found
[-] Flutter HttpCertificatePinning pinner not found
[-] Flutter SslPinningPlugin pinner not found
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing Android WebViewClient check {4}
[+] Bypassing Trustmanager (Android < 7) pinner
[+] Bypassing TrustManagerImpl (Android > 7) checkTrustedRecursive check: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
[+] Bypassing OkHTTPv3 {4}: appserver.ctt.pt
```

This enabled us to see and analyze network traffic, including requests and responses sent and received by the app. We could examine the HTTP headers, request and response bodies, and identify the APIs called by the app, among others.
![[Pasted image 20230314161630.png]]

Through this process, we discovered all the HTML and JavaScript requested by the app. This was made possible by the Cordova technology. We intercepted the app's network traffic and analyzed the requests and responses exchanged between the app and the server. This allowed us to identify the different endpoints used by the app and the data being sent and received by the app.