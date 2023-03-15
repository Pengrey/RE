Previously: [[011_Launcher]]

Starting code:
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

This code starts a new activity. Due to the structure of the intent's constructor, this seems to be the  types used:
![[Pasted image 20230315180117.png]]
(Source: Google's [Developer Docs](https://developer.android.com/reference/android/content/Intent))

Here, the Context is 'activityC0325c' and the Class signature is `pt.pingodoce.app.services.NotificationLandingActivity.class`

