package gg;

import android.content.SharedPreferences;
import p142hg.C5936f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.x */
/* loaded from: classes2.dex */
public final class C5684x implements InterfaceC11614c<C5682w> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15932a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f15933b;

    public C5684x(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f15932a = interfaceC12341a;
        this.f15933b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C5684x m23348a(InterfaceC12341a<SharedPreferences> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C5684x(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static C5682w m23346c() {
        return new C5682w();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5682w mo42226get() {
        C5682w m23346c = m23346c();
        C5936f.m22646b(m23346c, this.f15932a.mo42226get());
        C5936f.m22647a(m23346c, this.f15933b.mo42226get());
        return m23346c;
    }
}
