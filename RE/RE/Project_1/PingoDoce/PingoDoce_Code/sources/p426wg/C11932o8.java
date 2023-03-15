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

/* renamed from: wg.o8 */
/* loaded from: classes2.dex */
public class C11932o8 extends AbstractC11910n8 {

    /* renamed from: L */
    private static final ViewDataBinding.C1263i f31135L = null;

    /* renamed from: M */
    private static final SparseIntArray f31136M;

    /* renamed from: K */
    private long f31137K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31136M = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.view_all_cta, 6);
        sparseIntArray.put(C2336R.C2338id.teadrop_drawable, 7);
    }

    public C11932o8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f31135L, f31136M));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (51 == i) {
            mo3932U((String) obj);
        } else if (45 == i) {
            mo3933T((Boolean) obj);
        } else if (37 == i) {
            mo3934S((String) obj);
        } else if (96 == i) {
            mo3931V((Boolean) obj);
        } else if (36 == i) {
            mo3935R((String) obj);
        } else if (3 == i) {
            mo3936Q((String) obj);
        } else if (110 != i) {
            return false;
        } else {
            mo3930W((Boolean) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11910n8
    /* renamed from: Q */
    public void mo3936Q(String str) {
        this.f31038E = str;
        synchronized (this) {
            this.f31137K |= 32;
        }
        m37781c(3);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11910n8
    /* renamed from: R */
    public void mo3935R(String str) {
        this.f31040G = str;
        synchronized (this) {
            this.f31137K |= 16;
        }
        m37781c(36);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11910n8
    /* renamed from: S */
    public void mo3934S(String str) {
        this.f31041H = str;
        synchronized (this) {
            this.f31137K |= 4;
        }
        m37781c(37);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11910n8
    /* renamed from: T */
    public void mo3933T(Boolean bool) {
        this.f31043J = bool;
        synchronized (this) {
            this.f31137K |= 2;
        }
        m37781c(45);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11910n8
    /* renamed from: U */
    public void mo3932U(String str) {
        this.f31039F = str;
        synchronized (this) {
            this.f31137K |= 1;
        }
        m37781c(51);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11910n8
    /* renamed from: V */
    public void mo3931V(Boolean bool) {
        this.f31042I = bool;
        synchronized (this) {
            this.f31137K |= 8;
        }
        m37781c(96);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11910n8
    /* renamed from: W */
    public void mo3930W(Boolean bool) {
        this.f31037D = bool;
        synchronized (this) {
            this.f31137K |= 64;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f31137K;
            this.f31137K = 0L;
        }
        String str2 = this.f31039F;
        Boolean bool = this.f31043J;
        String str3 = this.f31041H;
        Boolean bool2 = this.f31042I;
        String str4 = this.f31040G;
        String str5 = this.f31038E;
        Boolean bool3 = this.f31037D;
        int i = ((129 & j) > 0L ? 1 : ((129 & j) == 0L ? 0 : -1));
        int i2 = ((130 & j) > 0L ? 1 : ((130 & j) == 0L ? 0 : -1));
        int i3 = ((j & 132) > 0L ? 1 : ((j & 132) == 0L ? 0 : -1));
        int i4 = ((j & 136) > 0L ? 1 : ((j & 136) == 0L ? 0 : -1));
        boolean z = i4 != 0 ? !ViewDataBinding.m37823H(bool2) : false;
        int i5 = ((j & 144) > 0L ? 1 : ((j & 144) == 0L ? 0 : -1));
        String format = i5 != 0 ? String.format(this.f31046z.getResources().getString(C2336R.string.lbl_highlighted_benefit_use_until_alt), str4) : null;
        int i6 = ((160 & j) > 0L ? 1 : ((160 & j) == 0L ? 0 : -1));
        int i7 = ((j & 192) > 0L ? 1 : ((j & 192) == 0L ? 0 : -1));
        if (i != 0) {
            str = format;
            BindingAdapters.m41781j(this.f31044x, str2, null, null, null, null);
        } else {
            str = format;
        }
        if (i3 != 0) {
            C7629e.m17885g(this.f31045y, str3);
        }
        if (i4 != 0) {
            BindingAdapters.m41779l(this.f31045y, Boolean.valueOf(z), Boolean.TRUE);
        }
        if (i5 != 0) {
            C7629e.m17885g(this.f31046z, str);
        }
        if (i6 != 0) {
            C7629e.m17885g(this.f31034A, str5);
        }
        if (i7 != 0) {
            BindingAdapters.m41779l(this.f31035B, bool3, Boolean.TRUE);
        }
        if (i2 != 0) {
            BindingAdapters.m41779l(this.f31036C, bool, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31137K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31137K = 128L;
        }
        m37826E();
    }

    private C11932o8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[2], (ConstraintLayout) objArr[0], (ImageView) objArr[3], (ImageView) objArr[7], (TextView) objArr[6]);
        this.f31137K = -1L;
        this.f31044x.setTag(null);
        this.f31045y.setTag(null);
        this.f31046z.setTag(null);
        this.f31034A.setTag(null);
        this.f31035B.setTag(null);
        this.f31036C.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
