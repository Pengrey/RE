package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import p450xh.BannerDetailViewModel;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: wg.j */
/* loaded from: classes2.dex */
public class C11825j extends AbstractC11807i {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f30608I;

    /* renamed from: J */
    private static final SparseIntArray f30609J;

    /* renamed from: D */
    private final CoordinatorLayout f30610D;

    /* renamed from: E */
    private final ConstraintLayout f30611E;

    /* renamed from: F */
    private final AbstractC12136z9 f30612F;

    /* renamed from: G */
    private final MaterialButton f30613G;

    /* renamed from: H */
    private long f30614H;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(10);
        f30608I = c1263i;
        c1263i.m37795a(1, new String[]{"view_loading"}, new int[]{7}, new int[]{C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30609J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.content_NestedScrollView, 8);
        sparseIntArray.put(C2336R.C2338id.close_ImageButton, 9);
    }

    public C11825j(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 10, f30608I, f30609J));
    }

    /* renamed from: Q */
    private boolean m4174Q(LiveData<Banner> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30614H |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4173R(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30614H |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4172S(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30614H |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4171T(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30614H |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4170U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30614H |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4169V(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30614H |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4168W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30614H |= 64;
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
                return m4170U((LiveData) obj, i2);
            case 1:
                return m4172S((C1430c0) obj, i2);
            case 2:
                return m4169V((LiveData) obj, i2);
            case 3:
                return m4174Q((LiveData) obj, i2);
            case 4:
                return m4171T((LiveData) obj, i2);
            case 5:
                return m4173R((C1430c0) obj, i2);
            case 6:
                return m4168W((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30612F.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4167X((BannerDetailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public void m4167X(BannerDetailViewModel bannerDetailViewModel) {
        this.f30506C = bannerDetailViewModel;
        synchronized (this) {
            this.f30614H |= 128;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117 A[ADDED_TO_REGION] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11825j.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30614H != 0) {
                return true;
            }
            return this.f30612F.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30614H = 256L;
        }
        this.f30612F.mo3579w();
        m37826E();
    }

    private C11825j(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 7, (ImageView) objArr[2], (ImageButton) objArr[9], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (NestedScrollView) objArr[8]);
        this.f30614H = -1L;
        this.f30507x.setTag(null);
        this.f30509z.setTag(null);
        this.f30504A.setTag(null);
        this.f30505B.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30610D = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30611E = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[7];
        this.f30612F = abstractC12136z9;
        m37821J(abstractC12136z9);
        MaterialButton materialButton = (MaterialButton) objArr[6];
        this.f30613G = materialButton;
        materialButton.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
