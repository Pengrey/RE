package nl;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;

/* renamed from: nl.e */
/* loaded from: classes2.dex */
public final class SharedWithActivity {
    /* renamed from: a */
    public static final void m17518a(AbstractC0304b abstractC0304b, Activity activity) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        abstractC0304b.m41324a(new Intent(activity, pt.pingodoce.app.presentation.shoppinglist.shared.SharedWithActivity.class));
    }
}
