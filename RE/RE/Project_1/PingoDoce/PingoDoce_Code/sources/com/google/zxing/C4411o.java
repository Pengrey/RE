package com.google.zxing;

import p254nb.C7693a;

/* renamed from: com.google.zxing.o */
/* loaded from: classes2.dex */
public class C4411o {

    /* renamed from: a */
    private final float f11933a;

    /* renamed from: b */
    private final float f11934b;

    public C4411o(float f, float f2) {
        this.f11933a = f;
        this.f11934b = f2;
    }

    /* renamed from: a */
    private static float m27642a(C4411o c4411o, C4411o c4411o2, C4411o c4411o3) {
        float f = c4411o2.f11933a;
        float f2 = c4411o2.f11934b;
        return ((c4411o3.f11933a - f) * (c4411o.f11934b - f2)) - ((c4411o3.f11934b - f2) * (c4411o.f11933a - f));
    }

    /* renamed from: b */
    public static float m27641b(C4411o c4411o, C4411o c4411o2) {
        return C7693a.m17705a(c4411o.f11933a, c4411o.f11934b, c4411o2.f11933a, c4411o2.f11934b);
    }

    /* renamed from: e */
    public static void m27638e(C4411o[] c4411oArr) {
        C4411o c4411o;
        C4411o c4411o2;
        C4411o c4411o3;
        float m27641b = m27641b(c4411oArr[0], c4411oArr[1]);
        float m27641b2 = m27641b(c4411oArr[1], c4411oArr[2]);
        float m27641b3 = m27641b(c4411oArr[0], c4411oArr[2]);
        if (m27641b2 >= m27641b && m27641b2 >= m27641b3) {
            c4411o = c4411oArr[0];
            c4411o2 = c4411oArr[1];
            c4411o3 = c4411oArr[2];
        } else if (m27641b3 >= m27641b2 && m27641b3 >= m27641b) {
            c4411o = c4411oArr[1];
            c4411o2 = c4411oArr[0];
            c4411o3 = c4411oArr[2];
        } else {
            c4411o = c4411oArr[2];
            c4411o2 = c4411oArr[0];
            c4411o3 = c4411oArr[1];
        }
        if (m27642a(c4411o2, c4411o, c4411o3) < 0.0f) {
            C4411o c4411o4 = c4411o3;
            c4411o3 = c4411o2;
            c4411o2 = c4411o4;
        }
        c4411oArr[0] = c4411o2;
        c4411oArr[1] = c4411o;
        c4411oArr[2] = c4411o3;
    }

    /* renamed from: c */
    public final float m27640c() {
        return this.f11933a;
    }

    /* renamed from: d */
    public final float m27639d() {
        return this.f11934b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4411o) {
            C4411o c4411o = (C4411o) obj;
            if (this.f11933a == c4411o.f11933a && this.f11934b == c4411o.f11934b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f11933a) * 31) + Float.floatToIntBits(this.f11934b);
    }

    public final String toString() {
        return "(" + this.f11933a + ',' + this.f11934b + ')';
    }
}
