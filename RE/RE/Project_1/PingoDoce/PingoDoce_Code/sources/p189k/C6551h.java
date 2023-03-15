package p189k;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1166h0;
import androidx.core.view.C1174j0;
import androidx.core.view.InterfaceC1172i0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k.h */
/* loaded from: classes.dex */
public class C6551h {

    /* renamed from: c */
    private Interpolator f17774c;

    /* renamed from: d */
    InterfaceC1172i0 f17775d;

    /* renamed from: e */
    private boolean f17776e;

    /* renamed from: b */
    private long f17773b = -1;

    /* renamed from: f */
    private final C1174j0 f17777f = new C6552a();

    /* renamed from: a */
    final ArrayList<C1166h0> f17772a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* renamed from: k.h$a */
    /* loaded from: classes.dex */
    class C6552a extends C1174j0 {

        /* renamed from: a */
        private boolean f17778a = false;

        /* renamed from: b */
        private int f17779b = 0;

        C6552a() {
        }

        @Override // androidx.core.view.InterfaceC1172i0
        /* renamed from: b */
        public void mo20606b(View view) {
            int i = this.f17779b + 1;
            this.f17779b = i;
            if (i == C6551h.this.f17772a.size()) {
                InterfaceC1172i0 interfaceC1172i0 = C6551h.this.f17775d;
                if (interfaceC1172i0 != null) {
                    interfaceC1172i0.mo20606b(null);
                }
                m20604d();
            }
        }

        @Override // androidx.core.view.C1174j0, androidx.core.view.InterfaceC1172i0
        /* renamed from: c */
        public void mo20605c(View view) {
            if (this.f17778a) {
                return;
            }
            this.f17778a = true;
            InterfaceC1172i0 interfaceC1172i0 = C6551h.this.f17775d;
            if (interfaceC1172i0 != null) {
                interfaceC1172i0.mo20605c(null);
            }
        }

        /* renamed from: d */
        void m20604d() {
            this.f17779b = 0;
            this.f17778a = false;
            C6551h.this.m20613b();
        }
    }

    /* renamed from: a */
    public void m20614a() {
        if (this.f17776e) {
            Iterator<C1166h0> it = this.f17772a.iterator();
            while (it.hasNext()) {
                it.next().m38169c();
            }
            this.f17776e = false;
        }
    }

    /* renamed from: b */
    void m20613b() {
        this.f17776e = false;
    }

    /* renamed from: c */
    public C6551h m20612c(C1166h0 c1166h0) {
        if (!this.f17776e) {
            this.f17772a.add(c1166h0);
        }
        return this;
    }

    /* renamed from: d */
    public C6551h m20611d(C1166h0 c1166h0, C1166h0 c1166h02) {
        this.f17772a.add(c1166h0);
        c1166h02.m38162j(c1166h0.m38168d());
        this.f17772a.add(c1166h02);
        return this;
    }

    /* renamed from: e */
    public C6551h m20610e(long j) {
        if (!this.f17776e) {
            this.f17773b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C6551h m20609f(Interpolator interpolator) {
        if (!this.f17776e) {
            this.f17774c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C6551h m20608g(InterfaceC1172i0 interfaceC1172i0) {
        if (!this.f17776e) {
            this.f17775d = interfaceC1172i0;
        }
        return this;
    }

    /* renamed from: h */
    public void m20607h() {
        if (this.f17776e) {
            return;
        }
        Iterator<C1166h0> it = this.f17772a.iterator();
        while (it.hasNext()) {
            C1166h0 next = it.next();
            long j = this.f17773b;
            if (j >= 0) {
                next.m38166f(j);
            }
            Interpolator interpolator = this.f17774c;
            if (interpolator != null) {
                next.m38165g(interpolator);
            }
            if (this.f17775d != null) {
                next.m38164h(this.f17777f);
            }
            next.m38160l();
        }
        this.f17776e = true;
    }
}
