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
import p495zi.NifViewModel;

/* renamed from: wg.s1 */
/* loaded from: classes2.dex */
public class C12000s1 extends AbstractC11982r1 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f31420I;

    /* renamed from: J */
    private static final SparseIntArray f31421J;

    /* renamed from: C */
    private final ScrollView f31422C;

    /* renamed from: D */
    private final ConstraintLayout f31423D;

    /* renamed from: E */
    private final MaterialButton f31424E;

    /* renamed from: F */
    private final TextInputLayout f31425F;

    /* renamed from: G */
    private InterfaceC1276g f31426G;

    /* renamed from: H */
    private long f31427H;

    /* compiled from: ActivityNifBindingImpl.java */
    /* renamed from: wg.s1$a */
    /* loaded from: classes2.dex */
    class C12001a implements InterfaceC1276g {
        C12001a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C12000s1.this.f31355z);
            NifViewModel nifViewModel = C12000s1.this.f31352B;
            if (nifViewModel != null) {
                C1436e0 m84C0 = nifViewModel.m84C0();
                if (m84C0 != null) {
                    m84C0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(9);
        f31420I = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image"}, new int[]{7}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31421J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 8);
    }

    public C12000s1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31420I, f31421J));
    }

    /* renamed from: Q */
    private boolean m3811Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3810R(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3809S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3808T(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3807U(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3806V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3805W(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3804X(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3803Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3802Z(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31427H |= 128;
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
                return m3804X((LiveData) obj, i2);
            case 1:
                return m3805W((C1436e0) obj, i2);
            case 2:
                return m3806V((LiveData) obj, i2);
            case 3:
                return m3808T((LiveData) obj, i2);
            case 4:
                return m3810R((C1430c0) obj, i2);
            case 5:
                return m3803Y((LiveData) obj, i2);
            case 6:
                return m3811Q((AbstractC11996rf) obj, i2);
            case 7:
                return m3802Z((LiveData) obj, i2);
            case 8:
                return m3809S((LiveData) obj, i2);
            case 9:
                return m3807U((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31354y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3801a0((NifViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public void m3801a0(NifViewModel nifViewModel) {
        this.f31352B = nifViewModel;
        synchronized (this) {
            this.f31427H |= 1024;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12000s1.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31427H != 0) {
                return true;
            }
            return this.f31354y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31427H = 2048L;
        }
        this.f31354y.mo3579w();
        m37826E();
    }

    private C12000s1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 10, (TextView) objArr[3], (TextView) objArr[8], (AbstractC11996rf) objArr[7], (TextInputEditText) objArr[5], (MaterialButton) objArr[6]);
        this.f31426G = new C12001a();
        this.f31427H = -1L;
        this.f31353x.setTag(null);
        m37821J(this.f31354y);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f31422C = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31423D = constraintLayout;
        constraintLayout.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[2];
        this.f31424E = materialButton;
        materialButton.setTag(null);
        TextInputLayout textInputLayout = (TextInputLayout) objArr[4];
        this.f31425F = textInputLayout;
        textInputLayout.setTag(null);
        this.f31355z.setTag(null);
        this.f31351A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
