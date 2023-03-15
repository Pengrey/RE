package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import cm.TakeAwayProductDetailViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: wg.e4 */
/* loaded from: classes2.dex */
public class C11741e4 extends AbstractC11724d4 {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f30208H;

    /* renamed from: I */
    private static final SparseIntArray f30209I;

    /* renamed from: F */
    private final CoordinatorLayout f30210F;

    /* renamed from: G */
    private long f30211G;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(11);
        f30208H = c1263i;
        c1263i.m37795a(0, new String[]{"bottomsheet_for_take_away_checkout"}, new int[]{7}, new int[]{C2336R.layout.bottomsheet_for_take_away_checkout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30209I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_header_AppBarLayout, 8);
        sparseIntArray.put(C2336R.C2338id.header_CollapsingToolbarLayout, 9);
        sparseIntArray.put(C2336R.C2338id.toolbar, 10);
    }

    public C11741e4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f30208H, f30209I));
    }

    /* renamed from: Q */
    private boolean m4376Q(AbstractC11760f6 abstractC11760f6, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30211G |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4375R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30211G |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4374S(LiveData<TakeAwayProduct> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30211G |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4373T(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30211G |= 8;
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
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return m4373T((LiveData) obj, i2);
                }
                return m4374S((LiveData) obj, i2);
            }
            return m4376Q((AbstractC11760f6) obj, i2);
        }
        return m4375R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30085x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4372U((TakeAwayProductDetailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m4372U(TakeAwayProductDetailViewModel takeAwayProductDetailViewModel) {
        this.f30084E = takeAwayProductDetailViewModel;
        synchronized (this) {
            this.f30211G |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11741e4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30211G != 0) {
                return true;
            }
            return this.f30085x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30211G = 32L;
        }
        this.f30085x.mo3579w();
        m37826E();
    }

    private C11741e4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (AbstractC11760f6) objArr[7], (ImageView) objArr[4], (AppBarLayout) objArr[8], (ImageView) objArr[1], (TextView) objArr[2], (TextView) objArr[5], (TextView) objArr[3], (CollapsingToolbarLayout) objArr[9], (QuantityPickerView) objArr[6], (Toolbar) objArr[10]);
        this.f30211G = -1L;
        m37821J(this.f30085x);
        this.f30086y.setTag(null);
        this.f30087z.setTag(null);
        this.f30080A.setTag(null);
        this.f30081B.setTag(null);
        this.f30082C.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30210F = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.f30083D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
