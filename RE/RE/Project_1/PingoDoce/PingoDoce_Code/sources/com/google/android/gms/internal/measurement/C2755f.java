package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes.dex */
public final class C2755f implements Iterable, InterfaceC2931q, InterfaceC2867m {

    /* renamed from: w */
    final SortedMap f7729w;

    /* renamed from: x */
    final Map f7730x;

    public C2755f() {
        this.f7729w = new TreeMap();
        this.f7730x = new TreeMap();
    }

    /* renamed from: B */
    public final List m32753B() {
        ArrayList arrayList = new ArrayList(m32746u());
        for (int i = 0; i < m32746u(); i++) {
            arrayList.add(m32745v(i));
        }
        return arrayList;
    }

    /* renamed from: C */
    public final void m32752C() {
        this.f7729w.clear();
    }

    /* renamed from: D */
    public final void m32751D(int i, InterfaceC2931q interfaceC2931q) {
        if (i >= 0) {
            if (i >= m32746u()) {
                m32749F(i, interfaceC2931q);
                return;
            }
            for (int intValue = ((Integer) this.f7729w.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f7729w;
                Integer valueOf = Integer.valueOf(intValue);
                InterfaceC2931q interfaceC2931q2 = (InterfaceC2931q) sortedMap.get(valueOf);
                if (interfaceC2931q2 != null) {
                    m32749F(intValue + 1, interfaceC2931q2);
                    this.f7729w.remove(valueOf);
                }
            }
            m32749F(i, interfaceC2931q);
            return;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid value index: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: E */
    public final void m32750E(int i) {
        int intValue = ((Integer) this.f7729w.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.f7729w.remove(Integer.valueOf(i));
        if (i == intValue) {
            SortedMap sortedMap = this.f7729w;
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            this.f7729w.put(valueOf, InterfaceC2931q.f7930f);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.f7729w.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.f7729w;
            Integer valueOf2 = Integer.valueOf(i);
            InterfaceC2931q interfaceC2931q = (InterfaceC2931q) sortedMap2.get(valueOf2);
            if (interfaceC2931q != null) {
                this.f7729w.put(Integer.valueOf(i - 1), interfaceC2931q);
                this.f7729w.remove(valueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* renamed from: F */
    public final void m32749F(int i, InterfaceC2931q interfaceC2931q) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Out of bounds index: ");
            sb2.append(i);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (interfaceC2931q == null) {
            this.f7729w.remove(Integer.valueOf(i));
        } else {
            this.f7729w.put(Integer.valueOf(i), interfaceC2931q);
        }
    }

    /* renamed from: G */
    public final boolean m32748G(int i) {
        if (i >= 0 && i <= ((Integer) this.f7729w.lastKey()).intValue()) {
            return this.f7729w.containsKey(Integer.valueOf(i));
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        C2755f c2755f = new C2755f();
        for (Map.Entry entry : this.f7729w.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2867m) {
                c2755f.f7729w.put((Integer) entry.getKey(), (InterfaceC2931q) entry.getValue());
            } else {
                c2755f.f7729w.put((Integer) entry.getKey(), ((InterfaceC2931q) entry.getValue()).mo31993b());
            }
        }
        return c2755f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        if (this.f7729w.size() == 1) {
            return m32745v(0).mo31992c();
        }
        if (this.f7729w.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2755f) {
            C2755f c2755f = (C2755f) obj;
            if (m32746u() != c2755f.m32746u()) {
                return false;
            }
            if (this.f7729w.isEmpty()) {
                return c2755f.f7729w.isEmpty();
            }
            for (int intValue = ((Integer) this.f7729w.firstKey()).intValue(); intValue <= ((Integer) this.f7729w.lastKey()).intValue(); intValue++) {
                if (!m32745v(intValue).equals(c2755f.m32745v(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: f */
    public final Boolean mo31991f() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: g */
    public final String mo31990g() {
        return m32744x(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return new C2723d(this, this.f7729w.keySet().iterator(), this.f7730x.keySet().iterator());
    }

    public final int hashCode() {
        return this.f7729w.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2739e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: l */
    public final boolean mo32460l(String str) {
        return "length".equals(str) || this.f7730x.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: o */
    public final InterfaceC2931q mo32459o(String str) {
        InterfaceC2931q interfaceC2931q;
        if ("length".equals(str)) {
            return new C2803i(Double.valueOf(m32746u()));
        }
        return (!mo32460l(str) || (interfaceC2931q = (InterfaceC2931q) this.f7730x.get(str)) == null) ? InterfaceC2931q.f7930f : interfaceC2931q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return C2835k.m32517a(this, new C2994u(str), c2952r4, list);
        }
        return C2724d0.m32796a(str, this, c2952r4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: q */
    public final void mo32458q(String str, InterfaceC2931q interfaceC2931q) {
        if (interfaceC2931q == null) {
            this.f7730x.remove(str);
        } else {
            this.f7730x.put(str, interfaceC2931q);
        }
    }

    /* renamed from: t */
    public final int m32747t() {
        return this.f7729w.size();
    }

    public final String toString() {
        return m32744x(",");
    }

    /* renamed from: u */
    public final int m32746u() {
        if (this.f7729w.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f7729w.lastKey()).intValue() + 1;
    }

    /* renamed from: v */
    public final InterfaceC2931q m32745v(int i) {
        InterfaceC2931q interfaceC2931q;
        if (i < m32746u()) {
            return (!m32748G(i) || (interfaceC2931q = (InterfaceC2931q) this.f7729w.get(Integer.valueOf(i))) == null) ? InterfaceC2931q.f7930f : interfaceC2931q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* renamed from: x */
    public final String m32744x(String str) {
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f7729w.isEmpty()) {
            for (int i = 0; i < m32746u(); i++) {
                InterfaceC2931q m32745v = m32745v(i);
                sb2.append(str);
                if (!(m32745v instanceof C3009v) && !(m32745v instanceof C2899o)) {
                    sb2.append(m32745v.mo31990g());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    /* renamed from: y */
    public final Iterator m32743y() {
        return this.f7729w.keySet().iterator();
    }

    public C2755f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m32749F(i, (InterfaceC2931q) list.get(i));
            }
        }
    }
}
