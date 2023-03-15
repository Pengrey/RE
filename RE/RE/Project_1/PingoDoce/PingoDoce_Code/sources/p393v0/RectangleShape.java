package p393v0;

import p181jd.Intrinsics;
import p373u0.C10783m;
import p393v0.Outline;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: v0.w0 */
/* loaded from: classes.dex */
public final class RectangleShape {

    /* renamed from: a */
    private static final InterfaceC11001b1 f28449a = new C11071a();

    /* compiled from: RectangleShape.kt */
    /* renamed from: v0.w0$a */
    /* loaded from: classes.dex */
    public static final class C11071a implements InterfaceC11001b1 {
        C11071a() {
        }

        /* renamed from: b */
        public Outline.C11040b mo6599a(long j, EnumC13618o enumC13618o, Density density) {
            Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
            Intrinsics.isThisObjectNull(density, "density");
            return new Outline.C11040b(C10783m.m7083c(j));
        }

        public String toString() {
            return "RectangleShape";
        }
    }

    /* renamed from: a */
    public static final InterfaceC11001b1 m6240a() {
        return f28449a;
    }
}
