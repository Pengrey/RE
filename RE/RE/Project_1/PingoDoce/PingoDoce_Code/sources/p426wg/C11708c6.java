package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import p111g.C5586a;
import p246n2.C7629e;

/* renamed from: wg.c6 */
/* loaded from: classes2.dex */
public class C11708c6 extends AbstractC11691b6 {

    /* renamed from: S */
    private static final ViewDataBinding.C1263i f29999S;

    /* renamed from: T */
    private static final SparseIntArray f30000T;

    /* renamed from: Q */
    private final ConstraintLayout f30001Q;

    /* renamed from: R */
    private long f30002R;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(14);
        f29999S = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_empty", "view_loading"}, new int[]{6, 7}, new int[]{C2336R.layout.view_for_empty, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30000T = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_sep, 8);
        sparseIntArray.put(C2336R.C2338id.shopping_list_RecyclerView, 9);
        sparseIntArray.put(C2336R.C2338id.footer_ConstraintLayout, 10);
        sparseIntArray.put(C2336R.C2338id.qrc_icn_FAB, 11);
        sparseIntArray.put(C2336R.C2338id.voice_icn_FAB, 12);
        sparseIntArray.put(C2336R.C2338id.list_MaterialButton, 13);
    }

    public C11708c6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 14, f29999S, f30000T));
    }

    /* renamed from: X */
    private boolean m4434X(AbstractC11799h8 abstractC11799h8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30002R |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4433Y(AbstractC12136z9 abstractC12136z9, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30002R |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return m4434X((AbstractC11799h8) obj, i2);
        }
        return m4433Y((AbstractC12136z9) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29928G.mo3594K(interfaceC1491v);
        this.f29929H.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (99 == i) {
            mo4436V((Boolean) obj);
        } else if (95 == i) {
            mo4437U((Boolean) obj);
        } else if (55 == i) {
            mo4441Q((Integer) obj);
        } else if (93 == i) {
            mo4438T((String) obj);
        } else if (65 == i) {
            mo4440R((String) obj);
        } else if (92 == i) {
            mo4439S((String) obj);
        } else if (104 != i) {
            return false;
        } else {
            mo4435W((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11691b6
    /* renamed from: Q */
    public void mo4441Q(Integer num) {
        this.f29935N = num;
        synchronized (this) {
            this.f30002R |= 16;
        }
        m37781c(55);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11691b6
    /* renamed from: R */
    public void mo4440R(String str) {
        this.f29937P = str;
        synchronized (this) {
            this.f30002R |= 64;
        }
        m37781c(65);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11691b6
    /* renamed from: S */
    public void mo4439S(String str) {
        this.f29934M = str;
        synchronized (this) {
            this.f30002R |= 128;
        }
        m37781c(92);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11691b6
    /* renamed from: T */
    public void mo4438T(String str) {
        this.f29933L = str;
        synchronized (this) {
            this.f30002R |= 32;
        }
        m37781c(93);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11691b6
    /* renamed from: U */
    public void mo4437U(Boolean bool) {
        this.f29931J = bool;
        synchronized (this) {
            this.f30002R |= 8;
        }
        m37781c(95);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11691b6
    /* renamed from: V */
    public void mo4436V(Boolean bool) {
        this.f29936O = bool;
        synchronized (this) {
            this.f30002R |= 4;
        }
        m37781c(99);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11691b6
    /* renamed from: W */
    public void mo4435W(String str) {
        this.f29932K = str;
        synchronized (this) {
            this.f30002R |= 256;
        }
        m37781c(C0868i.f2758E0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        String str;
        Boolean bool;
        int i;
        String str2;
        synchronized (this) {
            j = this.f30002R;
            this.f30002R = 0L;
        }
        Boolean bool2 = this.f29936O;
        Boolean bool3 = this.f29931J;
        Integer num = this.f29935N;
        String str3 = this.f29933L;
        String str4 = this.f29937P;
        String str5 = this.f29934M;
        String str6 = this.f29932K;
        int i2 = ((516 & j) > 0L ? 1 : ((516 & j) == 0L ? 0 : -1));
        int i3 = ((520 & j) > 0L ? 1 : ((520 & j) == 0L ? 0 : -1));
        int i4 = ((528 & j) > 0L ? 1 : ((528 & j) == 0L ? 0 : -1));
        if (i4 != 0) {
            str = String.format(this.f29939y.getResources().getString(C2336R.string.lbl_shopping_list_invisible_item_count), num);
            z = ViewDataBinding.m37824G(num) > 0;
        } else {
            z = false;
            str = null;
        }
        int i5 = ((j & 544) > 0L ? 1 : ((j & 544) == 0L ? 0 : -1));
        int i6 = ((j & 576) > 0L ? 1 : ((j & 576) == 0L ? 0 : -1));
        if (i6 != 0) {
            bool = bool2;
            i = i2;
            str2 = String.format(this.f29922A.getResources().getString(C2336R.string.lbl_last_sync), str4);
            r16 = !(str4 != null ? str4.isEmpty() : false);
        } else {
            bool = bool2;
            i = i2;
            str2 = null;
        }
        int i7 = ((j & 768) > 0L ? 1 : ((j & 768) == 0L ? 0 : -1));
        if ((j & 640) != 0) {
            C7629e.m17885g(this.f29938x, str5);
        }
        if (i4 != 0) {
            C7629e.m17885g(this.f29939y, str);
            BindingAdapters.m41779l(this.f29939y, Boolean.valueOf(z), null);
        }
        if (i7 != 0) {
            C7629e.m17885g(this.f29940z, str6);
        }
        if (i6 != 0) {
            C7629e.m17885g(this.f29922A, str2);
            BindingAdapters.m41779l(this.f29922A, Boolean.valueOf(r16), Boolean.TRUE);
        }
        if (i5 != 0) {
            C7629e.m17885g(this.f29923B, str3);
        }
        if ((j & 512) != 0) {
            this.f29928G.mo4193R(m37802s().getResources().getString(C2336R.string.lbl_empty_shopping_list));
            this.f29928G.mo4192S(C5586a.m23699b(m37802s().getContext(), C2336R.C2337drawable.ic_empty_list));
            this.f29928G.mo4191T(m37802s().getResources().getString(C2336R.string.lbl_empty_shopping_list_title));
        }
        if (i3 != 0) {
            this.f29928G.mo4189V(bool3);
        }
        if (i != 0) {
            this.f29929H.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f29928G);
        ViewDataBinding.m37808m(this.f29929H);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30002R != 0) {
                return true;
            }
            return this.f29928G.mo3580u() || this.f29929H.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30002R = 512L;
        }
        this.f29928G.mo3579w();
        this.f29929H.mo3579w();
        m37826E();
    }

    private C11708c6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (MaterialTextView) objArr[3], (MaterialTextView) objArr[4], (MaterialCardView) objArr[8], (TextView) objArr[2], (TextView) objArr[5], (MaterialTextView) objArr[1], (ConstraintLayout) objArr[10], (MaterialButton) objArr[13], (FloatingActionButton) objArr[11], (RecyclerView) objArr[9], (AbstractC11799h8) objArr[6], (AbstractC12136z9) objArr[7], (FloatingActionButton) objArr[12]);
        this.f30002R = -1L;
        this.f29938x.setTag(null);
        this.f29939y.setTag(null);
        this.f29940z.setTag(null);
        this.f29922A.setTag(null);
        this.f29923B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30001Q = constraintLayout;
        constraintLayout.setTag(null);
        m37821J(this.f29928G);
        m37821J(this.f29929H);
        m37820L(view);
        mo3579w();
    }
}
