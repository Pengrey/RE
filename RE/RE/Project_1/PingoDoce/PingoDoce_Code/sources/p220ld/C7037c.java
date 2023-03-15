package p220ld;

import com.google.crypto.tink.shaded.protobuf.Reader;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ld.c */
/* loaded from: classes2.dex */
public class C7037c extends C7036b {
    /* renamed from: a */
    public static int m19532a(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m19531b(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Reader.READ_DONE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    /* renamed from: c */
    public static int m19530c(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }
}
