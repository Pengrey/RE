package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0868i;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import p241mi.BottomNavigationViewModel;

/* renamed from: wg.g7 */
/* loaded from: classes2.dex */
public class C11780g7 extends AbstractC11761f7 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f30398D = null;

    /* renamed from: E */
    private static final SparseIntArray f30399E = null;

    /* renamed from: A */
    private final FrameLayout f30400A;

    /* renamed from: B */
    private C11781a f30401B;

    /* renamed from: C */
    private long f30402C;

    /* compiled from: ViewBottomMenuBindingImpl.java */
    /* renamed from: wg.g7$a */
    /* loaded from: classes2.dex */
    public static class C11781a implements BottomNavigationView.InterfaceC3490c {

        /* renamed from: a */
        private BottomNavigationViewModel f30403a;

        @Override // com.google.android.material.navigation.NavigationBarView.InterfaceC3660c
        /* renamed from: a */
        public boolean mo4257a(MenuItem menuItem) {
            return this.f30403a.m18391O(menuItem);
        }

        /* renamed from: b */
        public C11781a m4256b(BottomNavigationViewModel bottomNavigationViewModel) {
            this.f30403a = bottomNavigationViewModel;
            if (bottomNavigationViewModel == null) {
                return null;
            }
            return this;
        }
    }

    public C11780g7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30398D, f30399E));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo4258R(((Boolean) obj).booleanValue());
        } else if (109 != i) {
            return false;
        } else {
            mo4259Q((BottomNavigationViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11761f7
    /* renamed from: Q */
    public void mo4259Q(BottomNavigationViewModel bottomNavigationViewModel) {
        this.f30314z = bottomNavigationViewModel;
        synchronized (this) {
            this.f30402C |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11761f7
    /* renamed from: R */
    public void mo4258R(boolean z) {
        this.f30313y = z;
        synchronized (this) {
            this.f30402C |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30402C;
            this.f30402C = 0L;
        }
        boolean z = this.f30313y;
        C11781a c11781a = null;
        BottomNavigationViewModel bottomNavigationViewModel = this.f30314z;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        int i2 = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i2 != 0 && bottomNavigationViewModel != null) {
            C11781a c11781a2 = this.f30401B;
            if (c11781a2 == null) {
                c11781a2 = new C11781a();
                this.f30401B = c11781a2;
            }
            c11781a = c11781a2.m4256b(bottomNavigationViewModel);
        }
        if (i != 0) {
            BindingAdapters.m41779l(this.f30400A, Boolean.valueOf(z), Boolean.TRUE);
        }
        if (i2 != 0) {
            this.f30312x.setOnNavigationItemSelectedListener(c11781a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30402C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30402C = 4L;
        }
        m37826E();
    }

    private C11780g7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (BottomNavigationView) objArr[1]);
        this.f30402C = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f30400A = frameLayout;
        frameLayout.setTag(null);
        this.f30312x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
