package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.Flyer;

/* renamed from: wg.oc */
/* loaded from: classes2.dex */
public class C11936oc extends AbstractC11914nc {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31153C = null;

    /* renamed from: D */
    private static final SparseIntArray f31154D;

    /* renamed from: A */
    private final ImageView f31155A;

    /* renamed from: B */
    private long f31156B;

    /* renamed from: z */
    private final ConstraintLayout f31157z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31154D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_flyer_MaterialCardView, 2);
    }

    public C11936oc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31153C, f31154D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (38 == i) {
            mo3919S((Flyer) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11914nc
    /* renamed from: S */
    public void mo3919S(Flyer flyer) {
        this.f31060y = flyer;
        synchronized (this) {
            this.f31156B |= 1;
        }
        m37781c(38);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31156B;
            this.f31156B = 0L;
        }
        Flyer flyer = this.f31060y;
        String str = null;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i != 0 && flyer != null) {
            str = flyer.m13837f();
        }
        String str2 = str;
        if (i != 0) {
            BindingAdapters.m41781j(this.f31155A, str2, null, null, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31156B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31156B = 2L;
        }
        m37826E();
    }

    private C11936oc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[2]);
        this.f31156B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31157z = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f31155A = imageView;
        imageView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
