package p490zd;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import p181jd.Intrinsics;

/* renamed from: zd.c */
/* loaded from: classes2.dex */
public final class C13786c<T> extends C1436e0<T> {

    /* renamed from: l */
    private final C13785b<T> f34893l = new C13785b<>();

    @Override // androidx.lifecycle.LiveData
    /* renamed from: f */
    public T mo172f() {
        return (T) this.f34893l.mo172f();
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: i */
    public void mo171i(InterfaceC1491v interfaceC1491v, InterfaceC1440f0<? super T> interfaceC1440f0) {
        Intrinsics.m20926i(interfaceC1491v, "owner");
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        this.f34893l.mo171i(interfaceC1491v, interfaceC1440f0);
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: j */
    public void mo170j(InterfaceC1440f0<? super T> interfaceC1440f0) {
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        this.f34893l.mo170j(interfaceC1440f0);
    }

    @Override // androidx.lifecycle.C1436e0, androidx.lifecycle.LiveData
    /* renamed from: m */
    public void mo169m(T t) {
        this.f34893l.mo169m(t);
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: n */
    public void mo168n(InterfaceC1440f0<? super T> interfaceC1440f0) {
        Intrinsics.m20926i(interfaceC1440f0, "observer");
        this.f34893l.mo168n(interfaceC1440f0);
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: o */
    public void mo167o(InterfaceC1491v interfaceC1491v) {
        Intrinsics.m20926i(interfaceC1491v, "owner");
        this.f34893l.mo167o(interfaceC1491v);
    }

    @Override // androidx.lifecycle.C1436e0, androidx.lifecycle.LiveData
    /* renamed from: p */
    public void mo166p(T t) {
        this.f34893l.mo166p(t);
    }
}
