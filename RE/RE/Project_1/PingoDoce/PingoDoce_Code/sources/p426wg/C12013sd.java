package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import p246n2.C7629e;

/* renamed from: wg.sd */
/* loaded from: classes2.dex */
public class C12013sd extends AbstractC11994rd {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31482B = null;

    /* renamed from: C */
    private static final SparseIntArray f31483C = null;

    /* renamed from: A */
    private long f31484A;

    /* renamed from: z */
    private final LinearLayoutCompat f31485z;

    public C12013sd(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 2, f31482B, f31483C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (72 == i) {
            mo3776S((String) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11994rd
    /* renamed from: S */
    public void mo3776S(String str) {
        this.f31393y = str;
        synchronized (this) {
            this.f31484A |= 1;
        }
        m37781c(72);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31484A;
            this.f31484A = 0L;
        }
        String str = this.f31393y;
        if ((j & 3) != 0) {
            C7629e.m17885g(this.f31392x, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31484A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31484A = 2L;
        }
        m37826E();
    }

    private C12013sd(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[1]);
        this.f31484A = -1L;
        this.f31392x.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f31485z = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
