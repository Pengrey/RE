package p426wg;

import android.text.Spanned;
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
import com.google.android.material.button.MaterialButton;
import p164ii.BabyClubWelcomeViewModel;
import p246n2.C7629e;

/* renamed from: wg.h */
/* loaded from: classes2.dex */
public class C11790h extends AbstractC11770g {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f30434E;

    /* renamed from: F */
    private static final SparseIntArray f30435F;

    /* renamed from: C */
    private final ConstraintLayout f30436C;

    /* renamed from: D */
    private long f30437D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f30434E = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{4}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30435F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.welcome_to_club_title, 5);
        sparseIntArray.put(C2336R.C2338id.ic_check_mark, 6);
    }

    public C11790h(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f30434E, f30435F));
    }

    /* renamed from: Q */
    private boolean m4237Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30437D |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4236R(LiveData<Spanned> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30437D |= 1;
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
                return false;
            }
            return m4237Q((AbstractC11996rf) obj, i2);
        }
        return m4236R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30350z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4235S((BabyClubWelcomeViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m4235S(BabyClubWelcomeViewModel babyClubWelcomeViewModel) {
        this.f30347B = babyClubWelcomeViewModel;
        synchronized (this) {
            this.f30437D |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        View.OnClickListener onClickListener;
        Spanned spanned;
        synchronized (this) {
            j = this.f30437D;
            this.f30437D = 0L;
        }
        BabyClubWelcomeViewModel babyClubWelcomeViewModel = this.f30347B;
        int i = ((13 & j) > 0L ? 1 : ((13 & j) == 0L ? 0 : -1));
        View.OnClickListener onClickListener2 = null;
        if (i != 0) {
            LiveData m21982N = babyClubWelcomeViewModel != null ? babyClubWelcomeViewModel.m21982N() : null;
            m37818O(0, m21982N);
            spanned = m21982N != null ? (Spanned) m21982N.mo172f() : null;
            if ((j & 12) == 0 || babyClubWelcomeViewModel == null) {
                onClickListener = null;
            } else {
                View.OnClickListener m21979Q = babyClubWelcomeViewModel.m21979Q();
                onClickListener2 = babyClubWelcomeViewModel.m21981O();
                onClickListener = m21979Q;
            }
        } else {
            onClickListener = null;
            spanned = null;
        }
        if ((j & 12) != 0) {
            this.f30348x.setOnClickListener(onClickListener2);
            this.f30349y.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            C7629e.m17885g(this.f30346A, spanned);
        }
        ViewDataBinding.m37808m(this.f30350z);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30437D != 0) {
                return true;
            }
            return this.f30350z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30437D = 8L;
        }
        this.f30350z.mo3579w();
        m37826E();
    }

    private C11790h(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (MaterialButton) objArr[3], (MaterialButton) objArr[2], (AbstractC11996rf) objArr[4], (ImageView) objArr[6], (TextView) objArr[1], (TextView) objArr[5]);
        this.f30437D = -1L;
        this.f30348x.setTag(null);
        this.f30349y.setTag(null);
        m37821J(this.f30350z);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30436C = constraintLayout;
        constraintLayout.setTag(null);
        this.f30346A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
