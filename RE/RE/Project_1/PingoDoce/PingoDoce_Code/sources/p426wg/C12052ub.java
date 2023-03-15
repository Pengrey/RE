package p426wg;

import ae.BindingAdapters;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import ki.PingoDoceBindingAdapters;
import p246n2.C7627c;
import p246n2.C7629e;

/* renamed from: wg.ub */
/* loaded from: classes2.dex */
public class C12052ub extends AbstractC12028tb {

    /* renamed from: M */
    private static final ViewDataBinding.C1263i f31669M = null;

    /* renamed from: N */
    private static final SparseIntArray f31670N = null;

    /* renamed from: J */
    private final ConstraintLayout f31671J;

    /* renamed from: K */
    private final ConstraintLayout f31672K;

    /* renamed from: L */
    private long f31673L;

    public C12052ub(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31669M, f31670N));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (14 == i) {
            mo3713Q((Drawable) obj);
        } else if (30 == i) {
            m3709U((Boolean) obj);
        } else if (94 == i) {
            mo3711S((Boolean) obj);
        } else if (31 == i) {
            mo3712R((String) obj);
        } else if (110 != i) {
            return false;
        } else {
            mo3710T((Boolean) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12028tb
    /* renamed from: Q */
    public void mo3713Q(Drawable drawable) {
        this.f31543F = drawable;
        synchronized (this) {
            this.f31673L |= 1;
        }
        m37781c(14);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12028tb
    /* renamed from: R */
    public void mo3712R(String str) {
        this.f31544G = str;
        synchronized (this) {
            this.f31673L |= 8;
        }
        m37781c(31);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12028tb
    /* renamed from: S */
    public void mo3711S(Boolean bool) {
        this.f31545H = bool;
        synchronized (this) {
            this.f31673L |= 4;
        }
        m37781c(94);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12028tb
    /* renamed from: T */
    public void mo3710T(Boolean bool) {
        this.f31542E = bool;
        synchronized (this) {
            this.f31673L |= 16;
        }
        m37781c(110);
        super.m37826E();
    }

    /* renamed from: U */
    public void m3709U(Boolean bool) {
        this.f31546I = bool;
        synchronized (this) {
            this.f31673L |= 2;
        }
        m37781c(30);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        float f;
        float f2;
        float f3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.f31673L;
            this.f31673L = 0L;
        }
        Drawable drawable = this.f31543F;
        Boolean bool = this.f31546I;
        Boolean bool2 = this.f31545H;
        String str = this.f31544G;
        Boolean bool3 = this.f31542E;
        int i = ((j & 34) > 0L ? 1 : ((j & 34) == 0L ? 0 : -1));
        float f4 = 0.0f;
        if (i != 0) {
            boolean m37823H = ViewDataBinding.m37823H(bool);
            if (i != 0) {
                if (m37823H) {
                    j2 = j | 128 | 512 | 2048;
                    j3 = 8192;
                } else {
                    j2 = j | 64 | 256 | 1024;
                    j3 = 4096;
                }
                j = j2 | j3;
            }
            Resources resources = this.f31539B.getResources();
            f3 = m37823H ? resources.getDimension(C2336R.dimen.loyalty_card_ean_area_small) : resources.getDimension(C2336R.dimen.loyalty_card_ean_area);
            Resources resources2 = this.f31539B.getResources();
            f2 = m37823H ? resources2.getDimension(C2336R.dimen.loyalty_card_ean_area_padding_small) : resources2.getDimension(C2336R.dimen.loyalty_card_ean_area_padding);
            f = m37823H ? this.f31538A.getResources().getDimension(C2336R.dimen.loyalty_card_ean_area_padding_small) : this.f31538A.getResources().getDimension(C2336R.dimen.loyalty_card_ean_area_padding);
            f4 = m37823H ? this.f31538A.getResources().getDimension(C2336R.dimen.loyalty_card_ean_area_small) : this.f31538A.getResources().getDimension(C2336R.dimen.loyalty_card_ean_area);
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        int i2 = ((j & 36) > 0L ? 1 : ((j & 36) == 0L ? 0 : -1));
        boolean z = i2 != 0 ? !ViewDataBinding.m37823H(bool2) : false;
        int i3 = ((j & 40) > 0L ? 1 : ((j & 40) == 0L ? 0 : -1));
        int i4 = ((j & 48) > 0L ? 1 : ((j & 48) == 0L ? 0 : -1));
        if ((j & 33) != 0) {
            C7627c.m17894a(this.f31547x, drawable);
            C7627c.m17894a(this.f31548y, drawable);
        }
        if (i4 != 0) {
            BindingAdapters.m41779l(this.f31549z, bool3, Boolean.TRUE);
        }
        if ((j & 34) != 0) {
            PingoDoceBindingAdapters.m20341f(this.f31538A, f4, f);
            PingoDoceBindingAdapters.m20341f(this.f31539B, f3, f2);
        }
        if (i2 != 0) {
            ConstraintLayout constraintLayout = this.f31671J;
            Boolean bool4 = Boolean.TRUE;
            BindingAdapters.m41779l(constraintLayout, bool2, bool4);
            BindingAdapters.m41779l(this.f31672K, Boolean.valueOf(z), bool4);
        }
        if (i3 != 0) {
            C7629e.m17885g(this.f31540C, str);
            C7629e.m17885g(this.f31541D, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31673L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31673L = 32L;
        }
        m37826E();
    }

    private C12052ub(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[7], (ImageView) objArr[3], (MaterialCardView) objArr[0], (LinearLayout) objArr[6], (LinearLayout) objArr[2], (TextView) objArr[8], (TextView) objArr[4]);
        this.f31673L = -1L;
        this.f31547x.setTag(null);
        this.f31548y.setTag(null);
        this.f31549z.setTag(null);
        this.f31538A.setTag(null);
        this.f31539B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f31671J = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[5];
        this.f31672K = constraintLayout2;
        constraintLayout2.setTag(null);
        this.f31540C.setTag(null);
        this.f31541D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
