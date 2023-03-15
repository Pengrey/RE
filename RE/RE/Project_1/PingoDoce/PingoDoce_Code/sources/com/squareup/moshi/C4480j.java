package com.squareup.moshi;

import androidx.constraintlayout.widget.C0868i;
import com.squareup.moshi.AbstractC4476h;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;
import javax.annotation.Nullable;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10187e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.moshi.j */
/* loaded from: classes2.dex */
public final class C4480j extends AbstractC4476h {

    /* renamed from: I */
    private static final ByteString f12081I = ByteString.m8716f("'\\");

    /* renamed from: J */
    private static final ByteString f12082J = ByteString.m8716f("\"\\");

    /* renamed from: K */
    private static final ByteString f12083K = ByteString.m8716f("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: L */
    private static final ByteString f12084L = ByteString.m8716f("\n\r");

    /* renamed from: M */
    private static final ByteString f12085M = ByteString.m8716f("*/");

    /* renamed from: C */
    private final InterfaceC10187e f12086C;

    /* renamed from: D */
    private final Buffer f12087D;

    /* renamed from: E */
    private int f12088E = 0;

    /* renamed from: F */
    private long f12089F;

    /* renamed from: G */
    private int f12090G;
    @Nullable

    /* renamed from: H */
    private String f12091H;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4480j(InterfaceC10187e interfaceC10187e) {
        Objects.requireNonNull(interfaceC10187e, "source == null");
        this.f12086C = interfaceC10187e;
        this.f12087D = interfaceC10187e.mo8759b();
        m27467b0(6);
    }

    /* renamed from: A0 */
    private int m27459A0(String str, AbstractC4476h.C4477a c4477a) {
        int length = c4477a.f12079a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c4477a.f12079a[i])) {
                this.f12088E = 0;
                int[] iArr = this.f12078z;
                int i2 = this.f12075w - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D0 */
    private boolean m27458D0(int i) throws IOException {
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
        m27430t0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        r6.f12087D.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.f12086C.mo8746z(2) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        m27430t0();
        r3 = r6.f12087D.m8811L(1);
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
        r6.f12087D.readByte();
        r6.f12087D.readByte();
        m27444N0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.f12087D.readByte();
        r6.f12087D.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (m27445M0() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
        throw m27464q0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r1 != 35) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        m27430t0();
        m27444N0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        return r1;
     */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m27455F0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            sf.e r2 = r6.f12086C
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo8746z(r4)
            if (r2 == 0) goto L82
            sf.c r2 = r6.f12087D
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
            sf.c r2 = r6.f12087D
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            sf.e r3 = r6.f12086C
            r4 = 2
            boolean r3 = r3.mo8746z(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.m27430t0()
            sf.c r3 = r6.f12087D
            r4 = 1
            byte r3 = r3.m8811L(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            sf.c r1 = r6.f12087D
            r1.readByte()
            sf.c r1 = r6.f12087D
            r1.readByte()
            r6.m27444N0()
            goto L1
        L5c:
            sf.c r1 = r6.f12087D
            r1.readByte()
            sf.c r1 = r6.f12087D
            r1.readByte()
            boolean r1 = r6.m27445M0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.m27464q0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.m27430t0()
            r6.m27444N0()
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
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C4480j.m27455F0(boolean):int");
    }

    /* renamed from: G0 */
    private String m27454G0(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long mo8761T = this.f12086C.mo8761T(byteString);
            if (mo8761T != -1) {
                if (this.f12087D.m8811L(mo8761T) != 92) {
                    if (sb2 == null) {
                        String mo8754l = this.f12087D.mo8754l(mo8761T);
                        this.f12087D.readByte();
                        return mo8754l;
                    }
                    sb2.append(this.f12087D.mo8754l(mo8761T));
                    this.f12087D.readByte();
                    return sb2.toString();
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f12087D.mo8754l(mo8761T));
                this.f12087D.readByte();
                sb2.append(m27449K0());
            } else {
                throw m27464q0("Unterminated string");
            }
        }
    }

    /* renamed from: H0 */
    private String m27452H0() throws IOException {
        long mo8761T = this.f12086C.mo8761T(f12083K);
        return mo8761T != -1 ? this.f12087D.mo8754l(mo8761T) : this.f12087D.m8801d0();
    }

    /* renamed from: I0 */
    private int m27451I0() throws IOException {
        int i;
        String str;
        String str2;
        byte m8811L = this.f12087D.m8811L(0L);
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
            if (!this.f12086C.mo8746z(i3)) {
                return 0;
            }
            byte m8811L2 = this.f12087D.m8811L(i2);
            if (m8811L2 != str.charAt(i2) && m8811L2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f12086C.mo8746z(length + 1) && m27458D0(this.f12087D.m8811L(length))) {
            return 0;
        }
        this.f12087D.skip(length);
        this.f12088E = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (m27458D0(r11) != false) goto L70;
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
        r16.f12089F = r8;
        r16.f12087D.skip(r5);
        r16.f12088E = 16;
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
        r16.f12090G = r5;
        r16.f12088E = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b8, code lost:
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
        return 0;
     */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m27450J0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C4480j.m27450J0():int");
    }

    /* renamed from: K0 */
    private char m27449K0() throws IOException {
        int i;
        int i2;
        if (this.f12086C.mo8746z(1L)) {
            byte readByte = this.f12087D.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte != 98) {
                if (readByte != 102) {
                    if (readByte != 110) {
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f12073A) {
                                        return (char) readByte;
                                    }
                                    throw m27464q0("Invalid escape sequence: \\" + ((char) readByte));
                                } else if (this.f12086C.mo8746z(4L)) {
                                    char c = 0;
                                    for (int i3 = 0; i3 < 4; i3++) {
                                        byte m8811L = this.f12087D.m8811L(i3);
                                        char c2 = (char) (c << 4);
                                        if (m8811L < 48 || m8811L > 57) {
                                            if (m8811L >= 97 && m8811L <= 102) {
                                                i = m8811L - 97;
                                            } else if (m8811L < 65 || m8811L > 70) {
                                                throw m27464q0("\\u" + this.f12087D.mo8754l(4L));
                                            } else {
                                                i = m8811L - 65;
                                            }
                                            i2 = i + 10;
                                        } else {
                                            i2 = m8811L - 48;
                                        }
                                        c = (char) (c2 + i2);
                                    }
                                    this.f12087D.skip(4L);
                                    return c;
                                } else {
                                    throw new EOFException("Unterminated escape sequence at path " + m27462v());
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
        throw m27464q0("Unterminated escape sequence");
    }

    /* renamed from: L0 */
    private void m27447L0(ByteString byteString) throws IOException {
        while (true) {
            long mo8761T = this.f12086C.mo8761T(byteString);
            if (mo8761T != -1) {
                if (this.f12087D.m8811L(mo8761T) == 92) {
                    this.f12087D.skip(mo8761T + 1);
                    m27449K0();
                } else {
                    this.f12087D.skip(mo8761T + 1);
                    return;
                }
            } else {
                throw m27464q0("Unterminated string");
            }
        }
    }

    /* renamed from: M0 */
    private boolean m27445M0() throws IOException {
        InterfaceC10187e interfaceC10187e = this.f12086C;
        ByteString byteString = f12085M;
        long mo8755k0 = interfaceC10187e.mo8755k0(byteString);
        boolean z = mo8755k0 != -1;
        Buffer buffer = this.f12087D;
        buffer.skip(z ? mo8755k0 + byteString.size() : buffer.size());
        return z;
    }

    /* renamed from: N0 */
    private void m27444N0() throws IOException {
        long mo8761T = this.f12086C.mo8761T(f12084L);
        Buffer buffer = this.f12087D;
        buffer.skip(mo8761T != -1 ? mo8761T + 1 : buffer.size());
    }

    /* renamed from: O0 */
    private void m27443O0() throws IOException {
        long mo8761T = this.f12086C.mo8761T(f12083K);
        Buffer buffer = this.f12087D;
        if (mo8761T == -1) {
            mo8761T = buffer.size();
        }
        buffer.skip(mo8761T);
    }

    /* renamed from: t0 */
    private void m27430t0() throws IOException {
        if (!this.f12073A) {
            throw m27464q0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: v0 */
    private int m27429v0() throws IOException {
        int[] iArr = this.f12076x;
        int i = this.f12075w;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m27455F0 = m27455F0(true);
            this.f12087D.readByte();
            if (m27455F0 != 44) {
                if (m27455F0 != 59) {
                    if (m27455F0 == 93) {
                        this.f12088E = 4;
                        return 4;
                    }
                    throw m27464q0("Unterminated array");
                }
                m27430t0();
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int m27455F02 = m27455F0(true);
                this.f12087D.readByte();
                if (m27455F02 != 44) {
                    if (m27455F02 != 59) {
                        if (m27455F02 == 125) {
                            this.f12088E = 2;
                            return 2;
                        }
                        throw m27464q0("Unterminated object");
                    }
                    m27430t0();
                }
            }
            int m27455F03 = m27455F0(true);
            if (m27455F03 == 34) {
                this.f12087D.readByte();
                this.f12088E = 13;
                return 13;
            } else if (m27455F03 == 39) {
                this.f12087D.readByte();
                m27430t0();
                this.f12088E = 12;
                return 12;
            } else if (m27455F03 != 125) {
                m27430t0();
                if (m27458D0((char) m27455F03)) {
                    this.f12088E = 14;
                    return 14;
                }
                throw m27464q0("Expected name");
            } else if (i2 != 5) {
                this.f12087D.readByte();
                this.f12088E = 2;
                return 2;
            } else {
                throw m27464q0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int m27455F04 = m27455F0(true);
            this.f12087D.readByte();
            if (m27455F04 != 58) {
                if (m27455F04 == 61) {
                    m27430t0();
                    if (this.f12086C.mo8746z(1L) && this.f12087D.m8811L(0L) == 62) {
                        this.f12087D.readByte();
                    }
                } else {
                    throw m27464q0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m27455F0(false) == -1) {
                this.f12088E = 18;
                return 18;
            }
            m27430t0();
        } else if (i2 == 9) {
            throw null;
        } else {
            if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int m27455F05 = m27455F0(true);
        if (m27455F05 == 34) {
            this.f12087D.readByte();
            this.f12088E = 9;
            return 9;
        } else if (m27455F05 == 39) {
            m27430t0();
            this.f12087D.readByte();
            this.f12088E = 8;
            return 8;
        } else {
            if (m27455F05 != 44 && m27455F05 != 59) {
                if (m27455F05 == 91) {
                    this.f12087D.readByte();
                    this.f12088E = 3;
                    return 3;
                } else if (m27455F05 != 93) {
                    if (m27455F05 != 123) {
                        int m27451I0 = m27451I0();
                        if (m27451I0 != 0) {
                            return m27451I0;
                        }
                        int m27450J0 = m27450J0();
                        if (m27450J0 != 0) {
                            return m27450J0;
                        }
                        if (m27458D0(this.f12087D.m8811L(0L))) {
                            m27430t0();
                            this.f12088E = 10;
                            return 10;
                        }
                        throw m27464q0("Expected value");
                    }
                    this.f12087D.readByte();
                    this.f12088E = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f12087D.readByte();
                    this.f12088E = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw m27464q0("Unexpected value");
            }
            m27430t0();
            this.f12088E = 7;
            return 7;
        }
    }

    /* renamed from: x0 */
    private int m27428x0(String str, AbstractC4476h.C4477a c4477a) {
        int length = c4477a.f12079a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c4477a.f12079a[i])) {
                this.f12088E = 0;
                this.f12077y[this.f12075w - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E0 */
    public String m27457E0() throws IOException {
        String str;
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 14) {
            str = m27452H0();
        } else if (i == 13) {
            str = m27454G0(f12082J);
        } else if (i == 12) {
            str = m27454G0(f12081I);
        } else if (i == 15) {
            str = this.f12091H;
            this.f12091H = null;
        } else {
            throw new JsonDataException("Expected a name but was " + mo27440X() + " at path " + m27462v());
        }
        this.f12088E = 0;
        this.f12077y[this.f12075w - 1] = str;
        return str;
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: F */
    public boolean mo27456F() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 5) {
            this.f12088E = 0;
            int[] iArr = this.f12078z;
            int i2 = this.f12075w - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f12088E = 0;
            int[] iArr2 = this.f12078z;
            int i3 = this.f12075w - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + mo27440X() + " at path " + m27462v());
        }
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: H */
    public double mo27453H() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 16) {
            this.f12088E = 0;
            int[] iArr = this.f12078z;
            int i2 = this.f12075w - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f12089F;
        }
        if (i == 17) {
            this.f12091H = this.f12087D.mo8754l(this.f12090G);
        } else if (i == 9) {
            this.f12091H = m27454G0(f12082J);
        } else if (i == 8) {
            this.f12091H = m27454G0(f12081I);
        } else if (i == 10) {
            this.f12091H = m27452H0();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + mo27440X() + " at path " + m27462v());
        }
        this.f12088E = 11;
        try {
            double parseDouble = Double.parseDouble(this.f12091H);
            if (!this.f12073A && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + m27462v());
            }
            this.f12091H = null;
            this.f12088E = 0;
            int[] iArr2 = this.f12078z;
            int i3 = this.f12075w - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f12091H + " at path " + m27462v());
        }
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: L */
    public int mo27448L() throws IOException {
        String m27454G0;
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 16) {
            long j = this.f12089F;
            int i2 = (int) j;
            if (j == i2) {
                this.f12088E = 0;
                int[] iArr = this.f12078z;
                int i3 = this.f12075w - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f12089F + " at path " + m27462v());
        }
        if (i == 17) {
            this.f12091H = this.f12087D.mo8754l(this.f12090G);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                m27454G0 = m27454G0(f12082J);
            } else {
                m27454G0 = m27454G0(f12081I);
            }
            this.f12091H = m27454G0;
            try {
                int parseInt = Integer.parseInt(m27454G0);
                this.f12088E = 0;
                int[] iArr2 = this.f12078z;
                int i4 = this.f12075w - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + mo27440X() + " at path " + m27462v());
        }
        this.f12088E = 11;
        try {
            double parseDouble = Double.parseDouble(this.f12091H);
            int i5 = (int) parseDouble;
            if (i5 == parseDouble) {
                this.f12091H = null;
                this.f12088E = 0;
                int[] iArr3 = this.f12078z;
                int i6 = this.f12075w - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f12091H + " at path " + m27462v());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f12091H + " at path " + m27462v());
        }
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: M */
    public long mo27446M() throws IOException {
        String m27454G0;
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 16) {
            this.f12088E = 0;
            int[] iArr = this.f12078z;
            int i2 = this.f12075w - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f12089F;
        }
        if (i == 17) {
            this.f12091H = this.f12087D.mo8754l(this.f12090G);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                m27454G0 = m27454G0(f12082J);
            } else {
                m27454G0 = m27454G0(f12081I);
            }
            this.f12091H = m27454G0;
            try {
                long parseLong = Long.parseLong(m27454G0);
                this.f12088E = 0;
                int[] iArr2 = this.f12078z;
                int i3 = this.f12075w - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected a long but was " + mo27440X() + " at path " + m27462v());
        }
        this.f12088E = 11;
        try {
            long longValueExact = new BigDecimal(this.f12091H).longValueExact();
            this.f12091H = null;
            this.f12088E = 0;
            int[] iArr3 = this.f12078z;
            int i4 = this.f12075w - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f12091H + " at path " + m27462v());
        }
    }

