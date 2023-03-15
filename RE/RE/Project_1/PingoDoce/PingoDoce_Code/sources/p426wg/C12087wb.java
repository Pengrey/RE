package p426wg;

import ae.BindingAdapters;
import android.graphics.Bitmap;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.wb */
/* loaded from: classes2.dex */
public class C12087wb extends AbstractC12069vb {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31808C = null;

    /* renamed from: D */
    private static final SparseIntArray f31809D;

    /* renamed from: B */
    private long f31810B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31809D = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.ompd_logo, 2);
        sparseIntArray.put(C2336R.C2338id.qr_code, 3);
    }

    public C12087wb(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f31808C, f31809D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo3662R((Boolean) obj);
        } else if (86 != i) {
            return false;
        } else {
            mo3663Q((Bitmap) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12069vb
    /* renamed from: Q */
    public void mo3663Q(Bitmap bitmap) {
        this.f31734A = bitmap;
        synchronized (this) {
            this.f31810B |= 2;
        }
        m37781c(86);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12069vb
    /* renamed from: R */
    public void mo3662R(Boolean bool) {
        this.f31737z = bool;
        synchronized (this) {
            this.f31810B |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31810B;
            this.f31810B = 0L;
        }
        Boolean bool = this.f31737z;
        Bitmap bitmap = this.f31734A;
        int i = ((5 & j) > 0L ? 1 : ((5 & j) == 0L ? 0 : -1));
        int i2 = ((j & 6) > 0L ? 1 : ((j & 6) == 0L ? 0 : -1));
        if (i != 0) {
            BindingAdapters.m41779l(this.f31735x, bool, Boolean.TRUE);
        }
        if (i2 != 0) {
            this.f31736y.setImageBitmap(bitmap);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31810B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31810B = 4L;
        }
        m37826E();
    }

    private C12087wb(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[0], (ImageView) objArr[2], (CardView) objArr[3], (ImageView) objArr[1]);
        this.f31810B = -1L;
        this.f31735x.setTag(null);
        this.f31736y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
