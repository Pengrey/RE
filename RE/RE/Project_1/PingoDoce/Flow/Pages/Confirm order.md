![[Pasted image 20230324153238.png]]


#### Page layout
This function sets the title of the page (In the picture above, `A sua encomenda (1)`).

```java
public final void X1(int i10) {  
    String string;  
    Toolbar toolbar = G1().f24771x;  
    if (this.f18266h0) {  
        c0 c0Var = c0.f13926a;  
        String string2 = getString(R.string.lbl_take_away_checkout_alt);  
        string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));  
    } else {  
        string = getString(R.string.lbl_take_away_checkout);  
    }  
    toolbar.setTitle(string);  
}
    ```
