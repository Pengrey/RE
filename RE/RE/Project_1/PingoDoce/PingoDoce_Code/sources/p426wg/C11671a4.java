package p426wg;

import android.animation.TimeInterpolator;
import android.text.Spanned;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import p241mi.BottomNavigationViewModel;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel;

/* renamed from: wg.a4 */
/* loaded from: classes2.dex */
public class C11671a4 extends AbstractC12130z3 {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f29831Q;

    /* renamed from: R */
    private static final SparseIntArray f29832R;

    /* renamed from: K */
    private final CoordinatorLayout f29833K;

    /* renamed from: L */
    private final ConstraintLayout f29834L;

    /* renamed from: M */
    private final AbstractC12100x8 f29835M;

    /* renamed from: N */
    private final AbstractC11695ba f29836N;

    /* renamed from: O */
    private final MaterialButton f29837O;

    /* renamed from: P */
    private long f29838P;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(19);
        f29831Q = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar", "view_for_takeaway_orders_count", "view_for_no_connection", "view_bottom_menu"}, new int[]{10, 11, 13, 14}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_for_takeaway_orders_count, C2336R.layout.view_for_no_connection, C2336R.layout.view_bottom_menu});
        c1263i.m37795a(4, new String[]{"view_loading_small"}, new int[]{12}, new int[]{C2336R.layout.view_loading_small});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29832R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_takeaway_payment_disclaimer, 15);
        sparseIntArray.put(C2336R.C2338id.const_guideline, 16);
        sparseIntArray.put(C2336R.C2338id.const_pickup_date, 17);
        sparseIntArray.put(C2336R.C2338id.const_pickup_store, 18);
    }

    public C11671a4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 19, f29831Q, f29832R));
    }

    /* renamed from: S */
    private boolean m4509S(AbstractC11761f7 abstractC11761f7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 32768;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4508T(AbstractC11835j9 abstractC11835j9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4507U(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4506V(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 65536;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4505W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4504X(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4503Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4502Z(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m4501a0(LiveData<Spanned> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 8192;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m4500b0(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m4499c0(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m4498d0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 16384;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private boolean m4497e0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m4496f0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private boolean m4495g0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    private boolean m4494h0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m4493i0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29838P |= 16;
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
                return m4497e0((LiveData) obj, i2);
            case 1:
                return m4503Y((LiveData) obj, i2);
            case 2:
                return m4508T((AbstractC11835j9) obj, i2);
            case 3:
                return m4499c0((LiveData) obj, i2);
            case 4:
                return m4493i0((C1436e0) obj, i2);
            case 5:
                return m4496f0((LiveData) obj, i2);
            case 6:
                return m4500b0((LiveData) obj, i2);
            case 7:
                return m4504X((C1436e0) obj, i2);
            case 8:
                return m4495g0((C1436e0) obj, i2);
            case 9:
                return m4502Z((C1430c0) obj, i2);
            case 10:
                return m4494h0((LiveData) obj, i2);
            case 11:
                return m4505W((LiveData) obj, i2);
            case 12:
                return m4507U((AbstractC11917nf) obj, i2);
            case 13:
                return m4501a0((LiveData) obj, i2);
            case 14:
                return m4498d0((LiveData) obj, i2);
            case 15:
                return m4509S((AbstractC11761f7) obj, i2);
            case 16:
                return m4506V((C1436e0) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f32024D.mo3594K(interfaceC1491v);
        this.f32033z.mo3594K(interfaceC1491v);
        this.f29836N.mo3594K(interfaceC1491v);
        this.f29835M.mo3594K(interfaceC1491v);
        this.f32032y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (54 == i) {
            mo3576Q((TimeInterpolator) obj);
        } else if (74 == i) {
            mo3575R((BottomNavigationViewModel) obj);
        } else if (109 != i) {
            return false;
        } else {
            m4492j0((TakeAwayLandingViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12130z3
    /* renamed from: Q */
    public void mo3576Q(TimeInterpolator timeInterpolator) {
        this.f32028H = timeInterpolator;
        synchronized (this) {
            this.f29838P |= 131072;
        }
        m37781c(54);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12130z3
    /* renamed from: R */
    public void mo3575R(BottomNavigationViewModel bottomNavigationViewModel) {
        this.f32030J = bottomNavigationViewModel;
        synchronized (this) {
            this.f29838P |= 262144;
        }
        m37781c(74);
        super.m37826E();
    }

    /* renamed from: j0 */
    public void m4492j0(TakeAwayLandingViewModel takeAwayLandingViewModel) {
        this.f32029I = takeAwayLandingViewModel;
        synchronized (this) {
            this.f29838P |= 524288;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11671a4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29838P != 0) {
                return true;
            }
            return this.f32024D.mo3580u() || this.f32033z.mo3580u() || this.f29836N.mo3580u() || this.f29835M.mo3580u() || this.f32032y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29838P = 1048576L;
        }
        this.f32024D.mo3579w();
        this.f32033z.mo3579w();
        this.f29836N.mo3579w();
        this.f29835M.mo3579w();
        this.f32032y.mo3579w();
        m37826E();
    }

    private C11671a4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 17, (Guideline) objArr[3], (AbstractC11761f7) objArr[14], (AbstractC11835j9) objArr[11], (Group) objArr[2], (Guideline) objArr[16], (TextView) objArr[5], (TextView) objArr[17], (TextView) objArr[18], (ConstraintLayout) objArr[4], (TextView) objArr[15], (AbstractC11917nf) objArr[10], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[6]);
        this.f29838P = -1L;
        this.f32031x.setTag(null);
        m37821J(this.f32032y);
        m37821J(this.f32033z);
        this.f32021A.setTag(null);
        this.f32022B.setTag(null);
        this.f32023C.setTag(null);
        m37821J(this.f32024D);
        this.f32025E.setTag(null);
        this.f32026F.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f29833K = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f29834L = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[13];
        this.f29835M = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[12];
        this.f29836N = abstractC11695ba;
        m37821J(abstractC11695ba);
        MaterialButton materialButton = (MaterialButton) objArr[9];
        this.f29837O = materialButton;
        materialButton.setTag(null);
        this.f32027G.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
