package bb;

import android.view.View;
import bb.AbstractC1872a;
import com.google.android.gms.maps.model.MarkerOptions;
import p418w7.C11581c;
import p463y7.C13130c;

/* renamed from: bb.b */
/* loaded from: classes2.dex */
public class C1875b extends AbstractC1872a<C13130c, C1876a> implements C11581c.InterfaceC11585d, C11581c.InterfaceC11588g, C11581c.InterfaceC11589h, C11581c.InterfaceC11582a, C11581c.InterfaceC11586e {

    /* compiled from: MarkerManager.java */
    /* renamed from: bb.b$a */
    /* loaded from: classes2.dex */
    public class C1876a extends AbstractC1872a.C1874b {

        /* renamed from: c */
        private C11581c.InterfaceC11585d f5594c;

        /* renamed from: d */
        private C11581c.InterfaceC11586e f5595d;

        /* renamed from: e */
        private C11581c.InterfaceC11588g f5596e;

        /* renamed from: f */
        private C11581c.InterfaceC11589h f5597f;

        /* renamed from: g */
        private C11581c.InterfaceC11582a f5598g;

        public C1876a() {
            super();
        }

        /* renamed from: i */
        public C13130c m35226i(MarkerOptions markerOptions) {
            C13130c m4676a = C1875b.this.f5589a.m4676a(markerOptions);
            super.m35238a(m4676a);
            return m4676a;
        }

        /* renamed from: j */
        public void m35225j(C11581c.InterfaceC11585d interfaceC11585d) {
            this.f5594c = interfaceC11585d;
        }

        /* renamed from: k */
        public void m35224k(C11581c.InterfaceC11586e interfaceC11586e) {
            this.f5595d = interfaceC11586e;
        }

        /* renamed from: l */
        public void m35223l(C11581c.InterfaceC11588g interfaceC11588g) {
            this.f5596e = interfaceC11588g;
        }
    }

    public C1875b(C11581c c11581c) {
        super(c11581c);
    }

    @Override // p418w7.C11581c.InterfaceC11582a
    /* renamed from: a */
    public View mo4660a(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5598g == null) {
            return null;
        }
        return c1876a.f5598g.mo4660a(c13130c);
    }

    @Override // p418w7.C11581c.InterfaceC11589h
    /* renamed from: b */
    public void mo4655b(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5597f == null) {
            return;
        }
        c1876a.f5597f.mo4655b(c13130c);
    }

    @Override // p418w7.C11581c.InterfaceC11589h
    /* renamed from: c */
    public void mo4654c(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5597f == null) {
            return;
        }
        c1876a.f5597f.mo4654c(c13130c);
    }

    @Override // p418w7.C11581c.InterfaceC11585d
    /* renamed from: d */
    public void mo1540d(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5594c == null) {
            return;
        }
        c1876a.f5594c.mo1540d(c13130c);
    }

    @Override // p418w7.C11581c.InterfaceC11586e
    /* renamed from: e */
    public void mo4657e(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5595d == null) {
            return;
        }
        c1876a.f5595d.mo4657e(c13130c);
    }

    @Override // p418w7.C11581c.InterfaceC11588g
    /* renamed from: f */
    public boolean mo1538f(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5596e == null) {
            return false;
        }
        return c1876a.f5596e.mo1538f(c13130c);
    }

    @Override // p418w7.C11581c.InterfaceC11582a
    /* renamed from: g */
    public View mo4659g(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5598g == null) {
            return null;
        }
        return c1876a.f5598g.mo4659g(c13130c);
    }

    @Override // p418w7.C11581c.InterfaceC11589h
    /* renamed from: h */
    public void mo4653h(C13130c c13130c) {
        C1876a c1876a = (C1876a) this.f5590b.get(c13130c);
        if (c1876a == null || c1876a.f5597f == null) {
            return;
        }
        c1876a.f5597f.mo4653h(c13130c);
    }

    @Override // bb.AbstractC1872a
    /* renamed from: k */
    void mo35234k() {
        C11581c c11581c = this.f5589a;
        if (c11581c != null) {
            c11581c.m4665l(this);
            this.f5589a.m4664m(this);
            this.f5589a.m4662o(this);
            this.f5589a.m4661p(this);
            this.f5589a.m4670g(this);
        }
    }

    /* renamed from: l */
    public C1876a m35233l() {
        return new C1876a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bb.AbstractC1872a
    /* renamed from: m */
    public void mo35235j(C13130c c13130c) {
        c13130c.m1556e();
    }
}
