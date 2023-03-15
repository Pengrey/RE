package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
import p086ei.BenefitsViewModel;
import pt.pingodoce.app.data.remote.models.response.Banner;
import pt.pingodoce.app.data.remote.models.response.Benefit;

/* renamed from: wg.l */
/* loaded from: classes2.dex */
public class C11862l extends AbstractC11842k {

    /* renamed from: L */
    private static final ViewDataBinding.C1263i f30809L;

    /* renamed from: M */
    private static final SparseIntArray f30810M;

    /* renamed from: H */
    private final ConstraintLayout f30811H;

    /* renamed from: I */
    private final AbstractC12136z9 f30812I;

    /* renamed from: J */
    private final ConstraintLayout f30813J;

    /* renamed from: K */
    private long f30814K;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(14);
        f30809L = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{9}, new int[]{C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"view_row_for_banner_item_full_width"}, new int[]{8}, new int[]{C2336R.layout.view_row_for_banner_item_full_width});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30810M = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.swipe_refresh, 10);
        sparseIntArray.put(C2336R.C2338id.toolbar, 11);
        sparseIntArray.put(C2336R.C2338id.txt_my_benefits_title, 12);
        sparseIntArray.put(C2336R.C2338id.banners_PlaceHolderRecyclerView, 13);
    }

    public C11862l(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 14, f30809L, f30810M));
    }

    /* renamed from: Q */
    private boolean m4072Q(AbstractC11766fc abstractC11766fc, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30814K |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4071R(LiveData<List<Banner>> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30814K |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4070S(LiveData<List<Benefit>> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30814K |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4069T(LiveData<Banner> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30814K |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4068U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30814K |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4067V(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30814K |= 16;
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
                            return m4072Q((AbstractC11766fc) obj, i2);
                        }
                        return m4067V((LiveData) obj, i2);
                    }
                    return m4069T((LiveData) obj, i2);
                }
                return m4070S((LiveData) obj, i2);
            }
            return m4071R((LiveData) obj, i2);
        }
        return m4068U((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30713x.mo3594K(interfaceC1491v);
        this.f30812I.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4066W((BenefitsViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public void m4066W(BenefitsViewModel benefitsViewModel) {
        this.f30712G = benefitsViewModel;
        synchronized (this) {
            this.f30814K |= 64;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011d  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11862l.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30814K != 0) {
                return true;
            }
            return this.f30713x.mo3580u() || this.f30812I.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30814K = 128L;
        }
        this.f30713x.mo3579w();
        this.f30812I.mo3579w();
        m37826E();
    }

    private C11862l(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 6, (AbstractC11766fc) objArr[8], (PlaceHolderRecyclerView) objArr[13], (TextView) objArr[6], (ExtendedFloatingActionButton) objArr[7], (ImageView) objArr[4], (RecyclerView) objArr[3], (SwipeRefreshLayout) objArr[10], (Toolbar) objArr[11], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[12], (TextView) objArr[5]);
        this.f30814K = -1L;
        m37821J(this.f30713x);
        this.f30715z.setTag(null);
        this.f30706A.setTag(null);
        this.f30707B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30811H = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[9];
        this.f30812I = abstractC12136z9;
        m37821J(abstractC12136z9);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.f30813J = constraintLayout2;
        constraintLayout2.setTag(null);
        this.f30708C.setTag(null);
        this.f30710E.setTag(null);
        this.f30711F.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
