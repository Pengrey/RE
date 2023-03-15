package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.internal.C2583c;
import p078e7.C5000a;
import p400v7.AbstractC11129a;
import p400v7.C11134f;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.n */
/* loaded from: classes.dex */
public final class C2667n extends C2672s {

    /* renamed from: D */
    private final C2666m f7601D;

    public C2667n(Context context, Looper looper, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b, String str, C2583c c2583c) {
        super(context, looper, interfaceC2476a, interfaceC2477b, str, c2583c);
        this.f7601D = new C2666m(context, this.f7604C);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b
    /* renamed from: S */
    public final boolean mo19094S() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b, com.google.android.gms.common.api.C2461a.InterfaceC2470f
    /* renamed from: n */
    public final void mo32942n() {
        synchronized (this.f7601D) {
            if (m33160b()) {
                try {
                    this.f7601D.m32944f();
                    this.f7601D.m32943g();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo32942n();
        }
    }

    /* renamed from: n0 */
    public final void m32941n0(zzba zzbaVar, C2508i<AbstractC11129a> c2508i, InterfaceC2657d interfaceC2657d) throws RemoteException {
        synchronized (this.f7601D) {
            this.f7601D.m32947c(zzbaVar, c2508i, interfaceC2657d);
        }
    }

    /* renamed from: o0 */
    public final void m32940o0(C2508i.C2509a<AbstractC11129a> c2509a, InterfaceC2657d interfaceC2657d) throws RemoteException {
        this.f7601D.m32946d(c2509a, interfaceC2657d);
    }

    /* renamed from: p0 */
    public final Location m32939p0(String str) throws RemoteException {
        if (C5000a.m25920c(m33147j(), C11134f.f28563c)) {
            return this.f7601D.m32949a(str);
        }
        return this.f7601D.m32948b();
    }
}
