package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel;

/* renamed from: wg.g3 */
/* loaded from: classes2.dex */
public class C11775g3 extends AbstractC11757f3 {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f30370Q;

    /* renamed from: R */
    private static final SparseIntArray f30371R;

    /* renamed from: F */
    private final AbstractC11917nf f30372F;

    /* renamed from: G */
    private final CoordinatorLayout f30373G;

    /* renamed from: H */
    private final FrameLayout f30374H;

    /* renamed from: I */
    private final TextView f30375I;

    /* renamed from: J */
    private final TextView f30376J;

    /* renamed from: K */
    private final AbstractC12136z9 f30377K;

    /* renamed from: L */
    private final MaterialButton f30378L;

    /* renamed from: M */
    private final Group f30379M;

    /* renamed from: N */
    private final SwitchMaterial f30380N;

    /* renamed from: O */
    private InterfaceC1276g f30381O;

    /* renamed from: P */
    private long f30382P;

    /* compiled from: ActivitySettingsBindingImpl.java */
    /* renamed from: wg.g3$a */
    /* loaded from: classes2.dex */
    class C11776a implements InterfaceC1276g {
        C11776a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C11775g3.this.f30380N.isChecked();
            SettingsViewModel settingsViewModel = C11775g3.this.f30293E;
            if (settingsViewModel != null) {
                C1430c0 m13313m0 = settingsViewModel.m13313m0();
                if (m13313m0 != null) {
                    m13313m0.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(18);
        f30370Q = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar"}, new int[]{14}, new int[]{C2336R.layout.view_toolbar});
        c1263i.m37795a(1, new String[]{"view_loading"}, new int[]{15}, new int[]{C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30371R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_biometric, 16);
        sparseIntArray.put(C2336R.C2338id.const_logout, 17);
    }

    public C11775g3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 18, f30370Q, f30371R));
    }

    /* renamed from: R */
    private boolean m4280R(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30382P |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4279S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30382P |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4278T(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30382P |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4277U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30382P |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4276V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30382P |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4275W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30382P |= 2;
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
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            return m4278T((C1430c0) obj, i2);
                        }
                        return m4279S((LiveData) obj, i2);
                    }
                    return m4277U((LiveData) obj, i2);
                }
                return m4280R((LiveData) obj, i2);
            }
            return m4275W((LiveData) obj, i2);
        }
        return m4276V((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30372F.mo3594K(interfaceC1491v);
        this.f30377K.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4274X((SettingsViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public void m4274X(SettingsViewModel settingsViewModel) {
        this.f30293E = settingsViewModel;
        synchronized (this) {
            this.f30382P |= 64;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11775g3.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30382P != 0) {
                return true;
            }
            return this.f30372F.mo3580u() || this.f30377K.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30382P = 128L;
        }
        this.f30372F.mo3579w();
        this.f30377K.mo3579w();
        m37826E();
    }

    private C11775g3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 6, (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[16], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[17], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[9]);
        this.f30381O = new C11776a();
        this.f30382P = -1L;
        this.f30294x.setTag(null);
        this.f30295y.setTag(null);
        this.f30296z.setTag(null);
        this.f30289A.setTag(null);
        this.f30290B.setTag(null);
        this.f30291C.setTag(null);
        this.f30292D.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[14];
        this.f30372F = abstractC11917nf;
        m37821J(abstractC11917nf);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30373G = coordinatorLayout;
        coordinatorLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.f30374H = frameLayout;
        frameLayout.setTag(null);
        TextView textView = (TextView) objArr[11];
        this.f30375I = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[12];
        this.f30376J = textView2;
        textView2.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[15];
        this.f30377K = abstractC12136z9;
        m37821J(abstractC12136z9);
        MaterialButton materialButton = (MaterialButton) objArr[13];
        this.f30378L = materialButton;
        materialButton.setTag(null);
        Group group = (Group) objArr[2];
        this.f30379M = group;
        group.setTag(null);
        SwitchMaterial switchMaterial = (SwitchMaterial) objArr[5];
        this.f30380N = switchMaterial;
        switchMaterial.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
