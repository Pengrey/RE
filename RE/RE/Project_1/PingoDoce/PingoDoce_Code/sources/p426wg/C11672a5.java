package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p185ji.WineClubWelcomeViewModel;

/* renamed from: wg.a5 */
/* loaded from: classes2.dex */
public class C11672a5 extends AbstractC12131z4 {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f29839E;

    /* renamed from: F */
    private static final SparseIntArray f29840F;

    /* renamed from: C */
    private final ConstraintLayout f29841C;

    /* renamed from: D */
    private long f29842D;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(8);
        f29839E = c1263i;
        c1263i.m37795a(0, new String[]{"view_toolbar_with_image"}, new int[]{3}, new int[]{C2336R.layout.view_toolbar_with_image});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29840F = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.welcome_to_club_title, 4);
        sparseIntArray.put(C2336R.C2338id.welcome_to_club_subtitle, 5);
        sparseIntArray.put(C2336R.C2338id.ic_check_mark, 6);
        sparseIntArray.put(C2336R.C2338id.textView, 7);
    }

    public C11672a5(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f29839E, f29840F));
    }

    /* renamed from: Q */
    private boolean m4491Q(AbstractC11996rf abstractC11996rf, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f29842D |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m4491Q((AbstractC11996rf) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f32038z.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4490R((WineClubWelcomeViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m4490R(WineClubWelcomeViewModel wineClubWelcomeViewModel) {
        this.f32035B = wineClubWelcomeViewModel;
        synchronized (this) {
            this.f29842D |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        View.OnClickListener onClickListener;
        synchronized (this) {
            j = this.f29842D;
            this.f29842D = 0L;
        }
        WineClubWelcomeViewModel wineClubWelcomeViewModel = this.f32035B;
        int i = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        View.OnClickListener onClickListener2 = null;
        if (i == 0 || wineClubWelcomeViewModel == null) {
            onClickListener = null;
        } else {
            onClickListener2 = wineClubWelcomeViewModel.m20824O();
            onClickListener = wineClubWelcomeViewModel.m20822Q();
        }
        if (i != 0) {
            this.f32036x.setOnClickListener(onClickListener2);
            this.f32037y.setOnClickListener(onClickListener);
        }
        ViewDataBinding.m37808m(this.f32038z);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f29842D != 0) {
                return true;
            }
            return this.f32038z.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29842D = 4L;
        }
        this.f32038z.mo3579w();
        m37826E();
    }

    private C11672a5(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (MaterialButton) objArr[1], (MaterialButton) objArr[2], (AbstractC11996rf) objArr[3], (ImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4]);
        this.f29842D = -1L;
        this.f32036x.setTag(null);
        this.f32037y.setTag(null);
        m37821J(this.f32038z);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f29841C = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
