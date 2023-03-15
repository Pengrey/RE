package p207kl;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import p181jd.Intrinsics;

/* renamed from: kl.d0 */
/* loaded from: classes2.dex */
public final class ShoppingListActivity {
    /* renamed from: a */
    public static final void m20275a(ComponentActivity componentActivity) {
        Intrinsics.isThisObjectNull(componentActivity, "<this>");
        Intent intent = new Intent(componentActivity, pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity.class);
        intent.addFlags(131072);
        componentActivity.startActivity(intent);
    }
}
