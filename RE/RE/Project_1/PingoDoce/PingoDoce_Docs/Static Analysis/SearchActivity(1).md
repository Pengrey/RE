This activity contains methods that are used to create/structure intents seemingly for the various search functions in the app.

From [[Promotions]] page (`PromotionActivity`) the following decompiled methods are called:

```java
public static /* synthetic */ void callSearchAfterMatch(androidx.activity.result.b bVar, Activity activity, Boolean bool, Integer num, int i10, Object obj) {  
    if ((i10 & 2) != 0) {  
        bool = null;  
    }  
    if ((i10 & 4) != 0) {  
        num = null;  
    }  
    a(bVar, activity, bool, num);  
}

public static final void a(androidx.activity.result.b<Intent> bVar, Activity activity, Boolean bool, Integer num) {  
        Intrinsics.isThisObjectNull(bVar, "<this>");  
        Intrinsics.isThisObjectNull(activity, "context");  
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.common.search.SearchActivity.class);  
        if (bool != null) {  
            bool.booleanValue();  
            intent.putExtra("EXTRA_FOR_HAS_PROMO", bool.booleanValue());  
        }  
        if (num != null) {  
            num.intValue();  
            intent.putExtra("EXTRA_FOR_FLYER_ID", num.intValue());  
        }  
        bVar.a(intent);  
    }
    
```

and these can be cleaned up into:
```java
public static final void setExtrasOnIntent(androidx.activity.result.b<Intent> intentWrapper, Activity activity, Boolean bool, Integer num) {  
    Intrinsics.isThisObjectNull(intentWrapper, "<this>");  
    Intrinsics.isThisObjectNull(activity, "context");  
    Intent intent = new Intent(activity, SearchActivity.class);  
    if (bool != null) {  
        bool.booleanValue();  
        intent.putExtra("EXTRA_FOR_HAS_PROMO", bool.booleanValue());  
    }  
    if (num != null) {  
        num.intValue();  
        intent.putExtra("EXTRA_FOR_FLYER_ID", num.intValue());  
    }  
    intentWrapper.doSomethingWithIntent(intent);  
}


public static void setExtrasOnIntentWrapper(androidx.activity.result.b bVar, Activity activity, Boolean bool, Integer num, int sel, Object obj) {  
    if (sel==2) {  
        bool = null;  
    }  
    if (sel==4) {  
        num = null;  
    }  
    setExtrasOnIntent(bVar, activity, bool, num);  
}
```


So, this method will handle creation of an Intent, and depending on the value that is passed to `setExtrasOnIntentWrapper`, different Extra fields will be added to the Intent.

`EXTRA_FOR_HAS_PROMO` and `EXTRA_FOR_FLYER_ID` are later accessed in [[SearchActivity(2)]]

A similar method in this class does roughly the same for `EXTRA_FOR_TRADE` and `EXTRA_FOR_QUERY` which are also accessed in [[SearchActivity(2)]].
