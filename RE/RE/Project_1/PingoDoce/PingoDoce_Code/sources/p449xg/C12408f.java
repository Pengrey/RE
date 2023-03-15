package p449xg;

import android.content.Context;
import androidx.biometric.C0577e;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.f */
/* loaded from: classes2.dex */
public final class C12408f implements InterfaceC11614c<C0577e> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32550a;

    public C12408f(InterfaceC12341a<Context> interfaceC12341a) {
        this.f32550a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C12408f m2950a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C12408f(interfaceC12341a);
    }

    /* renamed from: c */
    public static C0577e m2948c(Context context) {
        return (C0577e) C11617f.m4587d(AppProviders.f32545a.m2978d(context));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C0577e mo42226get() {
        return m2948c(this.f32550a.mo42226get());
    }
}
