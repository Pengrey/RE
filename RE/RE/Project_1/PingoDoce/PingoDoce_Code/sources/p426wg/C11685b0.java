package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import p408vk.OnboardingEmailSentViewModel;

/* renamed from: wg.b0 */
/* loaded from: classes2.dex */
public class C11685b0 extends AbstractC11667a0 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f29901I;

    /* renamed from: J */
    private static final SparseIntArray f29902J;

    /* renamed from: F */
    private final ConstraintLayout f29903F;

    /* renamed from: G */
    private final AbstractC12136z9 f29904G;

    /* renamed from: H */
    private long f29905H;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(9);
        f29901I = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image", "view_loading"}, new int[]{5, 6}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29902J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.email_sent_title, 7);
        sparseIntArray.put(C2336R.C2338id.email_subtitle, 8);
    }

    public C11685b0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f29901I, f29902J));
    }

    /* renamed from: Q */
    private boolean m4471Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29905H |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4470R(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29905H |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4469S(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29905H |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4468T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29905H |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4467U(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29905H |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4466V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29905H |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4465W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29905H |= 8;
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
                return m4468T((LiveData) obj, i2);
            case 1:
                return m4467U((LiveData) obj, i2);
            case 2:
                return m4470R((LiveData) obj, i2);
            case 3:
                return m4465W((LiveData) obj, i2);
            case 4:
                return m4469S((LiveData) obj, i2);
            case 5:
                return m4471Q((AbstractC11996rf) obj, i2);
            case 6:
                return m4466V((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29809A.mo3594K(interfaceC1491v);
        this.f29904G.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4464X((OnboardingEmailSentViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public void m4464X(OnboardingEmailSentViewModel onboardingEmailSentViewModel) {
        this.f29813E = onboardingEmailSentViewModel;
        synchronized (this) {
            this.f29905H |= 128;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11685b0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29905H != 0) {
                return true;
            }
            return this.f29809A.mo3580u() || this.f29904G.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29905H = 256L;
        }
        this.f29809A.mo3579w();
        this.f29904G.mo3579w();
        m37826E();
    }

    private C11685b0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 7, (MaterialButton) objArr[4], (MaterialButton) objArr[1], (MaterialButton) objArr[3], (AbstractC11996rf) objArr[5], (TextView) objArr[7], (TextView) objArr[8], (ImageView) objArr[2]);
        this.f29905H = -1L;
        this.f29814x.setTag(null);
        this.f29815y.setTag(null);
        this.f29816z.setTag(null);
        m37821J(this.f29809A);
        this.f29812D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29903F = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[6];
        this.f29904G = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37820L(view);
        mo3579w();
    }
}
