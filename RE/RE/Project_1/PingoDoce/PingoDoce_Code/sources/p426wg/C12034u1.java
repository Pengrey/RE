package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.notifications.NotificationsViewModel;

/* renamed from: wg.u1 */
/* loaded from: classes2.dex */
public class C12034u1 extends AbstractC12018t1 {

    /* renamed from: Y */
    private static final ViewDataBinding.C1263i f31581Y;

    /* renamed from: Z */
    private static final SparseIntArray f31582Z;

    /* renamed from: A */
    private final AbstractC11917nf f31583A;

    /* renamed from: B */
    private final CoordinatorLayout f31584B;

    /* renamed from: C */
    private final AbstractC12136z9 f31585C;

    /* renamed from: D */
    private final ConstraintLayout f31586D;

    /* renamed from: E */
    private final SwitchMaterial f31587E;

    /* renamed from: F */
    private final SwitchMaterial f31588F;

    /* renamed from: G */
    private final SwitchMaterial f31589G;

    /* renamed from: H */
    private final SwitchMaterial f31590H;

    /* renamed from: I */
    private final MaterialButton f31591I;

    /* renamed from: J */
    private final SwitchMaterial f31592J;

    /* renamed from: K */
    private final ConstraintLayout f31593K;

    /* renamed from: L */
    private final SwitchMaterial f31594L;

    /* renamed from: M */
    private final SwitchMaterial f31595M;

    /* renamed from: N */
    private final ConstraintLayout f31596N;

    /* renamed from: O */
    private final SwitchMaterial f31597O;

    /* renamed from: P */
    private InterfaceC1276g f31598P;

    /* renamed from: Q */
    private InterfaceC1276g f31599Q;

    /* renamed from: R */
    private InterfaceC1276g f31600R;

    /* renamed from: S */
    private InterfaceC1276g f31601S;

    /* renamed from: T */
    private InterfaceC1276g f31602T;

    /* renamed from: U */
    private InterfaceC1276g f31603U;

    /* renamed from: V */
    private InterfaceC1276g f31604V;

    /* renamed from: W */
    private InterfaceC1276g f31605W;

