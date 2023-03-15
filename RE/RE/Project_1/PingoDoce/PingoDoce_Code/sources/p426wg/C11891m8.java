package p426wg;

import ae.BindingAdapters;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p246n2.C7629e;

/* renamed from: wg.m8 */
/* loaded from: classes2.dex */
public class C11891m8 extends AbstractC11871l8 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f30951G = null;

    /* renamed from: H */
    private static final SparseIntArray f30952H = null;

    /* renamed from: E */
    private final ConstraintLayout f30953E;

    /* renamed from: F */
    private long f30954F;

    public C11891m8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30951G, f30952H));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (59 == i) {
            mo4005Q(((Boolean) obj).booleanValue());
        } else if (110 == i) {
            mo4002T(((Boolean) obj).booleanValue());
        } else if (64 == i) {
            mo4004R((Drawable) obj);
        } else if (68 != i) {
            return false;
        } else {
            mo4003S((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11871l8
    /* renamed from: Q */
    public void mo4005Q(boolean z) {
        this.f30872D = z;
        synchronized (this) {
            this.f30954F |= 1;
        }
        m37781c(59);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11871l8
    /* renamed from: R */
    public void mo4004R(Drawable drawable) {
        this.f30871C = drawable;
        synchronized (this) {
            this.f30954F |= 4;
        }
        m37781c(64);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11871l8
    /* renamed from: S */
    public void mo4003S(View.OnClickListener onClickListener) {
        this.f30869A = onClickListener;
        synchronized (this) {
            this.f30954F |= 8;
        }
        m37781c(68);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11871l8
    /* renamed from: T */
    public void mo4002T(boolean z) {
        this.f30870B = z;
        synchronized (this) {
            this.f30954F |= 2;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        Resources resources;
        int i;
        synchronized (this) {
            j = this.f30954F;
            this.f30954F = 0L;
        }
        boolean z = this.f30872D;
        String str = null;
        boolean z2 = this.f30870B;
        Drawable drawable = this.f30871C;
        View.OnClickListener onClickListener = this.f30869A;
        int i2 = ((j & 17) > 0L ? 1 : ((j & 17) == 0L ? 0 : -1));
        if (i2 != 0) {
            if (i2 != 0) {
                j |= z ? 64L : 32L;
            }
            if (z) {
                resources = this.f30873x.getResources();
                i = C2336R.string.lbl_account_guest_mode;
            } else {
                resources = this.f30873x.getResources();
                i = C2336R.string.lbl_account_guest_mode_takeaway;
            }
            str = resources.getString(i);
        }
        int i3 = ((18 & j) > 0L ? 1 : ((18 & j) == 0L ? 0 : -1));
        int i4 = ((24 & j) > 0L ? 1 : ((24 & j) == 0L ? 0 : -1));
        if ((20 & j) != 0) {
            C7629e.m17887e(this.f30873x, drawable);
        }
        if ((j & 17) != 0) {
            C7629e.m17885g(this.f30873x, str);
        }
        if (i4 != 0) {
            this.f30874y.setOnClickListener(onClickListener);
            this.f30875z.setOnClickListener(onClickListener);
        }
        if (i3 != 0) {
            BindingAdapters.m41779l(this.f30953E, Boolean.valueOf(z2), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30954F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30954F = 16L;
        }
        m37826E();
    }

    private C11891m8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[1], (MaterialButton) objArr[2], (MaterialButton) objArr[3]);
        this.f30954F = -1L;
        this.f30873x.setTag(null);
        this.f30874y.setTag(null);
        this.f30875z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30953E = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
