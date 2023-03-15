package gg;

import android.content.SharedPreferences;
import p142hg.C5936f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.p */
/* loaded from: classes2.dex */
public final class C5672p implements InterfaceC11614c<C5670o> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15925a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f15926b;

    public C5672p(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f15925a = interfaceC12341a;
        this.f15926b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5672p m23366a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C5672p(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C5670o m23364c() {
        return new C5670o();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5670o mo42226get() {
        C5670o m23364c = m23364c();
        C5936f.m22646b(m23364c, this.f15925a.mo42226get());
        C5936f.m22647a(m23364c, this.f15926b.mo42226get());
        return m23364c;
    }
}
