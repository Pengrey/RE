package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView;
import com.google.android.material.tabs.TabLayout;
import p163ih.PurchasesChartViewModel;

/* renamed from: wg.s6 */
/* loaded from: classes2.dex */
public class C12006s6 extends AbstractC11987r6 {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f31450J;

    /* renamed from: K */
    private static final SparseIntArray f31451K;

    /* renamed from: F */
    private final ConstraintLayout f31452F;

    /* renamed from: G */
    private final AbstractC11695ba f31453G;

    /* renamed from: H */
    private final View f31454H;

    /* renamed from: I */
    private long f31455I;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(11);
        f31450J = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_empty", "view_loading_small"}, new int[]{7, 8}, new int[]{C2336R.layout.view_for_empty, C2336R.layout.view_loading_small});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31451K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_saved_lbl, 9);
        sparseIntArray.put(C2336R.C2338id.history_AAChartView, 10);
    }

    public C12006s6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f31450J, f31451K));
    }

    /* renamed from: Q */
    private boolean m3790Q(AbstractC11799h8 abstractC11799h8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31455I |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3789R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31455I |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3788S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31455I |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3787T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31455I |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3786U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31455I |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3785V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31455I |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3784W(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31455I |= 16;
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
                return m3785V((LiveData) obj, i2);
            case 1:
                return m3787T((LiveData) obj, i2);
            case 2:
                return m3786U((LiveData) obj, i2);
            case 3:
                return m3788S((LiveData) obj, i2);
            case 4:
                return m3784W((LiveData) obj, i2);
            case 5:
                return m3789R((LiveData) obj, i2);
            case 6:
                return m3790Q((AbstractC11799h8) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31377x.mo3594K(interfaceC1491v);
        this.f31453G.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3783X((PurchasesChartViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public void m3783X(PurchasesChartViewModel purchasesChartViewModel) {
        this.f31376E = purchasesChartViewModel;
        synchronized (this) {
            this.f31455I |= 128;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12006s6.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31455I != 0) {
                return true;
            }
            return this.f31377x.mo3580u() || this.f31453G.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31455I = 256L;
        }
        this.f31377x.mo3579w();
        this.f31453G.mo3579w();
        m37826E();
    }

    private C12006s6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 7, (AbstractC11799h8) objArr[7], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[9], (TabLayout) objArr[3], (Group) objArr[1], (AAChartView) objArr[10]);
        this.f31455I = -1L;
        m37821J(this.f31377x);
        this.f31378y.setTag(null);
        this.f31379z.setTag(null);
        this.f31372A.setTag(null);
        this.f31373B.setTag(null);
        this.f31374C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31452F = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[8];
        this.f31453G = abstractC11695ba;
        m37821J(abstractC11695ba);
        View view2 = (View) objArr[4];
        this.f31454H = view2;
        view2.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
