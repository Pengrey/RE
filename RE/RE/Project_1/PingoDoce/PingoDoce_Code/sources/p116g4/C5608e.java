package p116g4;

import androidx.constraintlayout.widget.C0868i;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import p116g4.AbstractC5604c;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10187e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g4.e */
/* loaded from: classes.dex */
public final class C5608e extends AbstractC5604c {

    /* renamed from: J */
    private static final ByteString f15837J = ByteString.m8716f("'\\");

    /* renamed from: K */
    private static final ByteString f15838K = ByteString.m8716f("\"\\");

    /* renamed from: L */
    private static final ByteString f15839L = ByteString.m8716f("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: M */
    private static final ByteString f15840M = ByteString.m8716f("\n\r");

    /* renamed from: N */
    private static final ByteString f15841N = ByteString.m8716f("*/");

    /* renamed from: D */
    private final InterfaceC10187e f15842D;

    /* renamed from: E */
    private final Buffer f15843E;

    /* renamed from: F */
    private int f15844F = 0;

    /* renamed from: G */
    private long f15845G;

    /* renamed from: H */
    private int f15846H;

    /* renamed from: I */
    private String f15847I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5608e(InterfaceC10187e interfaceC10187e) {
        Objects.requireNonNull(interfaceC10187e, "source == null");
        this.f15842D = interfaceC10187e;
        this.f15843E = interfaceC10187e.mo8752q();
        m23614W(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (m23586o0(r11) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
        if (r6 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
        if (r7 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
        if (r8 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r10 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r10 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
        if (r10 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
        r16.f15845G = r8;
        r16.f15843E.skip(r5);
        r16.f15844F = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
        if (r6 == 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
        if (r6 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
        if (r6 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:
        r16.f15846H = r5;
        r16.f15844F = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b8, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
        return 0;
     */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m23607A0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p116g4.C5608e.m23607A0():int");
    }

    /* renamed from: D0 */
    private char m23606D0() throws IOException {
        int i;
        int i2;
        if (this.f15842D.mo8746z(1L)) {
            byte readByte = this.f15843E.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f15829A) {
                                        return (char) readByte;
                                    }
                                    throw m23611e0("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f15842D.mo8746z(4L)) {
                                    char c = 0;
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        byte m8811L = this.f15843E.m8811L(i3);
                                        char c2 = (char) (c << 4);
                                        if (m8811L < 48 || m8811L > 57) {
                                            if (m8811L >= 97 && m8811L <= 102) {
                                                i = m8811L - 97;
                                            } else if (m8811L < 65 || m8811L > 70) {
                                                throw m23611e0("\\u" + this.f15843E.mo8754l(4L));
                                            } else {
                                                i = m8811L - 65;
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = m8811L - 48;
                                        }
                                        c = (char) (c2 + i2);
                                    }
                                    this.f15843E.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + m23610v());
                                }
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
        throw m23611e0("Unterminated escape sequence");
    }

    /* renamed from: E0 */
    private void m23604E0(ByteString byteString) throws IOException {
        while (true) {
            long mo8761T = this.f15842D.mo8761T(byteString);
            if (mo8761T != -1) {
                if (this.f15843E.m8811L(mo8761T) == 92) {
                    this.f15843E.skip(mo8761T + 1);
                    m23606D0();
                } else {
                    this.f15843E.skip(mo8761T + 1);
                    return;
                }
            } else {
                throw m23611e0("Unterminated string");
            }
        }
    }

    /* renamed from: F0 */
    private boolean m23602F0() throws IOException {
        InterfaceC10187e interfaceC10187e = this.f15842D;
        ByteString byteString = f15841N;
        long mo8755k0 = interfaceC10187e.mo8755k0(byteString);
        boolean z = mo8755k0 != -1;
        Buffer buffer = this.f15843E;
        buffer.skip(z ? mo8755k0 + byteString.size() : buffer.size());
        return z;
    }

    /* renamed from: G0 */
    private void m23601G0() throws IOException {
        long mo8761T = this.f15842D.mo8761T(f15840M);
        Buffer buffer = this.f15843E;
        buffer.skip(mo8761T != -1 ? mo8761T + 1 : buffer.size());
    }

    /* renamed from: H0 */
    private void m23599H0() throws IOException {
        long mo8761T = this.f15842D.mo8761T(f15839L);
        Buffer buffer = this.f15843E;
        if (mo8761T == -1) {
            mo8761T = buffer.size();
        }
        buffer.skip(mo8761T);
    }

    /* renamed from: f0 */
    private void m23590f0() throws IOException {
        if (!this.f15829A) {
            throw m23611e0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: j0 */
    private int m23588j0() throws IOException {
        int[] iArr = this.f15832x;
        int i = this.f15831w;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m23585q0 = m23585q0(true);
            this.f15843E.readByte();
            if (m23585q0 != 44) {
                if (m23585q0 != 59) {
                    if (m23585q0 == 93) {
                        this.f15844F = 4;
                        return 4;
                    }
                    throw m23611e0("Unterminated array");
                }
                m23590f0();
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int m23585q02 = m23585q0(true);
                this.f15843E.readByte();
                if (m23585q02 != 44) {
                    if (m23585q02 != 59) {
                        if (m23585q02 == 125) {
                            this.f15844F = 2;
                            return 2;
                        }
                        throw m23611e0("Unterminated object");
                    }
                    m23590f0();
                }
            }
            int m23585q03 = m23585q0(true);
            if (m23585q03 == 34) {
                this.f15843E.readByte();
                this.f15844F = 13;
                return 13;
            } else if (m23585q03 == 39) {
                this.f15843E.readByte();
                m23590f0();
                this.f15844F = 12;
                return 12;
            } else if (m23585q03 != 125) {
                m23590f0();
                if (m23586o0((char) m23585q03)) {
                    this.f15844F = 14;
                    return 14;
                }
                throw m23611e0("Expected name");
            } else if (i2 != 5) {
                this.f15843E.readByte();
                this.f15844F = 2;
                return 2;
            } else {
                throw m23611e0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int m23585q04 = m23585q0(true);
            this.f15843E.readByte();
            if (m23585q04 != 58) {
                if (m23585q04 == 61) {
                    m23590f0();
                    if (this.f15842D.mo8746z(1L) && this.f15843E.m8811L(0L) == 62) {
                        this.f15843E.readByte();
                    }
                } else {
                    throw m23611e0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m23585q0(false) == -1) {
                this.f15844F = 18;
                return 18;
            }
            m23590f0();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int m23585q05 = m23585q0(true);
        if (m23585q05 == 34) {
            this.f15843E.readByte();
            this.f15844F = 9;
            return 9;
        } else if (m23585q05 == 39) {
            m23590f0();
            this.f15843E.readByte();
            this.f15844F = 8;
            return 8;
        } else {
            if (m23585q05 != 44 && m23585q05 != 59) {
                if (m23585q05 == 91) {
                    this.f15843E.readByte();
                    this.f15844F = 3;
                    return 3;
                } else if (m23585q05 != 93) {
                    if (m23585q05 != 123) {
                        int m23581x0 = m23581x0();
                        if (m23581x0 != 0) {
                            return m23581x0;
                        }
                        int m23607A0 = m23607A0();
                        if (m23607A0 != 0) {
                            return m23607A0;
                        }
                        if (m23586o0(this.f15843E.m8811L(0L))) {
                            m23590f0();
                            this.f15844F = 10;
                            return 10;
                        }
                        throw m23611e0("Expected value");
                    }
                    this.f15843E.readByte();
                    this.f15844F = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f15843E.readByte();
                    this.f15844F = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw m23611e0("Unexpected value");
            }
            m23590f0();
            this.f15844F = 7;
            return 7;
        }
    }

    /* renamed from: l0 */
    private int m23587l0(String str, AbstractC5604c.C5605a c5605a) {
        int length = c5605a.f15835a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c5605a.f15835a[i])) {
                this.f15844F = 0;
                this.f15833y[this.f15831w - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o0 */
    private boolean m23586o0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
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
        m23590f0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f15843E.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f15842D.mo8746z(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        m23590f0();
        r3 = r6.f15843E.m8811L(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r3 == 42) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r3 == 47) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r6.f15843E.readByte();
        r6.f15843E.readByte();
        m23601G0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f15843E.readByte();
        r6.f15843E.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (m23602F0() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw m23611e0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        m23590f0();
        m23601G0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m23585q0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            sf.e r2 = r6.f15842D
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo8746z(r4)
            if (r2 == 0) goto L82
            sf.c r2 = r6.f15843E
            long r4 = (long) r1
            byte r1 = r2.m8811L(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            sf.c r2 = r6.f15843E
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            sf.e r3 = r6.f15842D
            r4 = 2
            boolean r3 = r3.mo8746z(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.m23590f0()
            sf.c r3 = r6.f15843E
            r4 = 1
            byte r3 = r3.m8811L(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            sf.c r1 = r6.f15843E
            r1.readByte()
            sf.c r1 = r6.f15843E
            r1.readByte()
            r6.m23601G0()
            goto L1
        L5c:
            sf.c r1 = r6.f15843E
            r1.readByte()
            sf.c r1 = r6.f15843E
            r1.readByte()
            boolean r1 = r6.m23602F0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            g4.b r7 = r6.m23611e0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.m23590f0()
            r6.m23601G0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p116g4.C5608e.m23585q0(boolean):int");
    }

    /* renamed from: t0 */
    private String m23583t0(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long mo8761T = this.f15842D.mo8761T(byteString);
            if (mo8761T != -1) {
                if (this.f15843E.m8811L(mo8761T) != 92) {
                    if (sb2 == null) {
                        String mo8754l = this.f15843E.mo8754l(mo8761T);
                        this.f15843E.readByte();
                        return mo8754l;
                    }
                    sb2.append(this.f15843E.mo8754l(mo8761T));
                    this.f15843E.readByte();
                    return sb2.toString();
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f15843E.mo8754l(mo8761T));
                this.f15843E.readByte();
                sb2.append(m23606D0());
            } else {
                throw m23611e0("Unterminated string");
            }
        }
    }

    /* renamed from: v0 */
    private String m23582v0() throws IOException {
        long mo8761T = this.f15842D.mo8761T(f15839L);
        return mo8761T != -1 ? this.f15843E.mo8754l(mo8761T) : this.f15843E.m8801d0();
    }

    /* renamed from: x0 */
    private int m23581x0() throws IOException {
        int i;
        String str;
        String str2;
        byte m8811L = this.f15843E.m8811L(0L);
        if (m8811L == 116 || m8811L == 84) {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (m8811L == 102 || m8811L == 70) {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (m8811L != 110 && m8811L != 78) {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f15842D.mo8746z(i3)) {
                return 0;
            }
            byte m8811L2 = this.f15843E.m8811L(i2);
            if (m8811L2 != str.charAt(i2) && m8811L2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f15842D.mo8746z(length + 1) && m23586o0(this.f15843E.m8811L(length))) {
            return 0;
        }
        this.f15843E.skip(length);
        this.f15844F = i;
        return i;
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: E */
    public boolean mo23605E() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 5) {
            this.f15844F = 0;
            int[] iArr = this.f15834z;
            int i2 = this.f15831w - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f15844F = 0;
            int[] iArr2 = this.f15834z;
            int i3 = this.f15831w - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C5602a("Expected a boolean but was " + mo23596R() + " at path " + m23610v());
        }
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: F */
    public double mo23603F() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 16) {
            this.f15844F = 0;
            int[] iArr = this.f15834z;
            int i2 = this.f15831w - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f15845G;
        }
        if (i == 17) {
            this.f15847I = this.f15843E.mo8754l(this.f15846H);
        } else if (i == 9) {
            this.f15847I = m23583t0(f15838K);
        } else if (i == 8) {
            this.f15847I = m23583t0(f15837J);
        } else if (i == 10) {
            this.f15847I = m23582v0();
        } else if (i != 11) {
            throw new C5602a("Expected a double but was " + mo23596R() + " at path " + m23610v());
        }
        this.f15844F = 11;
        try {
            double parseDouble = Double.parseDouble(this.f15847I);
            if (!this.f15829A && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new C5603b("JSON forbids NaN and infinities: " + parseDouble + " at path " + m23610v());
            }
            this.f15847I = null;
            this.f15844F = 0;
            int[] iArr2 = this.f15834z;
            int i3 = this.f15831w - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new C5602a("Expected a double but was " + this.f15847I + " at path " + m23610v());
        }
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: H */
    public int mo23600H() throws IOException {
        String m23583t0;
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 16) {
            long j = this.f15845G;
            int i2 = (int) j;
            if (j == i2) {
                this.f15844F = 0;
                int[] iArr = this.f15834z;
                int i3 = this.f15831w - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C5602a("Expected an int but was " + this.f15845G + " at path " + m23610v());
        }
        if (i == 17) {
            this.f15847I = this.f15843E.mo8754l(this.f15846H);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                m23583t0 = m23583t0(f15838K);
            } else {
                m23583t0 = m23583t0(f15837J);
            }
            this.f15847I = m23583t0;
            try {
                int parseInt = Integer.parseInt(m23583t0);
                this.f15844F = 0;
                int[] iArr2 = this.f15834z;
                int i4 = this.f15831w - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C5602a("Expected an int but was " + mo23596R() + " at path " + m23610v());
        }
        this.f15844F = 11;
        try {
            double parseDouble = Double.parseDouble(this.f15847I);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f15847I = null;
                this.f15844F = 0;
                int[] iArr3 = this.f15834z;
                int i6 = this.f15831w - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C5602a("Expected an int but was " + this.f15847I + " at path " + m23610v());
        } catch (NumberFormatException unused2) {
            throw new C5602a("Expected an int but was " + this.f15847I + " at path " + m23610v());
        }
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: L */
    public String mo23598L() throws IOException {
        String str;
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 14) {
            str = m23582v0();
        } else if (i == 13) {
            str = m23583t0(f15838K);
        } else if (i == 12) {
            str = m23583t0(f15837J);
        } else if (i == 15) {
            str = this.f15847I;
        } else {
            throw new C5602a("Expected a name but was " + mo23596R() + " at path " + m23610v());
        }
        this.f15844F = 0;
        this.f15833y[this.f15831w - 1] = str;
        return str;
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: M */
    public String mo23597M() throws IOException {
        String mo8754l;
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 10) {
            mo8754l = m23582v0();
        } else if (i == 9) {
            mo8754l = m23583t0(f15838K);
        } else if (i == 8) {
            mo8754l = m23583t0(f15837J);
        } else if (i == 11) {
            mo8754l = this.f15847I;
            this.f15847I = null;
        } else if (i == 16) {
            mo8754l = Long.toString(this.f15845G);
        } else if (i == 17) {
            mo8754l = this.f15843E.mo8754l(this.f15846H);
        } else {
            throw new C5602a("Expected a string but was " + mo23596R() + " at path " + m23610v());
        }
        this.f15844F = 0;
        int[] iArr = this.f15834z;
        int i2 = this.f15831w - 1;
        iArr[i2] = iArr[i2] + 1;
        return mo8754l;
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: R */
    public AbstractC5604c.EnumC5606b mo23596R() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        switch (i) {
            case 1:
                return AbstractC5604c.EnumC5606b.BEGIN_OBJECT;
            case 2:
                return AbstractC5604c.EnumC5606b.END_OBJECT;
            case 3:
                return AbstractC5604c.EnumC5606b.BEGIN_ARRAY;
            case 4:
                return AbstractC5604c.EnumC5606b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC5604c.EnumC5606b.BOOLEAN;
            case 7:
                return AbstractC5604c.EnumC5606b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC5604c.EnumC5606b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC5604c.EnumC5606b.NAME;
            case 16:
            case 17:
                return AbstractC5604c.EnumC5606b.NUMBER;
            case 18:
                return AbstractC5604c.EnumC5606b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: X */
    public int mo23595X(AbstractC5604c.C5605a c5605a) throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m23587l0(this.f15847I, c5605a);
        }
        int mo8766I = this.f15842D.mo8766I(c5605a.f15836b);
        if (mo8766I != -1) {
            this.f15844F = 0;
            this.f15833y[this.f15831w - 1] = c5605a.f15835a[mo8766I];
            return mo8766I;
        }
        String str = this.f15833y[this.f15831w - 1];
        String mo23598L = mo23598L();
        int m23587l0 = m23587l0(mo23598L, c5605a);
        if (m23587l0 == -1) {
            this.f15844F = 15;
            this.f15847I = mo23598L;
            this.f15833y[this.f15831w - 1] = str;
        }
        return m23587l0;
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: a0 */
    public void mo23594a0() throws IOException {
        if (!this.f15830B) {
            int i = this.f15844F;
            if (i == 0) {
                i = m23588j0();
            }
            if (i == 14) {
                m23599H0();
            } else if (i == 13) {
                m23604E0(f15838K);
            } else if (i == 12) {
                m23604E0(f15837J);
            } else if (i != 15) {
                throw new C5602a("Expected a name but was " + mo23596R() + " at path " + m23610v());
            }
            this.f15844F = 0;
            this.f15833y[this.f15831w - 1] = "null";
            return;
        }
        throw new C5602a("Cannot skip unexpected " + mo23596R() + " at " + m23610v());
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: b0 */
    public void mo23593b0() throws IOException {
        if (!this.f15830B) {
            int i = 0;
            do {
                int i2 = this.f15844F;
                if (i2 == 0) {
                    i2 = m23588j0();
                }
                if (i2 == 3) {
                    m23614W(1);
                } else if (i2 == 1) {
                    m23614W(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f15831w--;
                        } else {
                            throw new C5602a("Expected a value but was " + mo23596R() + " at path " + m23610v());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f15831w--;
                        } else {
                            throw new C5602a("Expected a value but was " + mo23596R() + " at path " + m23610v());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m23599H0();
                    } else if (i2 == 9 || i2 == 13) {
                        m23604E0(f15838K);
                    } else if (i2 == 8 || i2 == 12) {
                        m23604E0(f15837J);
                    } else if (i2 == 17) {
                        this.f15843E.skip(this.f15846H);
                    } else if (i2 == 18) {
                        throw new C5602a("Expected a value but was " + mo23596R() + " at path " + m23610v());
                    }
                    this.f15844F = 0;
                }
                i++;
                this.f15844F = 0;
            } while (i != 0);
            int[] iArr = this.f15834z;
            int i3 = this.f15831w;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f15833y[i3 - 1] = "null";
            return;
        }
        throw new C5602a("Cannot skip unexpected " + mo23596R() + " at " + m23610v());
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: c */
    public void mo23592c() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 3) {
            m23614W(1);
            this.f15834z[this.f15831w - 1] = 0;
            this.f15844F = 0;
            return;
        }
        throw new C5602a("Expected BEGIN_ARRAY but was " + mo23596R() + " at path " + m23610v());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15844F = 0;
        this.f15832x[0] = 8;
        this.f15831w = 1;
        this.f15843E.m8805a();
        this.f15842D.close();
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: e */
    public void mo23591e() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 1) {
            m23614W(3);
            this.f15844F = 0;
            return;
        }
        throw new C5602a("Expected BEGIN_OBJECT but was " + mo23596R() + " at path " + m23610v());
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: h */
    public void mo23589h() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 4) {
            int i2 = this.f15831w - 1;
            this.f15831w = i2;
            int[] iArr = this.f15834z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f15844F = 0;
            return;
        }
        throw new C5602a("Expected END_ARRAY but was " + mo23596R() + " at path " + m23610v());
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: t */
    public void mo23584t() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        if (i == 2) {
            int i2 = this.f15831w - 1;
            this.f15831w = i2;
            this.f15833y[i2] = null;
            int[] iArr = this.f15834z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f15844F = 0;
            return;
        }
        throw new C5602a("Expected END_OBJECT but was " + mo23596R() + " at path " + m23610v());
    }

    public String toString() {
        return "JsonReader(" + this.f15842D + ")";
    }

    @Override // p116g4.AbstractC5604c
    /* renamed from: y */
    public boolean mo23580y() throws IOException {
        int i = this.f15844F;
        if (i == 0) {
            i = m23588j0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }
}
