package p040c4;

import com.airbnb.lottie.C2210f;
import p026b4.C1798b;
import p055d4.AbstractC4724a;
import p436x3.C12282s;
import p436x3.InterfaceC12264c;

/* renamed from: c4.q */
/* loaded from: classes.dex */
public class C2086q implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6062a;

    /* renamed from: b */
    private final EnumC2087a f6063b;

    /* renamed from: c */
    private final C1798b f6064c;

    /* renamed from: d */
    private final C1798b f6065d;

    /* renamed from: e */
    private final C1798b f6066e;

    /* renamed from: f */
    private final boolean f6067f;

    /* compiled from: ShapeTrimPath.java */
    /* renamed from: c4.q$a */
    /* loaded from: classes.dex */
    public enum EnumC2087a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static EnumC2087a forId(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public C2086q(String str, EnumC2087a enumC2087a, C1798b c1798b, C1798b c1798b2, C1798b c1798b3, boolean z) {
        this.f6062a = str;
        this.f6063b = enumC2087a;
        this.f6064c = c1798b;
        this.f6065d = c1798b2;
        this.f6066e = c1798b3;
        this.f6067f = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12282s(abstractC4724a, this);
    }

    /* renamed from: b */
    public C1798b m34709b() {
        return this.f6065d;
    }

    /* renamed from: c */
    public String m34708c() {
        return this.f6062a;
    }

    /* renamed from: d */
    public C1798b m34707d() {
        return this.f6066e;
    }

    /* renamed from: e */
    public C1798b m34706e() {
        return this.f6064c;
    }

    /* renamed from: f */
    public EnumC2087a m34705f() {
        return this.f6063b;
    }

    /* renamed from: g */
    public boolean m34704g() {
        return this.f6067f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f6064c + ", end: " + this.f6065d + ", offset: " + this.f6066e + "}";
    }
}
