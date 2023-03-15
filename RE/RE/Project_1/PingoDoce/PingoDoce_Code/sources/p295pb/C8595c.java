package p295pb;

import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import p239mb.C7156c;
import p239mb.C7158e;

/* renamed from: pb.c */
/* loaded from: classes2.dex */
final class C8595c {

    /* renamed from: b */
    private static final char[] f22201b;

    /* renamed from: d */
    private static final char[] f22203d;

    /* renamed from: a */
    private static final char[] f22200a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    private static final char[] f22202c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    private static final char[] f22204e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* compiled from: DecodedBitStreamParser.java */
    /* renamed from: pb.c$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C8596a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22205a;

        static {
            int[] iArr = new int[EnumC8597b.values().length];
            f22205a = iArr;
            try {
                iArr[EnumC8597b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22205a[EnumC8597b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22205a[EnumC8597b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22205a[EnumC8597b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22205a[EnumC8597b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodedBitStreamParser.java */
    /* renamed from: pb.c$b */
    /* loaded from: classes2.dex */
    public enum EnumC8597b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f22201b = cArr;
        f22203d = cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7158e m15063a(byte[] bArr) throws FormatException {
        C7156c c7156c = new C7156c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        EnumC8597b enumC8597b = EnumC8597b.ASCII_ENCODE;
        do {
            EnumC8597b enumC8597b2 = EnumC8597b.ASCII_ENCODE;
            if (enumC8597b == enumC8597b2) {
                enumC8597b = m15061c(c7156c, sb2, sb3);
            } else {
                int i = C8596a.f22205a[enumC8597b.ordinal()];
                if (i == 1) {
                    m15059e(c7156c, sb2);
                } else if (i == 2) {
                    m15057g(c7156c, sb2);
                } else if (i == 3) {
                    m15062b(c7156c, sb2);
                } else if (i == 4) {
                    m15058f(c7156c, sb2);
                } else if (i == 5) {
                    m15060d(c7156c, sb2, arrayList);
                } else {
                    throw FormatException.m27702a();
                }
                enumC8597b = enumC8597b2;
            }
            if (enumC8597b == EnumC8597b.PAD_ENCODE) {
                break;
            }
        } while (c7156c.m19047a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String sb4 = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new C7158e(bArr, sb4, arrayList, null);
    }

    /* renamed from: b */
    private static void m15062b(C7156c c7156c, StringBuilder sb2) throws FormatException {
        int m19044d;
        int[] iArr = new int[3];
        while (c7156c.m19047a() != 8 && (m19044d = c7156c.m19044d(8)) != 254) {
            m15056h(m19044d, c7156c.m19044d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb2.append('\r');
                } else if (i2 == 1) {
                    sb2.append('*');
                } else if (i2 == 2) {
                    sb2.append('>');
                } else if (i2 == 3) {
                    sb2.append(' ');
                } else if (i2 < 14) {
                    sb2.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb2.append((char) (i2 + 51));
                } else {
                    throw FormatException.m27702a();
                }
            }
            if (c7156c.m19047a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static EnumC8597b m15061c(C7156c c7156c, StringBuilder sb2, StringBuilder sb3) throws FormatException {
        boolean z = false;
        do {
            int m19044d = c7156c.m19044d(8);
            if (m19044d == 0) {
                throw FormatException.m27702a();
            }
            if (m19044d > 128) {
                if (m19044d != 129) {
                    if (m19044d <= 229) {
                        int i = m19044d - 130;
                        if (i < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i);
                    } else {
                        switch (m19044d) {
                            case 230:
                                return EnumC8597b.C40_ENCODE;
                            case 231:
                                return EnumC8597b.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z = true;
                                break;
                            case 236:
                                sb2.append("[)>\u001e05\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb2.append("[)>\u001e06\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return EnumC8597b.ANSIX12_ENCODE;
                            case 239:
                                return EnumC8597b.TEXT_ENCODE;
                            case 240:
                                return EnumC8597b.EDIFACT_ENCODE;
                            default:
                                if (m19044d != 254 || c7156c.m19047a() != 0) {
                                    throw FormatException.m27702a();
                                }
                                break;
                        }
                    }
                } else {
                    return EnumC8597b.PAD_ENCODE;
                }
            } else {
                if (z) {
                    m19044d += 128;
                }
                sb2.append((char) (m19044d - 1));
                return EnumC8597b.ASCII_ENCODE;
            }
        } while (c7156c.m19047a() > 0);
        return EnumC8597b.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m15060d(C7156c c7156c, StringBuilder sb2, Collection<byte[]> collection) throws FormatException {
        int m19045c = c7156c.m19045c() + 1;
        int i = m19045c + 1;
        int m15055i = m15055i(c7156c.m19044d(8), m19045c);
        if (m15055i == 0) {
            m15055i = c7156c.m19047a() / 8;
        } else if (m15055i >= 250) {
            m15055i = ((m15055i - 249) * 250) + m15055i(c7156c.m19044d(8), i);
            i++;
        }
        if (m15055i >= 0) {
            byte[] bArr = new byte[m15055i];
            int i2 = 0;
            while (i2 < m15055i) {
                if (c7156c.m19047a() >= 8) {
                    bArr[i2] = (byte) m15055i(c7156c.m19044d(8), i);
                    i2++;
                    i++;
                } else {
                    throw FormatException.m27702a();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
            }
        }
        throw FormatException.m27702a();
    }

    /* renamed from: e */
    private static void m15059e(C7156c c7156c, StringBuilder sb2) throws FormatException {
        int m19044d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c7156c.m19047a() != 8 && (m19044d = c7156c.m19044d(8)) != 254) {
            m15056h(m19044d, c7156c.m19044d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f22201b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb2.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb2.append(c);
                                }
                            } else if (i3 == 27) {
                                sb2.append((char) 29);
                            } else if (i3 != 30) {
                                throw FormatException.m27702a();
                            } else {
                                z = true;
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw FormatException.m27702a();
                        } else {
                            if (z) {
                                sb2.append((char) (i3 + 224));
                                z = false;
                                i = 0;
                            } else {
                                sb2.append((char) (i3 + 96));
                                i = 0;
                            }
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f22200a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb2.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb2.append(c2);
                        }
                    } else {
                        throw FormatException.m27702a();
                    }
                }
            }
            if (c7156c.m19047a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m15058f(C7156c c7156c, StringBuilder sb2) {
        while (c7156c.m19047a() > 16) {
            for (int i = 0; i < 4; i++) {
                int m19044d = c7156c.m19044d(6);
                if (m19044d == 31) {
                    int m19046b = 8 - c7156c.m19046b();
                    if (m19046b != 8) {
                        c7156c.m19044d(m19046b);
                        return;
                    }
                    return;
                }
                if ((m19044d & 32) == 0) {
                    m19044d |= 64;
                }
                sb2.append((char) m19044d);
            }
            if (c7156c.m19047a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    private static void m15057g(C7156c c7156c, StringBuilder sb2) throws FormatException {
        int m19044d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c7156c.m19047a() != 8 && (m19044d = c7156c.m19044d(8)) != 254) {
            m15056h(m19044d, c7156c.m19044d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f22203d;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb2.append((char) (c + 128));
                                    z = false;
                                } else {
                                    sb2.append(c);
                                }
                            } else if (i3 == 27) {
                                sb2.append((char) 29);
                            } else if (i3 != 30) {
                                throw FormatException.m27702a();
                            } else {
                                z = true;
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = f22204e;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb2.append((char) (c2 + 128));
                                    z = false;
                                    i = 0;
                                } else {
                                    sb2.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw FormatException.m27702a();
                            }
                        } else {
                            throw FormatException.m27702a();
                        }
                    } else if (z) {
                        sb2.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        sb2.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f22202c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb2.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb2.append(c3);
                        }
                    } else {
                        throw FormatException.m27702a();
                    }
                }
            }
            if (c7156c.m19047a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m15056h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m15055i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
