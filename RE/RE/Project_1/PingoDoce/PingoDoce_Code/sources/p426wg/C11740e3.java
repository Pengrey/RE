package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import pt.pingodoce.app.presentation.common.search.SearchViewModel;

/* renamed from: wg.e3 */
/* loaded from: classes2.dex */
public class C11740e3 extends AbstractC11723d3 {

    /* renamed from: P */
    private static final ViewDataBinding.C1263i f30201P;

    /* renamed from: Q */
    private static final SparseIntArray f30202Q;

    /* renamed from: K */
    private final CoordinatorLayout f30203K;

    /* renamed from: L */
    private final ConstraintLayout f30204L;

    /* renamed from: M */
    private final AbstractC11695ba f30205M;

    /* renamed from: N */
    private final AbstractC12100x8 f30206N;

    /* renamed from: O */
    private long f30207O;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(19);
        f30201P = c1263i;
        c1263i.m37795a(6, new String[]{"view_manual_product", "view_loading_small", "view_search_no_product", "view_for_no_connection"}, new int[]{10, 11, 12, 13}, new int[]{C2336R.layout.view_manual_product, C2336R.layout.view_loading_small, C2336R.layout.view_search_no_product, C2336R.layout.view_for_no_connection});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30202Q = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 14);
        sparseIntArray.put(C2336R.C2338id.header_CollapsingToolbarLayout, 15);
        sparseIntArray.put(C2336R.C2338id.search_filters_Constraint_Layout, 16);
        sparseIntArray.put(C2336R.C2338id.toolbar, 17);
        sparseIntArray.put(C2336R.C2338id.input_SearchView, 18);
    }

    public C11740e3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 19, f30201P, f30202Q));
    }

    /* renamed from: Q */
    private boolean m4391Q(AbstractC11764fa abstractC11764fa, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4390R(AbstractC11806hf abstractC11806hf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4389S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4388T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4387U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4386V(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4385W(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4384X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4383Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4382Z(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 8192;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m4381a0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m4380b0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m4379c0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m4378d0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30207O |= 1024;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return m4387U((LiveData) obj, i2);
            case 1:
                return m4390R((AbstractC11806hf) obj, i2);
            case 2:
                return m4386V((LiveData) obj, i2);
            case 3:
                return m4383Y((LiveData) obj, i2);
            case 4:
                return m4379c0((LiveData) obj, i2);
            case 5:
                return m4385W((LiveData) obj, i2);
            case 6:
                return m4380b0((C1436e0) obj, i2);
            case 7:
                return m4384X((LiveData) obj, i2);
            case 8:
                return m4381a0((LiveData) obj, i2);
            case 9:
                return m4389S((LiveData) obj, i2);
            case 10:
                return m4378d0((LiveData) obj, i2);
            case 11:
                return m4388T((LiveData) obj, i2);
            case 12:
                return m4391Q((AbstractC11764fa) obj, i2);
            case 13:
                return m4382Z((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30070D.mo3594K(interfaceC1491v);
        this.f30205M.mo3594K(interfaceC1491v);
        this.f30071E.mo3594K(interfaceC1491v);
        this.f30206N.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4377e0((SearchViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public void m4377e0(SearchViewModel searchViewModel) {
        this.f30076J = searchViewModel;
        synchronized (this) {
            this.f30207O |= 16384;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017a  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11740e3.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30207O != 0) {
                return true;
            }
            return this.f30070D.mo3580u() || this.f30205M.mo3580u() || this.f30071E.mo3580u() || this.f30206N.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30207O = 32768L;
        }
        this.f30070D.mo3579w();
        this.f30205M.mo3579w();
        this.f30071E.mo3579w();
        this.f30206N.mo3579w();
        m37826E();
    }

    private C11740e3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 14, (RecyclerView) objArr[4], (RecyclerView) objArr[8], (TextView) objArr[7], (AppBarLayout) objArr[14], (CollapsingToolbarLayout) objArr[15], (ImageButton) objArr[5], (SearchView) objArr[18], (AbstractC11764fa) objArr[10], (AbstractC11806hf) objArr[12], (ImageButton) objArr[3], (ImageView) objArr[2], (ConstraintLayout) objArr[16], (TextView) objArr[1], (PlaceHolderRecyclerView) objArr[9], (Toolbar) objArr[17]);
        this.f30207O = -1L;
        this.f30077x.setTag(null);
        this.f30078y.setTag(null);
        this.f30079z.setTag(null);
        this.f30068B.setTag(null);
        m37821J(this.f30070D);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30203K = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[6];
        this.f30204L = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[11];
        this.f30205M = abstractC11695ba;
        m37821J(abstractC11695ba);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[13];
        this.f30206N = abstractC12100x8;
        m37821J(abstractC12100x8);
        m37821J(this.f30071E);
        this.f30072F.setTag(null);
        this.f30073G.setTag(null);
        this.f30074H.setTag(null);
        this.f30075I.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
