package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.google.android.material.button.MaterialButton;
import p086ei.BenefitsViewModel;

/* renamed from: wg.i5 */
/* loaded from: classes2.dex */
public class C11814i5 extends AbstractC11796h5 {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f30555J;

    /* renamed from: K */
    private static final SparseIntArray f30556K;

    /* renamed from: B */
    private final ConstraintLayout f30557B;

    /* renamed from: C */
    private final CoordinatorLayout f30558C;

    /* renamed from: D */
    private final AbstractC12100x8 f30559D;

    /* renamed from: E */
    private final AbstractC12136z9 f30560E;

    /* renamed from: F */
    private final AbstractC11801ha f30561F;

    /* renamed from: G */
    private final LinearLayout f30562G;

    /* renamed from: H */
    private final TextView f30563H;

    /* renamed from: I */
    private long f30564I;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(13);
        f30555J = c1263i;
        c1263i.m37795a(1, new String[]{"view_for_no_connection", "view_loading", "view_no_benefits"}, new int[]{7, 8, 9}, new int[]{C2336R.layout.view_for_no_connection, C2336R.layout.view_loading, C2336R.layout.view_no_benefits});
        c1263i.m37795a(2, new String[]{"view_toolbar"}, new int[]{6}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30556K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.benefits_PlaceHolderRecyclerView, 10);
        sparseIntArray.put(C2336R.C2338id.bottom_ConstraintLayout, 11);
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 12);
    }

    public C11814i5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 13, f30555J, f30556K));
    }

    /* renamed from: Q */
    private boolean m4202Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30564I |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4201R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30564I |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4200S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30564I |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4199T(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30564I |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4198U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30564I |= 8;
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
                            return false;
                        }
                        return m4202Q((AbstractC11917nf) obj, i2);
                    }
                    return m4198U((LiveData) obj, i2);
                }
                return m4200S((LiveData) obj, i2);
            }
            return m4199T((C1436e0) obj, i2);
        }
        return m4201R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30455z.mo3594K(interfaceC1491v);
        this.f30559D.mo3594K(interfaceC1491v);
        this.f30560E.mo3594K(interfaceC1491v);
        this.f30561F.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4197V((BenefitsViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public void m4197V(BenefitsViewModel benefitsViewModel) {
        this.f30452A = benefitsViewModel;
        synchronized (this) {
            this.f30564I |= 32;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11814i5.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30564I != 0) {
                return true;
            }
            return this.f30455z.mo3580u() || this.f30559D.mo3580u() || this.f30560E.mo3580u() || this.f30561F.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30564I = 64L;
        }
        this.f30455z.mo3579w();
        this.f30559D.mo3579w();
        this.f30560E.mo3579w();
        this.f30561F.mo3579w();
        m37826E();
    }

    private C11814i5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 5, (RecyclerView) objArr[10], (ConstraintLayout) objArr[11], (MaterialButton) objArr[4], (MaterialButton) objArr[5], (View) objArr[12], (AbstractC11917nf) objArr[6]);
        this.f30564I = -1L;
        this.f30453x.setTag(null);
        this.f30454y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30557B = constraintLayout;
        constraintLayout.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[1];
        this.f30558C = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[7];
        this.f30559D = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[8];
        this.f30560E = abstractC12136z9;
        m37821J(abstractC12136z9);
        AbstractC11801ha abstractC11801ha = (AbstractC11801ha) objArr[9];
        this.f30561F = abstractC11801ha;
        m37821J(abstractC11801ha);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.f30562G = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f30563H = textView;
        textView.setTag(null);
        m37821J(this.f30455z);
        m37820L(view);
        mo3579w();
    }
}
