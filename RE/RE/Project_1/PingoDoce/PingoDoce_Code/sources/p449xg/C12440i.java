package p449xg;

import android.content.Context;
import p107ff.InterfaceC5503w;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.i */
/* loaded from: classes2.dex */
public final class C12440i implements InterfaceC11614c<InterfaceC5503w> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32553a;

    public C12440i(InterfaceC12341a<Context> interfaceC12341a) {
        this.f32553a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C12440i m2939a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C12440i(interfaceC12341a);
    }

    /* renamed from: c */
    public static InterfaceC5503w m2937c(Context context) {
        return (InterfaceC5503w) C11617f.m4587d(AppProviders.f32545a.m2975g(context));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public InterfaceC5503w mo42226get() {
        return m2937c(this.f32553a.mo42226get());
    }
}
