package gg;

import android.content.SharedPreferences;
import p142hg.C5931b;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.t */
/* loaded from: classes2.dex */
public final class C5678t implements InterfaceC11614c<C5676s> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15928a;

    public C5678t(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f15928a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C5678t m23358a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C5678t(interfaceC12341a);
    }

    /* renamed from: c */
    public static C5676s m23356c() {
        return new C5676s();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5676s mo42226get() {
        C5676s m23356c = m23356c();
        C5931b.m22691a(m23356c, this.f15928a.mo42226get());
        return m23356c;
    }
}
