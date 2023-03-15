package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d6 */
/* loaded from: classes.dex */
public final class C2730d6 {

    /* renamed from: a */
    private static final C9545a f7704a = new C9545a();

    /* renamed from: a */
    public static synchronized Uri m32785a(String str) {
        Uri uri;
        synchronized (C2730d6.class) {
            C9545a c9545a = f7704a;
            uri = (Uri) c9545a.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                c9545a.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
