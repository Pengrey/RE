package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.github.aachartmodel.aainfographics.C2336R;
import p124gk.SplashViewModel;

/* renamed from: wg.s3 */
/* loaded from: classes2.dex */
public class C12003s3 extends AbstractC11984r3 {

    /* renamed from: A */
    private static final ViewDataBinding.C1263i f31438A = null;

    /* renamed from: B */
    private static final SparseIntArray f31439B;

    /* renamed from: y */
    private final FrameLayout f31440y;

    /* renamed from: z */
    private long f31441z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31439B = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.logo_LottieAnimationView, 1);
    }

    public C12003s3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f31438A, f31439B));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3793Q((SplashViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m3793Q(SplashViewModel splashViewModel) {
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        synchronized (this) {
            this.f31441z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31441z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31441z = 2L;
        }
        m37826E();
    }

    private C12003s3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (LottieAnimationView) objArr[1]);
        this.f31441z = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31440y = frameLayout;
        frameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
