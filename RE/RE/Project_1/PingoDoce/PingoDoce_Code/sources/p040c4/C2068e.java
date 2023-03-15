package p040c4;

import com.airbnb.lottie.C2210f;
import java.util.List;
import p026b4.C1798b;
import p026b4.C1799c;
import p026b4.C1800d;
import p026b4.C1802f;
import p040c4.C2082p;
import p055d4.AbstractC4724a;
import p436x3.C12270i;
import p436x3.InterfaceC12264c;

/* renamed from: c4.e */
/* loaded from: classes.dex */
public class C2068e implements InterfaceC2065b {

    /* renamed from: a */
    private final String f5994a;

    /* renamed from: b */
    private final EnumC2069f f5995b;

    /* renamed from: c */
    private final C1799c f5996c;

    /* renamed from: d */
    private final C1800d f5997d;

    /* renamed from: e */
    private final C1802f f5998e;

    /* renamed from: f */
    private final C1802f f5999f;

    /* renamed from: g */
    private final C1798b f6000g;

    /* renamed from: h */
    private final C2082p.EnumC2084b f6001h;

    /* renamed from: i */
    private final C2082p.EnumC2085c f6002i;

    /* renamed from: j */
    private final float f6003j;

    /* renamed from: k */
    private final List<C1798b> f6004k;

    /* renamed from: l */
    private final C1798b f6005l;

    /* renamed from: m */
    private final boolean f6006m;

    public C2068e(String str, EnumC2069f enumC2069f, C1799c c1799c, C1800d c1800d, C1802f c1802f, C1802f c1802f2, C1798b c1798b, C2082p.EnumC2084b enumC2084b, C2082p.EnumC2085c enumC2085c, float f, List<C1798b> list, C1798b c1798b2, boolean z) {
        this.f5994a = str;
        this.f5995b = enumC2069f;
        this.f5996c = c1799c;
        this.f5997d = c1800d;
        this.f5998e = c1802f;
        this.f5999f = c1802f2;
        this.f6000g = c1798b;
        this.f6001h = enumC2084b;
        this.f6002i = enumC2085c;
        this.f6003j = f;
        this.f6004k = list;
        this.f6005l = c1798b2;
        this.f6006m = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12270i(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public C2082p.EnumC2084b m34776b() {
        return this.f6001h;
    }

    /* renamed from: c */
    public C1798b m34775c() {
        return this.f6005l;
    }

    /* renamed from: d */
    public C1802f m34774d() {
        return this.f5999f;
    }

    /* renamed from: e */
    public C1799c m34773e() {
        return this.f5996c;
    }

    /* renamed from: f */
    public EnumC2069f m34772f() {
        return this.f5995b;
    }

    /* renamed from: g */
    public C2082p.EnumC2085c m34771g() {
        return this.f6002i;
    }

    /* renamed from: h */
    public List<C1798b> m34770h() {
        return this.f6004k;
    }

    /* renamed from: i */
    public float m34769i() {
        return this.f6003j;
    }

    /* renamed from: j */
    public String m34768j() {
        return this.f5994a;
    }

    /* renamed from: k */
    public C1800d m34767k() {
        return this.f5997d;
    }

    /* renamed from: l */
    public C1802f m34766l() {
        return this.f5998e;
    }

    /* renamed from: m */
    public C1798b m34765m() {
        return this.f6000g;
    }

    /* renamed from: n */
    public boolean m34764n() {
        return this.f6006m;
    }
}
