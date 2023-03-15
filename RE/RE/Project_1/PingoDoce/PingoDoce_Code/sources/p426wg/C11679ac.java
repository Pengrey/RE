package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;

/* renamed from: wg.ac */
/* loaded from: classes2.dex */
public class C11679ac extends AbstractC12138zb {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f29876C = null;

    /* renamed from: D */
    private static final SparseIntArray f29877D;

    /* renamed from: A */
    private final ConstraintLayout f29878A;

    /* renamed from: B */
    private long f29879B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29877D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_divider, 3);
    }

    public C11679ac(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f29876C, f29877D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (69 == i) {
            mo3567S((LoyaltyCardAssociation) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12138zb
    /* renamed from: S */
    public void mo3567S(LoyaltyCardAssociation loyaltyCardAssociation) {
        this.f32060z = loyaltyCardAssociation;
        synchronized (this) {
            this.f29879B |= 1;
        }
        m37781c(69);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f29879B;
            this.f29879B = 0L;
        }
        LoyaltyCardAssociation loyaltyCardAssociation = this.f32060z;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i == 0 || loyaltyCardAssociation == null) {
            str = null;
        } else {
            str2 = loyaltyCardAssociation.m13782c();
            str = loyaltyCardAssociation.m13781d();
        }
        if (i != 0) {
            C7629e.m17885g(this.f32058x, str2);
            C7629e.m17885g(this.f32059y, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f29879B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29879B = 2L;
        }
        m37826E();
    }

    private C11679ac(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (View) objArr[3], (TextView) objArr[1], (TextView) objArr[2]);
        this.f29879B = -1L;
        this.f32058x.setTag(null);
        this.f32059y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29878A = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
