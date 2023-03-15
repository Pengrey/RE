package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;

/* renamed from: wg.me */
/* loaded from: classes2.dex */
public class C11898me extends AbstractC11877le {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f30981C = null;

    /* renamed from: D */
    private static final SparseIntArray f30982D = null;

    /* renamed from: A */
    private final TextView f30983A;

    /* renamed from: B */
    private long f30984B;

    /* renamed from: z */
    private final ImageView f30985z;

    public C11898me(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f30981C, f30982D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (22 == i) {
            mo3993S((TakeAwayCategory) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11877le
    /* renamed from: S */
    public void mo3993S(TakeAwayCategory takeAwayCategory) {
        this.f30889y = takeAwayCategory;
        synchronized (this) {
            this.f30984B |= 1;
        }
        m37781c(22);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f30984B;
            this.f30984B = 0L;
        }
        TakeAwayCategory takeAwayCategory = this.f30889y;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i == 0 || takeAwayCategory == null) {
            str = null;
        } else {
            str2 = takeAwayCategory.m14291c();
            str = takeAwayCategory.m14292b();
        }
        if (i != 0) {
            BindingAdapters.m41781j(this.f30985z, str, null, null, null, null);
            C7629e.m17885g(this.f30983A, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30984B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30984B = 2L;
        }
        m37826E();
    }

    private C11898me(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[0]);
        this.f30984B = -1L;
        this.f30888x.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f30985z = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f30983A = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
