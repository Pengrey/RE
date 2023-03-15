package p426wg;

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

/* renamed from: wg.k7 */
/* loaded from: classes2.dex */
public class C11853k7 extends AbstractC11833j7 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f30773B = null;

    /* renamed from: C */
    private static final SparseIntArray f30774C;

    /* renamed from: A */
    private long f30775A;

    /* renamed from: z */
    private final ConstraintLayout f30776z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30774C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.bp_premier_plus_image, 2);
        sparseIntArray.put(C2336R.C2338id.const_bp_premier_plus_benefits_title, 3);
    }

    public C11853k7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30773B, f30774C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (70 == i) {
            mo4085Q((LoyaltyCard) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11833j7
    /* renamed from: Q */
    public void mo4085Q(LoyaltyCard loyaltyCard) {
        this.f30678y = loyaltyCard;
        synchronized (this) {
            this.f30775A |= 1;
        }
        m37781c(70);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30775A;
            this.f30775A = 0L;
        }
        LoyaltyCard loyaltyCard = this.f30678y;
        String str = null;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i != 0) {
            str = (loyaltyCard != null ? loyaltyCard.m13794v() : 0) + "pts";
        }
        if (i != 0) {
            C7629e.m17885g(this.f30677x, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30775A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30775A = 2L;
        }
        m37826E();
    }

    private C11853k7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[1], (ImageView) objArr[2], (TextView) objArr[3]);
        this.f30775A = -1L;
        this.f30677x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30776z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
