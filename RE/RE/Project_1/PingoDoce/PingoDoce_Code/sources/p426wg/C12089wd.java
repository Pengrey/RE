package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.wd */
/* loaded from: classes2.dex */
public class C12089wd extends AbstractC12071vd {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f31816A = null;

    /* renamed from: B */
    private static final SparseIntArray f31817B;

    /* renamed from: z */
    private long f31818z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31817B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_img, 1);
        sparseIntArray.put(C2336R.C2338id.const_recent_product_TextView, 2);
    }

    public C12089wd(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31816A, f31817B));
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
            this.f31818z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31818z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31818z = 1L;
        }
        m37826E();
    }

    private C12089wd(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[1], (ConstraintLayout) objArr[0], (TextView) objArr[2]);
        this.f31818z = -1L;
        this.f31739x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
