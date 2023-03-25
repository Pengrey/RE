### Manifest Snippet

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

In this activity, the only code related to intents is the following:
```java
@Override // id.Functions  
public final AbstractSavedStateViewModelFactory acceptRGPDTermsNConditionsDialog() {  
    ViewModelFactoryByInjection ifNotNull = RecoverPinActivity
											    .this.getIfNotNull();  
    RecoverPinActivity recoverPinActivity = RecoverPinActivity.this;  
    Intent intent = recoverPinActivity.getIntent();  
    return ifNotNull.m18579b(
    recoverPinActivity, 
	    intent != null ? intent.getExtras() : null);  
}
```
