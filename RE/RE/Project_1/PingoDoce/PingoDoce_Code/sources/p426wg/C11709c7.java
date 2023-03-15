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

/* renamed from: wg.c7 */
/* loaded from: classes2.dex */
public class C11709c7 extends AbstractC11692b7 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30003C = null;

    /* renamed from: D */
    private static final SparseIntArray f30004D;

    /* renamed from: A */
    private final ConstraintLayout f30005A;

    /* renamed from: B */
    private long f30006B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30004D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.bp_image, 3);
        sparseIntArray.put(C2336R.C2338id.const_benefits_title, 4);
    }

    public C11709c7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30003C, f30004D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (57 == i) {
            m4431R((Boolean) obj);
        } else if (70 != i) {
            return false;
        } else {
            mo4432Q((LoyaltyCard) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11692b7
    /* renamed from: Q */
    public void mo4432Q(LoyaltyCard loyaltyCard) {
        this.f29943z = loyaltyCard;
        synchronized (this) {
            this.f30006B |= 2;
        }
        m37781c(70);
        super.m37826E();
    }

    /* renamed from: R */
    public void m4431R(Boolean bool) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        String str;
        int i;
        synchronized (this) {
            j = this.f30006B;
            this.f30006B = 0L;
        }
        LoyaltyCard loyaltyCard = this.f29943z;
        int i2 = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        String str2 = null;
        if (i2 != 0) {
            if (loyaltyCard != null) {
                str2 = loyaltyCard.m13801j();
                i = loyaltyCard.m13805e();
            } else {
                i = 0;
            }
            boolean z2 = !(str2 != null ? str2.isEmpty() : false);
            str = str2;
            str2 = Integer.toString(i);
            z = z2;
        } else {
            z = false;
            str = null;
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f29941x, str2);
            C7629e.m17885g(this.f29942y, str);
            BindingAdapters.m41779l(this.f29942y, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30006B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30006B = 4L;
        }
        m37826E();
    }

    private C11709c7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2], (ImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[1]);
        this.f30006B = -1L;
        this.f29941x.setTag(null);
        this.f29942y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30005A = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
