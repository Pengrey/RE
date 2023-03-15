package p412w1;

import android.graphics.Typeface;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p301q.C9557f;
import p359t1.AbstractC10364e;
import p359t1.C10360b;
import p359t1.C10366h;
import p359t1.C10368i;
import p359t1.C10371k;
import p359t1.C10372l;
import p359t1.C10373m;
import p359t1.FontFamily;
import p359t1.FontMatcher;
import p359t1.FontWeight;
import p359t1.InterfaceC10359a;
import p359t1.InterfaceC10362d;

/* compiled from: TypefaceAdapter.android.kt */
/* renamed from: w1.j */
/* loaded from: classes.dex */
public class C11545j {

    /* renamed from: c */
    public static final C11547b f29560c = new C11547b(null);

    /* renamed from: d */
    private static final FontWeight f29561d = FontWeight.f26976x.m8099g();

    /* renamed from: e */
    private static final C9557f f29562e = new C9557f(16);

    /* renamed from: a */
    private final FontMatcher f29563a;

    /* renamed from: b */
    private final InterfaceC10362d.InterfaceC10363a f29564b;

    /* compiled from: TypefaceAdapter.android.kt */
    /* renamed from: w1.j$a */
    /* loaded from: classes.dex */
    public static final class C11546a {

        /* renamed from: a */
        private final AbstractC10364e f29565a;

        /* renamed from: b */
        private final FontWeight f29566b;

        /* renamed from: c */
        private final int f29567c;

        /* renamed from: d */
        private final int f29568d;

        private C11546a(AbstractC10364e abstractC10364e, FontWeight fontWeight, int i, int i2) {
            this.f29565a = abstractC10364e;
            this.f29566b = fontWeight;
            this.f29567c = i;
            this.f29568d = i2;
        }

        public /* synthetic */ C11546a(AbstractC10364e abstractC10364e, FontWeight fontWeight, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC10364e, fontWeight, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C11546a) {
                C11546a c11546a = (C11546a) obj;
                return Intrinsics.equals(this.f29565a, c11546a.f29565a) && Intrinsics.equals(this.f29566b, c11546a.f29566b) && C10366h.m8133f(this.f29567c, c11546a.f29567c) && C10368i.m8122f(this.f29568d, c11546a.f29568d);
            }
            return false;
        }

        public int hashCode() {
            AbstractC10364e abstractC10364e = this.f29565a;
            return ((((((abstractC10364e == null ? 0 : abstractC10364e.hashCode()) * 31) + this.f29566b.hashCode()) * 31) + C10366h.m8132g(this.f29567c)) * 31) + C10368i.m8121g(this.f29568d);
        }

