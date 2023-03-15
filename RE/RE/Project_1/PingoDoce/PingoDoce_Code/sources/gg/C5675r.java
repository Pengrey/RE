package gg;

import android.content.SharedPreferences;
import p142hg.C5931b;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.r */
/* loaded from: classes2.dex */
public final class C5675r implements InterfaceC11614c<C5673q> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15927a;

    public C5675r(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f15927a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C5675r m23363a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C5675r(interfaceC12341a);
    }

    /* renamed from: c */
    public static C5673q m23361c() {
        return new C5673q();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5673q mo42226get() {
        C5673q m23361c = m23361c();
        C5931b.m22691a(m23361c, this.f15927a.mo42226get());
        return m23361c;
    }
}
