package p301q;

/* renamed from: q.e */
/* loaded from: classes.dex */
public class C9556e<E> implements Cloneable {

    /* renamed from: A */
    private static final Object f25120A = new Object();

    /* renamed from: w */
    private boolean f25121w;

    /* renamed from: x */
    private long[] f25122x;

    /* renamed from: y */
    private Object[] f25123y;

    /* renamed from: z */
    private int f25124z;

    public C9556e() {
        this(10);
    }

    /* renamed from: e */
    private void m10645e() {
        int i = this.f25124z;
        long[] jArr = this.f25122x;
        Object[] objArr = this.f25123y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f25120A) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f25121w = false;
        this.f25124z = i2;
    }

    /* renamed from: a */
    public void m10649a(long j, E e) {
        int i = this.f25124z;
        if (i != 0 && j <= this.f25122x[i - 1]) {
            m10639l(j, e);
            return;
        }
        if (this.f25121w && i >= this.f25122x.length) {
            m10645e();
        }
        int i2 = this.f25124z;
        if (i2 >= this.f25122x.length) {
            int m10652f = C9554c.m10652f(i2 + 1);
            long[] jArr = new long[m10652f];
            Object[] objArr = new Object[m10652f];
            long[] jArr2 = this.f25122x;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f25123y;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25122x = jArr;
            this.f25123y = objArr;
        }
        this.f25122x[i2] = j;
        this.f25123y[i2] = e;
        this.f25124z = i2 + 1;
    }

    /* renamed from: b */
    public void m10648b() {
        int i = this.f25124z;
        Object[] objArr = this.f25123y;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f25124z = 0;
        this.f25121w = false;
    }

    /* renamed from: c */
    public C9556e<E> clone() {
        try {
            C9556e<E> c9556e = (C9556e) super.clone();
            c9556e.f25122x = (long[]) this.f25122x.clone();
            c9556e.f25123y = (Object[]) this.f25123y.clone();
            return c9556e;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public boolean m10646d(long j) {
        return m10642i(j) >= 0;
    }

    /* renamed from: f */
    public E m10644f(long j) {
        return m10643g(j, null);
    }

    /* renamed from: g */
    public E m10643g(long j, E e) {
        int m10656b = C9554c.m10656b(this.f25122x, this.f25124z, j);
        if (m10656b >= 0) {
            Object[] objArr = this.f25123y;
            if (objArr[m10656b] != f25120A) {
                return (E) objArr[m10656b];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int m10642i(long j) {
        if (this.f25121w) {
            m10645e();
        }
        return C9554c.m10656b(this.f25122x, this.f25124z, j);
    }

    /* renamed from: j */
    public boolean m10641j() {
        return m10636o() == 0;
    }

    /* renamed from: k */
    public long m10640k(int i) {
        if (this.f25121w) {
            m10645e();
        }
        return this.f25122x[i];
    }

    /* renamed from: l */
    public void m10639l(long j, E e) {
        int m10656b = C9554c.m10656b(this.f25122x, this.f25124z, j);
        if (m10656b >= 0) {
            this.f25123y[m10656b] = e;
            return;
        }
        int i = ~m10656b;
        int i2 = this.f25124z;
        if (i < i2) {
            Object[] objArr = this.f25123y;
            if (objArr[i] == f25120A) {
                this.f25122x[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f25121w && i2 >= this.f25122x.length) {
            m10645e();
            i = ~C9554c.m10656b(this.f25122x, this.f25124z, j);
        }
        int i3 = this.f25124z;
        if (i3 >= this.f25122x.length) {
            int m10652f = C9554c.m10652f(i3 + 1);
            long[] jArr = new long[m10652f];
            Object[] objArr2 = new Object[m10652f];
            long[] jArr2 = this.f25122x;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f25123y;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25122x = jArr;
            this.f25123y = objArr2;
        }
        int i4 = this.f25124z;
        if (i4 - i != 0) {
            long[] jArr3 = this.f25122x;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f25123y;
            System.arraycopy(objArr4, i, objArr4, i5, this.f25124z - i);
        }
        this.f25122x[i] = j;
        this.f25123y[i] = e;
        this.f25124z++;
    }

    /* renamed from: m */
    public void m10638m(long j) {
        int m10656b = C9554c.m10656b(this.f25122x, this.f25124z, j);
        if (m10656b >= 0) {
            Object[] objArr = this.f25123y;
            Object obj = objArr[m10656b];
            Object obj2 = f25120A;
            if (obj != obj2) {
                objArr[m10656b] = obj2;
                this.f25121w = true;
            }
        }
    }

    /* renamed from: n */
    public void m10637n(int i) {
        Object[] objArr = this.f25123y;
        Object obj = objArr[i];
        Object obj2 = f25120A;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f25121w = true;
        }
    }

    /* renamed from: o */
    public int m10636o() {
        if (this.f25121w) {
            m10645e();
        }
        return this.f25124z;
    }

    /* renamed from: p */
    public E m10635p(int i) {
        if (this.f25121w) {
            m10645e();
        }
        return (E) this.f25123y[i];
    }

    public String toString() {
        if (m10636o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f25124z * 28);
        sb2.append('{');
        for (int i = 0; i < this.f25124z; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m10640k(i));
            sb2.append('=');
            E m10635p = m10635p(i);
            if (m10635p != this) {
                sb2.append(m10635p);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C9556e(int i) {
        this.f25121w = false;
        if (i == 0) {
            this.f25122x = C9554c.f25115b;
            this.f25123y = C9554c.f25116c;
            return;
        }
        int m10652f = C9554c.m10652f(i);
        this.f25122x = new long[m10652f];
        this.f25123y = new Object[m10652f];
    }
}
