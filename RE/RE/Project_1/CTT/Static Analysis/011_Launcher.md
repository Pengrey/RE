Manifest snippet:
```xml
 <activity android:theme="@style/Theme.OutSystems" 
 android:label="@string/activity_name" 
 android:name="ctt.mobile.android.app.ctt.MainActivity"
  android:exported="true" 
  android:launchMode="singleTop" 
  android:screenOrientation="portrait"
  android:configChanges="smallestScreenSize|screenSize|
  uiMode|screenLayout|orientation|keyboardHidden|keyboard|locale"
  android:windowSoftInputMode="adjustResize">  
       <intent-filter android:label="@string/launcher_name">  
            <action android:name="android.intent.action.MAIN"/>  
            <category android:name="android.intent.category.LAUNCHER"/>  
        </intent-filter>  
        <intent-filter>  
            <action android:name="android.intent.action.VIEW"/>  
            <category android:name="android.intent.category.DEFAULT"/>  
            <category android:name="android.intent.category.BROWSABLE"/>  
            <data android:scheme="ctt.mobile.android.app.ctt"/>  
        </intent-filter>  
</activity>
```

Main activity: `ctt.mobile.android.app.ctt.MainActivity`
This activity extends `CordovaActivity` and just overrides the `onCreate` method, in order to execute this bit of code:
```java
loadUrl(this.launchUrl);
``` 

`launchUrl` is defined and has its value set in `CordovaActivity`, and is imported from config preferences:
```java
this.launchUrl = configXmlParser.getLaunchUrl();
```

This essentially launches a JS/HTML Cordova application, whose analysis is beyond the scope of this project.
