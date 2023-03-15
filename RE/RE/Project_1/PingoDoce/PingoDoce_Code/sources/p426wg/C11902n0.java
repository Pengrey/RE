package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel;

/* renamed from: wg.n0 */
/* loaded from: classes2.dex */
public class C11902n0 extends AbstractC11880m0 {

    /* renamed from: L */
    private static final ViewDataBinding.C1263i f30997L;

    /* renamed from: M */
    private static final SparseIntArray f30998M;

    /* renamed from: H */
    private final AbstractC11917nf f30999H;

    /* renamed from: I */
    private final ConstraintLayout f31000I;

    /* renamed from: J */
    private final AbstractC12136z9 f31001J;

    /* renamed from: K */
    private long f31002K;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(15);
        f30997L = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{6, 11}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"view_bp_balance"}, new int[]{7}, new int[]{C2336R.layout.view_bp_balance});
        c1263i.m37795a(2, new String[]{"view_bp_premier_plus"}, new int[]{8}, new int[]{C2336R.layout.view_bp_premier_plus});
        c1263i.m37795a(3, new String[]{"view_card_ompd"}, new int[]{9}, new int[]{C2336R.layout.view_card_ompd});
        c1263i.m37795a(4, new String[]{"view_card_manage_associations"}, new int[]{10}, new int[]{C2336R.layout.view_card_manage_associations});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30998M = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.space, 12);
        sparseIntArray.put(C2336R.C2338id.txt_coupon, 13);
        sparseIntArray.put(C2336R.C2338id.txt_my_card, 14);
    }

    public C11902n0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 15, f30997L, f30998M));
    }

    /* renamed from: R */
    private boolean m3981R(AbstractC11798h7 abstractC11798h7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31002K |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3980S(AbstractC11833j7 abstractC11833j7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31002K |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3979T(AbstractC11909n7 abstractC11909n7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31002K |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3978U(AbstractC11870l7 abstractC11870l7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31002K |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3977V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31002K |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3976W(LiveData<LoyaltyCard> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31002K |= 16;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            return m3979T((AbstractC11909n7) obj, i2);
                        }
                        return m3976W((LiveData) obj, i2);
                    }
                    return m3978U((AbstractC11870l7) obj, i2);
                }
                return m3980S((AbstractC11833j7) obj, i2);
            }
            return m3981R((AbstractC11798h7) obj, i2);
        }
        return m3977V((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30999H.mo3594K(interfaceC1491v);
        this.f30907z.mo3594K(interfaceC1491v);
        this.f30898A.mo3594K(interfaceC1491v);
        this.f30899B.mo3594K(interfaceC1491v);
        this.f30903F.mo3594K(interfaceC1491v);
        this.f31001J.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            mo3982Q((LoyaltyViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11880m0
    /* renamed from: Q */
    public void mo3982Q(LoyaltyViewModel loyaltyViewModel) {
        this.f30904G = loyaltyViewModel;
        synchronized (this) {
            this.f31002K |= 64;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11902n0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31002K != 0) {
                return true;
            }
            return this.f30999H.mo3580u() || this.f30907z.mo3580u() || this.f30898A.mo3580u() || this.f30899B.mo3580u() || this.f30903F.mo3580u() || this.f31001J.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31002K = 128L;
        }
        this.f30999H.mo3579w();
        this.f30907z.mo3579w();
        this.f30898A.mo3579w();
        this.f30899B.mo3579w();
        this.f30903F.mo3579w();
        this.f31001J.mo3579w();
        m37826E();
    }

    private C11902n0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 6, (MaterialCardView) objArr[1], (MaterialCardView) objArr[2], (AbstractC11798h7) objArr[7], (AbstractC11833j7) objArr[8], (AbstractC11909n7) objArr[9], (Button) objArr[5], (MaterialCardView) objArr[4], (MaterialCardView) objArr[3], (Space) objArr[12], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[14], (AbstractC11870l7) objArr[10]);
        this.f31002K = -1L;
        this.f30905x.setTag(null);
        this.f30906y.setTag(null);
        m37821J(this.f30907z);
        m37821J(this.f30898A);
        m37821J(this.f30899B);
        this.f30900C.setTag(null);
        this.f30901D.setTag(null);
        this.f30902E.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[6];
        this.f30999H = abstractC11917nf;
        m37821J(abstractC11917nf);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31000I = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[11];
        this.f31001J = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37821J(this.f30903F);
        m37820L(view);
        mo3579w();
    }
}
