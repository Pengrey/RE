package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import ki.C6676f;
import p088ek.IntroViewModel;

/* renamed from: wg.h0 */
/* loaded from: classes2.dex */
public class C11791h0 extends AbstractC11771g0 {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30438C = null;

    /* renamed from: D */
    private static final SparseIntArray f30439D;

    /* renamed from: A */
    private final ConstraintLayout f30440A;

    /* renamed from: B */
    private long f30441B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30439D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.g_intro, 3);
        sparseIntArray.put(C2336R.C2338id.cl_top_intro, 4);
        sparseIntArray.put(C2336R.C2338id.tv_intro_title, 5);
        sparseIntArray.put(C2336R.C2338id.tv_intro_input_label, 6);
    }

    public C11791h0(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f30438C, f30439D));
    }

    /* renamed from: Q */
    private boolean m4234Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30441B |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4233R(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30441B |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4232S(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30441B |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4231T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30441B |= 8;
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
                    return m4231T((LiveData) obj, i2);
                }
                return m4234Q((LiveData) obj, i2);
            }
            return m4233R((LiveData) obj, i2);
        }
        return m4232S((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4230U((IntroViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m4230U(IntroViewModel introViewModel) {
        this.f30353z = introViewModel;
        synchronized (this) {
            this.f30441B |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        View.OnClickListener onClickListener;
        Drawable drawable;
        C2381h c2381h;
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        LiveData liveData4;
        synchronized (this) {
            j = this.f30441B;
            this.f30441B = 0L;
        }
        IntroViewModel introViewModel = this.f30353z;
        int i = ((63 & j) > 0L ? 1 : ((63 & j) == 0L ? 0 : -1));
        boolean z2 = false;
        View.OnClickListener onClickListener2 = null;
        if (i != 0) {
            if (introViewModel != null) {
                liveData = introViewModel.m20327h0();
                liveData2 = introViewModel.m20331d0();
                liveData3 = introViewModel.m25596z0();
                liveData4 = introViewModel.m20326i0();
            } else {
                liveData = null;
                liveData2 = null;
                liveData3 = null;
                liveData4 = null;
            }
            m37818O(0, liveData);
            m37818O(1, liveData2);
            m37818O(2, liveData3);
            m37818O(3, liveData4);
            C2381h c2381h2 = liveData != null ? (C2381h) liveData.mo172f() : null;
            drawable = liveData2 != null ? (Drawable) liveData2.mo172f() : null;
            Boolean bool = liveData3 != null ? (Boolean) liveData3.mo172f() : null;
            Boolean bool2 = liveData4 != null ? (Boolean) liveData4.mo172f() : null;
            z = ViewDataBinding.m37823H(bool);
            boolean m37823H = ViewDataBinding.m37823H(bool2);
            if ((j & 48) == 0 || introViewModel == null) {
                onClickListener = null;
                c2381h = c2381h2;
                z2 = m37823H;
            } else {
                View.OnClickListener m20317r0 = introViewModel.m20317r0();
                onClickListener2 = introViewModel.m25599w0();
                onClickListener = m20317r0;
                c2381h = c2381h2;
                z2 = m37823H;
            }
        } else {
            z = false;
            onClickListener = null;
            drawable = null;
            c2381h = null;
        }
        if ((j & 48) != 0) {
            this.f30351x.setOnClickListener(onClickListener2);
            this.f30352y.setOnClickListener(onClickListener);
        }
        if (i != 0) {
            C6676f.m20308a(this.f30352y, drawable, c2381h, z2, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30441B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30441B = 32L;
        }
        m37826E();
    }

    private C11791h0(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (ConstraintLayout) objArr[4], (Guideline) objArr[3], (MaterialButton) objArr[1], (TextView) objArr[6], (MaterialButton) objArr[2], (TextView) objArr[5]);
        this.f30441B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30440A = constraintLayout;
        constraintLayout.setTag(null);
        this.f30351x.setTag(null);
        this.f30352y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
