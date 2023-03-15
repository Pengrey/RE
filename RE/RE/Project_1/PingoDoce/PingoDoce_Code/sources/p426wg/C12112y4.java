package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.clubs.wine.WineClubHomeViewModel;

/* renamed from: wg.y4 */
/* loaded from: classes2.dex */
public class C12112y4 extends AbstractC12096x4 {

    /* renamed from: L */
    private static final ViewDataBinding.C1263i f31944L;

    /* renamed from: M */
    private static final SparseIntArray f31945M;

    /* renamed from: G */
    private final AbstractC12136z9 f31946G;

    /* renamed from: H */
    private final ImageView f31947H;

    /* renamed from: I */
    private final ConstraintLayout f31948I;

    /* renamed from: J */
    private final LinearLayout f31949J;

    /* renamed from: K */
    private long f31950K;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(14);
        f31944L = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{7, 11}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        c1263i.m37795a(4, new String[]{"view_for_wine_club_why_to", "view_for_wine_club_preferences", "view_for_clubs_know_more"}, new int[]{8, 9, 10}, new int[]{C2336R.layout.view_for_wine_club_why_to, C2336R.layout.view_for_wine_club_preferences, C2336R.layout.view_for_clubs_know_more});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31945M = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.card, 12);
        sparseIntArray.put(C2336R.C2338id.card_title, 13);
    }

    public C12112y4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 14, f31944L, f31945M));
    }

    /* renamed from: Q */
    private boolean m3623Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3622R(AbstractC11762f8 abstractC11762f8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3621S(AbstractC11911n9 abstractC11911n9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3620T(AbstractC12026t9 abstractC12026t9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3619U(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3618V(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3617W(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3616X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m3615Y(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m3614Z(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31950K |= 128;
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
                return m3616X((LiveData) obj, i2);
            case 1:
                return m3618V((C1436e0) obj, i2);
            case 2:
                return m3622R((AbstractC11762f8) obj, i2);
            case 3:
                return m3615Y((LiveData) obj, i2);
            case 4:
                return m3619U((C1436e0) obj, i2);
            case 5:
                return m3620T((AbstractC12026t9) obj, i2);
            case 6:
                return m3623Q((AbstractC11917nf) obj, i2);
            case 7:
                return m3614Z((LiveData) obj, i2);
            case 8:
                return m3617W((LiveData) obj, i2);
            case 9:
                return m3621S((AbstractC11911n9) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31865y.mo3594K(interfaceC1491v);
        this.f31862E.mo3594K(interfaceC1491v);
        this.f31861D.mo3594K(interfaceC1491v);
        this.f31860C.mo3594K(interfaceC1491v);
        this.f31946G.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3613a0((WineClubHomeViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public void m3613a0(WineClubHomeViewModel wineClubHomeViewModel) {
        this.f31863F = wineClubHomeViewModel;
        synchronized (this) {
            this.f31950K |= 1024;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12112y4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31950K != 0) {
                return true;
            }
            return this.f31865y.mo3580u() || this.f31862E.mo3580u() || this.f31861D.mo3580u() || this.f31860C.mo3580u() || this.f31946G.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31950K = 2048L;
        }
        this.f31865y.mo3579w();
        this.f31862E.mo3579w();
        this.f31861D.mo3579w();
        this.f31860C.mo3579w();
        this.f31946G.mo3579w();
        m37826E();
    }

    private C12112y4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 10, (LinearLayout) objArr[12], (TextView) objArr[13], (ConstraintLayout) objArr[0], (AbstractC11917nf) objArr[7], (MaterialButton) objArr[6], (TextView) objArr[5], (MaterialButton) objArr[1], (AbstractC11762f8) objArr[10], (AbstractC11911n9) objArr[9], (AbstractC12026t9) objArr[8]);
        this.f31950K = -1L;
        this.f31864x.setTag(null);
        m37821J(this.f31865y);
        this.f31866z.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[11];
        this.f31946G = abstractC12136z9;
        m37821J(abstractC12136z9);
        ImageView imageView = (ImageView) objArr[2];
        this.f31947H = imageView;
        imageView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[3];
        this.f31948I = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[4];
        this.f31949J = linearLayout;
        linearLayout.setTag(null);
        this.f31858A.setTag(null);
        this.f31859B.setTag(null);
        m37821J(this.f31860C);
        m37821J(this.f31861D);
        m37821J(this.f31862E);
        m37820L(view);
        mo3579w();
    }
}
