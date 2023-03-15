package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import p144hi.ClubViewModel;

/* renamed from: wg.r */
/* loaded from: classes2.dex */
public class C11980r extends AbstractC11957q {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f31340Q;

    /* renamed from: R */
    private static final SparseIntArray f31341R;

    /* renamed from: N */
    private final ScrollView f31342N;

    /* renamed from: O */
    private final AbstractC12136z9 f31343O;

    /* renamed from: P */
    private long f31344P;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(21);
        f31340Q = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image", "view_loading"}, new int[]{8, 9}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31341R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 10);
        sparseIntArray.put(C2336R.C2338id.const_subtitle, 11);
        sparseIntArray.put(C2336R.C2338id.clubs_list, 12);
        sparseIntArray.put(C2336R.C2338id.card, 13);
        sparseIntArray.put(C2336R.C2338id.baby_card_title, 14);
        sparseIntArray.put(C2336R.C2338id.baby_card_description, 15);
        sparseIntArray.put(C2336R.C2338id.baby_card_description_request_date, 16);
        sparseIntArray.put(C2336R.C2338id.wine_card, 17);
        sparseIntArray.put(C2336R.C2338id.wine_card_title, 18);
        sparseIntArray.put(C2336R.C2338id.wine_card_description, 19);
        sparseIntArray.put(C2336R.C2338id.wine_card_description_request_date, 20);
    }

    public C11980r(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 21, f31340Q, f31341R));
    }

    /* renamed from: Q */
    private boolean m3834Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31344P |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3833R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31344P |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3832S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31344P |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3831T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31344P |= 4;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return m3834Q((AbstractC11996rf) obj, i2);
                }
                return m3831T((LiveData) obj, i2);
            }
            return m3833R((LiveData) obj, i2);
        }
        return m3832S((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31241F.mo3594K(interfaceC1491v);
        this.f31343O.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3830U((ClubViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m3830U(ClubViewModel clubViewModel) {
        this.f31248M = clubViewModel;
        synchronized (this) {
            this.f31344P |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11980r.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31344P != 0) {
                return true;
            }
            return this.f31241F.mo3580u() || this.f31343O.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31344P = 32L;
        }
        this.f31241F.mo3579w();
        this.f31343O.mo3579w();
        m37826E();
    }

    private C11980r(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (TextView) objArr[15], (TextView) objArr[16], (TextView) objArr[14], (MaterialButton) objArr[3], (MaterialButton) objArr[4], (ImageView) objArr[2], (MaterialCardView) objArr[13], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[12], (TextView) objArr[11], (TextView) objArr[10], (AbstractC11996rf) objArr[8], (MaterialCardView) objArr[17], (TextView) objArr[19], (TextView) objArr[20], (TextView) objArr[18], (MaterialButton) objArr[6], (MaterialButton) objArr[7], (ImageView) objArr[5]);
        this.f31344P = -1L;
        this.f31236A.setTag(null);
        this.f31237B.setTag(null);
        this.f31238C.setTag(null);
        this.f31239D.setTag(null);
        m37821J(this.f31241F);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f31342N = scrollView;
        scrollView.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[9];
        this.f31343O = abstractC12136z9;
        m37821J(abstractC12136z9);
        this.f31245J.setTag(null);
        this.f31246K.setTag(null);
        this.f31247L.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
