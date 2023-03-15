package p426wg;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.landing.lock.LockViewModel;

/* renamed from: wg.j0 */
/* loaded from: classes2.dex */
public class C11826j0 extends AbstractC11808i0 {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f30615Q;

    /* renamed from: R */
    private static final SparseIntArray f30616R;

    /* renamed from: L */
    private final CoordinatorLayout f30617L;

    /* renamed from: M */
    private final AbstractC12136z9 f30618M;

    /* renamed from: N */
    private final ProgressBar f30619N;

    /* renamed from: O */
    private final MaterialCardView f30620O;

    /* renamed from: P */
    private long f30621P;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(25);
        f30615Q = c1263i;
        c1263i.m37795a(0, new String[]{"bottomsheet_for_shopping_list", "view_loading"}, new int[]{13, 14}, new int[]{C2336R.layout.bottomsheet_for_shopping_list, C2336R.layout.view_loading});
        c1263i.m37795a(6, new String[]{"view_real_card_loyalty", "view_real_card_ompd"}, new int[]{11, 12}, new int[]{C2336R.layout.view_real_card_loyalty, C2336R.layout.view_real_card_ompd});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30616R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.logo_ImageView, 15);
        sparseIntArray.put(C2336R.C2338id.const_header, 16);
        sparseIntArray.put(C2336R.C2338id.cards_container, 17);
        sparseIntArray.put(C2336R.C2338id.ic_benefits, 18);
        sparseIntArray.put(C2336R.C2338id.const_benefits, 19);
        sparseIntArray.put(C2336R.C2338id.ic_clubs, 20);
        sparseIntArray.put(C2336R.C2338id.const_clubs, 21);
        sparseIntArray.put(C2336R.C2338id.img_bg_tr, 22);
        sparseIntArray.put(C2336R.C2338id.img_bg_ml, 23);
        sparseIntArray.put(C2336R.C2338id.img_bg_br, 24);
    }

    public C11826j0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 25, f30615Q, f30616R));
    }

    /* renamed from: R */
    private boolean m4165R(AbstractC11691b6 abstractC11691b6, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4164S(AbstractC12028tb abstractC12028tb, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4163T(AbstractC12069vb abstractC12069vb, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 131072;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4162U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 262144;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4161V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4160W(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4159X(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4158Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 16384;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4157Z(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m4156a0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m4155b0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 65536;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m4154c0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m4153d0(LiveData<LoyaltyCard> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private boolean m4152e0(LiveData<Bitmap> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 8192;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m4151f0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private boolean m4150g0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    private boolean m4149h0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m4148i0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 32768;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    private boolean m4147j0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30621P |= 32;
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
                return m4161V((LiveData) obj, i2);
            case 1:
                return m4156a0((LiveData) obj, i2);
            case 2:
                return m4165R((AbstractC11691b6) obj, i2);
            case 3:
                return m4154c0((LiveData) obj, i2);
            case 4:
                return m4160W((LiveData) obj, i2);
            case 5:
                return m4147j0((LiveData) obj, i2);
            case 6:
                return m4164S((AbstractC12028tb) obj, i2);
            case 7:
                return m4159X((LiveData) obj, i2);
            case 8:
                return m4153d0((LiveData) obj, i2);
            case 9:
                return m4149h0((LiveData) obj, i2);
            case 10:
                return m4151f0((LiveData) obj, i2);
            case 11:
                return m4157Z((LiveData) obj, i2);
            case 12:
                return m4150g0((LiveData) obj, i2);
            case 13:
                return m4152e0((LiveData) obj, i2);
            case 14:
                return m4158Y((LiveData) obj, i2);
            case 15:
                return m4148i0((LiveData) obj, i2);
            case 16:
                return m4155b0((LiveData) obj, i2);
            case 17:
                return m4163T((AbstractC12069vb) obj, i2);
            case 18:
                return m4162U((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30517H.mo3594K(interfaceC1491v);
        this.f30518I.mo3594K(interfaceC1491v);
        this.f30521x.mo3594K(interfaceC1491v);
        this.f30618M.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (55 == i) {
            mo4166Q((Integer) obj);
        } else if (109 != i) {
            return false;
        } else {
            m4146k0((LockViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11808i0
    /* renamed from: Q */
    public void mo4166Q(Integer num) {
        this.f30520K = num;
        synchronized (this) {
            this.f30621P |= 524288;
        }
        m37781c(55);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11826j0.mo3581k():void");
    }

    /* renamed from: k0 */
    public void m4146k0(LockViewModel lockViewModel) {
        this.f30519J = lockViewModel;
        synchronized (this) {
            this.f30621P |= 1048576;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30621P != 0) {
                return true;
            }
            return this.f30517H.mo3580u() || this.f30518I.mo3580u() || this.f30521x.mo3580u() || this.f30618M.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30621P = 2097152L;
        }
        this.f30517H.mo3579w();
        this.f30518I.mo3579w();
        this.f30521x.mo3579w();
        this.f30618M.mo3579w();
        m37826E();
    }

    private C11826j0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 19, (AbstractC11691b6) objArr[13], (MaterialCardView) objArr[7], (FrameLayout) objArr[6], (MaterialCardView) objArr[8], (FrameLayout) objArr[17], (TextView) objArr[19], (TextView) objArr[4], (ImageView) objArr[3], (TextView) objArr[21], (MaterialButton) objArr[9], (LinearLayout) objArr[16], (MaterialCardView) objArr[5], (TextView) objArr[1], (ImageView) objArr[18], (ImageView) objArr[20], (ImageView) objArr[24], (ImageView) objArr[23], (ImageView) objArr[22], (ImageView) objArr[15], (AbstractC12028tb) objArr[11], (AbstractC12069vb) objArr[12]);
        this.f30621P = -1L;
        m37821J(this.f30521x);
        this.f30522y.setTag(null);
        this.f30523z.setTag(null);
        this.f30510A.setTag(null);
        this.f30511B.setTag(null);
        this.f30512C.setTag(null);
        this.f30513D.setTag(null);
        this.f30514E.setTag(null);
        this.f30515F.setTag(null);
        m37821J(this.f30517H);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30617L = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[14];
        this.f30618M = abstractC12136z9;
        m37821J(abstractC12136z9);
        ProgressBar progressBar = (ProgressBar) objArr[10];
        this.f30619N = progressBar;
        progressBar.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[2];
        this.f30620O = materialCardView;
        materialCardView.setTag(null);
        m37821J(this.f30518I);
        m37820L(view);
        mo3579w();
    }
}
