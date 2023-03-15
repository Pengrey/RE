### Manifest Snippet:

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

Main activity: `pt.pingodoce.app.presentation.landing.splash.SplashActivity`

### Interesting Content:

Its `onCreate`  function checks for the existence of an 'extra' `E-GOI-PUSH`, and if it exists, attempts to launch a new activity `NotificationLandingActivity`  with that intent as an argument.

Decompiled and cleaned up code:
```java
@Override 
public void onCreate(Bundle bundle) {  
    super.onCreate(bundle);  
    if (getIntent().hasExtra("E-GOI_PUSH")) {  
        Intent intent = getIntent();  
        Intrinsics.checkIfNull(intent, "intent");  
		NotificationLandingActivity.
			startActivityWithIntentIfNotNull(this, intent);  
        return;  
}  
```

[[0111_Launcher_StartActivity_E-GOI_PUSH]]


Previously: [[01_Manifest Analysis]]