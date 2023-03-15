package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;

/* renamed from: wg.y9 */
/* loaded from: classes2.dex */
public class C12119y9 extends AbstractC12101x9 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31974C = null;

    /* renamed from: D */
    private static final SparseIntArray f31975D;

    /* renamed from: A */
    private final LinearLayout f31976A;

    /* renamed from: B */
    private long f31977B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31975D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_wine_type_title, 3);
    }

    public C12119y9(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f31974C, f31975D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (101 == i) {
            mo3601Q((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12101x9
    /* renamed from: Q */
    public void mo3601Q(Boolean bool) {
        this.f31883z = bool;
        synchronized (this) {
            this.f31977B |= 1;
        }
        m37781c(C0868i.f2743B0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31977B;
            this.f31977B = 0L;
        }
        Boolean bool = this.f31883z;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean z = i != 0 ? !ViewDataBinding.m37823H(bool) : false;
        if (i != 0) {
            TextView textView = this.f31881x;
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool2 = Boolean.TRUE;
            BindingAdapters.m41779l(textView, valueOf, bool2);
            BindingAdapters.m41779l(this.f31882y, bool, bool2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31977B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31977B = 2L;
        }
        m37826E();
    }

    private C12119y9(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2], (TextView) objArr[3], (PlaceHolderRecyclerView) objArr[1]);
        this.f31977B = -1L;
        this.f31881x.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31976A = linearLayout;
        linearLayout.setTag(null);
        this.f31882y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
