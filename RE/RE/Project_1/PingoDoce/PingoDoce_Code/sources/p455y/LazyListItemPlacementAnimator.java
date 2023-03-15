package p455y;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.Intrinsics;
import p345s.Animatable;
import p345s.C9964m;
import p345s.C9965m0;
import p345s.InterfaceC9936a0;
import p345s.InterfaceC9950h;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13612k;
import p479z1.C13614l;
import p489zc.C13769l0;
import p489zc.C13777q;
import td.InterfaceC10524i0;

/* renamed from: y.i */
/* loaded from: classes.dex */
public final class LazyListItemPlacementAnimator {

    /* renamed from: a */
    private final InterfaceC10524i0 f33787a;

    /* renamed from: b */
    private final boolean f33788b;

    /* renamed from: c */
    private final Map f33789c;

    /* renamed from: d */
    private Map f33790d;

    /* renamed from: e */
    private int f33791e;

    /* renamed from: f */
    private int f33792f;

    /* renamed from: g */
    private int f33793g;

    /* renamed from: h */
    private int f33794h;

    /* renamed from: i */
    private final Set f33795i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListItemPlacementAnimator.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator$getAnimatedOffset$1", m20196f = "LazyListItemPlacementAnimator.kt", m20195l = {264}, m20194m = "invokeSuspend")
    /* renamed from: y.i$a */
    /* loaded from: classes.dex */
    public static final class C13020a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f33796x;

