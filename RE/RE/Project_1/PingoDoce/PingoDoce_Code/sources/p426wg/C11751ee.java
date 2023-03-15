package p426wg;

import ae.BindingAdapters;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import lib.mozidev.p225me.extextview.ExTextView;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* renamed from: wg.ee */
/* loaded from: classes2.dex */
public class C11751ee extends AbstractC11734de {

    /* renamed from: T */
    private static final ViewDataBinding.C1263i f30249T = null;

    /* renamed from: U */
    private static final SparseIntArray f30250U;

    /* renamed from: R */
    private final ConstraintLayout f30251R;

    /* renamed from: S */
    private long f30252S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30250U = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.background_icon_ImageView, 8);
        sparseIntArray.put(C2336R.C2338id.foreground_ConstraintLayout, 9);
        sparseIntArray.put(C2336R.C2338id.quantity_circle_View, 10);
        sparseIntArray.put(C2336R.C2338id.const_anchor, 11);
        sparseIntArray.put(C2336R.C2338id.item_CheckBox, 12);
        sparseIntArray.put(C2336R.C2338id.edit_ConstraintLayout, 13);
        sparseIntArray.put(C2336R.C2338id.const_end, 14);
        sparseIntArray.put(C2336R.C2338id.badge_disclaimer_ImageButton, 15);
        sparseIntArray.put(C2336R.C2338id.btn_search_ImageButton, 16);
    }

    public C11751ee(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 17, f30249T, f30250U));
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
            mo4353U((ShoppingListProduct) obj);
        } else if (78 == i) {
            mo4350X((String) obj);
        } else if (71 == i) {
            mo4352V((Integer) obj);
        } else if (76 == i) {
            mo4351W((Float) obj);
        } else if (29 == i) {
            mo4355S((Long) obj);
        } else if (54 == i) {
            mo4354T((TimeInterpolator) obj);
        } else if (81 != i) {
            return false;
        } else {
            mo4349Y((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11734de
    /* renamed from: S */
    public void mo4355S(Long l) {
        this.f30150N = l;
        synchronized (this) {
            this.f30252S |= 16;
        }
        m37781c(29);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11734de
    /* renamed from: T */
    public void mo4354T(TimeInterpolator timeInterpolator) {
        this.f30149M = timeInterpolator;
        synchronized (this) {
            this.f30252S |= 32;
        }
        m37781c(54);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11734de
    /* renamed from: U */
    public void mo4353U(ShoppingListProduct shoppingListProduct) {
        this.f30151O = shoppingListProduct;
        synchronized (this) {
            this.f30252S |= 1;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11734de
    /* renamed from: V */
    public void mo4352V(Integer num) {
    }

    @Override // p426wg.AbstractC11734de
    /* renamed from: W */
    public void mo4351W(Float f) {
        this.f30148L = f;
        synchronized (this) {
            this.f30252S |= 8;
        }
        m37781c(76);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11734de
    /* renamed from: X */
    public void mo4350X(String str) {
        this.f30152P = str;
        synchronized (this) {
            this.f30252S |= 2;
        }
        m37781c(78);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11734de
    /* renamed from: Y */
    public void mo4349Y(String str) {
        this.f30153Q = str;
        synchronized (this) {
            this.f30252S |= 64;
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
        int i;
        boolean z;
        int i2;
        String str4;
        String str5;
        String str6;
        synchronized (this) {
            j = this.f30252S;
            this.f30252S = 0L;
        }
        ShoppingListProduct shoppingListProduct = this.f30151O;
        String str7 = this.f30152P;
        Float f = this.f30148L;
        Long l = this.f30150N;
        TimeInterpolator timeInterpolator = this.f30149M;
        String str8 = this.f30153Q;
        int i3 = ((129 & j) > 0L ? 1 : ((129 & j) == 0L ? 0 : -1));
        String str9 = null;
        if (i3 != 0) {
            if (shoppingListProduct != null) {
                int m14327s = shoppingListProduct.m14327s();
                String m14323y = shoppingListProduct.m14323y();
                str6 = shoppingListProduct.m14348F();
                str = shoppingListProduct.m14329n();
                i = m14327s;
                str9 = m14323y;
            } else {
                str = null;
                str6 = null;
                i = 0;
            }
            z = !(str9 != null ? str9.isEmpty() : false);
            str3 = str6;
            str2 = str9;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            i = 0;
            z = false;
        }
        int i4 = ((j & 130) > 0L ? 1 : ((j & 130) == 0L ? 0 : -1));
        int i5 = ((j & 184) > 0L ? 1 : ((j & 184) == 0L ? 0 : -1));
        if ((j & 192) != 0) {
            i2 = i;
            str4 = str2;
            str5 = str3;
            BindingAdapters.m41781j(this.f30156z, str8, null, null, null, null);
        } else {
            i2 = i;
            str4 = str2;
            str5 = str3;
        }
        if (i5 != 0) {
            BindingAdapters.m41787d(this.f30138B, f, timeInterpolator, l);
        }
        if (i3 != 0) {
            C7629e.m17885g(this.f30142F, str);
            this.f30145I.setValue(i2);
            C7629e.m17885g(this.f30146J, str5);
            C7629e.m17885g(this.f30147K, str4);
            BindingAdapters.m41779l(this.f30147K, Boolean.valueOf(z), Boolean.TRUE);
        }
        if (i4 != 0) {
            C7629e.m17885g(this.f30143G, str7);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30252S != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30252S = 128L;
        }
        m37826E();
    }

    private C11751ee(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[8], (ImageButton) objArr[15], (ImageView) objArr[6], (ImageButton) objArr[16], (FrameLayout) objArr[11], (ConstraintLayout) objArr[14], (Guideline) objArr[1], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[9], (CheckBox) objArr[12], (ExTextView) objArr[5], (TextView) objArr[7], (View) objArr[10], (QuantityPickerView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.f30252S = -1L;
        this.f30156z.setTag(null);
        this.f30138B.setTag(null);
        this.f30142F.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30251R = constraintLayout;
        constraintLayout.setTag(null);
        this.f30143G.setTag(null);
        this.f30145I.setTag(null);
        this.f30146J.setTag(null);
        this.f30147K.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
