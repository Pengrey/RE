package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.x8 */
/* loaded from: classes.dex */
public final class C3048x8 {

    /* renamed from: a */
    static final Charset f8089a;

    /* renamed from: b */
    public static final byte[] f8090b;

    static {
        Charset.forName("US-ASCII");
        f8089a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8090b = bArr;
        ByteBuffer.wrap(bArr);
        int i = C3017v7.f8044a;
        try {
            new C2987t7(bArr, 0, 0, false, null).m32063c(0);
        } catch (zzkh e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m31829a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m31828b(byte[] bArr) {
        int length = bArr.length;
        int m31826d = m31826d(length, bArr, 0, length);
        if (m31826d == 0) {
            return 1;
        }
        return m31826d;
    }

    /* renamed from: c */
    public static int m31827c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m31826d(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Object m31825e(Object obj) {
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Object m31824f(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static Object m31823g(Object obj, Object obj2) {
        return ((InterfaceC2973s9) obj).mo32112b().mo32134y((InterfaceC2973s9) obj2).mo32135v();
    }

    /* renamed from: h */
    public static String m31822h(byte[] bArr) {
        return new String(bArr, f8089a);
    }

    /* renamed from: i */
    public static boolean m31821i(byte[] bArr) {
        return C2783gb.m32611e(bArr);
    }
}
