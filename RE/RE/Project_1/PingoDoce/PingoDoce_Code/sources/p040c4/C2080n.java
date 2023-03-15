package p040c4;

import com.airbnb.lottie.C2210f;
import java.util.Arrays;
import java.util.List;
import p055d4.AbstractC4724a;
import p436x3.C12265d;
import p436x3.InterfaceC12264c;

/* renamed from: c4.n */
/* loaded from: classes.dex */
public class C2080n implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6043a;

    /* renamed from: b */
    private final List<InterfaceC2065b> f6044b;

    /* renamed from: c */
    private final boolean f6045c;

    public C2080n(String str, List<InterfaceC2065b> list, boolean z) {
        this.f6043a = str;
        this.f6044b = list;
        this.f6045c = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12265d(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public List<InterfaceC2065b> m34726b() {
        return this.f6044b;
    }

    /* renamed from: c */
    public String m34725c() {
        return this.f6043a;
    }

    /* renamed from: d */
    public boolean m34724d() {
        return this.f6045c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f6043a + "' Shapes: " + Arrays.toString(this.f6044b.toArray()) + '}';
    }
}
