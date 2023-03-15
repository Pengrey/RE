package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.i */
/* loaded from: classes.dex */
public final class C2803i implements InterfaceC2931q {

    /* renamed from: w */
    private final Double f7775w;

    public C2803i(Double d) {
        if (d == null) {
            this.f7775w = Double.valueOf(Double.NaN);
        } else {
            this.f7775w = d;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        return new C2803i(this.f7775w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        return this.f7775w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2803i) {
            return this.f7775w.equals(((C2803i) obj).f7775w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: f */
    public final Boolean mo31991f() {
        boolean z = false;
        if (!Double.isNaN(this.f7775w.doubleValue()) && this.f7775w.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: g */
    public final String mo31990g() {
        int scale;
        if (Double.isNaN(this.f7775w.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f7775w.doubleValue())) {
            return this.f7775w.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f7775w.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return null;
    }

    public final int hashCode() {
        return this.f7775w.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        if ("toString".equals(str)) {
            return new C2994u(mo31990g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", mo31990g(), str));
    }

    public final String toString() {
        return mo31990g();
    }
}
