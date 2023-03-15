package p372u;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.sync.C6939e;
import kotlinx.coroutines.sync.InterfaceC6930c;
import p181jd.Intrinsics;
import p479z1.Density;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u.z */
/* loaded from: classes.dex */
public final class TapGestureDetector implements InterfaceC10767y, Density {

    /* renamed from: w */
    private final /* synthetic */ Density f27852w;

    /* renamed from: x */
    private boolean f27853x;

    /* renamed from: y */
    private boolean f27854y;

    /* renamed from: z */
    private final InterfaceC6930c f27855z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TapGestureDetector.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m20196f = "TapGestureDetector.kt", m20195l = {328}, m20194m = "tryAwaitRelease")
    /* renamed from: u.z$a */
    /* loaded from: classes.dex */
    public static final class C10768a extends AbstractC6757d {

        /* renamed from: w */
        Object f27856w;

        /* renamed from: x */
        /* synthetic */ Object f27857x;

        /* renamed from: z */
        int f27859z;

        C10768a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27857x = obj;
            this.f27859z |= Integer.MIN_VALUE;
            return TapGestureDetector.this.mo7189W(this);
        }
    }

    public TapGestureDetector(Density density) {
        Intrinsics.isThisObjectNull(density, "density");
        this.f27852w = density;
        this.f27855z = C6939e.m19760a(false);
    }

    /* renamed from: A */
    public float m7188A(float f) {
        return this.f27852w.m899A(f);
    }

    /* renamed from: O */
    public int m7187O(float f) {
        return this.f27852w.m898O(f);
    }

    /* renamed from: U */
    public long m7186U(long j) {
        return this.f27852w.m897U(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo7189W(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p372u.TapGestureDetector.C10768a
            if (r0 == 0) goto L13
            r0 = r5
            u.z$a r0 = (p372u.TapGestureDetector.C10768a) r0
            int r1 = r0.f27859z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27859z = r1
            goto L18
        L13:
            u.z$a r0 = new u.z$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27857x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27859z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27856w
            u.z r0 = (p372u.TapGestureDetector) r0
            p468yc.C13186n.m1453b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            boolean r5 = r4.f27853x
            if (r5 != 0) goto L4e
            boolean r5 = r4.f27854y
            if (r5 != 0) goto L4e
            kotlinx.coroutines.sync.c r5 = r4.f27855z
            r0.f27856w = r4
            r0.f27859z = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.InterfaceC6930c.C6931a.m19773a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            boolean r5 = r0.f27853x
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.TapGestureDetector.mo7189W(bd.d):java.lang.Object");
    }

    /* renamed from: Y */
    public float m7184Y(long j) {
        return this.f27852w.m896Y(j);
    }

    public float getDensity() {
        return this.f27852w.getDensity();
    }

    /* renamed from: i0 */
    public float m7183i0(int i) {
        return this.f27852w.m895i0(i);
    }

    /* renamed from: k */
    public final void m7182k() {
        this.f27854y = true;
        InterfaceC6930c.C6931a.m19771c(this.f27855z, null, 1, null);
    }

    /* renamed from: n */
    public final void m7181n() {
        this.f27853x = true;
        InterfaceC6930c.C6931a.m19771c(this.f27855z, null, 1, null);
    }

    /* renamed from: o */
    public final void m7180o() {
        InterfaceC6930c.C6931a.m19772b(this.f27855z, null, 1, null);
        this.f27853x = false;
        this.f27854y = false;
    }

    /* renamed from: r */
    public float m7179r() {
        return this.f27852w.m894r();
    }
}
