package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Flyer;

/* renamed from: wg.k8 */
/* loaded from: classes2.dex */
public class C11854k8 extends AbstractC11834j8 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f30777D = null;

    /* renamed from: E */
    private static final SparseIntArray f30778E;

    /* renamed from: B */
    private final FrameLayout f30779B;

    /* renamed from: C */
    private long f30780C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30778E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_flyer_MaterialCardView, 4);
    }

    public C11854k8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f30777D, f30778E));
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
            mo4084S((Flyer) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11834j8
    /* renamed from: S */
    public void mo4084S(Flyer flyer) {
        this.f30679A = flyer;
        synchronized (this) {
            this.f30780C |= 1;
        }
        m37781c(38);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.f30780C;
            this.f30780C = 0L;
        }
        Flyer flyer = this.f30679A;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i == 0 || flyer == null) {
            str = null;
            str2 = null;
        } else {
            String m13833k = flyer.m13833k();
            String m13839d = flyer.m13839d();
            str2 = flyer.m13837f();
            str = m13833k;
            str3 = m13839d;
        }
        if (i != 0) {
            BindingAdapters.m41781j(this.f30680x, str2, null, null, null, null);
            C7629e.m17885g(this.f30681y, str3);
            C7629e.m17885g(this.f30682z, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30780C != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30780C = 2L;
        }
        m37826E();
    }

    private C11854k8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[1], (MaterialCardView) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.f30780C = -1L;
        this.f30680x.setTag(null);
        this.f30681y.setTag(null);
        this.f30682z.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f30779B = frameLayout;
        frameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
