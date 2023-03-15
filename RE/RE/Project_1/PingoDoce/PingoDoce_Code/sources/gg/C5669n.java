package gg;

import android.content.SharedPreferences;
import p142hg.C5931b;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.n */
/* loaded from: classes2.dex */
public final class C5669n implements InterfaceC11614c<C5667m> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15923a;

    public C5669n(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f15923a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C5669n m23369a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C5669n(interfaceC12341a);
    }

    /* renamed from: c */
    public static C5667m m23367c() {
        return new C5667m();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5667m mo42226get() {
        C5667m m23367c = m23367c();
        C5931b.m22691a(m23367c, this.f15923a.mo42226get());
        return m23367c;
    }
}
