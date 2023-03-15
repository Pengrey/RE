package p345s;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AnimationSpec.kt */
/* renamed from: s.p0 */
/* loaded from: classes.dex */
public final class C9978p0<T> implements InterfaceC9936a0 {

    /* renamed from: a */
    private final int f26142a;

    /* renamed from: b */
    private final int f26143b;

    /* renamed from: c */
    private final InterfaceC10016y f26144c;

    public C9978p0() {
        this(0, 0, null, 7, null);
    }

    public C9978p0(int i, int i2, InterfaceC10016y interfaceC10016y) {
        Intrinsics.isThisObjectNull(interfaceC10016y, "easing");
        this.f26142a = i;
        this.f26143b = i2;
        this.f26144c = interfaceC10016y;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9978p0) {
            C9978p0 c9978p0 = (C9978p0) obj;
            return c9978p0.f26142a == this.f26142a && c9978p0.f26143b == this.f26143b && Intrinsics.equals(c9978p0.f26144c, this.f26144c);
        }
        return false;
    }

    /* renamed from: f */
    public C9939b1 mo9570a(InterfaceC9980q0 interfaceC9980q0) {
        Intrinsics.isThisObjectNull(interfaceC9980q0, "converter");
        return new C9939b1(this.f26142a, this.f26143b, this.f26144c);
    }

    public int hashCode() {
        return (((this.f26142a * 31) + this.f26144c.hashCode()) * 31) + this.f26143b;
    }

    public /* synthetic */ C9978p0(int i, int i2, InterfaceC10016y interfaceC10016y, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C10019z.m9389a() : interfaceC10016y);
    }
}
