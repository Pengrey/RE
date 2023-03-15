package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import p299pj.WalkThroughViewModel;

/* renamed from: wg.u4 */
/* loaded from: classes2.dex */
public class C12045u4 extends AbstractC12021t4 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f31634F;

    /* renamed from: G */
    private static final SparseIntArray f31635G;

    /* renamed from: B */
    private final ConstraintLayout f31636B;

    /* renamed from: C */
    private final MaterialButton f31637C;

    /* renamed from: D */
    private final MaterialButton f31638D;

    /* renamed from: E */
    private long f31639E;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f31634F = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{3}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31635G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.walkthrough_ViewPager2, 4);
        sparseIntArray.put(C2336R.C2338id.const_bottom, 5);
        sparseIntArray.put(C2336R.C2338id.walkthrough_TabLayout, 6);
    }

    public C12045u4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f31634F, f31635G));
    }

    /* renamed from: Q */
    private boolean m3730Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31639E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3729R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31639E |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3728S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31639E |= 4;
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
                if (i != 2) {
                    return false;
                }
                return m3728S((LiveData) obj, i2);
            }
            return m3729R((LiveData) obj, i2);
        }
        return m3730Q((AbstractC11917nf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31516x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3727T((WalkThroughViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m3727T(WalkThroughViewModel walkThroughViewModel) {
        this.f31515A = walkThroughViewModel;
        synchronized (this) {
            this.f31639E |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            long r2 = r1.f31639E     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            r1.f31639E = r4     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L9b
            pj.g r0 = r1.f31515A
            r6 = 0
            r7 = 30
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r8 = 28
            r10 = 26
            r12 = 24
            if (r7 == 0) goto L6a
            long r15 = r2 & r10
            int r7 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            r15 = 1
            if (r7 == 0) goto L35
            if (r0 == 0) goto L28
            androidx.lifecycle.LiveData r7 = r0.m14945P()
            goto L29
        L28:
            r7 = 0
        L29:
            r1.m37818O(r15, r7)
            if (r7 == 0) goto L35
            java.lang.Object r7 = r7.mo172f()
            java.lang.String r7 = (java.lang.String) r7
            goto L36
        L35:
            r7 = 0
        L36:
            long r16 = r2 & r8
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L57
            if (r0 == 0) goto L43
            androidx.lifecycle.LiveData r6 = r0.m14943R()
            goto L44
        L43:
            r6 = 0
        L44:
            r14 = 2
            r1.m37818O(r14, r6)
            if (r6 == 0) goto L51
            java.lang.Object r6 = r6.mo172f()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L52
        L51:
            r6 = 0
        L52:
            boolean r6 = androidx.databinding.ViewDataBinding.m37823H(r6)
            r6 = r6 ^ r15
        L57:
            long r14 = r2 & r12
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L68
            if (r0 == 0) goto L68
            android.view.View$OnClickListener r14 = r0.m14940U()
            android.view.View$OnClickListener r0 = r0.m14947N()
            goto L6d
        L68:
            r0 = 0
            goto L6c
        L6a:
            r0 = 0
            r7 = 0
        L6c:
            r14 = 0
        L6d:
            long r12 = r12 & r2
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L7c
            com.google.android.material.button.MaterialButton r12 = r1.f31637C
            r12.setOnClickListener(r14)
            com.google.android.material.button.MaterialButton r12 = r1.f31638D
            r12.setOnClickListener(r0)
        L7c:
            long r10 = r10 & r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L86
            com.google.android.material.button.MaterialButton r0 = r1.f31638D
            p246n2.C7629e.m17885g(r0, r7)
        L86:
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L95
            com.google.android.material.button.MaterialButton r0 = r1.f31638D
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r3 = 0
            ae.BindingAdapters.m41779l(r0, r2, r3)
        L95:
            wg.nf r0 = r1.f31516x
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        L9b:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12045u4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31639E != 0) {
                return true;
            }
            return this.f31516x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31639E = 16L;
        }
        this.f31516x.mo3579w();
        m37826E();
    }

    private C12045u4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (ConstraintLayout) objArr[5], (AbstractC11917nf) objArr[3], (TabLayout) objArr[6], (ViewPager2) objArr[4]);
        this.f31639E = -1L;
        m37821J(this.f31516x);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31636B = constraintLayout;
        constraintLayout.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[1];
        this.f31637C = materialButton;
        materialButton.setTag(null);
        MaterialButton materialButton2 = (MaterialButton) objArr[2];
        this.f31638D = materialButton2;
        materialButton2.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
