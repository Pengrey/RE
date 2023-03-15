package p007a6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p132h6.InterfaceC5861e;
import p154i6.C6035p;
import p154i6.C6039t;
import p216l6.InterfaceC6984a;
import p461y5.C13111b;
import p461y5.InterfaceC13116g;
import p461y5.InterfaceC13117h;

/* renamed from: a6.t */
/* loaded from: classes.dex */
public class C0062t implements InterfaceC0061s {

    /* renamed from: e */
    private static volatile AbstractC0063u f168e;

    /* renamed from: a */
    private final InterfaceC6984a f169a;

    /* renamed from: b */
    private final InterfaceC6984a f170b;

    /* renamed from: c */
    private final InterfaceC5861e f171c;

    /* renamed from: d */
    private final C6035p f172d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0062t(InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, InterfaceC5861e interfaceC5861e, C6035p c6035p, C6039t c6039t) {
        this.f169a = interfaceC6984a;
        this.f170b = interfaceC6984a2;
        this.f171c = interfaceC5861e;
        this.f172d = c6035p;
        c6039t.m22316c();
    }

    /* renamed from: b */
    private AbstractC0046i m42032b(AbstractC0054n abstractC0054n) {
        return AbstractC0046i.m42088a().mo42068i(this.f169a.mo19644a()).mo42066k(this.f170b.mo19644a()).mo42067j(abstractC0054n.mo42052g()).mo42069h(new C0045h(abstractC0054n.mo42057b(), abstractC0054n.m42055d())).mo42070g(abstractC0054n.mo42056c().mo1583a()).mo42073d();
    }

    /* renamed from: c */
    public static C0062t m42031c() {
        AbstractC0063u abstractC0063u = f168e;
        if (abstractC0063u != null) {
            return abstractC0063u.mo42025c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C13111b> m42030d(InterfaceC0043f interfaceC0043f) {
        if (interfaceC0043f instanceof InterfaceC0044g) {
            return Collections.unmodifiableSet(((InterfaceC0044g) interfaceC0043f).mo33718b());
        }
        return Collections.singleton(C13111b.m1584b("proto"));
    }

    /* renamed from: f */
    public static void m42028f(Context context) {
        if (f168e == null) {
            synchronized (C0062t.class) {
                if (f168e == null) {
                    f168e = C0040e.m42093e().mo42024a(context).build();
                }
            }
        }
    }

    @Override // p007a6.InterfaceC0061s
    /* renamed from: a */
    public void mo42033a(AbstractC0054n abstractC0054n, InterfaceC13117h interfaceC13117h) {
        this.f171c.mo22864a(abstractC0054n.mo42053f().m42040f(abstractC0054n.mo42056c().mo1581c()), m42032b(abstractC0054n), interfaceC13117h);
    }

    /* renamed from: e */
    public C6035p m42029e() {
        return this.f172d;
    }

    /* renamed from: g */
    public InterfaceC13116g m42027g(InterfaceC0043f interfaceC0043f) {
        return new C0058p(m42030d(interfaceC0043f), AbstractC0056o.m42045a().mo42038b(interfaceC0043f.mo33719a()).mo42037c(interfaceC0043f.mo33717c()).mo42039a(), this);
    }
}
