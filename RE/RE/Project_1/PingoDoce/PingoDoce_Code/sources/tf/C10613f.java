package tf;

import p181jd.Intrinsics;
import p356sf.Buffer;
import p356sf.C10197m0;
import p356sf.Options;
import p356sf.Segment;

/* compiled from: -Buffer.kt */
/* renamed from: tf.f */
/* loaded from: classes2.dex */
public final class C10613f {

    /* renamed from: a */
    private static final byte[] f27354a = C10197m0.m8604a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m7520a() {
        return f27354a;
    }

    /* renamed from: b */
    public static final boolean m7519b(Segment segment, int i, byte[] bArr, int i2, int i3) {
        Intrinsics.isThisObjectNull(segment, "segment");
        Intrinsics.isThisObjectNull(bArr, "bytes");
        int i4 = segment.f26531c;
        byte[] bArr2 = segment.f26529a;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.f26534f;
                Intrinsics.ifNullDoSomething(segment);
                byte[] bArr3 = segment.f26529a;
                bArr2 = bArr3;
                i = segment.f26530b;
                i4 = segment.f26531c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: c */
    public static final String m7518c(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.m8811L(j2) == ((byte) 13)) {
                String mo8754l = buffer.mo8754l(j2);
                buffer.skip(2L);
                return mo8754l;
            }
        }
        String mo8754l2 = buffer.mo8754l(j);
        buffer.skip(1L);
        return mo8754l2;
    }

    /* renamed from: d */
    public static final int m7517d(Buffer buffer, Options options, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Segment segment;
        Intrinsics.isThisObjectNull(buffer, "<this>");
        Intrinsics.isThisObjectNull(options, "options");
        Segment segment2 = buffer.f26525w;
        if (segment2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment2.f26529a;
        int i5 = segment2.f26530b;
        int i6 = segment2.f26531c;
        int[] m8540o = options.m8540o();
        Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = m8540o[i8];
            int i11 = i9 + 1;
            int i12 = m8540o[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == m8540o[i11]) {
                        i2 = m8540o[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.f26534f;
                            Intrinsics.ifNullDoSomething(segment3);
                            i = segment3.f26530b;
                            bArr = segment3.f26529a;
                            i6 = segment3.f26531c;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != m8540o[i11]) {
                    return i7;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    Intrinsics.ifNullDoSomething(segment3);
                    Segment segment4 = segment3.f26534f;
                    Intrinsics.ifNullDoSomething(segment4);
                    i4 = segment4.f26530b;
                    byte[] bArr2 = segment4.f26529a;
                    i3 = segment4.f26531c;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else if (!z2) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    Segment segment5 = segment3;
                    i3 = i6;
                    i4 = i16;
                    segment = segment5;
                }
                if (z2) {
                    i2 = m8540o[i17];
                    i = i4;
                    i6 = i3;
                    segment3 = segment;
                    break;
                }
                i5 = i4;
                i6 = i3;
                i11 = i17;
                segment3 = segment;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    /* renamed from: e */
    public static /* synthetic */ int m7516e(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m7517d(buffer, options, z);
    }
}
