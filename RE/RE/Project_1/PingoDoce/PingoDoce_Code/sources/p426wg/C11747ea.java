package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.ea */
/* loaded from: classes2.dex */
public class C11747ea extends AbstractC11730da {

    /* renamed from: L */
    private static final ViewDataBinding.C1263i f30231L = null;

    /* renamed from: M */
    private static final SparseIntArray f30232M;

    /* renamed from: I */
    private final ConstraintLayout f30233I;

    /* renamed from: J */
    private final Group f30234J;

    /* renamed from: K */
    private long f30235K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30232M = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_guideline, 9);
        sparseIntArray.put(C2336R.C2338id.const_active_benefits_label, 10);
        sparseIntArray.put(C2336R.C2338id.const_active_balance_lbl, 11);
        sparseIntArray.put(C2336R.C2338id.const_fuel_benefit_label, 12);
        sparseIntArray.put(C2336R.C2338id.const_fuel_pts_lbl, 13);
    }

    public C11747ea(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 14, f30231L, f30232M));
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
            m4361T((LoyaltyCard) obj);
        } else if (65 == i) {
            m4362S((String) obj);
        } else if (57 == i) {
            m4363R((Boolean) obj);
        } else if (97 == i) {
            m4360U((Boolean) obj);
        } else if (19 != i) {
            return false;
        } else {
            m4364Q((View.OnClickListener) obj);
        }
        return true;
    }

    /* renamed from: Q */
    public void m4364Q(View.OnClickListener onClickListener) {
        this.f30109F = onClickListener;
        synchronized (this) {
            this.f30235K |= 16;
        }
        m37781c(19);
        super.m37826E();
    }

    /* renamed from: R */
    public void m4363R(Boolean bool) {
        this.f30108E = bool;
        synchronized (this) {
            this.f30235K |= 4;
        }
        m37781c(57);
        super.m37826E();
    }

    /* renamed from: S */
    public void m4362S(String str) {
    }

    /* renamed from: T */
    public void m4361T(LoyaltyCard loyaltyCard) {
        this.f30110G = loyaltyCard;
        synchronized (this) {
            this.f30235K |= 1;
        }
        m37781c(70);
        super.m37826E();
    }

    /* renamed from: U */
    public void m4360U(Boolean bool) {
        this.f30111H = bool;
        synchronized (this) {
            this.f30235K |= 8;
        }
        m37781c(97);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        float f;
        int i;
        String str7;
        String str8;
        String str9;
        String str10;
        synchronized (this) {
            j = this.f30235K;
            this.f30235K = 0L;
        }
        LoyaltyCard loyaltyCard = this.f30110G;
        Boolean bool = this.f30108E;
        Boolean bool2 = this.f30111H;
        View.OnClickListener onClickListener = this.f30109F;
        if ((j & 33) != 0) {
            if (loyaltyCard != null) {
                str3 = loyaltyCard.m13793w();
                z = loyaltyCard.m13816N();
                str7 = loyaltyCard.m13801j();
                str8 = loyaltyCard.m13827A();
                str9 = loyaltyCard.m13802i();
                str10 = loyaltyCard.m13791z();
                i = loyaltyCard.m13805e();
            } else {
                i = 0;
                z = false;
                str3 = null;
                str7 = null;
                str8 = null;
                str9 = null;
                str10 = null;
            }
            boolean isEmpty = str3 != null ? str3.isEmpty() : false;
            str = Integer.toString(i);
            z2 = !isEmpty;
            r13 = !(str7 != null ? str7.isEmpty() : false);
            str2 = str7;
            str5 = str8;
            str4 = str9;
            str6 = str10;
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        int i2 = ((j & 36) > 0L ? 1 : ((j & 36) == 0L ? 0 : -1));
        if (i2 != 0) {
            boolean m37823H = ViewDataBinding.m37823H(bool);
            if (i2 != 0) {
                j |= m37823H ? 128L : 64L;
            }
            f = m37823H ? 1.0f : 0.25f;
        } else {
            f = 0.0f;
        }
        int i3 = ((j & 40) > 0L ? 1 : ((j & 40) == 0L ? 0 : -1));
        int i4 = ((j & 48) > 0L ? 1 : ((j & 48) == 0L ? 0 : -1));
        if ((33 & j) != 0) {
            C7629e.m17885g(this.f30112x, str4);
            C7629e.m17885g(this.f30113y, str);
            C7629e.m17885g(this.f30114z, str6);
            BindingAdapters.m41779l(this.f30104A, Boolean.valueOf(z), null);
            C7629e.m17885g(this.f30105B, str2);
            BindingAdapters.m41779l(this.f30105B, Boolean.valueOf(r13), null);
            C7629e.m17885g(this.f30106C, str3);
            BindingAdapters.m41779l(this.f30106C, Boolean.valueOf(z2), null);
            C7629e.m17885g(this.f30107D, str5);
        }
        if (i4 != 0) {
            this.f30113y.setOnClickListener(onClickListener);
        }
        if ((j & 36) != 0 && ViewDataBinding.m37803r() >= 11) {
            this.f30233I.setAlpha(f);
        }
        if (i3 != 0) {
            BindingAdapters.m41779l(this.f30234J, bool2, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30235K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30235K = 32L;
        }
        m37826E();
    }

    private C11747ea(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[6], (TextView) objArr[11], (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[10], (TextView) objArr[12], (TextView) objArr[7], (TextView) objArr[13], (Guideline) objArr[9], (TextView) objArr[8]);
        this.f30235K = -1L;
        this.f30112x.setTag(null);
        this.f30113y.setTag(null);
        this.f30114z.setTag(null);
        this.f30104A.setTag(null);
        this.f30105B.setTag(null);
        this.f30106C.setTag(null);
        this.f30107D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30233I = constraintLayout;
        constraintLayout.setTag(null);
        Group group = (Group) objArr[1];
        this.f30234J = group;
        group.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
