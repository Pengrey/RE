package p040c4;

import android.graphics.PointF;
import com.airbnb.lottie.C2210f;
import p026b4.C1798b;
import p026b4.InterfaceC1809m;
import p055d4.AbstractC4724a;
import p436x3.C12276n;
import p436x3.InterfaceC12264c;

/* renamed from: c4.i */
/* loaded from: classes.dex */
public class C2074i implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6014a;

    /* renamed from: b */
    private final EnumC2075a f6015b;

    /* renamed from: c */
    private final C1798b f6016c;

    /* renamed from: d */
    private final InterfaceC1809m<PointF, PointF> f6017d;

    /* renamed from: e */
    private final C1798b f6018e;

    /* renamed from: f */
    private final C1798b f6019f;

    /* renamed from: g */
    private final C1798b f6020g;

    /* renamed from: h */
    private final C1798b f6021h;

    /* renamed from: i */
    private final C1798b f6022i;

    /* renamed from: j */
    private final boolean f6023j;

    /* compiled from: PolystarShape.java */
    /* renamed from: c4.i$a */
    /* loaded from: classes.dex */
    public enum EnumC2075a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        EnumC2075a(int i) {
            this.value = i;
        }

        public static EnumC2075a forValue(int i) {
            EnumC2075a[] values;
            for (EnumC2075a enumC2075a : values()) {
                if (enumC2075a.value == i) {
                    return enumC2075a;
                }
            }
            return null;
        }
    }

    public C2074i(String str, EnumC2075a enumC2075a, C1798b c1798b, InterfaceC1809m<PointF, PointF> interfaceC1809m, C1798b c1798b2, C1798b c1798b3, C1798b c1798b4, C1798b c1798b5, C1798b c1798b6, boolean z) {
        this.f6014a = str;
        this.f6015b = enumC2075a;
        this.f6016c = c1798b;
        this.f6017d = interfaceC1809m;
        this.f6018e = c1798b2;
        this.f6019f = c1798b3;
        this.f6020g = c1798b4;
        this.f6021h = c1798b5;
        this.f6022i = c1798b6;
        this.f6023j = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12276n(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public C1798b m34756b() {
        return this.f6019f;
    }

    /* renamed from: c */
    public C1798b m34755c() {
        return this.f6021h;
    }

    /* renamed from: d */
    public String m34754d() {
        return this.f6014a;
    }

    /* renamed from: e */
    public C1798b m34753e() {
        return this.f6020g;
    }

    /* renamed from: f */
    public C1798b m34752f() {
        return this.f6022i;
    }

    /* renamed from: g */
    public C1798b m34751g() {
        return this.f6016c;
    }

    /* renamed from: h */
    public InterfaceC1809m<PointF, PointF> m34750h() {
        return this.f6017d;
    }

    /* renamed from: i */
    public C1798b m34749i() {
        return this.f6018e;
    }

    /* renamed from: j */
    public EnumC2075a m34748j() {
        return this.f6015b;
    }

    /* renamed from: k */
    public boolean m34747k() {
        return this.f6023j;
    }
}
