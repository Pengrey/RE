package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p246n2.C7629e;
import p430wk.OnboardingOtherUserCardTutorialViewModel;

/* renamed from: wg.e2 */
/* loaded from: classes2.dex */
public class C11739e2 extends AbstractC11722d2 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f30197D;

    /* renamed from: E */
    private static final SparseIntArray f30198E;

    /* renamed from: B */
    private final ConstraintLayout f30199B;

    /* renamed from: C */
    private long f30200C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f30197D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{3}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30198E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.tv_other_user_card_tutorial_subtitle, 4);
    }

    public C11739e2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30197D, f30198E));
    }

    /* renamed from: Q */
    private boolean m4394Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30200C |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4393R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30200C |= 2;
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
                return false;
            }
            return m4393R((LiveData) obj, i2);
        }
        return m4394Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30065y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4392S((OnboardingOtherUserCardTutorialViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m4392S(OnboardingOtherUserCardTutorialViewModel onboardingOtherUserCardTutorialViewModel) {
        this.f30063A = onboardingOtherUserCardTutorialViewModel;
        synchronized (this) {
            this.f30200C |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f30200C;
            this.f30200C = 0L;
        }
        OnboardingOtherUserCardTutorialViewModel onboardingOtherUserCardTutorialViewModel = this.f30063A;
        int i = ((14 & j) > 0L ? 1 : ((14 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener = null;
        if (i != 0) {
            View.OnClickListener m3421Z = ((j & 12) == 0 || onboardingOtherUserCardTutorialViewModel == null) ? null : onboardingOtherUserCardTutorialViewModel.m3421Z();
            LiveData m3423X = onboardingOtherUserCardTutorialViewModel != null ? onboardingOtherUserCardTutorialViewModel.m3423X() : null;
            m37818O(1, m3423X);
            str = String.format(this.f30066z.getResources().getString(C2336R.string.lbl_other_user_card_tutorial_title), m3423X != null ? (String) m3423X.mo172f() : null);
            onClickListener = m3421Z;
        } else {
            str = null;
        }
        if ((j & 12) != 0) {
            this.f30064x.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            C7629e.m17885g(this.f30066z, str);
        }
        ViewDataBinding.m37808m(this.f30065y);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30200C != 0) {
                return true;
            }
            return this.f30065y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30200C = 8L;
        }
        this.f30065y.mo3579w();
        m37826E();
    }

    private C11739e2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (MaterialButton) objArr[2], (AbstractC11996rf) objArr[3], (TextView) objArr[4], (TextView) objArr[1]);
        this.f30200C = -1L;
        this.f30064x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30199B = constraintLayout;
        constraintLayout.setTag(null);
        m37821J(this.f30065y);
        this.f30066z.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