    /* renamed from: X */
    private long f31606X;

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$a */
    /* loaded from: classes2.dex */
    class C12035a implements InterfaceC1276g {
        C12035a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31587E.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13118m1 = notificationsViewModel.m13118m1();
                if (m13118m1 != null) {
                    m13118m1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$b */
    /* loaded from: classes2.dex */
    class C12036b implements InterfaceC1276g {
        C12036b() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31588F.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13120k1 = notificationsViewModel.m13120k1();
                if (m13120k1 != null) {
                    m13120k1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$c */
    /* loaded from: classes2.dex */
    class C12037c implements InterfaceC1276g {
        C12037c() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31589G.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13113q1 = notificationsViewModel.m13113q1();
                if (m13113q1 != null) {
                    m13113q1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$d */
    /* loaded from: classes2.dex */
    class C12038d implements InterfaceC1276g {
        C12038d() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31590H.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13111s1 = notificationsViewModel.m13111s1();
                if (m13111s1 != null) {
                    m13111s1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$e */
    /* loaded from: classes2.dex */
    class C12039e implements InterfaceC1276g {
        C12039e() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31592J.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13119l1 = notificationsViewModel.m13119l1();
                if (m13119l1 != null) {
                    m13119l1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$f */
    /* loaded from: classes2.dex */
    class C12040f implements InterfaceC1276g {
        C12040f() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31594L.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13112r1 = notificationsViewModel.m13112r1();
                if (m13112r1 != null) {
                    m13112r1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$g */
    /* loaded from: classes2.dex */
    class C12041g implements InterfaceC1276g {
        C12041g() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31595M.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13114p1 = notificationsViewModel.m13114p1();
                if (m13114p1 != null) {
                    m13114p1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityNotificationsBindingImpl.java */
    /* renamed from: wg.u1$h */
    /* loaded from: classes2.dex */
    class C12042h implements InterfaceC1276g {
        C12042h() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12034u1.this.f31597O.isChecked();
            NotificationsViewModel notificationsViewModel = C12034u1.this.f31505z;
            if (notificationsViewModel != null) {
                C1436e0 m13115o1 = notificationsViewModel.m13115o1();
                if (m13115o1 != null) {
                    m13115o1.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(27);
        f31581Y = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{15, 16}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31582Z = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_communications_preferences_title, 17);
        sparseIntArray.put(C2336R.C2338id.communications_container, 18);
        sparseIntArray.put(C2336R.C2338id.const_email, 19);
        sparseIntArray.put(C2336R.C2338id.const_sms, 20);
        sparseIntArray.put(C2336R.C2338id.const_general, 21);
        sparseIntArray.put(C2336R.C2338id.const_online_publicity, 22);
        sparseIntArray.put(C2336R.C2338id.const_flyers, 23);
        sparseIntArray.put(C2336R.C2338id.const_loyalty, 24);
        sparseIntArray.put(C2336R.C2338id.const_shopping_list, 25);
        sparseIntArray.put(C2336R.C2338id.const_orders, 26);
    }

    public C12034u1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 27, f31581Y, f31582Z));
    }

    /* renamed from: Y */
    private boolean m3751Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3750Z(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m3749a0(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m3748b0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m3747c0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m3746d0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private boolean m3745e0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m3744f0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private boolean m3743g0(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    private boolean m3742h0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m3741i0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    private boolean m3740j0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    private boolean m3739k0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    private boolean m3738l0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31606X |= 8192;
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
                return m3746d0((LiveData) obj, i2);
            case 1:
                return m3747c0((C1436e0) obj, i2);
            case 2:
                return m3745e0((C1436e0) obj, i2);
            case 3:
                return m3743g0((LiveData) obj, i2);
            case 4:
                return m3750Z((C1436e0) obj, i2);
            case 5:
                return m3739k0((C1436e0) obj, i2);
            case 6:
                return m3751Y((LiveData) obj, i2);
            case 7:
                return m3748b0((C1436e0) obj, i2);
            case 8:
                return m3744f0((C1436e0) obj, i2);
            case 9:
                return m3741i0((C1436e0) obj, i2);
            case 10:
                return m3742h0((C1436e0) obj, i2);
            case 11:
                return m3749a0((LiveData) obj, i2);
            case 12:
                return m3740j0((LiveData) obj, i2);
            case 13:
                return m3738l0((C1436e0) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31583A.mo3594K(interfaceC1491v);
        this.f31585C.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3737m0((NotificationsViewModel) obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12034u1.mo3581k():void");
    }

    /* renamed from: m0 */
    public void m3737m0(NotificationsViewModel notificationsViewModel) {
        this.f31505z = notificationsViewModel;
        synchronized (this) {
            this.f31606X |= 16384;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31606X != 0) {
                return true;
            }
            return this.f31583A.mo3580u() || this.f31585C.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31606X = 32768L;
        }
        this.f31583A.mo3579w();
        this.f31585C.mo3579w();
        m37826E();
    }

    private C12034u1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 14, (LinearLayout) objArr[18], (TextView) objArr[17], (TextView) objArr[19], (TextView) objArr[23], (TextView) objArr[21], (TextView) objArr[24], (TextView) objArr[8], (TextView) objArr[22], (TextView) objArr[26], (TextView) objArr[25], (TextView) objArr[20], (LinearLayout) objArr[9]);
        this.f31598P = new C12035a();
        this.f31599Q = new C12036b();
        this.f31600R = new C12037c();
        this.f31601S = new C12038d();
        this.f31602T = new C12039e();
        this.f31603U = new C12040f();
        this.f31604V = new C12041g();
        this.f31605W = new C12042h();
        this.f31606X = -1L;
        this.f31503x.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[15];
        this.f31583A = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f31584B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[16];
        this.f31585C = abstractC12136z9;
        m37821J(abstractC12136z9);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31586D = constraintLayout;
        constraintLayout.setTag(null);
        SwitchMaterial switchMaterial = (SwitchMaterial) objArr[10];
        this.f31587E = switchMaterial;
        switchMaterial.setTag(null);
        SwitchMaterial switchMaterial2 = (SwitchMaterial) objArr[11];
        this.f31588F = switchMaterial2;
        switchMaterial2.setTag(null);
        SwitchMaterial switchMaterial3 = (SwitchMaterial) objArr[12];
        this.f31589G = switchMaterial3;
        switchMaterial3.setTag(null);
        SwitchMaterial switchMaterial4 = (SwitchMaterial) objArr[13];
        this.f31590H = switchMaterial4;
        switchMaterial4.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[14];
        this.f31591I = materialButton;
        materialButton.setTag(null);
        SwitchMaterial switchMaterial5 = (SwitchMaterial) objArr[2];
        this.f31592J = switchMaterial5;
        switchMaterial5.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[3];
        this.f31593K = constraintLayout2;
        constraintLayout2.setTag(null);
        SwitchMaterial switchMaterial6 = (SwitchMaterial) objArr[4];
        this.f31594L = switchMaterial6;
        switchMaterial6.setTag(null);
        SwitchMaterial switchMaterial7 = (SwitchMaterial) objArr[5];
        this.f31595M = switchMaterial7;
        switchMaterial7.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[6];
        this.f31596N = constraintLayout3;
        constraintLayout3.setTag(null);
        SwitchMaterial switchMaterial8 = (SwitchMaterial) objArr[7];
        this.f31597O = switchMaterial8;
        switchMaterial8.setTag(null);
        this.f31504y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
