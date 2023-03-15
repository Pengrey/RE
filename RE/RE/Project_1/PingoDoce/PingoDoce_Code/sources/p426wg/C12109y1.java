package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p430wk.OnboardingCardTutorialViewModel;

/* renamed from: wg.y1 */
/* loaded from: classes2.dex */
public class C12109y1 extends AbstractC12093x1 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31923C;

    /* renamed from: D */
    private static final SparseIntArray f31924D;

    /* renamed from: A */
    private final ConstraintLayout f31925A;

    /* renamed from: B */
    private long f31926B;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f31923C = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{2}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31924D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.card_tutorial_title, 3);
        sparseIntArray.put(C2336R.C2338id.card_tutorial_subtitle, 4);
    }

    public C12109y1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31923C, f31924D));
    }

    /* renamed from: Q */
    private boolean m3635Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31926B |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m3635Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31838y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3634R((OnboardingCardTutorialViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m3634R(OnboardingCardTutorialViewModel onboardingCardTutorialViewModel) {
        this.f31839z = onboardingCardTutorialViewModel;
        synchronized (this) {
            this.f31926B |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31926B;
            this.f31926B = 0L;
        }
        View.OnClickListener onClickListener = null;
        OnboardingCardTutorialViewModel onboardingCardTutorialViewModel = this.f31839z;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0 && onboardingCardTutorialViewModel != null) {
            onClickListener = onboardingCardTutorialViewModel.m3435W();
        }
        if (i != 0) {
            this.f31837x.setOnClickListener(onClickListener);
        }
        ViewDataBinding.m37808m(this.f31838y);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31926B != 0) {
                return true;
            }
            return this.f31838y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31926B = 4L;
        }
        this.f31838y.mo3579w();
        m37826E();
    }

    private C12109y1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (MaterialButton) objArr[1], (TextView) objArr[4], (TextView) objArr[3], (AbstractC11996rf) objArr[2]);
        this.f31926B = -1L;
        this.f31837x.setTag(null);
        m37821J(this.f31838y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31925A = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
