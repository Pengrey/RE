package p040c4;

import android.graphics.Path;
import com.airbnb.lottie.C2210f;
import p026b4.C1797a;
import p026b4.C1800d;
import p055d4.AbstractC4724a;
import p436x3.C12268g;
import p436x3.InterfaceC12264c;

/* renamed from: c4.m */
/* loaded from: classes.dex */
public class C2079m implements InterfaceC2065b {

    /* renamed from: a */
    private final boolean f6037a;

    /* renamed from: b */
    private final Path.FillType f6038b;

    /* renamed from: c */
    private final String f6039c;

    /* renamed from: d */
    private final C1797a f6040d;

    /* renamed from: e */
    private final C1800d f6041e;

    /* renamed from: f */
    private final boolean f6042f;

    public C2079m(String str, boolean z, Path.FillType fillType, C1797a c1797a, C1800d c1800d, boolean z2) {
        this.f6039c = str;
        this.f6037a = z;
        this.f6038b = fillType;
        this.f6040d = c1797a;
        this.f6041e = c1800d;
        this.f6042f = z2;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12268g(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public C1797a m34731b() {
        return this.f6040d;
    }

    /* renamed from: c */
    public Path.FillType m34730c() {
        return this.f6038b;
    }

    /* renamed from: d */
    public String m34729d() {
        return this.f6039c;
    }

    /* renamed from: e */
    public C1800d m34728e() {
        return this.f6041e;
    }

    /* renamed from: f */
    public boolean m34727f() {
        return this.f6042f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f6037a + '}';
    }
}
