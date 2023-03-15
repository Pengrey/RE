package com.google.zxing.qrcode.decoder;

import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p239mb.C7156c;
import p239mb.C7158e;
import p239mb.C7165l;
import p239mb.EnumC7157d;

/* renamed from: com.google.zxing.qrcode.decoder.d */
/* loaded from: classes2.dex */
final class C4425d {

    /* renamed from: a */
    private static final char[] f11941a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* compiled from: DecodedBitStreamParser.java */
    /* renamed from: com.google.zxing.qrcode.decoder.d$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C4426a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11942a;

        static {
            int[] iArr = new int[EnumC4430h.values().length];
            f11942a = iArr;
            try {
                iArr[EnumC4430h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11942a[EnumC4430h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11942a[EnumC4430h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11942a[EnumC4430h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11942a[EnumC4430h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11942a[EnumC4430h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11942a[EnumC4430h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11942a[EnumC4430h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11942a[EnumC4430h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11942a[EnumC4430h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C7158e m27627a(byte[] bArr, C4432j c4432j, EnumC4428f enumC4428f, Map<EnumC4399d, ?> map) throws FormatException {
        EnumC4430h forBits;
        EnumC4430h enumC4430h;
        C7156c c7156c = new C7156c(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        boolean z = true;
        ArrayList arrayList = new ArrayList(1);
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        EnumC7157d enumC7157d = null;
        while (true) {
            try {
                if (c7156c.m19047a() < 4) {
                    forBits = EnumC4430h.TERMINATOR;
                } else {
                    forBits = EnumC4430h.forBits(c7156c.m19044d(4));
                }
                EnumC4430h enumC4430h2 = forBits;
                int[] iArr = C4426a.f11942a;
                switch (iArr[enumC4430h2.ordinal()]) {
                    case 5:
                        enumC4430h = enumC4430h2;
                        break;
                    case 6:
                    case 7:
                        z2 = z;
                        enumC4430h = enumC4430h2;
                        break;
                    case 8:
                        if (c7156c.m19047a() >= 16) {
                            int m19044d = c7156c.m19044d(8);
                            i2 = c7156c.m19044d(8);
                            i = m19044d;
                            enumC4430h = enumC4430h2;
                            break;
                        } else {
                            throw FormatException.m27702a();
                        }
                    case 9:
                        enumC7157d = EnumC7157d.getCharacterSetECIByValue(m27621g(c7156c));
                        if (enumC7157d != null) {
                            enumC4430h = enumC4430h2;
                            break;
                        } else {
                            throw FormatException.m27702a();
                        }
                    case 10:
                        int m19044d2 = c7156c.m19044d(4);
                        int m19044d3 = c7156c.m19044d(enumC4430h2.getCharacterCountBits(c4432j));
                        if (m19044d2 == z) {
                            m27624d(c7156c, sb2, m19044d3);
                        }
                        enumC4430h = enumC4430h2;
                        break;
                    default:
                        int m19044d4 = c7156c.m19044d(enumC4430h2.getCharacterCountBits(c4432j));
                        int i3 = iArr[enumC4430h2.ordinal()];
                        if (i3 == z) {
                            enumC4430h = enumC4430h2;
                            m27622f(c7156c, sb2, m19044d4);
                            break;
                        } else if (i3 == 2) {
                            enumC4430h = enumC4430h2;
                            m27626b(c7156c, sb2, m19044d4, z2);
                            break;
                        } else if (i3 == 3) {
                            enumC4430h = enumC4430h2;
                            m27625c(c7156c, sb2, m19044d4, enumC7157d, arrayList, map);
                            break;
                        } else if (i3 == 4) {
                            m27623e(c7156c, sb2, m19044d4);
                            enumC4430h = enumC4430h2;
                            break;
                        } else {
                            throw FormatException.m27702a();
                        }
                }
                if (enumC4430h == EnumC4430h.TERMINATOR) {
                    return new C7158e(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, enumC4428f == null ? null : enumC4428f.toString(), i, i2);
                }
                z = true;
            } catch (IllegalArgumentException unused) {
                throw FormatException.m27702a();
            }
        }
    }

    /* renamed from: b */
    private static void m27626b(C7156c c7156c, StringBuilder sb2, int i, boolean z) throws FormatException {
        while (i > 1) {
            if (c7156c.m19047a() >= 11) {
                int m19044d = c7156c.m19044d(11);
                sb2.append(m27620h(m19044d / 45));
                sb2.append(m27620h(m19044d % 45));
                i -= 2;
            } else {
                throw FormatException.m27702a();
            }
        }
        if (i == 1) {
            if (c7156c.m19047a() >= 6) {
                sb2.append(m27620h(c7156c.m19044d(6)));
            } else {
                throw FormatException.m27702a();
            }
        }
        if (z) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i2 = length + 1;
                        if (sb2.charAt(i2) == '%') {
                            sb2.deleteCharAt(i2);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m27625c(C7156c c7156c, StringBuilder sb2, int i, EnumC7157d enumC7157d, Collection<byte[]> collection, Map<EnumC4399d, ?> map) throws FormatException {
        String name;
        if ((i << 3) <= c7156c.m19047a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) c7156c.m19044d(8);
            }
            if (enumC7157d == null) {
                name = C7165l.m19009a(bArr, map);
            } else {
                name = enumC7157d.name();
            }
            try {
                sb2.append(new String(bArr, name));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m27702a();
            }
        }
        throw FormatException.m27702a();
    }

