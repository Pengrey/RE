package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.stores.StoreSchedule;

/* renamed from: wg.yd */
/* loaded from: classes2.dex */
public class C12123yd extends AbstractC12105xd {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31992C = null;

    /* renamed from: D */
    private static final SparseIntArray f31993D = null;

    /* renamed from: A */
    private final ConstraintLayout f31994A;

    /* renamed from: B */
    private long f31995B;

    public C12123yd(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31992C, f31993D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (105 == i) {
            mo3597S((StoreSchedule) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12105xd
    /* renamed from: S */
    public void mo3597S(StoreSchedule storeSchedule) {
        this.f31903z = storeSchedule;
        synchronized (this) {
            this.f31995B |= 1;
        }
        m37781c(C0868i.f2763F0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f31995B;
            this.f31995B = 0L;
        }
        StoreSchedule storeSchedule = this.f31903z;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i == 0 || storeSchedule == null) {
            str = null;
        } else {
            str2 = storeSchedule.m14305h();
            str = storeSchedule.m14311a();
        }
        if (i != 0) {
            C7629e.m17885g(this.f31901x, str2);
            C7629e.m17885g(this.f31902y, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31995B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31995B = 2L;
        }
        m37826E();
    }

    private C12123yd(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f31995B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31994A = constraintLayout;
        constraintLayout.setTag(null);
        this.f31901x.setTag(null);
        this.f31902y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
