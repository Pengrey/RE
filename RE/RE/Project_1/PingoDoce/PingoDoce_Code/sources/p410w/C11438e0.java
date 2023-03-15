package p410w;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: Row.kt */
/* renamed from: w.e0 */
/* loaded from: classes.dex */
public final class C11438e0 implements InterfaceC11428d0 {

    /* renamed from: a */
    public static final C11438e0 f29332a = new C11438e0();

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.e0$a */
    /* loaded from: classes.dex */
    public static final class C11439a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f29333w;

        /* renamed from: x */
        final /* synthetic */ boolean f29334x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11439a(float f, boolean z) {
            super(1);
            this.f29333w = f;
            this.f29334x = z;
        }

        /* renamed from: a */
        public final void m5109a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("weight");
            c0816w0.m39490c(Float.valueOf(this.f29333w));
            c0816w0.m39492a().m39649b("weight", Float.valueOf(this.f29333w));
            c0816w0.m39492a().m39649b("fill", Boolean.valueOf(this.f29334x));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5109a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    private C11438e0() {
    }

    /* renamed from: a */
    public InterfaceC9570f mo5128a(InterfaceC9570f interfaceC9570f, float f, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        if (((double) f) > 0.0d) {
            return interfaceC9570f.mo7205u(new C11487r(f, z, C0812v0.m39495c() ? new C11439a(f, z) : C0812v0.m39497a()));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }
}
