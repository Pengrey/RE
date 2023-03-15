package p455y;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p345s.Animatable;
import p345s.C9964m;
import p345s.C9983s0;
import p479z1.C13612k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.z */
/* loaded from: classes.dex */
public final class C13056z {

    /* renamed from: a */
    private int f33944a;

    /* renamed from: b */
    private final Animatable<C13612k, C9964m> f33945b;

    /* renamed from: c */
    private long f33946c;

    /* renamed from: d */
    private final InterfaceC5220m0 f33947d;

    private C13056z(long j, int i) {
        InterfaceC5220m0 m24962d;
        this.f33944a = i;
        this.f33945b = new Animatable<>(C13612k.m845b(j), C9983s0.m9448i(C13612k.f34607b), null, 4, null);
        this.f33946c = j;
        m24962d = C5232o1.m24962d(Boolean.FALSE, null, 2, null);
        this.f33947d = m24962d;
    }

    public /* synthetic */ C13056z(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    /* renamed from: a */
    public final Animatable<C13612k, C9964m> m1780a() {
        return this.f33945b;
    }

    /* renamed from: b */
    public final boolean m1779b() {
        return ((Boolean) this.f33947d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final int m1778c() {
        return this.f33944a;
    }

    /* renamed from: d */
    public final long m1777d() {
        return this.f33946c;
    }

    /* renamed from: e */
    public final void m1776e(boolean z) {
        this.f33947d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void m1775f(int i) {
        this.f33944a = i;
    }

    /* renamed from: g */
    public final void m1774g(long j) {
        this.f33946c = j;
    }
}
