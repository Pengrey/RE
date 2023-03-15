package p372u;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p093f1.C5318u;
import p093f1.InterfaceC5274c;
import p093f1.InterfaceC5276c0;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: u.q */
/* loaded from: classes.dex */
public final class ForEachGesture {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForEachGesture.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", m20196f = "ForEachGesture.kt", m20195l = {66}, m20194m = "invokeSuspend")
    /* renamed from: u.q$a */
    /* loaded from: classes.dex */
    public static final class C10755a extends AbstractC6763k implements InterfaceC6112p {

        /* renamed from: x */
        int f27828x;

        /* renamed from: y */
        private /* synthetic */ Object f27829y;

        C10755a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10755a c10755a = new C10755a(interfaceC1886d);
            c10755a.f27829y = obj;
            return c10755a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
            return ((C10755a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27828x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f27828x = 1;
                if (ForEachGesture.m7216b((InterfaceC5274c) this.f27829y, this) == m34636d) {
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
    /* compiled from: ForEachGesture.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ForEachGestureKt", m20196f = "ForEachGesture.kt", m20195l = {75}, m20194m = "awaitAllPointersUp")
    /* renamed from: u.q$b */
    /* loaded from: classes.dex */
    public static final class C10756b extends AbstractC6757d {

        /* renamed from: w */
        Object f27830w;

        /* renamed from: x */
        /* synthetic */ Object f27831x;

        /* renamed from: y */
        int f27832y;

        C10756b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27831x = obj;
            this.f27832y |= Integer.MIN_VALUE;
            return ForEachGesture.m7216b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForEachGesture.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ForEachGestureKt", m20196f = "ForEachGesture.kt", m20195l = {41, 44, 48}, m20194m = "forEachGesture")
    /* renamed from: u.q$c */
    /* loaded from: classes.dex */
    public static final class C10757c extends AbstractC6757d {

        /* renamed from: A */
        int f27833A;

        /* renamed from: w */
        Object f27834w;

        /* renamed from: x */
        Object f27835x;

        /* renamed from: y */
        Object f27836y;

        /* renamed from: z */
        /* synthetic */ Object f27837z;

        C10757c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27837z = obj;
            this.f27833A |= Integer.MIN_VALUE;
            return ForEachGesture.m7214d(null, null, this);
        }
    }

    /* renamed from: a */
    public static final boolean m7217a(InterfaceC5274c interfaceC5274c) {
        Intrinsics.isThisObjectNull(interfaceC5274c, "<this>");
        List m24707b = interfaceC5274c.mo24822w().m24707b();
        int size = m24707b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            int i2 = i + 1;
            if (((C5318u) m24707b.get(i)).m24650i()) {
                z = true;
                break;
            }
            i = i2;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (m7217a(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        r8 = androidx.compose.p018ui.input.pointer.EnumC0662a.Final;
        r0.f27830w = r7;
        r0.f27832y = 1;
        r8 = r7.mo24823b0(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        return p468yc.C13195u.f34156a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7216b(p093f1.InterfaceC5274c r7, bd.InterfaceC1886d r8) {
        /*
            boolean r0 = r8 instanceof p372u.ForEachGesture.C10756b
            if (r0 == 0) goto L13
            r0 = r8
            u.q$b r0 = (p372u.ForEachGesture.C10756b) r0
            int r1 = r0.f27832y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27832y = r1
            goto L18
        L13:
            u.q$b r0 = new u.q$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27831x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27832y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f27830w
            f1.c r7 = (p093f1.InterfaceC5274c) r7
            p468yc.C13186n.m1453b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p468yc.C13186n.m1453b(r8)
            boolean r8 = m7217a(r7)
            if (r8 != 0) goto L6d
        L3e:
            androidx.compose.ui.input.pointer.a r8 = androidx.compose.p018ui.input.pointer.EnumC0662a.Final
            r0.f27830w = r7
            r0.f27832y = r3
            java.lang.Object r8 = r7.mo24823b0(r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            f1.m r8 = (p093f1.C5306m) r8
            java.util.List r8 = r8.m24707b()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L57:
            if (r5 >= r2) goto L6b
            int r6 = r5 + 1
            java.lang.Object r5 = r8.get(r5)
            f1.u r5 = (p093f1.C5318u) r5
            boolean r5 = r5.m24650i()
            if (r5 == 0) goto L69
            r4 = r3
            goto L6b
        L69:
            r5 = r6
            goto L57
        L6b:
            if (r4 != 0) goto L3e
        L6d:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.ForEachGesture.m7216b(f1.c, bd.d):java.lang.Object");
    }

    /* renamed from: c */
    public static final Object m7215c(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo24820Z = interfaceC5276c0.mo24820Z(new C10755a(null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo24820Z == m34636d ? mo24820Z : C13195u.f34156a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(6:17|18|19|20|21|(3:25|26|(1:28)(7:29|30|(1:32)|19|20|21|(2:23|24)(0)))(0)))(8:44|45|30|(0)|19|20|21|(0)(0)))(3:46|21|(0)(0))))|49|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        r7 = r9;
        r9 = r8;
        r8 = r10;
        r10 = r7;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
        r0.f27834w = r8;
        r0.f27835x = null;
        r0.f27836y = null;
        r0.f27833A = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (m7215c(r2, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
        r8 = r9;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        throw r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [f1.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v13, types: [bd.g] */
    /* JADX WARN: Type inference failed for: r8v15, types: [bd.g] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [bd.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0092 -> B:18:0x004b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b1 -> B:43:0x00b2). Please submit an issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7214d(p093f1.InterfaceC5276c0 r8, id.InterfaceC6112p r9, bd.InterfaceC1886d r10) {
        /*
            boolean r0 = r10 instanceof p372u.ForEachGesture.C10757c
            if (r0 == 0) goto L13
            r0 = r10
            u.q$c r0 = (p372u.ForEachGesture.C10757c) r0
            int r1 = r0.f27833A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27833A = r1
            goto L18
        L13:
            u.q$c r0 = new u.q$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27837z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27833A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L64
            if (r2 == r5) goto L4e
            if (r2 == r4) goto L3c
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.f27834w
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8
            p468yc.C13186n.m1453b(r10)
            goto Lb0
        L3c:
            java.lang.Object r8 = r0.f27836y
            bd.g r8 = (bd.CoroutineContext) r8
            java.lang.Object r9 = r0.f27835x
            id.p r9 = (id.InterfaceC6112p) r9
            java.lang.Object r2 = r0.f27834w
            f1.c0 r2 = (p093f1.InterfaceC5276c0) r2
            p468yc.C13186n.m1453b(r10)     // Catch: java.util.concurrent.CancellationException -> L5e
        L4b:
            r10 = r9
            goto Lb2
        L4e:
            java.lang.Object r8 = r0.f27836y
            bd.g r8 = (bd.CoroutineContext) r8
            java.lang.Object r9 = r0.f27835x
            id.p r9 = (id.InterfaceC6112p) r9
            java.lang.Object r2 = r0.f27834w
            f1.c0 r2 = (p093f1.InterfaceC5276c0) r2
            p468yc.C13186n.m1453b(r10)     // Catch: java.util.concurrent.CancellationException -> L5e
            goto L86
        L5e:
            r10 = move-exception
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            goto L9a
        L64:
            p468yc.C13186n.m1453b(r10)
            bd.g r10 = r0.getContext()
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
        L6f:
            boolean r2 = td.C10588w1.m7606m(r8)
            if (r2 == 0) goto Lb4
            r0.f27834w = r9     // Catch: java.util.concurrent.CancellationException -> L95
            r0.f27835x = r10     // Catch: java.util.concurrent.CancellationException -> L95
            r0.f27836y = r8     // Catch: java.util.concurrent.CancellationException -> L95
            r0.f27833A = r5     // Catch: java.util.concurrent.CancellationException -> L95
            java.lang.Object r2 = r10.mo39856d(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L95
            if (r2 != r1) goto L84
            return r1
        L84:
            r2 = r9
            r9 = r10
        L86:
            r0.f27834w = r2     // Catch: java.util.concurrent.CancellationException -> L5e
            r0.f27835x = r9     // Catch: java.util.concurrent.CancellationException -> L5e
            r0.f27836y = r8     // Catch: java.util.concurrent.CancellationException -> L5e
            r0.f27833A = r4     // Catch: java.util.concurrent.CancellationException -> L5e
            java.lang.Object r10 = m7215c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L5e
            if (r10 != r1) goto L4b
            return r1
        L95:
            r2 = move-exception
            r7 = r9
            r9 = r8
            r8 = r2
            r2 = r7
        L9a:
            boolean r6 = td.C10588w1.m7606m(r9)
            if (r6 == 0) goto Lb1
            r0.f27834w = r8
            r9 = 0
            r0.f27835x = r9
            r0.f27836y = r9
            r0.f27833A = r3
            java.lang.Object r9 = m7215c(r2, r0)
            if (r9 != r1) goto Lb0
            return r1
        Lb0:
            throw r8
        Lb1:
            r8 = r9
        Lb2:
            r9 = r2
            goto L6f
        Lb4:
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.ForEachGesture.m7214d(f1.c0, id.p, bd.d):java.lang.Object");
    }
}
