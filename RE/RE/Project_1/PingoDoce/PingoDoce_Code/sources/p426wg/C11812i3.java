package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import nl.SharedWithViewModel;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;

/* renamed from: wg.i3 */
/* loaded from: classes2.dex */
public class C11812i3 extends AbstractC11794h3 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30539F;

    /* renamed from: G */
    private static final SparseIntArray f30540G;

    /* renamed from: A */
    private final CoordinatorLayout f30541A;

    /* renamed from: B */
    private final AbstractC12100x8 f30542B;

    /* renamed from: C */
    private final AbstractC12136z9 f30543C;

    /* renamed from: D */
    private final MaterialButton f30544D;

    /* renamed from: E */
    private long f30545E;

    /* renamed from: z */
    private final AbstractC11917nf f30546z;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f30539F = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_for_no_connection", "view_loading"}, new int[]{2, 3, 4}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_for_no_connection, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30540G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.shared_PlaceHolderRecyclerView, 5);
    }

    public C11812i3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30539F, f30540G));
    }

    /* renamed from: Q */
    private boolean m4209Q(LiveData<List<Friend>> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30545E |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4208R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30545E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4207S(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30545E |= 2;
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
                return m4209Q((LiveData) obj, i2);
            }
            return m4207S((C1436e0) obj, i2);
        }
        return m4208R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30546z.mo3594K(interfaceC1491v);
        this.f30542B.mo3594K(interfaceC1491v);
        this.f30543C.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4206T((SharedWithViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m4206T(SharedWithViewModel sharedWithViewModel) {
        this.f30449y = sharedWithViewModel;
        synchronized (this) {
            this.f30545E |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11812i3.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30545E != 0) {
                return true;
            }
            return this.f30546z.mo3580u() || this.f30542B.mo3580u() || this.f30543C.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30545E = 16L;
        }
        this.f30546z.mo3579w();
        this.f30542B.mo3579w();
        this.f30543C.mo3579w();
        m37826E();
    }

    private C11812i3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (PlaceHolderRecyclerView) objArr[5]);
        this.f30545E = -1L;
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[2];
        this.f30546z = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30541A = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC12100x8 abstractC12100x8 = (AbstractC12100x8) objArr[3];
        this.f30542B = abstractC12100x8;
        m37821J(abstractC12100x8);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[4];
        this.f30543C = abstractC12136z9;
        m37821J(abstractC12136z9);
        MaterialButton materialButton = (MaterialButton) objArr[1];
        this.f30544D = materialButton;
        materialButton.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
