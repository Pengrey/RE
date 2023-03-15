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
import p497zk.OnboardingNotificationViewModel;

/* renamed from: wg.c2 */
/* loaded from: classes2.dex */
public class C11704c2 extends AbstractC11687b2 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f29979E;

    /* renamed from: F */
    private static final SparseIntArray f29980F;

    /* renamed from: B */
    private final ConstraintLayout f29981B;

    /* renamed from: C */
    private final AbstractC12136z9 f29982C;

    /* renamed from: D */
    private long f29983D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f29979E = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image", "view_loading"}, new int[]{3, 4}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29980F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.notification_title, 5);
        sparseIntArray.put(C2336R.C2338id.notification_subtitle, 6);
    }

    public C11704c2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f29979E, f29980F));
    }

    /* renamed from: Q */
    private boolean m4449Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29983D |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4448R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29983D |= 2;
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
            return m4448R((LiveData) obj, i2);
        }
        return m4449Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29912z.mo3594K(interfaceC1491v);
        this.f29982C.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4447S((OnboardingNotificationViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m4447S(OnboardingNotificationViewModel onboardingNotificationViewModel) {
        this.f29909A = onboardingNotificationViewModel;
        synchronized (this) {
            this.f29983D |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        View.OnClickListener onClickListener;
        Boolean bool;
        synchronized (this) {
            j = this.f29983D;
            this.f29983D = 0L;
        }
        OnboardingNotificationViewModel onboardingNotificationViewModel = this.f29909A;
        int i = ((14 & j) > 0L ? 1 : ((14 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener2 = null;
        if (i != 0) {
            LiveData m20387j = onboardingNotificationViewModel != null ? onboardingNotificationViewModel.m20387j() : null;
            m37818O(1, m20387j);
            bool = m20387j != null ? (Boolean) m20387j.mo172f() : null;
            if ((j & 12) == 0 || onboardingNotificationViewModel == null) {
                onClickListener = null;
            } else {
                View.OnClickListener m29g0 = onboardingNotificationViewModel.m29g0();
                onClickListener2 = onboardingNotificationViewModel.m38X();
                onClickListener = m29g0;
            }
        } else {
            onClickListener = null;
            bool = null;
        }
        if ((j & 12) != 0) {
            this.f29910x.setOnClickListener(onClickListener2);
            this.f29911y.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            this.f29982C.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f29912z);
        ViewDataBinding.m37808m(this.f29982C);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29983D != 0) {
                return true;
            }
            return this.f29912z.mo3580u() || this.f29982C.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29983D = 8L;
        }
        this.f29912z.mo3579w();
        this.f29982C.mo3579w();
        m37826E();
    }

    private C11704c2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (MaterialButton) objArr[1], (MaterialButton) objArr[2], (TextView) objArr[6], (TextView) objArr[5], (AbstractC11996rf) objArr[3]);
        this.f29983D = -1L;
        this.f29910x.setTag(null);
        this.f29911y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29981B = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[4];
        this.f29982C = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37821J(this.f29912z);
        m37820L(view);
        mo3579w();
    }
}
