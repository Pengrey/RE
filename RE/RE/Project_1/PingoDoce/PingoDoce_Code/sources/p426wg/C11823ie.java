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
import lib.mozidev.p225me.extextview.ExTextView;
import p246n2.C7627c;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* renamed from: wg.ie */
/* loaded from: classes2.dex */
public class C11823ie extends AbstractC11805he {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f30600I = null;

    /* renamed from: J */
    private static final SparseIntArray f30601J;

    /* renamed from: G */
    private final ConstraintLayout f30602G;

    /* renamed from: H */
    private long f30603H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30601J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.foreground_ConstraintLayout, 6);
        sparseIntArray.put(C2336R.C2338id.quantity_circle_View, 7);
        sparseIntArray.put(C2336R.C2338id.edit_ConstraintLayout, 8);
        sparseIntArray.put(C2336R.C2338id.const_end, 9);
        sparseIntArray.put(C2336R.C2338id.const_drag, 10);
        sparseIntArray.put(C2336R.C2338id.sep_View, 11);
    }

    public C11823ie(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 12, f30600I, f30601J));
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
            mo4179S((ShoppingListProduct) obj);
        } else if (78 == i) {
            mo4178T((String) obj);
        } else if (81 != i) {
            return false;
        } else {
            mo4177U((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11805he
    /* renamed from: S */
    public void mo4179S(ShoppingListProduct shoppingListProduct) {
        this.f30495D = shoppingListProduct;
        synchronized (this) {
            this.f30603H |= 1;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11805he
    /* renamed from: T */
    public void mo4178T(String str) {
        this.f30496E = str;
        synchronized (this) {
            this.f30603H |= 2;
        }
        m37781c(78);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11805he
    /* renamed from: U */
    public void mo4177U(String str) {
        this.f30497F = str;
        synchronized (this) {
            this.f30603H |= 4;
        }
        m37781c(81);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.f30603H;
            this.f30603H = 0L;
        }
        ShoppingListProduct shoppingListProduct = this.f30495D;
        String str4 = this.f30496E;
        String str5 = this.f30497F;
        int i = ((9 & j) > 0L ? 1 : ((9 & j) == 0L ? 0 : -1));
        String str6 = null;
        if (i != 0) {
            if (shoppingListProduct != null) {
                String m14329n = shoppingListProduct.m14329n();
                String m14323y = shoppingListProduct.m14323y();
                str2 = shoppingListProduct.m14348F();
                str3 = m14329n;
                str6 = m14323y;
            } else {
                str3 = null;
                str2 = null;
            }
            r8 = !(str6 != null ? str6.isEmpty() : false);
            String str7 = str6;
            str6 = str3;
            str = str7;
        } else {
            str = null;
            str2 = null;
        }
        int i2 = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        if ((j & 12) != 0) {
            C7627c.m17893b(this.f30498x, str5);
        }
        if (i != 0) {
            C7629e.m17885g(this.f30499y, str6);
            C7629e.m17885g(this.f30492A, str2);
            C7629e.m17885g(this.f30494C, str);
            BindingAdapters.m41779l(this.f30494C, Boolean.valueOf(r8), Boolean.TRUE);
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f30500z, str4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30603H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30603H = 8L;
        }
        m37826E();
    }

    private C11823ie(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[4], (ImageView) objArr[10], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[6], (ExTextView) objArr[3], (TextView) objArr[5], (View) objArr[7], (TextView) objArr[1], (View) objArr[11], (TextView) objArr[2]);
        this.f30603H = -1L;
        this.f30498x.setTag(null);
        this.f30499y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30602G = constraintLayout;
        constraintLayout.setTag(null);
        this.f30500z.setTag(null);
        this.f30492A.setTag(null);
        this.f30494C.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
