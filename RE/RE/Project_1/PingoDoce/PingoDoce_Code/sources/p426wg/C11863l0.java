package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import p361t3.InterfaceC10379c;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel;

/* renamed from: wg.l0 */
/* loaded from: classes2.dex */
public class C11863l0 extends AbstractC11843k0 {

    /* renamed from: U */
    private static final ViewDataBinding.C1263i f30815U;

    /* renamed from: V */
    private static final SparseIntArray f30816V;

    /* renamed from: M */
    private final CoordinatorLayout f30817M;

    /* renamed from: N */
    private final ConstraintLayout f30818N;

    /* renamed from: O */
    private final AbstractC12100x8 f30819O;

    /* renamed from: P */
    private final AbstractC12136z9 f30820P;

    /* renamed from: Q */
    private final TextView f30821Q;

    /* renamed from: R */
    private final MaterialCardView f30822R;

    /* renamed from: S */
    private final MaterialCardView f30823S;

    /* renamed from: T */
    private long f30824T;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(42);
        f30815U = c1263i;
        c1263i.m37795a(1, new String[]{"view_for_no_connection", "view_loading"}, new int[]{18, 19}, new int[]{C2336R.layout.view_for_no_connection, C2336R.layout.view_loading});
        c1263i.m37795a(4, new String[]{"view_overview_balance"}, new int[]{15}, new int[]{C2336R.layout.view_overview_balance});
        c1263i.m37795a(5, new String[]{"view_active_benefits_account"}, new int[]{16}, new int[]{C2336R.layout.view_active_benefits_account});
        c1263i.m37795a(6, new String[]{"view_bp_balance"}, new int[]{17}, new int[]{C2336R.layout.view_bp_balance});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30816V = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 20);
        sparseIntArray.put(C2336R.C2338id.toolbar, 21);
        sparseIntArray.put(C2336R.C2338id.const_account_lbl, 22);
        sparseIntArray.put(C2336R.C2338id.refresh_SwipeRefreshLayout, 23);
        sparseIntArray.put(C2336R.C2338id.content_NestedScrollView, 24);
        sparseIntArray.put(C2336R.C2338id.benefits_container, 25);
        sparseIntArray.put(C2336R.C2338id.constraintLayout_grid, 26);
        sparseIntArray.put(C2336R.C2338id.ic_clubs, 27);
        sparseIntArray.put(C2336R.C2338id.const_clubs, 28);
        sparseIntArray.put(C2336R.C2338id.ic_card, 29);
        sparseIntArray.put(C2336R.C2338id.const_card, 30);
        sparseIntArray.put(C2336R.C2338id.ic_history, 31);
        sparseIntArray.put(C2336R.C2338id.const_history, 32);
        sparseIntArray.put(C2336R.C2338id.ic_store, 33);
        sparseIntArray.put(C2336R.C2338id.const_store, 34);
        sparseIntArray.put(C2336R.C2338id.ic_profile, 35);
        sparseIntArray.put(C2336R.C2338id.const_profile, 36);
        sparseIntArray.put(C2336R.C2338id.ic_settings, 37);
        sparseIntArray.put(C2336R.C2338id.const_settings, 38);
        sparseIntArray.put(C2336R.C2338id.img_bg_tr, 39);
        sparseIntArray.put(C2336R.C2338id.img_bg_br, 40);
        sparseIntArray.put(C2336R.C2338id.img_bg_ml, 41);
    }

    public C11863l0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 42, f30815U, f30816V));
    }

    /* renamed from: Q */
    private boolean m4065Q(AbstractC11692b7 abstractC11692b7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4064R(AbstractC11798h7 abstractC11798h7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4063S(AbstractC11912na abstractC11912na, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4062T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4061U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4060V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4059W(LiveData<LoyaltyCard> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4058X(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4057Y(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4056Z(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m4055a0(LiveData<InterfaceC10379c> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m4054b0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30824T |= 1024;
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
                return m4061U((LiveData) obj, i2);
            case 1:
                return m4060V((LiveData) obj, i2);
            case 2:
                return m4055a0((LiveData) obj, i2);
            case 3:
                return m4064R((AbstractC11798h7) obj, i2);
            case 4:
                return m4062T((LiveData) obj, i2);
            case 5:
                return m4059W((LiveData) obj, i2);
            case 6:
                return m4057Y((C1436e0) obj, i2);
            case 7:
                return m4058X((LiveData) obj, i2);
            case 8:
                return m4063S((AbstractC11912na) obj, i2);
            case 9:
                return m4065Q((AbstractC11692b7) obj, i2);
            case 10:
                return m4054b0((LiveData) obj, i2);
            case 11:
                return m4056Z((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30723H.mo3594K(interfaceC1491v);
        this.f30728x.mo3594K(interfaceC1491v);
        this.f30730z.mo3594K(interfaceC1491v);
        this.f30819O.mo3594K(interfaceC1491v);
        this.f30820P.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4053c0((LoggedAccountViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public void m4053c0(LoggedAccountViewModel loggedAccountViewModel) {
        this.f30727L = loggedAccountViewModel;
        synchronized (this) {
            this.f30824T |= 4096;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018f  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11863l0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30824T != 0) {
                return true;
            }
            return this.f30723H.mo3580u() || this.f30728x.mo3580u() || this.f30730z.mo3580u() || this.f30819O.mo3580u() || this.f30820P.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30824T = 8192L;
        }
        this.f30723H.mo3579w();
        this.f30728x.mo3579w();
        this.f30730z.mo3579w();
        this.f30819O.mo3579w();
        this.f30820P.mo3579w();
        m37826E();
    }

    private C11863l0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 12, (AbstractC11692b7) objArr[16], (ImageView) objArr[10], (LinearLayout) objArr[25], (AbstractC11798h7) objArr[17], (MaterialCardView) objArr[6], (MaterialCardView) objArr[8], (MaterialCardView) objArr[11], (MaterialCardView) objArr[9], (MaterialCardView) objArr[12], (MaterialCardView) objArr[13], (TextView) objArr[22], (TextView) objArr[30], (TextView) objArr[28], (TextView) objArr[32], (TextView) objArr[36], (TextView) objArr[38], (TextView) objArr[34], (ImageView) objArr[2], (ConstraintLayout) objArr[26], (NestedScrollView) objArr[24], (AppBarLayout) objArr[20], (ImageView) objArr[29], (ImageView) objArr[27], (ImageView) objArr[31], (ImageView) objArr[35], (ImageView) objArr[37], (ImageView) objArr[33], (ImageView) objArr[40], (ImageView) objArr[41], (ImageView) objArr[39], (AbstractC11912na) objArr[15], (SwipeRefreshLayout) objArr[23], (MaterialCardView) objArr[14], (Toolbar) objArr[21], (TextView) objArr[7]);
        this.f30824T = -1L;
        m37821J(this.f30728x);
        this.f30729y.setTag(null);
        m37821J(this.f30730z);
        this.f30716A.setTag(null);
        this.f30717B.setTag(null);
        this.f30718C.setTag(null);
        this.f30719D.setTag(null);
        this.f30720E.setTag(null);
        this.f30721F.setTag(null);
        this.f30722G.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30817M = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30818N = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[18];
        this.f30819O = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[19];
        this.f30820P = abstractC12136z9;
        m37821J(abstractC12136z9);
        TextView textView = (TextView) objArr[3];
        this.f30821Q = textView;
        textView.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[4];
        this.f30822R = materialCardView;
        materialCardView.setTag(null);
        MaterialCardView materialCardView2 = (MaterialCardView) objArr[5];
        this.f30823S = materialCardView2;
        materialCardView2.setTag(null);
        m37821J(this.f30723H);
        this.f30725J.setTag(null);
        this.f30726K.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
