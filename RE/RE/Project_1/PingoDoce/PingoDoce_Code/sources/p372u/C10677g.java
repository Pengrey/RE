package p372u;

import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.C6446v;
import p181jd.Intrinsics;
import p345s.AnimationState;
import p345s.InterfaceC10009v;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
/* renamed from: u.g */
/* loaded from: classes.dex */
public final class C10677g implements InterfaceC10754p {

    /* renamed from: a */
    private final InterfaceC10009v f27515a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", m20196f = "Scrollable.kt", m20195l = {401}, m20194m = "performFling")
    /* renamed from: u.g$a */
    /* loaded from: classes.dex */
    public static final class C10678a extends AbstractC6757d {

        /* renamed from: w */
        Object f27516w;

        /* renamed from: x */
        /* synthetic */ Object f27517x;

        /* renamed from: z */
        int f27519z;

        C10678a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27517x = obj;
            this.f27519z |= Integer.MIN_VALUE;
            return C10677g.this.mo7218a(null, 0.0f, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    /* renamed from: u.g$b */
    /* loaded from: classes.dex */
    public static final class C10679b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C6446v f27520w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10653c0 f27521x;

        /* renamed from: y */
        final /* synthetic */ C6446v f27522y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10679b(C6446v c6446v, InterfaceC10653c0 interfaceC10653c0, C6446v c6446v2) {
            super(1);
            this.f27520w = c6446v;
            this.f27521x = interfaceC10653c0;
            this.f27522y = c6446v2;
        }

        /* renamed from: a */
        public final void m7344a(AnimationState animationState) {
            Intrinsics.isThisObjectNull(animationState, "$this$animateDecay");
            float floatValue = ((Number) animationState.m9582e()).floatValue() - this.f27520w.f17530w;
            float mo7395a = this.f27521x.mo7395a(floatValue);
            this.f27520w.f17530w = ((Number) animationState.m9582e()).floatValue();
            this.f27522y.f17530w = ((Number) animationState.m9581f()).floatValue();
            if (Math.abs(floatValue - mo7395a) > 0.5f) {
                animationState.m9586a();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m7344a((AnimationState) obj);
            return C13195u.f34156a;
        }
    }

    public C10677g(InterfaceC10009v interfaceC10009v) {
        Intrinsics.isThisObjectNull(interfaceC10009v, "flingDecay");
        this.f27515a = interfaceC10009v;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo7218a(p372u.InterfaceC10653c0 r18, float r19, bd.InterfaceC1886d r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof p372u.C10677g.C10678a
            if (r2 == 0) goto L17
            r2 = r1
            u.g$a r2 = (p372u.C10677g.C10678a) r2
            int r3 = r2.f27519z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f27519z = r3
            goto L1c
        L17:
            u.g$a r2 = new u.g$a
            r2.<init>(r1)
        L1c:
            r7 = r2
            java.lang.Object r1 = r7.f27517x
            java.lang.Object r2 = cd.C2111b.m34640d()
            int r3 = r7.f27519z
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            java.lang.Object r2 = r7.f27516w
            jd.v r2 = (p181jd.C6446v) r2
            p468yc.C13186n.m1453b(r1)
            goto L82
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            p468yc.C13186n.m1453b(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L85
            jd.v r1 = new jd.v
            r1.<init>()
            r3 = r19
            r1.f17530w = r3
            jd.v r5 = new jd.v
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            s.j r3 = p345s.C9960k.m9530b(r8, r9, r10, r12, r14, r15, r16)
            s.v r6 = r0.f27515a
            r8 = 0
            u.g$b r9 = new u.g$b
            r10 = r18
            r9.<init>(r5, r10, r1)
            r10 = 2
            r11 = 0
            r7.f27516w = r1
            r7.f27519z = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = p345s.SuspendAnimation.m9498h(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L81
            return r2
        L81:
            r2 = r1
        L82:
            float r1 = r2.f17530w
            goto L88
        L85:
            r3 = r19
            r1 = r3
        L88:
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.C6755b.m20200b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10677g.mo7218a(u.c0, float, bd.d):java.lang.Object");
    }
}
