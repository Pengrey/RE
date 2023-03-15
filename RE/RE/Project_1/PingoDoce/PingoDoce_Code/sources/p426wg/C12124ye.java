package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: wg.ye */
/* loaded from: classes2.dex */
public class C12124ye extends AbstractC12106xe {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f31996I = null;

    /* renamed from: J */
    private static final SparseIntArray f31997J;

    /* renamed from: G */
    private final ConstraintLayout f31998G;

    /* renamed from: H */
    private long f31999H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31997J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.background_icon_ImageView, 6);
        sparseIntArray.put(C2336R.C2338id.foreground_ConstraintLayout, 7);
        sparseIntArray.put(C2336R.C2338id.quantity_circle_View, 8);
        sparseIntArray.put(C2336R.C2338id.const_anchor, 9);
        sparseIntArray.put(C2336R.C2338id.edit_ConstraintLayout, 10);
    }

    public C12124ye(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f31996I, f31997J));
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
            mo3596S((TakeAwayProduct) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12106xe
    /* renamed from: S */
    public void mo3596S(TakeAwayProduct takeAwayProduct) {
        this.f31909F = takeAwayProduct;
        synchronized (this) {
            this.f31999H |= 1;
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
        String str3;
        String str4;
        boolean z;
        int i;
        synchronized (this) {
            j = this.f31999H;
            this.f31999H = 0L;
        }
        TakeAwayProduct takeAwayProduct = this.f31909F;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        int i3 = 0;
        String str5 = null;
        if (i2 != 0) {
            if (takeAwayProduct != null) {
                int m14235w = takeAwayProduct.m14235w();
                String m14242k = takeAwayProduct.m14242k();
                str3 = takeAwayProduct.m14241m();
                str4 = takeAwayProduct.m14251a();
                str2 = takeAwayProduct.m14255L();
                i = m14235w;
                str5 = m14242k;
            } else {
                i = 0;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            String str6 = str5;
            z = !(str5 != null ? str5.isEmpty() : false);
            i3 = i;
            str = str6;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            z = false;
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f31912z, str3);
            C7629e.m17885g(this.f31904A, str4);
            this.f31906C.setValue(i3);
            C7629e.m17885g(this.f31907D, str2);
            C7629e.m17885g(this.f31908E, str);
            BindingAdapters.m41779l(this.f31908E, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31999H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31999H = 2L;
        }
        m37826E();
    }

    private C12124ye(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[6], (FrameLayout) objArr[9], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[7], (TextView) objArr[4], (TextView) objArr[5], (View) objArr[8], (QuantityPickerView) objArr[2], (TextView) objArr[1], (TextView) objArr[3]);
        this.f31999H = -1L;
        this.f31912z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31998G = constraintLayout;
        constraintLayout.setTag(null);
        this.f31904A.setTag(null);
        this.f31906C.setTag(null);
        this.f31907D.setTag(null);
        this.f31908E.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
