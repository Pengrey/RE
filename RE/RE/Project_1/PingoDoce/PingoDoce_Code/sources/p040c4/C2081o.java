package p040c4;

import com.airbnb.lottie.C2210f;
import p026b4.C1804h;
import p055d4.AbstractC4724a;
import p436x3.C12280q;
import p436x3.InterfaceC12264c;

/* renamed from: c4.o */
/* loaded from: classes.dex */
public class C2081o implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6046a;

    /* renamed from: b */
    private final int f6047b;

    /* renamed from: c */
    private final C1804h f6048c;

    /* renamed from: d */
    private final boolean f6049d;

    public C2081o(String str, int i, C1804h c1804h, boolean z) {
        this.f6046a = str;
        this.f6047b = i;
        this.f6048c = c1804h;
        this.f6049d = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12280q(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public String m34723b() {
        return this.f6046a;
    }

    /* renamed from: c */
    public C1804h m34722c() {
        return this.f6048c;
    }

    /* renamed from: d */
    public boolean m34721d() {
        return this.f6049d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f6046a + ", index=" + this.f6047b + '}';
    }
}
