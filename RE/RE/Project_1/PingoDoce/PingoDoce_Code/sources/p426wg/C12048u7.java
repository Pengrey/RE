package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: wg.u7 */
/* loaded from: classes2.dex */
public class C12048u7 extends AbstractC12024t7 {

    /* renamed from: A */
    private static final SparseIntArray f31652A;

    /* renamed from: z */
    private static final ViewDataBinding.C1263i f31653z = null;

    /* renamed from: x */
    private final FrameLayout f31654x;

    /* renamed from: y */
    private long f31655y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31652A = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.debug_button, 1);
    }

    public C12048u7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f31653z, f31652A));
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
            this.f31655y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31655y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31655y = 1L;
        }
        m37826E();
    }

    private C12048u7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (FloatingActionButton) objArr[1]);
        this.f31655y = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31654x = frameLayout;
        frameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
