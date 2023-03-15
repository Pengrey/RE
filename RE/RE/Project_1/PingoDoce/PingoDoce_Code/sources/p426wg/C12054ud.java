package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.checkbox.MaterialCheckBox;
import p246n2.C7624a;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.purchases.PurchaseProduct;

/* renamed from: wg.ud */
/* loaded from: classes2.dex */
public class C12054ud extends AbstractC12030td {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f31679J = null;

    /* renamed from: K */
    private static final SparseIntArray f31680K;

    /* renamed from: G */
    private final ConstraintLayout f31681G;

    /* renamed from: H */
    private InterfaceC1276g f31682H;

    /* renamed from: I */
    private long f31683I;

    /* compiled from: ViewRowForPurchaseProductBindingImpl.java */
    /* renamed from: wg.ud$a */
    /* loaded from: classes2.dex */
    class C12055a implements InterfaceC1276g {
        C12055a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12054ud.this.f31558D.isChecked();
            PurchaseProduct purchaseProduct = C12054ud.this.f31560F;
            if (purchaseProduct != null) {
                purchaseProduct.m14408i0(isChecked);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31680K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 8);
    }

    public C12054ud(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31679J, f31680K));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (90 == i) {
            mo3706T(((Boolean) obj).booleanValue());
        } else if (79 != i) {
            return false;
        } else {
            mo3707S((PurchaseProduct) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12030td
    /* renamed from: S */
    public void mo3707S(PurchaseProduct purchaseProduct) {
        this.f31560F = purchaseProduct;
        synchronized (this) {
            this.f31683I |= 2;
        }
        m37781c(79);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12030td
    /* renamed from: T */
    public void mo3706T(boolean z) {
        this.f31559E = z;
        synchronized (this) {
            this.f31683I |= 1;
        }
        m37781c(90);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        float f;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        String str4;
        String str5;
        String str6;
        boolean z4;
        String str7;
        String str8;
        String str9;
        synchronized (this) {
            j = this.f31683I;
            this.f31683I = 0L;
        }
        boolean z5 = this.f31559E;
        PurchaseProduct purchaseProduct = this.f31560F;
        boolean z6 = (j & 5) != 0 ? !z5 : false;
        if ((j & 7) != 0) {
            int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
            if (i == 0 || purchaseProduct == null) {
                str6 = null;
                z4 = false;
                z2 = false;
                str7 = null;
                str8 = null;
                str9 = null;
            } else {
                str6 = purchaseProduct.m14416E();
                z4 = purchaseProduct.m14409h0();
                z2 = purchaseProduct.m14410g0();
                str7 = purchaseProduct.m14411f0();
                str8 = purchaseProduct.m14413d0();
                str9 = purchaseProduct.m14412e0();
            }
            str = purchaseProduct != null ? purchaseProduct.m14417D() : null;
            boolean isEmpty = str != null ? str.isEmpty() : false;
            if (i != 0) {
                j |= isEmpty ? 64L : 32L;
            }
            if ((j & 6) != 0) {
                f = isEmpty ? this.f31563z.getResources().getDimension(C2336R.dimen.zero) : this.f31563z.getResources().getDimension(C2336R.dimen.purchase_product_count_margin_top);
            } else {
                f = 0.0f;
            }
            z = !isEmpty;
            if ((j & 7) != 0) {
                j = z ? j | 16 : j | 8;
            }
            str3 = str6;
            z3 = z4;
            str2 = str7;
            str4 = str8;
            str5 = str9;
        } else {
            str = null;
            str2 = null;
            f = 0.0f;
            str3 = null;
            z = false;
            z2 = false;
            z3 = false;
            str4 = null;
            str5 = null;
        }
        if ((16 & j) != 0) {
            z6 = !z5;
        }
        int i2 = ((7 & j) > 0L ? 1 : ((7 & j) == 0L ? 0 : -1));
        boolean z7 = (i2 == 0 || !z) ? false : z6;
        if ((j & 6) != 0) {
            C7629e.m17885g(this.f31561x, str4);
            C7629e.m17885g(this.f31562y, str2);
            BindingAdapters.m41779l(this.f31562y, Boolean.valueOf(z2), Boolean.TRUE);
            C7629e.m17885g(this.f31563z, str5);
            BindingAdapters.m41785f(this.f31563z, 0.0f, f, 0.0f, 0.0f);
            C7629e.m17885g(this.f31555A, str3);
            C7629e.m17885g(this.f31557C, str);
            C7624a.m17897a(this.f31558D, z3);
        }
        if ((4 & j) != 0) {
            BindingAdapters.m41778m(this.f31562y, true);
            C7624a.m17896b(this.f31558D, null, this.f31682H);
        }
        if ((j & 5) != 0) {
            TextView textView = this.f31563z;
            Boolean valueOf = Boolean.valueOf(z6);
            Boolean bool = Boolean.TRUE;
            BindingAdapters.m41779l(textView, valueOf, bool);
            BindingAdapters.m41779l(this.f31556B, Boolean.valueOf(z6), null);
            BindingAdapters.m41779l(this.f31558D, Boolean.valueOf(z5), bool);
        }
        if (i2 != 0) {
            BindingAdapters.m41779l(this.f31557C, Boolean.valueOf(z7), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31683I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31683I = 4L;
        }
        m37826E();
    }

    private C12054ud(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (View) objArr[8], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[1], (TextView) objArr[3], (ConstraintLayout) objArr[4], (TextView) objArr[2], (MaterialCheckBox) objArr[7]);
        this.f31682H = new C12055a();
        this.f31683I = -1L;
        this.f31561x.setTag(null);
        this.f31562y.setTag(null);
        this.f31563z.setTag(null);
        this.f31555A.setTag(null);
        this.f31556B.setTag(null);
        this.f31557C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31681G = constraintLayout;
        constraintLayout.setTag(null);
        this.f31558D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
