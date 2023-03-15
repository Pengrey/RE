package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: wg.sf */
/* loaded from: classes2.dex */
public class C12015sf extends AbstractC11996rf {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31491B = null;

    /* renamed from: C */
    private static final SparseIntArray f31492C;

    /* renamed from: A */
    private long f31493A;

    /* renamed from: y */
    private final AppBarLayout f31494y;

    /* renamed from: z */
    private final ImageView f31495z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31492C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.toolbar, 2);
    }

    public C12015sf(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31491B, f31492C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (48 == i) {
            mo3774Q((Boolean) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11996rf
    /* renamed from: Q */
    public void mo3774Q(Boolean bool) {
        this.f31396x = bool;
        synchronized (this) {
            this.f31493A |= 1;
        }
        m37781c(48);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31493A;
            this.f31493A = 0L;
        }
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        boolean z = i != 0 ? !ViewDataBinding.m37823H(this.f31396x) : false;
        if (i != 0) {
            BindingAdapters.m41779l(this.f31495z, Boolean.valueOf(z), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31493A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31493A = 2L;
        }
        m37826E();
    }

    private C12015sf(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (Toolbar) objArr[2]);
        this.f31493A = -1L;
        AppBarLayout appBarLayout = (AppBarLayout) objArr[0];
        this.f31494y = appBarLayout;
        appBarLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f31495z = imageView;
        imageView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
