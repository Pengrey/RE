package p001a0;

import p181jd.Intrinsics;
import p479z1.Density;

/* renamed from: a0.c */
/* loaded from: classes.dex */
public final class CornerSize {

    /* compiled from: CornerSize.kt */
    /* renamed from: a0.c$a */
    /* loaded from: classes.dex */
    public static final class C0003a implements InterfaceC0002b {
        C0003a() {
        }

        /* renamed from: a */
        public float mo42199a(long j, Density density) {
            Intrinsics.isThisObjectNull(density, "density");
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    static {
        new C0003a();
    }

    /* renamed from: a */
    public static final InterfaceC0002b m42198a(int i) {
        return new C0005e(i);
    }

    /* renamed from: b */
    public static final InterfaceC0002b m42197b(float f) {
        return new C0004d(f, null);
    }
}
