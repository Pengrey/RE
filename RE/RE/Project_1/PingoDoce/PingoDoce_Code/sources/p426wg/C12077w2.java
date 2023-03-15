package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import p146hl.PurchaseDetailViewModel;

/* renamed from: wg.w2 */
/* loaded from: classes2.dex */
public class C12077w2 extends AbstractC12060v2 {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f31761J;

    /* renamed from: K */
    private static final SparseIntArray f31762K;

    /* renamed from: D */
    private final AbstractC11917nf f31763D;

    /* renamed from: E */
    private final CoordinatorLayout f31764E;

    /* renamed from: F */
    private final ConstraintLayout f31765F;

    /* renamed from: G */
    private final AbstractC11799h8 f31766G;

    /* renamed from: H */
    private final AbstractC12136z9 f31767H;

    /* renamed from: I */
    private long f31768I;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(16);
        f31761J = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{6}, new int[]{C2336R.layout.view_toolbar});
        c1263i.m37795a(1, new String[]{"view_for_empty", "view_loading"}, new int[]{7, 8}, new int[]{C2336R.layout.view_for_empty, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31762K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.purchase_products_RecyclerView, 9);
        sparseIntArray.put(C2336R.C2338id.purchase_details, 10);
        sparseIntArray.put(C2336R.C2338id.const_purchase_details, 11);
        sparseIntArray.put(C2336R.C2338id.const_transaction, 12);
        sparseIntArray.put(C2336R.C2338id.const_id_operator, 13);
        sparseIntArray.put(C2336R.C2338id.const_id_pos, 14);
        sparseIntArray.put(C2336R.C2338id.const_store_id, 15);
    }

    public C12077w2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 16, f31761J, f31762K));
    }

    /* renamed from: Q */
    private boolean m3687Q(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31768I |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3686R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31768I |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3685S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31768I |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3684T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31768I |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3683U(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31768I |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3682V(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31768I |= 16;
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
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            return m3686R((LiveData) obj, i2);
                        }
                        return m3682V((LiveData) obj, i2);
                    }
                    return m3683U((LiveData) obj, i2);
                }
                return m3687Q((LiveData) obj, i2);
            }
            return m3685S((LiveData) obj, i2);
        }
        return m3684T((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31763D.mo3594K(interfaceC1491v);
        this.f31766G.mo3594K(interfaceC1491v);
        this.f31767H.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3681W((PurchaseDetailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public void m3681W(PurchaseDetailViewModel purchaseDetailViewModel) {
        this.f31705C = purchaseDetailViewModel;
        synchronized (this) {
            this.f31768I |= 64;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12077w2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31768I != 0) {
                return true;
            }
            return this.f31763D.mo3580u() || this.f31766G.mo3580u() || this.f31767H.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31768I = 128L;
        }
        this.f31763D.mo3579w();
        this.f31766G.mo3579w();
        this.f31767H.mo3579w();
        m37826E();
    }

    private C12077w2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 6, (TextView) objArr[13], (TextView) objArr[3], (TextView) objArr[14], (TextView) objArr[4], (TextView) objArr[11], (TextView) objArr[15], (TextView) objArr[5], (TextView) objArr[12], (TextView) objArr[2], (ConstraintLayout) objArr[10], (RecyclerView) objArr[9]);
        this.f31768I = -1L;
        this.f31706x.setTag(null);
        this.f31707y.setTag(null);
        this.f31708z.setTag(null);
        this.f31703A.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[6];
        this.f31763D = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f31764E = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31765F = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11799h8 abstractC11799h8 = (AbstractC11799h8) objArr[7];
        this.f31766G = abstractC11799h8;
        m37821J(abstractC11799h8);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[8];
        this.f31767H = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37820L(view);
        mo3579w();
    }
}
