package androidx.core.util;

/* renamed from: androidx.core.util.g */
/* loaded from: classes.dex */
public class C1075g<T> extends C1074f<T> {

    /* renamed from: c */
    private final Object f3410c;

    public C1075g(int i) {
        super(i);
        this.f3410c = new Object();
    }

    @Override // androidx.core.util.C1074f, androidx.core.util.InterfaceC1073e
    /* renamed from: a */
    public boolean mo38626a(T t) {
        boolean mo38626a;
        synchronized (this.f3410c) {
            mo38626a = super.mo38626a(t);
        }
        return mo38626a;
    }

    @Override // androidx.core.util.C1074f, androidx.core.util.InterfaceC1073e
    /* renamed from: b */
    public T mo38625b() {
        T t;
        synchronized (this.f3410c) {
            t = (T) super.mo38625b();
        }
        return t;
    }
}
