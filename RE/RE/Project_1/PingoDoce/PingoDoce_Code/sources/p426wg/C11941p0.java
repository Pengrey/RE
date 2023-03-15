package p426wg;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import p389ui.LoyaltyCardViewModel;

/* renamed from: wg.p0 */
/* loaded from: classes2.dex */
public class C11941p0 extends AbstractC11919o0 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f31175G;

    /* renamed from: H */
    private static final SparseIntArray f31176H;

    /* renamed from: C */
    private final ConstraintLayout f31177C;

    /* renamed from: D */
    private final AbstractC11989r8 f31178D;

    /* renamed from: E */
    private final AbstractC11695ba f31179E;

    /* renamed from: F */
    private long f31180F;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f31175G = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_for_loyalty_card_requests", "view_loading_small"}, new int[]{2, 5, 6}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_for_loyalty_card_requests, C2336R.layout.view_loading_small});
        c1263i.m37795a(1, new String[]{"view_real_card_loyalty", "view_real_card_ompd"}, new int[]{3, 4}, new int[]{C2336R.layout.view_real_card_loyalty, C2336R.layout.view_real_card_ompd});
        f31176H = null;
    }

    public C11941p0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f31175G, f31176H));
    }

    /* renamed from: Q */
    private boolean m3915Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3914R(AbstractC12028tb abstractC12028tb, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3913S(AbstractC12069vb abstractC12069vb, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3912T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3911U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3910V(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3909W(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3908X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3907Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3906Z(LiveData<Bitmap> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31180F |= 64;
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
                return m3911U((LiveData) obj, i2);
            case 1:
                return m3907Y((LiveData) obj, i2);
            case 2:
                return m3915Q((AbstractC11917nf) obj, i2);
            case 3:
                return m3910V((LiveData) obj, i2);
            case 4:
                return m3908X((LiveData) obj, i2);
            case 5:
                return m3914R((AbstractC12028tb) obj, i2);
            case 6:
                return m3906Z((LiveData) obj, i2);
            case 7:
                return m3913S((AbstractC12069vb) obj, i2);
            case 8:
                return m3912T((LiveData) obj, i2);
            case 9:
                return m3909W((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31083y.mo3594K(interfaceC1491v);
        this.f31084z.mo3594K(interfaceC1491v);
        this.f31080A.mo3594K(interfaceC1491v);
        this.f31178D.mo3594K(interfaceC1491v);
        this.f31179E.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3905a0((LoyaltyCardViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public void m3905a0(LoyaltyCardViewModel loyaltyCardViewModel) {
        this.f31081B = loyaltyCardViewModel;
        synchronized (this) {
            this.f31180F |= 1024;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
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
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11941p0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31180F != 0) {
                return true;
            }
            return this.f31083y.mo3580u() || this.f31084z.mo3580u() || this.f31080A.mo3580u() || this.f31178D.mo3580u() || this.f31179E.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31180F = 2048L;
        }
        this.f31083y.mo3579w();
        this.f31084z.mo3579w();
        this.f31080A.mo3579w();
        this.f31178D.mo3579w();
        this.f31179E.mo3579w();
        m37826E();
    }

    private C11941p0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 10, (FrameLayout) objArr[1], null, null, (AbstractC11917nf) objArr[2], (AbstractC12028tb) objArr[3], (AbstractC12069vb) objArr[4]);
        this.f31180F = -1L;
        this.f31082x.setTag(null);
        m37821J(this.f31083y);
        m37821J(this.f31084z);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31177C = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11989r8 abstractC11989r8 = (AbstractC11989r8) objArr[5];
        this.f31178D = abstractC11989r8;
        m37821J(abstractC11989r8);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[6];
        this.f31179E = abstractC11695ba;
        m37821J(abstractC11695ba);
        m37821J(this.f31080A);
        m37820L(view);
        mo3579w();
    }
}
