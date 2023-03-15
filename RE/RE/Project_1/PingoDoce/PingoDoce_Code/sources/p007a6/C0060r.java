package p007a6;

import p461y5.AbstractC13112c;
import p461y5.C13111b;
import p461y5.InterfaceC13114e;
import p461y5.InterfaceC13115f;
import p461y5.InterfaceC13117h;

/* renamed from: a6.r */
/* loaded from: classes.dex */
final class C0060r<T> implements InterfaceC13115f<T> {

    /* renamed from: a */
    private final AbstractC0056o f163a;

    /* renamed from: b */
    private final String f164b;

    /* renamed from: c */
    private final C13111b f165c;

    /* renamed from: d */
    private final InterfaceC13114e<T, byte[]> f166d;

    /* renamed from: e */
    private final InterfaceC0061s f167e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0060r(AbstractC0056o abstractC0056o, String str, C13111b c13111b, InterfaceC13114e<T, byte[]> interfaceC13114e, InterfaceC0061s interfaceC0061s) {
        this.f163a = abstractC0056o;
        this.f164b = str;
        this.f165c = c13111b;
        this.f166d = interfaceC13114e;
        this.f167e = interfaceC0061s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m42034d(Exception exc) {
    }

    @Override // p461y5.InterfaceC13115f
    /* renamed from: a */
    public void mo1577a(AbstractC13112c<T> abstractC13112c, InterfaceC13117h interfaceC13117h) {
        this.f167e.mo42033a(AbstractC0054n.m42058a().mo42047e(this.f163a).mo42049c(abstractC13112c).mo42046f(this.f164b).mo42048d(this.f166d).mo42050b(this.f165c).mo42051a(), interfaceC13117h);
    }

    @Override // p461y5.InterfaceC13115f
    /* renamed from: b */
    public void mo1576b(AbstractC13112c<T> abstractC13112c) {
        mo1577a(abstractC13112c, C0059q.f162a);
    }
}
