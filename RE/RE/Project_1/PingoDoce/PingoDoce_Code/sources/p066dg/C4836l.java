package p066dg;

import android.content.SharedPreferences;
import gg.C5661i;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: dg.l */
/* loaded from: classes2.dex */
public final class C4836l implements InterfaceC11614c<CoachmarksAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<C5661i> f13236a;

    /* renamed from: b */
    private final InterfaceC12341a<SharedPreferences> f13237b;

    public C4836l(InterfaceC12341a<C5661i> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        this.f13236a = interfaceC12341a;
        this.f13237b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C4836l m26509a(InterfaceC12341a<C5661i> interfaceC12341a, InterfaceC12341a<SharedPreferences> interfaceC12341a2) {
        return new C4836l(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static CoachmarksAgent m26507c(C5661i c5661i, SharedPreferences sharedPreferences) {
        return new CoachmarksAgent(c5661i, sharedPreferences);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public CoachmarksAgent mo42226get() {
        return m26507c(this.f13236a.mo42226get(), this.f13237b.mo42226get());
    }
}
