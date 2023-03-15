package p426wg;

import android.graphics.drawable.Drawable;
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
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import ki.C6676f;
import ki.SubmitAnimatedViewModel;
import p166ik.MyPdViewModel;

/* renamed from: wg.m1 */
/* loaded from: classes2.dex */
public class C11881m1 extends AbstractC11864l1 {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f30908J;

    /* renamed from: K */
    private static final SparseIntArray f30909K;

    /* renamed from: G */
    private final ScrollView f30910G;

    /* renamed from: H */
    private final ConstraintLayout f30911H;

    /* renamed from: I */
    private long f30912I;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(16);
        f30908J = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image"}, new int[]{3}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30909K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 4);
        sparseIntArray.put(C2336R.C2338id.const_subtitle, 5);
        sparseIntArray.put(C2336R.C2338id.const_title_secondary, 6);
        sparseIntArray.put(C2336R.C2338id.const_card_view, 7);
        sparseIntArray.put(C2336R.C2338id.card_bullet_1, 8);
        sparseIntArray.put(C2336R.C2338id.card_bullet_2, 9);
        sparseIntArray.put(C2336R.C2338id.card_bullet_3, 10);
        sparseIntArray.put(C2336R.C2338id.card_bullet_4, 11);
        sparseIntArray.put(C2336R.C2338id.img_teardrop_top_right, 12);
        sparseIntArray.put(C2336R.C2338id.img_teardrop_mid_left, 13);
        sparseIntArray.put(C2336R.C2338id.img_teardrop_bottom_left, 14);
        sparseIntArray.put(C2336R.C2338id.img_teardrop_bottom_right, 15);
    }

    public C11881m1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 16, f30908J, f30909K));
    }

    /* renamed from: Q */
    private boolean m4041Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30912I |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4040R(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30912I |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4039S(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30912I |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4038T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30912I |= 4;
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
                    return m4041Q((AbstractC11996rf) obj, i2);
                }
                return m4038T((LiveData) obj, i2);
            }
            return m4040R((LiveData) obj, i2);
        }
        return m4039S((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30828D.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4037U((MyPdViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m4037U(MyPdViewModel myPdViewModel) {
        this.f30830F = myPdViewModel;
        synchronized (this) {
            this.f30912I |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        C2381h c2381h;
        Drawable drawable;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        synchronized (this) {
            j = this.f30912I;
            this.f30912I = 0L;
        }
        SubmitAnimatedViewModel submitAnimatedViewModel = this.f30830F;
        int i = ((55 & j) > 0L ? 1 : ((55 & j) == 0L ? 0 : -1));
        boolean z = false;
        View.OnClickListener onClickListener = null;
        if (i != 0) {
            if (submitAnimatedViewModel != null) {
                liveData = submitAnimatedViewModel.m20327h0();
                liveData2 = submitAnimatedViewModel.m20331d0();
                liveData3 = submitAnimatedViewModel.m20326i0();
            } else {
                liveData = null;
                liveData2 = null;
                liveData3 = null;
            }
            m37818O(0, liveData);
            m37818O(1, liveData2);
            m37818O(2, liveData3);
            C2381h c2381h2 = liveData != null ? (C2381h) liveData.mo172f() : null;
            drawable = liveData2 != null ? (Drawable) liveData2.mo172f() : null;
            boolean m37823H = ViewDataBinding.m37823H(liveData3 != null ? (Boolean) liveData3.mo172f() : null);
            if ((j & 48) != 0 && submitAnimatedViewModel != null) {
                onClickListener = submitAnimatedViewModel.m20317r0();
            }
            c2381h = c2381h2;
            z = m37823H;
        } else {
            c2381h = null;
            drawable = null;
        }
        if ((j & 48) != 0) {
            this.f30829E.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            C6676f.m20308a(this.f30829E, drawable, c2381h, z, true);
        }
        ViewDataBinding.m37808m(this.f30828D);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30912I != 0) {
                return true;
            }
            return this.f30828D.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30912I = 32L;
        }
        this.f30828D.mo3579w();
        m37826E();
    }

    private C11881m1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[11], (MaterialCardView) objArr[7], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[6], (AbstractC11996rf) objArr[3], (ImageView) objArr[14], (ImageView) objArr[15], (ImageView) objArr[13], (ImageView) objArr[12], (MaterialButton) objArr[2]);
        this.f30912I = -1L;
        m37821J(this.f30828D);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f30910G = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30911H = constraintLayout;
        constraintLayout.setTag(null);
        this.f30829E.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
