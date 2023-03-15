package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import pl.TakeAwayCheckoutViewModel;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: wg.g6 */
/* loaded from: classes2.dex */
public class C11779g6 extends AbstractC11760f6 {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f30394G = null;

    /* renamed from: H */
    private static final SparseIntArray f30395H;

    /* renamed from: E */
    private final ConstraintLayout f30396E;

    /* renamed from: F */
    private long f30397F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30395H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.checkout_Toolbar, 4);
        sparseIntArray.put(C2336R.C2338id.collapsed_panel_ConstraintLayout, 5);
        sparseIntArray.put(C2336R.C2338id.const_lbl, 6);
        sparseIntArray.put(C2336R.C2338id.order_RecyclerView, 7);
    }

    public C11779g6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f30394G, f30395H));
    }

    /* renamed from: R */
    private boolean m4265R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30397F |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4264S(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30397F |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4263T(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30397F |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4262U(LiveData<C2381h> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30397F |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4261V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30397F |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4260W(LiveData<TakeAwayCheckout> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30397F |= 16;
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
                            return m4263T((LiveData) obj, i2);
                        }
                        return m4260W((LiveData) obj, i2);
                    }
                    return m4261V((LiveData) obj, i2);
                }
                return m4264S((LiveData) obj, i2);
            }
            return m4265R((LiveData) obj, i2);
        }
        return m4262U((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            mo4266Q((TakeAwayCheckoutViewModel) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11760f6
    /* renamed from: Q */
    public void mo4266Q(TakeAwayCheckoutViewModel takeAwayCheckoutViewModel) {
        this.f30308D = takeAwayCheckoutViewModel;
        synchronized (this) {
            this.f30397F |= 64;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6 A[ADDED_TO_REGION] */
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
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11779g6.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30397F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30397F = 128L;
        }
        m37826E();
    }

    private C11779g6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 6, (Toolbar) objArr[4], (ConstraintLayout) objArr[5], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[1], (MaterialButton) objArr[3], (RecyclerView) objArr[7]);
        this.f30397F = -1L;
        this.f30311z.setTag(null);
        this.f30305A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30396E = constraintLayout;
        constraintLayout.setTag(null);
        this.f30306B.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
