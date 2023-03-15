package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import p048cj.ProductDetailViewModel;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* renamed from: wg.a6 */
/* loaded from: classes2.dex */
public class C11673a6 extends AbstractC12132z5 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f29843E = null;

    /* renamed from: F */
    private static final SparseIntArray f29844F;

    /* renamed from: B */
    private final ConstraintLayout f29845B;

    /* renamed from: C */
    private final Group f29846C;

    /* renamed from: D */
    private long f29847D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29844F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_filters_header, 5);
        sparseIntArray.put(C2336R.C2338id.const_divider, 6);
    }

    public C11673a6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f29843E, f29844F));
    }

    /* renamed from: T */
    private boolean m4489T(LiveData<CatalogProduct> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29847D |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m4489T((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            mo3572S((ProductDetailViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12132z5
    /* renamed from: S */
    public void mo3572S(ProductDetailViewModel productDetailViewModel) {
        this.f32039A = productDetailViewModel;
        synchronized (this) {
            this.f29847D |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.f29847D     // Catch: java.lang.Throwable -> L63
            r2 = 0
            r10.f29847D = r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            cj.i r4 = r10.f32039A
            r5 = 7
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L3f
            if (r4 == 0) goto L1a
            androidx.lifecycle.LiveData r3 = r4.m34554o0()
            goto L1b
        L1a:
            r3 = r2
        L1b:
            r10.m37818O(r1, r3)
            if (r3 == 0) goto L27
            java.lang.Object r3 = r3.mo172f()
            pt.pingodoce.app.data.local.models.products.CatalogProduct r3 = (pt.pingodoce.app.data.local.models.products.CatalogProduct) r3
            goto L28
        L27:
            r3 = r2
        L28:
            if (r3 == 0) goto L3f
            java.lang.String r2 = r3.m14518a()
            java.lang.String r1 = r3.m14516b()
            java.lang.String r4 = r3.m14514c()
            boolean r3 = r3.m14532M()
            r9 = r1
            r8 = r2
            r1 = r3
            r3 = r4
            goto L42
        L3f:
            r3 = r2
            r8 = r3
            r9 = r8
        L42:
            if (r0 == 0) goto L62
            android.widget.ImageView r2 = r10.f32040x
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            ae.BindingAdapters.m41781j(r2, r3, r4, r5, r6, r7)
            android.widget.TextView r0 = r10.f32041y
            p246n2.C7629e.m17885g(r0, r8)
            android.widget.TextView r0 = r10.f32042z
            p246n2.C7629e.m17885g(r0, r9)
            androidx.constraintlayout.widget.Group r0 = r10.f29846C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            ae.BindingAdapters.m41779l(r0, r1, r2)
        L62:
            return
        L63:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11673a6.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f29847D != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29847D = 4L;
        }
        m37826E();
    }

    private C11673a6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (View) objArr[6], (TextView) objArr[5]);
        this.f29847D = -1L;
        this.f32040x.setTag(null);
        this.f32041y.setTag(null);
        this.f32042z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29845B = constraintLayout;
        constraintLayout.setTag(null);
        Group group = (Group) objArr[1];
        this.f29846C = group;
        group.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
