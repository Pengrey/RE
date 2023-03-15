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
import pt.pingodoce.app.data.remote.models.request.LoyaltyCardRequest;

/* renamed from: wg.uc */
/* loaded from: classes2.dex */
public class C12053uc extends AbstractC12029tc {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f31674F = null;

    /* renamed from: G */
    private static final SparseIntArray f31675G;

    /* renamed from: C */
    private final ConstraintLayout f31676C;

    /* renamed from: D */
    private final TextView f31677D;

    /* renamed from: E */
    private long f31678E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31675G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.accept_MaterialButton, 4);
        sparseIntArray.put(C2336R.C2338id.deny_MaterialButton, 5);
        sparseIntArray.put(C2336R.C2338id.const_sep, 6);
    }

    public C12053uc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f31674F, f31675G));
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
            mo3708S((LoyaltyCardRequest) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12029tc
    /* renamed from: S */
    public void mo3708S(LoyaltyCardRequest loyaltyCardRequest) {
        this.f31551B = loyaltyCardRequest;
        synchronized (this) {
            this.f31678E |= 1;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.f31678E;
            this.f31678E = 0L;
        }
        LoyaltyCardRequest loyaltyCardRequest = this.f31551B;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i == 0 || loyaltyCardRequest == null) {
            str = null;
            str2 = null;
        } else {
            String m14135a = loyaltyCardRequest.m14135a();
            String m14133c = loyaltyCardRequest.m14133c();
            str2 = loyaltyCardRequest.m14132d();
            str = m14135a;
            str3 = m14133c;
        }
        if (i != 0) {
            C7629e.m17885g(this.f31553y, str3);
            C7629e.m17885g(this.f31554z, str2);
            C7629e.m17885g(this.f31677D, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31678E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31678E = 2L;
        }
        m37826E();
    }

    private C12053uc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[4], (TextView) objArr[1], (TextView) objArr[2], (View) objArr[6], (MaterialButton) objArr[5]);
        this.f31678E = -1L;
        this.f31553y.setTag(null);
        this.f31554z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31676C = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f31677D = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
