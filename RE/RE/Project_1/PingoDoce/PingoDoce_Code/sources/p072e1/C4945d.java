package p072e1;

import bd.InterfaceC1886d;
import id.InterfaceC6097a;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10774f;
import td.InterfaceC10524i0;

/* compiled from: NestedScrollModifier.kt */
/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class C4945d {

    /* renamed from: a */
    private InterfaceC6097a f13737a = new C4946a();

    /* renamed from: b */
    private InterfaceC10524i0 f13738b;

    /* renamed from: c */
    private NestedScrollModifier f13739c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollModifier.kt */
    /* renamed from: e1.d$a */
    /* loaded from: classes.dex */
    public static final class C4946a extends AbstractC6438m implements InterfaceC6097a {
        C4946a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC10524i0 mo42214q() {
            return C4945d.this.m26204g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollModifier.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m20196f = "NestedScrollModifier.kt", m20195l = {238}, m20194m = "dispatchPostFling-RZ2iAVY")
    /* renamed from: e1.d$b */
    /* loaded from: classes.dex */
    public static final class C4947b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f13741w;

        /* renamed from: y */
        int f13743y;

        C4947b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13741w = obj;
            this.f13743y |= Integer.MIN_VALUE;
            return C4945d.this.m26210a(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollModifier.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m20196f = "NestedScrollModifier.kt", m20195l = {223}, m20194m = "dispatchPreFling-QWom1Mo")
    /* renamed from: e1.d$c */
    /* loaded from: classes.dex */
    public static final class C4948c extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f13744w;

        /* renamed from: y */
        int f13746y;

        C4948c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13744w = obj;
            this.f13746y |= Integer.MIN_VALUE;
            return C4945d.this.m26208c(0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26210a(long r8, long r10, bd.InterfaceC1886d r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof p072e1.C4945d.C4947b
            if (r0 == 0) goto L13
            r0 = r12
            e1.d$b r0 = (p072e1.C4945d.C4947b) r0
            int r1 = r0.f13743y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13743y = r1
            goto L18
        L13:
            e1.d$b r0 = new e1.d$b
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f13741w
            java.lang.Object r0 = cd.C2111b.m34640d()
            int r1 = r6.f13743y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p468yc.C13186n.m1453b(r12)
            goto L48
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            p468yc.C13186n.m1453b(r12)
            e1.a r1 = r7.m26203h()
            if (r1 != 0) goto L3d
            r8 = 0
            goto L4b
        L3d:
            r6.f13743y = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo26211d(r2, r4, r6)
            if (r12 != r0) goto L48
            return r0
        L48:
            r8 = r12
            z1.s r8 = (p479z1.C13624s) r8
        L4b:
            if (r8 != 0) goto L54
            z1.s$a r8 = p479z1.C13624s.f34622b
            long r8 = r8.m773a()
            goto L58
        L54:
            long r8 = r8.m774n()
        L58:
            z1.s r8 = p479z1.C13624s.m786b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e1.C4945d.m26210a(long, long, bd.d):java.lang.Object");
    }

    /* renamed from: b */
    public final long m26209b(long j, long j2, int i) {
        NestedScrollModifier nestedScrollModifier = this.f13739c;
        C10774f m7152d = nestedScrollModifier == null ? null : C10774f.m7152d(nestedScrollModifier.mo26212c(j, j2, i));
        return m7152d == null ? C10774f.f27866b.m7134c() : m7152d.m7137s();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26208c(long r5, bd.InterfaceC1886d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p072e1.C4945d.C4948c
            if (r0 == 0) goto L13
            r0 = r7
            e1.d$c r0 = (p072e1.C4945d.C4948c) r0
            int r1 = r0.f13746y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13746y = r1
            goto L18
        L13:
            e1.d$c r0 = new e1.d$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13744w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13746y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r7)
            e1.a r7 = r4.m26203h()
            if (r7 != 0) goto L3c
            r5 = 0
            goto L48
        L3c:
            r0.f13746y = r3
            java.lang.Object r7 = r7.mo26213b(r5, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r5 = r7
            z1.s r5 = (p479z1.C13624s) r5
        L48:
            if (r5 != 0) goto L51
            z1.s$a r5 = p479z1.C13624s.f34622b
            long r5 = r5.m773a()
            goto L55
        L51:
            long r5 = r5.m774n()
        L55:
            z1.s r5 = p479z1.C13624s.m786b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e1.C4945d.m26208c(long, bd.d):java.lang.Object");
    }

    /* renamed from: d */
    public final long m26207d(long j, int i) {
        NestedScrollModifier nestedScrollModifier = this.f13739c;
        C10774f m7152d = nestedScrollModifier == null ? null : C10774f.m7152d(nestedScrollModifier.mo26214a(j, i));
        return m7152d == null ? C10774f.f27866b.m7134c() : m7152d.m7137s();
    }

    /* renamed from: e */
    public final InterfaceC6097a m26206e() {
        return this.f13737a;
    }

    /* renamed from: f */
    public final InterfaceC10524i0 m26205f() {
        InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f13737a.mo42214q();
        if (interfaceC10524i0 != null) {
            return interfaceC10524i0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* renamed from: g */
    public final InterfaceC10524i0 m26204g() {
        return this.f13738b;
    }

    /* renamed from: h */
    public final NestedScrollModifier m26203h() {
        return this.f13739c;
    }

    /* renamed from: i */
    public final void m26202i(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "<set-?>");
        this.f13737a = interfaceC6097a;
    }

    /* renamed from: j */
    public final void m26201j(InterfaceC10524i0 interfaceC10524i0) {
        this.f13738b = interfaceC10524i0;
    }

    /* renamed from: k */
    public final void m26200k(NestedScrollModifier nestedScrollModifier) {
        this.f13739c = nestedScrollModifier;
    }
}
