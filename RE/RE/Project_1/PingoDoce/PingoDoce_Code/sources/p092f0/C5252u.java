package p092f0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p126h0.C5732a;
import p126h0.InterfaceC5737e;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.AbstractC7953c0;
import p260o0.AbstractC7961h;
import p260o0.C7971l;
import p260o0.InterfaceC7950b0;
import p468yc.C13182l;
import p468yc.C13195u;
import p489zc.C13778q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
/* renamed from: f0.u */
/* loaded from: classes.dex */
public final class C5252u<T> implements InterfaceC7950b0, InterfaceC5257v {

    /* renamed from: w */
    private final InterfaceC6097a f14518w;

    /* renamed from: x */
    private C5253a f14519x;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DerivedState.kt */
    /* renamed from: f0.u$a */
    /* loaded from: classes.dex */
    public static final class C5253a<T> extends AbstractC7953c0 {

        /* renamed from: c */
        private HashSet f14520c;

        /* renamed from: d */
        private Object f14521d;

        /* renamed from: e */
        private int f14522e;

        /* renamed from: a */
        public void mo17447a(AbstractC7953c0 abstractC7953c0) {
            Intrinsics.isThisObjectNull(abstractC7953c0, "value");
            C5253a c5253a = (C5253a) abstractC7953c0;
            this.f14520c = c5253a.f14520c;
            this.f14521d = c5253a.f14521d;
            this.f14522e = c5253a.f14522e;
        }

        /* renamed from: b */
        public AbstractC7953c0 mo17446b() {
            return new C5253a();
        }

        /* renamed from: g */
        public final HashSet m24903g() {
            return this.f14520c;
        }

        /* renamed from: h */
        public final Object m24902h() {
            return this.f14521d;
        }

        /* renamed from: i */
        public final boolean m24901i(InterfaceC5257v interfaceC5257v, AbstractC7961h abstractC7961h) {
            Intrinsics.isThisObjectNull(interfaceC5257v, "derivedState");
            Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
            return this.f14521d != null && this.f14522e == m24900j(interfaceC5257v, abstractC7961h);
        }

