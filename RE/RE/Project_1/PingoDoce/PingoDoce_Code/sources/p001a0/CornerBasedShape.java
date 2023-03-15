package p001a0;

import p181jd.Intrinsics;
import p373u0.C10781l;
import p393v0.InterfaceC11001b1;
import p393v0.Outline;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements InterfaceC11001b1 {

    /* renamed from: a */
    private final InterfaceC0002b f8a;

    /* renamed from: b */
    private final InterfaceC0002b f9b;

    /* renamed from: c */
    private final InterfaceC0002b f10c;

    /* renamed from: d */
    private final InterfaceC0002b f11d;

    public CornerBasedShape(InterfaceC0002b interfaceC0002b, InterfaceC0002b interfaceC0002b2, InterfaceC0002b interfaceC0002b3, InterfaceC0002b interfaceC0002b4) {
        Intrinsics.isThisObjectNull(interfaceC0002b, "topStart");
        Intrinsics.isThisObjectNull(interfaceC0002b2, "topEnd");
        Intrinsics.isThisObjectNull(interfaceC0002b3, "bottomEnd");
        Intrinsics.isThisObjectNull(interfaceC0002b4, "bottomStart");
        this.f8a = interfaceC0002b;
        this.f9b = interfaceC0002b2;
        this.f10c = interfaceC0002b3;
        this.f11d = interfaceC0002b4;
    }

    /* renamed from: a */
    public final Outline mo6599a(long j, EnumC13618o enumC13618o, Density density) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        Intrinsics.isThisObjectNull(density, "density");
        float mo42199a = this.f8a.mo42199a(j, density);
        float mo42199a2 = this.f9b.mo42199a(j, density);
        float mo42199a3 = this.f10c.mo42199a(j, density);
        float mo42199a4 = this.f11d.mo42199a(j, density);
        float m7092h = C10781l.m7092h(j);
        float f = mo42199a + mo42199a4;
        if (f > m7092h) {
            float f2 = m7092h / f;
            mo42199a *= f2;
            mo42199a4 *= f2;
        }
        float f3 = mo42199a4;
        float f4 = mo42199a2 + mo42199a3;
        if (f4 > m7092h) {
            float f5 = m7092h / f4;
            mo42199a2 *= f5;
            mo42199a3 *= f5;
        }
        if (mo42199a >= 0.0f && mo42199a2 >= 0.0f && mo42199a3 >= 0.0f && f3 >= 0.0f) {
            return m42204b(j, mo42199a, mo42199a2, mo42199a3, f3, enumC13618o);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo42199a + ", topEnd = " + mo42199a2 + ", bottomEnd = " + mo42199a3 + ", bottomStart = " + f3 + ")!").toString());
    }

    /* renamed from: b */
    public abstract Outline m42204b(long j, float f, float f2, float f3, float f4, EnumC13618o enumC13618o);

    /* renamed from: c */
    public final InterfaceC0002b m42203c() {
        return this.f10c;
    }

    /* renamed from: d */
    public final InterfaceC0002b m42202d() {
        return this.f11d;
    }

    /* renamed from: e */
    public final InterfaceC0002b m42201e() {
        return this.f9b;
    }

    /* renamed from: f */
    public final InterfaceC0002b m42200f() {
        return this.f8a;
    }
}
