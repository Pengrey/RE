package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import p319qi.ManageAssociationsViewModel;

/* renamed from: wg.o6 */
/* loaded from: classes2.dex */
public class C11930o6 extends AbstractC11908n6 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f31126F;

    /* renamed from: G */
    private static final SparseIntArray f31127G;

    /* renamed from: C */
    private final ConstraintLayout f31128C;

    /* renamed from: D */
    private final AbstractC12136z9 f31129D;

    /* renamed from: E */
    private long f31130E;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f31126F = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{5}, new int[]{C2336R.layout.view_loading});
        f31127G = null;
    }

    public C11930o6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31126F, f31127G));
    }

    /* renamed from: Q */
    private boolean m3941Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31130E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3940R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31130E |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return m3940R((LiveData) obj, i2);
        }
        return m3941Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31129D.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3939S((ManageAssociationsViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m3939S(ManageAssociationsViewModel manageAssociationsViewModel) {
        this.f31028B = manageAssociationsViewModel;
        synchronized (this) {
            this.f31130E |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r14 = this;
            monitor-enter(r14)
            long r0 = r14.f31130E     // Catch: java.lang.Throwable -> L8b
            r2 = 0
            r14.f31130E = r2     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8b
            qi.d r4 = r14.f31028B
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 13
            r8 = 14
            r10 = 0
            r11 = 0
            if (r5 == 0) goto L53
            long r12 = r0 & r6
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r5 == 0) goto L31
            if (r4 == 0) goto L24
            androidx.lifecycle.LiveData r5 = r4.m20387j()
            goto L25
        L24:
            r5 = r11
        L25:
            r14.m37818O(r10, r5)
            if (r5 == 0) goto L31
            java.lang.Object r5 = r5.mo172f()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L32
        L31:
            r5 = r11
        L32:
            long r12 = r0 & r8
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L54
            if (r4 == 0) goto L3f
            androidx.lifecycle.LiveData r4 = r4.m10053Y()
            goto L40
        L3f:
            r4 = r11
        L40:
            r10 = 1
            r14.m37818O(r10, r4)
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r4.mo172f()
            r11 = r4
            java.lang.Boolean r11 = (java.lang.Boolean) r11
        L4d:
            boolean r4 = androidx.databinding.ViewDataBinding.m37823H(r11)
            r10 = r10 ^ r4
            goto L54
        L53:
            r5 = r11
        L54:
            long r8 = r8 & r0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L7b
            android.widget.TextView r4 = r14.f31029x
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            ae.BindingAdapters.m41779l(r4, r8, r9)
            android.widget.ImageView r4 = r14.f31030y
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r10)
            ae.BindingAdapters.m41779l(r4, r8, r9)
            android.widget.TextView r4 = r14.f31031z
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r10)
            ae.BindingAdapters.m41779l(r4, r8, r9)
            com.github.guilhe.views.PlaceHolderRecyclerView r4 = r14.f31027A
            ae.BindingAdapters.m41779l(r4, r11, r9)
        L7b:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L85
            wg.z9 r0 = r14.f31129D
            r0.mo3570Q(r5)
        L85:
            wg.z9 r0 = r14.f31129D
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        L8b:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11930o6.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31130E != 0) {
                return true;
            }
            return this.f31129D.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31130E = 8L;
        }
        this.f31129D.mo3579w();
        m37826E();
    }

    private C11930o6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (TextView) objArr[3], (ImageView) objArr[1], (TextView) objArr[2], (PlaceHolderRecyclerView) objArr[4]);
        this.f31130E = -1L;
        this.f31029x.setTag(null);
        this.f31030y.setTag(null);
        this.f31031z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31128C = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[5];
        this.f31129D = abstractC12136z9;
        m37821J(abstractC12136z9);
        this.f31027A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
