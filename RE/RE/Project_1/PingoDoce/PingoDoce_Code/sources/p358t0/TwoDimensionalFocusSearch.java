package p358t0;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;
import p358t0.C10325c;
import p373u0.Rect;
import p489zc.C13777q;

/* renamed from: t0.z */
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearch {

    /* compiled from: TwoDimensionalFocusSearch.kt */
    /* renamed from: t0.z$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10358a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26950a;

        static {
            int[] iArr = new int[EnumC10353v.values().length];
            iArr[EnumC10353v.Inactive.ordinal()] = 1;
            iArr[EnumC10353v.Deactivated.ordinal()] = 2;
            iArr[EnumC10353v.ActiveParent.ordinal()] = 3;
            iArr[EnumC10353v.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC10353v.Active.ordinal()] = 5;
            iArr[EnumC10353v.Captured.ordinal()] = 6;
            f26950a = iArr;
        }
    }

    /* renamed from: a */
    private static final boolean m8169a(Rect rect, Rect rect2, Rect rect3, int i) {
        if (m8168b(rect3, i, rect) || !m8168b(rect2, i, rect)) {
            return false;
        }
        if (m8167c(rect3, i, rect)) {
            C10325c.C10326a c10326a = C10325c.f26902b;
            if (!C10325c.m8268l(i, c10326a.m8262c()) && !C10325c.m8268l(i, c10326a.m8258g()) && m8166d(rect2, i, rect) >= m8165e(rect3, i, rect)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static final boolean m8168b(Rect rect, int i, Rect rect2) {
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (!(C10325c.m8268l(i, c10326a.m8262c()) ? true : C10325c.m8268l(i, c10326a.m8258g()))) {
            if (!(C10325c.m8268l(i, c10326a.m8257h()) ? true : C10325c.m8268l(i, c10326a.m8264a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (rect.m7124g() > rect2.m7125f() && rect.m7125f() < rect2.m7124g()) {
                return true;
            }
        } else if (rect.m7128c() > rect2.m7122i() && rect.m7122i() < rect2.m7128c()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static final boolean m8167c(Rect rect, int i, Rect rect2) {
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (C10325c.m8268l(i, c10326a.m8262c())) {
            if (rect2.m7125f() >= rect.m7124g()) {
                return true;
            }
        } else if (C10325c.m8268l(i, c10326a.m8258g())) {
            if (rect2.m7124g() <= rect.m7125f()) {
                return true;
            }
        } else if (C10325c.m8268l(i, c10326a.m8257h())) {
            if (rect2.m7122i() >= rect.m7128c()) {
                return true;
            }
        } else if (!C10325c.m8268l(i, c10326a.m8264a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            if (rect2.m7128c() <= rect.m7122i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static final float m8166d(Rect rect, int i, Rect rect2) {
        float m7122i;
        float m7128c;
        float m7122i2;
        float m7128c2;
        float f;
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (!C10325c.m8268l(i, c10326a.m8262c())) {
            if (C10325c.m8268l(i, c10326a.m8258g())) {
                m7122i = rect.m7125f();
                m7128c = rect2.m7124g();
            } else if (C10325c.m8268l(i, c10326a.m8257h())) {
                m7122i2 = rect2.m7122i();
                m7128c2 = rect.m7128c();
            } else if (!C10325c.m8268l(i, c10326a.m8264a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                m7122i = rect.m7122i();
                m7128c = rect2.m7128c();
            }
            f = m7122i - m7128c;
            return Math.max(0.0f, f);
        }
        m7122i2 = rect2.m7125f();
        m7128c2 = rect.m7124g();
        f = m7122i2 - m7128c2;
        return Math.max(0.0f, f);
    }

    /* renamed from: e */
    private static final float m8165e(Rect rect, int i, Rect rect2) {
        float m7128c;
        float m7128c2;
        float m7122i;
        float m7122i2;
        float f;
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (!C10325c.m8268l(i, c10326a.m8262c())) {
            if (C10325c.m8268l(i, c10326a.m8258g())) {
                m7128c = rect.m7124g();
                m7128c2 = rect2.m7124g();
            } else if (C10325c.m8268l(i, c10326a.m8257h())) {
                m7122i = rect2.m7122i();
                m7122i2 = rect.m7122i();
            } else if (!C10325c.m8268l(i, c10326a.m8264a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                m7128c = rect.m7128c();
                m7128c2 = rect2.m7128c();
            }
            f = m7128c - m7128c2;
            return Math.max(1.0f, f);
        }
        m7122i = rect2.m7125f();
        m7122i2 = rect.m7125f();
        f = m7122i - m7122i2;
        return Math.max(1.0f, f);
    }

    /* renamed from: f */
    private static final Rect m8164f(Rect rect) {
        return new Rect(rect.m7124g(), rect.m7128c(), rect.m7124g(), rect.m7128c());
    }

    /* renamed from: g */
    private static final ModifiedFocusNode m8163g(List list, Rect rect, int i) {
        Rect m7117n;
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (C10325c.m8268l(i, c10326a.m8262c())) {
            m7117n = rect.m7117n(rect.m7120k() + 1, 0.0f);
        } else if (C10325c.m8268l(i, c10326a.m8258g())) {
            m7117n = rect.m7117n(-(rect.m7120k() + 1), 0.0f);
        } else if (C10325c.m8268l(i, c10326a.m8257h())) {
            m7117n = rect.m7117n(0.0f, rect.m7126e() + 1);
        } else if (!C10325c.m8268l(i, c10326a.m8264a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            m7117n = rect.m7117n(0.0f, -(rect.m7126e() + 1));
        }
        ModifiedFocusNode modifiedFocusNode = null;
        int i2 = 0;
        int size = list.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            ModifiedFocusNode modifiedFocusNode2 = (ModifiedFocusNode) list.get(i2);
            Rect m21309Y1 = modifiedFocusNode2.m21309Y1();
            if (m8162h(m21309Y1, m7117n, rect, i)) {
                modifiedFocusNode = modifiedFocusNode2;
                m7117n = m21309Y1;
            }
            i2 = i3;
        }
        return modifiedFocusNode;
    }

    /* renamed from: h */
    private static final boolean m8162h(Rect rect, Rect rect2, Rect rect3, int i) {
        if (m8161i(rect, i, rect3)) {
            if (!m8161i(rect2, i, rect3) || m8169a(rect3, rect, rect2, i)) {
                return true;
            }
            if (!m8169a(rect3, rect2, rect, i) && m8158l(i, rect3, rect) < m8158l(i, rect3, rect2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private static final boolean m8161i(Rect rect, int i, Rect rect2) {
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (C10325c.m8268l(i, c10326a.m8262c())) {
            if ((rect2.m7124g() > rect.m7124g() || rect2.m7125f() >= rect.m7124g()) && rect2.m7125f() > rect.m7125f()) {
                return true;
            }
        } else if (C10325c.m8268l(i, c10326a.m8258g())) {
            if ((rect2.m7125f() < rect.m7125f() || rect2.m7124g() <= rect.m7125f()) && rect2.m7124g() < rect.m7124g()) {
                return true;
            }
        } else if (C10325c.m8268l(i, c10326a.m8257h())) {
            if ((rect2.m7128c() > rect.m7128c() || rect2.m7122i() >= rect.m7128c()) && rect2.m7122i() > rect.m7122i()) {
                return true;
            }
        } else if (!C10325c.m8268l(i, c10326a.m8264a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
        } else {
            if ((rect2.m7122i() < rect.m7122i() || rect2.m7128c() <= rect.m7122i()) && rect2.m7128c() < rect.m7128c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private static final float m8160j(Rect rect, int i, Rect rect2) {
        float m7122i;
        float m7128c;
        float m7122i2;
        float m7128c2;
        float f;
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (!C10325c.m8268l(i, c10326a.m8262c())) {
            if (C10325c.m8268l(i, c10326a.m8258g())) {
                m7122i = rect.m7125f();
                m7128c = rect2.m7124g();
            } else if (C10325c.m8268l(i, c10326a.m8257h())) {
                m7122i2 = rect2.m7122i();
                m7128c2 = rect.m7128c();
            } else if (!C10325c.m8268l(i, c10326a.m8264a())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            } else {
                m7122i = rect.m7122i();
                m7128c = rect2.m7128c();
            }
            f = m7122i - m7128c;
            return Math.max(0.0f, f);
        }
        m7122i2 = rect2.m7125f();
        m7128c2 = rect.m7124g();
        f = m7122i2 - m7128c2;
        return Math.max(0.0f, f);
    }

    /* renamed from: k */
    private static final float m8159k(Rect rect, int i, Rect rect2) {
        float f;
        float m7125f;
        float m7125f2;
        float m7120k;
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (C10325c.m8268l(i, c10326a.m8262c()) ? true : C10325c.m8268l(i, c10326a.m8258g())) {
            f = 2;
            m7125f = rect2.m7122i() + (rect2.m7126e() / f);
            m7125f2 = rect.m7122i();
            m7120k = rect.m7126e();
        } else {
            if (!(C10325c.m8268l(i, c10326a.m8257h()) ? true : C10325c.m8268l(i, c10326a.m8264a()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f = 2;
            m7125f = rect2.m7125f() + (rect2.m7120k() / f);
            m7125f2 = rect.m7125f();
            m7120k = rect.m7120k();
        }
        return m7125f - (m7125f2 + (m7120k / f));
    }

    /* renamed from: l */
    private static final long m8158l(int i, Rect rect, Rect rect2) {
        long abs = Math.abs(m8160j(rect2, i, rect));
        long abs2 = Math.abs(m8159k(rect2, i, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    /* renamed from: m */
    private static final Rect m8157m(Rect rect) {
        return new Rect(rect.m7125f(), rect.m7122i(), rect.m7125f(), rect.m7122i());
    }

    /* renamed from: n */
    public static final ModifiedFocusNode m8156n(ModifiedFocusNode modifiedFocusNode, int i) {
        ModifiedFocusNode m8156n;
        Rect m8164f;
        Intrinsics.isThisObjectNull(modifiedFocusNode, "$this$twoDimensionalFocusSearch");
        switch (C10358a.f26950a[modifiedFocusNode.m21308Z1().ordinal()]) {
            case 1:
                return modifiedFocusNode;
            case 2:
                return null;
            case 3:
            case 4:
                ModifiedFocusNode m21307a2 = modifiedFocusNode.m21307a2();
                if (m21307a2 != null) {
                    if (m21307a2.m21308Z1() != EnumC10353v.ActiveParent || (m8156n = m8156n(m21307a2, i)) == null) {
                        ModifiedFocusNode m8176a = FocusTraversal.m8176a(modifiedFocusNode);
                        Rect m21309Y1 = m8176a != null ? m8176a.m21309Y1() : null;
                        if (m21309Y1 != null) {
                            return m8163g(modifiedFocusNode.m21389U0(true), m21309Y1, i);
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                    return m8156n;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 5:
            case 6:
                List m21389U0 = modifiedFocusNode.m21389U0(true);
                if (m21389U0.size() <= 1) {
                    return (ModifiedFocusNode) C13777q.m254N(m21389U0);
                }
                C10325c.C10326a c10326a = C10325c.f26902b;
                if (C10325c.m8268l(i, c10326a.m8258g()) ? true : C10325c.m8268l(i, c10326a.m8264a())) {
                    m8164f = m8157m(modifiedFocusNode.m21309Y1());
                } else {
                    if (!(C10325c.m8268l(i, c10326a.m8262c()) ? true : C10325c.m8268l(i, c10326a.m8257h()))) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    m8164f = m8164f(modifiedFocusNode.m21309Y1());
                }
                return m8163g(m21389U0, m8164f, i);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
