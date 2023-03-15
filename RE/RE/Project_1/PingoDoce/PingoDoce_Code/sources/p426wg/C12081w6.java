package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.button.MaterialButton;
import p186jj.AbstractC6515g;

/* renamed from: wg.w6 */
/* loaded from: classes2.dex */
public class C12081w6 extends AbstractC12064v6 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f31783D;

    /* renamed from: E */
    private static final SparseIntArray f31784E;

    /* renamed from: A */
    private final ConstraintLayout f31785A;

    /* renamed from: B */
    private final AbstractC12136z9 f31786B;

    /* renamed from: C */
    private long f31787C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(4);
        f31783D = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{2}, new int[]{C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31784E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.stores_PlaceHolderRecyclerView, 3);
    }

    public C12081w6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f31783D, f31784E));
    }

    /* renamed from: Q */
    private boolean m3672Q(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31787C |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3671R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31787C |= 1;
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
            return m3672Q((LiveData) obj, i2);
        }
        return m3671R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31786B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3670S((AbstractC6515g) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m3670S(AbstractC6515g abstractC6515g) {
        this.f31723z = abstractC6515g;
        synchronized (this) {
            this.f31787C |= 4;
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
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.f31787C     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r13.f31787C = r2     // Catch: java.lang.Throwable -> L69
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L69
            jj.g r4 = r13.f31723z
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 13
            r8 = 14
            r10 = 0
            if (r5 == 0) goto L4e
            long r11 = r0 & r6
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L31
            if (r4 == 0) goto L23
            androidx.lifecycle.LiveData r5 = r4.m20387j()
            goto L24
        L23:
            r5 = r10
        L24:
            r11 = 0
            r13.m37818O(r11, r5)
            if (r5 == 0) goto L31
            java.lang.Object r5 = r5.mo172f()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L32
        L31:
            r5 = r10
        L32:
            long r11 = r0 & r8
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L4f
            if (r4 == 0) goto L3f
            androidx.lifecycle.LiveData r4 = r4.m20749R()
            goto L40
        L3f:
            r4 = r10
        L40:
            r11 = 1
            r13.m37818O(r11, r4)
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r4.mo172f()
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            goto L4f
        L4e:
            r5 = r10
        L4f:
            long r8 = r8 & r0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L59
            com.google.android.material.button.MaterialButton r4 = r13.f31721x
            p246n2.C7629e.m17885g(r4, r10)
        L59:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L63
            wg.z9 r0 = r13.f31786B
            r0.mo3570Q(r5)
        L63:
            wg.z9 r0 = r13.f31786B
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        L69:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L69
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12081w6.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31787C != 0) {
                return true;
            }
            return this.f31786B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31787C = 8L;
        }
        this.f31786B.mo3579w();
        m37826E();
    }

    private C12081w6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (MaterialButton) objArr[1], (PlaceHolderRecyclerView) objArr[3]);
        this.f31787C = -1L;
        this.f31721x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31785A = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[2];
        this.f31786B = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37820L(view);
        mo3579w();
    }
}
