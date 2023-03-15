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
import cl.OnboardingSuccessViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.i2 */
/* loaded from: classes2.dex */
public class C11811i2 extends AbstractC11793h2 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30534F;

    /* renamed from: G */
    private static final SparseIntArray f30535G;

    /* renamed from: C */
    private final ConstraintLayout f30536C;

    /* renamed from: D */
    private final ImageView f30537D;

    /* renamed from: E */
    private long f30538E;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f30534F = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{5}, new int[]{C2336R.layout.view_toolbar_with_image});
        f30535G = null;
    }

    public C11811i2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30534F, f30535G));
    }

    /* renamed from: Q */
    private boolean m4214Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30538E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4213R(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30538E |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4212S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30538E |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4211T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30538E |= 2;
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
                    return m4212S((LiveData) obj, i2);
                }
                return m4213R((LiveData) obj, i2);
            }
            return m4211T((LiveData) obj, i2);
        }
        return m4214Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30446y.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4210U((OnboardingSuccessViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public void m4210U(OnboardingSuccessViewModel onboardingSuccessViewModel) {
        this.f30444B = onboardingSuccessViewModel;
        synchronized (this) {
            this.f30538E |= 16;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            long r2 = r1.f30538E     // Catch: java.lang.Throwable -> Lb7
            r4 = 0
            r1.f30538E = r4     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r21)     // Catch: java.lang.Throwable -> Lb7
            cl.d r0 = r1.f30444B
            r6 = 62
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 56
            r9 = 52
            r11 = 50
            r13 = 48
            if (r6 == 0) goto L82
            long r16 = r2 & r11
            int r6 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r6 == 0) goto L36
            if (r0 == 0) goto L28
            androidx.lifecycle.LiveData r6 = r0.m34509b0()
            goto L29
        L28:
            r6 = 0
        L29:
            r15 = 1
            r1.m37818O(r15, r6)
            if (r6 == 0) goto L36
            java.lang.Object r6 = r6.mo172f()
            java.lang.String r6 = (java.lang.String) r6
            goto L37
        L36:
            r6 = 0
        L37:
            long r17 = r2 & r9
            int r15 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r15 == 0) goto L52
            if (r0 == 0) goto L44
            androidx.lifecycle.LiveData r15 = r0.m34511Z()
            goto L45
        L44:
            r15 = 0
        L45:
            r11 = 2
            r1.m37818O(r11, r15)
            if (r15 == 0) goto L52
            java.lang.Object r11 = r15.mo172f()
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            goto L53
        L52:
            r11 = 0
        L53:
            long r19 = r2 & r13
            int r12 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r12 == 0) goto L60
            if (r0 == 0) goto L60
            android.view.View$OnClickListener r12 = r0.m34513X()
            goto L61
        L60:
            r12 = 0
        L61:
            long r19 = r2 & r7
            int r15 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r15 == 0) goto L7f
            if (r0 == 0) goto L6e
            androidx.lifecycle.LiveData r0 = r0.m34510a0()
            goto L6f
        L6e:
            r0 = 0
        L6f:
            r15 = 3
            r1.m37818O(r15, r0)
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.mo172f()
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            r0 = r15
            r15 = r12
            goto L86
        L7f:
            r15 = r12
            r0 = 0
            goto L86
        L82:
            r0 = 0
            r6 = 0
            r11 = 0
            r15 = 0
        L86:
            long r12 = r2 & r13
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L91
            com.google.android.material.button.MaterialButton r12 = r1.f30445x
            r12.setOnClickListener(r15)
        L91:
            long r9 = r9 & r2
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L9b
            android.widget.ImageView r9 = r1.f30537D
            p246n2.C7627c.m17894a(r9, r11)
        L9b:
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto La5
            android.widget.TextView r7 = r1.f30447z
            p246n2.C7629e.m17885g(r7, r0)
        La5:
            r7 = 50
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lb1
            android.widget.TextView r0 = r1.f30443A
            p246n2.C7629e.m17885g(r0, r6)
        Lb1:
            wg.rf r0 = r1.f30446y
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        Lb7:
            r0 = move-exception
            monitor-exit(r21)     // Catch: java.lang.Throwable -> Lb7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11811i2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30538E != 0) {
                return true;
            }
            return this.f30446y.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30538E = 32L;
        }
        this.f30446y.mo3579w();
        m37826E();
    }

    private C11811i2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 4, (MaterialButton) objArr[4], (AbstractC11996rf) objArr[5], (TextView) objArr[2], (TextView) objArr[1]);
        this.f30538E = -1L;
        this.f30445x.setTag(null);
        m37821J(this.f30446y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30536C = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[3];
        this.f30537D = imageView;
        imageView.setTag(null);
        this.f30447z.setTag(null);
        this.f30443A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
