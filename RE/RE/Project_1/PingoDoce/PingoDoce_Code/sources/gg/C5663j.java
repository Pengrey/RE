package gg;

import android.content.SharedPreferences;
import p142hg.C5936f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.j */
/* loaded from: classes2.dex */
public final class C5663j implements InterfaceC11614c<C5661i> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15916a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f15917b;

    public C5663j(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f15916a = interfaceC12341a;
        this.f15917b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5663j m23377a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C5663j(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C5661i m23375c() {
        return new C5661i();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5661i mo42226get() {
        C5661i m23375c = m23375c();
        C5936f.m22646b(m23375c, this.f15916a.mo42226get());
        C5936f.m22647a(m23375c, this.f15917b.mo42226get());
        return m23375c;
    }
}
