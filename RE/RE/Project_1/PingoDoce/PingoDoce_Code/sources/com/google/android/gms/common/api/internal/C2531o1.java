package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.tasks.C3421e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.o1 */
/* loaded from: classes.dex */
public final class C2531o1 extends AbstractC2515j1<Boolean> {

    /* renamed from: c */
    public final C2508i.C2509a<?> f7319c;

    public C2531o1(C2508i.C2509a<?> c2509a, C3421e<Boolean> c3421e) {
        super(4, c3421e);
        this.f7319c = c2509a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2534p1
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33302d(C2557x c2557x, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2533p0
    /* renamed from: f */
    public final boolean mo33307f(C2506h0<?> c2506h0) {
        C2555w0 c2555w0 = c2506h0.m33360v().get(this.f7319c);
        return c2555w0 != null && c2555w0.f7365a.m33321f();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2533p0
    /* renamed from: g */
    public final Feature[] mo33306g(C2506h0<?> c2506h0) {
        C2555w0 c2555w0 = c2506h0.m33360v().get(this.f7319c);
        if (c2555w0 == null) {
            return null;
        }
        return c2555w0.f7365a.m33323c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2515j1
    /* renamed from: h */
    public final void mo33308h(C2506h0<?> c2506h0) throws RemoteException {
        C2555w0 remove = c2506h0.m33360v().remove(this.f7319c);
        if (remove != null) {
            remove.f7366b.mo33249b(c2506h0.m33362t(), this.f7278b);
            remove.f7365a.m33325a();
            return;
        }
        this.f7278b.m30798e(Boolean.FALSE);
    }
}
