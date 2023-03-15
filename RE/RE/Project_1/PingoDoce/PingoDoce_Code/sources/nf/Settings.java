package nf;

import com.google.crypto.tink.shaded.protobuf.Reader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: nf.d */
/* loaded from: classes2.dex */
public final class Settings {

    /* renamed from: a */
    private int f20331a;

    /* renamed from: b */
    private final int[] f20332b = new int[10];

    /* compiled from: Settings.kt */
    /* renamed from: nf.d$a */
    /* loaded from: classes2.dex */
    public static final class C7707a {
        private C7707a() {
        }

        public /* synthetic */ C7707a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7707a(null);
    }

    /* renamed from: a */
    public final int m17649a(int i) {
        return this.f20332b[i];
    }

    /* renamed from: b */
    public final int m17648b() {
        if ((this.f20331a & 2) != 0) {
            return this.f20332b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m17647c() {
        if ((this.f20331a & 128) != 0) {
            return this.f20332b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m17646d() {
        return (this.f20331a & 16) != 0 ? this.f20332b[4] : Reader.READ_DONE;
    }

    /* renamed from: e */
    public final int m17645e(int i) {
        return (this.f20331a & 32) != 0 ? this.f20332b[5] : i;
    }

    /* renamed from: f */
    public final boolean m17644f(int i) {
        return ((1 << i) & this.f20331a) != 0;
    }

    /* renamed from: g */
    public final void m17643g(Settings settings) {
        Intrinsics.isThisObjectNull(settings, "other");
        int i = 0;
        while (i < 10) {
            int i2 = i + 1;
            if (settings.m17644f(i)) {
                m17642h(i, settings.m17649a(i));
            }
            i = i2;
        }
    }

    /* renamed from: h */
    public final Settings m17642h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f20332b;
            if (i < iArr.length) {
                this.f20331a = (1 << i) | this.f20331a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m17641i() {
        return Integer.bitCount(this.f20331a);
    }
}
