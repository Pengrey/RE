package p106fe;

import android.content.Intent;
import android.net.Uri;
import p181jd.Intrinsics;

/* compiled from: IntentUtils.kt */
/* renamed from: fe.c */
/* loaded from: classes2.dex */
public final class C5456c {
    /* renamed from: a */
    public static final Intent m24291a(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW");
        Intent data = intent.setData(Uri.parse("market://details?q=" + str));
        Intrinsics.checkIfNull(data, "intentForDetailInStore");
        return data;
    }
}
