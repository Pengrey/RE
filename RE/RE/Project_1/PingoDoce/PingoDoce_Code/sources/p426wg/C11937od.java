package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: wg.od */
/* loaded from: classes2.dex */
public class C11937od extends AbstractC11915nd {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f31158F = null;

    /* renamed from: G */
    private static final SparseIntArray f31159G;

    /* renamed from: C */
    private final ConstraintLayout f31160C;

    /* renamed from: D */
    private final TextView f31161D;

    /* renamed from: E */
    private long f31162E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31159G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 6);
    }

    public C11937od(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 7, f31158F, f31159G));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (82 == i) {
            mo3918S((Purchase) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11915nd
    /* renamed from: S */
    public void mo3918S(Purchase purchase) {
        this.f31062B = purchase;
        synchronized (this) {
            this.f31162E |= 1;
        }
        m37781c(82);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        synchronized (this) {
            j = this.f31162E;
            this.f31162E = 0L;
        }
        Purchase purchase = this.f31062B;
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str5 = null;
        if (i2 != 0) {
            if (purchase != null) {
                str5 = purchase.m14436f();
                str = purchase.m14426v();
                str2 = purchase.m14441A();
                str4 = purchase.m14424y();
                i = purchase.m14428s();
            } else {
                str = null;
                str2 = null;
                i = 0;
                str4 = null;
            }
            String num = Integer.toString(i);
            str3 = str5;
            str5 = num;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f31063x, str5);
            C7629e.m17885g(this.f31064y, str);
            C7629e.m17885g(this.f31065z, str4);
            C7629e.m17885g(this.f31061A, str2);
            C7629e.m17885g(this.f31161D, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31162E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31162E = 2L;
        }
        m37826E();
    }

    private C11937od(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (View) objArr[6], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[2]);
        this.f31162E = -1L;
        this.f31063x.setTag(null);
        this.f31064y.setTag(null);
        this.f31065z.setTag(null);
        this.f31061A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31160C = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.f31161D = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
