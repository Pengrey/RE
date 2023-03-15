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

/* renamed from: wg.o7 */
/* loaded from: classes2.dex */
public class C11931o7 extends AbstractC11909n7 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31131B = null;

    /* renamed from: C */
    private static final SparseIntArray f31132C;

    /* renamed from: A */
    private long f31133A;

    /* renamed from: z */
    private final ConstraintLayout f31134z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31132C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.bp_card_ompd_image, 2);
        sparseIntArray.put(C2336R.C2338id.const_card_ompd_benefits_title, 3);
    }

    public C11931o7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f31131B, f31132C));
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
            m3937R((Boolean) obj);
        } else if (70 != i) {
            return false;
        } else {
            mo3938Q((LoyaltyCard) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11909n7
    /* renamed from: Q */
    public void mo3938Q(LoyaltyCard loyaltyCard) {
        this.f31033y = loyaltyCard;
        synchronized (this) {
            this.f31133A |= 2;
        }
        m37781c(70);
        super.m37826E();
    }

    /* renamed from: R */
    public void m3937R(Boolean bool) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f31133A;
            this.f31133A = 0L;
        }
        LoyaltyCard loyaltyCard = this.f31033y;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0) {
            str = loyaltyCard != null ? loyaltyCard.m13799m() : null;
            r1 = !(str != null ? str.isEmpty() : false);
        } else {
            str = null;
        }
        if (i != 0) {
            C7629e.m17885g(this.f31032x, str);
            BindingAdapters.m41779l(this.f31032x, Boolean.valueOf(r1), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31133A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31133A = 4L;
        }
        m37826E();
    }

    private C11931o7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[2], (TextView) objArr[3], (TextView) objArr[1]);
        this.f31133A = -1L;
        this.f31032x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31134z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
