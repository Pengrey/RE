package p051d0;

import id.InterfaceC6113q;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d0.b0 */
/* loaded from: classes.dex */
public final class SnackbarHost<T> {

    /* renamed from: a */
    private final Object f12211a;

    /* renamed from: b */
    private final InterfaceC6113q f12212b;

    public SnackbarHost(Object obj, InterfaceC6113q interfaceC6113q) {
        Intrinsics.isThisObjectNull(interfaceC6113q, "transition");
        this.f12211a = obj;
        this.f12212b = interfaceC6113q;
    }

    /* renamed from: a */
    public final Object m27284a() {
        return this.f12211a;
    }

    /* renamed from: b */
    public final InterfaceC6113q m27283b() {
        return this.f12212b;
    }

    /* renamed from: c */
    public final Object m27282c() {
        return this.f12211a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SnackbarHost) {
            SnackbarHost snackbarHost = (SnackbarHost) obj;
            return Intrinsics.equals(this.f12211a, snackbarHost.f12211a) && Intrinsics.equals(this.f12212b, snackbarHost.f12212b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f12211a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f12212b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12211a + ", transition=" + this.f12212b + ')';
    }
}
