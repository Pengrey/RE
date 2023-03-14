Manifest Snippet:
```xml
<receiver android:name="com.facebook.CurrentAccessTokenExpirationBroadcastReceiver" android:exported="false">  
            <intent-filter>  
                <action android:name="com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED"/>  
            </intent-filter>  
        </receiver>
```

As this receiver is not exported, it is not meaningful (for now) to our reverse engineer efforts, as it doesn't provide a useful entrypoint.