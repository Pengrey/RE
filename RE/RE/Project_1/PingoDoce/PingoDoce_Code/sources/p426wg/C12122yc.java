package p426wg;

import ae.BindingAdapters;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import p111g.C5586a;
import p246n2.C7629e;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: wg.yc */
/* loaded from: classes2.dex */
public class C12122yc extends AbstractC12104xc {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f31988H = null;

    /* renamed from: I */
    private static final SparseIntArray f31989I = null;

    /* renamed from: F */
    private final ConstraintLayout f31990F;

    /* renamed from: G */
    private long f31991G;

    public C12122yc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f31988H, f31989I));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (61 == i) {
            mo3598Q((LoyaltyCardResumeViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12104xc
    /* renamed from: Q */
    public void mo3598Q(LoyaltyCardResumeViewModel loyaltyCardResumeViewModel) {
        this.f31897E = loyaltyCardResumeViewModel;
        synchronized (this) {
            this.f31991G |= 1;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        Drawable drawable;
        String str2;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        String str3;
        List list2;
        String str4;
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3;
        synchronized (this) {
            j = this.f31991G;
            this.f31991G = 0L;
        }
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel = this.f31897E;
        int i4 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i4 != 0) {
            if (loyaltyCardResumeViewModel != null) {
                str3 = loyaltyCardResumeViewModel.m12645m();
                list2 = loyaltyCardResumeViewModel.m12653c();
                i2 = loyaltyCardResumeViewModel.m12651e();
                z6 = loyaltyCardResumeViewModel.m12647j();
                z3 = loyaltyCardResumeViewModel.m12648i();
                str4 = loyaltyCardResumeViewModel.m12652d();
                z7 = loyaltyCardResumeViewModel.m12650f();
                str = loyaltyCardResumeViewModel.m12646k();
            } else {
                str = null;
                str3 = null;
                list2 = null;
                str4 = null;
                i2 = 0;
                z6 = false;
                z3 = false;
                z7 = false;
            }
            if (i4 != 0) {
                j |= z6 ? 8L : 4L;
            }
            if (list2 != null) {
                z8 = list2.isEmpty();
                i3 = list2.size();
            } else {
                z8 = false;
                i3 = 0;
            }
            Drawable m23699b = z6 ? C5586a.m23699b(this.f31894B.getContext(), C2336R.C2337drawable.ic_alert) : null;
            int length = str4 != null ? str4.length() : 0;
            boolean z9 = !z8;
            z5 = i3 == 0;
            z4 = length > 0;
            list = list2;
            i = i2;
            str2 = str3;
            z2 = z9;
            drawable = m23699b;
            z = z7;
        } else {
            str = null;
            drawable = null;
            str2 = null;
            list = null;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            i = 0;
        }
        if ((j & 3) != 0) {
            MaterialButton materialButton = this.f31898x;
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool = Boolean.TRUE;
            BindingAdapters.m41779l(materialButton, valueOf, bool);
            BindingAdapters.m41779l(this.f31899y, Boolean.valueOf(z5), null);
            BindingAdapters.m41779l(this.f31900z, Boolean.valueOf(z3), null);
            BindingAdapters.m41779l(this.f31893A, Boolean.valueOf(z4), null);
            C7629e.m17889c(this.f31894B, drawable);
            C7629e.m17885g(this.f31894B, str);
            C7629e.m17885g(this.f31895C, str2);
            BindingAdapters.m41784g(this.f31896D, list, i, C2336R.layout.view_row_for_onboarding_resume_radiobutton, null, null, null);
            BindingAdapters.m41779l(this.f31896D, Boolean.valueOf(z2), bool);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31991G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31991G = 2L;
        }
        m37826E();
    }

    private C12122yc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[7], (ImageView) objArr[1], (MaterialButton) objArr[5], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[2], (RadioGroup) objArr[4]);
        this.f31991G = -1L;
        this.f31898x.setTag(null);
        this.f31899y.setTag(null);
        this.f31900z.setTag(null);
        this.f31893A.setTag(null);
        this.f31894B.setTag(null);
        this.f31895C.setTag(null);
        this.f31896D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31990F = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
