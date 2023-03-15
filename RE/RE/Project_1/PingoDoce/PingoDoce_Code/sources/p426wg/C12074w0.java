package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import com.airbnb.lottie.LottieAnimationView;
import com.github.aachartmodel.aainfographics.C2336R;
import p496zj.CardRegistrationLandingViewModel;

/* renamed from: wg.w0 */
/* loaded from: classes2.dex */
public class C12074w0 extends AbstractC12058v0 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31747C;

    /* renamed from: D */
    private static final SparseIntArray f31748D;

    /* renamed from: A */
    private final Group f31749A;

    /* renamed from: B */
    private long f31750B;

    /* renamed from: y */
    private final ConstraintLayout f31751y;

    /* renamed from: z */
    private final AbstractC12100x8 f31752z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f31747C = c1263i;
        c1263i.m37795a(0, new String[]{"view_for_no_connection"}, new int[]{2}, new int[]{C2336R.layout.view_for_no_connection});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31748D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_guideline, 3);
        sparseIntArray.put(C2336R.C2338id.const_animation, 4);
        sparseIntArray.put(C2336R.C2338id.const_lbl, 5);
    }

    public C12074w0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31747C, f31748D));
    }

    /* renamed from: Q */
    private boolean m3693Q(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31750B |= 1;
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
        return m3693Q((C1436e0) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31752z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3692R((CardRegistrationLandingViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m3692R(CardRegistrationLandingViewModel cardRegistrationLandingViewModel) {
        this.f31700x = cardRegistrationLandingViewModel;
        synchronized (this) {
            this.f31750B |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
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
            long r0 = r13.f31750B     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r13.f31750B = r2     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5f
            zj.c r4 = r13.f31700x
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 6
            r8 = 0
            r9 = 0
            if (r5 == 0) goto L3d
            if (r4 == 0) goto L1c
            androidx.lifecycle.e0 r10 = r4.m20352M()
            goto L1d
        L1c:
            r10 = r9
        L1d:
            r13.m37818O(r8, r10)
            if (r10 == 0) goto L29
            java.lang.Object r8 = r10.mo172f()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L2a
        L29:
            r8 = r9
        L2a:
            boolean r8 = androidx.databinding.ViewDataBinding.m37823H(r8)
            r10 = r8 ^ 1
            long r11 = r0 & r6
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L3e
            if (r4 == 0) goto L3e
            android.view.View$OnClickListener r4 = r4.m20349P()
            goto L3f
        L3d:
            r10 = r8
        L3e:
            r4 = r9
        L3f:
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L49
            wg.x8 r0 = r13.f31752z
            r0.mo3603Q(r4)
        L49:
            if (r5 == 0) goto L59
            wg.x8 r0 = r13.f31752z
            r0.mo3602R(r8)
            androidx.constraintlayout.widget.Group r0 = r13.f31749A
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            ae.BindingAdapters.m41779l(r0, r1, r9)
        L59:
            wg.x8 r0 = r13.f31752z
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        L5f:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12074w0.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31750B != 0) {
                return true;
            }
            return this.f31752z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31750B = 4L;
        }
        this.f31752z.mo3579w();
        m37826E();
    }

    private C12074w0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (LottieAnimationView) objArr[4], (Guideline) objArr[3], (TextView) objArr[5]);
        this.f31750B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31751y = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[2];
        this.f31752z = abstractC12100x8;
        m37821J(abstractC12100x8);
        Group group = (Group) objArr[1];
        this.f31749A = group;
        group.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
