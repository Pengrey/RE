package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* loaded from: classes.dex */
public final class C2952r4 {

    /* renamed from: a */
    public final C2952r4 f7964a;

    /* renamed from: b */
    final C3054y f7965b;

    /* renamed from: c */
    final Map f7966c = new HashMap();

    /* renamed from: d */
    final Map f7967d = new HashMap();

    public C2952r4(C2952r4 c2952r4, C3054y c3054y) {
        this.f7964a = c2952r4;
        this.f7965b = c3054y;
    }

    /* renamed from: a */
    public final C2952r4 m32163a() {
        return new C2952r4(this, this.f7965b);
    }

    /* renamed from: b */
    public final InterfaceC2931q m32162b(InterfaceC2931q interfaceC2931q) {
        return this.f7965b.m31817a(this, interfaceC2931q);
    }

    /* renamed from: c */
    public final InterfaceC2931q m32161c(C2755f c2755f) {
        InterfaceC2931q interfaceC2931q = InterfaceC2931q.f7930f;
        Iterator m32743y = c2755f.m32743y();
        while (m32743y.hasNext()) {
            interfaceC2931q = this.f7965b.m31817a(this, c2755f.m32745v(((Integer) m32743y.next()).intValue()));
            if (interfaceC2931q instanceof C2787h) {
                break;
            }
        }
        return interfaceC2931q;
    }

    /* renamed from: d */
    public final InterfaceC2931q m32160d(String str) {
        if (this.f7966c.containsKey(str)) {
            return (InterfaceC2931q) this.f7966c.get(str);
        }
        C2952r4 c2952r4 = this.f7964a;
        if (c2952r4 != null) {
            return c2952r4.m32160d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* renamed from: e */
    public final void m32159e(String str, InterfaceC2931q interfaceC2931q) {
        if (this.f7967d.containsKey(str)) {
            return;
        }
        if (interfaceC2931q == null) {
            this.f7966c.remove(str);
        } else {
            this.f7966c.put(str, interfaceC2931q);
        }
    }

    /* renamed from: f */
    public final void m32158f(String str, InterfaceC2931q interfaceC2931q) {
        m32159e(str, interfaceC2931q);
        this.f7967d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void m32157g(String str, InterfaceC2931q interfaceC2931q) {
        C2952r4 c2952r4;
        if (!this.f7966c.containsKey(str) && (c2952r4 = this.f7964a) != null && c2952r4.m32156h(str)) {
            this.f7964a.m32157g(str, interfaceC2931q);
        } else if (this.f7967d.containsKey(str)) {
        } else {
            if (interfaceC2931q == null) {
                this.f7966c.remove(str);
            } else {
                this.f7966c.put(str, interfaceC2931q);
            }
        }
    }

    /* renamed from: h */
    public final boolean m32156h(String str) {
        if (this.f7966c.containsKey(str)) {
            return true;
        }
        C2952r4 c2952r4 = this.f7964a;
        if (c2952r4 != null) {
            return c2952r4.m32156h(str);
        }
        return false;
    }
}
