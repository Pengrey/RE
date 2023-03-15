package p345s;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: AnimationSpec.kt */
/* renamed from: s.m0 */
/* loaded from: classes.dex */
public final class C9965m0<T> implements InterfaceC9936a0 {

    /* renamed from: a */
    private final float f26102a;

    /* renamed from: b */
    private final float f26103b;

    /* renamed from: c */
    private final Object f26104c;

    public C9965m0() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public C9965m0(float f, float f2, Object obj) {
        this.f26102a = f;
        this.f26103b = f2;
        this.f26104c = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9965m0) {
            C9965m0 c9965m0 = (C9965m0) obj;
            if (c9965m0.f26102a == this.f26102a) {
                if ((c9965m0.f26103b == this.f26103b) && Intrinsics.equals(c9965m0.f26104c, this.f26104c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public VectorizedAnimationSpec mo9570a(InterfaceC9980q0 interfaceC9980q0) {
        Intrinsics.isThisObjectNull(interfaceC9980q0, "converter");
        return new VectorizedAnimationSpec(this.f26102a, this.f26103b, AnimationSpec.m9569a(interfaceC9980q0, this.f26104c));
    }

    public int hashCode() {
        Object obj = this.f26104c;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + Float.hashCode(this.f26102a)) * 31) + Float.hashCode(this.f26103b);
    }

    public /* synthetic */ C9965m0(float f, float f2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
