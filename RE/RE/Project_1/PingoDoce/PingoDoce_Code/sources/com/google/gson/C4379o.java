package com.google.gson;

import java.math.BigInteger;
import sa.C10099a;
import sa.C10123g;

/* renamed from: com.google.gson.o */
/* loaded from: classes.dex */
public final class C4379o extends AbstractC4376l {

    /* renamed from: a */
    private final Object f11856a;

    public C4379o(Boolean bool) {
        this.f11856a = C10099a.m9143b(bool);
    }

    /* renamed from: C */
    private static boolean m27752C(C4379o c4379o) {
        Object obj = c4379o.f11856a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    /* renamed from: B */
    public boolean m27753B() {
        return this.f11856a instanceof Boolean;
    }

    /* renamed from: D */
    public boolean m27751D() {
        return this.f11856a instanceof Number;
    }

    /* renamed from: E */
    public boolean m27750E() {
        return this.f11856a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4379o.class != obj.getClass()) {
            return false;
        }
        C4379o c4379o = (C4379o) obj;
        if (this.f11856a == null) {
            return c4379o.f11856a == null;
        } else if (m27752C(this) && m27752C(c4379o)) {
            return m27744y().longValue() == c4379o.m27744y().longValue();
        } else {
            Object obj2 = this.f11856a;
            if ((obj2 instanceof Number) && (c4379o.f11856a instanceof Number)) {
                double doubleValue = m27744y().doubleValue();
                double doubleValue2 = c4379o.m27744y().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(c4379o.f11856a);
        }
    }

    @Override // com.google.gson.AbstractC4376l
    /* renamed from: h */
    public long mo27749h() {
        return m27751D() ? m27744y().longValue() : Long.parseLong(mo27748l());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f11856a == null) {
            return 31;
        }
        if (m27752C(this)) {
            doubleToLongBits = m27744y().longValue();
        } else {
            Object obj = this.f11856a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m27744y().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.AbstractC4376l
    /* renamed from: l */
    public String mo27748l() {
        if (m27751D()) {
            return m27744y().toString();
        }
        if (m27753B()) {
            return ((Boolean) this.f11856a).toString();
        }
        return (String) this.f11856a;
    }

    /* renamed from: u */
    public boolean m27747u() {
        if (m27753B()) {
            return ((Boolean) this.f11856a).booleanValue();
        }
        return Boolean.parseBoolean(mo27748l());
    }

    /* renamed from: v */
    public double m27746v() {
        return m27751D() ? m27744y().doubleValue() : Double.parseDouble(mo27748l());
    }

    /* renamed from: x */
    public int m27745x() {
        return m27751D() ? m27744y().intValue() : Integer.parseInt(mo27748l());
    }

    /* renamed from: y */
    public Number m27744y() {
        Object obj = this.f11856a;
        return obj instanceof String ? new C10123g((String) obj) : (Number) obj;
    }

    public C4379o(Number number) {
        this.f11856a = C10099a.m9143b(number);
    }

    public C4379o(String str) {
        this.f11856a = C10099a.m9143b(str);
    }
}
