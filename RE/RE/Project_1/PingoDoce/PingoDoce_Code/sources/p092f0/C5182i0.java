package p092f0;

import bd.CoroutineContext;
import id.InterfaceC6112p;
import kotlinx.coroutines.C6772d;
import p181jd.Intrinsics;
import td.C10531j0;
import td.C10596y1;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* compiled from: Effects.kt */
/* renamed from: f0.i0 */
/* loaded from: classes.dex */
public final class C5182i0 implements InterfaceC5269z0 {

    /* renamed from: w */
    private final InterfaceC6112p f14331w;

    /* renamed from: x */
    private final InterfaceC10524i0 f14332x;

    /* renamed from: y */
    private InterfaceC10574t1 f14333y;

    public C5182i0(CoroutineContext coroutineContext, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(coroutineContext, "parentCoroutineContext");
        Intrinsics.isThisObjectNull(interfaceC6112p, "task");
        this.f14331w = interfaceC6112p;
        this.f14332x = C10531j0.m7771a(coroutineContext);
    }

    /* renamed from: a */
    public void mo24845a() {
        InterfaceC10574t1 m20158d;
        InterfaceC10574t1 interfaceC10574t1 = this.f14333y;
        if (interfaceC10574t1 != null) {
            C10596y1.m7594f(interfaceC10574t1, "Old job was still running!", null, 2, null);
        }
        m20158d = C6772d.m20158d(this.f14332x, null, null, this.f14331w, 3, null);
        this.f14333y = m20158d;
    }

    /* renamed from: b */
    public void mo24844b() {
        InterfaceC10574t1 interfaceC10574t1 = this.f14333y;
        if (interfaceC10574t1 != null) {
            InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
        }
        this.f14333y = null;
    }

    /* renamed from: e */
    public void mo24843e() {
        InterfaceC10574t1 interfaceC10574t1 = this.f14333y;
        if (interfaceC10574t1 != null) {
            InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
        }
        this.f14333y = null;
    }
}
