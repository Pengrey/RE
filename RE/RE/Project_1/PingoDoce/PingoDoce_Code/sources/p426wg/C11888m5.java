package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import fi.BenefitsDetailsViewModel;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Benefit;

/* renamed from: wg.m5 */
/* loaded from: classes2.dex */
public class C11888m5 extends AbstractC11868l5 {

    /* renamed from: M */
    private static final ViewDataBinding.C1263i f30937M;

    /* renamed from: N */
    private static final SparseIntArray f30938N;

    /* renamed from: J */
    private final ConstraintLayout f30939J;

    /* renamed from: K */
    private final ConstraintLayout f30940K;

    /* renamed from: L */
    private long f30941L;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(14);
        f30937M = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar"}, new int[]{10}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30938N = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.cv_barcode, 11);
        sparseIntArray.put(C2336R.C2338id.img_teardrop, 12);
        sparseIntArray.put(C2336R.C2338id.txt_more_info, 13);
    }

    public C11888m5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 14, f30937M, f30938N));
    }

    /* renamed from: U */
    private boolean m4011U(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30941L |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m4011U((AbstractC11917nf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30850A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (15 == i) {
            mo4013S((Benefit) obj);
        } else if (109 != i) {
            return false;
        } else {
            mo4012T((BenefitsDetailsViewModel) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11868l5
    /* renamed from: S */
    public void mo4013S(Benefit benefit) {
        this.f30857H = benefit;
        synchronized (this) {
            this.f30941L |= 2;
        }
        m37781c(15);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11868l5
    /* renamed from: T */
    public void mo4012T(BenefitsDetailsViewModel benefitsDetailsViewModel) {
        this.f30858I = benefitsDetailsViewModel;
        synchronized (this) {
            this.f30941L |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        View.OnClickListener onClickListener;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        synchronized (this) {
            j = this.f30941L;
            this.f30941L = 0L;
        }
        Benefit benefit = this.f30857H;
        BenefitsDetailsViewModel benefitsDetailsViewModel = this.f30858I;
        int i = ((j & 14) > 0L ? 1 : ((j & 14) == 0L ? 0 : -1));
        boolean z = false;
        if (i != 0) {
            String m13934f = benefit != null ? benefit.m13934f() : null;
            boolean m23785V = benefitsDetailsViewModel != null ? benefitsDetailsViewModel.m23785V(m13934f) : false;
            if (i != 0) {
                j |= m23785V ? 32L : 16L;
            }
            str3 = m23785V ? this.f30852C.getResources().getString(C2336R.string.lbl_ompd_benefit_information_active) : this.f30852C.getResources().getString(C2336R.string.lbl_ompd_benefit_information);
            if ((j & 10) != 0) {
                if (benefit != null) {
                    str8 = benefit.m13931j();
                    str10 = benefit.m13936d();
                    str9 = benefit.m13935e();
                    str7 = benefit.m13937c();
                } else {
                    str7 = null;
                    str8 = null;
                    str10 = null;
                    str9 = null;
                }
                str5 = String.format(this.f30855F.getResources().getString(C2336R.string.lbl_highlighted_benefit_use_until), str10);
            } else {
                str7 = null;
                str8 = null;
                str5 = null;
                str9 = null;
            }
            if ((j & 12) == 0 || benefitsDetailsViewModel == null) {
                str2 = str7;
                str6 = str8;
                str = m13934f;
                z = m23785V;
                str4 = str9;
                onClickListener = null;
            } else {
                View.OnClickListener m23783X = benefitsDetailsViewModel.m23783X();
                str6 = str8;
                z = m23785V;
                str4 = str9;
                str2 = str7;
                str = m13934f;
                onClickListener = m23783X;
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            onClickListener = null;
            str6 = null;
        }
        if ((j & 12) != 0) {
            this.f30859x.setOnClickListener(onClickListener);
        }
        if ((14 & j) != 0) {
            ImageView imageView = this.f30860y;
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool = Boolean.TRUE;
            BindingAdapters.m41779l(imageView, valueOf, bool);
            BindingAdapters.m41779l(this.f30851B, Boolean.valueOf(z), bool);
            C7629e.m17885g(this.f30852C, str3);
        }
        if ((j & 10) != 0) {
            BindingAdapters.m41781j(this.f30861z, str6, null, null, null, null);
            C7629e.m17885g(this.f30851B, str);
            C7629e.m17885g(this.f30853D, str2);
            C7629e.m17885g(this.f30855F, str5);
            C7629e.m17885g(this.f30856G, str4);
        }
        ViewDataBinding.m37808m(this.f30850A);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30941L != 0) {
                return true;
            }
            return this.f30850A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30941L = 8L;
        }
        this.f30850A.mo3579w();
        m37826E();
    }

    private C11888m5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (ExtendedFloatingActionButton) objArr[9], (MaterialCardView) objArr[11], (ImageView) objArr[6], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[12], (AbstractC11917nf) objArr[10], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4]);
        this.f30941L = -1L;
        this.f30859x.setTag(null);
        this.f30860y.setTag(null);
        this.f30861z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30939J = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.f30940K = constraintLayout2;
        constraintLayout2.setTag(null);
        m37821J(this.f30850A);
        this.f30851B.setTag(null);
        this.f30852C.setTag(null);
        this.f30853D.setTag(null);
        this.f30855F.setTag(null);
        this.f30856G.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
