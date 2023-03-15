package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.C0868i;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.button.MaterialButton;
import p164ii.BabyClubViewModel;

/* renamed from: wg.a8 */
/* loaded from: classes2.dex */
public class C11675a8 extends AbstractC12134z7 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f29855E;

    /* renamed from: F */
    private static final SparseIntArray f29856F;

    /* renamed from: B */
    private final FrameLayout f29857B;

    /* renamed from: C */
    private final AbstractC12136z9 f29858C;

    /* renamed from: D */
    private long f29859D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(4);
        f29855E = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{2}, new int[]{C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29856F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.purchase_PlaceHolderRecyclerView, 3);
    }

    public C11675a8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f29855E, f29856F));
    }

    /* renamed from: Q */
    private boolean m4483Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29859D |= 1;
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
        return m4483Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29858C.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            m4480T((Boolean) obj);
        } else if (109 == i) {
            m4481S((BabyClubViewModel) obj);
        } else if (4 != i) {
            return false;
        } else {
            m4482R((View.OnClickListener) obj);
        }
        return true;
    }

    /* renamed from: R */
    public void m4482R(View.OnClickListener onClickListener) {
        this.f32045A = onClickListener;
        synchronized (this) {
            this.f29859D |= 8;
        }
        m37781c(4);
        super.m37826E();
    }

    /* renamed from: S */
    public void m4481S(BabyClubViewModel babyClubViewModel) {
        this.f32048z = babyClubViewModel;
        synchronized (this) {
            this.f29859D |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* renamed from: T */
    public void m4480T(Boolean bool) {
        this.f32047y = bool;
        synchronized (this) {
            this.f29859D |= 2;
        }
        m37781c(110);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = r12.f29859D     // Catch: java.lang.Throwable -> L51
            r2 = 0
            r12.f29859D = r2     // Catch: java.lang.Throwable -> L51
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r4 = r12.f32047y
            ii.r r5 = r12.f32048z
            android.view.View$OnClickListener r6 = r12.f32045A
            r7 = 18
            long r7 = r7 & r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r8 = 21
            long r8 = r8 & r0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r9 = 0
            if (r8 == 0) goto L30
            if (r5 == 0) goto L22
            androidx.lifecycle.LiveData r5 = r5.m20387j()
            goto L23
        L22:
            r5 = r9
        L23:
            r10 = 0
            r12.m37818O(r10, r5)
            if (r5 == 0) goto L30
            java.lang.Object r5 = r5.mo172f()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L31
        L30:
            r5 = r9
        L31:
            r10 = 24
            long r0 = r0 & r10
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L3d
            android.widget.FrameLayout r1 = r12.f29857B
            ae.BindingAdapters.m41779l(r1, r4, r9)
        L3d:
            if (r8 == 0) goto L44
            wg.z9 r1 = r12.f29858C
            r1.mo3570Q(r5)
        L44:
            if (r0 == 0) goto L4b
            com.google.android.material.button.MaterialButton r0 = r12.f32046x
            r0.setOnClickListener(r6)
        L4b:
            wg.z9 r0 = r12.f29858C
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        L51:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L51
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11675a8.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29859D != 0) {
                return true;
            }
            return this.f29858C.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29859D = 16L;
        }
        this.f29858C.mo3579w();
        m37826E();
    }

    private C11675a8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (PlaceHolderRecyclerView) objArr[3], (MaterialButton) objArr[1]);
        this.f29859D = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f29857B = frameLayout;
        frameLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[2];
        this.f29858C = abstractC12136z9;
        m37821J(abstractC12136z9);
        this.f32046x.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