    /* renamed from: d */
    private static void m27624d(C7156c c7156c, StringBuilder sb2, int i) throws FormatException {
        if (i * 13 <= c7156c.m19047a()) {
            byte[] bArr = new byte[i * 2];
            int i2 = 0;
            while (i > 0) {
                int m19044d = c7156c.m19044d(13);
                int i3 = (m19044d % 96) | ((m19044d / 96) << 8);
                int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m27702a();
            }
        }
        throw FormatException.m27702a();
    }

    /* renamed from: e */
    private static void m27623e(C7156c c7156c, StringBuilder sb2, int i) throws FormatException {
        if (i * 13 <= c7156c.m19047a()) {
            byte[] bArr = new byte[i * 2];
            int i2 = 0;
            while (i > 0) {
                int m19044d = c7156c.m19044d(13);
                int i3 = (m19044d % 192) | ((m19044d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw FormatException.m27702a();
            }
        }
        throw FormatException.m27702a();
    }

    /* renamed from: f */
    private static void m27622f(C7156c c7156c, StringBuilder sb2, int i) throws FormatException {
        while (i >= 3) {
            if (c7156c.m19047a() >= 10) {
                int m19044d = c7156c.m19044d(10);
                if (m19044d < 1000) {
                    sb2.append(m27620h(m19044d / 100));
                    sb2.append(m27620h((m19044d / 10) % 10));
                    sb2.append(m27620h(m19044d % 10));
                    i -= 3;
                } else {
                    throw FormatException.m27702a();
                }
            } else {
                throw FormatException.m27702a();
            }
        }
        if (i == 2) {
            if (c7156c.m19047a() >= 7) {
                int m19044d2 = c7156c.m19044d(7);
                if (m19044d2 < 100) {
                    sb2.append(m27620h(m19044d2 / 10));
                    sb2.append(m27620h(m19044d2 % 10));
                    return;
                }
                throw FormatException.m27702a();
            }
            throw FormatException.m27702a();
        } else if (i == 1) {
            if (c7156c.m19047a() >= 4) {
                int m19044d3 = c7156c.m19044d(4);
                if (m19044d3 < 10) {
                    sb2.append(m27620h(m19044d3));
                    return;
                }
                throw FormatException.m27702a();
            }
            throw FormatException.m27702a();
        }
    }

    /* renamed from: g */
    private static int m27621g(C7156c c7156c) throws FormatException {
        int m19044d = c7156c.m19044d(8);
        if ((m19044d & 128) == 0) {
            return m19044d & 127;
        }
        if ((m19044d & 192) == 128) {
            return c7156c.m19044d(8) | ((m19044d & 63) << 8);
        }
        if ((m19044d & 224) == 192) {
            return c7156c.m19044d(16) | ((m19044d & 31) << 16);
        }
        throw FormatException.m27702a();
    }

    /* renamed from: h */
    private static char m27620h(int i) throws FormatException {
        char[] cArr = f11941a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw FormatException.m27702a();
    }
}
