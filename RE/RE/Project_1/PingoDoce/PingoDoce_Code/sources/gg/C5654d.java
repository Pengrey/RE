package gg;

import android.content.SharedPreferences;
import p142hg.C5931b;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: gg.d */
/* loaded from: classes2.dex */
public final class C5654d implements InterfaceC11614c<C5652c> {

    /* renamed from: a */
    private final InterfaceC12341a<SharedPreferences> f15908a;

    public C5654d(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        this.f15908a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C5654d m23387a(InterfaceC12341a<SharedPreferences> interfaceC12341a) {
        return new C5654d(interfaceC12341a);
    }

    /* renamed from: c */
    public static C5652c m23385c() {
        return new C5652c();
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C5652c mo42226get() {
        C5652c m23385c = m23385c();
        C5931b.m22691a(m23385c, this.f15908a.mo42226get());
        return m23385c;
    }
}
