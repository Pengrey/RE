## Possible Entrypoints

### Launcher Activity

```xml
<activity android:theme="@style/App.Splash"
android:name="pt.pingodoce.app.presentation.landing.splash.SplashActivity" 
android:exported="true" 
android:screenOrientation="portrait">  
<intent-filter>  
    <action android:name="android.intent.action.MAIN"/>  
        <category android:name="android.intent.category.LAUNCHER"/>  
    </intent-filter>  
</activity>        
```
[[Launcher - SplashActivity]]

## Broadcast Receivers (Exported)

```xml
<activity android:name="pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentActivity" 
android:exported="true" 
android:launchMode="singleTask" 
android:screenOrientation="portrait">  
    <intent-filter android:label="@string/app_name_label">  
        <action android:name="android.intent.action.VIEW"/>  
        <category android:name="android.intent.category.DEFAULT"/>  
        <category android:name="android.intent.category.BROWSABLE"/>  
        <data android:scheme="@string/deeplink_scheme_onboarding" android:host="@string/deeplink_host_onboarding" android:pathPrefix="@string/deeplink_prefix_onboarding"/>  
    </intent-filter>  
</activity>
```

[[02 - Exported OnboardingEmailSentActivity]]

```xml
<activity android:name="pt.pingodoce.app.presentation.login.pin.change.RecoverPinActivity" android:exported="true" 
android:launchMode="singleTask" 
android:screenOrientation="portrait">  
    <intent-filter android:label="@string/app_name_label">  
        <action android:name="android.intent.action.VIEW"/>  
        <category android:name="android.intent.category.DEFAULT"/>  
        <category android:name="android.intent.category.BROWSABLE"/>  
        <data android:scheme="@string/deeplink_scheme_pin" android:host="@string/deeplink_host" android:pathPrefix="@string/deeplink_prefix_pin"/>  
    </intent-filter>  
</activity>
```

[[03 - Exported RecoverPinActivity]]