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
import p430wk.OnboardingOwnerInV2ViewModel;

/* renamed from: wg.a2 */
/* loaded from: classes2.dex */
public class C11669a2 extends AbstractC12128z1 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f29822D;

    /* renamed from: E */
    private static final SparseIntArray f29823E;

    /* renamed from: B */
    private final ConstraintLayout f29824B;

    /* renamed from: C */
    private long f29825C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f29822D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{3}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29823E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.owner_in_v2_title, 4);
        sparseIntArray.put(C2336R.C2338id.owner_in_v2_desc, 5);
    }

    public C11669a2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f29822D, f29823E));
    }

    /* renamed from: Q */
    private boolean m4514Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29825C |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4513R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29825C |= 2;
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
            return m4513R((LiveData) obj, i2);
        }
        return m4514Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f32017z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4512S((OnboardingOwnerInV2ViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m4512S(OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel) {
        this.f32014A = onboardingOwnerInV2ViewModel;
        synchronized (this) {
            this.f29825C |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        synchronized (this) {
            j = this.f29825C;
            this.f29825C = 0L;
        }
        OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel = this.f32014A;
        int i = ((14 & j) > 0L ? 1 : ((14 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener3 = null;
        if (i != 0) {
            if ((j & 12) == 0 || onboardingOwnerInV2ViewModel == null) {
                onClickListener = null;
                onClickListener2 = null;
            } else {
                onClickListener = onboardingOwnerInV2ViewModel.m3471Z();
                onClickListener2 = onboardingOwnerInV2ViewModel.m3469b0();
            }
            LiveData m3472Y = onboardingOwnerInV2ViewModel != null ? onboardingOwnerInV2ViewModel.m3472Y() : null;
            m37818O(1, m3472Y);
            str = m3472Y != null ? (String) m3472Y.mo172f() : null;
            onClickListener3 = onClickListener2;
        } else {
            str = null;
            onClickListener = null;
        }
        if ((j & 12) != 0) {
            this.f32015x.setOnClickListener(onClickListener3);
            this.f32016y.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            C7629e.m17885g(this.f32016y, str);
        }
        ViewDataBinding.m37808m(this.f32017z);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29825C != 0) {
                return true;
            }
            return this.f32017z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29825C = 8L;
        }
        this.f32017z.mo3579w();
        m37826E();
    }

    private C11669a2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (MaterialButton) objArr[1], (MaterialButton) objArr[2], (AbstractC11996rf) objArr[3], (TextView) objArr[5], (TextView) objArr[4]);
        this.f29825C = -1L;
        this.f32015x.setTag(null);
        this.f32016y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29824B = constraintLayout;
        constraintLayout.setTag(null);
        m37821J(this.f32017z);
        m37820L(view);
        mo3579w();
    }
}
