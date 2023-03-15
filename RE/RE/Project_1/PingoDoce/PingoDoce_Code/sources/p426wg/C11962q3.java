package p426wg;

import android.content.res.ColorStateList;
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
import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import p246n2.C7629e;
import p343rk.SmsTokenViewModel;

/* renamed from: wg.q3 */
/* loaded from: classes2.dex */
public class C11962q3 extends AbstractC11944p3 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f31270K;

    /* renamed from: L */
    private static final SparseIntArray f31271L;

    /* renamed from: F */
    private final ScrollView f31272F;

    /* renamed from: G */
    private final ConstraintLayout f31273G;

    /* renamed from: H */
    private final AbstractC11695ba f31274H;

    /* renamed from: I */
    private InterfaceC1276g f31275I;

    /* renamed from: J */
    private long f31276J;

    /* compiled from: ActivitySmsTokenBindingImpl.java */
    /* renamed from: wg.q3$a */
    /* loaded from: classes2.dex */
    class C11963a implements InterfaceC1276g {
        C11963a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11962q3.this.f31200x);
            SmsTokenViewModel smsTokenViewModel = C11962q3.this.f31199E;
            if (smsTokenViewModel != null) {
                C1436e0 m9682D0 = smsTokenViewModel.m9682D0();
                if (m9682D0 != null) {
                    m9682D0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(10);
        f31270K = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image", "view_loading_small"}, new int[]{6, 7}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading_small});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31271L = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.title_TextView, 8);
        sparseIntArray.put(C2336R.C2338id.desc_TextView, 9);
    }

    public C11962q3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 10, f31270K, f31271L));
    }

    /* renamed from: Q */
    private boolean m3871Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3870R(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3869S(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3868T(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3867U(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3866V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3865W(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3864X(LiveData<ColorStateList> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3863Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3862Z(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31276J |= 128;
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
                return m3864X((LiveData) obj, i2);
            case 1:
                return m3865W((LiveData) obj, i2);
            case 2:
                return m3863Y((LiveData) obj, i2);
            case 3:
                return m3866V((LiveData) obj, i2);
            case 4:
                return m3869S((C1436e0) obj, i2);
            case 5:
                return m3868T((LiveData) obj, i2);
            case 6:
                return m3870R((C1430c0) obj, i2);
            case 7:
                return m3862Z((LiveData) obj, i2);
            case 8:
                return m3871Q((AbstractC11996rf) obj, i2);
            case 9:
                return m3867U((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31195A.mo3594K(interfaceC1491v);
        this.f31274H.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3861a0((SmsTokenViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public void m3861a0(SmsTokenViewModel smsTokenViewModel) {
        this.f31199E = smsTokenViewModel;
        synchronized (this) {
            this.f31276J |= 1024;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11962q3.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31276J != 0) {
                return true;
            }
            return this.f31195A.mo3580u() || this.f31274H.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31276J = 2048L;
        }
        this.f31195A.mo3579w();
        this.f31274H.mo3579w();
        m37826E();
    }

    private C11962q3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 10, (PinEntryEditText) objArr[3], (TextInputLayout) objArr[2], (MaterialButton) objArr[4], (AbstractC11996rf) objArr[6], (TextView) objArr[9], (MaterialButton) objArr[5], (TextView) objArr[8]);
        this.f31275I = new C11963a();
        this.f31276J = -1L;
        this.f31200x.setTag(null);
        this.f31201y.setTag(null);
        this.f31202z.setTag(null);
        m37821J(this.f31195A);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f31272F = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31273G = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[7];
        this.f31274H = abstractC11695ba;
        m37821J(abstractC11695ba);
        this.f31197C.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
