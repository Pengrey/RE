package p490zd;

import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import p181jd.Intrinsics;

/* renamed from: zd.f */
/* loaded from: classes2.dex */
public final class C13789f<T> implements InterfaceC1440f0<C13788e<T>> {

    /* renamed from: a */
    private InterfaceC1491v f34896a;

    /* renamed from: b */
    private final InterfaceC1440f0<? super T> f34897b;

    public C13789f(InterfaceC1491v interfaceC1491v, InterfaceC1440f0<? super T> interfaceC1440f0) {
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        this.f34896a = interfaceC1491v;
        this.f34897b = interfaceC1440f0;
    }

    /* renamed from: a */
    public final InterfaceC1491v m162a() {
        return this.f34896a;
    }

    /* renamed from: b */
    public final InterfaceC1440f0<? super T> m161b() {
        return this.f34897b;
    }

    @Override // androidx.lifecycle.InterfaceC1440f0
    /* renamed from: d */
    public void mo37325a(C13788e<T> c13788e) {
        Object m164a;
        if (c13788e == null || (m164a = c13788e.m164a(this.f34897b)) == null) {
            return;
        }
        this.f34897b.mo37325a(m164a);
    }
}
