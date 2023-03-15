package gg;

import android.content.SharedPreferences;
import p142hg.C5936f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.v */
/* loaded from: classes2.dex */
public final class C5681v implements InterfaceC11614c<C5679u> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15929a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f15930b;

    public C5681v(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f15929a = interfaceC12341a;
        this.f15930b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5681v m23355a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C5681v(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C5679u m23353c() {
        return new C5679u();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5679u mo42226get() {
        C5679u m23353c = m23353c();
        C5936f.m22646b(m23353c, this.f15929a.mo42226get());
        C5936f.m22647a(m23353c, this.f15930b.mo42226get());
        return m23353c;
    }
}
