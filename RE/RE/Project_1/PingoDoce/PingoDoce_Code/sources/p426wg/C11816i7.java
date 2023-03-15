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
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.i7 */
/* loaded from: classes2.dex */
public class C11816i7 extends AbstractC11798h7 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30569C = null;

    /* renamed from: D */
    private static final SparseIntArray f30570D;

    /* renamed from: A */
    private final ConstraintLayout f30571A;

    /* renamed from: B */
    private long f30572B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30570D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.bp_image, 3);
        sparseIntArray.put(C2336R.C2338id.const_benefits_title, 4);
    }

    public C11816i7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30569C, f30570D));
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
            mo4196Q((Boolean) obj);
        } else if (70 != i) {
            return false;
        } else {
            mo4195R((LoyaltyCard) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11798h7
    /* renamed from: Q */
    public void mo4196Q(Boolean bool) {
    }

    @Override // p426wg.AbstractC11798h7
    /* renamed from: R */
    public void mo4195R(LoyaltyCard loyaltyCard) {
        this.f30458z = loyaltyCard;
        synchronized (this) {
            this.f30572B |= 2;
        }
        m37781c(70);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        String str;
        String str2;
        synchronized (this) {
            j = this.f30572B;
            this.f30572B = 0L;
        }
        LoyaltyCard loyaltyCard = this.f30458z;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        String str3 = null;
        if (i != 0) {
            if (loyaltyCard != null) {
                str2 = loyaltyCard.m13791z();
                str3 = loyaltyCard.m13793w();
            } else {
                str2 = null;
            }
            boolean z2 = !(str3 != null ? str3.isEmpty() : false);
            str = str3;
            str3 = str2;
            z = z2;
        } else {
            z = false;
            str = null;
        }
        if (i != 0) {
            C7629e.m17885g(this.f30456x, str3);
            C7629e.m17885g(this.f30457y, str);
            BindingAdapters.m41779l(this.f30457y, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30572B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30572B = 4L;
        }
        m37826E();
    }

    private C11816i7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2], (ImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[1]);
        this.f30572B = -1L;
        this.f30456x.setTag(null);
        this.f30457y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30571A = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
