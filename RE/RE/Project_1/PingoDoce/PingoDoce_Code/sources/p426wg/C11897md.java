package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: wg.md */
/* loaded from: classes2.dex */
public class C11897md extends AbstractC11876ld {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f30973H = null;

    /* renamed from: I */
    private static final SparseIntArray f30974I;

    /* renamed from: B */
    private final LinearLayout f30975B;

    /* renamed from: C */
    private final TextView f30976C;

    /* renamed from: D */
    private final TextView f30977D;

    /* renamed from: E */
    private final TextView f30978E;

    /* renamed from: F */
    private final LinearLayout f30979F;

    /* renamed from: G */
    private long f30980G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30974I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_total_lbl, 5);
        sparseIntArray.put(C2336R.C2338id.const_sep1, 6);
        sparseIntArray.put(C2336R.C2338id.const_saved_lbl, 7);
        sparseIntArray.put(C2336R.C2338id.const_sep2, 8);
        sparseIntArray.put(C2336R.C2338id.add_to_shoppinglist_MaterialButton, 9);
    }

    public C11897md(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 10, f30973H, f30974I));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (20 == i) {
            mo3995T((Integer) obj);
        } else if (82 == i) {
            mo3994U((Purchase) obj);
        } else if (18 != i) {
            return false;
        } else {
            mo3996S((List) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11876ld
    /* renamed from: S */
    public void mo3996S(List<String> list) {
        this.f30887z = list;
        synchronized (this) {
            this.f30980G |= 4;
        }
        m37781c(18);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11876ld
    /* renamed from: T */
    public void mo3995T(Integer num) {
        this.f30886y = num;
        synchronized (this) {
            this.f30980G |= 1;
        }
        m37781c(20);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11876ld
    /* renamed from: U */
    public void mo3994U(Purchase purchase) {
        this.f30884A = purchase;
        synchronized (this) {
            this.f30980G |= 2;
        }
        m37781c(82);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        int i;
        String str;
        synchronized (this) {
            j = this.f30980G;
            this.f30980G = 0L;
        }
        Integer num = this.f30886y;
        Purchase purchase = this.f30884A;
        List<String> list = this.f30887z;
        int i2 = ((13 & j) > 0L ? 1 : ((13 & j) == 0L ? 0 : -1));
        if (i2 != 0) {
            i = ViewDataBinding.m37824G(num);
            if ((j & 12) != 0) {
                r10 = !(list != null ? list.isEmpty() : false);
            }
        } else {
            i = 0;
        }
        int i3 = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        String str2 = null;
        if (i3 == 0 || purchase == null) {
            str = null;
        } else {
            String m14436f = purchase.m14436f();
            str2 = purchase.m14441A();
            str = m14436f;
        }
        if (i3 != 0) {
            C7629e.m17885g(this.f30976C, str2);
            C7629e.m17885g(this.f30977D, str);
        }
        if ((j & 12) != 0) {
            TextView textView = this.f30978E;
            Boolean valueOf = Boolean.valueOf(r10);
            Boolean bool = Boolean.TRUE;
            BindingAdapters.m41779l(textView, valueOf, bool);
            BindingAdapters.m41779l(this.f30979F, Boolean.valueOf(r10), bool);
        }
        if (i2 != 0) {
            BindingAdapters.m41784g(this.f30979F, list, i, C2336R.layout.view_row_for_purchase_benefit, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30980G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30980G = 8L;
        }
        m37826E();
    }

    private C11897md(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[9], (TextView) objArr[7], (View) objArr[6], (View) objArr[8], (TextView) objArr[5]);
        this.f30980G = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f30975B = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f30976C = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f30977D = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[3];
        this.f30978E = textView3;
        textView3.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        this.f30979F = linearLayout2;
        linearLayout2.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
