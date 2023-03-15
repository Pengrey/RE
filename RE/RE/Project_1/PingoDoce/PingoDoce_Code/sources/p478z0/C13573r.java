package p478z0;

import androidx.compose.p018ui.platform.CompositionLocals;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import id.InterfaceC6114r;
import java.util.Map;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p373u0.C10783m;
import p393v0.C11047p;
import p393v0.Color;
import p393v0.ColorFilter;
import p468yc.C13195u;
import p478z0.VectorPainter;
import p479z1.Density;

/* compiled from: VectorPainter.kt */
/* renamed from: z0.r */
/* loaded from: classes.dex */
public final class C13573r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.r$a */
    /* loaded from: classes.dex */
    public static final class C13574a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ AbstractC13566p f34550w;

        /* renamed from: x */
        final /* synthetic */ Map f34551x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13574a(AbstractC13566p abstractC13566p, Map map) {
            super(2);
            this.f34550w = abstractC13566p;
            this.f34551x = map;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m952a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m952a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                C13573r.m956a((C13563n) this.f34550w, this.f34551x, interfaceC5179i, 64, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.r$b */
    /* loaded from: classes.dex */
    public static final class C13575b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ C13563n f34552w;

        /* renamed from: x */
        final /* synthetic */ Map f34553x;

        /* renamed from: y */
        final /* synthetic */ int f34554y;

        /* renamed from: z */
        final /* synthetic */ int f34555z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13575b(C13563n c13563n, Map map, int i, int i2) {
            super(2);
            this.f34552w = c13563n;
            this.f34553x = map;
            this.f34554y = i;
            this.f34555z = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m950a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m950a(InterfaceC5179i interfaceC5179i, int i) {
            C13573r.m956a(this.f34552w, this.f34553x, interfaceC5179i, this.f34554y | 1, this.f34555z);
        }
    }

    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.r$c */
    /* loaded from: classes.dex */
    public static final class C13576c implements VectorPainter {
        C13576c() {
        }

        /* renamed from: a */
        public Object m949a(AbstractC13581t abstractC13581t, Object obj) {
            return VectorPainter.C13562a.m993a(this, abstractC13581t, obj);
        }
    }

    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.r$d */
    /* loaded from: classes.dex */
    public static final class C13577d implements VectorPainter {
        C13577d() {
        }

        /* renamed from: a */
        public Object m948a(AbstractC13581t abstractC13581t, Object obj) {
            return VectorPainter.C13562a.m993a(this, abstractC13581t, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.r$e */
    /* loaded from: classes.dex */
    public static final class C13578e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ C13567q f34556w;

        /* renamed from: x */
        final /* synthetic */ long f34557x;

        /* renamed from: y */
        final /* synthetic */ int f34558y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13578e(C13567q c13567q, long j, int i) {
            super(0);
            this.f34556w = c13567q;
            this.f34557x = j;
            this.f34558y = i;
        }

        /* renamed from: a */
        public final void m947a() {
            this.f34556w.m965r(!Color.m6646n(this.f34557x, Color.f28297b.m6632f()) ? ColorFilter.f28316b.m6601a(this.f34557x, this.f34558y) : null);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m947a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.r$f */
    /* loaded from: classes.dex */
    public static final class C13579f extends AbstractC6438m implements InterfaceC6114r {

        /* renamed from: w */
        final /* synthetic */ ImageVector f34559w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13579f(ImageVector imageVector) {
            super(4);
            this.f34559w = imageVector;
        }

        /* renamed from: a */
        public final void m946a(float f, float f2, InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                C13573r.m956a(this.f34559w.m1232d(), null, interfaceC5179i, 0, 2);
            }
        }

        /* renamed from: a0 */
        public /* bridge */ /* synthetic */ Object mo22157a0(Object obj, Object obj2, Object obj3, Object obj4) {
            m946a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), (InterfaceC5179i) obj3, ((Number) obj4).intValue());
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m956a(p478z0.C13563n r23, java.util.Map r24, p092f0.InterfaceC5179i r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p478z0.C13573r.m956a(z0.n, java.util.Map, f0.i, int, int):void");
    }

    /* renamed from: b */
    public static final C13567q m955b(ImageVector imageVector, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(imageVector, "image");
        interfaceC5179i.mo25263g(-1998939043);
        C13567q m954c = m954c(imageVector.m1234b(), imageVector.m1235a(), imageVector.m1228h(), imageVector.m1229g(), imageVector.m1233c(), imageVector.m1230f(), imageVector.m1231e(), ComposableLambda.m19327b(interfaceC5179i, -819890981, true, new C13579f(imageVector)), interfaceC5179i, 12582912, 0);
        interfaceC5179i.mo25282C();
        return m954c;
    }

    /* renamed from: c */
    public static final C13567q m954c(float f, float f2, float f3, float f4, String str, long j, int i, InterfaceC6114r interfaceC6114r, InterfaceC5179i interfaceC5179i, int i2, int i3) {
        Intrinsics.isThisObjectNull(interfaceC6114r, "content");
        interfaceC5179i.mo25263g(-1998940692);
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? "VectorRootGroup" : str;
        long m6632f = (i3 & 32) != 0 ? Color.f28297b.m6632f() : j;
        int m6324z = (i3 & 64) != 0 ? C11047p.f28401a.m6324z() : i;
        Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
        float m899A = density.m899A(f);
        float m899A2 = density.m899A(f2);
        if (Float.isNaN(f5)) {
            f5 = m899A;
        }
        if (Float.isNaN(f6)) {
            f6 = m899A2;
        }
        interfaceC5179i.mo25263g(-1998939971);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = new C13567q();
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        C13567q c13567q = (C13567q) mo25262h;
        c13567q.m964s(C10783m.m7085a(m899A, m899A2));
        int i4 = i2 >> 12;
        c13567q.m972k(str2, f5, f6, interfaceC6114r, interfaceC5179i, 32768 | (i4 & 14) | (i4 & 7168));
        interfaceC5179i.mo25282C();
        Effects.m25535g(new C13578e(c13567q, m6632f, m6324z), interfaceC5179i, 0);
        interfaceC5179i.mo25282C();
        return c13567q;
    }
}
