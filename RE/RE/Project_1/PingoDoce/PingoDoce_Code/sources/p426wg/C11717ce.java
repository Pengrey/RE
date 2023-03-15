package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.util.List;
import kg.FriendImage;
import p246n2.C7624a;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* renamed from: wg.ce */
/* loaded from: classes2.dex */
public class C11717ce extends AbstractC11699be {

    /* renamed from: H */
    private static final ViewDataBinding.C1263i f30039H;

    /* renamed from: I */
    private static final SparseIntArray f30040I;

    /* renamed from: E */
    private final MaterialCardView f30041E;

    /* renamed from: F */
    private final ConstraintLayout f30042F;

    /* renamed from: G */
    private long f30043G;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(6);
        f30039H = c1263i;
        c1263i.m37795a(1, new String[]{"view_row_for_shared_with"}, new int[]{5}, new int[]{C2336R.layout.view_row_for_shared_with});
        f30040I = null;
    }

    public C11717ce(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f30039H, f30040I));
    }

    /* renamed from: V */
    private boolean m4413V(AbstractC12140zd abstractC12140zd, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30043G |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m4413V((AbstractC12140zd) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f29967x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (61 == i) {
            mo4414U((ShoppingList) obj);
        } else if (43 == i) {
            mo4415T((List) obj);
        } else if (42 != i) {
            return false;
        } else {
            mo4416S((Integer) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11699be
    /* renamed from: S */
    public void mo4416S(Integer num) {
        this.f29966D = num;
        synchronized (this) {
            this.f30043G |= 8;
        }
        m37781c(42);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11699be
    /* renamed from: T */
    public void mo4415T(List<FriendImage> list) {
        this.f29965C = list;
        synchronized (this) {
            this.f30043G |= 4;
        }
        m37781c(43);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11699be
    /* renamed from: U */
    public void mo4414U(ShoppingList shoppingList) {
        this.f29964B = shoppingList;
        synchronized (this) {
            this.f30043G |= 2;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f30043G;
            this.f30043G = 0L;
        }
        ShoppingList shoppingList = this.f29964B;
        List<FriendImage> list = this.f29965C;
        Integer num = this.f29966D;
        boolean z = false;
        int i = ((18 & j) > 0L ? 1 : ((18 & j) == 0L ? 0 : -1));
        String str2 = null;
        if (i == 0 || shoppingList == null) {
            str = null;
        } else {
            String m13736k = shoppingList.m13736k();
            String m13738i = shoppingList.m13738i();
            z = shoppingList.m13732s();
            str = m13736k;
            str2 = m13738i;
        }
        int i2 = ((20 & j) > 0L ? 1 : ((20 & j) == 0L ? 0 : -1));
        if ((j & 24) != 0) {
            this.f29967x.mo3564S(num);
        }
        if (i2 != 0) {
            this.f29967x.mo3563T(list);
        }
        if (i != 0) {
            C7629e.m17885g(this.f29968y, str2);
            C7624a.m17897a(this.f29969z, z);
            C7629e.m17885g(this.f29963A, str);
        }
        ViewDataBinding.m37808m(this.f29967x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30043G != 0) {
                return true;
            }
            return this.f29967x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30043G = 16L;
        }
        this.f29967x.mo3579w();
        m37826E();
    }

    private C11717ce(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (AbstractC12140zd) objArr[5], (TextView) objArr[3], (SwitchMaterial) objArr[4], (TextView) objArr[2]);
        this.f30043G = -1L;
        m37821J(this.f29967x);
        this.f29968y.setTag(null);
        this.f29969z.setTag(null);
        this.f29963A.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f30041E = materialCardView;
        materialCardView.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30042F = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
