package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p356sf.InterfaceC10186d;

/* renamed from: com.squareup.moshi.m */
/* loaded from: classes2.dex */
public abstract class AbstractC4483m implements Closeable, Flushable {

    /* renamed from: A */
    String f12098A;

    /* renamed from: B */
    boolean f12099B;

    /* renamed from: C */
    boolean f12100C;

    /* renamed from: D */
    boolean f12101D;

    /* renamed from: w */
    int f12102w = 0;

    /* renamed from: x */
    int[] f12103x = new int[32];

    /* renamed from: y */
    String[] f12104y = new String[32];

    /* renamed from: z */
    int[] f12105z = new int[32];

    /* renamed from: E */
    int f12106E = -1;

    @CheckReturnValue
    /* renamed from: L */
    public static AbstractC4483m m27415L(InterfaceC10186d interfaceC10186d) {
        return new C4481k(interfaceC10186d);
    }

    @CheckReturnValue
    /* renamed from: E */
    public final boolean m27418E() {
        return this.f12099B;
    }

    /* renamed from: F */
    public abstract AbstractC4483m mo27417F(String str) throws IOException;

    /* renamed from: H */
    public abstract AbstractC4483m mo27416H() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final int m27414M() {
        int i = this.f12102w;
        if (i != 0) {
            return this.f12103x[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: P */
    public final void m27413P() throws IOException {
        int m27414M = m27414M();
        if (m27414M != 5 && m27414M != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f12101D = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final void m27412R(int i) {
        int[] iArr = this.f12103x;
        int i2 = this.f12102w;
        this.f12102w = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public final void m27411W(int i) {
        this.f12103x[this.f12102w - 1] = i;
    }

    /* renamed from: X */
    public final void m27410X(boolean z) {
        this.f12099B = z;
    }

    /* renamed from: a */
    public abstract AbstractC4483m mo27409a() throws IOException;

    /* renamed from: a0 */
    public final void m27408a0(boolean z) {
        this.f12100C = z;
    }

    /* renamed from: b0 */
    public abstract AbstractC4483m mo27407b0(double d) throws IOException;

    /* renamed from: c */
    public abstract AbstractC4483m mo27406c() throws IOException;

    /* renamed from: d0 */
    public abstract AbstractC4483m mo27405d0(long j) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m27404e() {
        int i = this.f12102w;
        int[] iArr = this.f12103x;
        if (i != iArr.length) {
            return false;
        }
        if (i != 256) {
            this.f12103x = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f12104y;
            this.f12104y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f12105z;
            this.f12105z = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (this instanceof C4482l) {
                C4482l c4482l = (C4482l) this;
                Object[] objArr = c4482l.f12096F;
                c4482l.f12096F = Arrays.copyOf(objArr, objArr.length * 2);
                return true;
            }
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + m27398v() + ": circular reference?");
    }

    /* renamed from: e0 */
    public abstract AbstractC4483m mo27403e0(@Nullable Number number) throws IOException;

    /* renamed from: f0 */
    public abstract AbstractC4483m mo27402f0(@Nullable String str) throws IOException;

    /* renamed from: h */
    public abstract AbstractC4483m mo27401h() throws IOException;

    /* renamed from: j0 */
    public abstract AbstractC4483m mo27400j0(boolean z) throws IOException;

    /* renamed from: t */
    public abstract AbstractC4483m mo27399t() throws IOException;

    @CheckReturnValue
    /* renamed from: v */
    public final String m27398v() {
        return C4479i.m27460a(this.f12102w, this.f12103x, this.f12104y, this.f12105z);
    }

    @CheckReturnValue
    /* renamed from: y */
    public final boolean m27397y() {
        return this.f12100C;
    }
}
