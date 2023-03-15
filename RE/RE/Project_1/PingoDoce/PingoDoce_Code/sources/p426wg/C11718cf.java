package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import pt.pingodoce.app.data.local.models.clubs.FormFieldOption;

/* renamed from: wg.cf */
/* loaded from: classes2.dex */
public class C11718cf extends AbstractC11700bf {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f30044A = null;

    /* renamed from: B */
    private static final SparseIntArray f30045B;

    /* renamed from: z */
    private long f30046z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30045B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.type_check_box, 1);
    }

    public C11718cf(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30044A, f30045B));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (40 == i) {
            m4412S((FormFieldOption) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m4412S(FormFieldOption formFieldOption) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        synchronized (this) {
            this.f30046z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30046z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30046z = 2L;
        }
        m37826E();
    }

    private C11718cf(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[0], (MaterialCheckBox) objArr[1]);
        this.f30046z = -1L;
        this.f29970x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
