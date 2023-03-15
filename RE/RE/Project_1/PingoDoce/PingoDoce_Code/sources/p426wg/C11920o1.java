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
import p164ii.BabyClubViewModel;

/* renamed from: wg.o1 */
/* loaded from: classes2.dex */
public class C11920o1 extends AbstractC11903n1 {

    /* renamed from: U */
    private static final ViewDataBinding.C1263i f31085U;

    /* renamed from: V */
    private static final SparseIntArray f31086V;

    /* renamed from: G */
    private final ConstraintLayout f31087G;

    /* renamed from: H */
    private final AbstractC12136z9 f31088H;

    /* renamed from: I */
    private final LinearLayout f31089I;

    /* renamed from: J */
    private InterfaceC1276g f31090J;

    /* renamed from: K */
    private InterfaceC1276g f31091K;

    /* renamed from: L */
    private InterfaceC1276g f31092L;

    /* renamed from: M */
    private InterfaceC1276g f31093M;

    /* renamed from: N */
    private InterfaceC1276g f31094N;

    /* renamed from: O */
    private ViewDataBinding.AbstractC1265k f31095O;

    /* renamed from: P */
    private ViewDataBinding.AbstractC1265k f31096P;

    /* renamed from: Q */
    private ViewDataBinding.AbstractC1265k f31097Q;

    /* renamed from: R */
    private ViewDataBinding.AbstractC1265k f31098R;

    /* renamed from: S */
    private ViewDataBinding.AbstractC1265k f31099S;

    /* renamed from: T */
    private long f31100T;

    /* compiled from: ActivityNewClubBabyBindingImpl.java */
    /* renamed from: wg.o1$a */
    /* loaded from: classes2.dex */
    class C11921a extends ViewDataBinding.AbstractC1265k {
        C11921a(int i) {
            super(i);
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m4463Q = C11920o1.this.f31009x.m4463Q();
            BabyClubViewModel babyClubViewModel = C11920o1.this.f31007E;
            if (babyClubViewModel != null) {
                C1436e0 m22003M0 = babyClubViewModel.m22003M0();
                if (m22003M0 != null) {
                    m22003M0.mo166p(m4463Q);
                }
            }
        }
    }

    /* compiled from: ActivityNewClubBabyBindingImpl.java */
    /* renamed from: wg.o1$b */
    /* loaded from: classes2.dex */
    class C11922b extends ViewDataBinding.AbstractC1265k {
        C11922b(int i) {
            super(i);
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m3700Q = C11920o1.this.f31010y.m3700Q();
            BabyClubViewModel babyClubViewModel = C11920o1.this.f31007E;
            if (babyClubViewModel != null) {
                C1436e0 m22012D0 = babyClubViewModel.m22012D0();
                if (m22012D0 != null) {
                    m22012D0.mo166p(m3700Q);
                }
            }
        }
    }

    /* compiled from: ActivityNewClubBabyBindingImpl.java */
    /* renamed from: wg.o1$c */
    /* loaded from: classes2.dex */
    class C11923c extends ViewDataBinding.AbstractC1265k {
        C11923c(int i) {
            super(i);
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean m3656Q = C11920o1.this.f31011z.m3656Q();
            BabyClubViewModel babyClubViewModel = C11920o1.this.f31007E;
            if (babyClubViewModel != null) {
                C1436e0 m22001O0 = babyClubViewModel.m22001O0();
                if (m22001O0 != null) {
                    m22001O0.mo166p(Boolean.valueOf(m3656Q));
                }
            }
        }
    }

    /* compiled from: ActivityNewClubBabyBindingImpl.java */
    /* renamed from: wg.o1$d */
    /* loaded from: classes2.dex */
    class C11924d extends ViewDataBinding.AbstractC1265k {
        C11924d(int i) {
            super(i);
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m3655R = C11920o1.this.f31011z.m3655R();
            BabyClubViewModel babyClubViewModel = C11920o1.this.f31007E;
            if (babyClubViewModel != null) {
                C1436e0 m22007I0 = babyClubViewModel.m22007I0();
                if (m22007I0 != null) {
                    m22007I0.mo166p(m3655R);
                }
            }
        }
    }

