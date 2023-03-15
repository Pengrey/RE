package p129h3;

import kotlin.NoWhenBranchMatchedException;
import p297pd._Ranges;
import p327r3.EnumC9804h;

/* renamed from: h3.f */
/* loaded from: classes.dex */
public final class C5828f {

    /* compiled from: DecodeUtils.kt */
    /* renamed from: h3.f$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C5829a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16231a;

        static {
            int[] iArr = new int[EnumC9804h.values().length];
            iArr[EnumC9804h.FILL.ordinal()] = 1;
            iArr[EnumC9804h.FIT.ordinal()] = 2;
            f16231a = iArr;
        }
    }

    static {
        new C5828f();
    }

    private C5828f() {
    }

    /* renamed from: a */
    public static final int m22971a(int i, int i2, int i3, int i4, EnumC9804h enumC9804h) {
        int min;
        int m15005d;
        int highestOneBit = Integer.highestOneBit(i / i3);
        int highestOneBit2 = Integer.highestOneBit(i2 / i4);
        int i5 = C5829a.f16231a[enumC9804h.ordinal()];
        if (i5 == 1) {
            min = Math.min(highestOneBit, highestOneBit2);
        } else if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            min = Math.max(highestOneBit, highestOneBit2);
        }
        m15005d = _Ranges.m15005d(min, 1);
        return m15005d;
    }

    /* renamed from: b */
    public static final double m22970b(double d, double d2, double d3, double d4, EnumC9804h enumC9804h) {
        double d5 = d3 / d;
        double d6 = d4 / d2;
        int i = C5829a.f16231a[enumC9804h.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Math.min(d5, d6);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d5, d6);
    }

    /* renamed from: c */
    public static final double m22969c(int i, int i2, int i3, int i4, EnumC9804h enumC9804h) {
        double d = i3 / i;
        double d2 = i4 / i2;
        int i5 = C5829a.f16231a[enumC9804h.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return Math.min(d, d2);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d, d2);
    }
}
