package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import p473yi.VirtualCardPreferencesViewModel;

/* renamed from: wg.q4 */
/* loaded from: classes2.dex */
public class C11964q4 extends AbstractC11945p4 {

    /* renamed from: J */
    private static final ViewDataBinding.C1263i f31278J;

    /* renamed from: K */
    private static final SparseIntArray f31279K;

    /* renamed from: A */
    private final ConstraintLayout f31280A;

    /* renamed from: B */
    private final AbstractC12136z9 f31281B;

    /* renamed from: C */
    private final SwitchMaterial f31282C;

    /* renamed from: D */
    private final SwitchMaterial f31283D;

    /* renamed from: E */
    private final SwitchMaterial f31284E;

    /* renamed from: F */
    private InterfaceC1276g f31285F;

    /* renamed from: G */
    private InterfaceC1276g f31286G;

    /* renamed from: H */
    private InterfaceC1276g f31287H;

    /* renamed from: I */
    private long f31288I;

    /* compiled from: ActivityVirtualCardPreferencesBindingImpl.java */
    /* renamed from: wg.q4$a */
    /* loaded from: classes2.dex */
    class C11965a implements InterfaceC1276g {
        C11965a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C11964q4.this.f31282C.isChecked();
            VirtualCardPreferencesViewModel virtualCardPreferencesViewModel = C11964q4.this.f31205z;
            if (virtualCardPreferencesViewModel != null) {
                C1436e0 m1367c0 = virtualCardPreferencesViewModel.m1367c0();
                if (m1367c0 != null) {
                    m1367c0.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityVirtualCardPreferencesBindingImpl.java */
    /* renamed from: wg.q4$b */
    /* loaded from: classes2.dex */
    class C11966b implements InterfaceC1276g {
        C11966b() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C11964q4.this.f31283D.isChecked();
            VirtualCardPreferencesViewModel virtualCardPreferencesViewModel = C11964q4.this.f31205z;
            if (virtualCardPreferencesViewModel != null) {
                C1436e0 m1366d0 = virtualCardPreferencesViewModel.m1366d0();
                if (m1366d0 != null) {
                    m1366d0.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    /* compiled from: ActivityVirtualCardPreferencesBindingImpl.java */
    /* renamed from: wg.q4$c */
    /* loaded from: classes2.dex */
    class C11967c implements InterfaceC1276g {
        C11967c() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C11964q4.this.f31284E.isChecked();
            VirtualCardPreferencesViewModel virtualCardPreferencesViewModel = C11964q4.this.f31205z;
            if (virtualCardPreferencesViewModel != null) {
                C1436e0 m1368b0 = virtualCardPreferencesViewModel.m1368b0();
                if (m1368b0 != null) {
                    m1368b0.mo166p(Boolean.valueOf(isChecked));
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(10);
        f31278J = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image", "view_loading"}, new int[]{5, 6}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31279K = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.preferences_title, 7);
        sparseIntArray.put(C2336R.C2338id.preferences_desc, 8);
        sparseIntArray.put(C2336R.C2338id.communications_container, 9);
    }

    public C11964q4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 10, f31278J, f31279K));
    }

    /* renamed from: T */
    private boolean m3857T(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31288I |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3856U(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31288I |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m3855V(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31288I |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m3854W(C1436e0<Boolean> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31288I |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m3853X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31288I |= 2;
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
                            return false;
                        }
                        return m3855V((C1436e0) obj, i2);
                    }
                    return m3857T((AbstractC11996rf) obj, i2);
                }
                return m3856U((C1436e0) obj, i2);
            }
            return m3853X((LiveData) obj, i2);
        }
        return m3854W((C1436e0) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31204y.mo3594K(interfaceC1491v);
        this.f31281B.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3852Y((VirtualCardPreferencesViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    public void m3852Y(VirtualCardPreferencesViewModel virtualCardPreferencesViewModel) {
        this.f31205z = virtualCardPreferencesViewModel;
        synchronized (this) {
            this.f31288I |= 32;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11964q4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31288I != 0) {
                return true;
            }
            return this.f31204y.mo3580u() || this.f31281B.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31288I = 64L;
        }
        this.f31204y.mo3579w();
        this.f31281B.mo3579w();
        m37826E();
    }

    private C11964q4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 5, (MaterialButton) objArr[4], (LinearLayout) objArr[9], (AbstractC11996rf) objArr[5], (TextView) objArr[8], (TextView) objArr[7]);
        this.f31285F = new C11965a();
        this.f31286G = new C11966b();
        this.f31287H = new C11967c();
        this.f31288I = -1L;
        this.f31203x.setTag(null);
        m37821J(this.f31204y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31280A = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[6];
        this.f31281B = abstractC12136z9;
        m37821J(abstractC12136z9);
        SwitchMaterial switchMaterial = (SwitchMaterial) objArr[1];
        this.f31282C = switchMaterial;
        switchMaterial.setTag(null);
        SwitchMaterial switchMaterial2 = (SwitchMaterial) objArr[2];
        this.f31283D = switchMaterial2;
        switchMaterial2.setTag(null);
        SwitchMaterial switchMaterial3 = (SwitchMaterial) objArr[3];
        this.f31284E = switchMaterial3;
        switchMaterial3.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
