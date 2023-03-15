package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import kg.FriendImage;
import p246n2.C7624a;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;

/* renamed from: wg.qc */
/* loaded from: classes2.dex */
public class C11975qc extends AbstractC11953pc {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f31323G;

    /* renamed from: H */
    private static final SparseIntArray f31324H;

    /* renamed from: D */
    private final ConstraintLayout f31325D;

    /* renamed from: E */
    private InterfaceC1276g f31326E;

    /* renamed from: F */
    private long f31327F;

    /* compiled from: ViewRowForFriendBindingImpl.java */
    /* renamed from: wg.qc$a */
    /* loaded from: classes2.dex */
    class C11976a implements InterfaceC1276g {
        C11976a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C11975qc.this.f31224z.isChecked();
            Friend friend = C11975qc.this.f31220B;
            if (friend != null) {
                friend.m14393k(isChecked);
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(5);
        f31323G = c1263i;
        c1263i.m37795a(0, new String[]{"view_row_for_friend_image"}, new int[]{4}, new int[]{C2336R.layout.view_row_for_friend_image});
        f31324H = null;
    }

    public C11975qc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f31323G, f31324H));
    }

    /* renamed from: U */
    private boolean m3839U(AbstractC11993rc abstractC11993rc, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31327F |= 1;
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
        return m3839U((AbstractC11993rc) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31222x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (61 == i) {
            mo3841S((Friend) obj);
        } else if (62 != i) {
            return false;
        } else {
            mo3840T((FriendImage) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11953pc
    /* renamed from: S */
    public void mo3841S(Friend friend) {
        this.f31220B = friend;
        synchronized (this) {
            this.f31327F |= 2;
        }
        m37781c(61);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11953pc
    /* renamed from: T */
    public void mo3840T(FriendImage friendImage) {
        this.f31221C = friendImage;
        synchronized (this) {
            this.f31327F |= 4;
        }
        m37781c(62);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        boolean z4;
        boolean z5;
        String str4;
        synchronized (this) {
            j = this.f31327F;
            this.f31327F = 0L;
        }
        Friend friend = this.f31220B;
        FriendImage friendImage = this.f31221C;
        int i = ((j & 10) > 0L ? 1 : ((j & 10) == 0L ? 0 : -1));
        if (i != 0) {
            if (friend != null) {
                z4 = friend.m14394j();
                z3 = friend.m14394j();
                z5 = friend.m14400c();
                str4 = friend.m14396h();
            } else {
                z4 = false;
                z3 = false;
                z5 = false;
                str4 = null;
            }
            if (i != 0) {
                j = z3 ? j | 32 : j | 16;
            }
            z = !z4;
            z2 = z5;
            str = str4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            str = null;
        }
        int i2 = ((j & 12) > 0L ? 1 : ((j & 12) == 0L ? 0 : -1));
        if ((j & 48) != 0) {
            str2 = friend != null ? friend.m14397f() : null;
            str3 = (32 & j) != 0 ? String.format(this.f31223y.getResources().getString(C2336R.string.lbl_list_owner), str2) : null;
        } else {
            str2 = null;
            str3 = null;
        }
        int i3 = ((10 & j) > 0L ? 1 : ((10 & j) == 0L ? 0 : -1));
        if (i3 == 0) {
            str2 = null;
        } else if (z3) {
            str2 = str3;
        }
        if (i2 != 0) {
            this.f31222x.mo3777Q(friendImage);
        }
        if (i3 != 0) {
            C7629e.m17885g(this.f31223y, str2);
            C7624a.m17897a(this.f31224z, z2);
            BindingAdapters.m41779l(this.f31224z, Boolean.valueOf(z), null);
            C7629e.m17885g(this.f31219A, str);
        }
        if ((j & 8) != 0) {
            C7624a.m17896b(this.f31224z, null, this.f31326E);
        }
        ViewDataBinding.m37808m(this.f31222x);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31327F != 0) {
                return true;
            }
            return this.f31222x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31327F = 8L;
        }
        this.f31222x.mo3579w();
        m37826E();
    }

    private C11975qc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (AbstractC11993rc) objArr[4], (TextView) objArr[1], (SwitchMaterial) objArr[3], (TextView) objArr[2]);
        this.f31326E = new C11976a();
        this.f31327F = -1L;
        m37821J(this.f31222x);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31325D = constraintLayout;
        constraintLayout.setTag(null);
        this.f31223y.setTag(null);
        this.f31224z.setTag(null);
        this.f31219A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
