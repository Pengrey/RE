package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.u8 */
/* loaded from: classes2.dex */
public class C12049u8 extends AbstractC12025t8 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31656B = null;

    /* renamed from: C */
    private static final SparseIntArray f31657C;

    /* renamed from: A */
    private long f31658A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31657C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.image, 2);
        sparseIntArray.put(C2336R.C2338id.card_title, 3);
        sparseIntArray.put(C2336R.C2338id.card_subTitle, 4);
    }

    public C12049u8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31656B, f31657C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (67 == i) {
            mo3717Q((View.OnClickListener) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12025t8
    /* renamed from: Q */
    public void mo3717Q(View.OnClickListener onClickListener) {
        this.f31535z = onClickListener;
        synchronized (this) {
            this.f31658A |= 1;
        }
        m37781c(67);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31658A;
            this.f31658A = 0L;
        }
        View.OnClickListener onClickListener = this.f31535z;
        if ((j & 3) != 0) {
            this.f31534y.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31658A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31658A = 2L;
        }
        m37826E();
    }

    private C12049u8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[2], (MaterialButton) objArr[1]);
        this.f31658A = -1L;
        this.f31533x.setTag(null);
        this.f31534y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
