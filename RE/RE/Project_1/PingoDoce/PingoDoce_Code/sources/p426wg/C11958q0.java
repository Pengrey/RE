package p426wg;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import p389ui.LoyaltyCardViewModel;

/* renamed from: wg.q0 */
/* loaded from: classes2.dex */
public class C11958q0 extends AbstractC11919o0 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f31252E;

    /* renamed from: F */
    private static final SparseIntArray f31253F;

    /* renamed from: C */
    private final FrameLayout f31254C;

    /* renamed from: D */
    private long f31255D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f31252E = c1263i;
        c1263i.m37795a(1, new String[]{"view_real_card_loyalty", "view_real_card_ompd"}, new int[]{2, 3}, new int[]{C2336R.layout.view_real_card_loyalty, C2336R.layout.view_real_card_ompd});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31253F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_guideline, 4);
        sparseIntArray.put(C2336R.C2338id.cardView, 5);
    }

    public C11958q0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31252E, f31253F));
    }

    /* renamed from: Q */
    private boolean m3894Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3893R(AbstractC12028tb abstractC12028tb, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3892S(AbstractC12069vb abstractC12069vb, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3891T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3890U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3889V(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3888W(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3887X(LiveData<Bitmap> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31255D |= 16;
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
                return m3890U((LiveData) obj, i2);
            case 1:
                return m3894Q((AbstractC11917nf) obj, i2);
            case 2:
                return m3889V((LiveData) obj, i2);
            case 3:
                return m3893R((AbstractC12028tb) obj, i2);
            case 4:
                return m3887X((LiveData) obj, i2);
            case 5:
                return m3892S((AbstractC12069vb) obj, i2);
            case 6:
                return m3891T((LiveData) obj, i2);
            case 7:
                return m3888W((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31084z.mo3594K(interfaceC1491v);
        this.f31080A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3886Y((LoyaltyCardViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void m3886Y(LoyaltyCardViewModel loyaltyCardViewModel) {
        this.f31081B = loyaltyCardViewModel;
        synchronized (this) {
            this.f31255D |= 256;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00af  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11958q0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31255D != 0) {
                return true;
            }
            return this.f31084z.mo3580u() || this.f31080A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31255D = 512L;
        }
        this.f31084z.mo3579w();
        this.f31080A.mo3579w();
        m37826E();
    }

    private C11958q0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 8, (FrameLayout) objArr[1], (MaterialCardView) objArr[5], (Guideline) objArr[4], null, (AbstractC12028tb) objArr[2], (AbstractC12069vb) objArr[3]);
        this.f31255D = -1L;
        this.f31082x.setTag(null);
        m37821J(this.f31084z);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31254C = frameLayout;
        frameLayout.setTag(null);
        m37821J(this.f31080A);
        m37820L(view);
        mo3579w();
    }
}
