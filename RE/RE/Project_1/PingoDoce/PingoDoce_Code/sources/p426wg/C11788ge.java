package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import p246n2.C7626b;
import p246n2.C7629e;
import p246n2.C7634f;

/* renamed from: wg.ge */
/* loaded from: classes2.dex */
public class C11788ge extends AbstractC11768fe {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30426C = null;

    /* renamed from: D */
    private static final SparseIntArray f30427D = null;

    /* renamed from: A */
    private final TextView f30428A;

    /* renamed from: B */
    private long f30429B;

    /* renamed from: z */
    private final LinearLayout f30430z;

    public C11788ge(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f30426C, f30427D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (7 == i) {
            mo4239S((Integer) obj);
        } else if (73 != i) {
            return false;
        } else {
            mo4238T((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11768fe
    /* renamed from: S */
    public void mo4239S(Integer num) {
        this.f30344y = num;
        synchronized (this) {
            this.f30429B |= 1;
        }
        m37781c(7);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11768fe
    /* renamed from: T */
    public void mo4238T(String str) {
        this.f30343x = str;
        synchronized (this) {
            this.f30429B |= 2;
        }
        m37781c(73);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f30429B;
            this.f30429B = 0L;
        }
        Integer num = this.f30344y;
        String str = this.f30343x;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        int i2 = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0) {
            C7634f.m17882b(this.f30430z, C7626b.m17895a(num.intValue()));
        }
        if (i2 != 0) {
            C7629e.m17885g(this.f30428A, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30429B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30429B = 4L;
        }
        m37826E();
    }

    private C11788ge(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f30429B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f30430z = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f30428A = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
