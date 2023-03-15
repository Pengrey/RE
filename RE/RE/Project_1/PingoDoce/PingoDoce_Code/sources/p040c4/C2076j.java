package p040c4;

import android.graphics.PointF;
import com.airbnb.lottie.C2210f;
import p026b4.C1798b;
import p026b4.InterfaceC1809m;
import p055d4.AbstractC4724a;
import p436x3.C12278o;
import p436x3.InterfaceC12264c;

/* renamed from: c4.j */
/* loaded from: classes.dex */
public class C2076j implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6024a;

    /* renamed from: b */
    private final InterfaceC1809m<PointF, PointF> f6025b;

    /* renamed from: c */
    private final InterfaceC1809m<PointF, PointF> f6026c;

    /* renamed from: d */
    private final C1798b f6027d;

    /* renamed from: e */
    private final boolean f6028e;

    public C2076j(String str, InterfaceC1809m<PointF, PointF> interfaceC1809m, InterfaceC1809m<PointF, PointF> interfaceC1809m2, C1798b c1798b, boolean z) {
        this.f6024a = str;
        this.f6025b = interfaceC1809m;
        this.f6026c = interfaceC1809m2;
        this.f6027d = c1798b;
        this.f6028e = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12278o(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public C1798b m34746b() {
        return this.f6027d;
    }

    /* renamed from: c */
    public String m34745c() {
        return this.f6024a;
    }

    /* renamed from: d */
    public InterfaceC1809m<PointF, PointF> m34744d() {
        return this.f6025b;
    }

    /* renamed from: e */
    public InterfaceC1809m<PointF, PointF> m34743e() {
        return this.f6026c;
    }

    /* renamed from: f */
    public boolean m34742f() {
        return this.f6028e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f6025b + ", size=" + this.f6026c + '}';
    }
}
