package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import ki.PingoDoceBindingAdapters;
import p246n2.C7624a;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: wg.ke */
/* loaded from: classes2.dex */
public class C11860ke extends AbstractC11840je {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f30801I = null;

    /* renamed from: J */
    private static final SparseIntArray f30802J;

    /* renamed from: G */
    private final ConstraintLayout f30803G;

    /* renamed from: H */
    private long f30804H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30802J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_schedule_image, 7);
        sparseIntArray.put(C2336R.C2338id.const_divider, 8);
        sparseIntArray.put(C2336R.C2338id.const_phone_image, 9);
        sparseIntArray.put(C2336R.C2338id.const_store_arrow, 10);
    }

    public C11860ke(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f30801I, f30802J));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (103 == i) {
            mo4074T((Store) obj);
        } else if (60 == i) {
            mo4075S((Boolean) obj);
        } else if (111 != i) {
            return false;
        } else {
            mo4073U((Integer) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11840je
    /* renamed from: S */
    public void mo4075S(Boolean bool) {
        this.f30701E = bool;
        synchronized (this) {
            this.f30804H |= 2;
        }
        m37781c(60);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11840je
    /* renamed from: T */
    public void mo4074T(Store store) {
        this.f30700D = store;
        synchronized (this) {
            this.f30804H |= 1;
        }
        m37781c(C0868i.f2753D0);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11840je
    /* renamed from: U */
    public void mo4073U(Integer num) {
        this.f30702F = num;
        synchronized (this) {
            this.f30804H |= 4;
        }
        m37781c(111);
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
        boolean z2;
        boolean z3;
        String str5;
        String str6;
        String str7;
        synchronized (this) {
            j = this.f30804H;
            this.f30804H = 0L;
        }
        Store store = this.f30700D;
        Boolean bool = this.f30701E;
        Integer num = this.f30702F;
        int i = ((j & 9) > 0L ? 1 : ((j & 9) == 0L ? 0 : -1));
        String str8 = null;
        if (i != 0) {
            if (store != null) {
                str8 = store.m13709i();
                str6 = store.m13710h();
                z2 = store.m13703s();
                z3 = store.m13701v();
                str7 = store.m13699y();
                str5 = store.m13713d();
            } else {
                z2 = false;
                z3 = false;
                str5 = null;
                str6 = null;
                str7 = null;
            }
            if (i != 0) {
                j |= z3 ? 32L : 16L;
            }
            z = !z2;
            String string = this.f30703x.getResources().getString(z3 ? C2336R.string.lbl_store_open : C2336R.string.lbl_store_closed);
            str4 = str6;
            str2 = str7;
            str3 = str5;
            str = str8;
            str8 = string;
        } else {
            z = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        int i2 = ((j & 10) > 0L ? 1 : ((j & 10) == 0L ? 0 : -1));
        boolean m37823H = i2 != 0 ? ViewDataBinding.m37823H(bool) : false;
        int i3 = ((j & 12) > 0L ? 1 : ((j & 12) == 0L ? 0 : -1));
        int m37824G = i3 != 0 ? ViewDataBinding.m37824G(num) : 0;
        if (i3 != 0) {
            PingoDoceBindingAdapters.m20340g(this.f30703x, m37824G);
        }
        if ((j & 9) != 0) {
            C7629e.m17885g(this.f30703x, str8);
            C7629e.m17885g(this.f30704y, str);
            C7629e.m17885g(this.f30705z, str2);
            BindingAdapters.m41779l(this.f30705z, Boolean.valueOf(z), Boolean.TRUE);
            C7629e.m17885g(this.f30697A, str3);
            C7629e.m17885g(this.f30698B, str4);
        }
        if (i2 != 0) {
            C7624a.m17897a(this.f30699C, m37823H);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30804H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30804H = 8L;
        }
        m37826E();
    }

    private C11860ke(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[6], (View) objArr[8], (TextView) objArr[5], (ImageView) objArr[9], (TextView) objArr[4], (ImageView) objArr[7], (TextView) objArr[3], (ImageView) objArr[10], (TextView) objArr[2], (RadioButton) objArr[1]);
        this.f30804H = -1L;
        this.f30703x.setTag(null);
        this.f30704y.setTag(null);
        this.f30705z.setTag(null);
        this.f30697A.setTag(null);
        this.f30698B.setTag(null);
        this.f30699C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30803G = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
