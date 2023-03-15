package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.button.MaterialButton;
import ml.C7517n;

/* renamed from: wg.o3 */
/* loaded from: classes2.dex */
public class C11927o3 extends AbstractC11905n3 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f31110I;

    /* renamed from: J */
    private static final SparseIntArray f31111J;

    /* renamed from: C */
    private final ConstraintLayout f31112C;

    /* renamed from: D */
    private final AbstractC12100x8 f31113D;

    /* renamed from: E */
    private final AbstractC12136z9 f31114E;

    /* renamed from: F */
    private final CoordinatorLayout f31115F;

    /* renamed from: G */
    private final AbstractC11917nf f31116G;

    /* renamed from: H */
    private long f31117H;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(8);
        f31110I = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_no_connection", "view_loading"}, new int[]{5, 6}, new int[]{C2336R.layout.view_for_no_connection, C2336R.layout.view_loading});
        c1263i.m37795a(2, new String[]{"view_toolbar"}, new int[]{4}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31111J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.shopping_lists_PlaceHolderRecyclerView, 7);
    }

    public C11927o3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f31110I, f31111J));
    }

    /* renamed from: R */
    private boolean m3946R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31117H |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3945S(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31117H |= 2;
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
            return m3945S((C1436e0) obj, i2);
        }
        return m3946R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31116G.mo3594K(interfaceC1491v);
        this.f31113D.mo3594K(interfaceC1491v);
        this.f31114E.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (76 == i) {
            mo3947Q((Float) obj);
        } else if (109 != i) {
            return false;
        } else {
            m3944T((C7517n) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11905n3
    /* renamed from: Q */
    public void mo3947Q(Float f) {
        this.f31020A = f;
        synchronized (this) {
            this.f31117H |= 4;
        }
        m37781c(76);
        super.m37826E();
    }

    /* renamed from: T */
    public void m3944T(C7517n c7517n) {
        this.f31021B = c7517n;
        synchronized (this) {
            this.f31117H |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.f31117H     // Catch: java.lang.Throwable -> Lb3
            r4 = 0
            r1.f31117H = r4     // Catch: java.lang.Throwable -> Lb3
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Float r0 = r1.f31020A
            ml.n r6 = r1.f31021B
            r7 = 20
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 27
            long r8 = r8 & r2
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r9 = 26
            r13 = 25
            r15 = 0
            r11 = 0
            if (r8 == 0) goto L72
            long r18 = r2 & r13
            int r8 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r8 == 0) goto L3a
            if (r6 == 0) goto L2d
            androidx.lifecycle.LiveData r8 = r6.m20387j()
            goto L2e
        L2d:
            r8 = r11
        L2e:
            r1.m37818O(r15, r8)
            if (r8 == 0) goto L3a
            java.lang.Object r8 = r8.mo172f()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L3b
        L3a:
            r8 = r11
        L3b:
            long r18 = r2 & r9
            int r12 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r12 == 0) goto L5c
            if (r6 == 0) goto L48
            androidx.lifecycle.e0 r12 = r6.m20352M()
            goto L49
        L48:
            r12 = r11
        L49:
            r15 = 1
            r1.m37818O(r15, r12)
            if (r12 == 0) goto L56
            java.lang.Object r12 = r12.mo172f()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            goto L57
        L56:
            r12 = r11
        L57:
            boolean r12 = androidx.databinding.ViewDataBinding.m37823H(r12)
            r15 = r12
        L5c:
            r16 = 24
            long r18 = r2 & r16
            int r12 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r12 == 0) goto L6f
            if (r6 == 0) goto L6f
            android.view.View$OnClickListener r12 = r6.m20349P()
            android.view.View$OnClickListener r6 = r6.m18290m0()
            goto L75
        L6f:
            r6 = r11
            r12 = r6
            goto L75
        L72:
            r6 = r11
            r8 = r6
            r12 = r8
        L75:
            if (r7 == 0) goto L7c
            androidx.constraintlayout.widget.Guideline r7 = r1.f31022x
            ae.BindingAdapters.m41787d(r7, r0, r11, r11)
        L7c:
            r16 = 24
            long r16 = r2 & r16
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            com.google.android.material.button.MaterialButton r0 = r1.f31023y
            r0.setOnClickListener(r6)
            wg.x8 r0 = r1.f31113D
            r0.mo3603Q(r12)
        L8e:
            long r6 = r2 & r9
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L99
            wg.x8 r0 = r1.f31113D
            r0.mo3602R(r15)
        L99:
            long r2 = r2 & r13
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto La3
            wg.z9 r0 = r1.f31114E
            r0.mo3570Q(r8)
        La3:
            wg.nf r0 = r1.f31116G
            androidx.databinding.ViewDataBinding.m37808m(r0)
            wg.x8 r0 = r1.f31113D
            androidx.databinding.ViewDataBinding.m37808m(r0)
            wg.z9 r0 = r1.f31114E
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        Lb3:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11927o3.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31117H != 0) {
                return true;
            }
            return this.f31116G.mo3580u() || this.f31113D.mo3580u() || this.f31114E.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31117H = 16L;
        }
        this.f31116G.mo3579w();
        this.f31113D.mo3579w();
        this.f31114E.mo3579w();
        m37826E();
    }

    private C11927o3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (Guideline) objArr[1], (MaterialButton) objArr[3], (PlaceHolderRecyclerView) objArr[7]);
        this.f31117H = -1L;
        this.f31022x.setTag(null);
        this.f31023y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31112C = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[5];
        this.f31113D = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[6];
        this.f31114E = abstractC12136z9;
        m37821J(abstractC12136z9);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[2];
        this.f31115F = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[4];
        this.f31116G = abstractC11917nf;
        m37821J(abstractC11917nf);
        m37820L(view);
        mo3579w();
    }
}