    /* compiled from: ActivityNewClubBabyBindingImpl.java */
    /* renamed from: wg.o1$e */
    /* loaded from: classes2.dex */
    class C11925e extends ViewDataBinding.AbstractC1265k {
        C11925e(int i) {
            super(i);
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            Boolean m3654S = C11920o1.this.f31011z.m3654S();
            BabyClubViewModel babyClubViewModel = C11920o1.this.f31007E;
            if (babyClubViewModel != null) {
                C1436e0 m22001O0 = babyClubViewModel.m22001O0();
                if (m22001O0 != null) {
                    m22001O0.mo166p(m3654S);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(10);
        f31085U = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image", "view_loading"}, new int[]{3, 7}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"view_for_baby_club_name", "view_for_baby_club_birthdate", "view_for_baby_club_id"}, new int[]{4, 5, 6}, new int[]{C2336R.layout.view_for_baby_club_name, C2336R.layout.view_for_baby_club_birthdate, C2336R.layout.view_for_baby_club_id});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31086V = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_step, 8);
        sparseIntArray.put(C2336R.C2338id.progress_bar, 9);
    }

    public C11920o1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 10, f31085U, f31086V));
    }

    /* renamed from: Q */
    private boolean m3969Q(AbstractC11693b8 abstractC11693b8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3968R(AbstractC12065v7 abstractC12065v7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3967S(AbstractC12099x7 abstractC12099x7, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3966T(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3965U(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3964V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 16384;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3963W(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3962X(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 8192;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3961Y(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3960Z(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m3959a0(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m3958b0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m3957c0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m3956d0(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private boolean m3955e0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31100T |= 64;
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
                return m3961Y((C1436e0) obj, i2);
            case 1:
                return m3957c0((LiveData) obj, i2);
            case 2:
                return m3968R((AbstractC12065v7) obj, i2);
            case 3:
                return m3959a0((C1436e0) obj, i2);
            case 4:
                return m3969Q((AbstractC11693b8) obj, i2);
            case 5:
                return m3958b0((LiveData) obj, i2);
            case 6:
                return m3955e0((LiveData) obj, i2);
            case 7:
                return m3963W((C1430c0) obj, i2);
            case 8:
                return m3960Z((LiveData) obj, i2);
            case 9:
                return m3966T((AbstractC11996rf) obj, i2);
            case 10:
                return m3967S((AbstractC12099x7) obj, i2);
            case 11:
                return m3965U((C1436e0) obj, i2);
            case 12:
                return m3956d0((C1436e0) obj, i2);
            case 13:
                return m3962X((LiveData) obj, i2);
            case 14:
                return m3964V((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31004B.mo3594K(interfaceC1491v);
        this.f31009x.mo3594K(interfaceC1491v);
        this.f31010y.mo3594K(interfaceC1491v);
        this.f31011z.mo3594K(interfaceC1491v);
        this.f31088H.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (49 == i) {
            m3954f0((Boolean) obj);
        } else if (109 != i) {
            return false;
        } else {
            m3953g0((BabyClubViewModel) obj);
        }
        return true;
    }

    /* renamed from: f0 */
    public void m3954f0(Boolean bool) {
        this.f31008F = bool;
        synchronized (this) {
            this.f31100T |= 32768;
        }
        m37781c(49);
        super.m37826E();
    }

    /* renamed from: g0 */
    public void m3953g0(BabyClubViewModel babyClubViewModel) {
        this.f31007E = babyClubViewModel;
        synchronized (this) {
            this.f31100T |= 65536;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016c  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11920o1.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31100T != 0) {
                return true;
            }
            return this.f31004B.mo3580u() || this.f31009x.mo3580u() || this.f31010y.mo3580u() || this.f31011z.mo3580u() || this.f31088H.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31100T = 131072L;
        }
        this.f31004B.mo3579w();
        this.f31009x.mo3579w();
        this.f31010y.mo3579w();
        this.f31011z.mo3579w();
        this.f31088H.mo3579w();
        m37826E();
    }

    private C11920o1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 15, (AbstractC11693b8) objArr[4], (AbstractC12065v7) objArr[5], (AbstractC12099x7) objArr[6], (TextView) objArr[8], (AbstractC11996rf) objArr[3], (LinearProgressIndicator) objArr[9], (MaterialButton) objArr[2]);
        this.f31095O = new C11921a(6);
        this.f31096P = new C11922b(21);
        this.f31097Q = new C11923c(23);
        this.f31098R = new C11924d(50);
        this.f31099S = new C11925e(56);
        this.f31100T = -1L;
        m37821J(this.f31009x);
        m37821J(this.f31010y);
        m37821J(this.f31011z);
        m37821J(this.f31004B);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31087G = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[7];
        this.f31088H = abstractC12136z9;
        m37821J(abstractC12136z9);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f31089I = linearLayout;
        linearLayout.setTag(null);
        this.f31006D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
