package p071e0;

import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import p003a2.C0010a;
import p070e.C4906j;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p181jd.Intrinsics;
import p345s.Animatable;
import p345s.AnimationSpec;
import p345s.C10019z;
import p345s.C9937b;
import p345s.C9978p0;
import p373u0.C10774f;
import p373u0.C10776g;
import p373u0.C10781l;
import p393v0.C11076z;
import p393v0.Color;
import p433x0.DrawScope;
import p433x0.InterfaceC12239d;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.C10578u;
import td.InterfaceC10524i0;
import td.InterfaceC10568s;
import td.InterfaceC10574t1;

/* renamed from: e0.g */
/* loaded from: classes.dex */
public final class RippleAnimation {

    /* renamed from: a */
    private C10774f f13655a;

    /* renamed from: b */
    private final float f13656b;

    /* renamed from: c */
    private final boolean f13657c;

    /* renamed from: d */
    private Float f13658d;

    /* renamed from: e */
    private Float f13659e;

    /* renamed from: f */
    private C10774f f13660f;

    /* renamed from: g */
    private final Animatable f13661g;

    /* renamed from: h */
    private final Animatable f13662h;

    /* renamed from: i */
    private final Animatable f13663i;

    /* renamed from: j */
    private final InterfaceC10568s f13664j;

    /* renamed from: k */
    private final InterfaceC5220m0 f13665k;

    /* renamed from: l */
    private final InterfaceC5220m0 f13666l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleAnimation.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.RippleAnimation", m20196f = "RippleAnimation.kt", m20195l = {80, 82, 83}, m20194m = "animate")
    /* renamed from: e0.g$a */
    /* loaded from: classes.dex */
    public static final class C4915a extends AbstractC6757d {

        /* renamed from: w */
        Object f13667w;

        /* renamed from: x */
        /* synthetic */ Object f13668x;

        /* renamed from: z */
        int f13670z;

        C4915a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13668x = obj;
            this.f13670z |= Integer.MIN_VALUE;
            return RippleAnimation.this.m26291d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleAnimation.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", m20196f = "RippleAnimation.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: e0.g$b */
    /* loaded from: classes.dex */
    public static final class C4916b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13671x;

        /* renamed from: y */
        private /* synthetic */ Object f13672y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", m20196f = "RippleAnimation.kt", m20195l = {89}, m20194m = "invokeSuspend")
        /* renamed from: e0.g$b$a */
        /* loaded from: classes.dex */
        public static final class C4917a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f13674x;

