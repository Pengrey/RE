package p072e1;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p373u0.C10774f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedScrollDelegatingWrapper.kt */
/* renamed from: e1.h */
/* loaded from: classes.dex */
public final class C4957h implements NestedScrollModifier {

    /* renamed from: a */
    private NestedScrollModifier f13759a;

    /* renamed from: b */
    private NestedScrollModifier f13760b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollDelegatingWrapper.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection", m20196f = "NestedScrollDelegatingWrapper.kt", m20195l = {187, 188}, m20194m = "onPostFling-RZ2iAVY")
    /* renamed from: e1.h$a */
    /* loaded from: classes.dex */
    public static final class C4958a extends AbstractC6757d {

        /* renamed from: B */
        int f13762B;

        /* renamed from: w */
        Object f13763w;

        /* renamed from: x */
        long f13764x;

        /* renamed from: y */
        long f13765y;

        /* renamed from: z */
        /* synthetic */ Object f13766z;

        C4958a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13766z = obj;
            this.f13762B |= Integer.MIN_VALUE;
            return C4957h.this.mo26211d(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollDelegatingWrapper.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.input.nestedscroll.ParentWrapperNestedScrollConnection", m20196f = "NestedScrollDelegatingWrapper.kt", m20195l = {181, 182}, m20194m = "onPreFling-QWom1Mo")
    /* renamed from: e1.h$b */
    /* loaded from: classes.dex */
    public static final class C4959b extends AbstractC6757d {

        /* renamed from: A */
        int f13767A;

        /* renamed from: w */
        Object f13768w;

        /* renamed from: x */
        long f13769x;

        /* renamed from: y */
        /* synthetic */ Object f13770y;

        C4959b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13770y = obj;
            this.f13767A |= Integer.MIN_VALUE;
            return C4957h.this.mo26213b(0L, this);
        }
    }

    public C4957h(NestedScrollModifier nestedScrollModifier, NestedScrollModifier nestedScrollModifier2) {
        Intrinsics.isThisObjectNull(nestedScrollModifier, "parent");
        Intrinsics.isThisObjectNull(nestedScrollModifier2, "self");
        this.f13759a = nestedScrollModifier;
        this.f13760b = nestedScrollModifier2;
    }

    /* renamed from: a */
    public long mo26214a(long j, int i) {
        long mo26214a = this.f13759a.mo26214a(j, i);
        return C10774f.m7140p(mo26214a, this.f13760b.mo26214a(C10774f.m7141o(j, mo26214a), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo26213b(long r7, bd.InterfaceC1886d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p072e1.C4957h.C4959b
            if (r0 == 0) goto L13
            r0 = r9
            e1.h$b r0 = (p072e1.C4957h.C4959b) r0
            int r1 = r0.f13767A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13767A = r1
            goto L18
        L13:
            e1.h$b r0 = new e1.h$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f13770y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13767A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r7 = r0.f13769x
            p468yc.C13186n.m1453b(r9)
            goto L72
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            long r7 = r0.f13769x
            java.lang.Object r2 = r0.f13768w
            e1.h r2 = (p072e1.C4957h) r2
            p468yc.C13186n.m1453b(r9)
            goto L55
        L40:
            p468yc.C13186n.m1453b(r9)
            e1.a r9 = r6.m26177e()
            r0.f13768w = r6
            r0.f13769x = r7
            r0.f13767A = r4
            java.lang.Object r9 = r9.mo26213b(r7, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            z1.s r9 = (p479z1.C13624s) r9
            long r4 = r9.m774n()
            e1.a r9 = r2.m26176f()
            long r7 = p479z1.C13624s.m777k(r7, r4)
            r2 = 0
            r0.f13768w = r2
            r0.f13769x = r4
            r0.f13767A = r3
            java.lang.Object r9 = r9.mo26213b(r7, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            r7 = r4
        L72:
            z1.s r9 = (p479z1.C13624s) r9
            long r0 = r9.m774n()
            long r7 = p479z1.C13624s.m776l(r7, r0)
            z1.s r7 = p479z1.C13624s.m786b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e1.C4957h.mo26213b(long, bd.d):java.lang.Object");
    }

    /* renamed from: c */
    public long mo26212c(long j, long j2, int i) {
        long mo26212c = this.f13760b.mo26212c(j, j2, i);
        return C10774f.m7140p(mo26212c, this.f13759a.mo26212c(C10774f.m7140p(j, mo26212c), C10774f.m7141o(j2, mo26212c), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo26211d(long r16, long r18, bd.InterfaceC1886d r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof p072e1.C4957h.C4958a
            if (r2 == 0) goto L16
            r2 = r1
            e1.h$a r2 = (p072e1.C4957h.C4958a) r2
            int r3 = r2.f13762B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f13762B = r3
            goto L1b
        L16:
            e1.h$a r2 = new e1.h$a
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f13766z
            java.lang.Object r9 = cd.C2111b.m34640d()
            int r3 = r2.f13762B
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.f13764x
            p468yc.C13186n.m1453b(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.f13765y
            long r5 = r2.f13764x
            java.lang.Object r7 = r2.f13763w
            e1.h r7 = (p072e1.C4957h) r7
            p468yc.C13186n.m1453b(r1)
            r13 = r3
            r11 = r5
            goto L67
        L47:
            p468yc.C13186n.m1453b(r1)
            e1.a r3 = r15.m26176f()
            r2.f13763w = r0
            r11 = r16
            r2.f13764x = r11
            r13 = r18
            r2.f13765y = r13
            r2.f13762B = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.mo26211d(r4, r6, r8)
            if (r1 != r9) goto L66
            return r9
        L66:
            r7 = r0
        L67:
            z1.s r1 = (p479z1.C13624s) r1
            long r4 = r1.m774n()
            e1.a r3 = r7.m26177e()
            long r6 = p479z1.C13624s.m776l(r11, r4)
            long r11 = p479z1.C13624s.m777k(r13, r4)
            r1 = 0
            r2.f13763w = r1
            r2.f13764x = r4
            r2.f13762B = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.mo26211d(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            z1.s r1 = (p479z1.C13624s) r1
            long r4 = r1.m774n()
            long r1 = p479z1.C13624s.m776l(r2, r4)
            z1.s r1 = p479z1.C13624s.m786b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e1.C4957h.mo26211d(long, long, bd.d):java.lang.Object");
    }

    /* renamed from: e */
    public final NestedScrollModifier m26177e() {
        return this.f13759a;
    }

    /* renamed from: f */
    public final NestedScrollModifier m26176f() {
        return this.f13760b;
    }

    /* renamed from: g */
    public final void m26175g(NestedScrollModifier nestedScrollModifier) {
        Intrinsics.isThisObjectNull(nestedScrollModifier, "<set-?>");
        this.f13759a = nestedScrollModifier;
    }

    /* renamed from: h */
    public final void m26174h(NestedScrollModifier nestedScrollModifier) {
        Intrinsics.isThisObjectNull(nestedScrollModifier, "<set-?>");
        this.f13760b = nestedScrollModifier;
    }
}
