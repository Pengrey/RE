package p040c4;

import android.graphics.PointF;
import com.airbnb.lottie.C2210f;
import p026b4.C1802f;
import p026b4.InterfaceC1809m;
import p055d4.AbstractC4724a;
import p436x3.C12267f;
import p436x3.InterfaceC12264c;

/* renamed from: c4.a */
/* loaded from: classes.dex */
public class C2064a implements InterfaceC2065b {

    /* renamed from: a */
    private final String f5979a;

    /* renamed from: b */
    private final InterfaceC1809m<PointF, PointF> f5980b;

    /* renamed from: c */
    private final C1802f f5981c;

    /* renamed from: d */
    private final boolean f5982d;

    /* renamed from: e */
    private final boolean f5983e;

    public C2064a(String str, InterfaceC1809m<PointF, PointF> interfaceC1809m, C1802f c1802f, boolean z, boolean z2) {
        this.f5979a = str;
        this.f5980b = interfaceC1809m;
        this.f5981c = c1802f;
        this.f5982d = z;
        this.f5983e = z2;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12267f(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public String m34793b() {
        return this.f5979a;
    }

    /* renamed from: c */
    public InterfaceC1809m<PointF, PointF> m34792c() {
        return this.f5980b;
    }

    /* renamed from: d */
    public C1802f m34791d() {
        return this.f5981c;
    }

    /* renamed from: e */
    public boolean m34790e() {
        return this.f5983e;
    }

    /* renamed from: f */
    public boolean m34789f() {
        return this.f5982d;
    }
}
