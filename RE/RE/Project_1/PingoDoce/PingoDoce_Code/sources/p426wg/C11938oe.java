package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import p111g.C5586a;
import p246n2.C7629e;
import p361t3.InterfaceC10379c;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: wg.oe */
/* loaded from: classes2.dex */
public class C11938oe extends AbstractC11916ne {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f31163I = null;

    /* renamed from: J */
    private static final SparseIntArray f31164J;

    /* renamed from: G */
    private final TextView f31165G;

    /* renamed from: H */
    private long f31166H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31164J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.content_ConstraintLayout, 7);
        sparseIntArray.put(C2336R.C2338id.guideline, 8);
    }

    public C11938oe(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31163I, f31164J));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (79 == i) {
            mo3916T((TakeAwayProduct) obj);
        } else if (52 != i) {
            return false;
        } else {
            mo3917S((InterfaceC10379c) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11916ne
    /* renamed from: S */
    public void mo3917S(InterfaceC10379c interfaceC10379c) {
        this.f31071F = interfaceC10379c;
        synchronized (this) {
            this.f31166H |= 2;
        }
        m37781c(52);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11916ne
    /* renamed from: T */
    public void mo3916T(TakeAwayProduct takeAwayProduct) {
        this.f31070E = takeAwayProduct;
        synchronized (this) {
            this.f31166H |= 1;
        }
        m37781c(79);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        int i;
        String str;
        String str2;
        String str3;
        boolean z;
        synchronized (this) {
            j = this.f31166H;
            this.f31166H = 0L;
        }
        TakeAwayProduct takeAwayProduct = this.f31070E;
        InterfaceC10379c interfaceC10379c = this.f31071F;
        int i2 = ((7 & j) > 0L ? 1 : ((7 & j) == 0L ? 0 : -1));
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        String str4 = null;
        if (i2 != 0) {
            str2 = takeAwayProduct != null ? takeAwayProduct.m14233z() : null;
            if ((j & 5) != 0) {
                if (takeAwayProduct != null) {
                    String m14241m = takeAwayProduct.m14241m();
                    z = takeAwayProduct.m14261F();
                    str3 = takeAwayProduct.m14259H();
                    i = takeAwayProduct.m14235w();
                    i3 = takeAwayProduct.m14240n();
                    str = m14241m;
                } else {
                    i = 0;
                    str = null;
                    str3 = null;
                    z = false;
                }
                boolean z3 = z;
                str4 = String.valueOf(i3);
                z2 = z3;
            } else {
                i = 0;
                str = null;
                str3 = null;
            }
        } else {
            i = 0;
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((j & 5) != 0) {
            C7629e.m17885g(this.f31072x, str4);
            BindingAdapters.m41779l(this.f31165G, Boolean.valueOf(z2), Boolean.TRUE);
            C7629e.m17885g(this.f31067B, str3);
            this.f31068C.setValue(i);
            C7629e.m17885g(this.f31069D, str);
        }
        if (i2 != 0) {
            ImageView imageView = this.f31074z;
            BindingAdapters.m41781j(imageView, str2, null, null, C5586a.m23699b(imageView.getContext(), C2336R.C2337drawable.ic_placeholder_product), interfaceC10379c);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31166H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31166H = 4L;
        }
        m37826E();
    }

    private C11938oe(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[4], (ConstraintLayout) objArr[7], (Guideline) objArr[8], (ImageView) objArr[1], (MaterialCardView) objArr[0], (TextView) objArr[5], (QuantityPickerView) objArr[6], (TextView) objArr[3]);
        this.f31166H = -1L;
        this.f31072x.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f31165G = textView;
        textView.setTag(null);
        this.f31074z.setTag(null);
        this.f31066A.setTag(null);
        this.f31067B.setTag(null);
        this.f31068C.setTag(null);
        this.f31069D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
