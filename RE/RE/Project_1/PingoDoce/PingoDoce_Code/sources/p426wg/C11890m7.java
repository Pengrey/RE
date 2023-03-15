package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.m7 */
/* loaded from: classes2.dex */
public class C11890m7 extends AbstractC11870l7 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f30947B = null;

    /* renamed from: C */
    private static final SparseIntArray f30948C;

    /* renamed from: A */
    private long f30949A;

    /* renamed from: z */
    private final ConstraintLayout f30950z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30948C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.card_associations_image, 2);
        sparseIntArray.put(C2336R.C2338id.const_card_associations_benefits_title, 3);
        sparseIntArray.put(C2336R.C2338id.const_card_associations_description, 4);
    }

    public C11890m7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30947B, f30948C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (57 == i) {
            m4006R((Boolean) obj);
        } else if (70 != i) {
            return false;
        } else {
            mo4007Q((LoyaltyCard) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11870l7
    /* renamed from: Q */
    public void mo4007Q(LoyaltyCard loyaltyCard) {
        this.f30868y = loyaltyCard;
        synchronized (this) {
            this.f30949A |= 2;
        }
        m37781c(70);
        super.m37826E();
    }

    /* renamed from: R */
    public void m4006R(Boolean bool) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30949A;
            this.f30949A = 0L;
        }
        LoyaltyCard loyaltyCard = this.f30868y;
        boolean z = false;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0 && loyaltyCard != null) {
            z = loyaltyCard.m13826D();
        }
        if (i != 0) {
            BindingAdapters.m41779l(this.f30867x, Boolean.valueOf(z), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30949A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30949A = 4L;
        }
        m37826E();
    }

    private C11890m7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[1], (ImageView) objArr[2], (TextView) objArr[3], (TextView) objArr[4]);
        this.f30949A = -1L;
        this.f30867x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30950z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
