package p301q;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: q.f */
/* loaded from: classes.dex */
public class C9557f<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f25125a;

    /* renamed from: b */
    private int f25126b;

    /* renamed from: c */
    private int f25127c;

    /* renamed from: d */
    private int f25128d;

    /* renamed from: e */
    private int f25129e;

    /* renamed from: f */
    private int f25130f;

    /* renamed from: g */
    private int f25131g;

    /* renamed from: h */
    private int f25132h;

    public C9557f(int i) {
        if (i > 0) {
            this.f25127c = i;
            this.f25125a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: h */
    private int m10627h(K k, V v) {
        int mo17185n = mo17185n(k, v);
        if (mo17185n >= 0) {
            return mo17185n;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    protected V mo10634a(K k) {
        return null;
    }

    /* renamed from: b */
    protected void mo17186m(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final void m10632c() {
        m10623l(-1);
    }

    /* renamed from: d */
    public final V m10631d(K k) {
        V put;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f25125a.get(k);
            if (v != null) {
                this.f25131g++;
                return v;
            }
            this.f25132h++;
            V mo10634a = mo10634a(k);
            if (mo10634a == null) {
                return null;
            }
            synchronized (this) {
                this.f25129e++;
                put = this.f25125a.put(k, mo10634a);
                if (put != null) {
                    this.f25125a.put(k, put);
                } else {
                    this.f25126b += m10627h(k, mo10634a);
                }
            }
            if (put != null) {
                mo17186m(false, k, mo10634a, put);
                return put;
            }
            m10623l(this.f25127c);
            return mo10634a;
        }
    }

    /* renamed from: e */
    public final synchronized int m10630e() {
        return this.f25127c;
    }

    /* renamed from: f */
    public final V m10629f(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.f25128d++;
                this.f25126b += m10627h(k, v);
                put = this.f25125a.put(k, v);
                if (put != null) {
                    this.f25126b -= m10627h(k, put);
                }
            }
            if (put != null) {
                mo17186m(false, k, put, v);
            }
            m10623l(this.f25127c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* renamed from: g */
    public final V m10628g(K k) {
        V remove;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            remove = this.f25125a.remove(k);
            if (remove != null) {
                this.f25126b -= m10627h(k, remove);
            }
        }
        if (remove != null) {
            mo17186m(false, k, remove, null);
        }
        return remove;
    }

    /* renamed from: i */
    public final synchronized int m10626i() {
        return this.f25126b;
    }

    /* renamed from: j */
    protected int mo17185n(K k, V v) {
        return 1;
    }

    /* renamed from: k */
    public final synchronized Map<K, V> m10624k() {
        return new LinkedHashMap(this.f25125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10623l(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f25126b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f25125a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f25126b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f25126b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f25125a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f25125a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f25125a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f25126b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.m10627h(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f25126b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f25130f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f25130f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.mo17186m(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p301q.C9557f.m10623l(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f25131g;
        i2 = this.f25132h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f25127c), Integer.valueOf(this.f25131g), Integer.valueOf(this.f25132h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
