package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.ia */
/* loaded from: classes2.dex */
public class C11819ia extends AbstractC11801ha {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f30584A = null;

    /* renamed from: B */
    private static final SparseIntArray f30585B;

    /* renamed from: y */
    private final LinearLayout f30586y;

    /* renamed from: z */
    private long f30587z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30585B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_image, 1);
        sparseIntArray.put(C2336R.C2338id.const_title, 2);
    }

    public C11819ia(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f30584A, f30585B));
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
            mo4186Q(((Boolean) obj).booleanValue());
        } else if (73 != i) {
            return false;
        } else {
            m4185R((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11801ha
    /* renamed from: Q */
    public void mo4186Q(boolean z) {
        this.f30468x = z;
        synchronized (this) {
            this.f30587z |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    /* renamed from: R */
    public void m4185R(String str) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30587z;
            this.f30587z = 0L;
        }
        boolean z = this.f30468x;
        if ((j & 5) != 0) {
            BindingAdapters.m41779l(this.f30586y, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30587z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30587z = 4L;
        }
        m37826E();
    }

    private C11819ia(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[1], (TextView) objArr[2]);
        this.f30587z = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f30586y = linearLayout;
        linearLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
