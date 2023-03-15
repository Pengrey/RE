package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import p428wi.LoyaltyCardInvitesViewModel;

/* renamed from: wg.u0 */
/* loaded from: classes2.dex */
public class C12033u0 extends AbstractC12017t0 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f31573F;

    /* renamed from: G */
    private static final SparseIntArray f31574G;

    /* renamed from: A */
    private final CoordinatorLayout f31575A;

    /* renamed from: B */
    private final AbstractC12100x8 f31576B;

    /* renamed from: C */
    private final AbstractC11799h8 f31577C;

    /* renamed from: D */
    private final AbstractC12136z9 f31578D;

    /* renamed from: E */
    private long f31579E;

    /* renamed from: z */
    private final AbstractC11917nf f31580z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f31573F = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_for_no_connection", "view_for_empty", "view_loading"}, new int[]{1, 2, 3, 4}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_for_no_connection, C2336R.layout.view_for_empty, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31574G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.invites_PlaceHolderRecyclerView, 5);
    }

    public C12033u0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31573F, f31574G));
    }

    /* renamed from: Q */
    private boolean m3763Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31579E |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3762R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31579E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3761S(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31579E |= 2;
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
                return m3763Q((LiveData) obj, i2);
            }
            return m3761S((C1436e0) obj, i2);
        }
        return m3762R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31580z.mo3594K(interfaceC1491v);
        this.f31576B.mo3594K(interfaceC1491v);
        this.f31577C.mo3594K(interfaceC1491v);
        this.f31578D.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3760T((LoyaltyCardInvitesViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m3760T(LoyaltyCardInvitesViewModel loyaltyCardInvitesViewModel) {
        this.f31502y = loyaltyCardInvitesViewModel;
        synchronized (this) {
            this.f31579E |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12033u0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31579E != 0) {
                return true;
            }
            return this.f31580z.mo3580u() || this.f31576B.mo3580u() || this.f31577C.mo3580u() || this.f31578D.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31579E = 16L;
        }
        this.f31580z.mo3579w();
        this.f31576B.mo3579w();
        this.f31577C.mo3579w();
        this.f31578D.mo3579w();
        m37826E();
    }

    private C12033u0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (PlaceHolderRecyclerView) objArr[5]);
        this.f31579E = -1L;
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[1];
        this.f31580z = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f31575A = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[2];
        this.f31576B = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC11799h8 abstractC11799h8 = (AbstractC11799h8) objArr[3];
        this.f31577C = abstractC11799h8;
        m37821J(abstractC11799h8);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[4];
        this.f31578D = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37820L(view);
        mo3579w();
    }
}
