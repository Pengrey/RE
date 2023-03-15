package p116g4;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p356sf.Buffer;
import p356sf.ByteString;
import p356sf.InterfaceC10187e;
import p356sf.Options;

/* renamed from: g4.c */
/* loaded from: classes.dex */
public abstract class AbstractC5604c implements Closeable {

    /* renamed from: C */
    private static final String[] f15828C = new String[128];

    /* renamed from: A */
    boolean f15829A;

    /* renamed from: B */
    boolean f15830B;

    /* renamed from: w */
    int f15831w;

    /* renamed from: x */
    int[] f15832x = new int[32];

    /* renamed from: y */
    String[] f15833y = new String[32];

    /* renamed from: z */
    int[] f15834z = new int[32];

    /* compiled from: JsonReader.java */
    /* renamed from: g4.c$a */
    /* loaded from: classes.dex */
    public static final class C5605a {

        /* renamed from: a */
        final String[] f15835a;

        /* renamed from: b */
        final Options f15836b;

        private C5605a(String[] strArr, Options options) {
            this.f15835a = strArr;
            this.f15836b = options;
        }

        /* renamed from: a */
        public static C5605a m23609a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    AbstractC5604c.m23612d0(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.mo8751r();
                }
                return new C5605a((String[]) strArr.clone(), Options.m8537t(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* renamed from: g4.c$b */
    /* loaded from: classes.dex */
    public enum EnumC5606b {
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

    static {
        for (int i = 0; i <= 31; i++) {
            f15828C[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f15828C;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: P */
    public static AbstractC5604c m23615P(InterfaceC10187e interfaceC10187e) {
        return new C5608e(interfaceC10187e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m23612d0(p356sf.InterfaceC10186d r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = p116g4.AbstractC5604c.f15828C
            r1 = 34
            r7.mo8780S(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo8776o(r8, r4, r3)
        L2e:
            r7.mo8774u0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo8776o(r8, r4, r2)
        L3b:
            r7.mo8780S(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p116g4.AbstractC5604c.m23612d0(sf.d, java.lang.String):void");
    }

    /* renamed from: E */
    public abstract boolean mo23605E() throws IOException;

    /* renamed from: F */
    public abstract double mo23603F() throws IOException;

    /* renamed from: H */
    public abstract int mo23600H() throws IOException;

    /* renamed from: L */
    public abstract String mo23598L() throws IOException;

    /* renamed from: M */
    public abstract String mo23597M() throws IOException;

    /* renamed from: R */
    public abstract EnumC5606b mo23596R() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public final void m23614W(int i) {
        int i2 = this.f15831w;
        int[] iArr = this.f15832x;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f15832x = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f15833y;
                this.f15833y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f15834z;
                this.f15834z = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C5602a("Nesting too deep at " + m23610v());
            }
        }
        int[] iArr3 = this.f15832x;
        int i3 = this.f15831w;
        this.f15831w = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: X */
    public abstract int mo23595X(C5605a c5605a) throws IOException;

    /* renamed from: a0 */
    public abstract void mo23594a0() throws IOException;

    /* renamed from: b0 */
    public abstract void mo23593b0() throws IOException;

    /* renamed from: c */
    public abstract void mo23592c() throws IOException;

    /* renamed from: e */
    public abstract void mo23591e() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final C5603b m23611e0(String str) throws C5603b {
        throw new C5603b(str + " at path " + m23610v());
    }

    /* renamed from: h */
    public abstract void mo23589h() throws IOException;

    /* renamed from: t */
    public abstract void mo23584t() throws IOException;

    /* renamed from: v */
    public final String m23610v() {
        return C5607d.m23608a(this.f15831w, this.f15832x, this.f15833y, this.f15834z);
    }

    /* renamed from: y */
    public abstract boolean mo23580y() throws IOException;
}
