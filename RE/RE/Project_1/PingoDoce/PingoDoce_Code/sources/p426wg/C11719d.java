package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import p111g.C5586a;
import p241mi.BottomNavigationViewModel;
import pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.AnonymousSessionTakeAwayLandingViewModel;

/* renamed from: wg.d */
/* loaded from: classes2.dex */
public class C11719d extends AbstractC11701c {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30047F;

    /* renamed from: G */
    private static final SparseIntArray f30048G;

    /* renamed from: A */
    private final CoordinatorLayout f30049A;

    /* renamed from: B */
    private final ConstraintLayout f30050B;

    /* renamed from: C */
    private final FrameLayout f30051C;

    /* renamed from: D */
    private final AbstractC11871l8 f30052D;

    /* renamed from: E */
    private long f30053E;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f30047F = c1263i;
        c1263i.m37795a(1, new String[]{"view_bottom_menu"}, new int[]{4}, new int[]{C2336R.layout.view_bottom_menu});
        c1263i.m37795a(2, new String[]{"view_for_guest_landing"}, new int[]{3}, new int[]{C2336R.layout.view_for_guest_landing});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30048G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_account_lbl, 5);
    }

    public C11719d(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30047F, f30048G));
    }

    /* renamed from: R */
    private boolean m4410R(AbstractC11761f7 abstractC11761f7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30053E |= 1;
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
        return m4410R((AbstractC11761f7) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30052D.mo3594K(interfaceC1491v);
        this.f29972x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (74 == i) {
            mo4411Q((BottomNavigationViewModel) obj);
        } else if (109 != i) {
            return false;
        } else {
            m4409S((AnonymousSessionTakeAwayLandingViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11701c
    /* renamed from: Q */
    public void mo4411Q(BottomNavigationViewModel bottomNavigationViewModel) {
        this.f29974z = bottomNavigationViewModel;
        synchronized (this) {
            this.f30053E |= 2;
        }
        m37781c(74);
        super.m37826E();
    }

    /* renamed from: S */
    public void m4409S(AnonymousSessionTakeAwayLandingViewModel anonymousSessionTakeAwayLandingViewModel) {
        this.f29973y = anonymousSessionTakeAwayLandingViewModel;
        synchronized (this) {
            this.f30053E |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30053E;
            this.f30053E = 0L;
        }
        BottomNavigationViewModel bottomNavigationViewModel = this.f29974z;
        View.OnClickListener onClickListener = null;
        AnonymousSessionTakeAwayLandingViewModel anonymousSessionTakeAwayLandingViewModel = this.f29973y;
        int i = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        int i2 = ((12 & j) > 0L ? 1 : ((12 & j) == 0L ? 0 : -1));
        if (i2 != 0 && anonymousSessionTakeAwayLandingViewModel != null) {
            onClickListener = anonymousSessionTakeAwayLandingViewModel.m10872N();
        }
        if (i != 0) {
            this.f29972x.mo4259Q(bottomNavigationViewModel);
        }
        if ((j & 8) != 0) {
            this.f29972x.mo4258R(true);
            this.f30052D.mo4005Q(false);
            this.f30052D.mo4004R(C5586a.m23699b(m37802s().getContext(), C2336R.C2337drawable.ic_takeaway_landing));
            this.f30052D.mo4002T(true);
        }
        if (i2 != 0) {
            this.f30052D.mo4003S(onClickListener);
        }
        ViewDataBinding.m37808m(this.f30052D);
        ViewDataBinding.m37808m(this.f29972x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30053E != 0) {
                return true;
            }
            return this.f30052D.mo3580u() || this.f29972x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30053E = 8L;
        }
        this.f30052D.mo3579w();
        this.f29972x.mo3579w();
        m37826E();
    }

    private C11719d(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (AbstractC11761f7) objArr[4], (TextView) objArr[5]);
        this.f30053E = -1L;
        m37821J(this.f29972x);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30049A = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30050B = constraintLayout;
        constraintLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[2];
        this.f30051C = frameLayout;
        frameLayout.setTag(null);
        AbstractC11871l8 abstractC11871l8 = (AbstractC11871l8) objArr[3];
        this.f30052D = abstractC11871l8;
        m37821J(abstractC11871l8);
        m37820L(view);
        mo3579w();
    }
}
