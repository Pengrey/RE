package coil.request;

import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1491v;
import td.InterfaceC10574t1;

/* compiled from: RequestDelegate.kt */
/* loaded from: classes.dex */
public final class BaseRequestDelegate extends RequestDelegate {

    /* renamed from: w */
    private final AbstractC1469p f6305w;

    /* renamed from: x */
    private final InterfaceC10574t1 f6306x;

    public BaseRequestDelegate(AbstractC1469p abstractC1469p, InterfaceC10574t1 interfaceC10574t1) {
        super(null);
        this.f6305w = abstractC1469p;
        this.f6306x = interfaceC10574t1;
    }

    @Override // androidx.lifecycle.InterfaceC1443h, androidx.lifecycle.InterfaceC1462m
    /* renamed from: c */
    public void mo34476c(InterfaceC1491v interfaceC1491v) {
        m34479j();
    }

    @Override // coil.request.RequestDelegate
    /* renamed from: h */
    public void mo34478h() {
        this.f6305w.mo10400c(this);
    }

    @Override // coil.request.RequestDelegate
    /* renamed from: i */
    public void mo34475i() {
        this.f6305w.mo10402a(this);
    }

    /* renamed from: j */
    public void m34479j() {
        InterfaceC10574t1.C10575a.m7654a(this.f6306x, null, 1, null);
    }
}
