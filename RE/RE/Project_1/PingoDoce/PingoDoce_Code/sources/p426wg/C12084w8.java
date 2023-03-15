package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.w8 */
/* loaded from: classes2.dex */
public class C12084w8 extends AbstractC12066v8 {

    /* renamed from: A */
    private static final SparseIntArray f31794A;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f31795z = null;

    /* renamed from: x */
    private final LinearLayout f31796x;

    /* renamed from: y */
    private long f31797y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31794A = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 1);
        sparseIntArray.put(C2336R.C2338id.card2, 2);
    }

    public C12084w8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31795z, f31794A));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        synchronized (this) {
            this.f31797y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31797y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31797y = 1L;
        }
        m37826E();
    }

    private C12084w8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[2], (TextView) objArr[1]);
        this.f31797y = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31796x = linearLayout;
        linearLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
