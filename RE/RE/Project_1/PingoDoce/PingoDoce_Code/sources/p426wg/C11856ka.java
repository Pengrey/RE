package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.ka */
/* loaded from: classes2.dex */
public class C11856ka extends AbstractC11836ja {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f30785G = null;

    /* renamed from: H */
    private static final SparseIntArray f30786H;

    /* renamed from: E */
    private final ConstraintLayout f30787E;

    /* renamed from: F */
    private long f30788F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30786H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_benefits_title, 5);
        sparseIntArray.put(C2336R.C2338id.const_active_benefits_label, 6);
    }

    public C11856ka(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f30785G, f30786H));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (70 == i) {
            m4079T((LoyaltyCard) obj);
        } else if (65 == i) {
            m4080S((String) obj);
        } else if (57 == i) {
            m4081R((Boolean) obj);
        } else if (97 == i) {
            m4078U((Boolean) obj);
        } else if (19 != i) {
            return false;
        } else {
            m4082Q((View.OnClickListener) obj);
        }
        return true;
    }

    /* renamed from: Q */
    public void m4082Q(View.OnClickListener onClickListener) {
        this.f30687C = onClickListener;
        synchronized (this) {
            this.f30788F |= 16;
        }
        m37781c(19);
        super.m37826E();
    }

    /* renamed from: R */
    public void m4081R(Boolean bool) {
        this.f30686B = bool;
        synchronized (this) {
            this.f30788F |= 4;
        }
        m37781c(57);
        super.m37826E();
    }

    /* renamed from: S */
    public void m4080S(String str) {
    }

    /* renamed from: T */
    public void m4079T(LoyaltyCard loyaltyCard) {
        this.f30688D = loyaltyCard;
        synchronized (this) {
            this.f30788F |= 1;
        }
        m37781c(70);
        super.m37826E();
    }

    /* renamed from: U */
    public void m4078U(Boolean bool) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        boolean z;
        int i;
        boolean z2;
        synchronized (this) {
            j = this.f30788F;
            this.f30788F = 0L;
        }
        LoyaltyCard loyaltyCard = this.f30688D;
        float f = 0.0f;
        Boolean bool = this.f30686B;
        View.OnClickListener onClickListener = this.f30687C;
        if ((j & 33) != 0) {
            if (loyaltyCard != null) {
                str2 = loyaltyCard.m13801j();
                z2 = loyaltyCard.m13816N();
                i = loyaltyCard.m13805e();
            } else {
                str2 = null;
                i = 0;
                z2 = false;
            }
            r13 = str2 != null ? str2.isEmpty() : false;
            str = Integer.toString(i);
            boolean z3 = z2;
            z = !r13;
            r13 = z3;
        } else {
            str = null;
            str2 = null;
            z = false;
        }
        int i2 = ((j & 36) > 0L ? 1 : ((j & 36) == 0L ? 0 : -1));
        if (i2 != 0) {
            boolean m37823H = ViewDataBinding.m37823H(bool);
            if (i2 != 0) {
                j |= m37823H ? 128L : 64L;
            }
            f = m37823H ? 1.0f : 0.25f;
        }
        int i3 = ((j & 48) > 0L ? 1 : ((j & 48) == 0L ? 0 : -1));
        if ((33 & j) != 0) {
            C7629e.m17885g(this.f30689x, str);
            BindingAdapters.m41779l(this.f30690y, Boolean.valueOf(r13), null);
            C7629e.m17885g(this.f30691z, str2);
            BindingAdapters.m41779l(this.f30691z, Boolean.valueOf(z), null);
        }
        if (i3 != 0) {
            this.f30685A.setOnClickListener(onClickListener);
        }
        if ((j & 36) == 0 || ViewDataBinding.m37803r() < 11) {
            return;
        }
        this.f30787E.setAlpha(f);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30788F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30788F = 32L;
        }
        m37826E();
    }

    private C11856ka(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[3], (ImageView) objArr[2], (TextView) objArr[1], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4]);
        this.f30788F = -1L;
        this.f30689x.setTag(null);
        this.f30690y.setTag(null);
        this.f30691z.setTag(null);
        this.f30685A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30787E = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