        /* renamed from: y */
        final /* synthetic */ C13056z f33797y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13020a(C13056z c13056z, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f33797y = c13056z;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13020a(this.f33797y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13020a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f33796x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Animatable<C13612k, C9964m> m1780a = this.f33797y.m1780a();
                C13612k m845b = C13612k.m845b(this.f33797y.m1777d());
                this.f33796x = 1;
                if (m1780a.m9637v(m845b, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            this.f33797y.m1776e(false);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListItemPlacementAnimator.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", m20196f = "LazyListItemPlacementAnimator.kt", m20195l = {357}, m20194m = "invokeSuspend")
    /* renamed from: y.i$b */
    /* loaded from: classes.dex */
    public static final class C13021b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f33798x;

        /* renamed from: y */
        final /* synthetic */ C13056z f33799y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC9936a0 f33800z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13021b(C13056z c13056z, InterfaceC9936a0 interfaceC9936a0, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f33799y = c13056z;
            this.f33800z = interfaceC9936a0;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13021b(this.f33799y, this.f33800z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13021b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC9950h interfaceC9950h;
            m34636d = C2116d.m34636d();
            int i = this.f33798x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    if (this.f33799y.m1780a().m9641r()) {
                        InterfaceC9936a0 interfaceC9936a0 = this.f33800z;
                        interfaceC9950h = interfaceC9936a0 instanceof C9965m0 ? (C9965m0) interfaceC9936a0 : C13022j.m1886a();
                    } else {
                        interfaceC9950h = this.f33800z;
                    }
                    InterfaceC9950h interfaceC9950h2 = interfaceC9950h;
                    Animatable<C13612k, C9964m> m1780a = this.f33799y.m1780a();
                    C13612k m845b = C13612k.m845b(this.f33799y.m1777d());
                    this.f33798x = 1;
                    if (Animatable.m9653f(m1780a, m845b, interfaceC9950h2, null, null, this, 12, null) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f33799y.m1776e(false);
            } catch (CancellationException unused) {
            }
            return C13195u.f34156a;
        }
    }

    public LazyListItemPlacementAnimator(InterfaceC10524i0 interfaceC10524i0, boolean z) {
        Map m334e;
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        this.f33787a = interfaceC10524i0;
        this.f33788b = z;
        this.f33789c = new LinkedHashMap();
        m334e = C13769l0.m334e();
        this.f33790d = m334e;
        this.f33791e = -1;
        this.f33793g = -1;
        this.f33795i = new LinkedHashSet();
    }

    /* renamed from: a */
    private final int m1897a(int i, int i2, int i3, long j, boolean z, int i4, int i5) {
        boolean z2 = false;
        int i6 = this.f33793g;
        boolean z3 = z ? i6 > i : i6 < i;
        int i7 = this.f33791e;
        if (z ? i7 < i : i7 > i) {
            z2 = true;
        }
        if (z3) {
            return i4 + this.f33794h + (i3 * (((i - this.f33793g) * (z ? -1 : 1)) - 1)) + m1895c(j);
        } else if (z2) {
            return ((this.f33792f - i2) - (i3 * (((this.f33791e - i) * (z ? -1 : 1)) - 1))) + m1895c(j);
        } else {
            return i5;
        }
    }

    /* renamed from: c */
    private final int m1895c(long j) {
        return this.f33788b ? C13612k.m838i(j) : C13612k.m839h(j);
    }

    /* renamed from: f */
    private final void m1892f(LazyMeasuredItem lazyMeasuredItem, C13018e c13018e) {
        while (c13018e.m1905b().size() > lazyMeasuredItem.m1827i()) {
            C13777q.m265A(c13018e.m1905b());
        }
        while (c13018e.m1905b().size() < lazyMeasuredItem.m1827i()) {
            int size = c13018e.m1905b().size();
            long m1828h = lazyMeasuredItem.m1828h(size);
            List<C13056z> m1905b = c13018e.m1905b();
            long m1906a = c13018e.m1906a();
            m1905b.add(new C13056z(C13614l.m833a(C13612k.m839h(m1828h) - C13612k.m839h(m1906a), C13612k.m838i(m1828h) - C13612k.m838i(m1906a)), lazyMeasuredItem.m1831e(size), null));
        }
        List<C13056z> m1905b2 = c13018e.m1905b();
        int i = 0;
        int size2 = m1905b2.size();
        while (i < size2) {
            int i2 = i + 1;
            C13056z c13056z = m1905b2.get(i);
            long m1777d = c13056z.m1777d();
            long m1906a2 = c13018e.m1906a();
            long m833a = C13614l.m833a(C13612k.m839h(m1777d) + C13612k.m839h(m1906a2), C13612k.m838i(m1777d) + C13612k.m838i(m1906a2));
            long m1828h2 = lazyMeasuredItem.m1828h(i);
            c13056z.m1775f(lazyMeasuredItem.m1831e(i));
            InterfaceC9936a0 m1835a = lazyMeasuredItem.m1835a(i);
            if (!C13612k.m840g(m833a, m1828h2)) {
                long m1906a3 = c13018e.m1906a();
                c13056z.m1774g(C13614l.m833a(C13612k.m839h(m1828h2) - C13612k.m839h(m1906a3), C13612k.m838i(m1828h2) - C13612k.m838i(m1906a3)));
                if (m1835a != null) {
                    c13056z.m1776e(true);
                    C6772d.m20158d(this.f33787a, null, null, new C13021b(c13056z, m1835a, null), 3, null);
                }
            }
            i = i2;
        }
    }

    /* renamed from: g */
    private final long m1891g(int i) {
        boolean z = this.f33788b;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return C13614l.m833a(i2, i);
    }

    /* renamed from: b */
    public final long m1896b(Object obj, int i, int i2, int i3, long j) {
        Intrinsics.isThisObjectNull(obj, "key");
        C13018e c13018e = (C13018e) this.f33789c.get(obj);
        if (c13018e == null) {
            return j;
        }
        C13056z c13056z = c13018e.m1905b().get(i);
        long m835l = ((C13612k) c13056z.m1780a().m9644o()).m835l();
        long m1906a = c13018e.m1906a();
        long m833a = C13614l.m833a(C13612k.m839h(m835l) + C13612k.m839h(m1906a), C13612k.m838i(m835l) + C13612k.m838i(m1906a));
        long m1777d = c13056z.m1777d();
        long m1906a2 = c13018e.m1906a();
        long m833a2 = C13614l.m833a(C13612k.m839h(m1777d) + C13612k.m839h(m1906a2), C13612k.m838i(m1777d) + C13612k.m838i(m1906a2));
        if (c13056z.m1779b() && ((m1895c(m833a2) < i2 && m1895c(m833a) < i2) || (m1895c(m833a2) > i3 && m1895c(m833a) > i3))) {
            C6772d.m20158d(this.f33787a, null, null, new C13020a(c13056z, null), 3, null);
        }
        return m833a;
    }

    /* renamed from: d */
    public final void m1894d(int i, int i2, int i3, boolean z, List list, C13044v c13044v) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int m1895c;
        long j;
        C13018e c13018e;
        LazyMeasuredItem lazyMeasuredItem;
        int m1897a;
        long m842e;
        Intrinsics.isThisObjectNull(list, "positionedItems");
        Intrinsics.isThisObjectNull(c13044v, "itemProvider");
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                z2 = false;
                break;
            }
            int i7 = i6 + 1;
            if (((LazyMeasuredItem) list.get(i6)).m1834b()) {
                z2 = true;
                break;
            }
            i6 = i7;
        }
        if (!z2) {
            m1893e();
            return;
        }
        int i8 = this.f33788b ? i3 : i2;
        int i9 = i;
        if (z) {
            i9 = -i9;
        }
        long m1891g = m1891g(i9);
        LazyMeasuredItem lazyMeasuredItem2 = (LazyMeasuredItem) C13777q.m256L(list);
        LazyMeasuredItem lazyMeasuredItem3 = (LazyMeasuredItem) C13777q.m249W(list);
        int size2 = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int i12 = i10 + 1;
            LazyMeasuredItem lazyMeasuredItem4 = (LazyMeasuredItem) list.get(i10);
            C13018e c13018e2 = (C13018e) this.f33789c.get(lazyMeasuredItem4.m1833c());
            if (c13018e2 != null) {
                c13018e2.m1904c(lazyMeasuredItem4.getIndex());
            }
            i11 += lazyMeasuredItem4.m1825k();
            i10 = i12;
        }
        int size3 = i11 / list.size();
        this.f33795i.clear();
        int size4 = list.size();
        int i13 = 0;
        while (i13 < size4) {
            int i14 = i13 + 1;
            LazyMeasuredItem lazyMeasuredItem5 = (LazyMeasuredItem) list.get(i13);
            this.f33795i.add(lazyMeasuredItem5.m1833c());
            C13018e c13018e3 = (C13018e) this.f33789c.get(lazyMeasuredItem5.m1833c());
            if (c13018e3 == null) {
                if (lazyMeasuredItem5.m1834b()) {
                    C13018e c13018e4 = new C13018e(lazyMeasuredItem5.getIndex());
                    Integer num = (Integer) this.f33790d.get(lazyMeasuredItem5.m1833c());
                    long m1828h = lazyMeasuredItem5.m1828h(i5);
                    int m1831e = lazyMeasuredItem5.m1831e(i5);
                    if (num == null) {
                        m1897a = m1895c(m1828h);
                        j = m1828h;
                        c13018e = c13018e4;
                        lazyMeasuredItem = lazyMeasuredItem5;
                        i4 = size4;
                    } else {
                        if (!z) {
                            m1895c = m1895c(m1828h);
                        } else {
                            m1895c = (m1895c(m1828h) - lazyMeasuredItem5.m1825k()) + m1831e;
                        }
                        j = m1828h;
                        c13018e = c13018e4;
                        lazyMeasuredItem = lazyMeasuredItem5;
                        i4 = size4;
                        m1897a = m1897a(num.intValue(), lazyMeasuredItem5.m1825k(), size3, m1891g, z, i8, m1895c) + (z ? lazyMeasuredItem.m1826j() - m1831e : i5);
                    }
                    if (this.f33788b) {
                        m842e = C13612k.m842e(j, 0, m1897a, 1, null);
                    } else {
                        m842e = C13612k.m842e(j, m1897a, 0, 2, null);
                    }
                    int m1827i = lazyMeasuredItem.m1827i();
                    int i15 = i5;
                    while (i15 < m1827i) {
                        int i16 = i15 + 1;
                        LazyMeasuredItem lazyMeasuredItem6 = lazyMeasuredItem;
                        long m1828h2 = lazyMeasuredItem6.m1828h(i15);
                        long m833a = C13614l.m833a(C13612k.m839h(m1828h2) - C13612k.m839h(j), C13612k.m838i(m1828h2) - C13612k.m838i(j));
                        c13018e.m1905b().add(new C13056z(C13614l.m833a(C13612k.m839h(m842e) + C13612k.m839h(m833a), C13612k.m838i(m842e) + C13612k.m838i(m833a)), lazyMeasuredItem6.m1831e(i15), null));
                        C13195u c13195u = C13195u.f34156a;
                        i15 = i16;
                    }
                    LazyMeasuredItem lazyMeasuredItem7 = lazyMeasuredItem;
                    C13018e c13018e5 = c13018e;
                    this.f33789c.put(lazyMeasuredItem7.m1833c(), c13018e5);
                    m1892f(lazyMeasuredItem7, c13018e5);
                } else {
                    i4 = size4;
                }
            } else {
                i4 = size4;
                if (lazyMeasuredItem5.m1834b()) {
                    long m1906a = c13018e3.m1906a();
                    c13018e3.m1903d(C13614l.m833a(C13612k.m839h(m1906a) + C13612k.m839h(m1891g), C13612k.m838i(m1906a) + C13612k.m838i(m1891g)));
                    m1892f(lazyMeasuredItem5, c13018e3);
                } else {
                    this.f33789c.remove(lazyMeasuredItem5.m1833c());
                }
            }
            i13 = i14;
            size4 = i4;
            i5 = 0;
        }
        if (!z) {
            this.f33791e = lazyMeasuredItem2.getIndex();
            this.f33792f = lazyMeasuredItem2.m1829g();
            this.f33793g = lazyMeasuredItem3.getIndex();
            this.f33794h = (lazyMeasuredItem3.m1829g() + lazyMeasuredItem3.m1825k()) - i8;
        } else {
            this.f33791e = lazyMeasuredItem3.getIndex();
            this.f33792f = (i8 - lazyMeasuredItem3.m1829g()) - lazyMeasuredItem3.m1826j();
            this.f33793g = lazyMeasuredItem2.getIndex();
            this.f33794h = (-lazyMeasuredItem2.m1829g()) + (lazyMeasuredItem2.m1825k() - lazyMeasuredItem2.m1826j());
        }
        Iterator it = this.f33789c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!this.f33795i.contains(entry.getKey())) {
                C13018e c13018e6 = (C13018e) entry.getValue();
                long m1906a2 = c13018e6.m1906a();
                c13018e6.m1903d(C13614l.m833a(C13612k.m839h(m1906a2) + C13612k.m839h(m1891g), C13612k.m838i(m1906a2) + C13612k.m838i(m1891g)));
                Integer num2 = c13044v.m1798c().get(entry.getKey());
                List<C13056z> m1905b = c13018e6.m1905b();
                int size5 = m1905b.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        z3 = false;
                        break;
                    }
                    int i18 = i17 + 1;
                    C13056z c13056z = m1905b.get(i17);
                    long m1777d = c13056z.m1777d();
                    long m1906a3 = c13018e6.m1906a();
                    List<C13056z> list2 = m1905b;
                    long m833a2 = C13614l.m833a(C13612k.m839h(m1777d) + C13612k.m839h(m1906a3), C13612k.m838i(m1777d) + C13612k.m838i(m1906a3));
                    if (m1895c(m833a2) + c13056z.m1778c() > 0 && m1895c(m833a2) < i8) {
                        z3 = true;
                        break;
                    } else {
                        m1905b = list2;
                        i17 = i18;
                    }
                }
                List<C13056z> m1905b2 = c13018e6.m1905b();
                int size6 = m1905b2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size6) {
                        z4 = false;
                        break;
                    }
                    int i20 = i19 + 1;
                    if (m1905b2.get(i19).m1779b()) {
                        z4 = true;
                        break;
                    }
                    i19 = i20;
                }
                boolean z5 = !z4;
                if ((z3 || !z5) && num2 != null && !c13018e6.m1905b().isEmpty()) {
                    C13043u m1800a = c13044v.m1800a(C13015a.m1914a(num2.intValue()));
                    int m1897a2 = m1897a(num2.intValue(), m1800a.m1802e(), size3, m1891g, z, i8, i8);
                    if (z) {
                        m1897a2 = (i8 - m1897a2) - m1800a.m1803d();
                    }
                    LazyMeasuredItem m1801f = m1800a.m1801f(m1897a2, i2, i3);
                    list.add(m1801f);
                    m1892f(m1801f, c13018e6);
                } else {
                    it.remove();
                }
            }
        }
        this.f33790d = c13044v.m1798c();
    }

    /* renamed from: e */
    public final void m1893e() {
        Map m334e;
        this.f33789c.clear();
        m334e = C13769l0.m334e();
        this.f33790d = m334e;
        this.f33791e = -1;
        this.f33792f = 0;
        this.f33793g = -1;
        this.f33794h = 0;
    }
}
