package p426wg;

import ae.BindingAdapters;
import android.text.Spanned;
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
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: wg.qe */
/* loaded from: classes2.dex */
public class C11978qe extends AbstractC11955pe {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f31333G = null;

    /* renamed from: H */
    private static final SparseIntArray f31334H;

    /* renamed from: F */
    private long f31335F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31334H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.content_ConstraintLayout, 6);
        sparseIntArray.put(C2336R.C2338id.guideline, 7);
    }

    public C11978qe(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f31333G, f31334H));
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
            mo3835S((TakeAwayProduct) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11955pe
    /* renamed from: S */
    public void mo3835S(TakeAwayProduct takeAwayProduct) {
        this.f31232E = takeAwayProduct;
        synchronized (this) {
            this.f31335F |= 1;
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
        Spanned spanned;
        String str4;
        String str5;
        synchronized (this) {
            j = this.f31335F;
            this.f31335F = 0L;
        }
        TakeAwayProduct takeAwayProduct = this.f31232E;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str6 = null;
        if (i2 != 0) {
            if (takeAwayProduct != null) {
                Spanned m14248d = takeAwayProduct.m14248d();
                String m14257J = takeAwayProduct.m14257J();
                str4 = takeAwayProduct.m14241m();
                str2 = takeAwayProduct.m14257J();
                str5 = takeAwayProduct.m14259H();
                i = takeAwayProduct.m14235w();
                spanned = m14248d;
                str6 = m14257J;
            } else {
                i = 0;
                spanned = null;
                str4 = null;
                str2 = null;
                str5 = null;
            }
            r1 = !(str6 != null ? str6.isEmpty() : false);
            str6 = spanned;
            str3 = str4;
            str = str5;
        } else {
            i = 0;
            str = null;
            str2 = null;
            str3 = null;
        }
        if (i2 != 0) {
            BindingAdapters.m41779l(this.f31233x, Boolean.valueOf(r1), Boolean.TRUE);
            BindingAdapters.m41781j(this.f31233x, str2, null, null, null, null);
            C7629e.m17885g(this.f31235z, str6);
            C7629e.m17885g(this.f31229B, str);
            this.f31230C.setValue(i);
            C7629e.m17885g(this.f31231D, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31335F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31335F = 2L;
        }
        m37826E();
    }

    private C11978qe(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[4], (ConstraintLayout) objArr[6], (Guideline) objArr[7], (TextView) objArr[2], (MaterialCardView) objArr[0], (TextView) objArr[3], (QuantityPickerView) objArr[5], (TextView) objArr[1]);
        this.f31335F = -1L;
        this.f31233x.setTag(null);
        this.f31235z.setTag(null);
        this.f31228A.setTag(null);
        this.f31229B.setTag(null);
        this.f31230C.setTag(null);
        this.f31231D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
