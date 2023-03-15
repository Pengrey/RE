package androidx.databinding;

import androidx.databinding.InterfaceC1277h;

/* renamed from: androidx.databinding.a */
/* loaded from: classes.dex */
public class C1269a implements InterfaceC1277h {

    /* renamed from: a */
    private transient C1285m f3700a;

    @Override // androidx.databinding.InterfaceC1277h
    /* renamed from: a */
    public void mo37760a(InterfaceC1277h.AbstractC1278a abstractC1278a) {
        synchronized (this) {
            if (this.f3700a == null) {
                this.f3700a = new C1285m();
            }
        }
        this.f3700a.m37780a(abstractC1278a);
    }

    @Override // androidx.databinding.InterfaceC1277h
    /* renamed from: b */
    public void mo37759b(InterfaceC1277h.AbstractC1278a abstractC1278a) {
        synchronized (this) {
            C1285m c1285m = this.f3700a;
            if (c1285m == null) {
                return;
            }
            c1285m.m37772j(abstractC1278a);
        }
    }

    /* renamed from: c */
    public void m37781c(int i) {
        synchronized (this) {
            C1285m c1285m = this.f3700a;
            if (c1285m == null) {
                return;
            }
            c1285m.m37777d(this, i, null);
        }
    }
}
