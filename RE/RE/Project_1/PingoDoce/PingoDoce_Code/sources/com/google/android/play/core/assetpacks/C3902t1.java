package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import p031b9.C1863t;
import p060d9.C4754a;
import p464y8.InterfaceC13136a;

/* renamed from: com.google.android.play.core.assetpacks.t1 */
/* loaded from: classes.dex */
public final class C3902t1 {

    /* renamed from: a */
    private static InterfaceC13136a f11158a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m28637a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        C1863t.m35249a(th2, th3);
                    }
                    throw th2;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized InterfaceC13136a m28636b(Context context) {
        InterfaceC13136a interfaceC13136a;
        synchronized (C3902t1.class) {
            if (f11158a == null) {
                C3873m0 c3873m0 = new C3873m0(null);
                c3873m0.m28693b(new C3911v2(C4754a.m26695a(context)));
                f11158a = c3873m0.m28694a();
            }
            interfaceC13136a = f11158a;
        }
        return interfaceC13136a;
    }

    /* renamed from: c */
    public static boolean m28635c(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m28634d(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i != 6 || i2 == 6 || i2 == 5) {
            if (i != 4 || i2 == 4) {
                if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
                    return true;
                }
                if (i == 2) {
                    return i2 == 1 || i2 == 8;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static long m28633e(byte[] bArr, int i) {
        return ((m28631g(bArr, i + 2) << 16) | m28631g(bArr, i)) & 4294967295L;
    }

    /* renamed from: f */
    public static boolean m28632f(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m28631g(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: h */
    public static boolean m28630h(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
