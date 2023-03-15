package p053d2;

/* renamed from: d2.g */
/* loaded from: classes.dex */
class C4716g<T> implements InterfaceC4715f<T> {

    /* renamed from: a */
    private final Object[] f12882a;

    /* renamed from: b */
    private int f12883b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4716g(int i) {
        if (i > 0) {
            this.f12882a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p053d2.InterfaceC4715f
    /* renamed from: a */
    public boolean mo26834a(T t) {
        int i = this.f12883b;
        Object[] objArr = this.f12882a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f12883b = i + 1;
            return true;
        }
        return false;
    }

    @Override // p053d2.InterfaceC4715f
    /* renamed from: b */
    public T mo26833b() {
        int i = this.f12883b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f12882a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f12883b = i - 1;
            return t;
        }
        return null;
    }

    @Override // p053d2.InterfaceC4715f
    /* renamed from: c */
    public void mo26832c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f12883b;
            Object[] objArr = this.f12882a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f12883b = i3 + 1;
            }
        }
    }
}
