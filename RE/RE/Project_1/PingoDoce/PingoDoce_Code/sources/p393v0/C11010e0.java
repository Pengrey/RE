package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;

/* renamed from: v0.e0 */
/* loaded from: classes.dex */
public final class C11010e0 implements Comparable<C11010e0> {

    /* renamed from: w */
    public static final C11011a f28344w = new C11011a(null);

    /* renamed from: x */
    private static final float f28345x;

    /* compiled from: Float16.kt */
    /* renamed from: v0.e0$a */
    /* loaded from: classes.dex */
    public static final class C11011a {
        private C11011a() {
        }

        public /* synthetic */ C11011a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final short m6548b(float f) {
            int i;
            int i2;
            int floatToRawIntBits = Float.floatToRawIntBits(f);
            int i3 = floatToRawIntBits >>> 31;
            int i4 = (floatToRawIntBits >>> 23) & 255;
            int i5 = floatToRawIntBits & 8388607;
            if (i4 == 255) {
                i = i5 != 0 ? 512 : 0;
                r3 = 31;
            } else {
                int i6 = (i4 - 127) + 15;
                if (i6 >= 31) {
                    r3 = 49;
                    i = 0;
                } else if (i6 > 0) {
                    int i7 = i5 >> 13;
                    if ((i5 & 4096) != 0) {
                        i2 = (((i6 << 10) | i7) + 1) | (i3 << 15);
                        return (short) i2;
                    }
                    i = i7;
                    r3 = i6;
                } else if (i6 < -10) {
                    i = 0;
                } else {
                    int i8 = (i5 | 8388608) >> (1 - i6);
                    if ((i8 & 4096) != 0) {
                        i8 += 8192;
                    }
                    i = i8 >> 13;
                }
            }
            i2 = i | (i3 << 15) | (r3 << 10);
            return (short) i2;
        }
    }

    static {
        m6551c((short) 5120);
        m6551c((short) -1025);
        m6551c((short) 31743);
        m6551c((short) 1024);
        m6551c((short) 1);
        m6551c((short) 32256);
        m6551c((short) -1024);
        m6551c(Short.MIN_VALUE);
        m6551c((short) 31744);
        m6551c((short) 0);
        m6552b(1.0f);
        m6552b(-1.0f);
        C6432f c6432f = C6432f.f17524a;
        f28345x = Float.intBitsToFloat(1056964608);
    }

    /* renamed from: b */
    public static short m6552b(float f) {
        return m6551c(f28344w.m6548b(f));
    }

    /* renamed from: c */
    public static short m6551c(short s) {
        return s;
    }

    /* renamed from: d */
    public static final float m6550d(short s) {
        int i;
        int i2;
        int i3 = s & 65535;
        int i4 = 32768 & i3;
        int i5 = (i3 >>> 10) & 31;
        int i6 = i3 & 1023;
        int i7 = 0;
        if (i5 != 0) {
            int i8 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i = (i5 - 15) + 127;
            }
            int i9 = i8;
            i7 = i;
            i2 = i9;
        } else if (i6 != 0) {
            C6432f c6432f = C6432f.f17524a;
            float intBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - f28345x;
            return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i2 = 0;
        }
        int i10 = i2 | (i4 << 16) | (i7 << 23);
        C6432f c6432f2 = C6432f.f17524a;
        return Float.intBitsToFloat(i10);
    }
}
