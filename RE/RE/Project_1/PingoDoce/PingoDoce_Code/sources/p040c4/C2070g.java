package p040c4;

import p026b4.C1800d;
import p026b4.C1804h;

/* renamed from: c4.g */
/* loaded from: classes.dex */
public class C2070g {

    /* renamed from: a */
    private final EnumC2071a f6007a;

    /* renamed from: b */
    private final C1804h f6008b;

    /* renamed from: c */
    private final C1800d f6009c;

    /* renamed from: d */
    private final boolean f6010d;

    /* compiled from: Mask.java */
    /* renamed from: c4.g$a */
    /* loaded from: classes.dex */
    public enum EnumC2071a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C2070g(EnumC2071a enumC2071a, C1804h c1804h, C1800d c1800d, boolean z) {
        this.f6007a = enumC2071a;
        this.f6008b = c1804h;
        this.f6009c = c1800d;
        this.f6010d = z;
    }

    /* renamed from: a */
    public EnumC2071a m34763a() {
        return this.f6007a;
    }

    /* renamed from: b */
    public C1804h m34762b() {
        return this.f6008b;
    }

    /* renamed from: c */
    public C1800d m34761c() {
        return this.f6009c;
    }

    /* renamed from: d */
    public boolean m34760d() {
        return this.f6010d;
    }
}
