package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import p246n2.C7624a;
import p246n2.C7629e;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.C14956OnboardingResumeInfoRowItem;

/* renamed from: wg.ad */
/* loaded from: classes2.dex */
public class C11680ad extends AbstractC12139zc {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f29880B = null;

    /* renamed from: C */
    private static final SparseIntArray f29881C = null;

    /* renamed from: A */
    private long f29882A;

    /* renamed from: y */
    private final RadioButton f29883y;

    /* renamed from: z */
    private InterfaceC1276g f29884z;

    /* compiled from: ViewRowForOnboardingResumeRadiobuttonBindingImpl.java */
    /* renamed from: wg.ad$a */
    /* loaded from: classes2.dex */
    class C11681a implements InterfaceC1276g {
        C11681a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C11680ad.this.f29883y.isChecked();
            C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem = C11680ad.this.f32061x;
            if (c14956OnboardingResumeInfoRowItem != null) {
                c14956OnboardingResumeInfoRowItem.m12636c(isChecked);
            }
        }
    }

    public C11680ad(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f29880B, f29881C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (89 == i) {
            m4474R((C14956OnboardingResumeInfoRowItem) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m4474R(C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem) {
        this.f32061x = c14956OnboardingResumeInfoRowItem;
        synchronized (this) {
            this.f29882A |= 1;
        }
        m37781c(89);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f29882A;
            this.f29882A = 0L;
        }
        C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem = this.f32061x;
        boolean z = false;
        int i = ((3 & j) > 0L ? 1 : ((3 & j) == 0L ? 0 : -1));
        if (i == 0 || c14956OnboardingResumeInfoRowItem == null) {
            str = null;
        } else {
            String m12638a = c14956OnboardingResumeInfoRowItem.m12638a();
            z = c14956OnboardingResumeInfoRowItem.m12637b();
            str = m12638a;
        }
        if (i != 0) {
            C7624a.m17897a(this.f29883y, z);
            C7629e.m17885g(this.f29883y, str);
        }
        if ((j & 2) != 0) {
            C7624a.m17896b(this.f29883y, null, this.f29884z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f29882A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29882A = 2L;
        }
        m37826E();
    }

    private C11680ad(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f29884z = new C11681a();
        this.f29882A = -1L;
        RadioButton radioButton = (RadioButton) objArr[0];
        this.f29883y = radioButton;
        radioButton.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
