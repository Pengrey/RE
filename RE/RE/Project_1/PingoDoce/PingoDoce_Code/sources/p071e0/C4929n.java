package p071e0;

import p092f0.C5209j1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p345s.C10019z;
import p345s.C9978p0;
import p345s.InterfaceC9950h;
import p357t.InterfaceC10307k;
import p392v.C10974b;
import p392v.C10976d;
import p392v.C10980g;
import p392v.InterfaceC10984j;
import p393v0.Color;
import p479z1.C13605g;

/* renamed from: e0.n */
/* loaded from: classes.dex */
public final class C4929n {

    /* renamed from: a */
    private static final C9978p0<Float> f13702a = new C9978p0<>(15, 0, C10019z.m9388b(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final InterfaceC9950h<Float> m26256c(InterfaceC10984j interfaceC10984j) {
        if (interfaceC10984j instanceof C10980g) {
            return f13702a;
        }
        if (!(interfaceC10984j instanceof C10976d) && !(interfaceC10984j instanceof C10974b)) {
            return f13702a;
        }
        return new C9978p0(45, 0, C10019z.m9388b(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final InterfaceC9950h<Float> m26255d(InterfaceC10984j interfaceC10984j) {
        if (!(interfaceC10984j instanceof C10980g) && !(interfaceC10984j instanceof C10976d)) {
            return interfaceC10984j instanceof C10974b ? new C9978p0(150, 0, C10019z.m9388b(), 2, null) : f13702a;
        }
        return f13702a;
    }

    /* renamed from: e */
    public static final InterfaceC10307k m26254e(boolean z, float f, long j, InterfaceC5179i interfaceC5179i, int i, int i2) {
        interfaceC5179i.mo25263g(-1508283743);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = C13605g.f34597x.m868b();
        }
        if ((i2 & 4) != 0) {
            j = Color.f28297b.m6632f();
        }
        InterfaceC5242r1 m25067k = C5209j1.m25067k(Color.m6652h(j), interfaceC5179i, (i >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z);
        C13605g m878d = C13605g.m878d(f);
        interfaceC5179i.mo25263g(-3686552);
        boolean mo25276I = interfaceC5179i.mo25276I(valueOf) | interfaceC5179i.mo25276I(m878d);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = new C4911d(z, f, m25067k, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        C4911d c4911d = (C4911d) mo25262h;
        interfaceC5179i.mo25282C();
        return c4911d;
    }
}
