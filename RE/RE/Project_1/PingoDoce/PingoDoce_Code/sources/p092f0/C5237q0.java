package p092f0;

import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
/* renamed from: f0.q0 */
/* loaded from: classes.dex */
public final class C5237q0 {

    /* renamed from: a */
    private final List f14500a;

    /* renamed from: b */
    private final int f14501b;

    /* renamed from: c */
    private int f14502c;

    /* renamed from: d */
    private final List f14503d;

    /* renamed from: e */
    private final HashMap f14504e;

    /* renamed from: f */
    private final InterfaceC13178g f14505f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.q0$a */
    /* loaded from: classes.dex */
    public static final class C5238a extends AbstractC6438m implements InterfaceC6097a {
        C5238a() {
            super(0);
        }

        /* renamed from: a */
        public final HashMap mo42214q() {
            HashMap m25038j = C5210k.m25038j();
            C5237q0 c5237q0 = C5237q0.this;
            int size = c5237q0.m24948b().size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                C5172g0 c5172g0 = (C5172g0) c5237q0.m24948b().get(i);
                C5210k.m25035m(m25038j, C5210k.m25042f(c5172g0), c5172g0);
                i = i2;
            }
            return m25038j;
        }
    }

    public C5237q0(List list, int i) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(list, "keyInfos");
        this.f14500a = list;
        this.f14501b = i;
        if (i >= 0) {
            this.f14503d = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = m24948b().size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C5172g0 c5172g0 = (C5172g0) m24948b().get(i3);
                hashMap.put(Integer.valueOf(c5172g0.m25370b()), new C5154b0(i3, i2, c5172g0.m25369c()));
                i2 += c5172g0.m25369c();
            }
            this.f14504e = hashMap;
            m1464a = LazyJVM.m1464a(new C5238a());
            this.f14505f = m1464a;
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    /* renamed from: a */
    public final int m24949a() {
        return this.f14502c;
    }

    /* renamed from: b */
    public final List m24948b() {
        return this.f14500a;
    }

    /* renamed from: c */
    public final HashMap m24947c() {
        return (HashMap) this.f14505f.getValue();
    }

    /* renamed from: d */
    public final C5172g0 m24946d(int i, Object obj) {
        return (C5172g0) C5210k.m25036l(m24947c(), obj != null ? new C5167f0(Integer.valueOf(i), obj) : Integer.valueOf(i));
    }

    /* renamed from: e */
    public final int m24945e() {
        return this.f14501b;
    }

    /* renamed from: f */
    public final List m24944f() {
        return this.f14503d;
    }

    /* renamed from: g */
    public final int m24943g(C5172g0 c5172g0) {
        Intrinsics.isThisObjectNull(c5172g0, "keyInfo");
        C5154b0 c5154b0 = (C5154b0) this.f14504e.get(Integer.valueOf(c5172g0.m25370b()));
        if (c5154b0 == null) {
            return -1;
        }
        return c5154b0.m25528b();
    }

    /* renamed from: h */
    public final boolean m24942h(C5172g0 c5172g0) {
        Intrinsics.isThisObjectNull(c5172g0, "keyInfo");
        return this.f14503d.add(c5172g0);
    }

    /* renamed from: i */
    public final void m24941i(C5172g0 c5172g0, int i) {
        Intrinsics.isThisObjectNull(c5172g0, "keyInfo");
        this.f14504e.put(Integer.valueOf(c5172g0.m25370b()), new C5154b0(-1, i, 0));
    }

    /* renamed from: j */
    public final void m24940j(int i, int i2, int i3) {
        if (i > i2) {
            Collection<C5154b0> values = this.f14504e.values();
            Intrinsics.checkIfNull(values, "groupInfos.values");
            for (C5154b0 c5154b0 : values) {
                int m25528b = c5154b0.m25528b();
                if (i <= m25528b && m25528b < i + i3) {
                    c5154b0.m25525e((m25528b - i) + i2);
                } else if (i2 <= m25528b && m25528b < i) {
                    c5154b0.m25525e(m25528b + i3);
                }
            }
        } else if (i2 > i) {
            Collection<C5154b0> values2 = this.f14504e.values();
            Intrinsics.checkIfNull(values2, "groupInfos.values");
            for (C5154b0 c5154b02 : values2) {
                int m25528b2 = c5154b02.m25528b();
                if (i <= m25528b2 && m25528b2 < i + i3) {
                    c5154b02.m25525e((m25528b2 - i) + i2);
                } else if (i + 1 <= m25528b2 && m25528b2 < i2) {
                    c5154b02.m25525e(m25528b2 - i3);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m24939k(int i, int i2) {
        if (i > i2) {
            Collection<C5154b0> values = this.f14504e.values();
            Intrinsics.checkIfNull(values, "groupInfos.values");
            for (C5154b0 c5154b0 : values) {
                int m25527c = c5154b0.m25527c();
                if (m25527c == i) {
                    c5154b0.m25524f(i2);
                } else if (i2 <= m25527c && m25527c < i) {
                    c5154b0.m25524f(m25527c + 1);
                }
            }
        } else if (i2 > i) {
            Collection<C5154b0> values2 = this.f14504e.values();
            Intrinsics.checkIfNull(values2, "groupInfos.values");
            for (C5154b0 c5154b02 : values2) {
                int m25527c2 = c5154b02.m25527c();
                if (m25527c2 == i) {
                    c5154b02.m25524f(i2);
                } else if (i + 1 <= m25527c2 && m25527c2 < i2) {
                    c5154b02.m25524f(m25527c2 - 1);
                }
            }
        }
    }

    /* renamed from: l */
    public final void m24938l(int i) {
        this.f14502c = i;
    }

    /* renamed from: m */
    public final int m24937m(C5172g0 c5172g0) {
        Intrinsics.isThisObjectNull(c5172g0, "keyInfo");
        C5154b0 c5154b0 = (C5154b0) this.f14504e.get(Integer.valueOf(c5172g0.m25370b()));
        if (c5154b0 == null) {
            return -1;
        }
        return c5154b0.m25527c();
    }

    /* renamed from: n */
    public final boolean m24936n(int i, int i2) {
        C5154b0 c5154b0 = (C5154b0) this.f14504e.get(Integer.valueOf(i));
        if (c5154b0 != null) {
            int m25528b = c5154b0.m25528b();
            int m25529a = i2 - c5154b0.m25529a();
            c5154b0.m25526d(i2);
            if (m25529a != 0) {
                Collection<C5154b0> values = this.f14504e.values();
                Intrinsics.checkIfNull(values, "groupInfos.values");
                for (C5154b0 c5154b02 : values) {
                    if (c5154b02.m25528b() >= m25528b && !Intrinsics.equals(c5154b02, c5154b0)) {
                        c5154b02.m25525e(c5154b02.m25528b() + m25529a);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final int m24935o(C5172g0 c5172g0) {
        Intrinsics.isThisObjectNull(c5172g0, "keyInfo");
        C5154b0 c5154b0 = (C5154b0) this.f14504e.get(Integer.valueOf(c5172g0.m25370b()));
        Integer valueOf = c5154b0 == null ? null : Integer.valueOf(c5154b0.m25529a());
        return valueOf == null ? c5172g0.m25369c() : valueOf.intValue();
    }
}
