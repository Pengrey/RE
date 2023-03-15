package p426wg;

import ae.BindingAdapters;
import ae.InterfaceC0131a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import java.util.List;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: wg.qd */
/* loaded from: classes2.dex */
public class C11977qd extends AbstractC11954pd {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31329C = null;

    /* renamed from: D */
    private static final SparseIntArray f31330D = null;

    /* renamed from: A */
    private final LinearLayout f31331A;

    /* renamed from: B */
    private long f31332B;

    public C11977qd(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 1, f31329C, f31330D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (85 == i) {
            mo3836S((Integer) obj);
        } else if (84 == i) {
            mo3837R((List) obj);
        } else if (67 != i) {
            return false;
        } else {
            mo3838Q((InterfaceC0131a) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11954pd
    /* renamed from: Q */
    public void mo3838Q(InterfaceC0131a<Purchase> interfaceC0131a) {
        this.f31227z = interfaceC0131a;
        synchronized (this) {
            this.f31332B |= 4;
        }
        m37781c(67);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11954pd
    /* renamed from: R */
    public void mo3837R(List<Purchase> list) {
        this.f31225x = list;
        synchronized (this) {
            this.f31332B |= 2;
        }
        m37781c(84);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11954pd
    /* renamed from: S */
    public void mo3836S(Integer num) {
        this.f31226y = num;
        synchronized (this) {
            this.f31332B |= 1;
        }
        m37781c(85);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.f31332B;
            this.f31332B = 0L;
        }
        Integer num = this.f31226y;
        List<Purchase> list = this.f31225x;
        InterfaceC0131a<Purchase> interfaceC0131a = this.f31227z;
        int i = ((15 & j) > 0L ? 1 : ((15 & j) == 0L ? 0 : -1));
        int i2 = 0;
        boolean z2 = false;
        if (i != 0) {
            int m37824G = ViewDataBinding.m37824G(num);
            if ((j & 10) != 0) {
                z2 = !(list != null ? list.isEmpty() : false);
            }
            boolean z3 = z2;
            i2 = m37824G;
            z = z3;
        } else {
            z = false;
        }
        if (i != 0) {
            BindingAdapters.m41784g(this.f31331A, list, i2, C2336R.layout.view_row_for_purchase_item, null, interfaceC0131a, null);
        }
        if ((j & 10) != 0) {
            BindingAdapters.m41779l(this.f31331A, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31332B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31332B = 8L;
        }
        m37826E();
    }

    private C11977qd(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f31332B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31331A = linearLayout;
        linearLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
