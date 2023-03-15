package p426wg;

import ae.InterfaceC0131a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import p163ih.PurchasesRecentViewModel;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: wg.u6 */
/* loaded from: classes2.dex */
public class C12047u6 extends AbstractC12023t6 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f31645G;

    /* renamed from: H */
    private static final SparseIntArray f31646H;

    /* renamed from: B */
    private final ConstraintLayout f31647B;

    /* renamed from: C */
    private final AbstractC11799h8 f31648C;

    /* renamed from: D */
    private final AbstractC12136z9 f31649D;

    /* renamed from: E */
    private final AbstractC11954pd f31650E;

    /* renamed from: F */
    private long f31651F;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f31645G = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_empty", "view_loading"}, new int[]{4, 5}, new int[]{C2336R.layout.view_for_empty, C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"view_row_for_purchase_item_wrapper"}, new int[]{3}, new int[]{C2336R.layout.view_row_for_purchase_item_wrapper});
        f31646H = null;
    }

    public C12047u6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31645G, f31646H));
    }

    /* renamed from: R */
    private boolean m3721R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31651F |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3720S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31651F |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3719T(LiveData<List<Purchase>> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31651F |= 2;
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
                    return false;
                }
                return m3721R((LiveData) obj, i2);
            }
            return m3719T((LiveData) obj, i2);
        }
        return m3720S((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31650E.mo3594K(interfaceC1491v);
        this.f31648C.mo3594K(interfaceC1491v);
        this.f31649D.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (83 == i) {
            mo3722Q((InterfaceC0131a) obj);
        } else if (109 != i) {
            return false;
        } else {
            m3718U((PurchasesRecentViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12023t6
    /* renamed from: Q */
    public void mo3722Q(InterfaceC0131a<Purchase> interfaceC0131a) {
        this.f31529A = interfaceC0131a;
        synchronized (this) {
            this.f31651F |= 8;
        }
        m37781c(83);
        super.m37826E();
    }

    /* renamed from: U */
    public void m3718U(PurchasesRecentViewModel purchasesRecentViewModel) {
        this.f31532z = purchasesRecentViewModel;
        synchronized (this) {
            this.f31651F |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[ADDED_TO_REGION] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12047u6.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31651F != 0) {
                return true;
            }
            return this.f31650E.mo3580u() || this.f31648C.mo3580u() || this.f31649D.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31651F = 32L;
        }
        this.f31650E.mo3579w();
        this.f31648C.mo3579w();
        this.f31649D.mo3579w();
        m37826E();
    }

    private C12047u6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (FrameLayout) objArr[1], (MaterialButton) objArr[2]);
        this.f31651F = -1L;
        this.f31530x.setTag(null);
        this.f31531y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31647B = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11799h8 abstractC11799h8 = (AbstractC11799h8) objArr[4];
        this.f31648C = abstractC11799h8;
        m37821J(abstractC11799h8);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[5];
        this.f31649D = abstractC12136z9;
        m37821J(abstractC12136z9);
        AbstractC11954pd abstractC11954pd = (AbstractC11954pd) objArr[3];
        this.f31650E = abstractC11954pd;
        m37821J(abstractC11954pd);
        m37820L(view);
        mo3579w();
    }
}
