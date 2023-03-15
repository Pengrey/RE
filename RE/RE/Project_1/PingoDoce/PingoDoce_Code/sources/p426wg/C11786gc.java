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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: wg.gc */
/* loaded from: classes2.dex */
public class C11786gc extends AbstractC11766fc {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30418F = null;

    /* renamed from: G */
    private static final SparseIntArray f30419G;

    /* renamed from: D */
    private final TextView f30420D;

    /* renamed from: E */
    private long f30421E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30419G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.close_ImageButton, 5);
    }

    public C11786gc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30418F, f30419G));
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
            mo4246Q((Banner) obj);
            return true;
        } else if (1 == i) {
            m4245R((View.OnClickListener) obj);
            return true;
        } else if (88 == i) {
            m4244S((View.OnClickListener) obj);
            return true;
        } else {
            return false;
        }
    }

    @Override // p426wg.AbstractC11766fc
    /* renamed from: Q */
    public void mo4246Q(Banner banner) {
        this.f30335C = banner;
        synchronized (this) {
            this.f30421E |= 1;
        }
        m37781c(13);
        super.m37826E();
    }

    /* renamed from: R */
    public void m4245R(View.OnClickListener onClickListener) {
    }

    /* renamed from: S */
    public void m4244S(View.OnClickListener onClickListener) {
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
            j = this.f30421E;
            this.f30421E = 0L;
        }
        Banner banner = this.f30335C;
        int i = ((j & 9) > 0L ? 1 : ((j & 9) == 0L ? 0 : -1));
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
                j |= r9 ? 32L : 16L;
            }
            str3 = str4;
        } else {
            z = false;
            str = null;
            str2 = null;
            str3 = null;
        }
        int i2 = ((j & 9) > 0L ? 1 : ((j & 9) == 0L ? 0 : -1));
        String str5 = i2 != 0 ? r9 ? "Ver todos" : str : null;
        if (i2 != 0) {
            C7629e.m17885g(this.f30336x, str5);
            BindingAdapters.m41781j(this.f30338z, str3, null, null, null, null);
            C7629e.m17885g(this.f30334B, str2);
            BindingAdapters.m41779l(this.f30420D, Boolean.valueOf(z), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30421E != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30421E = 8L;
        }
        m37826E();
    }

    private C11786gc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[4], (ImageButton) objArr[5], (ImageView) objArr[1], (MaterialCardView) objArr[0], (TextView) objArr[3]);
        this.f30421E = -1L;
        this.f30336x.setTag(null);
        this.f30338z.setTag(null);
        this.f30333A.setTag(null);
        this.f30334B.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f30420D = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
