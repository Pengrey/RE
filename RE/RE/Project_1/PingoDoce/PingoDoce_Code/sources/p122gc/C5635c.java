package p122gc;

import com.google.crypto.tink.shaded.protobuf.Reader;
import com.google.zxing.WriterException;
import com.google.zxing.common.reedsolomon.C4395a;
import com.google.zxing.common.reedsolomon.C4398d;
import com.google.zxing.qrcode.decoder.C4432j;
import com.google.zxing.qrcode.decoder.EnumC4428f;
import com.google.zxing.qrcode.decoder.EnumC4430h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import p239mb.C7154a;
import p239mb.EnumC7157d;

/* renamed from: gc.c */
/* loaded from: classes2.dex */
public final class C5635c {

    /* renamed from: a */
    private static final int[] f15885a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Encoder.java */
    /* renamed from: gc.c$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5636a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15886a;

        static {
            int[] iArr = new int[EnumC4430h.values().length];
            f15886a = iArr;
            try {
                iArr[EnumC4430h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15886a[EnumC4430h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15886a[EnumC4430h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15886a[EnumC4430h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    static void m23512a(String str, C7154a c7154a, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                c7154a.m19080c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* renamed from: b */
    static void m23511b(CharSequence charSequence, C7154a c7154a) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int m23497p = m23497p(charSequence.charAt(i));
            if (m23497p == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int m23497p2 = m23497p(charSequence.charAt(i2));
                if (m23497p2 != -1) {
                    c7154a.m19080c((m23497p * 45) + m23497p2, 11);
                    i += 2;
                } else {
                    throw new WriterException();
                }
            } else {
                c7154a.m19080c(m23497p, 6);
                i = i2;
            }
        }
    }

    /* renamed from: c */
    static void m23510c(String str, EnumC4430h enumC4430h, C7154a c7154a, String str2) throws WriterException {
        int i = C5636a.f15886a[enumC4430h.ordinal()];
        if (i == 1) {
            m23505h(str, c7154a);
        } else if (i == 2) {
            m23511b(str, c7154a);
        } else if (i == 3) {
            m23512a(str, c7154a, str2);
        } else if (i == 4) {
            m23508e(str, c7154a);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(enumC4430h)));
        }
    }

    /* renamed from: d */
    private static void m23509d(EnumC7157d enumC7157d, C7154a c7154a) {
        c7154a.m19080c(EnumC4430h.ECI.getBits(), 4);
        c7154a.m19080c(enumC7157d.getValue(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m23508e(java.lang.String r6, p239mb.C7154a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L5c
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L54
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 0
        Lf:
            if (r1 >= r0) goto L53
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L2b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L2b
        L29:
            int r2 = r2 - r3
            goto L3a
        L2b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L39
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L39
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L29
        L39:
            r2 = r4
        L3a:
            if (r2 == r4) goto L4b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.m19080c(r3, r2)
            int r1 = r1 + 2
            goto Lf
        L4b:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L53:
            return
        L54:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>(r7)
            throw r6
        L5c:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p122gc.C5635c.m23508e(java.lang.String, mb.a):void");
    }

    /* renamed from: f */
    static void m23507f(int i, C4432j c4432j, EnumC4430h enumC4430h, C7154a c7154a) throws WriterException {
        int characterCountBits = enumC4430h.getCharacterCountBits(c4432j);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            c7154a.m19080c(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    static void m23506g(EnumC4430h enumC4430h, C7154a c7154a) {
        c7154a.m19080c(enumC4430h.getBits(), 4);
    }

    /* renamed from: h */
    static void m23505h(CharSequence charSequence, C7154a c7154a) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                c7154a.m19080c((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    c7154a.m19080c((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    c7154a.m19080c(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m23504i(EnumC4430h enumC4430h, C7154a c7154a, C7154a c7154a2, C4432j c4432j) {
        return c7154a.m19072l() + enumC4430h.getCharacterCountBits(c4432j) + c7154a2.m19072l();
    }

    /* renamed from: j */
    private static int m23503j(C5634b c5634b) {
        return C5637d.m23490a(c5634b) + C5637d.m23488c(c5634b) + C5637d.m23487d(c5634b) + C5637d.m23486e(c5634b);
    }

    /* renamed from: k */
    private static int m23502k(C7154a c7154a, EnumC4428f enumC4428f, C4432j c4432j, C5634b c5634b) throws WriterException {
        int i = Reader.READ_DONE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C5638e.m23482a(c7154a, enumC4428f, c4432j, i3, c5634b);
            int m23503j = m23503j(c5634b);
            if (m23503j < i) {
                i2 = i3;
                i = m23503j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private static EnumC4430h m23501l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m23494s(str)) {
            return EnumC4430h.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m23497p(charAt) == -1) {
                return EnumC4430h.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return EnumC4430h.ALPHANUMERIC;
        }
        if (z2) {
            return EnumC4430h.NUMERIC;
        }
        return EnumC4430h.BYTE;
    }

    /* renamed from: m */
    private static C4432j m23500m(int i, EnumC4428f enumC4428f) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C4432j m27602i = C4432j.m27602i(i2);
            if (m23491v(i, m27602i, enumC4428f)) {
                return m27602i;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p122gc.C5639f m23499n(java.lang.String r7, com.google.zxing.qrcode.decoder.EnumC4428f r8, java.util.Map<com.google.zxing.EnumC4401f, ?> r9) throws com.google.zxing.WriterException {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Le
            com.google.zxing.f r2 = com.google.zxing.EnumC4401f.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1c
            com.google.zxing.f r3 = com.google.zxing.EnumC4401f.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1c:
            java.lang.String r3 = "ISO-8859-1"
        L1e:
            com.google.zxing.qrcode.decoder.h r4 = m23501l(r7, r3)
            mb.a r5 = new mb.a
            r5.<init>()
            com.google.zxing.qrcode.decoder.h r6 = com.google.zxing.qrcode.decoder.EnumC4430h.BYTE
            if (r4 != r6) goto L36
            if (r2 == 0) goto L36
            mb.d r2 = p239mb.EnumC7157d.getCharacterSetECIByName(r3)
            if (r2 == 0) goto L36
            m23509d(r2, r5)
        L36:
            if (r9 == 0) goto L41
            com.google.zxing.f r2 = com.google.zxing.EnumC4401f.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 == 0) goto L5d
            com.google.zxing.f r0 = com.google.zxing.EnumC4401f.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            com.google.zxing.qrcode.decoder.h r0 = com.google.zxing.qrcode.decoder.EnumC4430h.FNC1_FIRST_POSITION
            m23506g(r0, r5)
        L5d:
            m23506g(r4, r5)
            mb.a r0 = new mb.a
            r0.<init>()
            m23510c(r7, r4, r0, r3)
            if (r9 == 0) goto L95
            com.google.zxing.f r1 = com.google.zxing.EnumC4401f.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L95
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            com.google.zxing.qrcode.decoder.j r9 = com.google.zxing.qrcode.decoder.C4432j.m27602i(r9)
            int r1 = m23504i(r4, r5, r0, r9)
            boolean r1 = m23491v(r1, r9, r8)
            if (r1 == 0) goto L8d
            goto L99
        L8d:
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L95:
            com.google.zxing.qrcode.decoder.j r9 = m23493t(r8, r4, r5, r0)
        L99:
            mb.a r1 = new mb.a
            r1.<init>()
            r1.m19081b(r5)
            if (r4 != r6) goto La8
            int r7 = r0.m19071m()
            goto Lac
        La8:
            int r7 = r7.length()
        Lac:
            m23507f(r7, r9, r4, r1)
            r1.m19081b(r0)
            com.google.zxing.qrcode.decoder.j$b r7 = r9.m27605f(r8)
            int r0 = r9.m27603h()
            int r2 = r7.m27595d()
            int r0 = r0 - r2
            m23492u(r0, r1)
            int r2 = r9.m27603h()
            int r7 = r7.m27596c()
            mb.a r7 = m23495r(r1, r2, r0, r7)
            gc.f r0 = new gc.f
            r0.<init>()
            r0.m23461c(r8)
            r0.m23458f(r4)
            r0.m23457g(r9)
            int r1 = r9.m27606e()
            gc.b r2 = new gc.b
            r2.<init>(r1, r1)
            int r1 = m23502k(r7, r8, r9, r2)
            r0.m23460d(r1)
            p122gc.C5638e.m23482a(r7, r8, r9, r1, r2)
            r0.m23459e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p122gc.C5635c.m23499n(java.lang.String, com.google.zxing.qrcode.decoder.f, java.util.Map):gc.f");
    }

    /* renamed from: o */
    static byte[] m23498o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C4398d(C4395a.f11898l).m27665b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m23497p(int i) {
        int[] iArr = f15885a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: q */
    static void m23496q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
                return;
            }
            iArr[0] = i10;
            iArr2[0] = i12;
            return;
        }
        throw new WriterException("Block ID too large");
    }

    /* renamed from: r */
    static C7154a m23495r(C7154a c7154a, int i, int i2, int i3) throws WriterException {
        if (c7154a.m19071m() == i2) {
            ArrayList<C5633a> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m23496q(i, i2, i3, i7, iArr, iArr2);
                int i8 = iArr[0];
                byte[] bArr = new byte[i8];
                c7154a.m19065s(i4 << 3, bArr, 0, i8);
                byte[] m23498o = m23498o(bArr, iArr2[0]);
                arrayList.add(new C5633a(bArr, m23498o));
                i5 = Math.max(i5, i8);
                i6 = Math.max(i6, m23498o.length);
                i4 += iArr[0];
            }
            if (i2 == i4) {
                C7154a c7154a2 = new C7154a();
                for (int i9 = 0; i9 < i5; i9++) {
                    for (C5633a c5633a : arrayList) {
                        byte[] m23521a = c5633a.m23521a();
                        if (i9 < m23521a.length) {
                            c7154a2.m19080c(m23521a[i9], 8);
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (C5633a c5633a2 : arrayList) {
                        byte[] m23520b = c5633a2.m23520b();
                        if (i10 < m23520b.length) {
                            c7154a2.m19080c(m23520b[i10], 8);
                        }
                    }
                }
                if (i == c7154a2.m19071m()) {
                    return c7154a2;
                }
                throw new WriterException("Interleaving error: " + i + " and " + c7154a2.m19071m() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    /* renamed from: s */
    private static boolean m23494s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static C4432j m23493t(EnumC4428f enumC4428f, EnumC4430h enumC4430h, C7154a c7154a, C7154a c7154a2) throws WriterException {
        return m23500m(m23504i(enumC4430h, c7154a, c7154a2, m23500m(m23504i(enumC4430h, c7154a, c7154a2, C4432j.m27602i(1)), enumC4428f)), enumC4428f);
    }

    /* renamed from: u */
    static void m23492u(int i, C7154a c7154a) throws WriterException {
        int i2 = i << 3;
        if (c7154a.m19072l() <= i2) {
            for (int i3 = 0; i3 < 4 && c7154a.m19072l() < i2; i3++) {
                c7154a.m19082a(false);
            }
            int m19072l = c7154a.m19072l() & 7;
            if (m19072l > 0) {
                while (m19072l < 8) {
                    c7154a.m19082a(false);
                    m19072l++;
                }
            }
            int m19071m = i - c7154a.m19071m();
            for (int i4 = 0; i4 < m19071m; i4++) {
                c7154a.m19080c((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (c7154a.m19072l() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + c7154a.m19072l() + " > " + i2);
    }

    /* renamed from: v */
    private static boolean m23491v(int i, C4432j c4432j, EnumC4428f enumC4428f) {
        return c4432j.m27603h() - c4432j.m27605f(enumC4428f).m27595d() >= (i + 7) / 8;
    }
}
