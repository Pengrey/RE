package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import p173j5.C6304a;

/* renamed from: com.facebook.shimmer.a */
/* loaded from: classes.dex */
public class C2330a {

    /* renamed from: a */
    final float[] f6747a = new float[4];

    /* renamed from: b */
    final int[] f6748b = new int[4];

    /* renamed from: c */
    int f6749c;

    /* renamed from: d */
    int f6750d;

    /* renamed from: e */
    int f6751e;

    /* renamed from: f */
    int f6752f;

    /* renamed from: g */
    int f6753g;

    /* renamed from: h */
    int f6754h;

    /* renamed from: i */
    float f6755i;

    /* renamed from: j */
    float f6756j;

    /* renamed from: k */
    float f6757k;

    /* renamed from: l */
    float f6758l;

    /* renamed from: m */
    float f6759m;

    /* renamed from: n */
    boolean f6760n;

    /* renamed from: o */
    boolean f6761o;

    /* renamed from: p */
    boolean f6762p;

    /* renamed from: q */
    int f6763q;

    /* renamed from: r */
    int f6764r;

    /* renamed from: s */
    long f6765s;

    /* renamed from: t */
    long f6766t;

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.a$a */
    /* loaded from: classes.dex */
    public static class C2331a extends AbstractC2332b<C2331a> {
        public C2331a() {
            this.f6767a.f6762p = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.C2330a.AbstractC2332b
        /* renamed from: v */
        public C2331a mo33900d() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.a$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2332b<T extends AbstractC2332b<T>> {

        /* renamed from: a */
        final C2330a f6767a = new C2330a();

        /* renamed from: b */
        private static float m33919b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: a */
        public C2330a m33920a() {
            this.f6767a.m33924b();
            this.f6767a.m33923c();
            return this.f6767a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public T mo33901c(TypedArray typedArray) {
            int i = C6304a.f17296e;
            if (typedArray.hasValue(i)) {
                m33916g(typedArray.getBoolean(i, this.f6767a.f6760n));
            }
            int i2 = C6304a.f17293b;
            if (typedArray.hasValue(i2)) {
                m33918e(typedArray.getBoolean(i2, this.f6767a.f6761o));
            }
            int i3 = C6304a.f17294c;
            if (typedArray.hasValue(i3)) {
                m33917f(typedArray.getFloat(i3, 0.3f));
            }
            int i4 = C6304a.f17304m;
            if (typedArray.hasValue(i4)) {
                m33909n(typedArray.getFloat(i4, 1.0f));
            }
            int i5 = C6304a.f17300i;
            if (typedArray.hasValue(i5)) {
                m33913j(typedArray.getInt(i5, (int) this.f6767a.f6765s));
            }
            int i6 = C6304a.f17307p;
            if (typedArray.hasValue(i6)) {
                m33907p(typedArray.getInt(i6, this.f6767a.f6763q));
            }
            int i7 = C6304a.f17308q;
            if (typedArray.hasValue(i7)) {
                m33906q(typedArray.getInt(i7, (int) this.f6767a.f6766t));
            }
            int i8 = C6304a.f17309r;
            if (typedArray.hasValue(i8)) {
                m33905r(typedArray.getInt(i8, this.f6767a.f6764r));
            }
            int i9 = C6304a.f17298g;
            if (typedArray.hasValue(i9)) {
                int i10 = typedArray.getInt(i9, this.f6767a.f6749c);
                if (i10 == 1) {
                    m33915h(1);
                } else if (i10 == 2) {
                    m33915h(2);
                } else if (i10 != 3) {
                    m33915h(0);
                } else {
                    m33915h(3);
                }
            }
            int i11 = C6304a.f17310s;
            if (typedArray.hasValue(i11)) {
                if (typedArray.getInt(i11, this.f6767a.f6752f) != 1) {
                    m33904s(0);
                } else {
                    m33904s(1);
                }
            }
            int i12 = C6304a.f17299h;
            if (typedArray.hasValue(i12)) {
                m33914i(typedArray.getFloat(i12, this.f6767a.f6758l));
            }
            int i13 = C6304a.f17302k;
            if (typedArray.hasValue(i13)) {
                m33911l(typedArray.getDimensionPixelSize(i13, this.f6767a.f6753g));
            }
            int i14 = C6304a.f17301j;
            if (typedArray.hasValue(i14)) {
                m33912k(typedArray.getDimensionPixelSize(i14, this.f6767a.f6754h));
            }
            int i15 = C6304a.f17306o;
            if (typedArray.hasValue(i15)) {
                m33908o(typedArray.getFloat(i15, this.f6767a.f6757k));
            }
            int i16 = C6304a.f17312u;
            if (typedArray.hasValue(i16)) {
                m33902u(typedArray.getFloat(i16, this.f6767a.f6755i));
            }
            int i17 = C6304a.f17303l;
            if (typedArray.hasValue(i17)) {
                m33910m(typedArray.getFloat(i17, this.f6767a.f6756j));
            }
            int i18 = C6304a.f17311t;
            if (typedArray.hasValue(i18)) {
                m33903t(typedArray.getFloat(i18, this.f6767a.f6759m));
            }
            return mo33900d();
        }

        /* renamed from: d */
        protected abstract T mo33900d();

        /* renamed from: e */
        public T m33918e(boolean z) {
            this.f6767a.f6761o = z;
            return mo33900d();
        }

        /* renamed from: f */
        public T m33917f(float f) {
            C2330a c2330a = this.f6767a;
            c2330a.f6751e = (((int) (m33919b(0.0f, 1.0f, f) * 255.0f)) << 24) | (c2330a.f6751e & 16777215);
            return mo33900d();
        }

        /* renamed from: g */
        public T m33916g(boolean z) {
            this.f6767a.f6760n = z;
            return mo33900d();
        }

        /* renamed from: h */
        public T m33915h(int i) {
            this.f6767a.f6749c = i;
            return mo33900d();
        }

        /* renamed from: i */
        public T m33914i(float f) {
            if (f >= 0.0f) {
                this.f6767a.f6758l = f;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        /* renamed from: j */
        public T m33913j(long j) {
            if (j >= 0) {
                this.f6767a.f6765s = j;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        /* renamed from: k */
        public T m33912k(int i) {
            if (i >= 0) {
                this.f6767a.f6754h = i;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        /* renamed from: l */
        public T m33911l(int i) {
            if (i >= 0) {
                this.f6767a.f6753g = i;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        /* renamed from: m */
        public T m33910m(float f) {
            if (f >= 0.0f) {
                this.f6767a.f6756j = f;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        /* renamed from: n */
        public T m33909n(float f) {
            C2330a c2330a = this.f6767a;
            c2330a.f6750d = (((int) (m33919b(0.0f, 1.0f, f) * 255.0f)) << 24) | (c2330a.f6750d & 16777215);
            return mo33900d();
        }

        /* renamed from: o */
        public T m33908o(float f) {
            if (f >= 0.0f) {
                this.f6767a.f6757k = f;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* renamed from: p */
        public T m33907p(int i) {
            this.f6767a.f6763q = i;
            return mo33900d();
        }

        /* renamed from: q */
        public T m33906q(long j) {
            if (j >= 0) {
                this.f6767a.f6766t = j;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        /* renamed from: r */
        public T m33905r(int i) {
            this.f6767a.f6764r = i;
            return mo33900d();
        }

        /* renamed from: s */
        public T m33904s(int i) {
            this.f6767a.f6752f = i;
            return mo33900d();
        }

        /* renamed from: t */
        public T m33903t(float f) {
            this.f6767a.f6759m = f;
            return mo33900d();
        }

        /* renamed from: u */
        public T m33902u(float f) {
            if (f >= 0.0f) {
                this.f6767a.f6755i = f;
                return mo33900d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.a$c */
    /* loaded from: classes.dex */
    public static class C2333c extends AbstractC2332b<C2333c> {
        public C2333c() {
            this.f6767a.f6762p = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.facebook.shimmer.C2330a.AbstractC2332b
        /* renamed from: v */
        public C2333c mo33901c(TypedArray typedArray) {
            super.mo33901c(typedArray);
            int i = C6304a.f17295d;
            if (typedArray.hasValue(i)) {
                m33897x(typedArray.getColor(i, this.f6767a.f6751e));
            }
            int i2 = C6304a.f17305n;
            if (typedArray.hasValue(i2)) {
                m33896y(typedArray.getColor(i2, this.f6767a.f6750d));
            }
            return mo33900d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.C2330a.AbstractC2332b
        /* renamed from: w */
        public C2333c mo33900d() {
            return this;
        }

        /* renamed from: x */
        public C2333c m33897x(int i) {
            C2330a c2330a = this.f6767a;
            c2330a.f6751e = (i & 16777215) | (c2330a.f6751e & (-16777216));
            return mo33900d();
        }

        /* renamed from: y */
        public C2333c m33896y(int i) {
            this.f6767a.f6750d = i;
            return mo33900d();
        }
    }

    C2330a() {
        new RectF();
        this.f6749c = 0;
        this.f6750d = -1;
        this.f6751e = 1291845631;
        this.f6752f = 0;
        this.f6753g = 0;
        this.f6754h = 0;
        this.f6755i = 1.0f;
        this.f6756j = 1.0f;
        this.f6757k = 0.0f;
        this.f6758l = 0.5f;
        this.f6759m = 20.0f;
        this.f6760n = true;
        this.f6761o = true;
        this.f6762p = true;
        this.f6763q = -1;
        this.f6764r = 1;
        this.f6765s = 1000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m33925a(int i) {
        int i2 = this.f6754h;
        return i2 > 0 ? i2 : Math.round(this.f6756j * i);
    }

    /* renamed from: b */
    void m33924b() {
        if (this.f6752f != 1) {
            int[] iArr = this.f6748b;
            int i = this.f6751e;
            iArr[0] = i;
            int i2 = this.f6750d;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f6748b;
        int i3 = this.f6750d;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f6751e;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* renamed from: c */
    void m33923c() {
        if (this.f6752f != 1) {
            this.f6747a[0] = Math.max(((1.0f - this.f6757k) - this.f6758l) / 2.0f, 0.0f);
            this.f6747a[1] = Math.max(((1.0f - this.f6757k) - 0.001f) / 2.0f, 0.0f);
            this.f6747a[2] = Math.min(((this.f6757k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f6747a[3] = Math.min(((this.f6757k + 1.0f) + this.f6758l) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f6747a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f6757k, 1.0f);
        this.f6747a[2] = Math.min(this.f6757k + this.f6758l, 1.0f);
        this.f6747a[3] = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m33922d(int i) {
        int i2 = this.f6753g;
        return i2 > 0 ? i2 : Math.round(this.f6755i * i);
    }
}
