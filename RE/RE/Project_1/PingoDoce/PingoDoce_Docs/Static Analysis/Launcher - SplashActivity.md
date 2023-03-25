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

**Main activity:** `pt.pingodoce.app.presentation.landing.splash.SplashActivity`

As this activity has set an intent-filter for `LAUNCHER`, this is the activity that is ran when a user opens the application via its homescreen icon.
![[launcher_icon.png]]
### Flow
On launch, the following pop up is shown, due to it being ran inside an emulator:
![[Pasted image 20230325110319.png]]
This is explored in [[Root Check]].

By clicking 'ok', the user is then shown a promotional screen showcasing the app's functionalities: [[Intro Page]]. 
Searching for the text present in it in Jadx, it is possible to find the string that contains the text in the screen, and find out where it is used, therefore finding which activity is currently on screen.

This is present in `res/values/strings.xml`:
`<string name="lbl_walkthrough_step1">Os meus folhetos</string>`

This string is then used in `res/layout/fragment_walkthrough_step1.xml`, which is in turn inflated in the class `AppWalkThroughStep1Fragment` which extends `WalkThroughFragment`. By searching for its name a `AppWalkThroughActivity` can be found.

Finally, this activity is then traced back to `SplashActivity`,  present in the following (slightly obfuscated) code:
```java  
if (Intrinsics.equals(c13182l.m1459d(), Boolean.TRUE)) {  
    AppWalkThroughActivity.m22601a(SplashActivity.this);  
}
```

After some digging around the code and renaming, we get the following snippet:

``` java
if (Intrinsics.equals(c13801l.getPossibleFirstLaunchBool(), Boolean.TRUE)) {  
AppWalkThroughActivity.launchAppWalkThroughActivityIfNotNull(SplashActivity.this);
}
```

This verifies if a certain boolean has value True and launches the [[Intro Page]] (Walkthrough Activity).

After this walkthrough is either skipped or completed the user is greeted with a [[Welcome Page]].


### Interesting Content:

Its `onCreate`  function checks for the existence of an 'extra' `E-GOI-PUSH` field in the intent, and if it exists, attempts to launch a new activity `NotificationLandingActivity`  with that intent as an argument.

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

[[01.1 - Launcher_StartActivity_E-GOI_PUSH]]

