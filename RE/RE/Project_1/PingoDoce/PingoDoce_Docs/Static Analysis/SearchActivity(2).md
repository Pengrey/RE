### Intent Handling
#### EXTRA_FOR_HAS_PROMO &  EXTRA_FOR_FLYER_ID
These Intent Extras are created in [[SearchActivity(1)]], and accessed in the following method:

```java
private final void U1() {  
        ((pt.pingodoce.app.presentation.common.search.a) I0()).o1(getIntent().getBooleanExtra("EXTRA_FOR_HAS_PROMO", false));  
        int intExtra = getIntent().getIntExtra("EXTRA_FOR_FLYER_ID", -1);  
        if (intExtra != -1) {  
            ((pt.pingodoce.app.presentation.common.search.a) I0()).n1(intExtra);  
        }  
        String stringExtra = getIntent().getStringExtra("EXTRA_FOR_QUERY");  
        if (stringExtra != null) {  
            K1().d0(stringExtra, true);  
        }  
    }

// Cleaned up

  
private final void handlePromoIntent() {  
    aSearchViewModel().setPromo(
	    getIntent().getBooleanExtra("EXTRA_FOR_HAS_PROMO", false));  
    int intExtra = getIntent().getIntExtra("EXTRA_FOR_FLYER_ID", -1);  
    if (intExtra != -1) {  
        aSearchViewModel().setFlyerId(intExtra);  
    }  
    String stringExtra = getIntent().getStringExtra("EXTRA_FOR_QUERY");  
    if (stringExtra != null) {  
        aSearchView().setTextForAutoComplete(stringExtra, true);  
        }  
    }
```

So this code fetches the data in the intent in order to do some function related to a search query, 
