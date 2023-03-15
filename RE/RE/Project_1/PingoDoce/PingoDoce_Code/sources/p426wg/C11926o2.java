package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel;

/* renamed from: wg.o2 */
/* loaded from: classes2.dex */
public class C11926o2 extends AbstractC11904n2 {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f31106H;

    /* renamed from: I */
    private static final SparseIntArray f31107I;

    /* renamed from: F */
    private final ConstraintLayout f31108F;

    /* renamed from: G */
    private long f31109G;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(9);
        f31106H = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{5}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31107I = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.tv_recover_pin_code_subtitle, 6);
        sparseIntArray.put(C2336R.C2338id.textView, 7);
        sparseIntArray.put(C2336R.C2338id.textView_bottom, 8);
    }

    public C11926o2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f31106H, f31107I));
    }

    /* renamed from: Q */
    private boolean m3952Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31109G |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3951R(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31109G |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3950S(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31109G |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3949T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31109G |= 1;
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
                    return m3952Q((AbstractC11996rf) obj, i2);
                }
                return m3951R((LiveData) obj, i2);
            }
            return m3950S((LiveData) obj, i2);
        }
        return m3949T((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31018y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3948U((PinRecoverViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m3948U(PinRecoverViewModel pinRecoverViewModel) {
        this.f31016E = pinRecoverViewModel;
        synchronized (this) {
            this.f31109G |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.f31109G     // Catch: java.lang.Throwable -> Lb9
            r4 = 0
            r1.f31109G = r4     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb9
            pt.pingodoce.app.presentation.login.pin.recovery.a r0 = r1.f31016E
            r6 = 55
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 49
            r9 = 52
            r11 = 48
            r13 = 50
            r15 = 0
            if (r6 == 0) goto L81
            long r16 = r2 & r11
            int r6 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r6 == 0) goto L29
            if (r0 == 0) goto L29
            android.view.View$OnClickListener r6 = r0.m11725C0()
            goto L2a
        L29:
            r6 = r15
        L2a:
            long r16 = r2 & r7
            int r16 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r16 == 0) goto L47
            if (r0 == 0) goto L39
            androidx.lifecycle.LiveData r16 = r0.m11726B0()
            r7 = r16
            goto L3a
        L39:
            r7 = r15
        L3a:
            r8 = 0
            r1.m37818O(r8, r7)
            if (r7 == 0) goto L47
            java.lang.Object r7 = r7.mo172f()
            java.lang.String r7 = (java.lang.String) r7
            goto L48
        L47:
            r7 = r15
        L48:
            long r18 = r2 & r13
            int r8 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r8 == 0) goto L63
            if (r0 == 0) goto L55
            androidx.lifecycle.LiveData r8 = r0.m11716y0()
            goto L56
        L55:
            r8 = r15
        L56:
            r11 = 1
            r1.m37818O(r11, r8)
            if (r8 == 0) goto L63
            java.lang.Object r8 = r8.mo172f()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L64
        L63:
            r8 = r15
        L64:
            long r11 = r2 & r9
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L7f
            if (r0 == 0) goto L71
            androidx.lifecycle.LiveData r0 = r0.m11717x0()
            goto L72
        L71:
            r0 = r15
        L72:
            r11 = 2
            r1.m37818O(r11, r0)
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.mo172f()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L85
        L7f:
            r0 = r15
            goto L85
        L81:
            r0 = r15
            r6 = r0
            r7 = r6
            r8 = r7
        L85:
            long r11 = r2 & r13
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L90
            android.widget.ImageView r11 = r1.f31017x
            ae.BindingAdapters.m41779l(r11, r8, r15)
        L90:
            long r8 = r2 & r9
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L9b
            android.widget.ImageView r8 = r1.f31019z
            p246n2.C7634f.m17882b(r8, r0)
        L9b:
            r8 = 48
            long r8 = r8 & r2
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 == 0) goto La7
            com.google.android.material.button.MaterialButton r0 = r1.f31012A
            r0.setOnClickListener(r6)
        La7:
            r8 = 49
            long r2 = r2 & r8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lb3
            android.widget.TextView r0 = r1.f31015D
            p246n2.C7629e.m17885g(r0, r7)
        Lb3:
            wg.rf r0 = r1.f31018y
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        Lb9:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11926o2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31109G != 0) {
                return true;
            }
            return this.f31018y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31109G = 32L;
        }
        this.f31018y.mo3579w();
        m37826E();
    }

    private C11926o2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (ImageView) objArr[3], (AbstractC11996rf) objArr[5], (ImageView) objArr[2], (MaterialButton) objArr[4], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[6], (TextView) objArr[1]);
        this.f31109G = -1L;
        this.f31017x.setTag(null);
        m37821J(this.f31018y);
        this.f31019z.setTag(null);
        this.f31012A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31108F = constraintLayout;
        constraintLayout.setTag(null);
        this.f31015D.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
