package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import ki.PingoDoceBindingAdapters;
import p246n2.C7629e;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: wg.e6 */
/* loaded from: classes2.dex */
public class C11743e6 extends AbstractC11726d6 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f30216I = null;

    /* renamed from: J */
    private static final SparseIntArray f30217J;

    /* renamed from: G */
    private final ConstraintLayout f30218G;

    /* renamed from: H */
    private long f30219H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30217J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_arrow, 7);
        sparseIntArray.put(C2336R.C2338id.const_schedule_image, 8);
        sparseIntArray.put(C2336R.C2338id.const_divider, 9);
        sparseIntArray.put(C2336R.C2338id.const_phone_image, 10);
    }

    public C11743e6(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 11, f30216I, f30217J));
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
            mo4370R((Store) obj);
        } else if (2 == i) {
            mo4371Q((String) obj);
        } else if (111 != i) {
            return false;
        } else {
            mo4369S((Integer) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11726d6
    /* renamed from: Q */
    public void mo4371Q(String str) {
        this.f30093F = str;
        synchronized (this) {
            this.f30219H |= 2;
        }
        m37781c(2);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11726d6
    /* renamed from: R */
    public void mo4370R(Store store) {
        this.f30091D = store;
        synchronized (this) {
            this.f30219H |= 1;
        }
        m37781c(C0868i.f2753D0);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11726d6
    /* renamed from: S */
    public void mo4369S(Integer num) {
        this.f30092E = num;
        synchronized (this) {
            this.f30219H |= 4;
        }
        m37781c(111);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        String str5;
        String str6;
        boolean z3;
        boolean z4;
        boolean z5;
        synchronized (this) {
            j = this.f30219H;
            this.f30219H = 0L;
        }
        Store store = this.f30091D;
        String str7 = this.f30093F;
        Integer num = this.f30092E;
        int i = ((j & 9) > 0L ? 1 : ((j & 9) == 0L ? 0 : -1));
        String str8 = null;
        if (i != 0) {
            if (store != null) {
                str8 = store.m13709i();
                z3 = store.m13702t();
                str4 = store.m13710h();
                z4 = store.m13703s();
                z5 = store.m13701v();
                str6 = store.m13699y();
                str5 = store.m13713d();
            } else {
                str5 = null;
                str4 = null;
                str6 = null;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (i != 0) {
                j |= z5 ? 32L : 16L;
            }
            z = !z3;
            z2 = !z4;
            str3 = z5 ? this.f30090C.getResources().getString(C2336R.string.lbl_store_open) : this.f30090C.getResources().getString(C2336R.string.lbl_store_closed);
            str2 = str5;
            str = str6;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            z = false;
            z2 = false;
        }
        int i2 = ((j & 10) > 0L ? 1 : ((j & 10) == 0L ? 0 : -1));
        int i3 = ((j & 12) > 0L ? 1 : ((j & 12) == 0L ? 0 : -1));
        int m37824G = i3 != 0 ? ViewDataBinding.m37824G(num) : 0;
        if (i2 != 0) {
            C7629e.m17885g(this.f30094x, str7);
        }
        if ((j & 9) != 0) {
            MaterialButton materialButton = this.f30094x;
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool = Boolean.TRUE;
            BindingAdapters.m41779l(materialButton, valueOf, bool);
            C7629e.m17885g(this.f30095y, str8);
            C7629e.m17885g(this.f30096z, str);
            BindingAdapters.m41779l(this.f30096z, Boolean.valueOf(z2), bool);
            C7629e.m17885g(this.f30088A, str2);
            C7629e.m17885g(this.f30089B, str4);
            C7629e.m17885g(this.f30090C, str3);
        }
        if (i3 != 0) {
            PingoDoceBindingAdapters.m20340g(this.f30090C, m37824G);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30219H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30219H = 8L;
        }
        m37826E();
    }

    private C11743e6(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[6], (ImageView) objArr[7], (View) objArr[9], (TextView) objArr[5], (ImageView) objArr[10], (TextView) objArr[3], (ImageView) objArr[8], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[4]);
        this.f30219H = -1L;
        this.f30094x.setTag(null);
        this.f30095y.setTag(null);
        this.f30096z.setTag(null);
        this.f30088A.setTag(null);
        this.f30089B.setTag(null);
        this.f30090C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f30218G = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
