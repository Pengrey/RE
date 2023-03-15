package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;

/* renamed from: wg.se */
/* loaded from: classes2.dex */
public class C12014se extends AbstractC11995re {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31486C = null;

    /* renamed from: D */
    private static final SparseIntArray f31487D;

    /* renamed from: A */
    private final TextView f31488A;

    /* renamed from: B */
    private long f31489B;

    /* renamed from: z */
    private final ConstraintLayout f31490z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31487D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_img, 3);
        sparseIntArray.put(C2336R.C2338id.const_number_lbl, 4);
        sparseIntArray.put(C2336R.C2338id.const_arrow, 5);
    }

    public C12014se(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31486C, f31487D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (61 == i) {
            mo3775S((TakeAwayOrder) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11995re
    /* renamed from: S */
    public void mo3775S(TakeAwayOrder takeAwayOrder) {
        this.f31395y = takeAwayOrder;
        synchronized (this) {
            this.f31489B |= 1;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.f31489B;
            this.f31489B = 0L;
        }
        TakeAwayOrder takeAwayOrder = this.f31395y;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str4 = null;
        if (i != 0) {
            if (takeAwayOrder != null) {
                String m14283c = takeAwayOrder.m14283c();
                String m14273r = takeAwayOrder.m14273r();
                str3 = takeAwayOrder.m14269w();
                str2 = m14283c;
                str4 = m14273r;
            } else {
                str2 = null;
                str3 = null;
            }
            String str5 = str2;
            str = String.format(this.f31488A.getResources().getString(C2336R.string.lbl_take_away_order_info), str4, str3);
            str4 = str5;
        } else {
            str = null;
        }
        if (i != 0) {
            C7629e.m17885g(this.f31394x, str4);
            C7629e.m17885g(this.f31488A, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31489B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31489B = 2L;
        }
        m37826E();
    }

    private C12014se(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[5], (ImageView) objArr[3], (TextView) objArr[1], (TextView) objArr[4]);
        this.f31489B = -1L;
        this.f31394x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31490z = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f31488A = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
