package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
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
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p246n2.C7629e;
import vi.LoyaltyCardInsertViewModel;

/* renamed from: wg.s0 */
/* loaded from: classes2.dex */
public class C11998s0 extends AbstractC11981r0 {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f31413H;

    /* renamed from: I */
    private static final SparseIntArray f31414I;

    /* renamed from: D */
    private final ScrollView f31415D;

    /* renamed from: E */
    private final ConstraintLayout f31416E;

    /* renamed from: F */
    private InterfaceC1276g f31417F;

    /* renamed from: G */
    private long f31418G;

    /* compiled from: ActivityLoyaltyCardInsertBindingImpl.java */
    /* renamed from: wg.s0$a */
    /* loaded from: classes2.dex */
    class C11999a implements InterfaceC1276g {
        C11999a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11998s0.this.f31348x);
            LoyaltyCardInsertViewModel loyaltyCardInsertViewModel = C11998s0.this.f31346B;
            if (loyaltyCardInsertViewModel != null) {
                C1436e0 m5311x0 = loyaltyCardInsertViewModel.m5311x0();
                if (m5311x0 != null) {
                    m5311x0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f31413H = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image"}, new int[]{5}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31414I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 6);
    }

    public C11998s0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f31413H, f31414I));
    }

    /* renamed from: R */
    private boolean m3820R(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3819S(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3818T(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3817U(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3816V(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3815W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3814X(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3813Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31418G |= 32;
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
                return m3814X((LiveData) obj, i2);
            case 1:
                return m3815W((LiveData) obj, i2);
            case 2:
                return m3818T((C1436e0) obj, i2);
            case 3:
                return m3817U((LiveData) obj, i2);
            case 4:
                return m3819S((C1430c0) obj, i2);
            case 5:
                return m3813Y((LiveData) obj, i2);
            case 6:
                return m3820R((AbstractC11996rf) obj, i2);
            case 7:
                return m3816V((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31350z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (49 == i) {
            mo3821Q((Boolean) obj);
        } else if (109 != i) {
            return false;
        } else {
            m3812Z((LoyaltyCardInsertViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11981r0
    /* renamed from: Q */
    public void mo3821Q(Boolean bool) {
        this.f31347C = bool;
        synchronized (this) {
            this.f31418G |= 256;
        }
        m37781c(49);
        super.m37826E();
    }

    /* renamed from: Z */
    public void m3812Z(LoyaltyCardInsertViewModel loyaltyCardInsertViewModel) {
        this.f31346B = loyaltyCardInsertViewModel;
        synchronized (this) {
            this.f31418G |= 512;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11998s0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31418G != 0) {
                return true;
            }
            return this.f31350z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31418G = 1024L;
        }
        this.f31350z.mo3579w();
        m37826E();
    }

    private C11998s0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 8, (TextInputEditText) objArr[3], (TextInputLayout) objArr[2], (TextView) objArr[6], (AbstractC11996rf) objArr[5], (MaterialButton) objArr[4]);
        this.f31417F = new C11999a();
        this.f31418G = -1L;
        this.f31348x.setTag(null);
        this.f31349y.setTag(null);
        m37821J(this.f31350z);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f31415D = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31416E = constraintLayout;
        constraintLayout.setTag(null);
        this.f31345A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
