package kh;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.AbstractC0304b;
import p181jd.Intrinsics;

/* renamed from: kh.b */
/* loaded from: classes2.dex */
public final class EditBirthDateActivity {
    /* renamed from: a */
    public static final void m20362a(AbstractC0304b abstractC0304b, Activity activity, String str) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(str, "birthDate");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.account.loggedAccount.profile.birthdate.EditBirthDateActivity.class);
        intent.putExtra("EXTRA_FOR_BIRTHDATE", str);
        abstractC0304b.m41324a(intent);
    }
}
