package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import p246n2.C7629e;

/* renamed from: wg.ga */
/* loaded from: classes2.dex */
public class C11784ga extends AbstractC11764fa {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f30411E = null;

    /* renamed from: F */
    private static final SparseIntArray f30412F;

    /* renamed from: D */
    private long f30413D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30412F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_product_quantity, 3);
    }

    public C11784ga(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30411E, f30412F));
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
            mo4247S(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            mo4248R((Integer) obj);
        } else if (73 != i) {
            return false;
        } else {
            mo4249Q((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11764fa
    /* renamed from: Q */
    public void mo4249Q(String str) {
        this.f30328B = str;
        synchronized (this) {
            this.f30413D |= 4;
        }
        m37781c(73);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11764fa
    /* renamed from: R */
    public void mo4248R(Integer num) {
        this.f30327A = num;
        synchronized (this) {
            this.f30413D |= 2;
        }
        m37781c(87);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11764fa
    /* renamed from: S */
    public void mo4247S(boolean z) {
        this.f30329C = z;
        synchronized (this) {
            this.f30413D |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30413D;
            this.f30413D = 0L;
        }
        boolean z = this.f30329C;
        Integer num = this.f30327A;
        String str = this.f30328B;
        int i = ((9 & j) > 0L ? 1 : ((9 & j) == 0L ? 0 : -1));
        int i2 = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        int m37824G = i2 != 0 ? ViewDataBinding.m37824G(num) : 0;
        int i3 = ((j & 12) > 0L ? 1 : ((j & 12) == 0L ? 0 : -1));
        if (i != 0) {
            BindingAdapters.m41779l(this.f30330x, Boolean.valueOf(z), Boolean.TRUE);
        }
        if (i2 != 0) {
            this.f30331y.setValue(m37824G);
        }
        if (i3 != 0) {
            C7629e.m17885g(this.f30332z, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30413D != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30413D = 8L;
        }
        m37826E();
    }

    private C11784ga(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (FrameLayout) objArr[3], (MaterialCardView) objArr[0], (QuantityPickerView) objArr[2], (TextView) objArr[1]);
        this.f30413D = -1L;
        this.f30330x.setTag(null);
        this.f30331y.setTag(null);
        this.f30332z.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
