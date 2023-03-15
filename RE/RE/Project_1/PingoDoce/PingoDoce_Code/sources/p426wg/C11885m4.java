package p426wg;

import android.graphics.drawable.Drawable;
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
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p069dl.UserDataViewModel;
import p246n2.C7629e;

/* renamed from: wg.m4 */
/* loaded from: classes2.dex */
public class C11885m4 extends AbstractC11867l4 {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f30928H;

    /* renamed from: I */
    private static final SparseIntArray f30929I;

    /* renamed from: C */
    private final ConstraintLayout f30930C;

    /* renamed from: D */
    private final TextInputEditText f30931D;

    /* renamed from: E */
    private InterfaceC1276g f30932E;

    /* renamed from: F */
    private InterfaceC1276g f30933F;

    /* renamed from: G */
    private long f30934G;

    /* compiled from: ActivityUserdataFormBindingImpl.java */
    /* renamed from: wg.m4$a */
    /* loaded from: classes2.dex */
    class C11886a implements InterfaceC1276g {
        C11886a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11885m4.this.f30848y);
            UserDataViewModel userDataViewModel = C11885m4.this.f30845A;
            if (userDataViewModel != null) {
                C1436e0 m26338z0 = userDataViewModel.m26338z0();
                if (m26338z0 != null) {
                    m26338z0.mo166p(m17891a);
                }
            }
        }
    }

    /* compiled from: ActivityUserdataFormBindingImpl.java */
    /* renamed from: wg.m4$b */
    /* loaded from: classes2.dex */
    class C11887b implements InterfaceC1276g {
        C11887b() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11885m4.this.f30931D);
            UserDataViewModel userDataViewModel = C11885m4.this.f30845A;
            if (userDataViewModel != null) {
                C1436e0 m26347B0 = userDataViewModel.m26347B0();
                if (m26347B0 != null) {
                    m26347B0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f30928H = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{4}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30929I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 5);
        sparseIntArray.put(C2336R.C2338id.const_title_TextInputLayout, 6);
    }

    public C11885m4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f30928H, f30929I));
    }

    /* renamed from: S */
    private boolean m4021S(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30934G |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4020T(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30934G |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4019U(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30934G |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4018V(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30934G |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4017W(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30934G |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4016X(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30934G |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4015Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30934G |= 32;
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
                return m4016X((LiveData) obj, i2);
            case 1:
                return m4017W((C1436e0) obj, i2);
            case 2:
                return m4018V((C1436e0) obj, i2);
            case 3:
                return m4019U((LiveData) obj, i2);
            case 4:
                return m4020T((C1430c0) obj, i2);
            case 5:
                return m4015Y((LiveData) obj, i2);
            case 6:
                return m4021S((AbstractC11996rf) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30847x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (49 == i) {
            mo4023Q((Boolean) obj);
        } else if (109 != i) {
            return false;
        } else {
            m4014Z((UserDataViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11867l4
    /* renamed from: Q */
    public void mo4023Q(Boolean bool) {
        this.f30846B = bool;
        synchronized (this) {
            this.f30934G |= 128;
        }
        m37781c(49);
        super.m37826E();
    }

    /* renamed from: Z */
    public void m4014Z(UserDataViewModel userDataViewModel) {
        this.f30845A = userDataViewModel;
        synchronized (this) {
            this.f30934G |= 256;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8 A[ADDED_TO_REGION] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11885m4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30934G != 0) {
                return true;
            }
            return this.f30847x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30934G = 512L;
        }
        this.f30847x.mo3579w();
        m37826E();
    }

    private C11885m4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 7, (TextView) objArr[5], (TextInputLayout) objArr[6], (AbstractC11996rf) objArr[4], (TextInputEditText) objArr[1], (MaterialButton) objArr[3]);
        this.f30932E = new C11886a();
        this.f30933F = new C11887b();
        this.f30934G = -1L;
        m37821J(this.f30847x);
        this.f30848y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30930C = constraintLayout;
        constraintLayout.setTag(null);
        TextInputEditText textInputEditText = (TextInputEditText) objArr[2];
        this.f30931D = textInputEditText;
        textInputEditText.setTag(null);
        this.f30849z.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
