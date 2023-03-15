package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p279oj.VersionControlViewModel;

/* renamed from: wg.o4 */
/* loaded from: classes2.dex */
public class C11928o4 extends AbstractC11906n4 {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31118B = null;

    /* renamed from: C */
    private static final SparseIntArray f31119C;

    /* renamed from: A */
    private long f31120A;

    /* renamed from: z */
    private final ConstraintLayout f31121z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31119C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_image, 1);
        sparseIntArray.put(C2336R.C2338id.const_title, 2);
        sparseIntArray.put(C2336R.C2338id.const_description, 3);
        sparseIntArray.put(C2336R.C2338id.button_update_app, 4);
        sparseIntArray.put(C2336R.C2338id.button_not_now, 5);
    }

    public C11928o4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31118B, f31119C));
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
            m3942R(((Boolean) obj).booleanValue());
        } else if (109 != i) {
            return false;
        } else {
            m3943Q((VersionControlViewModel) obj);
        }
        return true;
    }

    /* renamed from: Q */
    public void m3943Q(VersionControlViewModel versionControlViewModel) {
    }

    /* renamed from: R */
    public void m3942R(boolean z) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        synchronized (this) {
            this.f31120A = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31120A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31120A = 4L;
        }
        m37826E();
    }

    private C11928o4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[5], (MaterialButton) objArr[4], (TextView) objArr[3], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f31120A = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31121z = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
