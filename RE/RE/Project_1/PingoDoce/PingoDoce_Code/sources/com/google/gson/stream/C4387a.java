package com.google.gson.stream;

import androidx.constraintlayout.widget.C0868i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p368ta.C10410e;
import sa.AbstractC10122f;

/* renamed from: com.google.gson.stream.a */
/* loaded from: classes2.dex */
public class C4387a implements Closeable {

    /* renamed from: L */
    private static final char[] f11858L = ")]}'\n".toCharArray();

    /* renamed from: E */
    private long f11863E;

    /* renamed from: F */
    private int f11864F;

    /* renamed from: G */
    private String f11865G;

    /* renamed from: H */
    private int[] f11866H;

    /* renamed from: I */
    private int f11867I;

    /* renamed from: J */
    private String[] f11868J;

    /* renamed from: K */
    private int[] f11869K;

    /* renamed from: w */
    private final Reader f11870w;

    /* renamed from: x */
    private boolean f11871x = false;

    /* renamed from: y */
    private final char[] f11872y = new char[1024];

    /* renamed from: z */
    private int f11873z = 0;

    /* renamed from: A */
    private int f11859A = 0;

    /* renamed from: B */
    private int f11860B = 0;

    /* renamed from: C */
    private int f11861C = 0;

    /* renamed from: D */
    int f11862D = 0;

    /* compiled from: JsonReader.java */
    /* renamed from: com.google.gson.stream.a$a */
    /* loaded from: classes2.dex */
    class C4388a extends AbstractC10122f {
        C4388a() {
        }

