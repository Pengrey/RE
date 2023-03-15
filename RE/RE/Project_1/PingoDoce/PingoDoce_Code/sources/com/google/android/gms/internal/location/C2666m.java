package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.internal.C2597i;
import java.util.HashMap;
import java.util.Map;
import p331r7.InterfaceC9821c;
import p400v7.AbstractC11129a;
import p400v7.InterfaceC11130b;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.m */
/* loaded from: classes.dex */
public final class C2666m {

    /* renamed from: a */
    private final InterfaceC9821c<InterfaceC2659f> f7596a;

    /* renamed from: b */
    private boolean f7597b = false;

    /* renamed from: c */
    private final Map<C2508i.C2509a<InterfaceC11130b>, BinderC2665l> f7598c = new HashMap();

    /* renamed from: d */
    private final Map<C2508i.C2509a, BinderC2663j> f7599d = new HashMap();

    /* renamed from: e */
    private final Map<C2508i.C2509a<AbstractC11129a>, BinderC2662i> f7600e = new HashMap();

    public C2666m(Context context, InterfaceC9821c<InterfaceC2659f> interfaceC9821c) {
        this.f7596a = interfaceC9821c;
    }

    /* renamed from: a */
    public final Location m32949a(String str) throws RemoteException {
        C2672s.m32937m0(((C2671r) this.f7596a).f7602a);
        return ((C2671r) this.f7596a).m32938a().mo32955i1(str);
    }

    @Deprecated
    /* renamed from: b */
    public final Location m32948b() throws RemoteException {
        C2672s.m32937m0(((C2671r) this.f7596a).f7602a);
        return ((C2671r) this.f7596a).m32938a().mo32953t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m32947c(zzba zzbaVar, C2508i<AbstractC11129a> c2508i, InterfaceC2657d interfaceC2657d) throws RemoteException {
        BinderC2662i binderC2662i;
        C2672s.m32937m0(((C2671r) this.f7596a).f7602a);
        C2508i.C2509a<AbstractC11129a> m33355b = c2508i.m33355b();
        if (m33355b == null) {
            binderC2662i = null;
        } else {
            synchronized (this.f7600e) {
                BinderC2662i binderC2662i2 = this.f7600e.get(m33355b);
                if (binderC2662i2 == null) {
                    binderC2662i2 = new BinderC2662i(c2508i);
                }
                binderC2662i = binderC2662i2;
                this.f7600e.put(m33355b, binderC2662i);
            }
        }
        BinderC2662i binderC2662i3 = binderC2662i;
        if (binderC2662i3 == null) {
            return;
        }
        ((C2671r) this.f7596a).m32938a().mo32954j0(new zzbc(1, zzbaVar, null, null, binderC2662i3, interfaceC2657d));
    }

    /* renamed from: d */
    public final void m32946d(C2508i.C2509a<AbstractC11129a> c2509a, InterfaceC2657d interfaceC2657d) throws RemoteException {
        C2672s.m32937m0(((C2671r) this.f7596a).f7602a);
        C2597i.m33075k(c2509a, "Invalid null listener key");
        synchronized (this.f7600e) {
            BinderC2662i remove = this.f7600e.remove(c2509a);
            if (remove != null) {
                remove.m32952a();
                ((C2671r) this.f7596a).m32938a().mo32954j0(zzbc.m32931t(remove, interfaceC2657d));
            }
        }
    }

    /* renamed from: e */
    public final void m32945e(boolean z) throws RemoteException {
        C2672s.m32937m0(((C2671r) this.f7596a).f7602a);
        ((C2671r) this.f7596a).m32938a().mo32956M1(z);
        this.f7597b = z;
    }

    /* renamed from: f */
    public final void m32944f() throws RemoteException {
        synchronized (this.f7598c) {
            for (BinderC2665l binderC2665l : this.f7598c.values()) {
                if (binderC2665l != null) {
                    ((C2671r) this.f7596a).m32938a().mo32954j0(zzbc.m32932h(binderC2665l, null));
                }
            }
            this.f7598c.clear();
        }
        synchronized (this.f7600e) {
            for (BinderC2662i binderC2662i : this.f7600e.values()) {
                if (binderC2662i != null) {
                    ((C2671r) this.f7596a).m32938a().mo32954j0(zzbc.m32931t(binderC2662i, null));
                }
            }
            this.f7600e.clear();
        }
        synchronized (this.f7599d) {
            for (BinderC2663j binderC2663j : this.f7599d.values()) {
                if (binderC2663j != null) {
                    ((C2671r) this.f7596a).m32938a().mo32957I1(new zzl(2, null, binderC2663j, null));
                }
            }
            this.f7599d.clear();
        }
    }

    /* renamed from: g */
    public final void m32943g() throws RemoteException {
        if (this.f7597b) {
            m32945e(false);
        }
    }
}
