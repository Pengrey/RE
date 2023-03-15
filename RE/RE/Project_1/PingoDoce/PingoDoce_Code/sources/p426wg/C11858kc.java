package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.checkbox.MaterialCheckBox;
import pt.pingodoce.app.presentation.common.search.models.Brand;

/* renamed from: wg.kc */
/* loaded from: classes2.dex */
public class C11858kc extends AbstractC11838jc {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30793C = null;

    /* renamed from: D */
    private static final SparseIntArray f30794D = null;

    /* renamed from: B */
    private long f30795B;

    public C11858kc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f30793C, f30794D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (61 == i) {
            mo4077S((Brand) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11838jc
    /* renamed from: S */
    public void mo4077S(Brand brand) {
        this.f30692A = brand;
        synchronized (this) {
            this.f30795B |= 1;
        }
        m37781c(61);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.f30795B     // Catch: java.lang.Throwable -> L42
            r2 = 0
            r8.f30795B = r2     // Catch: java.lang.Throwable -> L42
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L42
            r4 = 0
            pt.pingodoce.app.presentation.common.search.models.Brand r5 = r8.f30692A
            r6 = 3
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L2b
            if (r5 == 0) goto L1e
            boolean r4 = r5.m12339e()
            pt.pingodoce.app.data.remote.models.response.BrandResponse r2 = r5.m12341c()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r2 == 0) goto L2b
            java.lang.String r1 = r2.m13910c()
            java.lang.String r2 = r2.m13911b()
            r3 = r2
            goto L2c
        L2b:
            r3 = r1
        L2c:
            if (r0 == 0) goto L41
            com.google.android.material.checkbox.MaterialCheckBox r0 = r8.f30693x
            p246n2.C7624a.m17897a(r0, r4)
            com.google.android.material.checkbox.MaterialCheckBox r0 = r8.f30693x
            p246n2.C7629e.m17885g(r0, r1)
            android.widget.ImageView r2 = r8.f30694y
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            ae.BindingAdapters.m41781j(r2, r3, r4, r5, r6, r7)
        L41:
            return
        L42:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11858kc.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30795B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30795B = 2L;
        }
        m37826E();
    }

    private C11858kc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCheckBox) objArr[2], (ImageView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f30795B = -1L;
        this.f30693x.setTag(null);
        this.f30694y.setTag(null);
        this.f30695z.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
