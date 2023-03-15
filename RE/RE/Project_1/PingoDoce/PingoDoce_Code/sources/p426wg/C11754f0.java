package p426wg;

import ae.InterfaceC0131a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import p241mi.BottomNavigationViewModel;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import pt.pingodoce.app.data.remote.models.response.Banner;
import pt.pingodoce.app.data.remote.models.response.Benefit;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.home.HomeViewModel;

/* renamed from: wg.f0 */
/* loaded from: classes2.dex */
public class C11754f0 extends AbstractC11737e0 {

    /* renamed from: j0 */
    private static final ViewDataBinding.C1263i f30263j0;

    /* renamed from: k0 */
    private static final SparseIntArray f30264k0;

    /* renamed from: X */
    private final CoordinatorLayout f30265X;

    /* renamed from: Y */
    private final ConstraintLayout f30266Y;

    /* renamed from: Z */
    private final ShimmerFrameLayout f30267Z;

    /* renamed from: a0 */
    private final ConstraintLayout f30268a0;

    /* renamed from: b0 */
    private final ConstraintLayout f30269b0;

    /* renamed from: c0 */
    private final FrameLayout f30270c0;

    /* renamed from: d0 */
    private final AbstractC12100x8 f30271d0;

    /* renamed from: e0 */
    private final AbstractC11695ba f30272e0;

    /* renamed from: f0 */
    private final View f30273f0;

    /* renamed from: g0 */
    private final TextView f30274g0;

    /* renamed from: h0 */
    private final ConstraintLayout f30275h0;

