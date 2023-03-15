package kotlinx.coroutines.internal;

import com.google.crypto.tink.shaded.protobuf.Reader;
import sd.StringNumberConversions;

/* compiled from: SystemProps.common.kt */
/* renamed from: kotlinx.coroutines.internal.k0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6873k0 {
    /* renamed from: a */
    public static final int m19941a(String str, int i, int i2, int i3) {
        return (int) C6869i0.m19963c(str, i, i2, i3);
    }

    /* renamed from: b */
    public static final long m19940b(String str, long j, long j2, long j3) {
        Long m8952k;
        String m19962d = C6869i0.m19962d(str);
        if (m19962d == null) {
            return j;
        }
        m8952k = StringNumberConversions.m8952k(m19962d);
        if (m8952k == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m19962d + '\'').toString());
        }
        long longValue = m8952k.longValue();
        boolean z = false;
        if (j2 <= longValue && longValue <= j3) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m19939c(String str, boolean z) {
        String m19962d = C6869i0.m19962d(str);
        return m19962d != null ? Boolean.parseBoolean(m19962d) : z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m19938d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Reader.READ_DONE;
        }
        return C6869i0.m19964b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m19937e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C6869i0.m19963c(str, j, j4, j3);
    }
}
