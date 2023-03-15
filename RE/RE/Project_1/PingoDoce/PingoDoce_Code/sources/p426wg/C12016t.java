package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p320qj.DebugViewModel;
import p494zh.BaseViewModel;

/* renamed from: wg.t */
/* loaded from: classes2.dex */
public class C12016t extends AbstractC11997s {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f31496Q;

    /* renamed from: R */
    private static final SparseIntArray f31497R;

    /* renamed from: N */
    private final AbstractC12136z9 f31498N;

    /* renamed from: O */
    private final ConstraintLayout f31499O;

    /* renamed from: P */
    private long f31500P;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(18);
        f31496Q = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{1}, new int[]{C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31497R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.container, 2);
        sparseIntArray.put(C2336R.C2338id.refresh_token_button, 3);
        sparseIntArray.put(C2336R.C2338id.refresh_token_load_test_button, 4);
        sparseIntArray.put(C2336R.C2338id.invalidate_token_button, 5);
        sparseIntArray.put(C2336R.C2338id.invalidate_refresh_token_button, 6);
        sparseIntArray.put(C2336R.C2338id.invalidate_access_token_ttl_button, 7);
        sparseIntArray.put(C2336R.C2338id.access_token_value, 8);
        sparseIntArray.put(C2336R.C2338id.refresh_token_value, 9);
        sparseIntArray.put(C2336R.C2338id.access_token_ttl_value, 10);
        sparseIntArray.put(C2336R.C2338id.delete_loyalty_card, 11);
        sparseIntArray.put(C2336R.C2338id.open_web_view, 12);
        sparseIntArray.put(C2336R.C2338id.clear_coachmarks, 13);
        sparseIntArray.put(C2336R.C2338id.clear_default_store, 14);
        sparseIntArray.put(C2336R.C2338id.caches, 15);
        sparseIntArray.put(C2336R.C2338id.clear_user, 16);
        sparseIntArray.put(C2336R.C2338id.debug_button, 17);
    }

    public C12016t(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 18, f31496Q, f31497R));
    }

    /* renamed from: Q */
    private boolean m3773Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31500P |= 1;
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
        return m3773Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31498N.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3772R((DebugViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m3772R(DebugViewModel debugViewModel) {
        this.f31409M = debugViewModel;
        synchronized (this) {
            this.f31500P |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31500P;
            this.f31500P = 0L;
        }
        BaseViewModel baseViewModel = this.f31409M;
        int i = ((j & 7) > 0L ? 1 : ((j & 7) == 0L ? 0 : -1));
        Boolean bool = null;
        if (i != 0) {
            LiveData m20387j = baseViewModel != null ? baseViewModel.m20387j() : null;
            m37818O(0, m20387j);
            if (m20387j != null) {
                bool = (Boolean) m20387j.mo172f();
            }
        }
        if (i != 0) {
            this.f31498N.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f31498N);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31500P != 0) {
                return true;
            }
            return this.f31498N.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31500P = 4L;
        }
        this.f31498N.mo3579w();
        m37826E();
    }

    private C12016t(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (TextView) objArr[10], (TextView) objArr[8], (MaterialButton) objArr[15], (MaterialButton) objArr[13], (MaterialButton) objArr[14], (MaterialButton) objArr[16], (LinearLayout) objArr[2], (FloatingActionButton) objArr[17], (MaterialButton) objArr[11], (MaterialButton) objArr[7], (MaterialButton) objArr[6], (MaterialButton) objArr[5], (MaterialButton) objArr[12], (MaterialButton) objArr[3], (MaterialButton) objArr[4], (TextView) objArr[9]);
        this.f31500P = -1L;
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[1];
        this.f31498N = abstractC12136z9;
        m37821J(abstractC12136z9);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31499O = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
