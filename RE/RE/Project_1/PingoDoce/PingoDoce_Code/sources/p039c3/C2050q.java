package p039c3;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p039c3.AbstractC2037m;

/* renamed from: c3.q */
/* loaded from: classes.dex */
public class C2050q extends AbstractC2037m {

    /* renamed from: h0 */
    int f5951h0;

    /* renamed from: f0 */
    private ArrayList<AbstractC2037m> f5949f0 = new ArrayList<>();

    /* renamed from: g0 */
    private boolean f5950g0 = true;

    /* renamed from: i0 */
    boolean f5952i0 = false;

    /* renamed from: j0 */
    private int f5953j0 = 0;

    /* compiled from: TransitionSet.java */
    /* renamed from: c3.q$a */
    /* loaded from: classes.dex */
    class C2051a extends C2045n {

        /* renamed from: a */
        final /* synthetic */ AbstractC2037m f5954a;

        C2051a(C2050q c2050q, AbstractC2037m abstractC2037m) {
            this.f5954a = abstractC2037m;
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            this.f5954a.mo34843X();
            abstractC2037m.mo34846T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* renamed from: c3.q$b */
    /* loaded from: classes.dex */
    public static class C2052b extends C2045n {

        /* renamed from: a */
        C2050q f5955a;

        C2052b(C2050q c2050q) {
            this.f5955a = c2050q;
        }

        @Override // p039c3.C2045n, p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: c */
        public void mo34817c(AbstractC2037m abstractC2037m) {
            C2050q c2050q = this.f5955a;
            if (c2050q.f5952i0) {
                return;
            }
            c2050q.m34869e0();
            this.f5955a.f5952i0 = true;
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            C2050q c2050q = this.f5955a;
            int i = c2050q.f5951h0 - 1;
            c2050q.f5951h0 = i;
            if (i == 0) {
                c2050q.f5952i0 = false;
                c2050q.m34865p();
            }
            abstractC2037m.mo34846T(this);
        }
    }

    /* renamed from: j0 */
    private void m34829j0(AbstractC2037m abstractC2037m) {
        this.f5949f0.add(abstractC2037m);
        abstractC2037m.f5915N = this;
    }

    /* renamed from: s0 */
    private void m34818s0() {
        C2052b c2052b = new C2052b(this);
        Iterator<AbstractC2037m> it = this.f5949f0.iterator();
        while (it.hasNext()) {
            it.next().mo34840a(c2052b);
        }
        this.f5951h0 = this.f5949f0.size();
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: R */
    public void mo34847R(View view) {
        super.mo34847R(view);
        int size = this.f5949f0.size();
        for (int i = 0; i < size; i++) {
            this.f5949f0.get(i).mo34847R(view);
        }
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: V */
    public void mo34844V(View view) {
        super.mo34844V(view);
        int size = this.f5949f0.size();
        for (int i = 0; i < size; i++) {
            this.f5949f0.get(i).mo34844V(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p039c3.AbstractC2037m
    /* renamed from: X */
    public void mo34843X() {
        if (this.f5949f0.isEmpty()) {
            m34869e0();
            m34865p();
            return;
        }
        m34818s0();
        if (!this.f5950g0) {
            for (int i = 1; i < this.f5949f0.size(); i++) {
                this.f5949f0.get(i - 1).mo34840a(new C2051a(this, this.f5949f0.get(i)));
            }
            AbstractC2037m abstractC2037m = this.f5949f0.get(0);
            if (abstractC2037m != null) {
                abstractC2037m.mo34843X();
                return;
            }
            return;
        }
        Iterator<AbstractC2037m> it = this.f5949f0.iterator();
        while (it.hasNext()) {
            it.next().mo34843X();
        }
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: Z */
    public void mo34841Z(AbstractC2037m.AbstractC2042e abstractC2042e) {
        super.mo34841Z(abstractC2042e);
        this.f5953j0 |= 8;
        int size = this.f5949f0.size();
        for (int i = 0; i < size; i++) {
            this.f5949f0.get(i).mo34841Z(abstractC2042e);
        }
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: b0 */
    public void mo34837b0(AbstractC2022g abstractC2022g) {
        super.mo34837b0(abstractC2022g);
        this.f5953j0 |= 4;
        if (this.f5949f0 != null) {
            for (int i = 0; i < this.f5949f0.size(); i++) {
                this.f5949f0.get(i).mo34837b0(abstractC2022g);
            }
        }
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: c0 */
    public void mo34836c0(AbstractC2049p abstractC2049p) {
        super.mo34836c0(abstractC2049p);
        this.f5953j0 |= 2;
        int size = this.f5949f0.size();
        for (int i = 0; i < size; i++) {
            this.f5949f0.get(i).mo34836c0(abstractC2049p);
        }
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: f */
    public void mo29511f(C2054s c2054s) {
        if (m34881K(c2054s.f5960b)) {
            Iterator<AbstractC2037m> it = this.f5949f0.iterator();
            while (it.hasNext()) {
                AbstractC2037m next = it.next();
                if (next.m34881K(c2054s.f5960b)) {
                    next.mo29511f(c2054s);
                    c2054s.f5961c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p039c3.AbstractC2037m
    /* renamed from: f0 */
    public String mo34834f0(String str) {
        String mo34834f0 = super.mo34834f0(str);
        for (int i = 0; i < this.f5949f0.size(); i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo34834f0);
            sb2.append("\n");
            sb2.append(this.f5949f0.get(i).mo34834f0(str + "  "));
            mo34834f0 = sb2.toString();
        }
        return mo34834f0;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: g0 */
    public C2050q mo34840a(AbstractC2037m.InterfaceC2043f interfaceC2043f) {
        return (C2050q) super.mo34840a(interfaceC2043f);
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: h0 */
    public C2050q mo34838b(View view) {
        for (int i = 0; i < this.f5949f0.size(); i++) {
            this.f5949f0.get(i).mo34838b(view);
        }
        return (C2050q) super.mo34838b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p039c3.AbstractC2037m
    /* renamed from: i */
    public void mo34831i(C2054s c2054s) {
        super.mo34831i(c2054s);
        int size = this.f5949f0.size();
        for (int i = 0; i < size; i++) {
            this.f5949f0.get(i).mo34831i(c2054s);
        }
    }

    /* renamed from: i0 */
    public C2050q m34830i0(AbstractC2037m abstractC2037m) {
        m34829j0(abstractC2037m);
        long j = this.f5932y;
        if (j >= 0) {
            abstractC2037m.mo34842Y(j);
        }
        if ((this.f5953j0 & 1) != 0) {
            abstractC2037m.mo34839a0(m34862s());
        }
        if ((this.f5953j0 & 2) != 0) {
            abstractC2037m.mo34836c0(m34858z());
        }
        if ((this.f5953j0 & 4) != 0) {
            abstractC2037m.mo34837b0(m34859x());
        }
        if ((this.f5953j0 & 8) != 0) {
            abstractC2037m.mo34841Z(m34863r());
        }
        return this;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: j */
    public void mo29509j(C2054s c2054s) {
        if (m34881K(c2054s.f5960b)) {
            Iterator<AbstractC2037m> it = this.f5949f0.iterator();
            while (it.hasNext()) {
                AbstractC2037m next = it.next();
                if (next.m34881K(c2054s.f5960b)) {
                    next.mo29509j(c2054s);
                    c2054s.f5961c.add(next);
                }
            }
        }
    }

    /* renamed from: k0 */
    public AbstractC2037m m34828k0(int i) {
        if (i < 0 || i >= this.f5949f0.size()) {
            return null;
        }
        return this.f5949f0.get(i);
    }

    /* renamed from: l0 */
    public int m34827l0() {
        return this.f5949f0.size();
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: m */
    public AbstractC2037m clone() {
        C2050q c2050q = (C2050q) super.clone();
        c2050q.f5949f0 = new ArrayList<>();
        int size = this.f5949f0.size();
        for (int i = 0; i < size; i++) {
            c2050q.m34829j0(this.f5949f0.get(i).clone());
        }
        return c2050q;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: m0 */
    public C2050q mo34846T(AbstractC2037m.InterfaceC2043f interfaceC2043f) {
        return (C2050q) super.mo34846T(interfaceC2043f);
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: n0 */
    public C2050q mo34845U(View view) {
        for (int i = 0; i < this.f5949f0.size(); i++) {
            this.f5949f0.get(i).mo34845U(view);
        }
        return (C2050q) super.mo34845U(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p039c3.AbstractC2037m
    /* renamed from: o */
    public void mo34823o(ViewGroup viewGroup, C2055t c2055t, C2055t c2055t2, ArrayList<C2054s> arrayList, ArrayList<C2054s> arrayList2) {
        long m34889B = m34889B();
        int size = this.f5949f0.size();
        for (int i = 0; i < size; i++) {
            AbstractC2037m abstractC2037m = this.f5949f0.get(i);
            if (m34889B > 0 && (this.f5950g0 || i == 0)) {
                long m34889B2 = abstractC2037m.m34889B();
                if (m34889B2 > 0) {
                    abstractC2037m.mo34835d0(m34889B2 + m34889B);
                } else {
                    abstractC2037m.mo34835d0(m34889B);
                }
            }
            abstractC2037m.mo34823o(viewGroup, c2055t, c2055t2, arrayList, arrayList2);
        }
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: o0 */
    public C2050q mo34842Y(long j) {
        ArrayList<AbstractC2037m> arrayList;
        super.mo34842Y(j);
        if (this.f5932y >= 0 && (arrayList = this.f5949f0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5949f0.get(i).mo34842Y(j);
            }
        }
        return this;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: p0 */
    public C2050q mo34839a0(TimeInterpolator timeInterpolator) {
        this.f5953j0 |= 1;
        ArrayList<AbstractC2037m> arrayList = this.f5949f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5949f0.get(i).mo34839a0(timeInterpolator);
            }
        }
        return (C2050q) super.mo34839a0(timeInterpolator);
    }

    /* renamed from: q0 */
    public C2050q m34820q0(int i) {
        if (i == 0) {
            this.f5950g0 = true;
        } else if (i == 1) {
            this.f5950g0 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: r0 */
    public C2050q mo34835d0(long j) {
        return (C2050q) super.mo34835d0(j);
    }
}
