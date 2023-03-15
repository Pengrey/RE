package p031b9;

import com.google.android.play.core.internal.C3937f;

/* renamed from: b9.v */
/* loaded from: classes.dex */
public final class C1865v<T> implements InterfaceC1867x<T> {

    /* renamed from: a */
    private InterfaceC1867x<T> f5585a;

    /* renamed from: a */
    public static <T> void m35247a(InterfaceC1867x<T> interfaceC1867x, InterfaceC1867x<T> interfaceC1867x2) {
        C3937f.m28568c(interfaceC1867x2);
        C1865v c1865v = (C1865v) interfaceC1867x;
        if (c1865v.f5585a != null) {
            throw new IllegalStateException();
        }
        c1865v.f5585a = interfaceC1867x2;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final T mo1547c() {
        InterfaceC1867x<T> interfaceC1867x = this.f5585a;
        if (interfaceC1867x != null) {
            return interfaceC1867x.mo1547c();
        }
        throw new IllegalStateException();
    }
}
