package p051d0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5209j1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p393v0.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d0.n */
/* loaded from: classes.dex */
public final class C4606n implements InterfaceC4537c {

    /* renamed from: a */
    private final long f12502a;

    /* renamed from: b */
    private final long f12503b;

    /* renamed from: c */
    private final long f12504c;

    /* renamed from: d */
    private final long f12505d;

    private C4606n(long j, long j2, long j3, long j4) {
        this.f12502a = j;
        this.f12503b = j2;
        this.f12504c = j3;
        this.f12505d = j4;
    }

    public /* synthetic */ C4606n(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    /* renamed from: a */
    public InterfaceC5242r1 mo27271a(boolean z, InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(1464785127);
        InterfaceC5242r1 m25067k = C5209j1.m25067k(Color.m6652h(z ? this.f12503b : this.f12505d), interfaceC5179i, 0);
        interfaceC5179i.mo25282C();
        return m25067k;
    }

    /* renamed from: b */
    public InterfaceC5242r1 mo27270b(boolean z, InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(1290127909);
        InterfaceC5242r1 m25067k = C5209j1.m25067k(Color.m6652h(z ? this.f12502a : this.f12504c), interfaceC5179i, 0);
        interfaceC5179i.mo25282C();
        return m25067k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.equals(C6450z.m20906b(C4606n.class), C6450z.m20906b(obj.getClass()))) {
            return false;
        }
        C4606n c4606n = (C4606n) obj;
        return Color.m6646n(this.f12502a, c4606n.f12502a) && Color.m6646n(this.f12503b, c4606n.f12503b) && Color.m6646n(this.f12504c, c4606n.f12504c) && Color.m6646n(this.f12505d, c4606n.f12505d);
    }

    public int hashCode() {
        return (((((Color.m6640t(this.f12502a) * 31) + Color.m6640t(this.f12503b)) * 31) + Color.m6640t(this.f12504c)) * 31) + Color.m6640t(this.f12505d);
    }
}
