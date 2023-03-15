package androidx.core.util;

/* renamed from: androidx.core.util.f */
/* loaded from: classes.dex */
public class C1074f<T> implements InterfaceC1073e<T> {

    /* renamed from: a */
    private final Object[] f3408a;

    /* renamed from: b */
    private int f3409b;

    public C1074f(int i) {
        if (i > 0) {
            this.f3408a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m38627c(T t) {
        for (int i = 0; i < this.f3409b; i++) {
            if (this.f3408a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.InterfaceC1073e
    /* renamed from: a */
    public boolean mo38626a(T t) {
        if (!m38627c(t)) {
            int i = this.f3409b;
            Object[] objArr = this.f3408a;
            if (i < objArr.length) {
                objArr[i] = t;
                this.f3409b = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.InterfaceC1073e
    /* renamed from: b */
    public T mo38625b() {
        int i = this.f3409b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f3408a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f3409b = i - 1;
            return t;
        }
        return null;
    }
}
