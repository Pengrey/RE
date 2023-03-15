package com.google.zxing;

/* renamed from: com.google.zxing.e */
/* loaded from: classes2.dex */
public final class C4400e {

    /* renamed from: a */
    private final int f11914a;

    /* renamed from: b */
    private final int f11915b;

    /* renamed from: a */
    public int m27664a() {
        return this.f11915b;
    }

    /* renamed from: b */
    public int m27663b() {
        return this.f11914a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4400e) {
            C4400e c4400e = (C4400e) obj;
            if (this.f11914a == c4400e.f11914a && this.f11915b == c4400e.f11915b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f11914a * 32713) + this.f11915b;
    }

    public String toString() {
        return this.f11914a + "x" + this.f11915b;
    }
}
