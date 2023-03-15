package p449xg;

import android.content.Context;
import p378u5.ResourcesProvider;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.s */
/* loaded from: classes2.dex */
public final class C12543s implements InterfaceC11614c<ResourcesProvider> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32566a;

    public C12543s(InterfaceC12341a<Context> interfaceC12341a) {
        this.f32566a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C12543s m2906a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C12543s(interfaceC12341a);
    }

    /* renamed from: c */
    public static ResourcesProvider m2904c(Context context) {
        return (ResourcesProvider) C11617f.m4587d(AppProviders.f32545a.m2965q(context));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ResourcesProvider mo42226get() {
        return m2904c(this.f32566a.mo42226get());
    }
}
