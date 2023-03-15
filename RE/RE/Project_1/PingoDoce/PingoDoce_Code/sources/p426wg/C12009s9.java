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

/* renamed from: wg.s9 */
/* loaded from: classes2.dex */
public class C12009s9 extends AbstractC11990r9 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f31465F = null;

    /* renamed from: G */
    private static final SparseIntArray f31466G;

    /* renamed from: D */
    private final ConstraintLayout f31467D;

    /* renamed from: E */
    private long f31468E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31466G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 2);
        sparseIntArray.put(C2336R.C2338id.const_subtitle, 3);
        sparseIntArray.put(C2336R.C2338id.wine_type_RecyclerView, 4);
    }

    public C12009s9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31465F, f31466G));
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
            mo3778S(((Boolean) obj).booleanValue());
        } else if (35 == i) {
            mo3780Q((String) obj);
        } else if (58 != i) {
            return false;
        } else {
            mo3779R((Boolean) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11990r9
    /* renamed from: Q */
    public void mo3780Q(String str) {
        this.f31386C = str;
        synchronized (this) {
            this.f31468E |= 2;
        }
        m37781c(35);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11990r9
    /* renamed from: R */
    public void mo3779R(Boolean bool) {
        this.f31385B = bool;
        synchronized (this) {
            this.f31468E |= 4;
        }
        m37781c(58);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11990r9
    /* renamed from: S */
    public void mo3778S(boolean z) {
        this.f31384A = z;
        synchronized (this) {
            this.f31468E |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31468E;
            this.f31468E = 0L;
        }
        boolean z = this.f31384A;
        String str = this.f31386C;
        int i = ((9 & j) > 0L ? 1 : ((9 & j) == 0L ? 0 : -1));
        int i2 = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        int i3 = ((j & 12) > 0L ? 1 : ((j & 12) == 0L ? 0 : -1));
        boolean m37823H = i3 != 0 ? ViewDataBinding.m37823H(this.f31385B) : false;
        if (i3 != 0) {
            this.f31388y.setErrorEnabled(m37823H);
        }
        if (i2 != 0) {
            BindingAdapters.m41780k(this.f31388y, str);
        }
        if (i != 0) {
            BindingAdapters.m41779l(this.f31467D, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31468E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31468E = 8L;
        }
        m37826E();
    }

    private C12009s9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[3], (TextView) objArr[2], (TextInputLayout) objArr[1], (PlaceHolderRecyclerView) objArr[4]);
        this.f31468E = -1L;
        this.f31388y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31467D = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
