![[Pasted image 20230324154326.png]]

The activity for this screen is `PromotionActivity`, and its package is `pt.pingodoce.app.presentation.promotion`.

The timespan selector is implemented by a `TabLayout` and this is the code that handles the selection:

```java
@Override // com.google.android.material.tabs.TabLayout.c  

public void selectTimespan(TabLayout.f timespanTabLayout) {  
    if (fVar != null) {  
	    il.j jVar = this.f20125a;  
        int selectedTimeTab = timespanTabLayout.selectedTimeTab();  
        if (selectedTimeTab == 0) {  
            jVar.coroutineToChangeTabTimespan(d.a.FILTER_BY_30_DAYS);  
        } else if (selectedTimeTab != 1) {  
            jVar.coroutineToChangeTabTimespan(d.a.FILTER_BY_12_MONTHS);  
        } else {  
            jVar.coroutineToChangeTabTimespan(d.a.FILTER_BY_3_MONTHS);  
        }  
    }  
}
```

