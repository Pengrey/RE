![[Pasted image 20230324143827.png]]

The activity for this screen is `PromotionActivity`, and its package is `pt.pingodoce.app.presentation.promotion`.



### Search

This is the code present in PromotionActivity that seems to handle search (then calling on SearchActivity methods):

```java
public static final boolean A1(PromotionActivity promotionActivity,
							   MenuItem menuItem) {  
    Intrinsics.isThisObjectNull(promotionActivity, "this$0");  
    Integer valueOf = menuItem != null ? 
							    Integer.valueOf(menuItem.getItemId()) :
							    null;  
    if (valueOf != null && valueOf.intValue() == R.id.action_search) {  
	    SearchActivityHelper.setExtrasOnIntentWrapper(
		    promotionActivity.f20096j0, promotionActivity,
		    Boolean.TRUE, null, 4, null);  
	    return true;  
    }  
    return false;  
}
```

This code gets the value of a *certain* menu item ID, and then if it corresponds to `R.id.action_search` it will call methods from [[SearchActivity(1)]] (more detailed there) in order to create an intent.

`R.id.action_search` is referenced as well in `Toolbar`, `ShoppingListActivity`, `HomeActivity`  and `FlyerActivity`, so it likely is related to the search icon present in the toolbar in multiple screens.
![[Pasted image 20230326134742.png]]

