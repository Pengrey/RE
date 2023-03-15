package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel;

/* renamed from: wg.q1 */
/* loaded from: classes2.dex */
public class C11959q1 extends AbstractC11942p1 {

    /* renamed from: N */
    private static final ViewDataBinding.C1263i f31256N;

    /* renamed from: O */
    private static final SparseIntArray f31257O;

    /* renamed from: H */
    private final ConstraintLayout f31258H;

    /* renamed from: I */
    private final AbstractC12136z9 f31259I;

    /* renamed from: J */
    private final LinearLayout f31260J;

    /* renamed from: K */
    private InterfaceC1276g f31261K;

    /* renamed from: L */
    private ViewDataBinding.AbstractC1265k f31262L;

    /* renamed from: M */
    private long f31263M;

    /* compiled from: ActivityNewClubWineBindingImpl.java */
    /* renamed from: wg.q1$a */
    /* loaded from: classes2.dex */
    class C11960a extends ViewDataBinding.AbstractC1265k {
        C11960a(int i) {
            super(i);
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m4050Q = C11959q1.this.f31188x.m4050Q();
            WineClubViewModel wineClubViewModel = C11959q1.this.f31186F;
            if (wineClubViewModel != null) {
                C1436e0 m12752C0 = wineClubViewModel.m12752C0();
                if (m12752C0 != null) {
                    m12752C0.mo166p(m4050Q);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(11);
        f31256N = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image", "view_loading"}, new int[]{4, 8}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading});
        c1263i.m37795a(2, new String[]{"view_for_wine_club_birthdate", "view_for_wine_club_type", "view_for_wine_club_region"}, new int[]{5, 6, 7}, new int[]{C2336R.layout.view_for_wine_club_birthdate, C2336R.layout.view_for_wine_club_type, C2336R.layout.view_for_wine_club_region});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31257O = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_step, 9);
        sparseIntArray.put(C2336R.C2338id.progress_bar, 10);
    }

    public C11959q1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f31256N, f31257O));
    }

    /* renamed from: Q */
    private boolean m3885Q(AbstractC11872l9 abstractC11872l9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3884R(AbstractC11950p9 abstractC11950p9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3883S(AbstractC11990r9 abstractC11990r9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3882T(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3881U(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3880V(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3879W(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3878X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3877Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31263M |= 2;
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
                return m3883S((AbstractC11990r9) obj, i2);
            case 1:
                return m3877Y((LiveData) obj, i2);
            case 2:
                return m3885Q((AbstractC11872l9) obj, i2);
            case 3:
                return m3878X((LiveData) obj, i2);
            case 4:
                return m3880V((C1430c0) obj, i2);
            case 5:
                return m3882T((AbstractC11996rf) obj, i2);
            case 6:
                return m3881U((C1436e0) obj, i2);
            case 7:
                return m3884R((AbstractC11950p9) obj, i2);
            case 8:
                return m3879W((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31182B.mo3594K(interfaceC1491v);
        this.f31188x.mo3594K(interfaceC1491v);
        this.f31190z.mo3594K(interfaceC1491v);
        this.f31189y.mo3594K(interfaceC1491v);
        this.f31259I.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (49 == i) {
            m3876Z((Boolean) obj);
        } else if (109 != i) {
            return false;
        } else {
            m3875a0((WineClubViewModel) obj);
        }
        return true;
    }

    /* renamed from: Z */
    public void m3876Z(Boolean bool) {
        this.f31187G = bool;
        synchronized (this) {
            this.f31263M |= 512;
        }
        m37781c(49);
        super.m37826E();
    }

    /* renamed from: a0 */
    public void m3875a0(WineClubViewModel wineClubViewModel) {
        this.f31186F = wineClubViewModel;
        synchronized (this) {
            this.f31263M |= 1024;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11959q1.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31263M != 0) {
                return true;
            }
            return this.f31182B.mo3580u() || this.f31188x.mo3580u() || this.f31190z.mo3580u() || this.f31189y.mo3580u() || this.f31259I.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31263M = 2048L;
        }
        this.f31182B.mo3579w();
        this.f31188x.mo3579w();
        this.f31190z.mo3579w();
        this.f31189y.mo3579w();
        this.f31259I.mo3579w();
        m37826E();
    }

    private C11959q1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 9, (AbstractC11872l9) objArr[5], (AbstractC11950p9) objArr[7], (AbstractC11990r9) objArr[6], (TextView) objArr[9], (AbstractC11996rf) objArr[4], (LinearProgressIndicator) objArr[10], (MaterialButton) objArr[1], (MaterialButton) objArr[3]);
        this.f31262L = new C11960a(21);
        this.f31263M = -1L;
        m37821J(this.f31188x);
        m37821J(this.f31189y);
        m37821J(this.f31190z);
        m37821J(this.f31182B);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31258H = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[8];
        this.f31259I = abstractC12136z9;
        m37821J(abstractC12136z9);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.f31260J = linearLayout;
        linearLayout.setTag(null);
        this.f31184D.setTag(null);
        this.f31185E.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
