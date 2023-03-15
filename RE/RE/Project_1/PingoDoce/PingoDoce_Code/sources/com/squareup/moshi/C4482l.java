package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.moshi.l */
/* loaded from: classes2.dex */
public final class C4482l extends AbstractC4483m {

    /* renamed from: F */
    Object[] f12096F = new Object[32];
    @Nullable

    /* renamed from: G */
    private String f12097G;

    C4482l() {
        m27412R(6);
    }

    /* renamed from: l0 */
    private C4482l m27419l0(@Nullable Object obj) {
        String str;
        Object put;
        int m27414M = m27414M();
        int i = this.f12102w;
        if (i == 1) {
            if (m27414M == 6) {
                this.f12103x[i - 1] = 7;
                this.f12096F[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (m27414M != 3 || (str = this.f12097G) == null) {
            if (m27414M != 1) {
                if (m27414M == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.f12096F[i - 1]).add(obj);
        } else if ((obj == null && !this.f12100C) || (put = ((Map) this.f12096F[i - 1]).put(str, obj)) == null) {
            this.f12097G = null;
        } else {
            throw new IllegalArgumentException("Map key '" + this.f12097G + "' has multiple values at path " + m27398v() + ": " + put + " and " + obj);
        }
        return this;
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: F */
    public AbstractC4483m mo27417F(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f12102w != 0) {
            if (m27414M() == 3 && this.f12097G == null && !this.f12101D) {
                this.f12097G = str;
                this.f12104y[this.f12102w - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: H */
    public AbstractC4483m mo27416H() throws IOException {
        if (!this.f12101D) {
            m27419l0(null);
            int[] iArr = this.f12105z;
            int i = this.f12102w - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m27398v());
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: a */
    public AbstractC4483m mo27409a() throws IOException {
        if (!this.f12101D) {
            int i = this.f12102w;
            int i2 = this.f12106E;
            if (i == i2 && this.f12103x[i - 1] == 1) {
                this.f12106E = ~i2;
                return this;
            }
            m27404e();
            ArrayList arrayList = new ArrayList();
            m27419l0(arrayList);
            Object[] objArr = this.f12096F;
            int i3 = this.f12102w;
            objArr[i3] = arrayList;
            this.f12105z[i3] = 0;
            m27412R(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m27398v());
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: b0 */
    public AbstractC4483m mo27407b0(double d) throws IOException {
        if (!this.f12099B && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f12101D) {
            this.f12101D = false;
            return mo27417F(Double.toString(d));
        } else {
            m27419l0(Double.valueOf(d));
            int[] iArr = this.f12105z;
            int i = this.f12102w - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: c */
    public AbstractC4483m mo27406c() throws IOException {
        if (!this.f12101D) {
            int i = this.f12102w;
            int i2 = this.f12106E;
            if (i == i2 && this.f12103x[i - 1] == 3) {
                this.f12106E = ~i2;
                return this;
            }
            m27404e();
            C4484n c4484n = new C4484n();
            m27419l0(c4484n);
            this.f12096F[this.f12102w] = c4484n;
            m27412R(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m27398v());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.f12102w;
        if (i <= 1 && (i != 1 || this.f12103x[i - 1] == 7)) {
            this.f12102w = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: d0 */
    public AbstractC4483m mo27405d0(long j) throws IOException {
        if (this.f12101D) {
            this.f12101D = false;
            return mo27417F(Long.toString(j));
        }
        m27419l0(Long.valueOf(j));
        int[] iArr = this.f12105z;
        int i = this.f12102w - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: e0 */
    public AbstractC4483m mo27403e0(@Nullable Number number) throws IOException {
        if (!(number instanceof Byte) && !(number instanceof Short) && !(number instanceof Integer) && !(number instanceof Long)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                return mo27407b0(number.doubleValue());
            }
            if (number == null) {
                return mo27416H();
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.f12101D) {
                this.f12101D = false;
                return mo27417F(bigDecimal.toString());
            }
            m27419l0(bigDecimal);
            int[] iArr = this.f12105z;
            int i = this.f12102w - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        return mo27405d0(number.longValue());
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: f0 */
    public AbstractC4483m mo27402f0(@Nullable String str) throws IOException {
        if (this.f12101D) {
            this.f12101D = false;
            return mo27417F(str);
        }
        m27419l0(str);
        int[] iArr = this.f12105z;
        int i = this.f12102w - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f12102w == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: h */
    public AbstractC4483m mo27401h() throws IOException {
        if (m27414M() == 1) {
            int i = this.f12102w;
            int i2 = this.f12106E;
            if (i == (~i2)) {
                this.f12106E = ~i2;
                return this;
            }
            int i3 = i - 1;
            this.f12102w = i3;
            this.f12096F[i3] = null;
            int[] iArr = this.f12105z;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: j0 */
    public AbstractC4483m mo27400j0(boolean z) throws IOException {
        if (!this.f12101D) {
            m27419l0(Boolean.valueOf(z));
            int[] iArr = this.f12105z;
            int i = this.f12102w - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m27398v());
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: t */
    public AbstractC4483m mo27399t() throws IOException {
        if (m27414M() == 3) {
            if (this.f12097G == null) {
                int i = this.f12102w;
                int i2 = this.f12106E;
                if (i == (~i2)) {
                    this.f12106E = ~i2;
                    return this;
                }
                this.f12101D = false;
                int i3 = i - 1;
                this.f12102w = i3;
                this.f12096F[i3] = null;
                this.f12104y[i3] = null;
                int[] iArr = this.f12105z;
                int i4 = i3 - 1;
                iArr[i4] = iArr[i4] + 1;
                return this;
            }
            throw new IllegalStateException("Dangling name: " + this.f12097G);
        }
        throw new IllegalStateException("Nesting problem.");
    }
}
