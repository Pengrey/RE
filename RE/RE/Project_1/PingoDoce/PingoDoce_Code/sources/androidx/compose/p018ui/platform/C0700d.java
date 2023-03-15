package androidx.compose.p018ui.platform;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p286p1.C8392u;
import p457y1.EnumC13060b;

/* compiled from: AccessibilityIterators.android.kt */
/* renamed from: androidx.compose.ui.platform.d */
/* loaded from: classes.dex */
public final class C0700d extends AbstractC0686b {

    /* renamed from: e */
    private static C0700d f2221e;

    /* renamed from: c */
    private C8392u f2224c;

    /* renamed from: d */
    public static final C0701a f2220d = new C0701a(null);

    /* renamed from: f */
    private static final EnumC13060b f2222f = EnumC13060b.Rtl;

    /* renamed from: g */
    private static final EnumC13060b f2223g = EnumC13060b.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    /* renamed from: androidx.compose.ui.platform.d$a */
    /* loaded from: classes.dex */
    public static final class C0701a {
        private C0701a() {
        }

        public /* synthetic */ C0701a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0700d m39774a() {
            if (C0700d.m39778g() == null) {
                C0700d.m39777h(new C0700d(null));
            }
            C0700d m39778g = C0700d.m39778g();
            Objects.requireNonNull(m39778g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return m39778g;
        }
    }

    private C0700d() {
    }

    public /* synthetic */ C0700d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: g */
    public static final /* synthetic */ C0700d m39778g() {
        return f2221e;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m39777h(C0700d c0700d) {
        f2221e = c0700d;
    }

    /* renamed from: i */
    private final int m39776i(int i, EnumC13060b enumC13060b) {
        C8392u c8392u = this.f2224c;
        C8392u c8392u2 = null;
        if (c8392u == null) {
            Intrinsics.throwUninitPropException("layoutResult");
            c8392u = null;
        }
        int m15552n = c8392u.m15552n(i);
        C8392u c8392u3 = this.f2224c;
        if (c8392u3 == null) {
            Intrinsics.throwUninitPropException("layoutResult");
            c8392u3 = null;
        }
        if (enumC13060b != c8392u3.m15548r(m15552n)) {
            C8392u c8392u4 = this.f2224c;
            if (c8392u4 == null) {
                Intrinsics.throwUninitPropException("layoutResult");
            } else {
                c8392u2 = c8392u4;
            }
            return c8392u2.m15552n(i);
        }
        C8392u c8392u5 = this.f2224c;
        if (c8392u5 == null) {
            Intrinsics.throwUninitPropException("layoutResult");
            c8392u5 = null;
        }
        return C8392u.m15555k(c8392u5, i, false, 2, null) - 1;
    }

    /* renamed from: a */
    public int[] mo39755a(int i) {
        int i2;
        if (m39827d().length() > 0 && i > 0) {
            if (i > m39827d().length()) {
                C8392u c8392u = this.f2224c;
                if (c8392u == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u = null;
                }
                i2 = c8392u.m15554l(m39827d().length());
            } else {
                C8392u c8392u2 = this.f2224c;
                if (c8392u2 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u2 = null;
                }
                int m15554l = c8392u2.m15554l(i);
                i2 = m39776i(m15554l, f2223g) + 1 == i ? m15554l : m15554l - 1;
            }
            if (i2 < 0) {
                return null;
            }
            return m39828c(m39776i(i2, f2222f), m39776i(i2, f2223g) + 1);
        }
        return null;
    }

    /* renamed from: b */
    public int[] mo39754b(int i) {
        int i2;
        if (m39827d().length() > 0 && i < m39827d().length()) {
            if (i < 0) {
                C8392u c8392u = this.f2224c;
                if (c8392u == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u = null;
                }
                i2 = c8392u.m15554l(0);
            } else {
                C8392u c8392u2 = this.f2224c;
                if (c8392u2 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u2 = null;
                }
                int m15554l = c8392u2.m15554l(i);
                i2 = m39776i(m15554l, f2222f) == i ? m15554l : m15554l + 1;
            }
            C8392u c8392u3 = this.f2224c;
            if (c8392u3 == null) {
                Intrinsics.throwUninitPropException("layoutResult");
                c8392u3 = null;
            }
            if (i2 >= c8392u3.m15557i()) {
                return null;
            }
            return m39828c(m39776i(i2, f2222f), m39776i(i2, f2223g) + 1);
        }
        return null;
    }

    /* renamed from: j */
    public final void m39775j(String str, C8392u c8392u) {
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(c8392u, "layoutResult");
        m39825f(str);
        this.f2224c = c8392u;
    }
}
