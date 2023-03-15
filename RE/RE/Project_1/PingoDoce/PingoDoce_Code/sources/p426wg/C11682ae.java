package p426wg;

import ae.BindingAdapters;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import java.util.List;
import kg.FriendImage;
import p246n2.C7629e;

/* renamed from: wg.ae */
/* loaded from: classes2.dex */
public class C11682ae extends AbstractC12140zd {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f29886G = null;

    /* renamed from: H */
    private static final SparseIntArray f29887H = null;

    /* renamed from: C */
    private final LinearLayout f29888C;

    /* renamed from: D */
    private final LinearLayout f29889D;

    /* renamed from: E */
    private final TextView f29890E;

    /* renamed from: F */
    private long f29891F;

    public C11682ae(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f29886G, f29887H));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (66 == i) {
            mo3562U((String) obj);
        } else if (98 == i) {
            mo3561V(((Boolean) obj).booleanValue());
        } else if (43 == i) {
            mo3563T((List) obj);
        } else if (42 == i) {
            mo3564S((Integer) obj);
        } else if (108 != i) {
            return false;
        } else {
            mo3560W(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p426wg.AbstractC12140zd
    /* renamed from: S */
    public void mo3564S(Integer num) {
        this.f32065y = num;
        synchronized (this) {
            this.f29891F |= 8;
        }
        m37781c(42);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12140zd
    /* renamed from: T */
    public void mo3563T(List<FriendImage> list) {
        this.f32064x = list;
        synchronized (this) {
            this.f29891F |= 4;
        }
        m37781c(43);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12140zd
    /* renamed from: U */
    public void mo3562U(String str) {
        this.f32062A = str;
        synchronized (this) {
            this.f29891F |= 1;
        }
        m37781c(66);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12140zd
    /* renamed from: V */
    public void mo3561V(boolean z) {
        this.f32063B = z;
        synchronized (this) {
            this.f29891F |= 2;
        }
        m37781c(98);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12140zd
    /* renamed from: W */
    public void mo3560W(boolean z) {
        this.f32066z = z;
        synchronized (this) {
            this.f29891F |= 16;
        }
        m37781c(C0868i.f2773H0);
        super.m37826E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        synchronized (this) {
            j = this.f29891F;
            this.f29891F = 0L;
        }
        String str = this.f32062A;
        boolean z2 = this.f32063B;
        List<FriendImage> list = this.f32064x;
        Integer num = this.f32065y;
        boolean z3 = this.f32066z;
        String format = (j & 33) != 0 ? String.format(this.f29890E.getResources().getString(C2336R.string.lbl_last_sync), str) : null;
        if ((j & 44) != 0) {
            int i = ((j & 36) > 0L ? 1 : ((j & 36) == 0L ? 0 : -1));
            if (i != 0) {
                r12 = list != null ? list.isEmpty() : false;
                if (i != 0) {
                    j |= r12 ? 512L : 256L;
                }
                boolean z4 = !r12;
                float dimension = r12 ? this.f29890E.getResources().getDimension(C2336R.dimen.shopping_last_sync_margin_top) : this.f29890E.getResources().getDimension(C2336R.dimen.zero);
                r12 = z4;
                f = dimension;
            } else {
                f = 0.0f;
            }
            z = r12;
            r12 = ViewDataBinding.m37824G(num);
        } else {
            z = false;
            f = 0.0f;
        }
        int i2 = ((j & 48) > 0L ? 1 : ((j & 48) == 0L ? 0 : -1));
        if (i2 != 0) {
            if (i2 != 0) {
                j |= z3 ? 128L : 64L;
            }
            Resources resources = this.f29889D.getResources();
            f2 = z3 ? resources.getDimension(C2336R.dimen.spacing_default) : resources.getDimension(C2336R.dimen.zero);
        } else {
            f2 = 0.0f;
        }
        if ((44 & j) != 0) {
            f3 = f2;
            BindingAdapters.m41784g(this.f29889D, list, r12 ? 1 : 0, C2336R.layout.view_row_for_friend_image, null, null, null);
        } else {
            f3 = f2;
        }
        if ((j & 36) != 0) {
            BindingAdapters.m41779l(this.f29889D, Boolean.valueOf(z), Boolean.TRUE);
            f4 = 0.0f;
            BindingAdapters.m41785f(this.f29890E, 0.0f, f, 0.0f, 0.0f);
        } else {
            f4 = 0.0f;
        }
        if ((j & 48) != 0) {
            BindingAdapters.m41785f(this.f29889D, f3, f4, f4, f4);
        }
        if ((33 & j) != 0) {
            C7629e.m17885g(this.f29890E, format);
        }
        if ((j & 34) != 0) {
            BindingAdapters.m41779l(this.f29890E, Boolean.valueOf(z2), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f29891F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f29891F = 32L;
        }
        m37826E();
    }

    private C11682ae(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0);
        this.f29891F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f29888C = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f29889D = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f29890E = textView;
        textView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
