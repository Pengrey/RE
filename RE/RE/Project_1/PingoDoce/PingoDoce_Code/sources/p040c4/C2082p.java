package p040c4;

import android.graphics.Paint;
import com.airbnb.lottie.C2210f;
import java.util.List;
import p026b4.C1797a;
import p026b4.C1798b;
import p026b4.C1800d;
import p055d4.AbstractC4724a;
import p436x3.C12281r;
import p436x3.InterfaceC12264c;

/* renamed from: c4.p */
/* loaded from: classes.dex */
public class C2082p implements InterfaceC2065b {

    /* renamed from: a */
    private final String f6050a;

    /* renamed from: b */
    private final C1798b f6051b;

    /* renamed from: c */
    private final List<C1798b> f6052c;

    /* renamed from: d */
    private final C1797a f6053d;

    /* renamed from: e */
    private final C1800d f6054e;

    /* renamed from: f */
    private final C1798b f6055f;

    /* renamed from: g */
    private final EnumC2084b f6056g;

    /* renamed from: h */
    private final EnumC2085c f6057h;

    /* renamed from: i */
    private final float f6058i;

    /* renamed from: j */
    private final boolean f6059j;

    /* compiled from: ShapeStroke.java */
    /* renamed from: c4.p$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2083a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6060a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6061b;

        static {
            int[] iArr = new int[EnumC2085c.values().length];
            f6061b = iArr;
            try {
                iArr[EnumC2085c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6061b[EnumC2085c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6061b[EnumC2085c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC2084b.values().length];
            f6060a = iArr2;
            try {
                iArr2[EnumC2084b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6060a[EnumC2084b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6060a[EnumC2084b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: c4.p$b */
    /* loaded from: classes.dex */
    public enum EnumC2084b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = C2083a.f6060a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: c4.p$c */
    /* loaded from: classes.dex */
    public enum EnumC2085c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = C2083a.f6061b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public C2082p(String str, C1798b c1798b, List<C1798b> list, C1797a c1797a, C1800d c1800d, C1798b c1798b2, EnumC2084b enumC2084b, EnumC2085c enumC2085c, float f, boolean z) {
        this.f6050a = str;
        this.f6051b = c1798b;
        this.f6052c = list;
        this.f6053d = c1797a;
        this.f6054e = c1800d;
        this.f6055f = c1798b2;
        this.f6056g = enumC2084b;
        this.f6057h = enumC2085c;
        this.f6058i = f;
        this.f6059j = z;
    }

    @Override // p040c4.InterfaceC2065b
    /* renamed from: a */
    public InterfaceC12264c mo34710a(C2210f c2210f, AbstractC4724a abstractC4724a) {
        return new C12281r(c2210f, abstractC4724a, this);
    }

    /* renamed from: b */
    public EnumC2084b m34720b() {
        return this.f6056g;
    }

    /* renamed from: c */
    public C1797a m34719c() {
        return this.f6053d;
    }

    /* renamed from: d */
    public C1798b m34718d() {
        return this.f6051b;
    }

    /* renamed from: e */
    public EnumC2085c m34717e() {
        return this.f6057h;
    }

    /* renamed from: f */
    public List<C1798b> m34716f() {
        return this.f6052c;
    }

    /* renamed from: g */
    public float m34715g() {
        return this.f6058i;
    }

    /* renamed from: h */
    public String m34714h() {
        return this.f6050a;
    }

    /* renamed from: i */
    public C1800d m34713i() {
        return this.f6054e;
    }

    /* renamed from: j */
    public C1798b m34712j() {
        return this.f6055f;
    }

    /* renamed from: k */
    public boolean m34711k() {
        return this.f6059j;
    }
}
