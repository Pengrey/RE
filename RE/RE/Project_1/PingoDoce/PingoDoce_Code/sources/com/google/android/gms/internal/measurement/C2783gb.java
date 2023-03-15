package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.gb */
/* loaded from: classes.dex */
public final class C2783gb {

    /* renamed from: a */
    private static final AbstractC2735db f7758a;

    static {
        if (C2703bb.m32859C() && C2703bb.m32858D()) {
            int i = C2731d7.f7705a;
        }
        f7758a = new C2751eb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ int m32615a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b <= -12 && b2 <= -65) {
                    return b ^ (b2 << 8);
                }
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b <= -12 && b3 <= -65 && b4 <= -65) {
                    return ((b3 << 8) ^ b) ^ (b4 << 16);
                }
            } else {
                throw new AssertionError();
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m32614b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2783gb.m32614b(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m32613c(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new C2767fb(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m32612d(byte[] bArr, int i, int i2) throws zzkh {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!C2719cb.m32802d(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (C2719cb.m32802d(b2)) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    i = i5;
                    while (true) {
                        i4 = i6;
                        if (i < i3) {
                            byte b3 = bArr[i];
                            if (!C2719cb.m32802d(b3)) {
                                break;
                            }
                            i++;
                            i6 = i4 + 1;
                            cArr[i4] = (char) b3;
                        }
                    }
                } else if (b2 < -32) {
                    if (i5 < i3) {
                        C2719cb.m32804b(b2, bArr[i5], cArr, i4);
                        i = i5 + 1;
                        i4++;
                    } else {
                        throw zzkh.m31638c();
                    }
                } else if (b2 < -16) {
                    if (i5 < i3 - 1) {
                        int i7 = i5 + 1;
                        C2719cb.m32803c(b2, bArr[i5], bArr[i7], cArr, i4);
                        i = i7 + 1;
                        i4++;
                    } else {
                        throw zzkh.m31638c();
                    }
                } else if (i5 < i3 - 2) {
                    int i8 = i5 + 1;
                    int i9 = i8 + 1;
                    C2719cb.m32805a(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                    i4 += 2;
                    i = i9 + 1;
                } else {
                    throw zzkh.m31638c();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m32611e(byte[] bArr) {
        return f7758a.m32780b(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m32610f(byte[] bArr, int i, int i2) {
        return f7758a.m32780b(bArr, i, i2);
    }
}
