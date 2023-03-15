package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import gi.BenefitViewState;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Benefit;

/* renamed from: wg.yb */
/* loaded from: classes2.dex */
public class C12121yb extends AbstractC12103xb {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f31984H = null;

    /* renamed from: I */
    private static final SparseIntArray f31985I;

    /* renamed from: F */
    private final FrameLayout f31986F;

    /* renamed from: G */
    private long f31987G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31985I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.img_benefit_status, 6);
        sparseIntArray.put(C2336R.C2338id.spacer, 7);
        sparseIntArray.put(C2336R.C2338id.img_benefit_type, 8);
    }

    public C12121yb(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31984H, f31985I));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (16 == i) {
            mo3599Q((BenefitViewState) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12103xb
    /* renamed from: Q */
    public void mo3599Q(BenefitViewState benefitViewState) {
        this.f31889E = benefitViewState;
        synchronized (this) {
            this.f31987G |= 1;
        }
        m37781c(16);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        String str;
        String str2;
        synchronized (this) {
            j = this.f31987G;
            this.f31987G = 0L;
        }
        BenefitViewState benefitViewState = this.f31889E;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean z2 = false;
        if (i != 0) {
            Benefit m23338b = benefitViewState != null ? benefitViewState.m23338b() : null;
            if (m23338b != null) {
                String m13935e = m23338b.m13935e();
                boolean m13924v = m23338b.m13924v();
                String m13937c = m23338b.m13937c();
                str = m13935e;
                z2 = m13924v;
                str2 = m13937c;
            } else {
                str = null;
                str2 = null;
            }
            z = !z2;
        } else {
            z = false;
            str = null;
            str2 = null;
        }
        if (i != 0) {
            AppCompatImageView appCompatImageView = this.f31892z;
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean bool = Boolean.TRUE;
            BindingAdapters.m41779l(appCompatImageView, valueOf, bool);
            C7629e.m17885g(this.f31885A, str2);
            C7629e.m17885g(this.f31886B, str);
            BindingAdapters.m41779l(this.f31887C, Boolean.valueOf(z2), bool);
            BindingAdapters.m41779l(this.f31888D, Boolean.valueOf(z), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31987G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31987G = 2L;
        }
        m37826E();
    }

    private C12121yb(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[3], (Space) objArr[7], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (View) objArr[2], (View) objArr[1]);
        this.f31987G = -1L;
        this.f31892z.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31986F = frameLayout;
        frameLayout.setTag(null);
        this.f31885A.setTag(null);
        this.f31886B.setTag(null);
        this.f31887C.setTag(null);
        this.f31888D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
