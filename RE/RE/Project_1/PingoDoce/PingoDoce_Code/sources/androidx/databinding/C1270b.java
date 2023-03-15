package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.databinding.b */
/* loaded from: classes.dex */
public class C1270b<C, T, A> implements Cloneable {

    /* renamed from: A */
    private final AbstractC1271a<C, T, A> f3701A;

    /* renamed from: w */
    private List<C> f3702w = new ArrayList();

    /* renamed from: x */
    private long f3703x = 0;

    /* renamed from: y */
    private long[] f3704y;

    /* renamed from: z */
    private int f3705z;

    /* compiled from: CallbackRegistry.java */
    /* renamed from: androidx.databinding.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1271a<C, T, A> {
        /* renamed from: a */
        public abstract void mo37796b(C c, T t, int i, A a);
    }

    public C1270b(AbstractC1271a<C, T, A> abstractC1271a) {
        this.f3701A = abstractC1271a;
    }

    /* renamed from: c */
    private boolean m37778c(int i) {
        int i2;
        if (i < 64) {
            return ((1 << i) & this.f3703x) != 0;
        }
        long[] jArr = this.f3704y;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    /* renamed from: e */
    private void m37776e(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f3701A.mo37796b(this.f3702w.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: f */
    private void m37775f(T t, int i, A a) {
        m37776e(t, i, a, 0, Math.min(64, this.f3702w.size()), this.f3703x);
    }

    /* renamed from: g */
    private void m37774g(T t, int i, A a) {
        int size = this.f3702w.size();
        long[] jArr = this.f3704y;
        int length = jArr == null ? -1 : jArr.length - 1;
        m37773i(t, i, a, length);
        m37776e(t, i, a, (length + 2) * 64, size, 0L);
    }

    /* renamed from: i */
    private void m37773i(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m37775f(t, i, a);
            return;
        }
        long j = this.f3704y[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f3702w.size(), i3 + 64);
        m37773i(t, i, a, i2 - 1);
        m37776e(t, i, a, i3, min, j);
    }

    /* renamed from: k */
    private void m37771k(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f3702w.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: l */
    private void m37770l(int i) {
        if (i < 64) {
            this.f3703x = (1 << i) | this.f3703x;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.f3704y;
        if (jArr == null) {
            this.f3704y = new long[this.f3702w.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.f3702w.size() / 64];
            long[] jArr3 = this.f3704y;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f3704y = jArr2;
        }
        long j = 1 << (i % 64);
        long[] jArr4 = this.f3704y;
        jArr4[i2] = j | jArr4[i2];
    }

    /* renamed from: a */
    public synchronized void m37780a(C c) {
        if (c != null) {
            int lastIndexOf = this.f3702w.lastIndexOf(c);
            if (lastIndexOf < 0 || m37778c(lastIndexOf)) {
                this.f3702w.add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    /* renamed from: b */
    public synchronized C1270b<C, T, A> clone() {
        C1270b<C, T, A> c1270b;
        CloneNotSupportedException e;
        try {
            c1270b = (C1270b) super.clone();
        } catch (CloneNotSupportedException e2) {
            c1270b = null;
            e = e2;
        }
        try {
            c1270b.f3703x = 0L;
            c1270b.f3704y = null;
            c1270b.f3705z = 0;
            c1270b.f3702w = new ArrayList();
            int size = this.f3702w.size();
            for (int i = 0; i < size; i++) {
                if (!m37778c(i)) {
                    c1270b.f3702w.add(this.f3702w.get(i));
                }
            }
        } catch (CloneNotSupportedException e3) {
            e = e3;
            e.printStackTrace();
            return c1270b;
        }
        return c1270b;
    }

    /* renamed from: d */
    public synchronized void m37777d(T t, int i, A a) {
        this.f3705z++;
        m37774g(t, i, a);
        int i2 = this.f3705z - 1;
        this.f3705z = i2;
        if (i2 == 0) {
            long[] jArr = this.f3704y;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j = this.f3704y[length];
                    if (j != 0) {
                        m37771k((length + 1) * 64, j);
                        this.f3704y[length] = 0;
                    }
                }
            }
            long j2 = this.f3703x;
            if (j2 != 0) {
                m37771k(0, j2);
                this.f3703x = 0L;
            }
        }
    }

    /* renamed from: j */
    public synchronized void m37772j(C c) {
        if (this.f3705z == 0) {
            this.f3702w.remove(c);
        } else {
            int lastIndexOf = this.f3702w.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                m37770l(lastIndexOf);
            }
        }
    }
}
