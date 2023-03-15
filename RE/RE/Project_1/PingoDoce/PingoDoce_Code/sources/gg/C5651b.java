package gg;

import android.content.SharedPreferences;
import p142hg.C5931b;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.b */
/* loaded from: classes2.dex */
public final class C5651b implements InterfaceC11614c<C5649a> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15907a;

    public C5651b(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f15907a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C5651b m23390a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C5651b(interfaceC12341a);
    }

    /* renamed from: c */
    public static C5649a m23388c() {
        return new C5649a();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5649a mo42226get() {
        C5649a m23388c = m23388c();
        C5931b.m22691a(m23388c, this.f15907a.mo42226get());
        return m23388c;
    }
}
