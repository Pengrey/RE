package p426wg;

import ae.BindingAdapters;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import ki.PingoDoceBindingAdapters;
import p246n2.C7627c;
import p246n2.C7629e;
import p246n2.C7634f;

/* renamed from: wg.i8 */
/* loaded from: classes2.dex */
public class C11817i8 extends AbstractC11799h8 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f30573I = null;

    /* renamed from: J */
    private static final SparseIntArray f30574J = null;

    /* renamed from: E */
    private final LinearLayout f30575E;

    /* renamed from: F */
    private final ImageView f30576F;

    /* renamed from: G */
    private final TextView f30577G;

    /* renamed from: H */
    private long f30578H;

    public C11817i8(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 4, f30573I, f30574J));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (33 == i) {
            mo4192S((Drawable) obj);
        } else if (34 == i) {
            mo4191T((String) obj);
        } else if (27 == i) {
            mo4194Q((Boolean) obj);
        } else if (110 == i) {
            mo4189V((Boolean) obj);
        } else if (107 == i) {
            mo4190U((Boolean) obj);
        } else if (32 != i) {
            return false;
        } else {
            mo4193R((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11799h8
    /* renamed from: Q */
    public void mo4194Q(Boolean bool) {
        this.f30465z = bool;
        synchronized (this) {
            this.f30578H |= 4;
        }
        m37781c(27);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11799h8
    /* renamed from: R */
    public void mo4193R(String str) {
        this.f30461C = str;
        synchronized (this) {
            this.f30578H |= 32;
        }
        m37781c(32);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11799h8
    /* renamed from: S */
    public void mo4192S(Drawable drawable) {
        this.f30459A = drawable;
        synchronized (this) {
            this.f30578H |= 1;
        }
        m37781c(33);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11799h8
    /* renamed from: T */
    public void mo4191T(String str) {
        this.f30460B = str;
        synchronized (this) {
            this.f30578H |= 2;
        }
        m37781c(34);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11799h8
    /* renamed from: U */
    public void mo4190U(Boolean bool) {
        this.f30462D = bool;
        synchronized (this) {
            this.f30578H |= 16;
        }
        m37781c(C0868i.f2768G0);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11799h8
    /* renamed from: V */
    public void mo4189V(Boolean bool) {
        this.f30464y = bool;
        synchronized (this) {
            this.f30578H |= 8;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        float f;
        float f2;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        synchronized (this) {
            j = this.f30578H;
            this.f30578H = 0L;
        }
        Drawable drawable = this.f30459A;
        String str = this.f30460B;
        Boolean bool = this.f30465z;
        Boolean bool2 = this.f30464y;
        Boolean bool3 = this.f30462D;
        String str2 = this.f30461C;
        int i3 = ((j & 68) > 0L ? 1 : ((j & 68) == 0L ? 0 : -1));
        if (i3 != 0) {
            boolean m37823H = ViewDataBinding.m37823H(bool);
            if (i3 != 0) {
                j |= m37823H ? 256L : 128L;
            }
            if (m37823H) {
                resources2 = this.f30575E.getResources();
                i2 = C2336R.dimen.zero;
            } else {
                resources2 = this.f30575E.getResources();
                i2 = C2336R.dimen.empty_list_margin_top;
            }
            f = resources2.getDimension(i2);
        } else {
            f = 0.0f;
        }
        int i4 = ((j & 80) > 0L ? 1 : ((j & 80) == 0L ? 0 : -1));
        if (i4 != 0) {
            boolean m37823H2 = ViewDataBinding.m37823H(bool3);
            if (i4 != 0) {
                j |= m37823H2 ? 1024L : 512L;
            }
            if (m37823H2) {
                resources = this.f30576F.getResources();
                i = C2336R.dimen.empty_list_icon_width_alt;
            } else {
                resources = this.f30576F.getResources();
                i = C2336R.dimen.empty_list_icon_width;
            }
            f2 = resources.getDimension(i);
        } else {
            f2 = 0.0f;
        }
        int i5 = ((j & 96) > 0L ? 1 : ((j & 96) == 0L ? 0 : -1));
        if ((j & 66) != 0) {
            C7629e.m17885g(this.f30463x, str);
        }
        if ((68 & j) != 0) {
            C7634f.m17878f(this.f30575E, f);
            C7634f.m17880d(this.f30575E, f);
        }
        if ((72 & j) != 0) {
            BindingAdapters.m41779l(this.f30575E, bool2, Boolean.TRUE);
        }
        if ((65 & j) != 0) {
            C7627c.m17894a(this.f30576F, drawable);
        }
        if ((j & 80) != 0) {
            PingoDoceBindingAdapters.m20344c(this.f30576F, 0.0f, f2);
        }
        if (i5 != 0) {
            C7629e.m17885g(this.f30577G, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30578H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30578H = 64L;
        }
        m37826E();
    }

    private C11817i8(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[2]);
        this.f30578H = -1L;
        this.f30463x.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f30575E = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.f30576F = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f30577G = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
