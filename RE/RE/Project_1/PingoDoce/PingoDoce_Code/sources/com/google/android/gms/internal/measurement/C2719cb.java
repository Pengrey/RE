package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.cb */
/* loaded from: classes.dex */
final class C2719cb {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m32805a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkh {
        if (!m32801e(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !m32801e(b3) && !m32801e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzkh.m31638c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m32804b(byte b, byte b2, char[] cArr, int i) throws zzkh {
        if (b >= -62 && !m32801e(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzkh.m31638c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m32803c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkh {
        if (!m32801e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m32801e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkh.m31638c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ boolean m32802d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m32801e(byte b) {
        return b > -65;
    }
}
