package p108fg;

import gg.C5655e;
import gg.C5664k;
import gg.C5670o;
import gg.C5682w;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import se.OAuthSharedPrefs;

/* renamed from: fg.b */
/* loaded from: classes2.dex */
public final class C5517b implements InterfaceC11614c<AppInterceptorDataProvider> {

    /* renamed from: a */
    private final InterfaceC12341a<OAuthSharedPrefs> f15664a;

    /* renamed from: b */
    private final InterfaceC12341a<C5664k> f15665b;

    /* renamed from: c */
    private final InterfaceC12341a<C5670o> f15666c;

    /* renamed from: d */
    private final InterfaceC12341a<C5655e> f15667d;

    /* renamed from: e */
    private final InterfaceC12341a<C5682w> f15668e;

    public C5517b(InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a, InterfaceC12341a<C5664k> interfaceC12341a2, InterfaceC12341a<C5670o> interfaceC12341a3, InterfaceC12341a<C5655e> interfaceC12341a4, InterfaceC12341a<C5682w> interfaceC12341a5) {
        this.f15664a = interfaceC12341a;
        this.f15665b = interfaceC12341a2;
        this.f15666c = interfaceC12341a3;
        this.f15667d = interfaceC12341a4;
        this.f15668e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C5517b m23801a(InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a, InterfaceC12341a<C5664k> interfaceC12341a2, InterfaceC12341a<C5670o> interfaceC12341a3, InterfaceC12341a<C5655e> interfaceC12341a4, InterfaceC12341a<C5682w> interfaceC12341a5) {
        return new C5517b(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static AppInterceptorDataProvider m23799c(OAuthSharedPrefs oAuthSharedPrefs, C5664k c5664k, C5670o c5670o, C5655e c5655e, C5682w c5682w) {
        return new AppInterceptorDataProvider(oAuthSharedPrefs, c5664k, c5670o, c5655e, c5682w);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public AppInterceptorDataProvider mo42226get() {
        return m23799c(this.f15664a.mo42226get(), this.f15665b.mo42226get(), this.f15666c.mo42226get(), this.f15667d.mo42226get(), this.f15668e.mo42226get());
    }
}
