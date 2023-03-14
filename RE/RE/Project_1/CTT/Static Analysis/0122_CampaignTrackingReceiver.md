
Manifest snippet:
```xml
<receiver android:name="com.facebook.CampaignTrackingReceiver" android:permission="android.permission.INSTALL_PACKAGES" android:exported="true">  
            <intent-filter>  
                <action android:name="com.android.vending.INSTALL_REFERRER"/>  
            </intent-filter>  
        </receiver>
```

As this receiver *is* exported, it can constitute a useful entrypoint into the aplication's analysis, despite being a facebook utility.

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
Then, the `InstallReferrer` will be set to what's on the `referrer`  value.

This `InstallReferrer` is later accessed by this method `getInstallReferrer`, defined in `com.facebook.appevents.AppEventsLoggerImpl`:

```java
/* JADX INFO: Access modifiers changed from: package-private */  
public static String getInstallReferrer() {  
    return FacebookSdk.getApplicationContext()
			.getSharedPreferences("com.facebook.sdk.appEventPreferences",
			 0).getString("install_referrer", null);  
    }
```

which is itself called only by the method `buildRequestForSession`, defined in `com.facebook.appevents.AppEventQueue` , which builds a Post request, later sent to the server in `sendEventsToServer` (in the same package).

This seems to be log/analytics for facebook, and the `installReferrer` is one of the parameters sent to the server as part of the post request. 

Despite this value being seemingly easy to alter, by broadcasting an intent and following the restrictions mentioned above, the only effect this has is in changing a bit of the logging information sent to the servers, and nothing else.
