package p455y;

import androidx.compose.foundation.lazy.InterfaceC0633d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.Placeable;
import p181jd.Intrinsics;
import p345s.InterfaceC9936a0;
import p479z1.C13612k;
import p479z1.C13614l;

/* renamed from: y.r */
/* loaded from: classes.dex */
public final class LazyMeasuredItem implements InterfaceC0633d {

    /* renamed from: a */
    private final int f33875a;

    /* renamed from: b */
    private final int f33876b;

    /* renamed from: c */
    private final Object f33877c;

    /* renamed from: d */
    private final int f33878d;

    /* renamed from: e */
    private final int f33879e;

    /* renamed from: f */
    private final int f33880f;

    /* renamed from: g */
    private final int f33881g;

    /* renamed from: h */
    private final boolean f33882h;

    /* renamed from: i */
    private final List f33883i;

    /* renamed from: j */
    private final LazyListItemPlacementAnimator f33884j;

    /* renamed from: k */
    private final long f33885k;

    /* renamed from: l */
    private final boolean f33886l;

    private LazyMeasuredItem(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j) {
        this.f33875a = i;
        this.f33876b = i2;
        this.f33877c = obj;
        this.f33878d = i3;
        this.f33879e = i4;
        this.f33880f = i5;
        this.f33881g = i6;
        this.f33882h = z;
        this.f33883i = list;
        this.f33884j = lazyListItemPlacementAnimator;
        this.f33885k = j;
        int m1827i = m1827i();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= m1827i) {
                break;
            }
            int i8 = i7 + 1;
            if (m1835a(i7) != null) {
                z2 = true;
                break;
            }
            i7 = i8;
        }
        this.f33886l = z2;
    }

    public /* synthetic */ LazyMeasuredItem(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, obj, i3, i4, i5, i6, z, list, lazyListItemPlacementAnimator, j);
    }

    /* renamed from: d */
    private final int m1832d(long j) {
        return this.f33882h ? C13612k.m838i(j) : C13612k.m839h(j);
    }

    /* renamed from: f */
    private final int m1830f(Placeable placeable) {
        return this.f33882h ? placeable.m23182l0() : placeable.m23177q0();
    }

    /* renamed from: a */
    public final InterfaceC9936a0 m1835a(int i) {
        Object m1837b = ((C13038q) this.f33883i.get(i)).m1837b();
        if (m1837b instanceof InterfaceC9936a0) {
            return (InterfaceC9936a0) m1837b;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m1834b() {
        return this.f33886l;
    }

    /* renamed from: c */
    public Object m1833c() {
        return this.f33877c;
    }

    /* renamed from: e */
    public final int m1831e(int i) {
        return m1830f(((C13038q) this.f33883i.get(i)).m1836c());
    }

    /* renamed from: g */
    public int m1829g() {
        return this.f33875a;
    }

    public int getIndex() {
        return this.f33876b;
    }

    /* renamed from: h */
    public final long m1828h(int i) {
        return ((C13038q) this.f33883i.get(i)).m1838a();
    }

    /* renamed from: i */
    public final int m1827i() {
        return this.f33883i.size();
    }

    /* renamed from: j */
    public int m1826j() {
        return this.f33878d;
    }

    /* renamed from: k */
    public final int m1825k() {
        return this.f33879e;
    }

    /* renamed from: l */
    public final void m1824l(Placeable.AbstractC5751a abstractC5751a) {
        long m1828h;
        Intrinsics.isThisObjectNull(abstractC5751a, "scope");
        int m1827i = m1827i();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= m1827i) {
                return;
            }
            i = i2 + 1;
            Placeable m1836c = ((C13038q) this.f33883i.get(i2)).m1836c();
            int m1830f = this.f33880f - m1830f(m1836c);
            int i3 = this.f33881g;
            if (m1835a(i2) != null) {
                m1828h = this.f33884j.m1896b(m1833c(), i2, m1830f, i3, m1828h(i2));
            } else {
                m1828h = m1828h(i2);
            }
            if (m1832d(m1828h) > m1830f && m1832d(m1828h) < i3) {
                if (this.f33882h) {
                    long j = this.f33885k;
                    Placeable.AbstractC5751a.m23149x(abstractC5751a, m1836c, C13614l.m833a(C13612k.m839h(m1828h) + C13612k.m839h(j), C13612k.m838i(m1828h) + C13612k.m838i(j)), 0.0f, null, 6, null);
                } else {
                    long j2 = this.f33885k;
                    Placeable.AbstractC5751a.m23153t(abstractC5751a, m1836c, C13614l.m833a(C13612k.m839h(m1828h) + C13612k.m839h(j2), C13612k.m838i(m1828h) + C13612k.m838i(j2)), 0.0f, null, 6, null);
                }
            }
        }
    }
}
