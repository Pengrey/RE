package p372u;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.C6446v;
import p345s.AnimationSpec;
import p345s.InterfaceC9950h;
import p345s.SuspendAnimation;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: u.b0 */
/* loaded from: classes.dex */
public final class C10648b0 {

    /* compiled from: ScrollExtensions.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m20196f = "ScrollExtensions.kt", m20195l = {40}, m20194m = "animateScrollBy")
    /* renamed from: u.b0$a */
    /* loaded from: classes.dex */
    public static final class C10649a extends AbstractC6757d {

        /* renamed from: w */
        Object f27440w;

        /* renamed from: x */
        /* synthetic */ Object f27441x;

        /* renamed from: y */
        int f27442y;

        C10649a(InterfaceC1886d<? super C10649a> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27441x = obj;
            this.f27442y |= Integer.MIN_VALUE;
            return C10648b0.m7400a(null, 0.0f, null, this);
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", m20196f = "ScrollExtensions.kt", m20195l = {41}, m20194m = "invokeSuspend")
    /* renamed from: u.b0$b */
    /* loaded from: classes.dex */
    public static final class C10650b extends AbstractC6764l implements InterfaceC6112p<InterfaceC10653c0, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: A */
        final /* synthetic */ InterfaceC9950h<Float> f27443A;

        /* renamed from: B */
        final /* synthetic */ C6446v f27444B;

        /* renamed from: x */
        int f27445x;

        /* renamed from: y */
        private /* synthetic */ Object f27446y;

        /* renamed from: z */
        final /* synthetic */ float f27447z;

        /* compiled from: ScrollExtensions.kt */
        /* renamed from: u.b0$b$a */
        /* loaded from: classes.dex */
        public static final class C10651a extends AbstractC6438m implements InterfaceC6112p<Float, Float, C13195u> {

            /* renamed from: w */
            final /* synthetic */ C6446v f27448w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10653c0 f27449x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10651a(C6446v c6446v, InterfaceC10653c0 interfaceC10653c0) {
                super(2);
                this.f27448w = c6446v;
                this.f27449x = interfaceC10653c0;
            }

            @Override // id.InterfaceC6112p
            /* renamed from: F */
            public /* bridge */ /* synthetic */ C13195u mo39856d(Float f, Float f2) {
                m7397a(f.floatValue(), f2.floatValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m7397a(float f, float f2) {
                C6446v c6446v = this.f27448w;
                float f3 = c6446v.f17530w;
                c6446v.f17530w = f3 + this.f27449x.mo7395a(f - f3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10650b(float f, InterfaceC9950h<Float> interfaceC9950h, C6446v c6446v, InterfaceC1886d<? super C10650b> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27447z = f;
            this.f27443A = interfaceC9950h;
            this.f27444B = c6446v;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C10650b c10650b = new C10650b(this.f27447z, this.f27443A, this.f27444B, interfaceC1886d);
            c10650b.f27446y = obj;
            return c10650b;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10653c0 interfaceC10653c0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return ((C10650b) create(interfaceC10653c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27445x;
            if (i == 0) {
                C13186n.m1453b(obj);
                float f = this.f27447z;
                InterfaceC9950h<Float> interfaceC9950h = this.f27443A;
                C10651a c10651a = new C10651a(this.f27444B, (InterfaceC10653c0) this.f27446y);
                this.f27445x = 1;
                if (SuspendAnimation.m9501e(0.0f, f, 0.0f, interfaceC9950h, c10651a, this, 4, null) == m34636d) {
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7400a(p372u.InterfaceC10675f0 r7, float r8, p345s.InterfaceC9950h<java.lang.Float> r9, bd.InterfaceC1886d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof p372u.C10648b0.C10649a
            if (r0 == 0) goto L13
            r0 = r10
            u.b0$a r0 = (p372u.C10648b0.C10649a) r0
            int r1 = r0.f27442y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27442y = r1
            goto L18
        L13:
            u.b0$a r0 = new u.b0$a
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f27441x
            java.lang.Object r0 = cd.C2111b.m34640d()
            int r1 = r4.f27442y
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f27440w
            jd.v r7 = (p181jd.C6446v) r7
            p468yc.C13186n.m1453b(r10)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p468yc.C13186n.m1453b(r10)
            jd.v r10 = new jd.v
            r10.<init>()
            r3 = 0
            u.b0$b r5 = new u.b0$b
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f27440w = r10
            r4.f27442y = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = p372u.InterfaceC10675f0.C10676a.m7345a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r10
        L57:
            float r7 = r7.f17530w
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.C6755b.m20200b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10648b0.m7400a(u.f0, float, s.h, bd.d):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m7399b(InterfaceC10675f0 interfaceC10675f0, float f, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC9950h = AnimationSpec.m9566d(0.0f, 0.0f, null, 7, null);
        }
        return m7400a(interfaceC10675f0, f, interfaceC9950h, interfaceC1886d);
    }
}
