package p040c4;

import android.graphics.Path;
import com.airbnb.lottie.C2210f;
import p026b4.C1798b;
import p026b4.C1799c;
import p026b4.C1800d;
import p026b4.C1802f;
import p055d4.AbstractC4724a;
import p436x3.C12269h;
import p436x3.InterfaceC12264c;

/* renamed from: c4.d */
/* loaded from: classes.dex */
public class C2067d implements InterfaceC2065b {

    /* renamed from: a */
    private final EnumC2069f f5986a;

    /* renamed from: b */
    private final Path.FillType f5987b;

    /* renamed from: c */
    private final C1799c f5988c;

    /* renamed from: d */
    private final C1800d f5989d;

    /* renamed from: e */
    private final C1802f f5990e;

    /* renamed from: f */
    private final C1802f f5991f;

    /* renamed from: g */
    private final String f5992g;

    /* renamed from: h */
    private final boolean f5993h;

    public C2067d(String str, EnumC2069f enumC2069f, Path.FillType fillType, C1799c c1799c, C1800d c1800d, C1802f c1802f, C1802f c1802f2, C1798b c1798b, C1798b c1798b2, boolean z) {
        this.f5986a = enumC2069f;
        this.f5987b = fillType;
        this.f5988c = c1799c;
        this.f5989d = c1800d;
        this.f5990e = c1802f;
        this.f5991f = c1802f2;
        this.f5992g = str;
        this.f5993h = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12269h(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public C1802f m34784b() {
        return this.f5991f;
    }

    /* renamed from: c */
    public Path.FillType m34783c() {
        return this.f5987b;
    }

    /* renamed from: d */
    public C1799c m34782d() {
        return this.f5988c;
    }

    /* renamed from: e */
    public EnumC2069f m34781e() {
        return this.f5986a;
    }

    /* renamed from: f */
    public String m34780f() {
        return this.f5992g;
    }

    /* renamed from: g */
    public C1800d m34779g() {
        return this.f5989d;
    }

    /* renamed from: h */
    public C1802f m34778h() {
        return this.f5990e;
    }

    /* renamed from: i */
    public boolean m34777i() {
        return this.f5993h;
    }
}
