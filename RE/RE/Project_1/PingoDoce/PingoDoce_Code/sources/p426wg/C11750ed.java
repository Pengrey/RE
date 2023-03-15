package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
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
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;
import pt.pingodoce.app.data.remote.models.response.BrandResponse;

/* renamed from: wg.ed */
/* loaded from: classes2.dex */
public class C11750ed extends AbstractC11733dd {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f30244Q = null;

    /* renamed from: R */
    private static final SparseIntArray f30245R;

    /* renamed from: N */
    private final FrameLayout f30246N;

    /* renamed from: O */
    private final TextView f30247O;

    /* renamed from: P */
    private long f30248P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30245R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.content_ConstraintLayout, 14);
        sparseIntArray.put(C2336R.C2338id.guideline, 15);
    }

    public C11750ed(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 16, f30244Q, f30245R));
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
            mo4357T((CatalogProduct) obj);
        } else if (80 == i) {
            mo4356U((Promotion) obj);
        } else if (77 != i) {
            return false;
        } else {
            mo4358S((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11733dd
    /* renamed from: S */
    public void mo4358S(String str) {
        this.f30133M = str;
        synchronized (this) {
            this.f30248P |= 4;
        }
        m37781c(77);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11733dd
    /* renamed from: T */
    public void mo4357T(CatalogProduct catalogProduct) {
        this.f30131K = catalogProduct;
        synchronized (this) {
            this.f30248P |= 1;
        }
        m37781c(79);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11733dd
    /* renamed from: U */
    public void mo4356U(Promotion promotion) {
        this.f30132L = promotion;
        synchronized (this) {
            this.f30248P |= 2;
        }
        m37781c(80);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        String str6;
        String str7;
        String str8;
        BrandResponse brandResponse;
        String str9;
        synchronized (this) {
            j = this.f30248P;
            this.f30248P = 0L;
        }
        CatalogProduct catalogProduct = this.f30131K;
        Promotion promotion = this.f30132L;
        String str10 = this.f30133M;
        int i3 = ((9 & j) > 0L ? 1 : ((9 & j) == 0L ? 0 : -1));
        boolean z6 = false;
        if (i3 != 0) {
            if (catalogProduct != null) {
                str6 = catalogProduct.m14534K();
                z2 = catalogProduct.m14515b0();
                str7 = catalogProduct.m14540E();
                i2 = catalogProduct.m14538G();
                z3 = catalogProduct.m14528Q();
                str8 = catalogProduct.m14527R();
                brandResponse = catalogProduct.m14503s();
                z4 = catalogProduct.m14500w();
                str9 = catalogProduct.m14525T();
                z = catalogProduct.m14517a0();
            } else {
                z = false;
                z2 = false;
                i2 = 0;
                z3 = false;
                z4 = false;
                str6 = null;
                str7 = null;
                str8 = null;
                brandResponse = null;
                str9 = null;
            }
            z5 = !z3;
            str = String.format(this.f30247O.getResources().getString(C2336R.string.lbl_lx_px), str8);
            z6 = !z4;
            if (brandResponse != null) {
                str2 = brandResponse.m13911b();
                str5 = str6;
                i = i2;
                str3 = str9;
            } else {
                str5 = str6;
                i = i2;
                str3 = str9;
                str2 = null;
            }
            str4 = str7;
        } else {
            z = false;
            i = 0;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        int i4 = ((j & 10) > 0L ? 1 : ((j & 10) == 0L ? 0 : -1));
        String m14466a = (i4 == 0 || promotion == null) ? null : promotion.m14466a();
        int i5 = ((j & 12) > 0L ? 1 : ((j & 12) == 0L ? 0 : -1));
        if (i3 != 0) {
            BindingAdapters.m41779l(this.f30134x, Boolean.valueOf(z6), null);
            BindingAdapters.m41779l(this.f30135y, Boolean.valueOf(z5), null);
            BindingAdapters.m41779l(this.f30136z, Boolean.valueOf(z4), null);
            BindingAdapters.m41779l(this.f30121A, Boolean.valueOf(z4), null);
            BindingAdapters.m41779l(this.f30122B, Boolean.valueOf(z6), null);
            BindingAdapters.m41779l(this.f30246N, Boolean.valueOf(z3), null);
            C7629e.m17885g(this.f30247O, str);
            BindingAdapters.m41779l(this.f30247O, Boolean.valueOf(z), null);
            C7629e.m17885g(this.f30124D, str3);
            BindingAdapters.m41779l(this.f30124D, Boolean.valueOf(z2), null);
            ImageView imageView = this.f30125E;
            BindingAdapters.m41781j(imageView, str5, null, null, C5586a.m23699b(imageView.getContext(), C2336R.C2337drawable.ic_placeholder_product), null);
            BindingAdapters.m41781j(this.f30126F, str2, null, null, null, null);
            this.f30129I.setValue(i);
            C7629e.m17885g(this.f30130J, str4);
        }
        if (i4 != 0) {
            BindingAdapters.m41781j(this.f30122B, m14466a, null, null, null, null);
        }
        if ((j & 8) != 0) {
            BindingAdapters.m41778m(this.f30124D, true);
        }
        if (i5 != 0) {
            C7629e.m17885g(this.f30128H, str10);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30248P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30248P = 8L;
        }
        m37826E();
    }

    private C11750ed(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ConstraintLayout) objArr[4], (ImageView) objArr[13], (ImageView) objArr[7], (TextView) objArr[8], (ImageView) objArr[2], (ConstraintLayout) objArr[14], (Guideline) objArr[15], (TextView) objArr[6], (ImageView) objArr[1], (ImageView) objArr[10], (MaterialCardView) objArr[0], (TextView) objArr[5], (QuantityPickerView) objArr[12], (TextView) objArr[3]);
        this.f30248P = -1L;
        this.f30134x.setTag(null);
        this.f30135y.setTag(null);
        this.f30136z.setTag(null);
        this.f30121A.setTag(null);
        this.f30122B.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[11];
        this.f30246N = frameLayout;
        frameLayout.setTag(null);
        TextView textView = (TextView) objArr[9];
        this.f30247O = textView;
        textView.setTag(null);
        this.f30124D.setTag(null);
        this.f30125E.setTag(null);
        this.f30126F.setTag(null);
        this.f30127G.setTag(null);
        this.f30128H.setTag(null);
        this.f30129I.setTag(null);
        this.f30130J.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
