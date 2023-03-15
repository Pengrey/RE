package p356sf;

import p181jd.Intrinsics;
import sd.C10150d;

/* compiled from: -JvmPlatform.kt */
/* renamed from: sf.m0 */
/* loaded from: classes2.dex */
public final class C10197m0 {
    /* renamed from: a */
    public static final byte[] m8604a(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        byte[] bytes = str.getBytes(C10150d.f26472b);
        Intrinsics.checkIfNull(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m8603b(byte[] bArr) {
        Intrinsics.isThisObjectNull(bArr, "<this>");
        return new String(bArr, C10150d.f26472b);
    }
}
