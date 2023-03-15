package p232m3;

import android.net.Uri;
import p181jd.Intrinsics;
import p305q3.C9635k;
import p396v3.C11098i;

/* renamed from: m3.c */
/* loaded from: classes.dex */
public final class C7114c implements InterfaceC7113b {
    /* renamed from: b */
    public String mo19194b(Uri uri, C9635k c9635k) {
        if (Intrinsics.equals(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            sb2.append(C11098i.m6144l(c9635k.m10324g().getResources().getConfiguration()));
            return sb2.toString();
        }
        return uri.toString();
    }
}
