package p426wg;

import android.util.SparseIntArray;
import android.view.View;
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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p246n2.C7629e;
import p473yi.VirtualCardDataConfirmationViewModel;

/* renamed from: wg.g1 */
/* loaded from: classes2.dex */
public class C11772g1 extends AbstractC11755f1 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f30354I;

    /* renamed from: J */
    private static final SparseIntArray f30355J;

    /* renamed from: B */
    private final ConstraintLayout f30356B;

    /* renamed from: C */
    private final TextInputLayout f30357C;

    /* renamed from: D */
    private final TextInputEditText f30358D;

    /* renamed from: E */
    private final TextInputEditText f30359E;

    /* renamed from: F */
    private final TextInputEditText f30360F;

    /* renamed from: G */
    private InterfaceC1276g f30361G;

    /* renamed from: H */
    private long f30362H;

    /* compiled from: ActivityLoyaltyUserDataConfirmationBindingImpl.java */
    /* renamed from: wg.g1$a */
    /* loaded from: classes2.dex */
    class C11773a implements InterfaceC1276g {
        C11773a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11772g1.this.f30358D);
            VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel = C11772g1.this.f30277A;
            if (virtualCardDataConfirmationViewModel != null) {
                C1436e0 m1388c0 = virtualCardDataConfirmationViewModel.m1388c0();
                if (m1388c0 != null) {
                    m1388c0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(11);
        f30354I = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{7}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30355J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.data_confirmation_title, 8);
        sparseIntArray.put(C2336R.C2338id.data_confirmation_desc, 9);
        sparseIntArray.put(C2336R.C2338id.const_title_TextInputLayout, 10);
    }

    public C11772g1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f30354I, f30355J));
    }

    /* renamed from: R */
    private boolean m4299R(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4298S(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4297T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4296U(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4295V(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4294W(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4293X(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4292Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30362H |= 1;
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
                return m4292Y((LiveData) obj, i2);
            case 1:
                return m4294W((C1436e0) obj, i2);
            case 2:
                return m4295V((LiveData) obj, i2);
            case 3:
                return m4293X((LiveData) obj, i2);
            case 4:
                return m4298S((C1430c0) obj, i2);
            case 5:
                return m4299R((AbstractC11996rf) obj, i2);
            case 6:
                return m4296U((LiveData) obj, i2);
            case 7:
                return m4297T((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30279y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4291Z((VirtualCardDataConfirmationViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public void m4291Z(VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel) {
        this.f30277A = virtualCardDataConfirmationViewModel;
        synchronized (this) {
            this.f30362H |= 256;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11772g1.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30362H != 0) {
                return true;
            }
            return this.f30279y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30362H = 512L;
        }
        this.f30279y.mo3579w();
        m37826E();
    }

    private C11772g1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 8, (MaterialButton) objArr[6], (TextInputLayout) objArr[10], (AbstractC11996rf) objArr[7], (TextView) objArr[9], (TextView) objArr[8], (TextInputEditText) objArr[1]);
        this.f30361G = new C11773a();
        this.f30362H = -1L;
        this.f30278x.setTag(null);
        m37821J(this.f30279y);
        this.f30280z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30356B = constraintLayout;
        constraintLayout.setTag(null);
        TextInputLayout textInputLayout = (TextInputLayout) objArr[2];
        this.f30357C = textInputLayout;
        textInputLayout.setTag(null);
        TextInputEditText textInputEditText = (TextInputEditText) objArr[3];
        this.f30358D = textInputEditText;
        textInputEditText.setTag(null);
        TextInputEditText textInputEditText2 = (TextInputEditText) objArr[4];
        this.f30359E = textInputEditText2;
        textInputEditText2.setTag(null);
        TextInputEditText textInputEditText3 = (TextInputEditText) objArr[5];
        this.f30360F = textInputEditText3;
        textInputEditText3.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
