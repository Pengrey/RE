package p426wg;

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

/* renamed from: wg.oa */
/* loaded from: classes2.dex */
public class C11934oa extends AbstractC11912na {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31144B = null;

    /* renamed from: C */
    private static final SparseIntArray f31145C;

    /* renamed from: A */
    private long f31146A;

    /* renamed from: z */
    private final ConstraintLayout f31147z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31145C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.bp_image, 2);
        sparseIntArray.put(C2336R.C2338id.const_benefits_title, 3);
        sparseIntArray.put(C2336R.C2338id.const_benefits_subtitle, 4);
    }

    public C11934oa(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31144B, f31145C));
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
            m3921R((Boolean) obj);
        } else if (70 != i) {
            return false;
        } else {
            mo3922Q((LoyaltyCard) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11912na
    /* renamed from: Q */
    public void mo3922Q(LoyaltyCard loyaltyCard) {
        this.f31057y = loyaltyCard;
        synchronized (this) {
            this.f31146A |= 2;
        }
        m37781c(70);
        super.m37826E();
    }

    /* renamed from: R */
    public void m3921R(Boolean bool) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31146A;
            this.f31146A = 0L;
        }
        String str = null;
        LoyaltyCard loyaltyCard = this.f31057y;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0 && loyaltyCard != null) {
            str = loyaltyCard.m13820J();
        }
        if (i != 0) {
            C7629e.m17885g(this.f31056x, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31146A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31146A = 4L;
        }
        m37826E();
    }

    private C11934oa(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[1], (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.f31146A = -1L;
        this.f31056x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31147z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
