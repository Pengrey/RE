package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import p451xi.AbstractC12995e;

/* renamed from: wg.g2 */
/* loaded from: classes2.dex */
public class C11774g2 extends AbstractC11756f2 {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f30364J;

    /* renamed from: K */
    private static final SparseIntArray f30365K;

    /* renamed from: F */
    private final CoordinatorLayout f30366F;

    /* renamed from: G */
    private final ConstraintLayout f30367G;

    /* renamed from: H */
    private final MaterialButton f30368H;

    /* renamed from: I */
    private long f30369I;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(12);
        f30364J = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image"}, new int[]{8}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30365K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.onboarding_AppBarLayout, 9);
        sparseIntArray.put(C2336R.C2338id.onboarding_resume_RecyclerView, 10);
        sparseIntArray.put(C2336R.C2338id.const_info_title, 11);
    }

    public C11774g2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 12, f30364J, f30365K));
    }

    /* renamed from: Q */
    private boolean m4290Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4289R(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4288S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4287T(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4286U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4285V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4284W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4283X(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30369I |= 32;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return m4287T((LiveData) obj, i2);
            case 1:
                return m4284W((LiveData) obj, i2);
            case 2:
                return m4289R((LiveData) obj, i2);
            case 3:
                return m4285V((LiveData) obj, i2);
            case 4:
                return m4290Q((AbstractC11996rf) obj, i2);
            case 5:
                return m4283X((LiveData) obj, i2);
            case 6:
                return m4288S((LiveData) obj, i2);
            case 7:
                return m4286U((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30282B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4282Y((AbstractC12995e) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void m4282Y(AbstractC12995e abstractC12995e) {
        this.f30285E = abstractC12995e;
        synchronized (this) {
            this.f30369I |= 256;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11774g2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30369I != 0) {
                return true;
            }
            return this.f30282B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30369I = 512L;
        }
        this.f30282B.mo3579w();
        m37826E();
    }

    private C11774g2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 8, (LinearLayout) objArr[4], (MaterialButton) objArr[7], (TextView) objArr[5], (TextView) objArr[11], (TextView) objArr[3], (AbstractC11996rf) objArr[8], (AppBarLayout) objArr[9], (RecyclerView) objArr[10], (MaterialButton) objArr[6]);
        this.f30369I = -1L;
        this.f30286x.setTag(null);
        this.f30287y.setTag(null);
        this.f30288z.setTag(null);
        this.f30281A.setTag(null);
        m37821J(this.f30282B);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30366F = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30367G = constraintLayout;
        constraintLayout.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[2];
        this.f30368H = materialButton;
        materialButton.setTag(null);
        this.f30284D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
