package gg;

import android.content.SharedPreferences;
import p142hg.C5936f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.f */
/* loaded from: classes2.dex */
public final class C5657f implements InterfaceC11614c<C5655e> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15909a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f15910b;

    public C5657f(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f15909a = interfaceC12341a;
        this.f15910b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5657f m23384a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C5657f(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C5655e m23382c() {
        return new C5655e();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5655e mo42226get() {
        C5655e m23382c = m23382c();
        C5936f.m22646b(m23382c, this.f15909a.mo42226get());
        C5936f.m22647a(m23382c, this.f15910b.mo42226get());
        return m23382c;
    }
}
