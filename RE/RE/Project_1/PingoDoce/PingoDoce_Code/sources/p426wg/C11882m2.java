package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p014aj.AbstractC0188n;
import p246n2.C7629e;

/* renamed from: wg.m2 */
/* loaded from: classes2.dex */
public class C11882m2 extends AbstractC11865l2 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f30913K;

    /* renamed from: L */
    private static final SparseIntArray f30914L;

    /* renamed from: F */
    private final ScrollView f30915F;

    /* renamed from: G */
    private final ConstraintLayout f30916G;

    /* renamed from: H */
    private final AbstractC11695ba f30917H;

    /* renamed from: I */
    private InterfaceC1276g f30918I;

    /* renamed from: J */
    private long f30919J;

    /* compiled from: ActivityPinBindingImpl.java */
    /* renamed from: wg.m2$a */
    /* loaded from: classes2.dex */
    class C11883a implements InterfaceC1276g {
        C11883a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11882m2.this.f30839x);
            AbstractC0188n abstractC0188n = C11882m2.this.f30838E;
            if (abstractC0188n != null) {
                C1436e0 m41610v0 = abstractC0188n.m41610v0();
                if (m41610v0 != null) {
                    m41610v0.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(10);
        f30913K = c1263i;
        c1263i.m37795a(1, new String[]{"view_toolbar_with_image", "view_loading_small"}, new int[]{8, 9}, new int[]{C2336R.layout.view_toolbar_with_image, C2336R.layout.view_loading_small});
        f30914L = null;
    }

    public C11882m2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 10, f30913K, f30914L));
    }

    /* renamed from: Q */
    private boolean m4036Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4035R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4034S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4033T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4032U(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4031V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4030W(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4029X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4028Y(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 128;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4027Z(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30919J |= 64;
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
                return m4031V((LiveData) obj, i2);
            case 1:
                return m4034S((LiveData) obj, i2);
            case 2:
                return m4032U((LiveData) obj, i2);
            case 3:
                return m4029X((LiveData) obj, i2);
            case 4:
                return m4033T((LiveData) obj, i2);
            case 5:
                return m4036Q((AbstractC11996rf) obj, i2);
            case 6:
                return m4027Z((LiveData) obj, i2);
            case 7:
                return m4028Y((LiveData) obj, i2);
            case 8:
                return m4030W((C1436e0) obj, i2);
            case 9:
                return m4035R((LiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30837D.mo3594K(interfaceC1491v);
        this.f30917H.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4026a0((AbstractC0188n) obj);
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public void m4026a0(AbstractC0188n abstractC0188n) {
        this.f30838E = abstractC0188n;
        synchronized (this) {
            this.f30919J |= 1024;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0139  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11882m2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30919J != 0) {
                return true;
            }
            return this.f30837D.mo3580u() || this.f30917H.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30919J = 2048L;
        }
        this.f30837D.mo3579w();
        this.f30917H.mo3579w();
        m37826E();
    }

    private C11882m2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 10, (PinEntryEditText) objArr[4], (TextView) objArr[5], (ImageView) objArr[6], (MaterialButton) objArr[7], (TextView) objArr[3], (TextView) objArr[2], (AbstractC11996rf) objArr[8]);
        this.f30918I = new C11883a();
        this.f30919J = -1L;
        this.f30839x.setTag(null);
        this.f30840y.setTag(null);
        this.f30841z.setTag(null);
        this.f30834A.setTag(null);
        this.f30835B.setTag(null);
        this.f30836C.setTag(null);
        m37821J(this.f30837D);
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f30915F = scrollView;
        scrollView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30916G = constraintLayout;
        constraintLayout.setTag(null);
        AbstractC11695ba abstractC11695ba = (AbstractC11695ba) objArr[9];
        this.f30917H = abstractC11695ba;
        m37821J(abstractC11695ba);
        m37820L(view);
        mo3579w();
    }
}
