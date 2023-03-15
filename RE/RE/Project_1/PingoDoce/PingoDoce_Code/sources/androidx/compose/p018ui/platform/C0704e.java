package androidx.compose.p018ui.platform;

import android.graphics.Rect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p245n1.SemanticsNode;
import p286p1.C8392u;
import p297pd._Ranges;
import p457y1.EnumC13060b;

/* compiled from: AccessibilityIterators.android.kt */
/* renamed from: androidx.compose.ui.platform.e */
/* loaded from: classes.dex */
public final class C0704e extends AbstractC0686b {

    /* renamed from: f */
    private static C0704e f2227f;

    /* renamed from: c */
    private C8392u f2230c;

    /* renamed from: d */
    private SemanticsNode f2231d;

    /* renamed from: e */
    public static final C0705a f2226e = new C0705a(null);

    /* renamed from: g */
    private static final EnumC13060b f2228g = EnumC13060b.Rtl;

    /* renamed from: h */
    private static final EnumC13060b f2229h = EnumC13060b.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    /* renamed from: androidx.compose.ui.platform.e$a */
    /* loaded from: classes.dex */
    public static final class C0705a {
        private C0705a() {
        }

        public /* synthetic */ C0705a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0704e m39767a() {
            if (C0704e.m39771g() == null) {
                C0704e.m39770h(new C0704e(null));
            }
            C0704e m39771g = C0704e.m39771g();
            Objects.requireNonNull(m39771g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return m39771g;
        }
    }

    private C0704e() {
        new Rect();
    }

    public /* synthetic */ C0704e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: g */
    public static final /* synthetic */ C0704e m39771g() {
        return f2227f;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m39770h(C0704e c0704e) {
        f2227f = c0704e;
    }

    /* renamed from: i */
    private final int m39769i(int i, EnumC13060b enumC13060b) {
        C8392u c8392u = this.f2230c;
        C8392u c8392u2 = null;
        if (c8392u == null) {
            Intrinsics.throwUninitPropException("layoutResult");
            c8392u = null;
        }
        int m15552n = c8392u.m15552n(i);
        C8392u c8392u3 = this.f2230c;
        if (c8392u3 == null) {
            Intrinsics.throwUninitPropException("layoutResult");
            c8392u3 = null;
        }
        if (enumC13060b != c8392u3.m15548r(m15552n)) {
            C8392u c8392u4 = this.f2230c;
            if (c8392u4 == null) {
                Intrinsics.throwUninitPropException("layoutResult");
            } else {
                c8392u2 = c8392u4;
            }
            return c8392u2.m15552n(i);
        }
        C8392u c8392u5 = this.f2230c;
        if (c8392u5 == null) {
            Intrinsics.throwUninitPropException("layoutResult");
            c8392u5 = null;
        }
        return C8392u.m15555k(c8392u5, i, false, 2, null) - 1;
    }

    /* renamed from: a */
    public int[] mo39755a(int i) {
        int m19530c;
        int m15000i;
        int i2;
        C8392u c8392u = null;
        if (m39827d().length() > 0 && i > 0) {
            try {
                SemanticsNode semanticsNode = this.f2231d;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitPropException("node");
                    semanticsNode = null;
                }
                m19530c = C7037c.m19530c(semanticsNode.m18007f().m7126e());
                m15000i = _Ranges.m15000i(m39827d().length(), i);
                C8392u c8392u2 = this.f2230c;
                if (c8392u2 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u2 = null;
                }
                int m15554l = c8392u2.m15554l(m15000i);
                C8392u c8392u3 = this.f2230c;
                if (c8392u3 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u3 = null;
                }
                float m15551o = c8392u3.m15551o(m15554l) - m19530c;
                if (m15551o > 0.0f) {
                    C8392u c8392u4 = this.f2230c;
                    if (c8392u4 == null) {
                        Intrinsics.throwUninitPropException("layoutResult");
                    } else {
                        c8392u = c8392u4;
                    }
                    i2 = c8392u.m15553m(m15551o);
                } else {
                    i2 = 0;
                }
                if (m15000i == m39827d().length() && i2 < m15554l) {
                    i2++;
                }
                return m39828c(m39769i(i2, f2228g), m15000i);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public int[] mo39754b(int i) {
        int m19530c;
        int m15005d;
        int m15557i;
        C8392u c8392u = null;
        if (m39827d().length() > 0 && i < m39827d().length()) {
            try {
                SemanticsNode semanticsNode = this.f2231d;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitPropException("node");
                    semanticsNode = null;
                }
                m19530c = C7037c.m19530c(semanticsNode.m18007f().m7126e());
                m15005d = _Ranges.m15005d(0, i);
                C8392u c8392u2 = this.f2230c;
                if (c8392u2 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u2 = null;
                }
                int m15554l = c8392u2.m15554l(m15005d);
                C8392u c8392u3 = this.f2230c;
                if (c8392u3 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u3 = null;
                }
                float m15551o = c8392u3.m15551o(m15554l) + m19530c;
                C8392u c8392u4 = this.f2230c;
                if (c8392u4 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u4 = null;
                }
                C8392u c8392u5 = this.f2230c;
                if (c8392u5 == null) {
                    Intrinsics.throwUninitPropException("layoutResult");
                    c8392u5 = null;
                }
                if (m15551o < c8392u4.m15551o(c8392u5.m15557i() - 1)) {
                    C8392u c8392u6 = this.f2230c;
                    if (c8392u6 == null) {
                        Intrinsics.throwUninitPropException("layoutResult");
                    } else {
                        c8392u = c8392u6;
                    }
                    m15557i = c8392u.m15553m(m15551o);
                } else {
                    C8392u c8392u7 = this.f2230c;
                    if (c8392u7 == null) {
                        Intrinsics.throwUninitPropException("layoutResult");
                    } else {
                        c8392u = c8392u7;
                    }
                    m15557i = c8392u.m15557i();
                }
                return m39828c(m15005d, m39769i(m15557i - 1, f2229h) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: j */
    public final void m39768j(String str, C8392u c8392u, SemanticsNode semanticsNode) {
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(c8392u, "layoutResult");
        Intrinsics.isThisObjectNull(semanticsNode, "node");
        m39825f(str);
        this.f2230c = c8392u;
        this.f2231d = semanticsNode;
    }
}
