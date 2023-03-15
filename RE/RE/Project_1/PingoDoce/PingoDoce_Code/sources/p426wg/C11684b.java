package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;
import p111g.C5586a;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountViewModel;

/* renamed from: wg.b */
/* loaded from: classes2.dex */
public class C11684b extends AbstractC11666a {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f29895D;

    /* renamed from: E */
    private static final SparseIntArray f29896E;

    /* renamed from: A */
    private final ConstraintLayout f29897A;

    /* renamed from: B */
    private final AbstractC11871l8 f29898B;

    /* renamed from: C */
    private long f29899C;

    /* renamed from: z */
    private final CoordinatorLayout f29900z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f29895D = c1263i;
        c1263i.m37795a(1, new String[]{"view_for_guest_landing"}, new int[]{3}, new int[]{C2336R.layout.view_for_guest_landing});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29896E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 4);
        sparseIntArray.put(C2336R.C2338id.toolbar, 5);
        sparseIntArray.put(C2336R.C2338id.const_account_lbl, 6);
    }

    public C11684b(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f29895D, f29896E));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29898B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4472Q((AnonymousAccountViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m4472Q(AnonymousAccountViewModel anonymousAccountViewModel) {
        this.f29808y = anonymousAccountViewModel;
        synchronized (this) {
            this.f29899C |= 1;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f29899C;
            this.f29899C = 0L;
        }
        View.OnClickListener onClickListener = null;
        AnonymousAccountViewModel anonymousAccountViewModel = this.f29808y;
        int i = ((3 & j) > 0L ? 1 : ((3 & j) == 0L ? 0 : -1));
        if (i != 0 && anonymousAccountViewModel != null) {
            onClickListener = anonymousAccountViewModel.m13631M();
        }
        if ((j & 2) != 0) {
            ImageView imageView = this.f29807x;
            BindingAdapters.m41781j(imageView, null, C5586a.m23699b(imageView.getContext(), C2336R.C2337drawable.ic_avatar_small), null, null, null);
            this.f29898B.mo4005Q(true);
            this.f29898B.mo4002T(true);
            this.f29898B.mo4004R(C5586a.m23699b(m37802s().getContext(), C2336R.C2337drawable.ic_go_to_store));
        }
        if (i != 0) {
            this.f29898B.mo4003S(onClickListener);
        }
        ViewDataBinding.m37808m(this.f29898B);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29899C != 0) {
                return true;
            }
            return this.f29898B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29899C = 2L;
        }
        this.f29898B.mo3579w();
        m37826E();
    }

    private C11684b(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[6], (ImageView) objArr[2], (AppBarLayout) objArr[4], (Toolbar) objArr[5]);
        this.f29899C = -1L;
        this.f29807x.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f29900z = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f29897A = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11871l8 abstractC11871l8 = (AbstractC11871l8) objArr[3];
        this.f29898B = abstractC11871l8;
        m37821J(abstractC11871l8);
        m37820L(view);
        mo3579w();
    }
}
