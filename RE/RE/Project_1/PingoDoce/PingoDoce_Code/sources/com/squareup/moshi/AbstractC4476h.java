package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10187e;
import p356sf.Options;

/* renamed from: com.squareup.moshi.h */
/* loaded from: classes2.dex */
public abstract class AbstractC4476h implements Closeable {

    /* renamed from: A */
    boolean f12073A;

    /* renamed from: B */
    boolean f12074B;

    /* renamed from: w */
    int f12075w;

    /* renamed from: x */
    int[] f12076x = new int[32];

    /* renamed from: y */
    String[] f12077y = new String[32];

    /* renamed from: z */
    int[] f12078z = new int[32];

    /* compiled from: JsonReader.java */
    /* renamed from: com.squareup.moshi.h$a */
    /* loaded from: classes2.dex */
    public static final class C4477a {

        /* renamed from: a */
        final String[] f12079a;

        /* renamed from: b */
        final Options f12080b;

        private C4477a(String[] strArr, Options options) {
            this.f12079a = strArr;
            this.f12080b = options;
        }

        @CheckReturnValue
        /* renamed from: a */
        public static C4477a m27461a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    C4481k.m27420x0(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.mo8751r();
                }
                return new C4477a((String[]) strArr.clone(), Options.m8537t(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* renamed from: com.squareup.moshi.h$b */
    /* loaded from: classes2.dex */
    public enum EnumC4478b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    @CheckReturnValue
    /* renamed from: W */
    public static AbstractC4476h m27468W(InterfaceC10187e interfaceC10187e) {
        return new C4480j(interfaceC10187e);
    }

    @CheckReturnValue
    /* renamed from: E */
    public final boolean m27469E() {
        return this.f12073A;
    }

    /* renamed from: F */
    public abstract boolean mo27456F() throws IOException;

    /* renamed from: H */
    public abstract double mo27453H() throws IOException;

    /* renamed from: L */
    public abstract int mo27448L() throws IOException;

    /* renamed from: M */
    public abstract long mo27446M() throws IOException;

    @Nullable
    /* renamed from: P */
    public abstract <T> T mo27442P() throws IOException;

    /* renamed from: R */
    public abstract String mo27441R() throws IOException;

    @CheckReturnValue
    /* renamed from: X */
    public abstract EnumC4478b mo27440X() throws IOException;

    /* renamed from: a */
    public abstract void mo27439a() throws IOException;

    /* renamed from: a0 */
    public abstract void mo27438a0() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void m27467b0(int i) {
        int i2 = this.f12075w;
        int[] iArr = this.f12076x;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f12076x = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f12077y;
                this.f12077y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f12078z;
                this.f12078z = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + m27462v());
            }
        }
        int[] iArr3 = this.f12076x;
        int i3 = this.f12075w;
        this.f12075w = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: c */
    public abstract void mo27437c() throws IOException;

    @CheckReturnValue
    /* renamed from: d0 */
    public abstract int mo27436d0(C4477a c4477a) throws IOException;

    /* renamed from: e */
    public abstract void mo27435e() throws IOException;

    @CheckReturnValue
    /* renamed from: e0 */
    public abstract int mo27434e0(C4477a c4477a) throws IOException;

    /* renamed from: f0 */
    public final void m27466f0(boolean z) {
        this.f12074B = z;
    }

    /* renamed from: h */
    public abstract void mo27433h() throws IOException;

    /* renamed from: j0 */
    public final void m27465j0(boolean z) {
        this.f12073A = z;
    }

    /* renamed from: l0 */
    public abstract void mo27432l0() throws IOException;

    /* renamed from: o0 */
    public abstract void mo27431o0() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public final JsonEncodingException m27464q0(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + m27462v());
    }

    @CheckReturnValue
    /* renamed from: t */
    public final boolean m27463t() {
        return this.f12074B;
    }

    @CheckReturnValue
    /* renamed from: v */
    public final String m27462v() {
        return C4479i.m27460a(this.f12075w, this.f12076x, this.f12077y, this.f12078z);
    }

    @CheckReturnValue
    /* renamed from: y */
    public abstract boolean mo27427y() throws IOException;
}
