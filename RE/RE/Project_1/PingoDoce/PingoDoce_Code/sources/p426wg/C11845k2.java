package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import p187jk.PhoneViewModel;
import p246n2.C7629e;

/* renamed from: wg.k2 */
/* loaded from: classes2.dex */
public class C11845k2 extends AbstractC11828j2 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f30736K;

    /* renamed from: L */
    private static final SparseIntArray f30737L;

    /* renamed from: H */
    private final MaterialButton f30738H;

    /* renamed from: I */
    private InterfaceC1276g f30739I;

    /* renamed from: J */
    private long f30740J;

    /* compiled from: ActivityPhoneBindingImpl.java */
    /* renamed from: wg.k2$a */
    /* loaded from: classes2.dex */
    class C11846a implements InterfaceC1276g {
        C11846a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11845k2.this.f30627C);
            PhoneViewModel phoneViewModel = C11845k2.this.f30631G;
            if (phoneViewModel != null) {
                C1436e0 m20730C0 = phoneViewModel.m20730C0();
                if (m20730C0 != null) {
                    m20730C0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(11);
        f30736K = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image"}, new int[]{9}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30737L = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.tv_phone_input_label, 10);
    }

    public C11845k2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f30736K, f30737L));
    }

    /* renamed from: Q */
    private boolean m4133Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4132R(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4131S(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4130T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 8192;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4129U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4128V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4127W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4126X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4125Y(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4124Z(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m4123a0(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m4122b0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m4121c0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m4120d0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30740J |= 64;
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
                return m4125Y((LiveData) obj, i2);
            case 1:
                return m4129U((LiveData) obj, i2);
            case 2:
                return m4123a0((C1436e0) obj, i2);
            case 3:
                return m4121c0((LiveData) obj, i2);
            case 4:
                return m4132R((C1430c0) obj, i2);
            case 5:
                return m4126X((LiveData) obj, i2);
            case 6:
                return m4120d0((LiveData) obj, i2);
            case 7:
                return m4124Z((LiveData) obj, i2);
            case 8:
                return m4128V((LiveData) obj, i2);
            case 9:
                return m4131S((LiveData) obj, i2);
            case 10:
                return m4122b0((LiveData) obj, i2);
            case 11:
                return m4133Q((AbstractC11996rf) obj, i2);
            case 12:
                return m4127W((LiveData) obj, i2);
            case 13:
                return m4130T((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30626B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4119e0((PhoneViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public void m4119e0(PhoneViewModel phoneViewModel) {
        this.f30631G = phoneViewModel;
        synchronized (this) {
            this.f30740J |= 16384;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11845k2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30740J != 0) {
                return true;
            }
            return this.f30626B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30740J = 32768L;
        }
        this.f30626B.mo3579w();
        m37826E();
    }

    private C11845k2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 14, (CoordinatorLayout) objArr[0], (ConstraintLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[3], (AbstractC11996rf) objArr[9], (EditText) objArr[5], (MaterialButton) objArr[8], (TextInputLayout) objArr[6], (TextView) objArr[7], (TextView) objArr[10]);
        this.f30739I = new C11846a();
        this.f30740J = -1L;
        this.f30632x.setTag(null);
        this.f30633y.setTag(null);
        this.f30634z.setTag(null);
        this.f30625A.setTag(null);
        m37821J(this.f30626B);
        this.f30627C.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[2];
        this.f30738H = materialButton;
        materialButton.setTag(null);
        this.f30628D.setTag(null);
        this.f30629E.setTag(null);
        this.f30630F.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
