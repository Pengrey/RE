package p407vj;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;

/* renamed from: vj.a */
/* loaded from: classes2.dex */
public final class DefaultStoreActivity {
    /* renamed from: a */
    public static final void m5308a(AbstractC0304b abstractC0304b, Activity activity) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.home.defaultstore.DefaultStoreActivity.class);
        intent.addFlags(131072);
        abstractC0304b.m41324a(intent);
    }
}
