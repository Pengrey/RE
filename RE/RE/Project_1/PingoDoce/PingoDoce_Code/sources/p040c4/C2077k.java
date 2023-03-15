package p040c4;

import com.airbnb.lottie.C2210f;
import p026b4.C1798b;
import p026b4.C1808l;
import p055d4.AbstractC4724a;
import p436x3.C12279p;
import p436x3.InterfaceC12264c;

/* renamed from: c4.k */
/* loaded from: classes.dex */
public class C2077k implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6029a;

    /* renamed from: b */
    private final C1798b f6030b;

    /* renamed from: c */
    private final C1798b f6031c;

    /* renamed from: d */
    private final C1808l f6032d;

    /* renamed from: e */
    private final boolean f6033e;

    public C2077k(String str, C1798b c1798b, C1798b c1798b2, C1808l c1808l, boolean z) {
        this.f6029a = str;
        this.f6030b = c1798b;
        this.f6031c = c1798b2;
        this.f6032d = c1808l;
        this.f6033e = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12279p(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public C1798b m34741b() {
        return this.f6030b;
    }

    /* renamed from: c */
    public String m34740c() {
        return this.f6029a;
    }

    /* renamed from: d */
    public C1798b m34739d() {
        return this.f6031c;
    }

    /* renamed from: e */
    public C1808l m34738e() {
        return this.f6032d;
    }

    /* renamed from: f */
    public boolean m34737f() {
        return this.f6033e;
    }
}
