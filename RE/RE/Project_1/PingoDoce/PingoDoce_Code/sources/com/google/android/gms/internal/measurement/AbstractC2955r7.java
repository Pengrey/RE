package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r7 */
/* loaded from: classes.dex */
public abstract class AbstractC2955r7 implements Iterable, Serializable {

    /* renamed from: x */
    public static final AbstractC2955r7 f7969x = new C2923p7(C3048x8.f8090b);

    /* renamed from: w */
    private int f7970w = 0;

    static {
        int i = C2731d7.f7705a;
        new C2939q7(null);
        new C2843k7();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static int m32147t(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Beginning index: ");
                sb2.append(i);
                sb2.append(" < 0");
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 < i) {
                StringBuilder sb3 = new StringBuilder(66);
                sb3.append("Beginning index larger than ending index: ");
                sb3.append(i);
                sb3.append(", ");
                sb3.append(i2);
                throw new IndexOutOfBoundsException(sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("End index: ");
                sb4.append(i2);
                sb4.append(" >= ");
                sb4.append(i3);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        }
        return i4;
    }

    /* renamed from: v */
    public static AbstractC2955r7 m32145v(byte[] bArr, int i, int i2) {
        m32147t(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C2923p7(bArr2);
    }

    /* renamed from: x */
    public static AbstractC2955r7 m32144x(String str) {
        return new C2923p7(str.getBytes(C3048x8.f8089a));
    }

    /* renamed from: b */
    public abstract byte mo32155b(int i);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract byte mo32154f(int i);

    /* renamed from: g */
    public abstract int mo32153g();

    /* renamed from: h */
    protected abstract int mo32152h(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.f7970w;
        if (i == 0) {
            int mo32153g = mo32153g();
            i = mo32152h(mo32153g, 0, mo32153g);
            if (i == 0) {
                i = 1;
            }
            this.f7970w = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2811i7(this);
    }

    /* renamed from: l */
    public abstract AbstractC2955r7 mo32151l(int i, int i2);

    /* renamed from: o */
    protected abstract String mo32150o(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo32149p(C2795h7 c2795h7) throws IOException;

    /* renamed from: q */
    public abstract boolean mo32148q();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo32153g());
        objArr[2] = mo32153g() <= 50 ? C2926pa.m32202a(this) : C2926pa.m32202a(mo32151l(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final int m32146u() {
        return this.f7970w;
    }

    /* renamed from: y */
    public final String m32143y(Charset charset) {
        return mo32153g() == 0 ? BuildConfig.VERSION_NAME : mo32150o(charset);
    }
}
