package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.m1 */
/* loaded from: classes.dex */
public final class C2524m1 extends AbstractC2515j1<Void> {

    /* renamed from: c */
    public final C2555w0 f7303c;

    public C2524m1(C2555w0 c2555w0, C3421e<Void> c3421e) {
        super(3, c3421e);
        this.f7303c = c2555w0;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33302d(C2557x c2557x, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2533p0
    /* renamed from: f */
    public final boolean mo33307f(C2506h0<?> c2506h0) {
        return this.f7303c.f7365a.m33321f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2533p0
    /* renamed from: g */
    public final Feature[] mo33306g(C2506h0<?> c2506h0) {
        return this.f7303c.f7365a.m33323c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2515j1
    /* renamed from: h */
    public final void mo33308h(C2506h0<?> c2506h0) throws RemoteException {
        this.f7303c.f7365a.mo33252d(c2506h0.m33362t(), this.f7278b);
        C2508i.C2509a<?> m33324b = this.f7303c.f7365a.m33324b();
        if (m33324b != null) {
            c2506h0.m33360v().put(m33324b, this.f7303c);
        }
    }
}
