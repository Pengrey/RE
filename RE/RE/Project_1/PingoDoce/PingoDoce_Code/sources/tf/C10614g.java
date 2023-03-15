package tf;

import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.ByteString;

/* compiled from: -ByteString.kt */
/* renamed from: tf.g */
/* loaded from: classes2.dex */
public final class C10614g {

    /* renamed from: a */
    private static final char[] f27355a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final /* synthetic */ int m7515a(byte[] bArr, int i) {
        return m7513c(bArr, i);
    }

    /* renamed from: b */
    public static final /* synthetic */ int m7514b(char c) {
        return m7511e(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0083 A[EDGE_INSN: B:262:0x0083->B:55:0x0083 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x021c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00df A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int m7513c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.C10614g.m7513c(byte[], int):int");
    }

    /* renamed from: d */
    public static final void m7512d(ByteString byteString, Buffer buffer, int i, int i2) {
        Intrinsics.isThisObjectNull(byteString, "<this>");
        Intrinsics.isThisObjectNull(buffer, "buffer");
        buffer.m8792v0(byteString.m8713i(), i, i2);
    }

    /* renamed from: e */
    private static final int m7511e(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: f */
    public static final char[] m7510f() {
        return f27355a;
    }
}
