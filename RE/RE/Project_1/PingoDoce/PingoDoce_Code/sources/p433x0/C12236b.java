package p433x0;

import p181jd.Intrinsics;
import p373u0.C10781l;
import p373u0.C10783m;
import p393v0.InterfaceC11052q0;
import p393v0.InterfaceC11064u;
import p479z1.C13604f;
import p479z1.Density;

/* compiled from: CanvasDrawScope.kt */
/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C12236b {

    /* renamed from: a */
    private static final Density f32283a = C13604f.m882a(1.0f, 1.0f);

    /* compiled from: CanvasDrawScope.kt */
    /* renamed from: x0.b$a */
    /* loaded from: classes.dex */
    public static final class C12237a implements InterfaceC12243g {

        /* renamed from: a */
        final /* synthetic */ InterfaceC12239d f32284a;

        C12237a(InterfaceC12239d interfaceC12239d) {
            this.f32284a = interfaceC12239d;
        }

        /* renamed from: a */
        public void mo3246a(float f, float f2, float f3, float f4, int i) {
            this.f32284a.mo3275b().m6276a(f, f2, f3, f4, i);
        }

        /* renamed from: b */
        public void mo3245b(float f, float f2) {
            this.f32284a.mo3275b().m6275b(f, f2);
        }

        /* renamed from: c */
        public void mo3244c(InterfaceC11052q0 interfaceC11052q0, int i) {
            Intrinsics.isThisObjectNull(interfaceC11052q0, "path");
            this.f32284a.mo3275b().m6274c(interfaceC11052q0, i);
        }

        /* renamed from: d */
        public void mo3243d(float f, float f2, float f3, float f4) {
            InterfaceC11064u mo3275b = this.f32284a.mo3275b();
            InterfaceC12239d interfaceC12239d = this.f32284a;
            long m7085a = C10783m.m7085a(C10781l.m7091i(m3278f()) - (f3 + f), C10781l.m7093g(m3278f()) - (f4 + f2));
            if (C10781l.m7091i(m7085a) >= 0.0f && C10781l.m7093g(m7085a) >= 0.0f) {
                interfaceC12239d.mo3273d(m7085a);
                mo3275b.m6275b(f, f2);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }

        /* renamed from: e */
        public void mo3242e(float[] fArr) {
            Intrinsics.isThisObjectNull(fArr, "matrix");
            this.f32284a.mo3275b().m6264m(fArr);
        }

        /* renamed from: f */
        public long m3278f() {
            return this.f32284a.mo3276a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC12243g m3281a(InterfaceC12239d interfaceC12239d) {
        return m3279c(interfaceC12239d);
    }

    /* renamed from: b */
    public static final /* synthetic */ Density m3280b() {
        return f32283a;
    }

    /* renamed from: c */
    private static final InterfaceC12243g m3279c(InterfaceC12239d interfaceC12239d) {
        return new C12237a(interfaceC12239d);
    }
}
