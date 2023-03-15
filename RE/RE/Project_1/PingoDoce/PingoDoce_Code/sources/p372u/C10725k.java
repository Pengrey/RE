package p372u;

import bd.InterfaceC1886d;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.InterfaceC5220m0;
import p181jd.Intrinsics;
import p392v.InterfaceC10987m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
/* renamed from: u.k */
/* loaded from: classes.dex */
public final class C10725k {

    /* renamed from: a */
    private final InterfaceC6113q f27714a;

    /* renamed from: b */
    private final InterfaceC6113q f27715b;

    /* renamed from: c */
    private final InterfaceC5220m0 f27716c;

    /* renamed from: d */
    private final InterfaceC10987m f27717d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragLogic", m20196f = "Draggable.kt", m20195l = {402, 405}, m20194m = "processDragCancel")
    /* renamed from: u.k$a */
    /* loaded from: classes.dex */
    public static final class C10726a extends AbstractC6757d {

        /* renamed from: A */
        int f27718A;

        /* renamed from: w */
        Object f27719w;

        /* renamed from: x */
        Object f27720x;

        /* renamed from: y */
        /* synthetic */ Object f27721y;

        C10726a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27721y = obj;
            this.f27718A |= Integer.MIN_VALUE;
            return C10725k.this.m7263e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragLogic", m20196f = "Draggable.kt", m20195l = {384, 387, 389}, m20194m = "processDragStart")
    /* renamed from: u.k$b */
    /* loaded from: classes.dex */
    public static final class C10727b extends AbstractC6757d {

        /* renamed from: A */
        /* synthetic */ Object f27723A;

        /* renamed from: C */
        int f27725C;

        /* renamed from: w */
        Object f27726w;

        /* renamed from: x */
        Object f27727x;

        /* renamed from: y */
        Object f27728y;

        /* renamed from: z */
        Object f27729z;

        C10727b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27723A = obj;
            this.f27725C |= Integer.MIN_VALUE;
            return C10725k.this.m7262f(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DragLogic", m20196f = "Draggable.kt", m20195l = {394, 397}, m20194m = "processDragStop")
    /* renamed from: u.k$c */
    /* loaded from: classes.dex */
    public static final class C10728c extends AbstractC6757d {

        /* renamed from: B */
        int f27731B;

        /* renamed from: w */
        Object f27732w;

        /* renamed from: x */
        Object f27733x;

        /* renamed from: y */
        Object f27734y;

        /* renamed from: z */
        /* synthetic */ Object f27735z;

        C10728c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27735z = obj;
            this.f27731B |= Integer.MIN_VALUE;
            return C10725k.this.m7261g(null, null, this);
        }
    }

    public C10725k(InterfaceC6113q interfaceC6113q, InterfaceC6113q interfaceC6113q2, InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
        Intrinsics.isThisObjectNull(interfaceC6113q, "onDragStarted");
        Intrinsics.isThisObjectNull(interfaceC6113q2, "onDragStopped");
        Intrinsics.isThisObjectNull(interfaceC5220m0, "dragStartInteraction");
        this.f27714a = interfaceC6113q;
        this.f27715b = interfaceC6113q2;
        this.f27716c = interfaceC5220m0;
        this.f27717d = interfaceC10987m;
    }

    /* renamed from: a */
    public final InterfaceC5220m0 m7267a() {
        return this.f27716c;
    }

    /* renamed from: b */
    public final InterfaceC10987m m7266b() {
        return this.f27717d;
    }

    /* renamed from: c */
    public final InterfaceC6113q m7265c() {
        return this.f27714a;
    }

