package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes.dex */
public class C2545t {
    /* renamed from: a */
    public static void m33281a(Status status, C3421e<Void> c3421e) {
        m33280b(status, null, c3421e);
    }

    /* renamed from: b */
    public static <TResult> void m33280b(Status status, TResult tresult, C3421e<TResult> c3421e) {
        if (status.m33511D()) {
            c3421e.m30800c(tresult);
        } else {
            c3421e.m30801b(new ApiException(status));
        }
    }

    @Deprecated
    /* renamed from: c */
    public static AbstractC3419d<Void> m33279c(AbstractC3419d<Boolean> abstractC3419d) {
        return abstractC3419d.mo30789g(new C2512i1());
    }
}
