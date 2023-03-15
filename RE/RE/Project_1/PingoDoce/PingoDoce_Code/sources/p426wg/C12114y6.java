package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.gms.maps.MapView;
import ki.NoConnectionViewModel;
import p186jj.AbstractC6515g;

/* renamed from: wg.y6 */
/* loaded from: classes2.dex */
public class C12114y6 extends AbstractC12098x6 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f31955E;

    /* renamed from: F */
    private static final SparseIntArray f31956F;

    /* renamed from: A */
    private final FrameLayout f31957A;

    /* renamed from: B */
    private final AbstractC12136z9 f31958B;

    /* renamed from: C */
    private final CoordinatorLayout f31959C;

    /* renamed from: D */
    private long f31960D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f31955E = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{3}, new int[]{C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"bottomsheet_for_store_map"}, new int[]{2}, new int[]{C2336R.layout.bottomsheet_for_store_map});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31956F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.storeMap_MapView, 4);
    }

    public C12114y6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31955E, f31956F));
    }

    /* renamed from: Q */
    private boolean m3612Q(AbstractC11726d6 abstractC11726d6, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31960D |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3611R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31960D |= 1;
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
            return m3612Q((AbstractC11726d6) obj, i2);
        }
        return m3611R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31867x.mo3594K(interfaceC1491v);
        this.f31958B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3610S((AbstractC6515g) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m3610S(AbstractC6515g abstractC6515g) {
        this.f31869z = abstractC6515g;
        synchronized (this) {
            this.f31960D |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31960D;
            this.f31960D = 0L;
        }
        NoConnectionViewModel noConnectionViewModel = this.f31869z;
        int i = ((j & 13) > 0L ? 1 : ((j & 13) == 0L ? 0 : -1));
        Boolean bool = null;
        if (i != 0) {
            LiveData m20387j = noConnectionViewModel != null ? noConnectionViewModel.m20387j() : null;
            m37818O(0, m20387j);
            if (m20387j != null) {
                bool = (Boolean) m20387j.mo172f();
            }
        }
        if (i != 0) {
            this.f31958B.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f31867x);
        ViewDataBinding.m37808m(this.f31958B);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31960D != 0) {
                return true;
            }
            return this.f31867x.mo3580u() || this.f31958B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31960D = 8L;
        }
        this.f31867x.mo3579w();
        this.f31958B.mo3579w();
        m37826E();
    }

    private C12114y6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (AbstractC11726d6) objArr[2], (MapView) objArr[4]);
        this.f31960D = -1L;
        m37821J(this.f31867x);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31957A = frameLayout;
        frameLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[3];
        this.f31958B = abstractC12136z9;
        m37821J(abstractC12136z9);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[1];
        this.f31959C = coordinatorLayout;
        coordinatorLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
