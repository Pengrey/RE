package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wg.q9 */
/* loaded from: classes2.dex */
public class C11972q9 extends AbstractC11950p9 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f31311E = null;

    /* renamed from: F */
    private static final SparseIntArray f31312F;

    /* renamed from: C */
    private final ConstraintLayout f31313C;

    /* renamed from: D */
    private long f31314D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31312F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 2);
        sparseIntArray.put(C2336R.C2338id.wine_region_RecyclerView, 3);
    }

    public C11972q9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f31311E, f31312F));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo3842S(((Boolean) obj).booleanValue());
        } else if (35 == i) {
            mo3844Q((String) obj);
        } else if (58 != i) {
            return false;
        } else {
            mo3843R((Boolean) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11950p9
    /* renamed from: Q */
    public void mo3844Q(String str) {
        this.f31215B = str;
        synchronized (this) {
            this.f31314D |= 2;
        }
        m37781c(35);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11950p9
    /* renamed from: R */
    public void mo3843R(Boolean bool) {
        this.f31214A = bool;
        synchronized (this) {
            this.f31314D |= 4;
        }
        m37781c(58);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11950p9
    /* renamed from: S */
    public void mo3842S(boolean z) {
        this.f31218z = z;
        synchronized (this) {
            this.f31314D |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31314D;
            this.f31314D = 0L;
        }
        boolean z = this.f31218z;
        String str = this.f31215B;
        int i = ((9 & j) > 0L ? 1 : ((9 & j) == 0L ? 0 : -1));
        int i2 = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        int i3 = ((j & 12) > 0L ? 1 : ((j & 12) == 0L ? 0 : -1));
        boolean m37823H = i3 != 0 ? ViewDataBinding.m37823H(this.f31214A) : false;
        if (i3 != 0) {
            this.f31216x.setErrorEnabled(m37823H);
        }
        if (i2 != 0) {
            BindingAdapters.m41780k(this.f31216x, str);
        }
        if (i != 0) {
            BindingAdapters.m41779l(this.f31313C, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31314D != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31314D = 8L;
        }
        m37826E();
    }

    private C11972q9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2], (TextInputLayout) objArr[1], (PlaceHolderRecyclerView) objArr[3]);
        this.f31314D = -1L;
        this.f31216x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31313C = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
