package sa;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* renamed from: sa.g */
/* loaded from: classes2.dex */
public final class C10123g extends Number {

    /* renamed from: w */
    private final String f26414w;

    public C10123g(String str) {
        this.f26414w = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f26414w);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f26414w);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10123g) {
            String str = this.f26414w;
            String str2 = ((C10123g) obj).f26414w;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f26414w);
    }

    public int hashCode() {
        return this.f26414w.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f26414w);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f26414w).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f26414w);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f26414w);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f26414w).longValue();
        }
    }

    public String toString() {
        return this.f26414w;
    }
}
