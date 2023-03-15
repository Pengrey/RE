package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: wg.ec */
/* loaded from: classes2.dex */
public class C11749ec extends AbstractC11732dc {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30240F = null;

    /* renamed from: G */
    private static final SparseIntArray f30241G;

    /* renamed from: D */
    private final TextView f30242D;

    /* renamed from: E */
    private long f30243E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30241G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.close_ImageButton, 5);
    }

    public C11749ec(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30240F, f30241G));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (13 == i) {
            mo4359S((Banner) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11732dc
    /* renamed from: S */
    public void mo4359S(Banner banner) {
        this.f30117C = banner;
        synchronized (this) {
            this.f30243E |= 1;
        }
        m37781c(13);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j = this.f30243E;
            this.f30243E = 0L;
        }
        Banner banner = this.f30117C;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i != 0) {
            if (banner != null) {
                z = banner.m13944r();
                str = banner.m13948j();
                str2 = banner.m13945n();
                str4 = banner.m13949i();
            } else {
                z = false;
                str4 = null;
                str = null;
                str2 = null;
            }
            r9 = str == null;
            if (i != 0) {
                j |= r9 ? 8L : 4L;
            }
            str3 = str4;
        } else {
            z = false;
            str = null;
            str2 = null;
            str3 = null;
        }
        int i2 = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str5 = i2 != 0 ? r9 ? "Ver todos" : str : null;
        if (i2 != 0) {
            C7629e.m17885g(this.f30118x, str5);
            BindingAdapters.m41781j(this.f30120z, str3, null, null, null, null);
            C7629e.m17885g(this.f30116B, str2);
            BindingAdapters.m41779l(this.f30242D, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30243E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30243E = 2L;
        }
        m37826E();
    }

    private C11749ec(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[4], (ImageButton) objArr[5], (ImageView) objArr[1], (MaterialCardView) objArr[0], (TextView) objArr[3]);
        this.f30243E = -1L;
        this.f30118x.setTag(null);
        this.f30120z.setTag(null);
        this.f30115A.setTag(null);
        this.f30116B.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f30242D = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
