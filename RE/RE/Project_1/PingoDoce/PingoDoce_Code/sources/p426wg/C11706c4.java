package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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

/* renamed from: wg.c4 */
/* loaded from: classes2.dex */
public class C11706c4 extends AbstractC11689b4 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f29989K;

    /* renamed from: L */
    private static final SparseIntArray f29990L;

    /* renamed from: G */
    private final CoordinatorLayout f29991G;

    /* renamed from: H */
    private final TextView f29992H;

    /* renamed from: I */
    private final TextView f29993I;

    /* renamed from: J */
    private long f29994J;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(15);
        f29989K = c1263i;
        c1263i.m37795a(0, new String[]{"bottomsheet_for_take_away_checkout"}, new int[]{10}, new int[]{C2336R.layout.bottomsheet_for_take_away_checkout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29990L = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_header_AppBarLayout, 11);
        sparseIntArray.put(C2336R.C2338id.header_CollapsingToolbarLayout, 12);
        sparseIntArray.put(C2336R.C2338id.toolbar, 13);
        sparseIntArray.put(C2336R.C2338id.const_picker, 14);
    }

    public C11706c4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 15, f29989K, f29990L));
    }

    /* renamed from: Q */
    private boolean m4446Q(AbstractC11760f6 abstractC11760f6, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29994J |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4445R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29994J |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4444S(LiveData<TakeAwayProduct> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29994J |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4443T(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29994J |= 8;
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
                    return m4443T((LiveData) obj, i2);
                }
                return m4444S((LiveData) obj, i2);
            }
            return m4446Q((AbstractC11760f6) obj, i2);
        }
        return m4445R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29919x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4442U((TakeAwayProductDetailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m4442U(TakeAwayProductDetailViewModel takeAwayProductDetailViewModel) {
        this.f29918F = takeAwayProductDetailViewModel;
        synchronized (this) {
            this.f29994J |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11706c4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29994J != 0) {
                return true;
            }
            return this.f29919x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29994J = 32L;
        }
        this.f29919x.mo3579w();
        m37826E();
    }

    private C11706c4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (AbstractC11760f6) objArr[10], (TextView) objArr[3], (AppBarLayout) objArr[11], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[6], (FrameLayout) objArr[14], (CollapsingToolbarLayout) objArr[12], (ImageView) objArr[1], (TextView) objArr[5], (QuantityPickerView) objArr[8], (Toolbar) objArr[13]);
        this.f29994J = -1L;
        m37821J(this.f29919x);
        this.f29920y.setTag(null);
        this.f29921z.setTag(null);
        this.f29913A.setTag(null);
        this.f29914B.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f29991G = coordinatorLayout;
        coordinatorLayout.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f29992H = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[9];
        this.f29993I = textView2;
        textView2.setTag(null);
        this.f29915C.setTag(null);
        this.f29916D.setTag(null);
        this.f29917E.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
