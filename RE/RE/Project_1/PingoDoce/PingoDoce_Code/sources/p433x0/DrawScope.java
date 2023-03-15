package p433x0;

import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10781l;
import p373u0.C10783m;
import p393v0.AbstractC11057s;
import p393v0.C11007d0;
import p393v0.C11047p;
import p393v0.ColorFilter;
import p393v0.InterfaceC11025h0;
import p393v0.InterfaceC11052q0;
import p479z1.C13612k;
import p479z1.C13617n;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: x0.e */
/* loaded from: classes.dex */
public interface DrawScope extends Density {

    /* renamed from: u */
    public static final C12240a f32285u = C12240a.f32286a;

    /* compiled from: DrawScope.kt */
    /* renamed from: x0.e$a */
    /* loaded from: classes.dex */
    public static final class C12240a {

        /* renamed from: a */
        static final /* synthetic */ C12240a f32286a = new C12240a();

        /* renamed from: b */
        private static final int f32287b = C11047p.f28401a.m6351B();

        /* renamed from: c */
        private static final int f32288c = C11007d0.f28337a.m6556a();

        private C12240a() {
        }

        /* renamed from: a */
        public final int m3261a() {
            return f32287b;
        }

        /* renamed from: b */
        public final int m3260b() {
            return f32288c;
        }
    }

    /* compiled from: DrawScope.kt */
    /* renamed from: x0.e$b */
    /* loaded from: classes.dex */
    public static final class C12241b {
        /* renamed from: a */
        public static /* synthetic */ void m3259a(DrawScope drawScope, long j, float f, long j2, float f2, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            }
            drawScope.m3271D(j, (i2 & 2) != 0 ? C10781l.m7092h(drawScope.m3263a()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.m3266Q() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? C12245i.f32289a : abstractC12242f, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.f32285u.m3261a() : i);
        }

        /* renamed from: b */
        public static /* synthetic */ void m3258b(DrawScope drawScope, InterfaceC11025h0 interfaceC11025h0, long j, long j2, long j3, long j4, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            }
            long m834a = (i3 & 2) != 0 ? C13612k.f34607b.m834a() : j;
            long m819a = (i3 & 4) != 0 ? C13617n.m819a(interfaceC11025h0.mo6478b(), interfaceC11025h0.mo6479a()) : j2;
            drawScope.m3270E(interfaceC11025h0, m834a, m819a, (i3 & 8) != 0 ? C13612k.f34607b.m834a() : j3, (i3 & 16) != 0 ? m819a : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? C12245i.f32289a : abstractC12242f, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? DrawScope.f32285u.m3261a() : i, (i3 & 512) != 0 ? DrawScope.f32285u.m3260b() : i2);
        }

        /* renamed from: c */
        public static /* synthetic */ void m3257c(DrawScope drawScope, InterfaceC11052q0 interfaceC11052q0, AbstractC11057s abstractC11057s, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            }
            if ((i2 & 4) != 0) {
                f = 1.0f;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                abstractC12242f = C12245i.f32289a;
            }
            AbstractC12242f abstractC12242f2 = abstractC12242f;
            if ((i2 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i2 & 32) != 0) {
                i = DrawScope.f32285u.m3261a();
            }
            drawScope.m3267N(interfaceC11052q0, abstractC11057s, f2, abstractC12242f2, colorFilter2, i);
        }

        /* renamed from: d */
        public static /* synthetic */ void m3256d(DrawScope drawScope, AbstractC11057s abstractC11057s, long j, long j2, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
            }
            long m7134c = (i2 & 2) != 0 ? C10774f.f27866b.m7134c() : j;
            drawScope.m3268M(abstractC11057s, m7134c, (i2 & 4) != 0 ? m3252h(drawScope, drawScope.m3263a(), m7134c) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? C12245i.f32289a : abstractC12242f, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.f32285u.m3261a() : i);
        }

        /* renamed from: e */
        public static /* synthetic */ void m3255e(DrawScope drawScope, long j, long j2, long j3, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
            }
            long m7134c = (i2 & 2) != 0 ? C10774f.f27866b.m7134c() : j2;
            drawScope.m3265R(j, m7134c, (i2 & 4) != 0 ? m3252h(drawScope, drawScope.m3263a(), m7134c) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? C12245i.f32289a : abstractC12242f, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? DrawScope.f32285u.m3261a() : i);
        }

        /* renamed from: f */
        public static long m3254f(DrawScope drawScope) {
            Intrinsics.isThisObjectNull(drawScope, "this");
            return C10783m.m7084b(drawScope.m3272B().mo3276a());
        }

        /* renamed from: g */
        public static long m3253g(DrawScope drawScope) {
            Intrinsics.isThisObjectNull(drawScope, "this");
            return drawScope.m3272B().mo3276a();
        }

        /* renamed from: h */
        private static long m3252h(DrawScope drawScope, long j, long j2) {
            return C10783m.m7085a(C10781l.m7091i(j) - C10774f.m7145k(j2), C10781l.m7093g(j) - C10774f.m7144l(j2));
        }

        /* renamed from: i */
        public static int m3251i(DrawScope drawScope, float f) {
            Intrinsics.isThisObjectNull(drawScope, "this");
            return Density.C13602a.m893a(drawScope, f);
        }

        /* renamed from: j */
        public static float m3250j(DrawScope drawScope, int i) {
            Intrinsics.isThisObjectNull(drawScope, "this");
            return Density.C13602a.m892b(drawScope, i);
        }

        /* renamed from: k */
        public static float m3249k(DrawScope drawScope, long j) {
            Intrinsics.isThisObjectNull(drawScope, "this");
            return Density.C13602a.m891c(drawScope, j);
        }

        /* renamed from: l */
        public static float m3248l(DrawScope drawScope, float f) {
            Intrinsics.isThisObjectNull(drawScope, "this");
            return Density.C13602a.m890d(drawScope, f);
        }

        /* renamed from: m */
        public static long m3247m(DrawScope drawScope, long j) {
            Intrinsics.isThisObjectNull(drawScope, "this");
            return Density.C13602a.m889e(drawScope, j);
        }
    }

    /* renamed from: B */
    InterfaceC12239d m3272B();

    /* renamed from: D */
    void m3271D(long j, float f, long j2, float f2, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i);

    /* renamed from: E */
    void m3270E(InterfaceC11025h0 interfaceC11025h0, long j, long j2, long j3, long j4, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i, int i2);

    /* renamed from: H */
    void m3269H(InterfaceC11052q0 interfaceC11052q0, long j, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i);

    /* renamed from: M */
    void m3268M(AbstractC11057s abstractC11057s, long j, long j2, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i);

    /* renamed from: N */
    void m3267N(InterfaceC11052q0 interfaceC11052q0, AbstractC11057s abstractC11057s, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i);

    /* renamed from: Q */
    long m3266Q();

    /* renamed from: R */
    void m3265R(long j, long j2, long j3, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i);

    /* renamed from: X */
    void m3264X(AbstractC11057s abstractC11057s, long j, long j2, long j3, float f, AbstractC12242f abstractC12242f, ColorFilter colorFilter, int i);

    /* renamed from: a */
    long m3263a();

    /* renamed from: d0 */
    void m3262d0(long j, long j2, long j3, long j4, AbstractC12242f abstractC12242f, float f, ColorFilter colorFilter, int i);

    EnumC13618o getLayoutDirection();
}