        @Override // sa.AbstractC10122f
        /* renamed from: a */
        public void mo9099a(C4387a c4387a) throws IOException {
            if (c4387a instanceof C10410e) {
                ((C10410e) c4387a).m8050M0();
                return;
            }
            int i = c4387a.f11862D;
            if (i == 0) {
                i = c4387a.m27724t();
            }
            if (i == 13) {
                c4387a.f11862D = 9;
            } else if (i == 12) {
                c4387a.f11862D = 8;
            } else if (i == 14) {
                c4387a.f11862D = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + c4387a.mo8038o0() + c4387a.m27731P());
            }
        }
    }

    static {
        AbstractC10122f.f26413a = new C4388a();
    }

    public C4387a(Reader reader) {
        int[] iArr = new int[32];
        this.f11866H = iArr;
        this.f11867I = 0;
        this.f11867I = 0 + 1;
        iArr[0] = 6;
        this.f11868J = new String[32];
        this.f11869K = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f11870w = reader;
    }

    /* renamed from: D0 */
    private void m27739D0(char c) throws IOException {
        char[] cArr = this.f11872y;
        do {
            int i = this.f11873z;
            int i2 = this.f11859A;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f11873z = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f11873z = i3;
                    m27721x0();
                    i = this.f11873z;
                    i2 = this.f11859A;
                } else {
                    if (c2 == '\n') {
                        this.f11860B++;
                        this.f11861C = i3;
                    }
                    i = i3;
                }
            }
            this.f11873z = i;
        } while (m27738E(1));
        throw m27734I0("Unterminated string");
    }

    /* renamed from: E */
    private boolean m27738E(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f11872y;
        int i4 = this.f11861C;
        int i5 = this.f11873z;
        this.f11861C = i4 - i5;
        int i6 = this.f11859A;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f11859A = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f11859A = 0;
        }
        this.f11873z = 0;
        do {
            Reader reader = this.f11870w;
            int i8 = this.f11859A;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f11859A + read;
            this.f11859A = i2;
            if (this.f11860B == 0 && (i3 = this.f11861C) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f11873z++;
                this.f11861C = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: E0 */
    private boolean m27737E0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f11873z + length > this.f11859A && !m27738E(length)) {
                return false;
            }
            char[] cArr = this.f11872y;
            int i = this.f11873z;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f11872y[this.f11873z + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f11860B++;
            this.f11861C = i + 1;
            this.f11873z++;
        }
    }

    /* renamed from: F0 */
    private void m27736F0() throws IOException {
        char c;
        do {
            if (this.f11873z >= this.f11859A && !m27738E(1)) {
                return;
            }
            char[] cArr = this.f11872y;
            int i = this.f11873z;
            int i2 = i + 1;
            this.f11873z = i2;
            c = cArr[i];
            if (c == '\n') {
                this.f11860B++;
                this.f11861C = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        m27729e();
     */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m27735G0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f11873z
            int r2 = r1 + r0
            int r3 = r4.f11859A
            if (r2 >= r3) goto L51
            char[] r2 = r4.f11872y
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m27729e()
        L4b:
            int r1 = r4.f11873z
            int r1 = r1 + r0
            r4.f11873z = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f11873z = r1
            r0 = 1
            boolean r0 = r4.m27738E(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4387a.m27735G0():void");
    }

    /* renamed from: I0 */
    private IOException m27734I0(String str) throws IOException {
        throw new MalformedJsonException(str + m27731P());
    }

    /* renamed from: M */
    private boolean m27732M(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case C0868i.f2968t0 /* 93 */:
                            return false;
                        case C0868i.f2963s0 /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m27729e();
        return false;
    }

    /* renamed from: d0 */
    private int m27730d0(boolean z) throws IOException {
        char[] cArr = this.f11872y;
        int i = this.f11873z;
        int i2 = this.f11859A;
        while (true) {
            if (i == i2) {
                this.f11873z = i;
                if (!m27738E(1)) {
                    if (z) {
                        throw new EOFException("End of input" + m27731P());
                    }
                    return -1;
                }
                i = this.f11873z;
                i2 = this.f11859A;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f11860B++;
                this.f11861C = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f11873z = i3;
                    if (i3 == i2) {
                        this.f11873z = i3 - 1;
                        boolean m27738E = m27738E(2);
                        this.f11873z++;
                        if (!m27738E) {
                            return c;
                        }
                    }
                    m27729e();
                    int i4 = this.f11873z;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f11873z = i4 + 1;
                        if (m27737E0("*/")) {
                            i = this.f11873z + 2;
                            i2 = this.f11859A;
                        } else {
                            throw m27734I0("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f11873z = i4 + 1;
                        m27736F0();
                        i = this.f11873z;
                        i2 = this.f11859A;
                    }
                } else if (c == '#') {
                    this.f11873z = i3;
                    m27729e();
                    m27736F0();
                    i = this.f11873z;
                    i2 = this.f11859A;
                } else {
                    this.f11873z = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: e */
    private void m27729e() throws IOException {
        if (!this.f11871x) {
            throw m27734I0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f11873z = r2;
     */
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m27728f0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f11872y
            r1 = 0
        L3:
            int r2 = r9.f11873z
            int r3 = r9.f11859A
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f11873z = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f11873z = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.m27721x0()
            r1.append(r2)
            int r2 = r9.f11873z
            int r3 = r9.f11859A
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f11860B
            int r2 = r2 + r6
            r9.f11860B = r2
            r9.f11861C = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f11873z = r2
            boolean r2 = r9.m27738E(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m27734I0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4387a.m27728f0(char):java.lang.String");
    }

    /* renamed from: h */
    private void m27727h() throws IOException {
        m27730d0(true);
        int i = this.f11873z - 1;
        this.f11873z = i;
        char[] cArr = f11858L;
        if (i + cArr.length > this.f11859A && !m27738E(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = f11858L;
            if (i2 < cArr2.length) {
                if (this.f11872y[this.f11873z + i2] != cArr2[i2]) {
                    return;
                }
                i2++;
            } else {
                this.f11873z += cArr2.length;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m27729e();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m27726l0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f11873z
            int r4 = r3 + r2
            int r5 = r6.f11859A
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f11872y
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m27729e()
            goto L5c
        L4e:
            char[] r3 = r6.f11872y
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m27738E(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f11872y
            int r4 = r6.f11873z
            r1.append(r3, r4, r2)
            int r3 = r6.f11873z
            int r3 = r3 + r2
            r6.f11873z = r3
            r2 = 1
            boolean r2 = r6.m27738E(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f11872y
            int r3 = r6.f11873z
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f11872y
            int r3 = r6.f11873z
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f11873z
            int r2 = r2 + r0
            r6.f11873z = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4387a.m27726l0():java.lang.String");
    }

    /* renamed from: q0 */
    private int m27725q0() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.f11872y[this.f11873z];
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f11873z + i2 >= this.f11859A && !m27738E(i2 + 1)) {
                return 0;
            }
            char c2 = this.f11872y[this.f11873z + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f11873z + length < this.f11859A || m27738E(length + 1)) && m27732M(this.f11872y[this.f11873z + length])) {
            return 0;
        }
        this.f11873z += length;
        this.f11862D = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        if (m27732M(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
        r18.f11863E = r11;
        r18.f11873z += r8;
        r18.f11862D = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
        r18.f11864F = r8;
        r18.f11862D = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
        return 0;
     */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m27723t0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4387a.m27723t0():int");
    }

    /* renamed from: v0 */
    private void m27722v0(int i) {
        int i2 = this.f11867I;
        int[] iArr = this.f11866H;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f11866H = Arrays.copyOf(iArr, i3);
            this.f11869K = Arrays.copyOf(this.f11869K, i3);
            this.f11868J = (String[]) Arrays.copyOf(this.f11868J, i3);
        }
        int[] iArr2 = this.f11866H;
        int i4 = this.f11867I;
        this.f11867I = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: x0 */
    private char m27721x0() throws IOException {
        int i;
        int i2;
        if (this.f11873z == this.f11859A && !m27738E(1)) {
            throw m27734I0("Unterminated escape sequence");
        }
        char[] cArr = this.f11872y;
        int i3 = this.f11873z;
        int i4 = i3 + 1;
        this.f11873z = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.f11860B++;
            this.f11861C = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c != 'b') {
                if (c != 'f') {
                    if (c != 'n') {
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.f11859A && !m27738E(4)) {
                                        throw m27734I0("Unterminated escape sequence");
                                    }
                                    char c2 = 0;
                                    int i5 = this.f11873z;
                                    int i6 = i5 + 4;
                                    while (i5 < i6) {
                                        char c3 = this.f11872y[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 < '0' || c3 > '9') {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 < 'A' || c3 > 'F') {
                                                throw new NumberFormatException("\\u" + new String(this.f11872y, this.f11873z, 4));
                                            } else {
                                                i = c3 - 'A';
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = c3 - '0';
                                        }
                                        c2 = (char) (c4 + i2);
                                        i5++;
                                    }
                                    this.f11873z += 4;
                                    return c2;
                                }
                                throw m27734I0("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c;
    }

    /* renamed from: A0 */
    public final void m27740A0(boolean z) {
        this.f11871x = z;
    }

    /* renamed from: F */
    public String mo8056F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i = this.f11867I;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f11866H[i2];
            if (i3 == 1 || i3 == 2) {
                sb2.append('[');
                sb2.append(this.f11869K[i2]);
                sb2.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb2.append('.');
                String[] strArr = this.f11868J;
                if (strArr[i2] != null) {
                    sb2.append(strArr[i2]);
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: H */
    public boolean mo8055H() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: H0 */
    public void mo8054H0() throws IOException {
        int i = 0;
        do {
            int i2 = this.f11862D;
            if (i2 == 0) {
                i2 = m27724t();
            }
            if (i2 == 3) {
                m27722v0(1);
            } else if (i2 == 1) {
                m27722v0(3);
            } else {
                if (i2 == 4) {
                    this.f11867I--;
                } else if (i2 == 2) {
                    this.f11867I--;
                } else {
                    if (i2 == 14 || i2 == 10) {
                        m27735G0();
                    } else if (i2 == 8 || i2 == 12) {
                        m27739D0('\'');
                    } else if (i2 == 9 || i2 == 13) {
                        m27739D0('\"');
                    } else if (i2 == 16) {
                        this.f11873z += this.f11864F;
                    }
                    this.f11862D = 0;
                }
                i--;
                this.f11862D = 0;
            }
            i++;
            this.f11862D = 0;
        } while (i != 0);
        int[] iArr = this.f11869K;
        int i3 = this.f11867I;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f11868J[i3 - 1] = "null";
    }

    /* renamed from: L */
    public final boolean m27733L() {
        return this.f11871x;
    }

    /* renamed from: P */
    String m27731P() {
        return " at line " + (this.f11860B + 1) + " column " + ((this.f11873z - this.f11861C) + 1) + " path " + mo8056F();
    }

    /* renamed from: R */
    public boolean mo8047R() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 5) {
            this.f11862D = 0;
            int[] iArr = this.f11869K;
            int i2 = this.f11867I - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f11862D = 0;
            int[] iArr2 = this.f11869K;
            int i3 = this.f11867I - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo8038o0() + m27731P());
        }
    }

    /* renamed from: W */
    public double mo8046W() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 15) {
            this.f11862D = 0;
            int[] iArr = this.f11869K;
            int i2 = this.f11867I - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f11863E;
        }
        if (i == 16) {
            this.f11865G = new String(this.f11872y, this.f11873z, this.f11864F);
            this.f11873z += this.f11864F;
        } else if (i == 8 || i == 9) {
            this.f11865G = m27728f0(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f11865G = m27726l0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo8038o0() + m27731P());
        }
        this.f11862D = 11;
        double parseDouble = Double.parseDouble(this.f11865G);
        if (!this.f11871x && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + m27731P());
        }
        this.f11865G = null;
        this.f11862D = 0;
        int[] iArr2 = this.f11869K;
        int i3 = this.f11867I - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: X */
    public int mo8045X() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 15) {
            long j = this.f11863E;
            int i2 = (int) j;
            if (j == i2) {
                this.f11862D = 0;
                int[] iArr = this.f11869K;
                int i3 = this.f11867I - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f11863E + m27731P());
        }
        if (i == 16) {
            this.f11865G = new String(this.f11872y, this.f11873z, this.f11864F);
            this.f11873z += this.f11864F;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + mo8038o0() + m27731P());
        } else {
            if (i == 10) {
                this.f11865G = m27726l0();
            } else {
                this.f11865G = m27728f0(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f11865G);
                this.f11862D = 0;
                int[] iArr2 = this.f11869K;
                int i4 = this.f11867I - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f11862D = 11;
        double parseDouble = Double.parseDouble(this.f11865G);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.f11865G = null;
            this.f11862D = 0;
            int[] iArr3 = this.f11869K;
            int i6 = this.f11867I - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f11865G + m27731P());
    }

    /* renamed from: a */
    public void mo8044a() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 3) {
            m27722v0(1);
            this.f11869K[this.f11867I - 1] = 0;
            this.f11862D = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo8038o0() + m27731P());
    }

    /* renamed from: a0 */
    public long mo8043a0() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 15) {
            this.f11862D = 0;
            int[] iArr = this.f11869K;
            int i2 = this.f11867I - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f11863E;
        }
        if (i == 16) {
            this.f11865G = new String(this.f11872y, this.f11873z, this.f11864F);
            this.f11873z += this.f11864F;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + mo8038o0() + m27731P());
        } else {
            if (i == 10) {
                this.f11865G = m27726l0();
            } else {
                this.f11865G = m27728f0(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f11865G);
                this.f11862D = 0;
                int[] iArr2 = this.f11869K;
                int i3 = this.f11867I - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f11862D = 11;
        double parseDouble = Double.parseDouble(this.f11865G);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f11865G = null;
            this.f11862D = 0;
            int[] iArr3 = this.f11869K;
            int i4 = this.f11867I - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f11865G + m27731P());
    }

    /* renamed from: b0 */
    public String mo8042b0() throws IOException {
        String m27728f0;
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 14) {
            m27728f0 = m27726l0();
        } else if (i == 12) {
            m27728f0 = m27728f0('\'');
        } else if (i == 13) {
            m27728f0 = m27728f0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo8038o0() + m27731P());
        }
        this.f11862D = 0;
        this.f11868J[this.f11867I - 1] = m27728f0;
        return m27728f0;
    }

    /* renamed from: c */
    public void mo8041c() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 1) {
            m27722v0(3);
            this.f11862D = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo8038o0() + m27731P());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11862D = 0;
        this.f11866H[0] = 8;
        this.f11867I = 1;
        this.f11870w.close();
    }

    /* renamed from: e0 */
    public void mo8040e0() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 7) {
            this.f11862D = 0;
            int[] iArr = this.f11869K;
            int i2 = this.f11867I - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo8038o0() + m27731P());
    }

    /* renamed from: j0 */
    public String mo8039j0() throws IOException {
        String str;
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 10) {
            str = m27726l0();
        } else if (i == 8) {
            str = m27728f0('\'');
        } else if (i == 9) {
            str = m27728f0('\"');
        } else if (i == 11) {
            str = this.f11865G;
            this.f11865G = null;
        } else if (i == 15) {
            str = Long.toString(this.f11863E);
        } else if (i == 16) {
            str = new String(this.f11872y, this.f11873z, this.f11864F);
            this.f11873z += this.f11864F;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo8038o0() + m27731P());
        }
        this.f11862D = 0;
        int[] iArr = this.f11869K;
        int i2 = this.f11867I - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: o0 */
    public EnumC4389b mo8038o0() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        switch (i) {
            case 1:
                return EnumC4389b.BEGIN_OBJECT;
            case 2:
                return EnumC4389b.END_OBJECT;
            case 3:
                return EnumC4389b.BEGIN_ARRAY;
            case 4:
                return EnumC4389b.END_ARRAY;
            case 5:
            case 6:
                return EnumC4389b.BOOLEAN;
            case 7:
                return EnumC4389b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC4389b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC4389b.NAME;
            case 15:
            case 16:
                return EnumC4389b.NUMBER;
            case 17:
                return EnumC4389b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: t */
    int m27724t() throws IOException {
        int m27730d0;
        int[] iArr = this.f11866H;
        int i = this.f11867I;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m27730d02 = m27730d0(true);
            if (m27730d02 != 44) {
                if (m27730d02 != 59) {
                    if (m27730d02 == 93) {
                        this.f11862D = 4;
                        return 4;
                    }
                    throw m27734I0("Unterminated array");
                }
                m27729e();
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (m27730d0 = m27730d0(true)) != 44) {
                if (m27730d0 != 59) {
                    if (m27730d0 == 125) {
                        this.f11862D = 2;
                        return 2;
                    }
                    throw m27734I0("Unterminated object");
                }
                m27729e();
            }
            int m27730d03 = m27730d0(true);
            if (m27730d03 == 34) {
                this.f11862D = 13;
                return 13;
            } else if (m27730d03 == 39) {
                m27729e();
                this.f11862D = 12;
                return 12;
            } else if (m27730d03 == 125) {
                if (i2 != 5) {
                    this.f11862D = 2;
                    return 2;
                }
                throw m27734I0("Expected name");
            } else {
                m27729e();
                this.f11873z--;
                if (m27732M((char) m27730d03)) {
                    this.f11862D = 14;
                    return 14;
                }
                throw m27734I0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int m27730d04 = m27730d0(true);
            if (m27730d04 != 58) {
                if (m27730d04 == 61) {
                    m27729e();
                    if (this.f11873z < this.f11859A || m27738E(1)) {
                        char[] cArr = this.f11872y;
                        int i3 = this.f11873z;
                        if (cArr[i3] == '>') {
                            this.f11873z = i3 + 1;
                        }
                    }
                } else {
                    throw m27734I0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f11871x) {
                m27727h();
            }
            this.f11866H[this.f11867I - 1] = 7;
        } else if (i2 == 7) {
            if (m27730d0(false) == -1) {
                this.f11862D = 17;
                return 17;
            }
            m27729e();
            this.f11873z--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int m27730d05 = m27730d0(true);
        if (m27730d05 == 34) {
            this.f11862D = 9;
            return 9;
        } else if (m27730d05 == 39) {
            m27729e();
            this.f11862D = 8;
            return 8;
        } else {
            if (m27730d05 != 44 && m27730d05 != 59) {
                if (m27730d05 == 91) {
                    this.f11862D = 3;
                    return 3;
                } else if (m27730d05 != 93) {
                    if (m27730d05 != 123) {
                        this.f11873z--;
                        int m27725q0 = m27725q0();
                        if (m27725q0 != 0) {
                            return m27725q0;
                        }
                        int m27723t0 = m27723t0();
                        if (m27723t0 != 0) {
                            return m27723t0;
                        }
                        if (m27732M(this.f11872y[this.f11873z])) {
                            m27729e();
                            this.f11862D = 10;
                            return 10;
                        }
                        throw m27734I0("Expected value");
                    }
                    this.f11862D = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f11862D = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw m27734I0("Unexpected value");
            }
            m27729e();
            this.f11873z--;
            this.f11862D = 7;
            return 7;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + m27731P();
    }

    /* renamed from: v */
    public void mo8037v() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 4) {
            int i2 = this.f11867I - 1;
            this.f11867I = i2;
            int[] iArr = this.f11869K;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f11862D = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo8038o0() + m27731P());
    }

    /* renamed from: y */
    public void mo8036y() throws IOException {
        int i = this.f11862D;
        if (i == 0) {
            i = m27724t();
        }
        if (i == 2) {
            int i2 = this.f11867I - 1;
            this.f11867I = i2;
            this.f11868J[i2] = null;
            int[] iArr = this.f11869K;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f11862D = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo8038o0() + m27731P());
    }
}
