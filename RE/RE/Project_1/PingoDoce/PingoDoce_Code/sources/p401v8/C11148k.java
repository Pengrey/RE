package p401v8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p100f8.C5429l;

/* renamed from: v8.k */
/* loaded from: classes.dex */
public class C11148k {

    /* renamed from: m */
    public static final InterfaceC11137c f28622m = new C11146i(0.5f);

    /* renamed from: a */
    C11138d f28623a;

    /* renamed from: b */
    C11138d f28624b;

    /* renamed from: c */
    C11138d f28625c;

    /* renamed from: d */
    C11138d f28626d;

    /* renamed from: e */
    InterfaceC11137c f28627e;

    /* renamed from: f */
    InterfaceC11137c f28628f;

    /* renamed from: g */
    InterfaceC11137c f28629g;

    /* renamed from: h */
    InterfaceC11137c f28630h;

    /* renamed from: i */
    C11140f f28631i;

    /* renamed from: j */
    C11140f f28632j;

    /* renamed from: k */
    C11140f f28633k;

    /* renamed from: l */
    C11140f f28634l;

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: v8.k$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11151c {
        /* renamed from: a */
        InterfaceC11137c mo5900a(InterfaceC11137c interfaceC11137c);
    }

    /* renamed from: a */
    public static C11150b m5957a() {
        return new C11150b();
    }

    /* renamed from: b */
    public static C11150b m5956b(Context context, int i, int i2) {
        return m5955c(context, i, i2, 0);
    }

    /* renamed from: c */
    private static C11150b m5955c(Context context, int i, int i2, int i3) {
        return m5954d(context, i, i2, new C11135a(i3));
    }

