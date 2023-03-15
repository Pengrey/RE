package p217l7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.C2597i;
import p008a7.C0067b;
import p291p6.C8436a;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: l7.g */
/* loaded from: classes.dex */
public final class C6998g {
    /* renamed from: a */
    public static PendingIntent m19635a(Context context, C8436a.C8437a c8437a, HintRequest hintRequest, String str) {
        String str2;
        C2597i.m33075k(context, "context must not be null");
        C2597i.m33075k(hintRequest, "request must not be null");
        if (TextUtils.isEmpty(str)) {
            str2 = C6993b.m19641a();
        } else {
            str2 = (String) C2597i.m33076j(str);
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (String) null);
        putExtra.putExtra("logSessionId", str2);
        C0067b.m41993b(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return C6994c.m19640a(context, 2000, putExtra, C6994c.f18607a | 134217728);
    }
}
