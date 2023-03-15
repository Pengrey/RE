package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import p246n2.C7629e;

/* renamed from: wg.wc */
/* loaded from: classes2.dex */
public class C12088wc extends AbstractC12070vc {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31811B = null;

    /* renamed from: C */
    private static final SparseIntArray f31812C = null;

    /* renamed from: A */
    private long f31813A;

    /* renamed from: y */
    private final LinearLayout f31814y;

    /* renamed from: z */
    private final TextView f31815z;

    public C12088wc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f31811B, f31812C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (63 == i) {
            mo3661S((String) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12070vc
    /* renamed from: S */
    public void mo3661S(String str) {
        this.f31738x = str;
        synchronized (this) {
            this.f31813A |= 1;
        }
        m37781c(63);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31813A;
            this.f31813A = 0L;
        }
        String str = this.f31738x;
        if ((j & 3) != 0) {
            C7629e.m17885g(this.f31815z, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31813A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31813A = 2L;
        }
        m37826E();
    }

    private C12088wc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f31813A = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31814y = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f31815z = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
