package gg;

import android.content.SharedPreferences;
import p142hg.C5936f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.l */
/* loaded from: classes2.dex */
public final class C5666l implements InterfaceC11614c<C5664k> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15919a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f15920b;

    public C5666l(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f15919a = interfaceC12341a;
        this.f15920b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5666l m23374a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C5666l(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C5664k m23372c() {
        return new C5664k();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5664k mo42226get() {
        C5664k m23372c = m23372c();
        C5936f.m22646b(m23372c, this.f15919a.mo42226get());
        C5936f.m22647a(m23372c, this.f15920b.mo42226get());
        return m23372c;
    }
}
