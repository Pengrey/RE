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

Unfortunately the function `m18579b` (`b()` below) couldn't be reversed.

```java
public final androidx.lifecycle.a b(androidx.savedstate.c activity, Bundle intent) {  
        Intrinsics.isThisObjectNull(activity, "owner");  
        return new a(activity, intent, this);  
    }
    
public static final class a extends androidx.lifecycle.a {  

    final /* synthetic */ d f14321d;  
   
    a(androidx.savedstate.c cVar, Bundle bundle, d dVar) {  
        super(cVar, bundle);  
        this.f14321d = dVar;  
    }  
  
    @Override // androidx.lifecycle.a  
    protected <T extends o0> T d(String str, Class<T> cls, l0 l0Var) {  
        Intrinsics.isThisObjectNull(str, "key");  
        Intrinsics.isThisObjectNull(cls, "modelClass");  
        Intrinsics.isThisObjectNull(l0Var, "handle");  
        b bVar = (b) this.f14321d.f14320a.get(cls);  
        T t10 = bVar != null ? (T) bVar.a(l0Var) : null;  
        if (t10 != null) {  
            return t10;  
        }  
        throw new IllegalStateException("Unknown ViewModel class");  
	}  
}
    
``` 
