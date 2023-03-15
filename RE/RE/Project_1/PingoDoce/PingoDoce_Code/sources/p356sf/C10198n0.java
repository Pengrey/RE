package p356sf;

import p181jd.Intrinsics;
import p356sf.Buffer;
import sd.StringsJVM;
import tf.C10614g;

/* compiled from: -Util.kt */
/* renamed from: sf.n0 */
/* loaded from: classes2.dex */
public final class C10198n0 {

    /* renamed from: a */
    private static final int f26581a;

    static {
        new Buffer.C10183a();
        f26581a = -1234567890;
    }

    /* renamed from: a */
    public static final boolean m8598a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        Intrinsics.isThisObjectNull(bArr, "a");
        Intrinsics.isThisObjectNull(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m8597b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m8596c() {
        return f26581a;
    }

    /* renamed from: d */
    public static final int m8595d(ByteString byteString, int i) {
        Intrinsics.isThisObjectNull(byteString, "<this>");
        return i == f26581a ? byteString.size() : i;
    }

    /* renamed from: e */
    public static final int m8594e(byte[] bArr, int i) {
        Intrinsics.isThisObjectNull(bArr, "<this>");
        return i == f26581a ? bArr.length : i;
    }

    /* renamed from: f */
    public static final int m8593f(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: g */
    public static final long m8592g(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* renamed from: h */
    public static final short m8591h(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: i */
    public static final String m8590i(byte b) {
        String m8947m;
        m8947m = StringsJVM.m8947m(new char[]{C10614g.m7510f()[(b >> 4) & 15], C10614g.m7510f()[b & 15]});
        return m8947m;
    }

    /* renamed from: j */
    public static final String m8589j(int i) {
        String m8946n;
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C10614g.m7510f()[(i >> 28) & 15], C10614g.m7510f()[(i >> 24) & 15], C10614g.m7510f()[(i >> 20) & 15], C10614g.m7510f()[(i >> 16) & 15], C10614g.m7510f()[(i >> 12) & 15], C10614g.m7510f()[(i >> 8) & 15], C10614g.m7510f()[(i >> 4) & 15], C10614g.m7510f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        m8946n = StringsJVM.m8946n(cArr, i2, 8);
        return m8946n;
    }
}