    /* renamed from: d */
    private static C11150b m5954d(Context context, int i, int i2, InterfaceC11137c interfaceC11137c) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5429l.f14936F4);
        try {
            int i3 = obtainStyledAttributes.getInt(C5429l.f14944G4, 0);
            int i4 = obtainStyledAttributes.getInt(C5429l.f14968J4, i3);
            int i5 = obtainStyledAttributes.getInt(C5429l.f14976K4, i3);
            int i6 = obtainStyledAttributes.getInt(C5429l.f14960I4, i3);
            int i7 = obtainStyledAttributes.getInt(C5429l.f14952H4, i3);
            InterfaceC11137c m5945m = m5945m(obtainStyledAttributes, C5429l.f14984L4, interfaceC11137c);
            InterfaceC11137c m5945m2 = m5945m(obtainStyledAttributes, C5429l.f15008O4, m5945m);
            InterfaceC11137c m5945m3 = m5945m(obtainStyledAttributes, C5429l.f15016P4, m5945m);
            InterfaceC11137c m5945m4 = m5945m(obtainStyledAttributes, C5429l.f15000N4, m5945m);
            return new C11150b().m5902y(i4, m5945m2).m5930C(i5, m5945m3).m5906u(i6, m5945m4).m5910q(i7, m5945m(obtainStyledAttributes, C5429l.f14992M4, m5945m));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C11150b m5953e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m5952f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C11150b m5952f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m5951g(context, attributeSet, i, i2, new C11135a(i3));
    }

    /* renamed from: g */
    public static C11150b m5951g(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC11137c interfaceC11137c) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15015P3, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C5429l.f15023Q3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C5429l.f15031R3, 0);
        obtainStyledAttributes.recycle();
        return m5954d(context, resourceId, resourceId2, interfaceC11137c);
    }

    /* renamed from: m */
    private static InterfaceC11137c m5945m(TypedArray typedArray, int i, InterfaceC11137c interfaceC11137c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC11137c;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C11135a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C11146i(peekValue.getFraction(1.0f, 1.0f)) : interfaceC11137c;
    }

    /* renamed from: h */
    public C11140f m5950h() {
        return this.f28633k;
    }

    /* renamed from: i */
    public C11138d m5949i() {
        return this.f28626d;
    }

    /* renamed from: j */
    public InterfaceC11137c m5948j() {
        return this.f28630h;
    }

    /* renamed from: k */
    public C11138d m5947k() {
        return this.f28625c;
    }

    /* renamed from: l */
    public InterfaceC11137c m5946l() {
        return this.f28629g;
    }

    /* renamed from: n */
    public C11140f m5944n() {
        return this.f28634l;
    }

    /* renamed from: o */
    public C11140f m5943o() {
        return this.f28632j;
    }

    /* renamed from: p */
    public C11140f m5942p() {
        return this.f28631i;
    }

    /* renamed from: q */
    public C11138d m5941q() {
        return this.f28623a;
    }

    /* renamed from: r */
    public InterfaceC11137c m5940r() {
        return this.f28627e;
    }

    /* renamed from: s */
    public C11138d m5939s() {
        return this.f28624b;
    }

    /* renamed from: t */
    public InterfaceC11137c m5938t() {
        return this.f28628f;
    }

    /* renamed from: u */
    public boolean m5937u(RectF rectF) {
        boolean z = this.f28634l.getClass().equals(C11140f.class) && this.f28632j.getClass().equals(C11140f.class) && this.f28631i.getClass().equals(C11140f.class) && this.f28633k.getClass().equals(C11140f.class);
        float mo5959a = this.f28627e.mo5959a(rectF);
        return z && ((this.f28628f.mo5959a(rectF) > mo5959a ? 1 : (this.f28628f.mo5959a(rectF) == mo5959a ? 0 : -1)) == 0 && (this.f28630h.mo5959a(rectF) > mo5959a ? 1 : (this.f28630h.mo5959a(rectF) == mo5959a ? 0 : -1)) == 0 && (this.f28629g.mo5959a(rectF) > mo5959a ? 1 : (this.f28629g.mo5959a(rectF) == mo5959a ? 0 : -1)) == 0) && ((this.f28624b instanceof C11147j) && (this.f28623a instanceof C11147j) && (this.f28625c instanceof C11147j) && (this.f28626d instanceof C11147j));
    }

    /* renamed from: v */
    public C11150b m5936v() {
        return new C11150b(this);
    }

    /* renamed from: w */
    public C11148k m5935w(float f) {
        return m5936v().m5912o(f).m5914m();
    }

    /* renamed from: x */
    public C11148k m5934x(InterfaceC11137c interfaceC11137c) {
        return m5936v().m5911p(interfaceC11137c).m5914m();
    }

    /* renamed from: y */
    public C11148k m5933y(InterfaceC11151c interfaceC11151c) {
        return m5936v().m5931B(interfaceC11151c.mo5900a(m5940r())).m5927F(interfaceC11151c.mo5900a(m5938t())).m5907t(interfaceC11151c.mo5900a(m5948j())).m5903x(interfaceC11151c.mo5900a(m5946l())).m5914m();
    }

    private C11148k(C11150b c11150b) {
        this.f28623a = c11150b.f28635a;
        this.f28624b = c11150b.f28636b;
        this.f28625c = c11150b.f28637c;
        this.f28626d = c11150b.f28638d;
        this.f28627e = c11150b.f28639e;
        this.f28628f = c11150b.f28640f;
        this.f28629g = c11150b.f28641g;
        this.f28630h = c11150b.f28642h;
        this.f28631i = c11150b.f28643i;
        this.f28632j = c11150b.f28644j;
        this.f28633k = c11150b.f28645k;
        this.f28634l = c11150b.f28646l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: v8.k$b */
    /* loaded from: classes.dex */
    public static final class C11150b {

        /* renamed from: a */
        private C11138d f28635a;

        /* renamed from: b */
        private C11138d f28636b;

        /* renamed from: c */
        private C11138d f28637c;

        /* renamed from: d */
        private C11138d f28638d;

        /* renamed from: e */
        private InterfaceC11137c f28639e;

        /* renamed from: f */
        private InterfaceC11137c f28640f;

        /* renamed from: g */
        private InterfaceC11137c f28641g;

        /* renamed from: h */
        private InterfaceC11137c f28642h;

        /* renamed from: i */
        private C11140f f28643i;

        /* renamed from: j */
        private C11140f f28644j;

        /* renamed from: k */
        private C11140f f28645k;

        /* renamed from: l */
        private C11140f f28646l;

        public C11150b() {
            this.f28635a = C11145h.m5964b();
            this.f28636b = C11145h.m5964b();
            this.f28637c = C11145h.m5964b();
            this.f28638d = C11145h.m5964b();
            this.f28639e = new C11135a(0.0f);
            this.f28640f = new C11135a(0.0f);
            this.f28641g = new C11135a(0.0f);
            this.f28642h = new C11135a(0.0f);
            this.f28643i = C11145h.m5963c();
            this.f28644j = C11145h.m5963c();
            this.f28645k = C11145h.m5963c();
            this.f28646l = C11145h.m5963c();
        }

        /* renamed from: n */
        private static float m5913n(C11138d c11138d) {
            if (c11138d instanceof C11147j) {
                return ((C11147j) c11138d).f28621a;
            }
            if (c11138d instanceof C11139e) {
                return ((C11139e) c11138d).f28570a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C11150b m5932A(float f) {
            this.f28639e = new C11135a(f);
            return this;
        }

        /* renamed from: B */
        public C11150b m5931B(InterfaceC11137c interfaceC11137c) {
            this.f28639e = interfaceC11137c;
            return this;
        }

        /* renamed from: C */
        public C11150b m5930C(int i, InterfaceC11137c interfaceC11137c) {
            return m5929D(C11145h.m5965a(i)).m5927F(interfaceC11137c);
        }

        /* renamed from: D */
        public C11150b m5929D(C11138d c11138d) {
            this.f28636b = c11138d;
            float m5913n = m5913n(c11138d);
            if (m5913n != -1.0f) {
                m5928E(m5913n);
            }
            return this;
        }

        /* renamed from: E */
        public C11150b m5928E(float f) {
            this.f28640f = new C11135a(f);
            return this;
        }

        /* renamed from: F */
        public C11150b m5927F(InterfaceC11137c interfaceC11137c) {
            this.f28640f = interfaceC11137c;
            return this;
        }

        /* renamed from: m */
        public C11148k m5914m() {
            return new C11148k(this);
        }

        /* renamed from: o */
        public C11150b m5912o(float f) {
            return m5932A(f).m5928E(f).m5904w(f).m5908s(f);
        }

        /* renamed from: p */
        public C11150b m5911p(InterfaceC11137c interfaceC11137c) {
            return m5931B(interfaceC11137c).m5927F(interfaceC11137c).m5903x(interfaceC11137c).m5907t(interfaceC11137c);
        }

        /* renamed from: q */
        public C11150b m5910q(int i, InterfaceC11137c interfaceC11137c) {
            return m5909r(C11145h.m5965a(i)).m5907t(interfaceC11137c);
        }

        /* renamed from: r */
        public C11150b m5909r(C11138d c11138d) {
            this.f28638d = c11138d;
            float m5913n = m5913n(c11138d);
            if (m5913n != -1.0f) {
                m5908s(m5913n);
            }
            return this;
        }

        /* renamed from: s */
        public C11150b m5908s(float f) {
            this.f28642h = new C11135a(f);
            return this;
        }

        /* renamed from: t */
        public C11150b m5907t(InterfaceC11137c interfaceC11137c) {
            this.f28642h = interfaceC11137c;
            return this;
        }

        /* renamed from: u */
        public C11150b m5906u(int i, InterfaceC11137c interfaceC11137c) {
            return m5905v(C11145h.m5965a(i)).m5903x(interfaceC11137c);
        }

        /* renamed from: v */
        public C11150b m5905v(C11138d c11138d) {
            this.f28637c = c11138d;
            float m5913n = m5913n(c11138d);
            if (m5913n != -1.0f) {
                m5904w(m5913n);
            }
            return this;
        }

        /* renamed from: w */
        public C11150b m5904w(float f) {
            this.f28641g = new C11135a(f);
            return this;
        }

        /* renamed from: x */
        public C11150b m5903x(InterfaceC11137c interfaceC11137c) {
            this.f28641g = interfaceC11137c;
            return this;
        }

        /* renamed from: y */
        public C11150b m5902y(int i, InterfaceC11137c interfaceC11137c) {
            return m5901z(C11145h.m5965a(i)).m5931B(interfaceC11137c);
        }

        /* renamed from: z */
        public C11150b m5901z(C11138d c11138d) {
            this.f28635a = c11138d;
            float m5913n = m5913n(c11138d);
            if (m5913n != -1.0f) {
                m5932A(m5913n);
            }
            return this;
        }

        public C11150b(C11148k c11148k) {
            this.f28635a = C11145h.m5964b();
            this.f28636b = C11145h.m5964b();
            this.f28637c = C11145h.m5964b();
            this.f28638d = C11145h.m5964b();
            this.f28639e = new C11135a(0.0f);
            this.f28640f = new C11135a(0.0f);
            this.f28641g = new C11135a(0.0f);
            this.f28642h = new C11135a(0.0f);
            this.f28643i = C11145h.m5963c();
            this.f28644j = C11145h.m5963c();
            this.f28645k = C11145h.m5963c();
            this.f28646l = C11145h.m5963c();
            this.f28635a = c11148k.f28623a;
            this.f28636b = c11148k.f28624b;
            this.f28637c = c11148k.f28625c;
            this.f28638d = c11148k.f28626d;
            this.f28639e = c11148k.f28627e;
            this.f28640f = c11148k.f28628f;
            this.f28641g = c11148k.f28629g;
            this.f28642h = c11148k.f28630h;
            this.f28643i = c11148k.f28631i;
            this.f28644j = c11148k.f28632j;
            this.f28645k = c11148k.f28633k;
            this.f28646l = c11148k.f28634l;
        }
    }

    public C11148k() {
        this.f28623a = C11145h.m5964b();
        this.f28624b = C11145h.m5964b();
        this.f28625c = C11145h.m5964b();
        this.f28626d = C11145h.m5964b();
        this.f28627e = new C11135a(0.0f);
        this.f28628f = new C11135a(0.0f);
        this.f28629g = new C11135a(0.0f);
        this.f28630h = new C11135a(0.0f);
        this.f28631i = C11145h.m5963c();
        this.f28632j = C11145h.m5963c();
        this.f28633k = C11145h.m5963c();
        this.f28634l = C11145h.m5963c();
    }
}
