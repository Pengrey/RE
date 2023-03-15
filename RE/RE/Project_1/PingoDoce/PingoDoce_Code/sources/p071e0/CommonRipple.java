package p071e0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import p092f0.C5209j1;
import p092f0.InterfaceC5242r1;
import p092f0.InterfaceC5269z0;
import p181jd.Intrinsics;
import p260o0.C7987t;
import p373u0.C10774f;
import p392v.C10988p;
import p393v0.Color;
import p433x0.DrawScope;
import p433x0.InterfaceC12238c;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* renamed from: e0.b */
/* loaded from: classes.dex */
public final class CommonRipple extends AbstractC4928m implements InterfaceC5269z0 {

    /* renamed from: A */
    private final InterfaceC5242r1 f13632A;

    /* renamed from: B */
    private final C7987t f13633B;

    /* renamed from: x */
    private final boolean f13634x;

    /* renamed from: y */
    private final float f13635y;

    /* renamed from: z */
    private final InterfaceC5242r1 f13636z;

    /* compiled from: CommonRipple.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", m20196f = "CommonRipple.kt", m20195l = {87}, m20194m = "invokeSuspend")
    /* renamed from: e0.b$a */
    /* loaded from: classes.dex */
    static final class C4909a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C10988p f13637A;

        /* renamed from: x */
        int f13638x;

        /* renamed from: y */
        final /* synthetic */ RippleAnimation f13639y;

        /* renamed from: z */
        final /* synthetic */ CommonRipple f13640z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4909a(RippleAnimation rippleAnimation, CommonRipple commonRipple, C10988p c10988p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13639y = rippleAnimation;
            this.f13640z = commonRipple;
            this.f13637A = c10988p;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4909a(this.f13639y, this.f13640z, this.f13637A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4909a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13638x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    RippleAnimation rippleAnimation = this.f13639y;
                    this.f13638x = 1;
                    if (rippleAnimation.m26291d(this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                CommonRipple.m26305i(this.f13640z).remove(this.f13637A);
                return C13195u.f34156a;
            } catch (Throwable th2) {
                CommonRipple.m26305i(this.f13640z).remove(this.f13637A);
                throw th2;
            }
        }
    }

    private CommonRipple(boolean z, float f, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12) {
        super(z, interfaceC5242r12);
        this.f13634x = z;
        this.f13635y = f;
        this.f13636z = interfaceC5242r1;
        this.f13632A = interfaceC5242r12;
        this.f13633B = C5209j1.m25074d();
    }

    public /* synthetic */ CommonRipple(boolean z, float f, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, interfaceC5242r1, interfaceC5242r12);
    }

    /* renamed from: i */
    public static final /* synthetic */ C7987t m26305i(CommonRipple commonRipple) {
        return commonRipple.f13633B;
    }

    /* renamed from: j */
    private final void m26304j(DrawScope drawScope, long j) {
        for (Map.Entry entry : this.f13633B.entrySet()) {
            RippleAnimation rippleAnimation = (RippleAnimation) entry.getValue();
            float m26295d = ((C4914f) this.f13632A.getValue()).m26295d();
            if (!(m26295d == 0.0f)) {
                rippleAnimation.m26290e(drawScope, Color.m6648l(j, m26295d, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    /* renamed from: a */
    public void mo24845a() {
    }

    /* renamed from: b */
    public void mo24844b() {
        this.f13633B.clear();
    }

    /* renamed from: c */
    public void mo8303c(InterfaceC12238c interfaceC12238c) {
        Intrinsics.isThisObjectNull(interfaceC12238c, "<this>");
        long m6638v = ((Color) this.f13636z.getValue()).m6638v();
        interfaceC12238c.mo3277g0();
        m26261f(interfaceC12238c, this.f13635y, m6638v);
        m26304j(interfaceC12238c, m6638v);
    }

    /* renamed from: d */
    public void m26307d(C10988p c10988p, InterfaceC10524i0 interfaceC10524i0) {
        Intrinsics.isThisObjectNull(c10988p, "interaction");
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        for (Map.Entry entry : this.f13633B.entrySet()) {
            ((RippleAnimation) entry.getValue()).m26287h();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.f13634x ? C10774f.m7152d(c10988p.m6665a()) : null, this.f13635y, this.f13634x, null);
        this.f13633B.put(c10988p, rippleAnimation);
        C6772d.m20158d(interfaceC10524i0, null, null, new C4909a(rippleAnimation, this, c10988p, null), 3, null);
    }

    /* renamed from: e */
    public void mo24843e() {
        this.f13633B.clear();
    }

    /* renamed from: g */
    public void m26306g(C10988p c10988p) {
        Intrinsics.isThisObjectNull(c10988p, "interaction");
        RippleAnimation rippleAnimation = (RippleAnimation) this.f13633B.get(c10988p);
        if (rippleAnimation == null) {
            return;
        }
        rippleAnimation.m26287h();
    }
}
