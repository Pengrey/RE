package p001a0;

import p181jd.Intrinsics;
import p373u0.C10771b;
import p373u0.C10783m;
import p373u0.Rect;
import p373u0.RoundRect;
import p393v0.Outline;
import p479z1.EnumC13618o;

/* renamed from: a0.f */
/* loaded from: classes.dex */
public final class RoundedCornerShape extends CornerBasedShape {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerShape(InterfaceC0002b interfaceC0002b, InterfaceC0002b interfaceC0002b2, InterfaceC0002b interfaceC0002b3, InterfaceC0002b interfaceC0002b4) {
        super(interfaceC0002b, interfaceC0002b2, interfaceC0002b3, interfaceC0002b4);
        Intrinsics.isThisObjectNull(interfaceC0002b, "topStart");
        Intrinsics.isThisObjectNull(interfaceC0002b2, "topEnd");
        Intrinsics.isThisObjectNull(interfaceC0002b3, "bottomEnd");
        Intrinsics.isThisObjectNull(interfaceC0002b4, "bottomStart");
    }

    /* renamed from: b */
    public Outline m42193b(long j, float f, float f2, float f3, float f4, EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        if (((f + f2) + f3) + f4 == 0.0f) {
            return new Outline.C11040b(C10783m.m7083c(j));
        }
        Rect m7083c = C10783m.m7083c(j);
        EnumC13618o enumC13618o2 = EnumC13618o.Ltr;
        return new Outline.C11041c(RoundRect.m7102b(m7083c, C10771b.m7169b(enumC13618o == enumC13618o2 ? f : f2, 0.0f, 2, null), C10771b.m7169b(enumC13618o == enumC13618o2 ? f2 : f, 0.0f, 2, null), C10771b.m7169b(enumC13618o == enumC13618o2 ? f3 : f4, 0.0f, 2, null), C10771b.m7169b(enumC13618o == enumC13618o2 ? f4 : f3, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedCornerShape) {
            RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj;
            return Intrinsics.equals(m42200f(), roundedCornerShape.m42200f()) && Intrinsics.equals(m42201e(), roundedCornerShape.m42201e()) && Intrinsics.equals(m42203c(), roundedCornerShape.m42203c()) && Intrinsics.equals(m42202d(), roundedCornerShape.m42202d());
        }
        return false;
    }

    public int hashCode() {
        return (((((m42200f().hashCode() * 31) + m42201e().hashCode()) * 31) + m42203c().hashCode()) * 31) + m42202d().hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + m42200f() + ", topEnd = " + m42201e() + ", bottomEnd = " + m42203c() + ", bottomStart = " + m42202d() + ')';
    }
}
