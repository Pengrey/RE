package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import p068di.WebViewModel;
import p494zh.BaseViewModel;

/* renamed from: wg.w4 */
/* loaded from: classes2.dex */
public class C12079w4 extends AbstractC12062v4 {

    /* renamed from: D */
    private static final ViewDataBinding.C1263i f31774D;

    /* renamed from: E */
    private static final SparseIntArray f31775E;

    /* renamed from: A */
    private final ConstraintLayout f31776A;

    /* renamed from: B */
    private final AbstractC12136z9 f31777B;

    /* renamed from: C */
    private long f31778C;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(4);
        f31774D = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{1, 2}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31775E = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.activity_web_WebView, 3);
    }

    public C12079w4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f31774D, f31775E));
    }

    /* renamed from: Q */
    private boolean m3675Q(AbstractC11917nf abstractC11917nf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31778C |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3674R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31778C |= 2;
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
            return m3674R((LiveData) obj, i2);
        }
        return m3675Q((AbstractC11917nf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31719y.mo3594K(interfaceC1491v);
        this.f31777B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3673S((WebViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public void m3673S(WebViewModel webViewModel) {
        this.f31720z = webViewModel;
        synchronized (this) {
            this.f31778C |= 4;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31778C;
            this.f31778C = 0L;
        }
        BaseViewModel baseViewModel = this.f31720z;
        int i = ((j & 14) > 0L ? 1 : ((j & 14) == 0L ? 0 : -1));
        Boolean bool = null;
        if (i != 0) {
            LiveData m20387j = baseViewModel != null ? baseViewModel.m20387j() : null;
            m37818O(1, m20387j);
            if (m20387j != null) {
                bool = (Boolean) m20387j.mo172f();
            }
        }
        if (i != 0) {
            this.f31777B.mo3570Q(bool);
        }
        ViewDataBinding.m37808m(this.f31719y);
        ViewDataBinding.m37808m(this.f31777B);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31778C != 0) {
                return true;
            }
            return this.f31719y.mo3580u() || this.f31777B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31778C = 8L;
        }
        this.f31719y.mo3579w();
        this.f31777B.mo3579w();
        m37826E();
    }

    private C12079w4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 2, (WebView) objArr[3], (AbstractC11917nf) objArr[1]);
        this.f31778C = -1L;
        m37821J(this.f31719y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31776A = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[2];
        this.f31777B = abstractC12136z9;
        m37821J(abstractC12136z9);
        m37820L(view);
        mo3579w();
    }
}
