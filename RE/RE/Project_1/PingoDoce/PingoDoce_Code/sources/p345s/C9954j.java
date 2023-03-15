package p345s;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p345s.AbstractC9976o;

/* compiled from: AnimationState.kt */
/* renamed from: s.j */
/* loaded from: classes.dex */
public final class C9954j<T, V extends AbstractC9976o> implements InterfaceC5242r1 {

    /* renamed from: A */
    private long f26067A;

    /* renamed from: B */
    private boolean f26068B;

    /* renamed from: w */
    private final InterfaceC9980q0 f26069w;

    /* renamed from: x */
    private final InterfaceC5220m0 f26070x;

    /* renamed from: y */
    private AbstractC9976o f26071y;

    /* renamed from: z */
    private long f26072z;

    public C9954j(InterfaceC9980q0 interfaceC9980q0, Object obj, AbstractC9976o abstractC9976o, long j, long j2, boolean z) {
        InterfaceC5220m0 m24962d;
        Intrinsics.isThisObjectNull(interfaceC9980q0, "typeConverter");
        this.f26069w = interfaceC9980q0;
        m24962d = C5232o1.m24962d(obj, null, 2, null);
        this.f26070x = m24962d;
        AbstractC9976o m9473b = abstractC9976o != null ? AnimationVectors.m9473b(abstractC9976o) : null;
        this.f26071y = m9473b == null ? C9960k.m9527e(interfaceC9980q0, obj) : m9473b;
        this.f26072z = j;
        this.f26067A = j2;
        this.f26068B = z;
    }

    /* renamed from: b */
    public final long m9554b() {
        return this.f26067A;
    }

    /* renamed from: e */
    public final long m9553e() {
        return this.f26072z;
    }

    /* renamed from: f */
    public final InterfaceC9980q0 m9552f() {
        return this.f26069w;
    }

    /* renamed from: g */
    public final AbstractC9976o m9551g() {
        return this.f26071y;
    }

    public Object getValue() {
        return this.f26070x.getValue();
    }

    /* renamed from: h */
    public final boolean m9550h() {
        return this.f26068B;
    }

    /* renamed from: i */
    public final void m9549i(long j) {
        this.f26067A = j;
    }

    /* renamed from: j */
    public final void m9548j(long j) {
        this.f26072z = j;
    }

    /* renamed from: k */
    public final void m9547k(boolean z) {
        this.f26068B = z;
    }

    /* renamed from: l */
    public void m9546l(Object obj) {
        this.f26070x.setValue(obj);
    }

    /* renamed from: m */
    public final void m9545m(AbstractC9976o abstractC9976o) {
        Intrinsics.isThisObjectNull(abstractC9976o, "<set-?>");
        this.f26071y = abstractC9976o;
    }

    public /* synthetic */ C9954j(InterfaceC9980q0 interfaceC9980q0, Object obj, AbstractC9976o abstractC9976o, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC9980q0, obj, (i & 4) != 0 ? null : abstractC9976o, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
