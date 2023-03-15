package p001a0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p479z1.C13605g;
import p479z1.Density;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CornerSize.kt */
/* renamed from: a0.d */
/* loaded from: classes.dex */
public final class C0004d implements InterfaceC0002b {

    /* renamed from: a */
    private final float f12a;

    private C0004d(float f) {
        this.f12a = f;
    }

    public /* synthetic */ C0004d(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: a */
    public float mo42199a(long j, Density density) {
        Intrinsics.isThisObjectNull(density, "density");
        return density.m899A(this.f12a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0004d) && C13605g.m873i(this.f12a, ((C0004d) obj).f12a);
    }

    public int hashCode() {
        return C13605g.m872j(this.f12a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f12a + ".dp)";
    }
}
