package p093f1;

import java.util.Objects;
import p181jd.Intrinsics;

/* compiled from: PointerIcon.android.kt */
/* renamed from: f1.b */
/* loaded from: classes.dex */
public final class C5272b implements InterfaceC5310p {

    /* renamed from: a */
    private final int f14547a;

    public C5272b(int i) {
        this.f14547a = i;
    }

    /* renamed from: a */
    public final int m24833a() {
        return this.f14547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.equals(C5272b.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
            return this.f14547a == ((C5272b) obj).f14547a;
        }
        return false;
    }

    public int hashCode() {
        return this.f14547a;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f14547a + ')';
    }
}
