package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.q8 */
/* loaded from: classes2.dex */
public class C11971q8 extends AbstractC11949p8 {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f31307A = null;

    /* renamed from: B */
    private static final SparseIntArray f31308B;

    /* renamed from: y */
    private final MaterialCardView f31309y;

    /* renamed from: z */
    private long f31310z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31308B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.txt_no_benefits, 1);
        sparseIntArray.put(C2336R.C2338id.view_all_cta, 2);
    }

    public C11971q8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31307A, f31308B));
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
            mo3845Q((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11949p8
    /* renamed from: Q */
    public void mo3845Q(Boolean bool) {
        this.f31213x = bool;
        synchronized (this) {
            this.f31310z |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31310z;
            this.f31310z = 0L;
        }
        Boolean bool = this.f31213x;
        if ((j & 3) != 0) {
            BindingAdapters.m41779l(this.f31309y, bool, Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31310z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31310z = 2L;
        }
        m37826E();
    }

    private C11971q8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[1], (TextView) objArr[2]);
        this.f31310z = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f31309y = materialCardView;
        materialCardView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
