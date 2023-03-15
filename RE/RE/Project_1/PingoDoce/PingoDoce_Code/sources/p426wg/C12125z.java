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
import p278oi.EmailViewModel;

/* renamed from: wg.z */
/* loaded from: classes2.dex */
public class C12125z extends AbstractC12107y {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f32000H;

    /* renamed from: I */
    private static final SparseIntArray f32001I;

    /* renamed from: C */
    private final ScrollView f32002C;

    /* renamed from: D */
    private final ConstraintLayout f32003D;

    /* renamed from: E */
    private final TextInputLayout f32004E;

    /* renamed from: F */
    private InterfaceC1276g f32005F;

    /* renamed from: G */
    private long f32006G;

    /* compiled from: ActivityEmailBindingImpl.java */
    /* renamed from: wg.z$a */
    /* loaded from: classes2.dex */
    class C12126a implements InterfaceC1276g {
        C12126a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C12125z.this.f31917z);
            EmailViewModel emailViewModel = C12125z.this.f31914B;
            if (emailViewModel != null) {
                C1436e0 m16923x0 = emailViewModel.m16923x0();
                if (m16923x0 != null) {
                    m16923x0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(8);
        f32000H = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image"}, new int[]{6}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32001I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 7);
    }

    public C12125z(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f32000H, f32001I));
    }

    /* renamed from: Q */
    private boolean m3592Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3591R(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3590S(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3589T(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3588U(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3587V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3586W(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3585X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3584Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3583Z(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f32006G |= 256;
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
                return m3586W((LiveData) obj, i2);
            case 1:
                return m3587V((LiveData) obj, i2);
            case 2:
                return m3590S((LiveData) obj, i2);
            case 3:
                return m3591R((C1430c0) obj, i2);
            case 4:
                return m3585X((LiveData) obj, i2);
            case 5:
                return m3592Q((AbstractC11996rf) obj, i2);
            case 6:
                return m3584Y((LiveData) obj, i2);
            case 7:
                return m3589T((C1436e0) obj, i2);
            case 8:
                return m3583Z((LiveData) obj, i2);
            case 9:
                return m3588U((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31916y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3582a0((EmailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public void m3582a0(EmailViewModel emailViewModel) {
        this.f31914B = emailViewModel;
        synchronized (this) {
            this.f32006G |= 1024;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12125z.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f32006G != 0) {
                return true;
            }
            return this.f31916y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f32006G = 2048L;
        }
        this.f31916y.mo3579w();
        m37826E();
    }

    private C12125z(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 10, (TextView) objArr[2], (TextView) objArr[7], (AbstractC11996rf) objArr[6], (TextInputEditText) objArr[4], (MaterialButton) objArr[5]);
        this.f32005F = new C12126a();
        this.f32006G = -1L;
        this.f31915x.setTag(null);
        m37821J(this.f31916y);
        this.f31917z.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f32002C = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f32003D = constraintLayout;
        constraintLayout.setTag(null);
        TextInputLayout textInputLayout = (TextInputLayout) objArr[3];
        this.f32004E = textInputLayout;
        textInputLayout.setTag(null);
        this.f31913A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
