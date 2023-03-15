package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p246n2.C7624a;
import p246n2.C7629e;

/* renamed from: wg.y7 */
/* loaded from: classes2.dex */
public class C12115y7 extends AbstractC12099x7 {

    /* renamed from: K */
    private static final ViewDataBinding.C1263i f31961K = null;

    /* renamed from: L */
    private static final SparseIntArray f31962L;

    /* renamed from: G */
    private final ConstraintLayout f31963G;

    /* renamed from: H */
    private InterfaceC1276g f31964H;

    /* renamed from: I */
    private InterfaceC1276g f31965I;

    /* renamed from: J */
    private long f31966J;

    /* compiled from: ViewForBabyClubIdBindingImpl.java */
    /* renamed from: wg.y7$a */
    /* loaded from: classes2.dex */
    class C12116a implements InterfaceC1276g {
        C12116a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            boolean isChecked = C12115y7.this.f31876x.isChecked();
            C12115y7 c12115y7 = C12115y7.this;
            boolean z = c12115y7.f31870A;
            if (c12115y7 != null) {
                c12115y7.mo3609T(isChecked);
            }
        }
    }

    /* compiled from: ViewForBabyClubIdBindingImpl.java */
    /* renamed from: wg.y7$b */
    /* loaded from: classes2.dex */
    class C12117b implements InterfaceC1276g {
        C12117b() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C12115y7.this.f31878z);
            C12115y7 c12115y7 = C12115y7.this;
            String str = c12115y7.f31872C;
            if (c12115y7 != null) {
                c12115y7.mo3607V(m17891a);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31962L = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_title, 4);
        sparseIntArray.put(C2336R.C2338id.const_desc, 5);
        sparseIntArray.put(C2336R.C2338id.idTypeRadioGroup, 6);
        sparseIntArray.put(C2336R.C2338id.const_id_type_radioButton_birth_certificate, 7);
    }

    public C12115y7(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f31961K, f31962L));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (50 == i) {
            mo3607V((String) obj);
        } else if (58 == i) {
            mo3605X((Boolean) obj);
        } else if (23 == i) {
            mo3609T(((Boolean) obj).booleanValue());
        } else if (110 == i) {
            mo3604Y(((Boolean) obj).booleanValue());
        } else if (35 == i) {
            mo3608U((String) obj);
        } else if (56 != i) {
            return false;
        } else {
            mo3606W((Boolean) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC12099x7
    /* renamed from: T */
    public void mo3609T(boolean z) {
        this.f31870A = z;
        synchronized (this) {
            this.f31966J |= 4;
        }
        m37781c(23);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12099x7
    /* renamed from: U */
    public void mo3608U(String str) {
        this.f31874E = str;
        synchronized (this) {
            this.f31966J |= 16;
        }
        m37781c(35);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12099x7
    /* renamed from: V */
    public void mo3607V(String str) {
        this.f31872C = str;
        synchronized (this) {
            this.f31966J |= 1;
        }
        m37781c(50);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12099x7
    /* renamed from: W */
    public void mo3606W(Boolean bool) {
        this.f31875F = bool;
        synchronized (this) {
            this.f31966J |= 32;
        }
        m37781c(56);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12099x7
    /* renamed from: X */
    public void mo3605X(Boolean bool) {
        this.f31873D = bool;
        synchronized (this) {
            this.f31966J |= 2;
        }
        m37781c(58);
        super.m37826E();
    }

    @Override // p426wg.AbstractC12099x7
    /* renamed from: Y */
    public void mo3604Y(boolean z) {
        this.f31871B = z;
        synchronized (this) {
            this.f31966J |= 8;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        synchronized (this) {
            j = this.f31966J;
            this.f31966J = 0L;
        }
        String str2 = this.f31872C;
        Boolean bool = this.f31873D;
        boolean z = this.f31870A;
        boolean z2 = this.f31871B;
        String str3 = this.f31874E;
        Boolean bool2 = this.f31875F;
        boolean m37823H = (j & 66) != 0 ? ViewDataBinding.m37823H(bool) : false;
        int i = ((j & 96) > 0L ? 1 : ((j & 96) == 0L ? 0 : -1));
        if (i != 0) {
            boolean m37823H2 = ViewDataBinding.m37823H(bool2);
            if (i != 0) {
                j |= m37823H2 ? 256L : 128L;
            }
            str = this.f31878z.getResources().getString(m37823H2 ? C2336R.string.lbl_clubs_baby_insert_id_number_hint_for_cc : C2336R.string.lbl_clubs_baby_insert_id_number_hint_for_cn);
        } else {
            str = null;
        }
        if ((j & 68) != 0) {
            C7624a.m17897a(this.f31876x, z);
        }
        if ((j & 64) != 0) {
            C7624a.m17896b(this.f31876x, null, this.f31964H);
            C7629e.m17884h(this.f31878z, null, null, null, this.f31965I);
        }
        if ((j & 66) != 0) {
            this.f31877y.setErrorEnabled(m37823H);
        }
        if ((80 & j) != 0) {
            BindingAdapters.m41780k(this.f31877y, str3);
        }
        if ((96 & j) != 0) {
            this.f31878z.setHint(str);
        }
        if ((65 & j) != 0) {
            C7629e.m17885g(this.f31878z, str2);
        }
        if ((j & 72) != 0) {
            BindingAdapters.m41779l(this.f31963G, Boolean.valueOf(z2), Boolean.TRUE);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31966J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31966J = 64L;
        }
        m37826E();
    }

    private C12115y7(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[5], (RadioButton) objArr[7], (RadioButton) objArr[3], (TextView) objArr[4], (TextInputLayout) objArr[1], (TextInputEditText) objArr[2], (RadioGroup) objArr[6]);
        this.f31964H = new C12116a();
        this.f31965I = new C12117b();
        this.f31966J = -1L;
        this.f31876x.setTag(null);
        this.f31877y.setTag(null);
        this.f31878z.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31963G = constraintLayout;
        constraintLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
