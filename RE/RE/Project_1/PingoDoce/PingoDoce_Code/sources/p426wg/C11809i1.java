package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import th.MadeForYouViewModel;

/* renamed from: wg.i1 */
/* loaded from: classes2.dex */
public class C11809i1 extends AbstractC11792h1 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30524F;

    /* renamed from: G */
    private static final SparseIntArray f30525G;

    /* renamed from: A */
    private final AbstractC12136z9 f30526A;

    /* renamed from: B */
    private final SwitchMaterial f30527B;

    /* renamed from: C */
    private final MaterialButton f30528C;

    /* renamed from: D */
    private InterfaceC1276g f30529D;

    /* renamed from: E */
    private long f30530E;

    /* renamed from: y */
    private final AbstractC11917nf f30531y;

    /* renamed from: z */
    private final CoordinatorLayout f30532z;

    /* compiled from: ActivityMadeForYouBindingImpl.java */
    /* renamed from: wg.i1$a */
    /* loaded from: classes2.dex */
    class C11810a implements InterfaceC1276g {
        C11810a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C11809i1.this.f30527B.isChecked();
            MadeForYouViewModel madeForYouViewModel = C11809i1.this.f30442x;
            if (madeForYouViewModel != null) {
                C1436e0 m7474y0 = madeForYouViewModel.m7474y0();
                if (m7474y0 != null) {
                    m7474y0.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(7);
        f30524F = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar", "view_loading"}, new int[]{3, 4}, new int[]{C2336R.layout.view_toolbar, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30525G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_history, 5);
        sparseIntArray.put(C2336R.C2338id.text_made_for_you_disclaimer, 6);
    }

    public C11809i1(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f30524F, f30525G));
    }

    /* renamed from: R */
    private boolean m4222R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30530E |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4221S(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30530E |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4220T(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30530E |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4219U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30530E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4218V(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30530E |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4217W(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30530E |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4216X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30530E |= 32;
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
                return m4219U((LiveData) obj, i2);
            case 1:
                return m4218V((C1436e0) obj, i2);
            case 2:
                return m4217W((LiveData) obj, i2);
            case 3:
                return m4221S((LiveData) obj, i2);
            case 4:
                return m4222R((LiveData) obj, i2);
            case 5:
                return m4216X((LiveData) obj, i2);
            case 6:
                return m4220T((C1436e0) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30531y.mo3594K(interfaceC1491v);
        this.f30526A.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4215Y((MadeForYouViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void m4215Y(MadeForYouViewModel madeForYouViewModel) {
        this.f30442x = madeForYouViewModel;
        synchronized (this) {
            this.f30530E |= 128;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11809i1.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30530E != 0) {
                return true;
            }
            return this.f30531y.mo3580u() || this.f30526A.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30530E = 256L;
        }
        this.f30531y.mo3579w();
        this.f30526A.mo3579w();
        m37826E();
    }

    private C11809i1(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 7, (TextView) objArr[5], (TextView) objArr[6]);
        this.f30529D = new C11810a();
        this.f30530E = -1L;
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[3];
        this.f30531y = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30532z = coordinatorLayout;
        coordinatorLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[4];
        this.f30526A = abstractC12136z9;
        m37821J(abstractC12136z9);
        SwitchMaterial switchMaterial = (SwitchMaterial) objArr[1];
        this.f30527B = switchMaterial;
        switchMaterial.setTag(null);
        MaterialButton materialButton = (MaterialButton) objArr[2];
        this.f30528C = materialButton;
        materialButton.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