    @Override // com.squareup.moshi.AbstractC4476h
    @Nullable
    /* renamed from: P */
    public <T> T mo27442P() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 7) {
            this.f12088E = 0;
            int[] iArr = this.f12078z;
            int i2 = this.f12075w - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + mo27440X() + " at path " + m27462v());
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: R */
    public String mo27441R() throws IOException {
        String mo8754l;
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 10) {
            mo8754l = m27452H0();
        } else if (i == 9) {
            mo8754l = m27454G0(f12082J);
        } else if (i == 8) {
            mo8754l = m27454G0(f12081I);
        } else if (i == 11) {
            mo8754l = this.f12091H;
            this.f12091H = null;
        } else if (i == 16) {
            mo8754l = Long.toString(this.f12089F);
        } else if (i == 17) {
            mo8754l = this.f12087D.mo8754l(this.f12090G);
        } else {
            throw new JsonDataException("Expected a string but was " + mo27440X() + " at path " + m27462v());
        }
        this.f12088E = 0;
        int[] iArr = this.f12078z;
        int i2 = this.f12075w - 1;
        iArr[i2] = iArr[i2] + 1;
        return mo8754l;
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: X */
    public AbstractC4476h.EnumC4478b mo27440X() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        switch (i) {
            case 1:
                return AbstractC4476h.EnumC4478b.BEGIN_OBJECT;
            case 2:
                return AbstractC4476h.EnumC4478b.END_OBJECT;
            case 3:
                return AbstractC4476h.EnumC4478b.BEGIN_ARRAY;
            case 4:
                return AbstractC4476h.EnumC4478b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC4476h.EnumC4478b.BOOLEAN;
            case 7:
                return AbstractC4476h.EnumC4478b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC4476h.EnumC4478b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC4476h.EnumC4478b.NAME;
            case 16:
            case 17:
                return AbstractC4476h.EnumC4478b.NUMBER;
            case 18:
                return AbstractC4476h.EnumC4478b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: a */
    public void mo27439a() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 3) {
            m27467b0(1);
            this.f12078z[this.f12075w - 1] = 0;
            this.f12088E = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo27440X() + " at path " + m27462v());
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: a0 */
    public void mo27438a0() throws IOException {
        if (mo27427y()) {
            this.f12091H = m27457E0();
            this.f12088E = 11;
        }
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: c */
    public void mo27437c() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 1) {
            m27467b0(3);
            this.f12088E = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo27440X() + " at path " + m27462v());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12088E = 0;
        this.f12076x[0] = 8;
        this.f12075w = 1;
        this.f12087D.m8805a();
        this.f12086C.close();
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: d0 */
    public int mo27436d0(AbstractC4476h.C4477a c4477a) throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m27428x0(this.f12091H, c4477a);
        }
        int mo8766I = this.f12086C.mo8766I(c4477a.f12080b);
        if (mo8766I != -1) {
            this.f12088E = 0;
            this.f12077y[this.f12075w - 1] = c4477a.f12079a[mo8766I];
            return mo8766I;
        }
        String str = this.f12077y[this.f12075w - 1];
        String m27457E0 = m27457E0();
        int m27428x0 = m27428x0(m27457E0, c4477a);
        if (m27428x0 == -1) {
            this.f12088E = 15;
            this.f12091H = m27457E0;
            this.f12077y[this.f12075w - 1] = str;
        }
        return m27428x0;
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: e */
    public void mo27435e() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 4) {
            int i2 = this.f12075w - 1;
            this.f12075w = i2;
            int[] iArr = this.f12078z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f12088E = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + mo27440X() + " at path " + m27462v());
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: e0 */
    public int mo27434e0(AbstractC4476h.C4477a c4477a) throws IOException {
        int[] iArr;
        int i;
        int i2 = this.f12088E;
        if (i2 == 0) {
            i2 = m27429v0();
        }
        if (i2 < 8 || i2 > 11) {
            return -1;
        }
        if (i2 == 11) {
            return m27459A0(this.f12091H, c4477a);
        }
        int mo8766I = this.f12086C.mo8766I(c4477a.f12080b);
        if (mo8766I != -1) {
            this.f12088E = 0;
            int[] iArr2 = this.f12078z;
            int i3 = this.f12075w - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return mo8766I;
        }
        String mo27441R = mo27441R();
        int m27459A0 = m27459A0(mo27441R, c4477a);
        if (m27459A0 == -1) {
            this.f12088E = 11;
            this.f12091H = mo27441R;
            this.f12078z[this.f12075w - 1] = iArr[i] - 1;
        }
        return m27459A0;
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: h */
    public void mo27433h() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        if (i == 2) {
            int i2 = this.f12075w - 1;
            this.f12075w = i2;
            this.f12077y[i2] = null;
            int[] iArr = this.f12078z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f12088E = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + mo27440X() + " at path " + m27462v());
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: l0 */
    public void mo27432l0() throws IOException {
        if (!this.f12074B) {
            int i = this.f12088E;
            if (i == 0) {
                i = m27429v0();
            }
            if (i == 14) {
                m27443O0();
            } else if (i == 13) {
                m27447L0(f12082J);
            } else if (i == 12) {
                m27447L0(f12081I);
            } else if (i != 15) {
                throw new JsonDataException("Expected a name but was " + mo27440X() + " at path " + m27462v());
            }
            this.f12088E = 0;
            this.f12077y[this.f12075w - 1] = "null";
            return;
        }
        AbstractC4476h.EnumC4478b mo27440X = mo27440X();
        m27457E0();
        throw new JsonDataException("Cannot skip unexpected " + mo27440X + " at " + m27462v());
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: o0 */
    public void mo27431o0() throws IOException {
        if (!this.f12074B) {
            int i = 0;
            do {
                int i2 = this.f12088E;
                if (i2 == 0) {
                    i2 = m27429v0();
                }
                if (i2 == 3) {
                    m27467b0(1);
                } else if (i2 == 1) {
                    m27467b0(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f12075w--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo27440X() + " at path " + m27462v());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f12075w--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + mo27440X() + " at path " + m27462v());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m27443O0();
                    } else if (i2 == 9 || i2 == 13) {
                        m27447L0(f12082J);
                    } else if (i2 == 8 || i2 == 12) {
                        m27447L0(f12081I);
                    } else if (i2 == 17) {
                        this.f12087D.skip(this.f12090G);
                    } else if (i2 == 18) {
                        throw new JsonDataException("Expected a value but was " + mo27440X() + " at path " + m27462v());
                    }
                    this.f12088E = 0;
                }
                i++;
                this.f12088E = 0;
            } while (i != 0);
            int[] iArr = this.f12078z;
            int i3 = this.f12075w;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f12077y[i3 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + mo27440X() + " at " + m27462v());
    }

    public String toString() {
        return "JsonReader(" + this.f12086C + ")";
    }

    @Override // com.squareup.moshi.AbstractC4476h
    /* renamed from: y */
    public boolean mo27427y() throws IOException {
        int i = this.f12088E;
        if (i == 0) {
            i = m27429v0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }
}
