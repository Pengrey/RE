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
import com.google.android.material.textfield.TextInputLayout;
import li.BirthdateViewModel;
import p246n2.C7629e;

/* renamed from: wg.n */
/* loaded from: classes2.dex */
public class C11900n extends AbstractC11879m {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f30990H;

    /* renamed from: I */
    private static final SparseIntArray f30991I;

    /* renamed from: D */
    private final ScrollView f30992D;

    /* renamed from: E */
    private final ConstraintLayout f30993E;

    /* renamed from: F */
    private InterfaceC1276g f30994F;

    /* renamed from: G */
    private long f30995G;

    /* compiled from: ActivityBirthdateBindingImpl.java */
    /* renamed from: wg.n$a */
    /* loaded from: classes2.dex */
    class C11901a implements InterfaceC1276g {
        C11901a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11900n.this.f30895x);
            BirthdateViewModel birthdateViewModel = C11900n.this.f30894C;
            if (birthdateViewModel != null) {
                C1436e0 m19402w0 = birthdateViewModel.m19402w0();
                if (m19402w0 != null) {
                    m19402w0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(9);
        f30990H = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image"}, new int[]{5}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30991I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 6);
        sparseIntArray.put(C2336R.C2338id.const_title_TextInputLayout, 7);
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 8);
    }

    public C11900n(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f30990H, f30991I));
    }

    /* renamed from: Q */
    private boolean m3991Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3990R(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3989S(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3988T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3987U(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3986V(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3985W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3984X(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30995G |= 64;
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
                return m3986V((LiveData) obj, i2);
            case 1:
                return m3990R((C1436e0) obj, i2);
            case 2:
                return m3987U((LiveData) obj, i2);
            case 3:
                return m3989S((C1430c0) obj, i2);
            case 4:
                return m3985W((LiveData) obj, i2);
            case 5:
                return m3991Q((AbstractC11996rf) obj, i2);
            case 6:
                return m3984X((LiveData) obj, i2);
            case 7:
                return m3988T((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30892A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3983Y((BirthdateViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void m3983Y(BirthdateViewModel birthdateViewModel) {
        this.f30894C = birthdateViewModel;
        synchronized (this) {
            this.f30995G |= 256;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11900n.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30995G != 0) {
                return true;
            }
            return this.f30892A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30995G = 512L;
        }
        this.f30892A.mo3579w();
        m37826E();
    }

    private C11900n(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 8, (TextView) objArr[3], (View) objArr[8], (TextView) objArr[2], (TextView) objArr[6], (TextInputLayout) objArr[7], (AbstractC11996rf) objArr[5], (MaterialButton) objArr[4]);
        this.f30994F = new C11901a();
        this.f30995G = -1L;
        this.f30895x.setTag(null);
        this.f30896y.setTag(null);
        m37821J(this.f30892A);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f30992D = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30993E = constraintLayout;
        constraintLayout.setTag(null);
        this.f30893B.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
