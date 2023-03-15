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

/* renamed from: wg.g8 */
/* loaded from: classes2.dex */
public class C11782g8 extends AbstractC11762f8 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30404C = null;

    /* renamed from: D */
    private static final SparseIntArray f30405D;

    /* renamed from: B */
    private long f30406B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30405D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.image, 2);
        sparseIntArray.put(C2336R.C2338id.card_title, 3);
        sparseIntArray.put(C2336R.C2338id.card_subTitle, 4);
    }

    public C11782g8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30404C, f30405D));
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
            mo4255Q((View.OnClickListener) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11762f8
    /* renamed from: Q */
    public void mo4255Q(View.OnClickListener onClickListener) {
        this.f30315A = onClickListener;
        synchronized (this) {
            this.f30406B |= 1;
        }
        m37781c(67);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30406B;
            this.f30406B = 0L;
        }
        View.OnClickListener onClickListener = this.f30315A;
        if ((j & 3) != 0) {
            this.f30318z.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30406B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30406B = 2L;
        }
        m37826E();
    }

    private C11782g8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[2], (MaterialButton) objArr[1]);
        this.f30406B = -1L;
        this.f30316x.setTag(null);
        this.f30318z.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
