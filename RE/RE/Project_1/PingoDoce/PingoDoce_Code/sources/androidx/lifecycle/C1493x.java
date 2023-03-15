package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC1469p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p228m.C7081a;
import p243n.C7546a;
import p243n.C7547b;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class C1493x extends AbstractC1469p {

    /* renamed from: b */
    private C7546a<InterfaceC1489u, C1494a> f4367b;

    /* renamed from: c */
    private AbstractC1469p.EnumC1472c f4368c;

    /* renamed from: d */
    private final WeakReference<InterfaceC1491v> f4369d;

    /* renamed from: e */
    private int f4370e;

    /* renamed from: f */
    private boolean f4371f;

    /* renamed from: g */
    private boolean f4372g;

    /* renamed from: h */
    private ArrayList<AbstractC1469p.EnumC1472c> f4373h;

    /* renamed from: i */
    private final boolean f4374i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry.java */
    /* renamed from: androidx.lifecycle.x$a */
    /* loaded from: classes.dex */
    public static class C1494a {

        /* renamed from: a */
        AbstractC1469p.EnumC1472c f4375a;

        /* renamed from: b */
        InterfaceC1485s f4376b;

        C1494a(InterfaceC1489u interfaceC1489u, AbstractC1469p.EnumC1472c enumC1472c) {
            this.f4376b = C1496z.m36945f(interfaceC1489u);
            this.f4375a = enumC1472c;
        }

        /* renamed from: a */
        void m36951a(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
            AbstractC1469p.EnumC1472c targetState = enumC1471b.getTargetState();
            this.f4375a = C1493x.m36957k(this.f4375a, targetState);
            this.f4376b.mo33846n(interfaceC1491v, enumC1471b);
            this.f4375a = targetState;
        }
    }

    public C1493x(InterfaceC1491v interfaceC1491v) {
        this(interfaceC1491v, true);
    }

    /* renamed from: d */
    private void m36964d(InterfaceC1491v interfaceC1491v) {
        Iterator<Map.Entry<InterfaceC1489u, C1494a>> descendingIterator = this.f4367b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f4372g) {
            Map.Entry<InterfaceC1489u, C1494a> next = descendingIterator.next();
            C1494a value = next.getValue();
            while (value.f4375a.compareTo(this.f4368c) > 0 && !this.f4372g && this.f4367b.contains(next.getKey())) {
                AbstractC1469p.EnumC1471b downFrom = AbstractC1469p.EnumC1471b.downFrom(value.f4375a);
                if (downFrom != null) {
                    m36954n(downFrom.getTargetState());
                    value.m36951a(interfaceC1491v, downFrom);
                    m36955m();
                } else {
                    throw new IllegalStateException("no event down from " + value.f4375a);
                }
            }
        }
    }

    /* renamed from: e */
    private AbstractC1469p.EnumC1472c m36963e(InterfaceC1489u interfaceC1489u) {
        Map.Entry<InterfaceC1489u, C1494a> m18168q = this.f4367b.m18168q(interfaceC1489u);
        AbstractC1469p.EnumC1472c enumC1472c = null;
        AbstractC1469p.EnumC1472c enumC1472c2 = m18168q != null ? m18168q.getValue().f4375a : null;
        if (!this.f4373h.isEmpty()) {
            ArrayList<AbstractC1469p.EnumC1472c> arrayList = this.f4373h;
            enumC1472c = arrayList.get(arrayList.size() - 1);
        }
        return m36957k(m36957k(this.f4368c, enumC1472c2), enumC1472c);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m36962f(String str) {
        if (!this.f4374i || C7081a.m19345d().mo19342b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* renamed from: g */
    private void m36961g(InterfaceC1491v interfaceC1491v) {
        C7547b<InterfaceC1489u, C1494a>.C7551d m18165g = this.f4367b.m18165g();
        while (m18165g.hasNext() && !this.f4372g) {
            Map.Entry next = m18165g.next();
            C1494a c1494a = (C1494a) next.getValue();
            while (c1494a.f4375a.compareTo(this.f4368c) < 0 && !this.f4372g && this.f4367b.contains((InterfaceC1489u) next.getKey())) {
                m36954n(c1494a.f4375a);
                AbstractC1469p.EnumC1471b upFrom = AbstractC1469p.EnumC1471b.upFrom(c1494a.f4375a);
                if (upFrom != null) {
                    c1494a.m36951a(interfaceC1491v, upFrom);
                    m36955m();
                } else {
                    throw new IllegalStateException("no event up from " + c1494a.f4375a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m36959i() {
        if (this.f4367b.size() == 0) {
            return true;
        }
        AbstractC1469p.EnumC1472c enumC1472c = this.f4367b.m18167b().getValue().f4375a;
        AbstractC1469p.EnumC1472c enumC1472c2 = this.f4367b.m18164h().getValue().f4375a;
        return enumC1472c == enumC1472c2 && this.f4368c == enumC1472c2;
    }

    /* renamed from: k */
    static AbstractC1469p.EnumC1472c m36957k(AbstractC1469p.EnumC1472c enumC1472c, AbstractC1469p.EnumC1472c enumC1472c2) {
        return (enumC1472c2 == null || enumC1472c2.compareTo(enumC1472c) >= 0) ? enumC1472c : enumC1472c2;
    }

    /* renamed from: l */
    private void m36956l(AbstractC1469p.EnumC1472c enumC1472c) {
        if (this.f4368c == enumC1472c) {
            return;
        }
        this.f4368c = enumC1472c;
        if (!this.f4371f && this.f4370e == 0) {
            this.f4371f = true;
            m36952p();
            this.f4371f = false;
            return;
        }
        this.f4372g = true;
    }

    /* renamed from: m */
    private void m36955m() {
        ArrayList<AbstractC1469p.EnumC1472c> arrayList = this.f4373h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m36954n(AbstractC1469p.EnumC1472c enumC1472c) {
        this.f4373h.add(enumC1472c);
    }

    /* renamed from: p */
    private void m36952p() {
        InterfaceC1491v interfaceC1491v = this.f4369d.get();
        if (interfaceC1491v != null) {
            while (!m36959i()) {
                this.f4372g = false;
                if (this.f4368c.compareTo(this.f4367b.m18167b().getValue().f4375a) < 0) {
                    m36964d(interfaceC1491v);
                }
                Map.Entry<InterfaceC1489u, C1494a> m18164h = this.f4367b.m18164h();
                if (!this.f4372g && m18164h != null && this.f4368c.compareTo(m18164h.getValue().f4375a) > 0) {
                    m36961g(interfaceC1491v);
                }
            }
            this.f4372g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.AbstractC1469p
    /* renamed from: a */
    public void mo10402a(InterfaceC1489u interfaceC1489u) {
        InterfaceC1491v interfaceC1491v;
        m36962f("addObserver");
        AbstractC1469p.EnumC1472c enumC1472c = this.f4368c;
        AbstractC1469p.EnumC1472c enumC1472c2 = AbstractC1469p.EnumC1472c.DESTROYED;
        if (enumC1472c != enumC1472c2) {
            enumC1472c2 = AbstractC1469p.EnumC1472c.INITIALIZED;
        }
        C1494a c1494a = new C1494a(interfaceC1489u, enumC1472c2);
        if (this.f4367b.mo18162o(interfaceC1489u, c1494a) == null && (interfaceC1491v = this.f4369d.get()) != null) {
            boolean z = this.f4370e != 0 || this.f4371f;
            AbstractC1469p.EnumC1472c m36963e = m36963e(interfaceC1489u);
            this.f4370e++;
            while (c1494a.f4375a.compareTo(m36963e) < 0 && this.f4367b.contains(interfaceC1489u)) {
                m36954n(c1494a.f4375a);
                AbstractC1469p.EnumC1471b upFrom = AbstractC1469p.EnumC1471b.upFrom(c1494a.f4375a);
                if (upFrom != null) {
                    c1494a.m36951a(interfaceC1491v, upFrom);
                    m36955m();
                    m36963e = m36963e(interfaceC1489u);
                } else {
                    throw new IllegalStateException("no event up from " + c1494a.f4375a);
                }
            }
            if (!z) {
                m36952p();
            }
            this.f4370e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1469p
    /* renamed from: b */
    public AbstractC1469p.EnumC1472c mo10401b() {
        return this.f4368c;
    }

    @Override // androidx.lifecycle.AbstractC1469p
    /* renamed from: c */
    public void mo10400c(InterfaceC1489u interfaceC1489u) {
        m36962f("removeObserver");
        this.f4367b.mo18161p(interfaceC1489u);
    }

    /* renamed from: h */
    public void m36960h(AbstractC1469p.EnumC1471b enumC1471b) {
        m36962f("handleLifecycleEvent");
        m36956l(enumC1471b.getTargetState());
    }

    @Deprecated
    /* renamed from: j */
    public void m36958j(AbstractC1469p.EnumC1472c enumC1472c) {
        m36962f("markState");
        m36953o(enumC1472c);
    }

    /* renamed from: o */
    public void m36953o(AbstractC1469p.EnumC1472c enumC1472c) {
        m36962f("setCurrentState");
        m36956l(enumC1472c);
    }

    private C1493x(InterfaceC1491v interfaceC1491v, boolean z) {
        this.f4367b = new C7546a<>();
        this.f4370e = 0;
        this.f4371f = false;
        this.f4372g = false;
        this.f4373h = new ArrayList<>();
        this.f4369d = new WeakReference<>(interfaceC1491v);
        this.f4368c = AbstractC1469p.EnumC1472c.INITIALIZED;
        this.f4374i = z;
    }
}
