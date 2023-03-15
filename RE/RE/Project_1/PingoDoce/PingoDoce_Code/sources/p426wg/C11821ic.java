package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Benefit;

/* renamed from: wg.ic */
/* loaded from: classes2.dex */
public class C11821ic extends AbstractC11803hc {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30592F = null;

    /* renamed from: G */
    private static final SparseIntArray f30593G;

    /* renamed from: D */
    private final TextView f30594D;

    /* renamed from: E */
    private long f30595E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30593G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.cost_container, 6);
        sparseIntArray.put(C2336R.C2338id.constraintLayout, 7);
        sparseIntArray.put(C2336R.C2338id.club_picture, 8);
    }

    public C11821ic(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 9, f30592F, f30593G));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (15 == i) {
            m4184Q((Benefit) obj);
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public void m4184Q(Benefit benefit) {
        this.f30471C = benefit;
        synchronized (this) {
            this.f30595E |= 1;
        }
        m37781c(15);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.f30595E;
            this.f30595E = 0L;
        }
        Benefit benefit = this.f30471C;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || benefit == null) {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
            str3 = null;
        } else {
            str = benefit.m13935e();
            z = benefit.m13926s();
            str3 = benefit.m13928n();
            z2 = benefit.m13925t();
            str2 = benefit.m13937c();
        }
        if (i != 0) {
            C7629e.m17885g(this.f30472x, str);
            BindingAdapters.m41779l(this.f30473y, Boolean.valueOf(z), null);
            BindingAdapters.m41779l(this.f30469A, Boolean.valueOf(z2), null);
            C7629e.m17885g(this.f30470B, str3);
            C7629e.m17885g(this.f30594D, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30595E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30595E = 2L;
        }
        m37826E();
    }

    private C11821ic(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[8], (TextView) objArr[2], (TextView) objArr[5], (MaterialCardView) objArr[0], (TextView) objArr[4], (TextView) objArr[1], (ConstraintLayout) objArr[7], (LinearLayout) objArr[6]);
        this.f30595E = -1L;
        this.f30472x.setTag(null);
        this.f30473y.setTag(null);
        this.f30474z.setTag(null);
        this.f30469A.setTag(null);
        this.f30470B.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f30594D = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
