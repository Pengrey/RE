package p092f0;

import p181jd.Intrinsics;
import p260o0.AbstractC7953c0;
import p260o0.AbstractC7961h;
import p260o0.C7971l;
import p260o0.InterfaceC7950b0;
import p260o0.InterfaceC7981q;
import p468yc.C13195u;

/* renamed from: f0.h1 */
/* loaded from: classes.dex */
public class SnapshotState<T> implements InterfaceC7950b0, InterfaceC7981q {

    /* renamed from: w */
    private final SnapshotMutationPolicy f14325w;

    /* renamed from: x */
    private C5178a f14326x;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotState.kt */
    /* renamed from: f0.h1$a */
    /* loaded from: classes.dex */
    public static final class C5178a<T> extends AbstractC7953c0 {

        /* renamed from: c */
        private Object f14327c;

        public C5178a(Object obj) {
            this.f14327c = obj;
        }

        /* renamed from: a */
        public void mo17447a(AbstractC7953c0 abstractC7953c0) {
            Intrinsics.isThisObjectNull(abstractC7953c0, "value");
            this.f14327c = ((C5178a) abstractC7953c0).f14327c;
        }

        /* renamed from: b */
        public AbstractC7953c0 mo17446b() {
            return new C5178a(this.f14327c);
        }

        /* renamed from: g */
        public final Object m25286g() {
            return this.f14327c;
        }

        /* renamed from: h */
        public final void m25285h(Object obj) {
            this.f14327c = obj;
        }
    }

    public SnapshotState(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        Intrinsics.isThisObjectNull(snapshotMutationPolicy, "policy");
        this.f14325w = snapshotMutationPolicy;
        this.f14326x = new C5178a(obj);
    }

    /* renamed from: b */
    public AbstractC7953c0 m25289b() {
        return this.f14326x;
    }

    /* renamed from: d */
    public SnapshotMutationPolicy mo17279d() {
        return this.f14325w;
    }

    /* renamed from: f */
    public void m25288f(AbstractC7953c0 abstractC7953c0) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "value");
        this.f14326x = (C5178a) abstractC7953c0;
    }

    public Object getValue() {
        return ((C5178a) C7971l.m17332K(this.f14326x, this)).m25286g();
    }

    /* renamed from: h */
    public AbstractC7953c0 m25287h(AbstractC7953c0 abstractC7953c0, AbstractC7953c0 abstractC7953c02, AbstractC7953c0 abstractC7953c03) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "previous");
        Intrinsics.isThisObjectNull(abstractC7953c02, "current");
        Intrinsics.isThisObjectNull(abstractC7953c03, "applied");
        C5178a c5178a = (C5178a) abstractC7953c0;
        C5178a c5178a2 = (C5178a) abstractC7953c02;
        C5178a c5178a3 = (C5178a) abstractC7953c03;
        if (mo17279d().mo24851a(c5178a2.m25286g(), c5178a3.m25286g())) {
            return abstractC7953c02;
        }
        Object mo24850b = mo17279d().mo24850b(c5178a.m25286g(), c5178a2.m25286g(), c5178a3.m25286g());
        if (mo24850b != null) {
            AbstractC7953c0 mo17446b = c5178a3.mo17446b();
            ((C5178a) mo17446b).m25285h(mo24850b);
            return mo17446b;
        }
        return null;
    }

    public void setValue(Object obj) {
        AbstractC7961h m17368a;
        C5178a c5178a = this.f14326x;
        AbstractC7961h.C7962a c7962a = AbstractC7961h.f20646d;
        C5178a c5178a2 = (C5178a) C7971l.m17299x(c5178a, c7962a.m17368a());
        if (mo17279d().mo24851a(c5178a2.m25286g(), obj)) {
            return;
        }
        C5178a c5178a3 = this.f14326x;
        C7971l.m17342A();
        synchronized (C7971l.m17297z()) {
            m17368a = c7962a.m17368a();
            ((C5178a) C7971l.m17335H(c5178a3, this, m17368a, c5178a2)).m25285h(obj);
            C13195u c13195u = C13195u.f34156a;
        }
        C7971l.m17337F(m17368a, this);
    }

    public String toString() {
        return "MutableState(value=" + ((C5178a) C7971l.m17299x(this.f14326x, AbstractC7961h.f20646d.m17368a())).m25286g() + ")@" + hashCode();
    }
}
