package mh;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;

/* renamed from: mh.a */
/* loaded from: classes2.dex */
public final class EditNifActivity {
    /* renamed from: a */
    public static final void m18403a(AbstractC0304b abstractC0304b, Activity activity, String str) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(str, "nif");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.account.loggedAccount.profile.nif.EditNifActivity.class);
        intent.putExtra("EXTRA_FOR_NIF", str);
        abstractC0304b.m41324a(intent);
    }
}
