package com.squareup.moshi;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import p356sf.InterfaceC10186d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.moshi.k */
/* loaded from: classes2.dex */
public final class C4481k extends AbstractC4483m {

    /* renamed from: I */
    private static final String[] f12092I = new String[128];

    /* renamed from: F */
    private final InterfaceC10186d f12093F;

    /* renamed from: G */
    private String f12094G = ":";

    /* renamed from: H */
    private String f12095H;

    static {
        for (int i = 0; i <= 31; i++) {
            f12092I[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f12092I;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4481k(InterfaceC10186d interfaceC10186d) {
        Objects.requireNonNull(interfaceC10186d, "sink == null");
        this.f12093F = interfaceC10186d;
        m27412R(6);
    }

    /* renamed from: A0 */
    private void m27426A0() throws IOException {
        if (this.f12095H != null) {
            m27425l0();
            m27420x0(this.f12093F, this.f12095H);
            this.f12095H = null;
        }
    }

    /* renamed from: l0 */
    private void m27425l0() throws IOException {
        int m27414M = m27414M();
        if (m27414M == 5) {
            this.f12093F.mo8780S(44);
        } else if (m27414M != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m27422t0();
        m27411W(4);
    }

    /* renamed from: o0 */
    private void m27424o0() throws IOException {
        int m27414M = m27414M();
        int i = 7;
        if (m27414M != 1) {
            if (m27414M == 2) {
                this.f12093F.mo8780S(44);
            } else {
                if (m27414M == 4) {
                    i = 5;
                    this.f12093F.mo8774u0(this.f12094G);
                } else if (m27414M == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else {
                    if (m27414M != 6) {
                        if (m27414M == 7) {
                            if (!this.f12099B) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                }
                m27411W(i);
            }
        }
        m27422t0();
        i = 2;
        m27411W(i);
    }

    /* renamed from: q0 */
    private AbstractC4483m m27423q0(int i, int i2, char c) throws IOException {
        int m27414M = m27414M();
        if (m27414M != i2 && m27414M != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f12095H == null) {
            int i3 = this.f12102w;
            int i4 = this.f12106E;
            if (i3 == (~i4)) {
                this.f12106E = ~i4;
                return this;
            }
            int i5 = i3 - 1;
            this.f12102w = i5;
            this.f12104y[i5] = null;
            int[] iArr = this.f12105z;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (m27414M == i2) {
                m27422t0();
            }
            this.f12093F.mo8780S(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f12095H);
    }

    /* renamed from: t0 */
    private void m27422t0() throws IOException {
        if (this.f12098A == null) {
            return;
        }
        this.f12093F.mo8780S(10);
        int i = this.f12102w;
        for (int i2 = 1; i2 < i; i2++) {
            this.f12093F.mo8774u0(this.f12098A);
        }
    }

    /* renamed from: v0 */
    private AbstractC4483m m27421v0(int i, int i2, char c) throws IOException {
        int i3 = this.f12102w;
        int i4 = this.f12106E;
        if (i3 == i4) {
            int[] iArr = this.f12103x;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f12106E = ~i4;
                return this;
            }
        }
        m27424o0();
        m27404e();
        m27412R(i);
        this.f12105z[this.f12102w - 1] = 0;
        this.f12093F.mo8780S(c);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m27420x0(p356sf.InterfaceC10186d r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.squareup.moshi.C4481k.f12092I
            r1 = 34
            r7.mo8780S(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo8776o(r8, r4, r3)
        L2e:
            r7.mo8774u0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo8776o(r8, r4, r2)
        L3b:
            r7.mo8780S(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C4481k.m27420x0(sf.d, java.lang.String):void");
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: F */
    public AbstractC4483m mo27417F(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f12102w != 0) {
            int m27414M = m27414M();
            if ((m27414M == 3 || m27414M == 5) && this.f12095H == null && !this.f12101D) {
                this.f12095H = str;
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
            if (this.f12095H != null) {
                if (this.f12100C) {
                    m27426A0();
                } else {
                    this.f12095H = null;
                    return this;
                }
            }
            m27424o0();
            this.f12093F.mo8774u0("null");
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
            m27426A0();
            return m27421v0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m27398v());
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: b0 */
    public AbstractC4483m mo27407b0(double d) throws IOException {
        if (!this.f12099B && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f12101D) {
            this.f12101D = false;
            return mo27417F(Double.toString(d));
        } else {
            m27426A0();
            m27424o0();
            this.f12093F.mo8774u0(Double.toString(d));
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
            m27426A0();
            return m27421v0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m27398v());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12093F.close();
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
        m27426A0();
        m27424o0();
        this.f12093F.mo8774u0(Long.toString(j));
        int[] iArr = this.f12105z;
        int i = this.f12102w - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: e0 */
    public AbstractC4483m mo27403e0(@Nullable Number number) throws IOException {
        if (number == null) {
            return mo27416H();
        }
        String obj = number.toString();
        if (!this.f12099B && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f12101D) {
            this.f12101D = false;
            return mo27417F(obj);
        } else {
            m27426A0();
            m27424o0();
            this.f12093F.mo8774u0(obj);
            int[] iArr = this.f12105z;
            int i = this.f12102w - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: f0 */
    public AbstractC4483m mo27402f0(String str) throws IOException {
        if (str == null) {
            return mo27416H();
        }
        if (this.f12101D) {
            this.f12101D = false;
            return mo27417F(str);
        }
        m27426A0();
        m27424o0();
        m27420x0(this.f12093F, str);
        int[] iArr = this.f12105z;
        int i = this.f12102w - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f12102w != 0) {
            this.f12093F.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: h */
    public AbstractC4483m mo27401h() throws IOException {
        return m27423q0(1, 2, ']');
    }

    @Override // com.squareup.moshi.AbstractC4483m
    /* renamed from: j0 */
    public AbstractC4483m mo27400j0(boolean z) throws IOException {
        if (!this.f12101D) {
            m27426A0();
            m27424o0();
            this.f12093F.mo8774u0(z ? "true" : "false");
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
        this.f12101D = false;
        return m27423q0(3, 5, '}');
    }
}
