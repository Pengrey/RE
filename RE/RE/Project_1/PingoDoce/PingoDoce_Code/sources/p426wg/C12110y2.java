package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import il.PurchaseListViewModel;

/* renamed from: wg.y2 */
/* loaded from: classes2.dex */
public class C12110y2 extends AbstractC12094x2 {

    /* renamed from: R */
    private static final ViewDataBinding.C1263i f31927R;

    /* renamed from: S */
    private static final SparseIntArray f31928S;

    /* renamed from: K */
    private final AbstractC11917nf f31929K;

    /* renamed from: L */
    private final ConstraintLayout f31930L;

    /* renamed from: M */
    private final ConstraintLayout f31931M;

    /* renamed from: N */
    private final AbstractC11799h8 f31932N;

    /* renamed from: O */
    private final AbstractC11695ba f31933O;

    /* renamed from: P */
    private final View f31934P;

    /* renamed from: Q */
    private long f31935Q;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(18);
        f31927R = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{13}, new int[]{C2336R.layout.view_toolbar});
        c1263i.m37795a(1, new String[]{"view_for_empty", "view_loading_small"}, new int[]{14, 15}, new int[]{C2336R.layout.view_for_empty, C2336R.layout.view_loading_small});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31928S = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.scroll, 16);
        sparseIntArray.put(C2336R.C2338id.purchase_PlaceHolderRecyclerView, 17);
    }

    public C12110y2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 18, f31927R, f31928S));
    }

    /* renamed from: Q */
    private boolean m3633Q(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31935Q |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3632R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31935Q |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3631S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31935Q |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3630T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31935Q |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3629U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31935Q |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3628V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31935Q |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3627W(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31935Q |= 64;
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
                return m3629U((LiveData) obj, i2);
            case 1:
                return m3631S((LiveData) obj, i2);
            case 2:
                return m3632R((LiveData) obj, i2);
            case 3:
                return m3633Q((LiveData) obj, i2);
            case 4:
                return m3630T((LiveData) obj, i2);
            case 5:
                return m3628V((LiveData) obj, i2);
            case 6:
                return m3627W((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31929K.mo3594K(interfaceC1491v);
        this.f31932N.mo3594K(interfaceC1491v);
        this.f31933O.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3626X((PurchaseListViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public void m3626X(PurchaseListViewModel purchaseListViewModel) {
        this.f31849J = purchaseListViewModel;
        synchronized (this) {
            this.f31935Q |= 128;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12110y2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31935Q != 0) {
                return true;
            }
            return this.f31929K.mo3580u() || this.f31932N.mo3580u() || this.f31933O.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31935Q = 256L;
        }
        this.f31929K.mo3579w();
        this.f31932N.mo3579w();
        this.f31933O.mo3579w();
        m37826E();
    }

    private C12110y2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 7, (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[3], (TextView) objArr[4], (MaterialButton) objArr[12], (TabLayout) objArr[5], (Group) objArr[2], (AAChartView) objArr[7], (PlaceHolderRecyclerView) objArr[17], (NestedScrollView) objArr[16], (Space) objArr[11], (TextView) objArr[10]);
        this.f31935Q = -1L;
        this.f31850x.setTag(null);
        this.f31851y.setTag(null);
        this.f31852z.setTag(null);
        this.f31840A.setTag(null);
        this.f31841B.setTag(null);
        this.f31842C.setTag(null);
        this.f31843D.setTag(null);
        this.f31844E.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[13];
        this.f31929K = abstractC11917nf;
        m37821J(abstractC11917nf);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31930L = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.f31931M = constraintLayout2;
        constraintLayout2.setTag(null);
        AbstractC11799h8 abstractC11799h8 = (AbstractC11799h8) objArr[14];
        this.f31932N = abstractC11799h8;
        m37821J(abstractC11799h8);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[15];
        this.f31933O = abstractC11695ba;
        m37821J(abstractC11695ba);
        View view2 = (View) objArr[6];
        this.f31934P = view2;
        view2.setTag(null);
        this.f31847H.setTag(null);
        this.f31848I.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
