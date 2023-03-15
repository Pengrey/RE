package coil.util;

import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1489u;
import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;

/* renamed from: coil.util.-Lifecycles */
/* loaded from: classes.dex */
public final class Lifecycles {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Lifecycles.kt */
    @InterfaceC6759f(m20197c = "coil.util.-Lifecycles", m20196f = "Lifecycles.kt", m20195l = {44}, m20194m = "awaitStarted")
    /* renamed from: coil.util.-Lifecycles$a */
    /* loaded from: classes.dex */
    public static final class C2189a extends AbstractC6757d {

        /* renamed from: w */
        Object f6314w;

        /* renamed from: x */
        Object f6315x;

        /* renamed from: y */
        /* synthetic */ Object f6316y;

        /* renamed from: z */
        int f6317z;

        C2189a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f6316y = obj;
            this.f6317z |= Integer.MIN_VALUE;
            return Lifecycles.m34466a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1, java.lang.Object] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m34466a(androidx.lifecycle.AbstractC1469p r6, bd.InterfaceC1886d r7) {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles.C2189a
            if (r0 == 0) goto L13
            r0 = r7
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.C2189a) r0
            int r1 = r0.f6317z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6317z = r1
            goto L18
        L13:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6316y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f6317z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f6315x
            jd.y r6 = (p181jd.C6449y) r6
            java.lang.Object r0 = r0.f6314w
            androidx.lifecycle.p r0 = (androidx.lifecycle.AbstractC1469p) r0
            p468yc.C13186n.m1453b(r7)     // Catch: java.lang.Throwable -> L31
            goto L85
        L31:
            r7 = move-exception
            goto L96
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            p468yc.C13186n.m1453b(r7)
            androidx.lifecycle.p$c r7 = r6.mo10401b()
            androidx.lifecycle.p$c r2 = androidx.lifecycle.AbstractC1469p.EnumC1472c.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L4d
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L4d:
            jd.y r7 = new jd.y
            r7.<init>()
            r0.f6314w = r6     // Catch: java.lang.Throwable -> L91
            r0.f6315x = r7     // Catch: java.lang.Throwable -> L91
            r0.f6317z = r3     // Catch: java.lang.Throwable -> L91
            td.k r2 = new td.k     // Catch: java.lang.Throwable -> L91
            bd.d r4 = cd.C2111b.m34641c(r0)     // Catch: java.lang.Throwable -> L91
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L91
            r2.m7723y()     // Catch: java.lang.Throwable -> L91
            coil.util.-Lifecycles$awaitStarted$2$1 r3 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch: java.lang.Throwable -> L91
            r3.<init>()     // Catch: java.lang.Throwable -> L91
            r7.f17533w = r3     // Catch: java.lang.Throwable -> L91
            p181jd.Intrinsics.ifNullDoSomething(r3)     // Catch: java.lang.Throwable -> L91
            androidx.lifecycle.u r3 = (androidx.lifecycle.InterfaceC1489u) r3     // Catch: java.lang.Throwable -> L91
            r6.mo10402a(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r2 = r2.m7728t()     // Catch: java.lang.Throwable -> L91
            java.lang.Object r3 = cd.C2111b.m34640d()     // Catch: java.lang.Throwable -> L91
            if (r2 != r3) goto L80
            kotlin.coroutines.jvm.internal.DebugProbes.m20186c(r0)     // Catch: java.lang.Throwable -> L91
        L80:
            if (r2 != r1) goto L83
            return r1
        L83:
            r0 = r6
            r6 = r7
        L85:
            T r6 = r6.f17533w
            androidx.lifecycle.u r6 = (androidx.lifecycle.InterfaceC1489u) r6
            if (r6 == 0) goto L8e
            r0.mo10400c(r6)
        L8e:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L91:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L96:
            T r6 = r6.f17533w
            androidx.lifecycle.u r6 = (androidx.lifecycle.InterfaceC1489u) r6
            if (r6 == 0) goto L9f
            r0.mo10400c(r6)
        L9f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.m34466a(androidx.lifecycle.p, bd.d):java.lang.Object");
    }

    /* renamed from: b */
    public static final void m34465b(AbstractC1469p abstractC1469p, InterfaceC1489u interfaceC1489u) {
        abstractC1469p.mo10400c(interfaceC1489u);
        abstractC1469p.mo10402a(interfaceC1489u);
    }
}
