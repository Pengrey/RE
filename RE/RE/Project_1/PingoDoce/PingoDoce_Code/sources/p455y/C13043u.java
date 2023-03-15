package p455y;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.Placeable;
import p302q0.InterfaceC9560a;
import p432x.LazyLayoutPlaceable;
import p479z1.C13614l;
import p479z1.EnumC13618o;
import p489zc._Arrays;

/* renamed from: y.u */
/* loaded from: classes.dex */
public final class C13043u {

    /* renamed from: a */
    private final int f33901a;

    /* renamed from: b */
    private final LazyLayoutPlaceable[] f33902b;

    /* renamed from: c */
    private final boolean f33903c;

    /* renamed from: d */
    private final InterfaceC9560a.InterfaceC9562b f33904d;

    /* renamed from: e */
    private final InterfaceC9560a.InterfaceC9563c f33905e;

    /* renamed from: f */
    private final EnumC13618o f33906f;

    /* renamed from: g */
    private final boolean f33907g;

    /* renamed from: h */
    private final int f33908h;

    /* renamed from: i */
    private final int f33909i;

    /* renamed from: j */
    private final LazyListItemPlacementAnimator f33910j;

    /* renamed from: k */
    private final int f33911k;

    /* renamed from: l */
    private final long f33912l;

    /* renamed from: m */
    private final Object f33913m;

    /* renamed from: n */
    private final int f33914n;

    /* renamed from: o */
    private final int f33915o;

    /* renamed from: p */
    private final int f33916p;

    private C13043u(int i, LazyLayoutPlaceable[] lazyLayoutPlaceableArr, boolean z, InterfaceC9560a.InterfaceC9562b interfaceC9562b, InterfaceC9560a.InterfaceC9563c interfaceC9563c, EnumC13618o enumC13618o, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj) {
        this.f33901a = i;
        this.f33902b = lazyLayoutPlaceableArr;
        this.f33903c = z;
        this.f33904d = interfaceC9562b;
        this.f33905e = interfaceC9563c;
        this.f33906f = enumC13618o;
        this.f33907g = z2;
        this.f33908h = i2;
        this.f33909i = i3;
        this.f33910j = lazyListItemPlacementAnimator;
        this.f33911k = i4;
        this.f33912l = j;
        this.f33913m = obj;
        int length = lazyLayoutPlaceableArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            LazyLayoutPlaceable lazyLayoutPlaceable = lazyLayoutPlaceableArr[i5];
            i5++;
            Placeable m3365b = lazyLayoutPlaceable.m3365b();
            i6 += this.f33903c ? m3365b.m23182l0() : m3365b.m23177q0();
            i7 = Math.max(i7, !this.f33903c ? m3365b.m23182l0() : m3365b.m23177q0());
        }
        this.f33914n = i6;
        this.f33915o = i6 + this.f33911k;
        this.f33916p = i7;
    }

    public /* synthetic */ C13043u(int i, LazyLayoutPlaceable[] lazyLayoutPlaceableArr, boolean z, InterfaceC9560a.InterfaceC9562b interfaceC9562b, InterfaceC9560a.InterfaceC9563c interfaceC9563c, EnumC13618o enumC13618o, boolean z2, int i2, int i3, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, int i4, long j, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, lazyLayoutPlaceableArr, z, interfaceC9562b, interfaceC9563c, enumC13618o, z2, i2, i3, lazyListItemPlacementAnimator, i4, j, obj);
    }

    /* renamed from: a */
    public final int m1806a() {
        return this.f33916p;
    }

    /* renamed from: b */
    public final int m1805b() {
        return this.f33901a;
    }

    /* renamed from: c */
    public final Object m1804c() {
        return this.f33913m;
    }

    /* renamed from: d */
    public final int m1803d() {
        return this.f33914n;
    }

    /* renamed from: e */
    public final int m1802e() {
        return this.f33915o;
    }

    /* renamed from: f */
    public final LazyMeasuredItem m1801f(int i, int i2, int i3) {
        long m833a;
        ArrayList arrayList = new ArrayList();
        int i4 = this.f33903c ? i3 : i2;
        boolean z = this.f33907g;
        int i5 = z ? (i4 - i) - this.f33914n : i;
        int m289E = z ? _Arrays.m289E(this.f33902b) : 0;
        while (true) {
            boolean z2 = this.f33907g;
            boolean z3 = true;
            if (!z2 ? m289E >= this.f33902b.length : m289E < 0) {
                z3 = false;
            }
            if (z3) {
                Placeable m3365b = this.f33902b[m289E].m3365b();
                int size = this.f33907g ? 0 : arrayList.size();
                if (this.f33903c) {
                    InterfaceC9560a.InterfaceC9562b interfaceC9562b = this.f33904d;
                    if (interfaceC9562b != null) {
                        m833a = C13614l.m833a(interfaceC9562b.mo10588a(m3365b.m23177q0(), i2, this.f33906f), i5);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    InterfaceC9560a.InterfaceC9563c interfaceC9563c = this.f33905e;
                    if (interfaceC9563c != null) {
                        m833a = C13614l.m833a(i5, interfaceC9563c.mo10587a(m3365b.m23182l0(), i3));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                long j = m833a;
                i5 += this.f33903c ? m3365b.m23182l0() : m3365b.m23177q0();
                arrayList.add(size, new C13038q(j, m3365b, this.f33902b[m289E].m3366a(), null));
                m289E = this.f33907g ? m289E - 1 : m289E + 1;
            } else {
                return new LazyMeasuredItem(i, this.f33901a, this.f33913m, this.f33914n, this.f33915o, -(!z2 ? this.f33908h : this.f33909i), i4 + (!z2 ? this.f33909i : this.f33908h), this.f33903c, arrayList, this.f33910j, this.f33912l, null);
            }
        }
    }
}
