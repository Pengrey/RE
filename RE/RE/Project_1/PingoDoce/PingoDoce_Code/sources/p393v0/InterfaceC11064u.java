package p393v0;

import p181jd.Intrinsics;
import p373u0.Rect;

/* compiled from: Canvas.kt */
/* renamed from: v0.u */
/* loaded from: classes.dex */
public interface InterfaceC11064u {

    /* compiled from: Canvas.kt */
    /* renamed from: v0.u$a */
    /* loaded from: classes.dex */
    public static final class C11065a {
        /* renamed from: a */
        public static /* synthetic */ void m6260a(InterfaceC11064u interfaceC11064u, InterfaceC11052q0 interfaceC11052q0, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i2 & 2) != 0) {
                i = C11076z.f28470a.m6194b();
            }
            interfaceC11064u.m6274c(interfaceC11052q0, i);
        }

        /* renamed from: b */
        public static /* synthetic */ void m6259b(InterfaceC11064u interfaceC11064u, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if ((i2 & 16) != 0) {
                i = C11076z.f28470a.m6194b();
            }
            interfaceC11064u.m6276a(f, f2, f3, f4, i);
        }

        /* renamed from: c */
        public static void m6258c(InterfaceC11064u interfaceC11064u, Rect rect, int i) {
            Intrinsics.isThisObjectNull(interfaceC11064u, "this");
            Intrinsics.isThisObjectNull(rect, "rect");
            interfaceC11064u.m6276a(rect.m7125f(), rect.m7122i(), rect.m7124g(), rect.m7128c(), i);
        }

        /* renamed from: d */
        public static /* synthetic */ void m6257d(InterfaceC11064u interfaceC11064u, Rect rect, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            }
            if ((i2 & 2) != 0) {
                i = C11076z.f28470a.m6194b();
            }
            interfaceC11064u.m6271f(rect, i);
        }

        /* renamed from: e */
        public static void m6256e(InterfaceC11064u interfaceC11064u, Rect rect, InterfaceC11046o0 interfaceC11046o0) {
            Intrinsics.isThisObjectNull(interfaceC11064u, "this");
            Intrinsics.isThisObjectNull(rect, "rect");
            Intrinsics.isThisObjectNull(interfaceC11046o0, "paint");
            interfaceC11064u.m6273d(rect.m7125f(), rect.m7122i(), rect.m7124g(), rect.m7128c(), interfaceC11046o0);
        }
    }

    /* renamed from: a */
    void m6276a(float f, float f2, float f3, float f4, int i);

    /* renamed from: b */
    void m6275b(float f, float f2);

    /* renamed from: c */
    void m6274c(InterfaceC11052q0 interfaceC11052q0, int i);

    /* renamed from: d */
    void m6273d(float f, float f2, float f3, float f4, InterfaceC11046o0 interfaceC11046o0);

    /* renamed from: e */
    void m6272e(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC11046o0 interfaceC11046o0);

    /* renamed from: f */
    void m6271f(Rect rect, int i);

    /* renamed from: g */
    void m6270g();

    /* renamed from: h */
    void m6269h();

    /* renamed from: i */
    void m6268i(InterfaceC11025h0 interfaceC11025h0, long j, long j2, long j3, long j4, InterfaceC11046o0 interfaceC11046o0);

    /* renamed from: j */
    void m6267j();

    /* renamed from: k */
    void m6266k(long j, float f, InterfaceC11046o0 interfaceC11046o0);

    /* renamed from: l */
    void m6265l(Rect rect, InterfaceC11046o0 interfaceC11046o0);

    /* renamed from: m */
    void m6264m(float[] fArr);

    /* renamed from: n */
    void m6263n();

    /* renamed from: o */
    void m6262o(InterfaceC11052q0 interfaceC11052q0, InterfaceC11046o0 interfaceC11046o0);

    /* renamed from: p */
    void m6261p(Rect rect, InterfaceC11046o0 interfaceC11046o0);
}
