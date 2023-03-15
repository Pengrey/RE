package p368ta;

import com.google.gson.C4373i;
import com.google.gson.C4377m;
import com.google.gson.C4378n;
import com.google.gson.C4379o;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ta.e */
/* loaded from: classes2.dex */
public final class C10410e extends C4387a {

    /* renamed from: Q */
    private static final Object f27053Q;

    /* renamed from: M */
    private Object[] f27054M;

    /* renamed from: N */
    private int f27055N;

    /* renamed from: O */
    private String[] f27056O;

    /* renamed from: P */
    private int[] f27057P;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: ta.e$a */
    /* loaded from: classes2.dex */
    class C10411a extends Reader {
        C10411a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C10411a();
        f27053Q = new Object();
    }

    /* renamed from: J0 */
    private void m8053J0(EnumC4389b enumC4389b) throws IOException {
        if (mo8038o0() == enumC4389b) {
            return;
        }
        throw new IllegalStateException("Expected " + enumC4389b + " but was " + mo8038o0() + m8048P());
    }

    /* renamed from: K0 */
    private Object m8052K0() {
        return this.f27054M[this.f27055N - 1];
    }

    /* renamed from: L0 */
    private Object m8051L0() {
        Object[] objArr = this.f27054M;
        int i = this.f27055N - 1;
        this.f27055N = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: N0 */
    private void m8049N0(Object obj) {
        int i = this.f27055N;
        Object[] objArr = this.f27054M;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f27054M = Arrays.copyOf(objArr, i2);
            this.f27057P = Arrays.copyOf(this.f27057P, i2);
            this.f27056O = (String[]) Arrays.copyOf(this.f27056O, i2);
        }
        Object[] objArr2 = this.f27054M;
        int i3 = this.f27055N;
        this.f27055N = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: P */
    private String m8048P() {
        return " at path " + mo8056F();
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: F */
    public String mo8056F() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i = 0;
        while (i < this.f27055N) {
            Object[] objArr = this.f27054M;
            if (objArr[i] instanceof C4373i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f27057P[i]);
                    sb2.append(']');
                }
            } else if (objArr[i] instanceof C4378n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('.');
                    String[] strArr = this.f27056O;
                    if (strArr[i] != null) {
                        sb2.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: H */
    public boolean mo8055H() throws IOException {
        EnumC4389b mo8038o0 = mo8038o0();
        return (mo8038o0 == EnumC4389b.END_OBJECT || mo8038o0 == EnumC4389b.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: H0 */
    public void mo8054H0() throws IOException {
        if (mo8038o0() == EnumC4389b.NAME) {
            mo8042b0();
            this.f27056O[this.f27055N - 2] = "null";
        } else {
            m8051L0();
            int i = this.f27055N;
            if (i > 0) {
                this.f27056O[i - 1] = "null";
            }
        }
        int i2 = this.f27055N;
        if (i2 > 0) {
            int[] iArr = this.f27057P;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: M0 */
    public void m8050M0() throws IOException {
        m8053J0(EnumC4389b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m8052K0()).next();
        m8049N0(entry.getValue());
        m8049N0(new C4379o((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: R */
    public boolean mo8047R() throws IOException {
        m8053J0(EnumC4389b.BOOLEAN);
        boolean m27747u = ((C4379o) m8051L0()).m27747u();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m27747u;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: W */
    public double mo8046W() throws IOException {
        EnumC4389b mo8038o0 = mo8038o0();
        EnumC4389b enumC4389b = EnumC4389b.NUMBER;
        if (mo8038o0 != enumC4389b && mo8038o0 != EnumC4389b.STRING) {
            throw new IllegalStateException("Expected " + enumC4389b + " but was " + mo8038o0 + m8048P());
        }
        double m27746v = ((C4379o) m8052K0()).m27746v();
        if (!m27733L() && (Double.isNaN(m27746v) || Double.isInfinite(m27746v))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m27746v);
        }
        m8051L0();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m27746v;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: X */
    public int mo8045X() throws IOException {
        EnumC4389b mo8038o0 = mo8038o0();
        EnumC4389b enumC4389b = EnumC4389b.NUMBER;
        if (mo8038o0 != enumC4389b && mo8038o0 != EnumC4389b.STRING) {
            throw new IllegalStateException("Expected " + enumC4389b + " but was " + mo8038o0 + m8048P());
        }
        int m27745x = ((C4379o) m8052K0()).m27745x();
        m8051L0();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m27745x;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: a */
    public void mo8044a() throws IOException {
        m8053J0(EnumC4389b.BEGIN_ARRAY);
        m8049N0(((C4373i) m8052K0()).iterator());
        this.f27057P[this.f27055N - 1] = 0;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: a0 */
    public long mo8043a0() throws IOException {
        EnumC4389b mo8038o0 = mo8038o0();
        EnumC4389b enumC4389b = EnumC4389b.NUMBER;
        if (mo8038o0 != enumC4389b && mo8038o0 != EnumC4389b.STRING) {
            throw new IllegalStateException("Expected " + enumC4389b + " but was " + mo8038o0 + m8048P());
        }
        long mo27749h = ((C4379o) m8052K0()).mo27749h();
        m8051L0();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo27749h;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: b0 */
    public String mo8042b0() throws IOException {
        m8053J0(EnumC4389b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m8052K0()).next();
        String str = (String) entry.getKey();
        this.f27056O[this.f27055N - 1] = str;
        m8049N0(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: c */
    public void mo8041c() throws IOException {
        m8053J0(EnumC4389b.BEGIN_OBJECT);
        m8049N0(((C4378n) m8052K0()).m27756v().iterator());
    }

    @Override // com.google.gson.stream.C4387a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27054M = new Object[]{f27053Q};
        this.f27055N = 1;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: e0 */
    public void mo8040e0() throws IOException {
        m8053J0(EnumC4389b.NULL);
        m8051L0();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: j0 */
    public String mo8039j0() throws IOException {
        EnumC4389b mo8038o0 = mo8038o0();
        EnumC4389b enumC4389b = EnumC4389b.STRING;
        if (mo8038o0 != enumC4389b && mo8038o0 != EnumC4389b.NUMBER) {
            throw new IllegalStateException("Expected " + enumC4389b + " but was " + mo8038o0 + m8048P());
        }
        String mo27748l = ((C4379o) m8051L0()).mo27748l();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo27748l;
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: o0 */
    public EnumC4389b mo8038o0() throws IOException {
        if (this.f27055N == 0) {
            return EnumC4389b.END_DOCUMENT;
        }
        Object m8052K0 = m8052K0();
        if (m8052K0 instanceof Iterator) {
            boolean z = this.f27054M[this.f27055N - 2] instanceof C4378n;
            Iterator it = (Iterator) m8052K0;
            if (!it.hasNext()) {
                return z ? EnumC4389b.END_OBJECT : EnumC4389b.END_ARRAY;
            } else if (z) {
                return EnumC4389b.NAME;
            } else {
                m8049N0(it.next());
                return mo8038o0();
            }
        } else if (m8052K0 instanceof C4378n) {
            return EnumC4389b.BEGIN_OBJECT;
        } else {
            if (m8052K0 instanceof C4373i) {
                return EnumC4389b.BEGIN_ARRAY;
            }
            if (m8052K0 instanceof C4379o) {
                C4379o c4379o = (C4379o) m8052K0;
                if (c4379o.m27750E()) {
                    return EnumC4389b.STRING;
                }
                if (c4379o.m27753B()) {
                    return EnumC4389b.BOOLEAN;
                }
                if (c4379o.m27751D()) {
                    return EnumC4389b.NUMBER;
                }
                throw new AssertionError();
            } else if (m8052K0 instanceof C4377m) {
                return EnumC4389b.NULL;
            } else {
                if (m8052K0 == f27053Q) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.google.gson.stream.C4387a
    public String toString() {
        return C10410e.class.getSimpleName();
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: v */
    public void mo8037v() throws IOException {
        m8053J0(EnumC4389b.END_ARRAY);
        m8051L0();
        m8051L0();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.C4387a
    /* renamed from: y */
    public void mo8036y() throws IOException {
        m8053J0(EnumC4389b.END_OBJECT);
        m8051L0();
        m8051L0();
        int i = this.f27055N;
        if (i > 0) {
            int[] iArr = this.f27057P;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }
}
