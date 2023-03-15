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
import ck.CardRegistrationStatusViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.y0 */
/* loaded from: classes2.dex */
public class C12108y0 extends AbstractC12092x0 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f31918I;

    /* renamed from: J */
    private static final SparseIntArray f31919J;

    /* renamed from: F */
    private final ConstraintLayout f31920F;

    /* renamed from: G */
    private final MaterialButton f31921G;

    /* renamed from: H */
    private long f31922H;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(9);
        f31918I = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{8}, new int[]{C2336R.layout.view_toolbar_with_image});
        f31919J = null;
    }

    public C12108y0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31918I, f31919J));
    }

    /* renamed from: Q */
    private boolean m3649Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3648R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3647S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3646T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3645U(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3644V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3643W(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3642X(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3641Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3640Z(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m3639a0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m3638b0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m3637c0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31922H |= 256;
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
                return m3643W((LiveData) obj, i2);
            case 1:
                return m3642X((LiveData) obj, i2);
            case 2:
                return m3641Y((LiveData) obj, i2);
            case 3:
                return m3648R((LiveData) obj, i2);
            case 4:
                return m3645U((LiveData) obj, i2);
            case 5:
                return m3647S((LiveData) obj, i2);
            case 6:
                return m3639a0((LiveData) obj, i2);
            case 7:
                return m3649Q((AbstractC11996rf) obj, i2);
            case 8:
                return m3637c0((LiveData) obj, i2);
            case 9:
                return m3640Z((LiveData) obj, i2);
            case 10:
                return m3646T((LiveData) obj, i2);
            case 11:
                return m3638b0((LiveData) obj, i2);
            case 12:
                return m3644V((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31829A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3636d0((CardRegistrationStatusViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public void m3636d0(CardRegistrationStatusViewModel cardRegistrationStatusViewModel) {
        this.f31833E = cardRegistrationStatusViewModel;
        synchronized (this) {
            this.f31922H |= 8192;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12108y0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31922H != 0) {
                return true;
            }
            return this.f31829A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31922H = 16384L;
        }
        this.f31829A.mo3579w();
        m37826E();
    }

    private C12108y0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 13, (MaterialButton) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (AbstractC11996rf) objArr[8], (ImageView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.f31922H = -1L;
        this.f31834x.setTag(null);
        this.f31835y.setTag(null);
        this.f31836z.setTag(null);
        m37821J(this.f31829A);
        this.f31830B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31920F = constraintLayout;
        constraintLayout.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[7];
        this.f31921G = materialButton;
        materialButton.setTag(null);
        this.f31831C.setTag(null);
        this.f31832D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
