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
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel;

/* renamed from: wg.f */
/* loaded from: classes2.dex */
public class C11753f extends AbstractC11736e {

    /* renamed from: L */
    private static final ViewDataBinding.C1263i f30256L;

    /* renamed from: M */
    private static final SparseIntArray f30257M;

    /* renamed from: G */
    private final AbstractC12136z9 f30258G;

    /* renamed from: H */
    private final ImageView f30259H;

    /* renamed from: I */
    private final ConstraintLayout f30260I;

    /* renamed from: J */
    private final LinearLayout f30261J;

    /* renamed from: K */
    private long f30262K;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(14);
        f30256L = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{8, 11}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        c1263i.m37795a(3, new String[]{"view_for_baby_club_why_to", "view_for_clubs_know_more"}, new int[]{9, 10}, new int[]{C2336R.layout.view_for_baby_club_why_to, C2336R.layout.view_for_clubs_know_more});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30257M = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.card, 12);
        sparseIntArray.put(C2336R.C2338id.card_title, 13);
    }

    public C11753f(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 14, f30256L, f30257M));
    }

    /* renamed from: Q */
    private boolean m4348Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4347R(AbstractC11728d8 abstractC11728d8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4346S(AbstractC11762f8 abstractC11762f8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4345T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4344U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4343V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4342W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4341X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30262K |= 4;
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
                return m4344U((LiveData) obj, i2);
            case 1:
                return m4343V((LiveData) obj, i2);
            case 2:
                return m4341X((LiveData) obj, i2);
            case 3:
                return m4347R((AbstractC11728d8) obj, i2);
            case 4:
                return m4346S((AbstractC11762f8) obj, i2);
            case 5:
                return m4348Q((AbstractC11917nf) obj, i2);
            case 6:
                return m4342W((LiveData) obj, i2);
            case 7:
                return m4345T((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30166z.mo3594K(interfaceC1491v);
        this.f30161D.mo3594K(interfaceC1491v);
        this.f30162E.mo3594K(interfaceC1491v);
        this.f30258G.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4340Y((BabyClubHomeViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void m4340Y(BabyClubHomeViewModel babyClubHomeViewModel) {
        this.f30163F = babyClubHomeViewModel;
        synchronized (this) {
            this.f30262K |= 256;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee A[ADDED_TO_REGION] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11753f.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30262K != 0) {
                return true;
            }
            return this.f30166z.mo3580u() || this.f30161D.mo3580u() || this.f30162E.mo3580u() || this.f30258G.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30262K = 512L;
        }
        this.f30166z.mo3579w();
        this.f30161D.mo3579w();
        this.f30162E.mo3579w();
        this.f30258G.mo3579w();
        m37826E();
    }

    private C11753f(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 8, (RecyclerView) objArr[4], (LinearLayout) objArr[12], (TextView) objArr[13], (ConstraintLayout) objArr[0], (AbstractC11917nf) objArr[8], (MaterialButton) objArr[7], (MaterialButton) objArr[6], (TextView) objArr[5], (AbstractC11728d8) objArr[9], (AbstractC11762f8) objArr[10]);
        this.f30262K = -1L;
        this.f30164x.setTag(null);
        this.f30165y.setTag(null);
        m37821J(this.f30166z);
        this.f30158A.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[11];
        this.f30258G = abstractC12136z9;
        m37821J(abstractC12136z9);
        ImageView imageView = (ImageView) objArr[1];
        this.f30259H = imageView;
        imageView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.f30260I = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[3];
        this.f30261J = linearLayout;
        linearLayout.setTag(null);
        this.f30159B.setTag(null);
        this.f30160C.setTag(null);
        m37821J(this.f30161D);
        m37821J(this.f30162E);
        m37820L(view);
        mo3579w();
    }
}
