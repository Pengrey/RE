package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;

/* renamed from: wg.cd */
/* loaded from: classes2.dex */
public class C11716cd extends AbstractC11698bd {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f30035E = null;

    /* renamed from: F */
    private static final SparseIntArray f30036F;

    /* renamed from: C */
    private final ConstraintLayout f30037C;

    /* renamed from: D */
    private long f30038D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30036F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_divider, 3);
        sparseIntArray.put(C2336R.C2338id.reject_MaterialButton, 4);
        sparseIntArray.put(C2336R.C2338id.accept_MaterialButton, 5);
    }

    public C11716cd(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30035E, f30036F));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (69 == i) {
            mo4417S((LoyaltyCardAssociation) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11698bd
    /* renamed from: S */
    public void mo4417S(LoyaltyCardAssociation loyaltyCardAssociation) {
        this.f29959B = loyaltyCardAssociation;
        synchronized (this) {
            this.f30038D |= 1;
        }
        m37781c(69);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f30038D;
            this.f30038D = 0L;
        }
        LoyaltyCardAssociation loyaltyCardAssociation = this.f29959B;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i == 0 || loyaltyCardAssociation == null) {
            str = null;
        } else {
            str2 = loyaltyCardAssociation.m13782c();
            str = loyaltyCardAssociation.m13781d();
        }
        if (i != 0) {
            C7629e.m17885g(this.f29961y, str2);
            C7629e.m17885g(this.f29962z, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30038D != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30038D = 2L;
        }
        m37826E();
    }

    private C11716cd(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[5], (View) objArr[3], (TextView) objArr[1], (TextView) objArr[2], (MaterialButton) objArr[4]);
        this.f30038D = -1L;
        this.f29961y.setTag(null);
        this.f29962z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30037C = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
