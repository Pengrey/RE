package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.florent37.expansionpanel.ExpansionLayout;
import com.google.android.gms.maps.MapView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import p205kj.StoreDetailViewModel;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: wg.w3 */
/* loaded from: classes2.dex */
public class C12078w3 extends AbstractC12061v3 {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f31769J;

    /* renamed from: K */
    private static final SparseIntArray f31770K;

    /* renamed from: G */
    private final ConstraintLayout f31771G;

    /* renamed from: H */
    private final AbstractC12136z9 f31772H;

    /* renamed from: I */
    private long f31773I;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(22);
        f31769J = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{7}, new int[]{C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31770K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 8);
        sparseIntArray.put(C2336R.C2338id.const_CollpasingToolbarLayout, 9);
        sparseIntArray.put(C2336R.C2338id.storeMap_MapView, 10);
        sparseIntArray.put(C2336R.C2338id.toolbar, 11);
        sparseIntArray.put(C2336R.C2338id.content_NestedScrollView, 12);
        sparseIntArray.put(C2336R.C2338id.const_pin_image, 13);
        sparseIntArray.put(C2336R.C2338id.const_divider_address, 14);
        sparseIntArray.put(C2336R.C2338id.const_scheduleExpandableLayout, 15);
        sparseIntArray.put(C2336R.C2338id.headerIndicator, 16);
        sparseIntArray.put(C2336R.C2338id.const_scheduleContent, 17);
        sparseIntArray.put(C2336R.C2338id.schedules_RecyclerView, 18);
        sparseIntArray.put(C2336R.C2338id.const_divider_schedule, 19);
        sparseIntArray.put(C2336R.C2338id.const_phone_image, 20);
        sparseIntArray.put(C2336R.C2338id.const_divider_phone, 21);
    }

    public C12078w3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 22, f31769J, f31770K));
    }

    /* renamed from: Q */
    private boolean m3680Q(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31773I |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3679R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31773I |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3678S(LiveData<Store> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31773I |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3677T(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31773I |= 2;
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
                    if (i != 3) {
                        return false;
                    }
                    return m3678S((LiveData) obj, i2);
                }
                return m3680Q((LiveData) obj, i2);
            }
            return m3677T((LiveData) obj, i2);
        }
        return m3679R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31772H.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3676U((StoreDetailViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m3676U(StoreDetailViewModel storeDetailViewModel) {
        this.f31714F = storeDetailViewModel;
        synchronized (this) {
            this.f31773I |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12078w3.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31773I != 0) {
                return true;
            }
            return this.f31772H.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31773I = 32L;
        }
        this.f31772H.mo3579w();
        m37826E();
    }

    private C12078w3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (TextView) objArr[4], (TextView) objArr[2], (CollapsingToolbarLayout) objArr[9], (MaterialButton) objArr[6], (View) objArr[14], (View) objArr[21], (View) objArr[19], (TextView) objArr[1], (TextView) objArr[5], (ImageView) objArr[20], (ImageView) objArr[13], (ExpansionLayout) objArr[17], (TextView) objArr[3], (LinearLayout) objArr[15], (NestedScrollView) objArr[12], (AppBarLayout) objArr[8], (ImageView) objArr[16], (RecyclerView) objArr[18], (MapView) objArr[10], (Toolbar) objArr[11]);
        this.f31773I = -1L;
        this.f31715x.setTag(null);
        this.f31716y.setTag(null);
        this.f31717z.setTag(null);
        this.f31709A.setTag(null);
        this.f31710B.setTag(null);
        this.f31711C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31771G = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[7];
        this.f31772H = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37820L(view);
        mo3579w();
    }
}
