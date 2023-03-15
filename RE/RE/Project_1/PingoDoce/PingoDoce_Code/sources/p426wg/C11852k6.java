package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: wg.k6 */
/* loaded from: classes2.dex */
public class C11852k6 extends AbstractC11832j6 {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f30769H = null;

    /* renamed from: I */
    private static final SparseIntArray f30770I;

    /* renamed from: F */
    private final ConstraintLayout f30771F;

    /* renamed from: G */
    private long f30772G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30770I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 1);
        sparseIntArray.put(C2336R.C2338id.voice_TextView, 2);
        sparseIntArray.put(C2336R.C2338id.voice_ripple_LottieAnimationView, 3);
        sparseIntArray.put(C2336R.C2338id.voice_icn_FAB, 4);
        sparseIntArray.put(C2336R.C2338id.reset_TextView, 5);
        sparseIntArray.put(C2336R.C2338id.result_ConstraintLayout, 6);
        sparseIntArray.put(C2336R.C2338id.result_TextView, 7);
        sparseIntArray.put(C2336R.C2338id.result_add_item_MaterialButton, 8);
        sparseIntArray.put(C2336R.C2338id.close_MaterialButton, 9);
    }

    public C11852k6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 10, f30769H, f30770I));
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
            this.f30772G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30772G != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30772G = 1L;
        }
        m37826E();
    }

    private C11852k6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[9], (TextView) objArr[1], (TextView) objArr[5], (MaterialButton) objArr[8], (ConstraintLayout) objArr[6], (TextView) objArr[7], (FloatingActionButton) objArr[4], (LottieAnimationView) objArr[3], (TextView) objArr[2]);
        this.f30772G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30771F = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
