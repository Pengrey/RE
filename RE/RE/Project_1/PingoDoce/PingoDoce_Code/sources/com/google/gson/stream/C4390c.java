package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.gson.stream.c */
/* loaded from: classes2.dex */
public class C4390c implements Closeable, Flushable {

    /* renamed from: F */
    private static final String[] f11874F = new String[128];

    /* renamed from: G */
    private static final String[] f11875G;

    /* renamed from: A */
    private String f11876A;

    /* renamed from: B */
    private boolean f11877B;

    /* renamed from: C */
    private boolean f11878C;

    /* renamed from: D */
    private String f11879D;

    /* renamed from: E */
    private boolean f11880E;

    /* renamed from: w */
    private final Writer f11881w;

    /* renamed from: x */
    private int[] f11882x = new int[32];

    /* renamed from: y */
    private int f11883y = 0;

    /* renamed from: z */
    private String f11884z;

    static {
        for (int i = 0; i <= 31; i++) {
            f11874F[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f11874F;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f11875G = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C4390c(Writer writer) {
        m27714X(6);
        this.f11876A = ":";
        this.f11880E = true;
        Objects.requireNonNull(writer, "out == null");
        this.f11881w = writer;
    }

    /* renamed from: M */
    private void m27717M() throws IOException {
        if (this.f11884z == null) {
            return;
        }
        this.f11881w.write(10);
        int i = this.f11883y;
        for (int i2 = 1; i2 < i; i2++) {
            this.f11881w.write(this.f11884z);
        }
    }

    /* renamed from: R */
    private C4390c m27716R(int i, char c) throws IOException {
        m27710c();
        m27714X(i);
        this.f11881w.write(c);
        return this;
    }

    /* renamed from: W */
    private int m27715W() {
        int i = this.f11883y;
        if (i != 0) {
            return this.f11882x[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: X */
    private void m27714X(int i) {
        int i2 = this.f11883y;
        int[] iArr = this.f11882x;
        if (i2 == iArr.length) {
            this.f11882x = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f11882x;
        int i3 = this.f11883y;
        this.f11883y = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: a */
    private void m27713a() throws IOException {
        int m27715W = m27715W();
        if (m27715W == 5) {
            this.f11881w.write(44);
        } else if (m27715W != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m27717M();
        m27712a0(4);
    }

    /* renamed from: a0 */
    private void m27712a0(int i) {
        this.f11882x[this.f11883y - 1] = i;
    }

    /* renamed from: c */
    private void m27710c() throws IOException {
        int m27715W = m27715W();
        if (m27715W == 1) {
            m27712a0(2);
            m27717M();
        } else if (m27715W == 2) {
            this.f11881w.append(',');
            m27717M();
        } else if (m27715W != 4) {
            if (m27715W != 6) {
                if (m27715W == 7) {
                    if (!this.f11877B) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            m27712a0(7);
        } else {
            this.f11881w.append((CharSequence) this.f11876A);
            m27712a0(5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m27706j0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f11878C
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.C4390c.f11875G
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.C4390c.f11874F
        L9:
            java.io.Writer r1 = r8.f11881w
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f11881w
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f11881w
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f11881w
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f11881w
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4390c.m27706j0(java.lang.String):void");
    }

    /* renamed from: t */
    private C4390c m27705t(int i, int i2, char c) throws IOException {
        int m27715W = m27715W();
        if (m27715W != i2 && m27715W != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f11879D == null) {
            this.f11883y--;
            if (m27715W == i2) {
                m27717M();
            }
            this.f11881w.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f11879D);
    }

    /* renamed from: x0 */
    private void m27704x0() throws IOException {
        if (this.f11879D != null) {
            m27713a();
            m27706j0(this.f11879D);
            this.f11879D = null;
        }
    }

    /* renamed from: E */
    public final boolean m27720E() {
        return this.f11880E;
    }

    /* renamed from: F */
    public final boolean m27719F() {
        return this.f11878C;
    }

    /* renamed from: H */
    public boolean m27718H() {
        return this.f11877B;
    }

    /* renamed from: L */
    public C4390c mo8032L(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f11879D == null) {
            if (this.f11883y != 0) {
                this.f11879D = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    /* renamed from: P */
    public C4390c mo8031P() throws IOException {
        if (this.f11879D != null) {
            if (this.f11880E) {
                m27704x0();
            } else {
                this.f11879D = null;
                return this;
            }
        }
        m27710c();
        this.f11881w.write("null");
        return this;
    }

    /* renamed from: b0 */
    public final void m27711b0(boolean z) {
        this.f11878C = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11881w.close();
        int i = this.f11883y;
        if (i <= 1 && (i != 1 || this.f11882x[i - 1] == 7)) {
            this.f11883y = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d0 */
    public final void m27709d0(String str) {
        if (str.length() == 0) {
            this.f11884z = null;
            this.f11876A = ":";
            return;
        }
        this.f11884z = str;
        this.f11876A = ": ";
    }

    /* renamed from: e */
    public C4390c mo8030e() throws IOException {
        m27704x0();
        return m27716R(1, '[');
    }

    /* renamed from: e0 */
    public final void m27708e0(boolean z) {
        this.f11877B = z;
    }

    /* renamed from: f0 */
    public final void m27707f0(boolean z) {
        this.f11880E = z;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f11883y != 0) {
            this.f11881w.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    public C4390c mo8029h() throws IOException {
        m27704x0();
        return m27716R(3, '{');
    }

    /* renamed from: l0 */
    public C4390c mo8028l0(long j) throws IOException {
        m27704x0();
        m27710c();
        this.f11881w.write(Long.toString(j));
        return this;
    }

    /* renamed from: o0 */
    public C4390c mo8027o0(Boolean bool) throws IOException {
        if (bool == null) {
            return mo8031P();
        }
        m27704x0();
        m27710c();
        this.f11881w.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: q0 */
    public C4390c mo8026q0(Number number) throws IOException {
        if (number == null) {
            return mo8031P();
        }
        m27704x0();
        String obj = number.toString();
        if (!this.f11877B && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m27710c();
        this.f11881w.append((CharSequence) obj);
        return this;
    }

    /* renamed from: t0 */
    public C4390c mo8025t0(String str) throws IOException {
        if (str == null) {
            return mo8031P();
        }
        m27704x0();
        m27710c();
        m27706j0(str);
        return this;
    }

    /* renamed from: v */
    public C4390c mo8024v() throws IOException {
        return m27705t(1, 2, ']');
    }

    /* renamed from: v0 */
    public C4390c mo8023v0(boolean z) throws IOException {
        m27704x0();
        m27710c();
        this.f11881w.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: y */
    public C4390c mo8022y() throws IOException {
        return m27705t(3, 5, '}');
    }
}