        public String toString() {
            return "CacheKey(fontFamily=" + this.f29565a + ", fontWeight=" + this.f29566b + ", fontStyle=" + ((Object) C10366h.m8131h(this.f29567c)) + ", fontSynthesis=" + ((Object) C10368i.m8118j(this.f29568d)) + ')';
        }
    }

    /* compiled from: TypefaceAdapter.android.kt */
    /* renamed from: w1.j$b */
    /* loaded from: classes.dex */
    public static final class C11547b {
        private C11547b() {
        }

        public /* synthetic */ C11547b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m4752a(boolean z, boolean z2) {
            if (z2 && z) {
                return 3;
            }
            if (z) {
                return 1;
            }
            return z2 ? 2 : 0;
        }

        /* renamed from: b */
        public final int m4751b(FontWeight fontWeight, int i) {
            Intrinsics.isThisObjectNull(fontWeight, "fontWeight");
            return m4752a(fontWeight.m8107i(C11545j.m4757a()) >= 0, C10366h.m8133f(i, C10366h.f26954b.m8129a()));
        }

        /* renamed from: c */
        public final Typeface m4750c(Typeface typeface, InterfaceC10362d interfaceC10362d, FontWeight fontWeight, int i, int i2) {
            int m8106j;
            boolean m8133f;
            Intrinsics.isThisObjectNull(typeface, "typeface");
            Intrinsics.isThisObjectNull(interfaceC10362d, "font");
            Intrinsics.isThisObjectNull(fontWeight, "fontWeight");
            boolean z = true;
            boolean z2 = C10368i.m8119i(i2) && fontWeight.m8107i(C11545j.m4757a()) >= 0 && interfaceC10362d.mo8153c().m8107i(C11545j.m4757a()) < 0;
            boolean z3 = C10368i.m8120h(i2) && !C10366h.m8133f(i, interfaceC10362d.mo8154b());
            if (z3 || z2) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (!z3 || !C10366h.m8133f(i, C10366h.f26954b.m8129a())) {
                        z = false;
                    }
                    Typeface create = Typeface.create(typeface, m4752a(z2, z));
                    Intrinsics.checkIfNull(create, "{\n                val ta…argetStyle)\n            }");
                    return create;
                }
                if (z2) {
                    m8106j = fontWeight.m8106j();
                } else {
                    m8106j = interfaceC10362d.mo8153c().m8106j();
                }
                if (z3) {
                    m8133f = C10366h.m8133f(i, C10366h.f26954b.m8129a());
                } else {
                    m8133f = C10366h.m8133f(interfaceC10362d.mo8154b(), C10366h.f26954b.m8129a());
                }
                return C11548k.f29569a.m4749a(typeface, m8106j, m8133f);
            }
            return typeface;
        }
    }

    public C11545j(FontMatcher fontMatcher, InterfaceC10362d.InterfaceC10363a interfaceC10363a) {
        Intrinsics.isThisObjectNull(fontMatcher, "fontMatcher");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        this.f29563a = fontMatcher;
        this.f29564b = interfaceC10363a;
    }

    /* renamed from: a */
    public static final /* synthetic */ FontWeight m4757a() {
        return f29561d;
    }

    /* renamed from: c */
    public static /* synthetic */ Typeface m4755c(C11545j c11545j, AbstractC10364e abstractC10364e, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                abstractC10364e = null;
            }
            if ((i3 & 2) != 0) {
                fontWeight = FontWeight.f26976x.m8102d();
            }
            if ((i3 & 4) != 0) {
                i = C10366h.f26954b.m8128b();
            }
            if ((i3 & 8) != 0) {
                i2 = C10368i.f26958b.m8116a();
            }
            return c11545j.m4756b(abstractC10364e, fontWeight, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-DPcqOEQ");
    }

    /* renamed from: d */
    private final Typeface m4754d(String str, FontWeight fontWeight, int i) {
        Typeface create;
        Typeface create2;
        C10366h.C10367a c10367a = C10366h.f26954b;
        boolean z = true;
        if (C10366h.m8133f(i, c10367a.m8128b()) && Intrinsics.equals(fontWeight, FontWeight.f26976x.m8102d())) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                Intrinsics.checkIfNull(typeface, "DEFAULT");
                return typeface;
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            int m4751b = f29560c.m4751b(fontWeight, i);
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                create2 = Typeface.defaultFromStyle(m4751b);
            } else {
                create2 = Typeface.create(str, m4751b);
            }
            Intrinsics.checkIfNull(create2, "{\n            val target…)\n            }\n        }");
            return create2;
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        C11548k c11548k = C11548k.f29569a;
        Intrinsics.checkIfNull(create, "familyTypeface");
        return c11548k.m4749a(create, fontWeight.m8106j(), C10366h.m8133f(i, c10367a.m8129a()));
    }

    /* renamed from: e */
    private final Typeface m4753e(int i, FontWeight fontWeight, FontFamily fontFamily, int i2) {
        Typeface m8155a;
        InterfaceC10362d m8139b = this.f29563a.m8139b(fontFamily, fontWeight, i);
        try {
            if (m8139b instanceof C10373m) {
                m8155a = (Typeface) this.f29564b.mo8152a(m8139b);
            } else if (!(m8139b instanceof InterfaceC10359a)) {
                throw new IllegalStateException(Intrinsics.addStrAndObj("Unknown font type: ", m8139b));
            } else {
                m8155a = ((InterfaceC10359a) m8139b).m8155a();
            }
            Typeface typeface = m8155a;
            return (C10368i.m8122f(i2, C10368i.f26958b.m8115b()) || (Intrinsics.equals(fontWeight, m8139b.mo8153c()) && C10366h.m8133f(i, m8139b.mo8154b()))) ? typeface : f29560c.m4750c(typeface, m8139b, fontWeight, i, i2);
        } catch (Exception e) {
            throw new IllegalStateException(Intrinsics.addStrAndObj("Cannot create Typeface from ", m8139b), e);
        }
    }

    /* renamed from: b */
    public Typeface m4756b(AbstractC10364e abstractC10364e, FontWeight fontWeight, int i, int i2) {
        Typeface m4759a;
        Intrinsics.isThisObjectNull(fontWeight, "fontWeight");
        C11546a c11546a = new C11546a(abstractC10364e, fontWeight, i, i2, null);
        C9557f c9557f = f29562e;
        Typeface typeface = (Typeface) c9557f.m10631d(c11546a);
        if (typeface != null) {
            return typeface;
        }
        if (abstractC10364e instanceof FontFamily) {
            m4759a = m4753e(i, fontWeight, (FontFamily) abstractC10364e, i2);
        } else if (abstractC10364e instanceof C10371k) {
            m4759a = m4754d(((C10371k) abstractC10364e).m8098f(), fontWeight, i);
        } else {
            boolean z = true;
            if (!(abstractC10364e instanceof C10360b) && abstractC10364e != null) {
                z = false;
            }
            if (z) {
                m4759a = m4754d(null, fontWeight, i);
            } else if (abstractC10364e instanceof C10372l) {
                m4759a = ((InterfaceC11543h) ((C10372l) abstractC10364e).m8097f()).m4759a(fontWeight, i, i2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        c9557f.m10629f(c11546a, m4759a);
        return m4759a;
    }

    public /* synthetic */ C11545j(FontMatcher fontMatcher, InterfaceC10362d.InterfaceC10363a interfaceC10363a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new FontMatcher() : fontMatcher, interfaceC10363a);
    }
}