    /* renamed from: i0 */
    private long f30276i0;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(39);
        f30263j0 = c1263i;
        c1263i.m37795a(1, new String[]{"view_bottom_menu"}, new int[]{28}, new int[]{C2336R.layout.view_bottom_menu});
        c1263i.m37795a(2, new String[]{"view_loading_small"}, new int[]{21}, new int[]{C2336R.layout.view_loading_small});
        c1263i.m37795a(8, new String[]{"view_bp_balance"}, new int[]{22}, new int[]{C2336R.layout.view_bp_balance});
        c1263i.m37795a(11, new String[]{"view_for_highlight_benefit", "view_for_highlight_without_benefit"}, new int[]{23, 24}, new int[]{C2336R.layout.view_for_highlight_benefit, C2336R.layout.view_for_highlight_without_benefit});
        c1263i.m37795a(12, new String[]{"view_row_for_banner_item_full_width"}, new int[]{25}, new int[]{C2336R.layout.view_row_for_banner_item_full_width});
        c1263i.m37795a(13, new String[]{"view_placeholder_for_home_flyers"}, new int[]{26}, new int[]{C2336R.layout.view_placeholder_for_home_flyers});
        c1263i.m37795a(18, new String[]{"view_for_no_connection"}, new int[]{27}, new int[]{C2336R.layout.view_for_no_connection});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30264k0 = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.coordinatorLayout2, 29);
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 30);
        sparseIntArray.put(C2336R.C2338id.navigation_account, 31);
        sparseIntArray.put(C2336R.C2338id.refresh_SwipeRefreshLayout, 32);
        sparseIntArray.put(C2336R.C2338id.main_layout, 33);
        sparseIntArray.put(C2336R.C2338id.const_benefits_title, 34);
        sparseIntArray.put(C2336R.C2338id.const_banners_title, 35);
        sparseIntArray.put(C2336R.C2338id.banners_PlaceHolderRecyclerView, 36);
        sparseIntArray.put(C2336R.C2338id.const_product_title, 37);
        sparseIntArray.put(C2336R.C2338id.products_PlaceHolderRecyclerView, 38);
    }

    public C11754f0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 39, f30263j0, f30264k0));
    }

    /* renamed from: S */
    private boolean m4337S(AbstractC11766fc abstractC11766fc, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 8192;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4336T(AbstractC11761f7 abstractC11761f7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4335U(AbstractC12027ta abstractC12027ta, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4334V(AbstractC11910n8 abstractC11910n8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4333W(AbstractC11798h7 abstractC11798h7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 16384;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4332X(AbstractC11949p8 abstractC11949p8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4331Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4330Z(LiveData<Banner> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m4329a0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m4328b0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 524288;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m4327c0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m4326d0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 65536;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private boolean m4325e0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 1048576;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m4324f0(LiveData<Benefit> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private boolean m4323g0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 131072;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    private boolean m4322h0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m4321i0(LiveData<LoyaltyCard> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 2097152;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    private boolean m4320j0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    private boolean m4319k0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 262144;
            }
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    private boolean m4318l0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    private boolean m4317m0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    private boolean m4316n0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 32768;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    private boolean m4315o0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    private boolean m4314p0(LiveData<HomeViewModel.EnumC9181b> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    private boolean m4313q0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    private boolean m4312r0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30276i0 |= 8;
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
                return m4331Y((LiveData) obj, i2);
            case 1:
                return m4327c0((LiveData) obj, i2);
            case 2:
                return m4317m0((LiveData) obj, i2);
            case 3:
                return m4312r0((LiveData) obj, i2);
            case 4:
                return m4318l0((LiveData) obj, i2);
            case 5:
                return m4324f0((LiveData) obj, i2);
            case 6:
                return m4320j0((C1436e0) obj, i2);
            case 7:
                return m4335U((AbstractC12027ta) obj, i2);
            case 8:
                return m4322h0((LiveData) obj, i2);
            case 9:
                return m4329a0((LiveData) obj, i2);
            case 10:
                return m4332X((AbstractC11949p8) obj, i2);
            case 11:
                return m4315o0((LiveData) obj, i2);
            case 12:
                return m4334V((AbstractC11910n8) obj, i2);
            case 13:
                return m4337S((AbstractC11766fc) obj, i2);
            case 14:
                return m4333W((AbstractC11798h7) obj, i2);
            case 15:
                return m4316n0((LiveData) obj, i2);
            case 16:
                return m4326d0((LiveData) obj, i2);
            case 17:
                return m4323g0((LiveData) obj, i2);
            case 18:
                return m4319k0((LiveData) obj, i2);
            case 19:
                return m4328b0((LiveData) obj, i2);
            case 20:
                return m4325e0((LiveData) obj, i2);
            case 21:
                return m4321i0((LiveData) obj, i2);
            case 22:
                return m4313q0((LiveData) obj, i2);
            case 23:
                return m4330Z((LiveData) obj, i2);
            case 24:
                return m4314p0((LiveData) obj, i2);
            case 25:
                return m4336T((AbstractC11761f7) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30272e0.mo3594K(interfaceC1491v);
        this.f30178L.mo3594K(interfaceC1491v);
        this.f30177K.mo3594K(interfaceC1491v);
        this.f30181O.mo3594K(interfaceC1491v);
        this.f30191y.mo3594K(interfaceC1491v);
        this.f30170D.mo3594K(interfaceC1491v);
        this.f30271d0.mo3594K(interfaceC1491v);
        this.f30168B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (74 == i) {
            mo4339Q((BottomNavigationViewModel) obj);
        } else if (83 == i) {
            mo4338R((InterfaceC0131a) obj);
        } else if (109 != i) {
            return false;
        } else {
            m4311s0((HomeViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11737e0
    /* renamed from: Q */
    public void mo4339Q(BottomNavigationViewModel bottomNavigationViewModel) {
        this.f30188V = bottomNavigationViewModel;
        synchronized (this) {
            this.f30276i0 |= 67108864;
        }
        m37781c(74);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11737e0
    /* renamed from: R */
    public void mo4338R(InterfaceC0131a<Purchase> interfaceC0131a) {
        this.f30189W = interfaceC0131a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0172  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 1803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11754f0.mo3581k():void");
    }

    /* renamed from: s0 */
    public void m4311s0(HomeViewModel homeViewModel) {
        this.f30187U = homeViewModel;
        synchronized (this) {
            this.f30276i0 |= 268435456;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30276i0 != 0) {
                return true;
            }
            return this.f30272e0.mo3580u() || this.f30178L.mo3580u() || this.f30177K.mo3580u() || this.f30181O.mo3580u() || this.f30191y.mo3580u() || this.f30170D.mo3580u() || this.f30271d0.mo3580u() || this.f30168B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30276i0 = 536870912L;
        }
        this.f30272e0.mo3579w();
        this.f30178L.mo3579w();
        this.f30177K.mo3579w();
        this.f30181O.mo3579w();
        this.f30191y.mo3579w();
        this.f30170D.mo3579w();
        this.f30271d0.mo3579w();
        this.f30168B.mo3579w();
        m37826E();
    }

    private C11754f0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 26, (ImageView) objArr[4], (AbstractC11766fc) objArr[25], (PlaceHolderRecyclerView) objArr[36], (MaterialCardView) objArr[11], (AbstractC11761f7) objArr[28], (MaterialCardView) objArr[8], (TextView) objArr[35], (TextView) objArr[34], (AbstractC12027ta) objArr[26], (TextView) objArr[14], (TextView) objArr[17], (TextView) objArr[37], (NestedScrollView) objArr[6], (CoordinatorLayout) objArr[29], (ExtendedFloatingActionButton) objArr[19], (PlaceHolderRecyclerView) objArr[15], (AppBarLayout) objArr[30], (AbstractC11910n8) objArr[23], (AbstractC11798h7) objArr[22], (LinearLayout) objArr[33], (ImageView) objArr[31], (ConstraintLayout) objArr[3], (AbstractC11949p8) objArr[24], (ConstraintLayout) objArr[16], (PlaceHolderRecyclerView) objArr[38], (SwipeRefreshLayout) objArr[32], (TextView) objArr[5], (Toolbar) objArr[2]);
        this.f30276i0 = -1L;
        this.f30190x.setTag(null);
        m37821J(this.f30191y);
        this.f30167A.setTag(null);
        m37821J(this.f30168B);
        this.f30169C.setTag(null);
        m37821J(this.f30170D);
        this.f30171E.setTag(null);
        this.f30172F.setTag(null);
        this.f30173G.setTag(null);
        this.f30174H.setTag(null);
        this.f30175I.setTag(null);
        m37821J(this.f30177K);
        m37821J(this.f30178L);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30265X = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30266Y = constraintLayout;
        constraintLayout.setTag(null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[10];
        this.f30267Z = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[12];
        this.f30268a0 = constraintLayout2;
        constraintLayout2.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[13];
        this.f30269b0 = constraintLayout3;
        constraintLayout3.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[18];
        this.f30270c0 = frameLayout;
        frameLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[27];
        this.f30271d0 = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[21];
        this.f30272e0 = abstractC11695ba;
        m37821J(abstractC11695ba);
        View view2 = (View) objArr[20];
        this.f30273f0 = view2;
        view2.setTag(null);
        TextView textView = (TextView) objArr[7];
        this.f30274g0 = textView;
        textView.setTag(null);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) objArr[9];
        this.f30275h0 = constraintLayout4;
        constraintLayout4.setTag(null);
        this.f30180N.setTag(null);
        m37821J(this.f30181O);
        this.f30182P.setTag(null);
        this.f30185S.setTag(null);
        this.f30186T.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