            /* renamed from: y */
            final /* synthetic */ RippleAnimation f13675y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4917a(RippleAnimation rippleAnimation, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f13675y = rippleAnimation;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C4917a(this.f13675y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C4917a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f13674x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Animatable m26294a = RippleAnimation.m26294a(this.f13675y);
                    Float m20200b = C6755b.m20200b(1.0f);
                    C9978p0 m9564f = AnimationSpec.m9564f(75, 0, C10019z.m9388b(), 2, null);
                    this.f13674x = 1;
                    if (Animatable.m9653f(m26294a, m20200b, m9564f, null, null, this, 12, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", m20196f = "RippleAnimation.kt", m20195l = {C0868i.f2978v0}, m20194m = "invokeSuspend")
        /* renamed from: e0.g$b$b */
        /* loaded from: classes.dex */
        public static final class C4918b extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f13676x;

            /* renamed from: y */
            final /* synthetic */ RippleAnimation f13677y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4918b(RippleAnimation rippleAnimation, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f13677y = rippleAnimation;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C4918b(this.f13677y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C4918b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f13676x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Animatable m26292c = RippleAnimation.m26292c(this.f13677y);
                    Float m20200b = C6755b.m20200b(1.0f);
                    C9978p0 m9564f = AnimationSpec.m9564f(225, 0, C10019z.m9389a(), 2, null);
                    this.f13676x = 1;
                    if (Animatable.m9653f(m26292c, m20200b, m9564f, null, null, this, 12, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", m20196f = "RippleAnimation.kt", m20195l = {C0868i.f2743B0}, m20194m = "invokeSuspend")
        /* renamed from: e0.g$b$c */
        /* loaded from: classes.dex */
        public static final class C4919c extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f13678x;

            /* renamed from: y */
            final /* synthetic */ RippleAnimation f13679y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4919c(RippleAnimation rippleAnimation, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f13679y = rippleAnimation;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C4919c(this.f13679y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C4919c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f13678x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Animatable m26293b = RippleAnimation.m26293b(this.f13679y);
                    Float m20200b = C6755b.m20200b(1.0f);
                    C9978p0 m9564f = AnimationSpec.m9564f(225, 0, C10019z.m9388b(), 2, null);
                    this.f13678x = 1;
                    if (Animatable.m9653f(m26293b, m20200b, m9564f, null, null, this, 12, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        C4916b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C4916b c4916b = new C4916b(interfaceC1886d);
            c4916b.f13672y = obj;
            return c4916b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4916b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            InterfaceC10574t1 m20158d;
            C2116d.m34636d();
            if (this.f13671x == 0) {
                C13186n.m1453b(obj);
                InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f13672y;
                C6772d.m20158d(interfaceC10524i0, null, null, new C4917a(RippleAnimation.this, null), 3, null);
                C6772d.m20158d(interfaceC10524i0, null, null, new C4918b(RippleAnimation.this, null), 3, null);
                m20158d = C6772d.m20158d(interfaceC10524i0, null, null, new C4919c(RippleAnimation.this, null), 3, null);
                return m20158d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleAnimation.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", m20196f = "RippleAnimation.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: e0.g$c */
    /* loaded from: classes.dex */
    public static final class C4920c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13680x;

        /* renamed from: y */
        private /* synthetic */ Object f13681y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RippleAnimation.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", m20196f = "RippleAnimation.kt", m20195l = {112}, m20194m = "invokeSuspend")
        /* renamed from: e0.g$c$a */
        /* loaded from: classes.dex */
        public static final class C4921a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f13683x;

            /* renamed from: y */
            final /* synthetic */ RippleAnimation f13684y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4921a(RippleAnimation rippleAnimation, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f13684y = rippleAnimation;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C4921a(this.f13684y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C4921a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f13683x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Animatable m26294a = RippleAnimation.m26294a(this.f13684y);
                    Float m20200b = C6755b.m20200b(0.0f);
                    C9978p0 m9564f = AnimationSpec.m9564f(150, 0, C10019z.m9388b(), 2, null);
                    this.f13683x = 1;
                    if (Animatable.m9653f(m26294a, m20200b, m9564f, null, null, this, 12, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        C4920c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C4920c c4920c = new C4920c(interfaceC1886d);
            c4920c.f13681y = obj;
            return c4920c;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4920c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            InterfaceC10574t1 m20158d;
            C2116d.m34636d();
            if (this.f13680x == 0) {
                C13186n.m1453b(obj);
                m20158d = C6772d.m20158d((InterfaceC10524i0) this.f13681y, null, null, new C4921a(RippleAnimation.this, null), 3, null);
                return m20158d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private RippleAnimation(C10774f c10774f, float f, boolean z) {
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        this.f13655a = c10774f;
        this.f13656b = f;
        this.f13657c = z;
        this.f13661g = C9937b.m9627b(0.0f, 0.0f, 2, null);
        this.f13662h = C9937b.m9627b(0.0f, 0.0f, 2, null);
        this.f13663i = C9937b.m9627b(0.0f, 0.0f, 2, null);
        this.f13664j = C10578u.m7647a(null);
        Boolean bool = Boolean.FALSE;
        m24962d = C5232o1.m24962d(bool, null, 2, null);
        this.f13665k = m24962d;
        m24962d2 = C5232o1.m24962d(bool, null, 2, null);
        this.f13666l = m24962d2;
    }

    public /* synthetic */ RippleAnimation(C10774f c10774f, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10774f, f, z);
    }

    /* renamed from: a */
    public static final /* synthetic */ Animatable m26294a(RippleAnimation rippleAnimation) {
        return rippleAnimation.f13661g;
    }

    /* renamed from: b */
    public static final /* synthetic */ Animatable m26293b(RippleAnimation rippleAnimation) {
        return rippleAnimation.f13663i;
    }

    /* renamed from: c */
    public static final /* synthetic */ Animatable m26292c(RippleAnimation rippleAnimation) {
        return rippleAnimation.f13662h;
    }

    /* renamed from: f */
    private final Object m26289f(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C4916b(null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }

    /* renamed from: g */
    private final Object m26288g(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C4920c(null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }

    /* renamed from: i */
    private final boolean m26286i() {
        return ((Boolean) this.f13666l.getValue()).booleanValue();
    }

    /* renamed from: j */
    private final boolean m26285j() {
        return ((Boolean) this.f13665k.getValue()).booleanValue();
    }

    /* renamed from: k */
    private final void m26284k(boolean z) {
        this.f13666l.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    private final void m26283l(boolean z) {
        this.f13665k.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26291d(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p071e0.RippleAnimation.C4915a
            if (r0 == 0) goto L13
            r0 = r7
            e0.g$a r0 = (p071e0.RippleAnimation.C4915a) r0
            int r1 = r0.f13670z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13670z = r1
            goto L18
        L13:
            e0.g$a r0 = new e0.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13668x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13670z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            p468yc.C13186n.m1453b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.f13667w
            e0.g r2 = (p071e0.RippleAnimation) r2
            p468yc.C13186n.m1453b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.f13667w
            e0.g r2 = (p071e0.RippleAnimation) r2
            p468yc.C13186n.m1453b(r7)
            goto L56
        L47:
            p468yc.C13186n.m1453b(r7)
            r0.f13667w = r6
            r0.f13670z = r5
            java.lang.Object r7 = r6.m26289f(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.m26283l(r5)
            td.s r7 = r2.f13664j
            r0.f13667w = r2
            r0.f13670z = r4
            java.lang.Object r7 = r7.mo7666h(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.f13667w = r7
            r0.f13670z = r3
            java.lang.Object r7 = r2.m26288g(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p071e0.RippleAnimation.m26291d(bd.d):java.lang.Object");
    }

    /* renamed from: e */
    public final void m26290e(DrawScope drawScope, long j) {
        Float valueOf;
        Intrinsics.isThisObjectNull(drawScope, "$receiver");
        if (this.f13658d == null) {
            this.f13658d = Float.valueOf(C4922h.m26275b(drawScope.m3263a()));
        }
        if (this.f13659e == null) {
            if (Float.isNaN(this.f13656b)) {
                valueOf = Float.valueOf(C4922h.m26276a(drawScope, this.f13657c, drawScope.m3263a()));
            } else {
                valueOf = Float.valueOf(drawScope.m899A(this.f13656b));
            }
            this.f13659e = valueOf;
        }
        if (this.f13655a == null) {
            this.f13655a = C10774f.m7152d(drawScope.m3266Q());
        }
        if (this.f13660f == null) {
            this.f13660f = C10774f.m7152d(C10776g.m7133a(C10781l.m7091i(drawScope.m3263a()) / 2.0f, C10781l.m7093g(drawScope.m3263a()) / 2.0f));
        }
        float floatValue = (!m26286i() || m26285j()) ? ((Number) this.f13661g.m9644o()).floatValue() : 1.0f;
        Float f = this.f13658d;
        Intrinsics.ifNullDoSomething(f);
        float floatValue2 = f.floatValue();
        Float f2 = this.f13659e;
        Intrinsics.ifNullDoSomething(f2);
        float m42133a = C0010a.m42133a(floatValue2, f2.floatValue(), ((Number) this.f13662h.m9644o()).floatValue());
        C10774f c10774f = this.f13655a;
        Intrinsics.ifNullDoSomething(c10774f);
        float m7145k = C10774f.m7145k(c10774f.m7137s());
        C10774f c10774f2 = this.f13660f;
        Intrinsics.ifNullDoSomething(c10774f2);
        float m42133a2 = C0010a.m42133a(m7145k, C10774f.m7145k(c10774f2.m7137s()), ((Number) this.f13663i.m9644o()).floatValue());
        C10774f c10774f3 = this.f13655a;
        Intrinsics.ifNullDoSomething(c10774f3);
        float m7144l = C10774f.m7144l(c10774f3.m7137s());
        C10774f c10774f4 = this.f13660f;
        Intrinsics.ifNullDoSomething(c10774f4);
        long m7133a = C10776g.m7133a(m42133a2, C0010a.m42133a(m7144l, C10774f.m7144l(c10774f4.m7137s()), ((Number) this.f13663i.m9644o()).floatValue()));
        long m6648l = Color.m6648l(j, Color.m6645o(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.f13657c) {
            float m7091i = C10781l.m7091i(drawScope.m3263a());
            float m7093g = C10781l.m7093g(drawScope.m3263a());
            int m6194b = C11076z.f28470a.m6194b();
            InterfaceC12239d m3272B = drawScope.m3272B();
            long mo3276a = m3272B.mo3276a();
            m3272B.mo3275b().m6269h();
            m3272B.mo3274c().mo3246a(0.0f, 0.0f, m7091i, m7093g, m6194b);
            DrawScope.C12241b.m3259a(drawScope, m6648l, m42133a, m7133a, 0.0f, null, null, 0, C4906j.f13390C0, null);
            m3272B.mo3275b().m6270g();
            m3272B.mo3273d(mo3276a);
            return;
        }
        DrawScope.C12241b.m3259a(drawScope, m6648l, m42133a, m7133a, 0.0f, null, null, 0, C4906j.f13390C0, null);
    }

    /* renamed from: h */
    public final void m26287h() {
        m26284k(true);
        this.f13664j.mo7667R(C13195u.f34156a);
    }
}
