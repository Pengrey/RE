package ml;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: ml.h */
/* loaded from: classes2.dex */
public final class ShoppingListsActivity {
    /* renamed from: a */
    public static final void m18326a(AbstractC0304b abstractC0304b, Activity activity) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        abstractC0304b.m41324a(new Intent(activity, pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity.class));
    }

    /* renamed from: b */
    public static final void m18325b(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.shoppinglist.mylists.ShoppingListsActivity.class));
    }
}