        /* renamed from: j */
        public final int m24900j(InterfaceC5257v interfaceC5257v, AbstractC7961h abstractC7961h) {
            HashSet m24903g;
            Intrinsics.isThisObjectNull(interfaceC5257v, "derivedState");
            Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
            synchronized (C7971l.m17297z()) {
                m24903g = m24903g();
            }
            int i = 7;
            if (m24903g != null) {
                InterfaceC5737e interfaceC5737e = (InterfaceC5737e) DerivedState.m25013a().m24956a();
                if (interfaceC5737e == null) {
                    interfaceC5737e = C5732a.m23210b();
                }
                int size = interfaceC5737e.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC6108l) ((C13182l) interfaceC5737e.get(i3)).m1462a()).mo9587d(interfaceC5257v);
                }
                try {
                    Iterator it = m24903g.iterator();
                    while (it.hasNext()) {
                        InterfaceC7950b0 interfaceC7950b0 = (InterfaceC7950b0) it.next();
                        AbstractC7953c0 m17475b = interfaceC7950b0.m17475b();
                        Intrinsics.checkIfNull(interfaceC7950b0, "stateObject");
                        AbstractC7953c0 m17331L = C7971l.m17331L(m17475b, interfaceC7950b0, abstractC7961h);
                        i = (((i * 31) + C5157c.m25522a(m17331L)) * 31) + m17331L.m17444d();
                    }
                    C13195u c13195u = C13195u.f34156a;
                } finally {
                    int size2 = interfaceC5737e.size();
                    while (i2 < size2) {
                        ((InterfaceC6108l) ((C13182l) interfaceC5737e.get(i2)).m1461b()).mo9587d(interfaceC5257v);
                        i2++;
                    }
                }
            }
            return i;
        }

        /* renamed from: k */
        public final void m24899k(HashSet hashSet) {
            this.f14520c = hashSet;
        }

        /* renamed from: l */
        public final void m24898l(Object obj) {
            this.f14521d = obj;
        }

        /* renamed from: m */
        public final void m24897m(int i) {
            this.f14522e = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DerivedState.kt */
    /* renamed from: f0.u$b */
    /* loaded from: classes.dex */
    public static final class C5254b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ HashSet f14524x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5254b(HashSet hashSet) {
            super(1);
            this.f14524x = hashSet;
        }

        /* renamed from: a */
        public final void m24896a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "it");
            if (obj != C5252u.this) {
                if (obj instanceof InterfaceC7950b0) {
                    this.f14524x.add(obj);
                    return;
                }
                return;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m24896a(obj);
            return C13195u.f34156a;
        }
    }

    public C5252u(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "calculation");
        this.f14518w = interfaceC6097a;
        this.f14519x = new C5253a();
    }

    /* renamed from: e */
    private final C5253a m24907e(C5253a c5253a, AbstractC7961h abstractC7961h, InterfaceC6097a interfaceC6097a) {
        AbstractC7961h.C7962a c7962a;
        C5253a c5253a2;
        if (c5253a.m24901i(this, abstractC7961h)) {
            return c5253a;
        }
        Boolean bool = (Boolean) DerivedState.m25012b().m24956a();
        int i = 0;
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        HashSet hashSet = new HashSet();
        InterfaceC5737e interfaceC5737e = (InterfaceC5737e) DerivedState.m25013a().m24956a();
        if (interfaceC5737e == null) {
            interfaceC5737e = C5732a.m23210b();
        }
        int size = interfaceC5737e.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC6108l) ((C13182l) interfaceC5737e.get(i2)).m1462a()).mo9587d(this);
        }
        if (!booleanValue) {
            try {
                DerivedState.m25012b().m24955b(Boolean.TRUE);
            } finally {
                int size2 = interfaceC5737e.size();
                while (i < size2) {
                    ((InterfaceC6108l) ((C13182l) interfaceC5737e.get(i)).m1461b()).mo9587d(this);
                    i++;
                }
            }
        }
        Object m17366c = AbstractC7961h.f20646d.m17366c(new C5254b(hashSet), null, interfaceC6097a);
        if (!booleanValue) {
            DerivedState.m25012b().m24955b(Boolean.FALSE);
        }
        synchronized (C7971l.m17297z()) {
            c7962a = AbstractC7961h.f20646d;
            AbstractC7961h m17368a = c7962a.m17368a();
            c5253a2 = (C5253a) C7971l.m17338E(this.f14519x, this, m17368a);
            c5253a2.m24899k(hashSet);
            c5253a2.m24897m(c5253a2.m24900j(this, m17368a));
            c5253a2.m24898l(m17366c);
        }
        if (!booleanValue) {
            c7962a.m17367b();
        }
        return c5253a2;
    }

    /* renamed from: g */
    private final String m24905g() {
        C5253a c5253a = this.f14519x;
        AbstractC7961h.C7962a c7962a = AbstractC7961h.f20646d;
        C5253a c5253a2 = (C5253a) C7971l.m17299x(c5253a, c7962a.m17368a());
        return c5253a2.m24901i(this, c7962a.m17368a()) ? String.valueOf(c5253a2.m24902h()) : "<Not calculated>";
    }

    /* renamed from: a */
    public Object mo24892a() {
        C5253a c5253a = this.f14519x;
        AbstractC7961h.C7962a c7962a = AbstractC7961h.f20646d;
        return m24907e((C5253a) C7971l.m17299x(c5253a, c7962a.m17368a()), c7962a.m17368a(), this.f14518w).m24902h();
    }

    /* renamed from: b */
    public AbstractC7953c0 m24908b() {
        return this.f14519x;
    }

    /* renamed from: c */
    public Set mo24891c() {
        Set m208b;
        C5253a c5253a = this.f14519x;
        AbstractC7961h.C7962a c7962a = AbstractC7961h.f20646d;
        HashSet m24903g = m24907e((C5253a) C7971l.m17299x(c5253a, c7962a.m17368a()), c7962a.m17368a(), this.f14518w).m24903g();
        if (m24903g == null) {
            m208b = C13778q0.m208b();
            return m208b;
        }
        return m24903g;
    }

    /* renamed from: f */
    public void m24906f(AbstractC7953c0 abstractC7953c0) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "value");
        this.f14519x = (C5253a) abstractC7953c0;
    }

    public Object getValue() {
        InterfaceC6108l m17382f = AbstractC7961h.f20646d.m17368a().m17382f();
        if (m17382f != null) {
            m17382f.mo9587d(this);
        }
        return mo24892a();
    }

    /* renamed from: h */
    public AbstractC7953c0 m24904h(AbstractC7953c0 abstractC7953c0, AbstractC7953c0 abstractC7953c02, AbstractC7953c0 abstractC7953c03) {
        return InterfaceC7950b0.C7951a.m17472a(this, abstractC7953c0, abstractC7953c02, abstractC7953c03);
    }

    public String toString() {
        C5253a c5253a = (C5253a) C7971l.m17299x(this.f14519x, AbstractC7961h.f20646d.m17368a());
        return "DerivedState(value=" + m24905g() + ")@" + hashCode();
    }
}
