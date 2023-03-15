package p224lh;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;

/* renamed from: lh.a */
/* loaded from: classes2.dex */
public final class EditEmailActivity {
    /* renamed from: a */
    public static final void m19429a(AbstractC0304b abstractC0304b, Activity activity, String str) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(str, "email");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.account.loggedAccount.profile.email.EditEmailActivity.class);
        intent.putExtra("EXTRA_FOR_EMAIL", str);
        abstractC0304b.m41324a(intent);
    }
}
