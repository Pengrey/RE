package gg;

import android.content.SharedPreferences;
import p142hg.C5936f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.h */
/* loaded from: classes2.dex */
public final class C5660h implements InterfaceC11614c<C5658g> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15912a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f15913b;

    public C5660h(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f15912a = interfaceC12341a;
        this.f15913b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5660h m23381a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C5660h(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C5658g m23379c() {
        return new C5658g();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5658g mo42226get() {
        C5658g m23379c = m23379c();
        C5936f.m22646b(m23379c, this.f15912a.mo42226get());
        C5936f.m22647a(m23379c, this.f15913b.mo42226get());
        return m23379c;
    }
}