    /* renamed from: d */
    public final InterfaceC6113q m7264d() {
        return this.f27715b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[RETURN] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7263e(td.InterfaceC10524i0 r8, bd.InterfaceC1886d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p372u.C10725k.C10726a
            if (r0 == 0) goto L13
            r0 = r9
            u.k$a r0 = (p372u.C10725k.C10726a) r0
            int r1 = r0.f27718A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27718A = r1
            goto L18
        L13:
            u.k$a r0 = new u.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27721y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27718A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p468yc.C13186n.m1453b(r9)
            goto L89
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f27720x
            td.i0 r8 = (td.InterfaceC10524i0) r8
            java.lang.Object r2 = r0.f27719w
            u.k r2 = (p372u.C10725k) r2
            p468yc.C13186n.m1453b(r9)
            goto L6c
        L41:
            p468yc.C13186n.m1453b(r9)
            f0.m0 r9 = r7.m7267a()
            java.lang.Object r9 = r9.getValue()
            v.b r9 = (p392v.C10974b) r9
            if (r9 != 0) goto L52
            r2 = r7
            goto L73
        L52:
            v.m r2 = r7.m7266b()
            if (r2 != 0) goto L5a
        L58:
            r2 = r7
            goto L6c
        L5a:
            v.a r6 = new v.a
            r6.<init>(r9)
            r0.f27719w = r7
            r0.f27720x = r8
            r0.f27718A = r4
            java.lang.Object r9 = r2.mo6672a(r6, r0)
            if (r9 != r1) goto L58
            return r1
        L6c:
            f0.m0 r9 = r2.m7267a()
            r9.setValue(r5)
        L73:
            id.q r9 = r2.m7264d()
            r2 = 0
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.C6755b.m20200b(r2)
            r0.f27719w = r5
            r0.f27720x = r5
            r0.f27718A = r3
            java.lang.Object r8 = r9.mo4533i(r8, r2, r0)
            if (r8 != r1) goto L89
            return r1
        L89:
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10725k.m7263e(td.i0, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0 A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7262f(td.InterfaceC10524i0 r8, p372u.AbstractC10690i.C10693c r9, bd.InterfaceC1886d r10) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10725k.m7262f(td.i0, u.i$c, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7261g(td.InterfaceC10524i0 r9, p372u.AbstractC10690i.C10694d r10, bd.InterfaceC1886d r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p372u.C10725k.C10728c
            if (r0 == 0) goto L13
            r0 = r11
            u.k$c r0 = (p372u.C10725k.C10728c) r0
            int r1 = r0.f27731B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27731B = r1
            goto L18
        L13:
            u.k$c r0 = new u.k$c
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f27735z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27731B
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            p468yc.C13186n.m1453b(r11)
            goto L98
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.f27734y
            u.i$d r9 = (p372u.AbstractC10690i.C10694d) r9
            java.lang.Object r10 = r0.f27733x
            td.i0 r10 = (td.InterfaceC10524i0) r10
            java.lang.Object r2 = r0.f27732w
            u.k r2 = (p372u.C10725k) r2
            p468yc.C13186n.m1453b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L76
        L49:
            p468yc.C13186n.m1453b(r11)
            f0.m0 r11 = r8.m7267a()
            java.lang.Object r11 = r11.getValue()
            v.b r11 = (p392v.C10974b) r11
            if (r11 != 0) goto L5a
            r2 = r8
            goto L7d
        L5a:
            v.m r2 = r8.m7266b()
            if (r2 != 0) goto L62
        L60:
            r2 = r8
            goto L76
        L62:
            v.c r6 = new v.c
            r6.<init>(r11)
            r0.f27732w = r8
            r0.f27733x = r9
            r0.f27734y = r10
            r0.f27731B = r4
            java.lang.Object r11 = r2.mo6672a(r6, r0)
            if (r11 != r1) goto L60
            return r1
        L76:
            f0.m0 r11 = r2.m7267a()
            r11.setValue(r5)
        L7d:
            id.q r11 = r2.m7264d()
            float r10 = r10.m7311a()
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C6755b.m20200b(r10)
            r0.f27732w = r5
            r0.f27733x = r5
            r0.f27734y = r5
            r0.f27731B = r3
            java.lang.Object r9 = r11.mo4533i(r9, r10, r0)
            if (r9 != r1) goto L98
            return r1
        L98:
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10725k.m7261g(td.i0, u.i$d, bd.d):java.lang.Object");
    }
}
