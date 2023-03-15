package p301q;

/* renamed from: q.h */
/* loaded from: classes.dex */
public class C9559h<E> implements Cloneable {

    /* renamed from: A */
    private static final Object f25140A = new Object();

    /* renamed from: w */
    private boolean f25141w;

    /* renamed from: x */
    private int[] f25142x;

    /* renamed from: y */
    private Object[] f25143y;

    /* renamed from: z */
    private int f25144z;

    public C9559h() {
        this(10);
    }

    /* renamed from: e */
    private void m10605e() {
        int i = this.f25144z;
        int[] iArr = this.f25142x;
        Object[] objArr = this.f25143y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f25140A) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f25141w = false;
        this.f25144z = i2;
    }

    /* renamed from: a */
    public void m10609a(int i, E e) {
        int i2 = this.f25144z;
        if (i2 != 0 && i <= this.f25142x[i2 - 1]) {
            m10599l(i, e);
            return;
        }
        if (this.f25141w && i2 >= this.f25142x.length) {
            m10605e();
        }
        int i3 = this.f25144z;
        if (i3 >= this.f25142x.length) {
            int m10653e = C9554c.m10653e(i3 + 1);
            int[] iArr = new int[m10653e];
            Object[] objArr = new Object[m10653e];
            int[] iArr2 = this.f25142x;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f25143y;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25142x = iArr;
            this.f25143y = objArr;
        }
        this.f25142x[i3] = i;
        this.f25143y[i3] = e;
        this.f25144z = i3 + 1;
    }

    /* renamed from: b */
    public void m10608b() {
        int i = this.f25144z;
        Object[] objArr = this.f25143y;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f25144z = 0;
        this.f25141w = false;
    }

    /* renamed from: c */
    public C9559h<E> clone() {
        try {
            C9559h<E> c9559h = (C9559h) super.clone();
            c9559h.f25142x = (int[]) this.f25142x.clone();
            c9559h.f25143y = (Object[]) this.f25143y.clone();
            return c9559h;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public boolean m10606d(int i) {
        return m10602i(i) >= 0;
    }

    /* renamed from: f */
    public E m10604f(int i) {
        return m10603g(i, null);
    }

    /* renamed from: g */
    public E m10603g(int i, E e) {
        int m10657a = C9554c.m10657a(this.f25142x, this.f25144z, i);
        if (m10657a >= 0) {
            Object[] objArr = this.f25143y;
            if (objArr[m10657a] != f25140A) {
                return (E) objArr[m10657a];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int m10602i(int i) {
        if (this.f25141w) {
            m10605e();
        }
        return C9554c.m10657a(this.f25142x, this.f25144z, i);
    }

    /* renamed from: j */
    public int m10601j(E e) {
        if (this.f25141w) {
            m10605e();
        }
        for (int i = 0; i < this.f25144z; i++) {
            if (this.f25143y[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public int m10600k(int i) {
        if (this.f25141w) {
            m10605e();
        }
        return this.f25142x[i];
    }

    /* renamed from: l */
    public void m10599l(int i, E e) {
        int m10657a = C9554c.m10657a(this.f25142x, this.f25144z, i);
        if (m10657a >= 0) {
            this.f25143y[m10657a] = e;
            return;
        }
        int i2 = ~m10657a;
        int i3 = this.f25144z;
        if (i2 < i3) {
            Object[] objArr = this.f25143y;
            if (objArr[i2] == f25140A) {
                this.f25142x[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f25141w && i3 >= this.f25142x.length) {
            m10605e();
            i2 = ~C9554c.m10657a(this.f25142x, this.f25144z, i);
        }
        int i4 = this.f25144z;
        if (i4 >= this.f25142x.length) {
            int m10653e = C9554c.m10653e(i4 + 1);
            int[] iArr = new int[m10653e];
            Object[] objArr2 = new Object[m10653e];
            int[] iArr2 = this.f25142x;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f25143y;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25142x = iArr;
            this.f25143y = objArr2;
        }
        int i5 = this.f25144z;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f25142x;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f25143y;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f25144z - i2);
        }
        this.f25142x[i2] = i;
        this.f25143y[i2] = e;
        this.f25144z++;
    }

    /* renamed from: m */
    public int m10598m() {
        if (this.f25141w) {
            m10605e();
        }
        return this.f25144z;
    }

    /* renamed from: n */
    public E m10597n(int i) {
        if (this.f25141w) {
            m10605e();
        }
        return (E) this.f25143y[i];
    }

    public String toString() {
        if (m10598m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f25144z * 28);
        sb2.append('{');
        for (int i = 0; i < this.f25144z; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(m10600k(i));
            sb2.append('=');
            E m10597n = m10597n(i);
            if (m10597n != this) {
                sb2.append(m10597n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C9559h(int i) {
        this.f25141w = false;
        if (i == 0) {
            this.f25142x = C9554c.f25114a;
            this.f25143y = C9554c.f25116c;
            return;
        }
        int m10653e = C9554c.m10653e(i);
        this.f25142x = new int[m10653e];
        this.f25143y = new Object[m10653e];
    }
}
