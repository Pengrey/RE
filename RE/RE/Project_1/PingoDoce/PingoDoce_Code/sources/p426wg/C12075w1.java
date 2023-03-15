package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import p246n2.C7624a;
import p430wk.OnboardingCardQuestionViewModel;

/* renamed from: wg.w1 */
/* loaded from: classes2.dex */
public class C12075w1 extends AbstractC12059v1 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f31753E;

    /* renamed from: F */
    private static final SparseIntArray f31754F;

    /* renamed from: A */
    private final MaterialRadioButton f31755A;

    /* renamed from: B */
    private final MaterialButton f31756B;

    /* renamed from: C */
    private InterfaceC1276g f31757C;

    /* renamed from: D */
    private long f31758D;

    /* renamed from: z */
    private final ConstraintLayout f31759z;

    /* compiled from: ActivityOnboardingCardQuestionBindingImpl.java */
    /* renamed from: wg.w1$a */
    /* loaded from: classes2.dex */
    class C12076a implements InterfaceC1276g {
        C12076a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12075w1.this.f31755A.isChecked();
            OnboardingCardQuestionViewModel onboardingCardQuestionViewModel = C12075w1.this.f31702y;
            if (onboardingCardQuestionViewModel != null) {
                C1436e0 m3454Z = onboardingCardQuestionViewModel.m3454Z();
                if (m3454Z != null) {
                    m3454Z.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f31753E = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{3}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31754F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 4);
    }

    public C12075w1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31753E, f31754F));
    }

    /* renamed from: R */
    private boolean m3690R(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31758D |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3689S(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31758D |= 2;
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
            return m3689S((C1436e0) obj, i2);
        }
        return m3690R((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31701x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3688T((OnboardingCardQuestionViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m3688T(OnboardingCardQuestionViewModel onboardingCardQuestionViewModel) {
        this.f31702y = onboardingCardQuestionViewModel;
        synchronized (this) {
            this.f31758D |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        View.OnClickListener onClickListener;
        synchronized (this) {
            j = this.f31758D;
            this.f31758D = 0L;
        }
        OnboardingCardQuestionViewModel onboardingCardQuestionViewModel = this.f31702y;
        boolean z = false;
        int i = ((14 & j) > 0L ? 1 : ((14 & j) == 0L ? 0 : -1));
        if (i != 0) {
            View.OnClickListener m3456X = ((j & 12) == 0 || onboardingCardQuestionViewModel == null) ? null : onboardingCardQuestionViewModel.m3456X();
            C1436e0 m3454Z = onboardingCardQuestionViewModel != null ? onboardingCardQuestionViewModel.m3454Z() : null;
            m37818O(1, m3454Z);
            View.OnClickListener onClickListener2 = m3456X;
            z = ViewDataBinding.m37823H(m3454Z != null ? (Boolean) m3454Z.mo172f() : null);
            onClickListener = onClickListener2;
        } else {
            onClickListener = null;
        }
        if (i != 0) {
            C7624a.m17897a(this.f31755A, z);
        }
        if ((8 & j) != 0) {
            C7624a.m17896b(this.f31755A, null, this.f31757C);
        }
        if ((j & 12) != 0) {
            this.f31756B.setOnClickListener(onClickListener);
        }
        ViewDataBinding.m37808m(this.f31701x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31758D != 0) {
                return true;
            }
            return this.f31701x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31758D = 8L;
        }
        this.f31701x.mo3579w();
        m37826E();
    }

    private C12075w1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (TextView) objArr[4], (AbstractC11996rf) objArr[3]);
        this.f31757C = new C12076a();
        this.f31758D = -1L;
        m37821J(this.f31701x);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31759z = constraintLayout;
        constraintLayout.setTag(null);
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) objArr[1];
        this.f31755A = materialRadioButton;
        materialRadioButton.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[2];
        this.f31756B = materialButton;
        materialButton.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
