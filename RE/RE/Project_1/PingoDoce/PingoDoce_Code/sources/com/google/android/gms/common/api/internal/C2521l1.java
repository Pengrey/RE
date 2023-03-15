package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2493d;
import com.google.android.gms.common.internal.C2597i;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.l1 */
/* loaded from: classes.dex */
public final class C2521l1<A extends AbstractC2493d<? extends InterfaceC13123e, C2461a.InterfaceC2463b>> extends AbstractC2534p1 {

    /* renamed from: b */
    protected final A f7297b;

    public C2521l1(int i, A a) {
        super(i);
        this.f7297b = (A) C2597i.m33075k(a, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: a */
    public final void mo33305a(Status status) {
        try {
            this.f7297b.m33442p(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: b */
    public final void mo33304b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f7297b.m33442p(new Status(10, sb2.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: c */
    public final void mo33303c(C2506h0<?> c2506h0) throws DeadObjectException {
        try {
            this.f7297b.m33444n(c2506h0.m33362t());
        } catch (RuntimeException e) {
            mo33304b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: d */
    public final void mo33302d(C2557x c2557x, boolean z) {
        c2557x.m33266c(this.f7297b, z);
    }
}
