package p093f1;

import android.os.Build;
import android.view.PointerIcon;
import java.util.Objects;
import p181jd.Intrinsics;

/* compiled from: PointerIcon.android.kt */
/* renamed from: f1.a */
/* loaded from: classes.dex */
public final class C5270a implements InterfaceC5310p {

    /* renamed from: a */
    private final PointerIcon f14545a;

    /* renamed from: a */
    public final PointerIcon m24842a() {
        return this.f14545a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.equals(C5270a.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
            C5270a c5270a = (C5270a) obj;
            return !(Build.VERSION.SDK_INT < 24 ? this.f14545a != c5270a.f14545a : !Intrinsics.equals(this.f14545a, c5270a.f14545a));
        }
        return false;
    }

    public int hashCode() {
        return this.f14545a.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f14545a + ')';
    }
}
