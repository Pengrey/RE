package p363t5;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.recyclerpickerdialog.EnumC2361b;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import p246n2.C7624a;
import p246n2.C7629e;
import p246n2.C7634f;
import p351s5.C10062a;
import p351s5.RecyclerPickerDialogFragment;

/* renamed from: t5.d */
/* loaded from: classes.dex */
public class C10384d extends AbstractC10383c {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f27011G = null;

    /* renamed from: H */
    private static final SparseIntArray f27012H = null;

    /* renamed from: E */
    private final ConstraintLayout f27013E;

    /* renamed from: F */
    private long f27014F;

    public C10384d(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 5, f27011G, f27012H));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (C10062a.f26316b == i) {
            mo8081T((RecyclerPickerDialogFragment) obj);
        } else if (C10062a.f26317c == i) {
            mo8080U((EnumC2361b) obj);
        } else if (C10062a.f26315a != i) {
            return false;
        } else {
            mo8082S((Float) obj);
        }
        return true;
    }

    @Override // p363t5.AbstractC10383c
    /* renamed from: S */
    public void mo8082S(Float f) {
        this.f27007D = f;
        synchronized (this) {
            this.f27014F |= 4;
        }
        m37781c(C10062a.f26315a);
        super.m37826E();
    }

    @Override // p363t5.AbstractC10383c
    /* renamed from: T */
    public void mo8081T(RecyclerPickerDialogFragment recyclerPickerDialogFragment) {
        this.f27005B = recyclerPickerDialogFragment;
        synchronized (this) {
            this.f27014F |= 1;
        }
        m37781c(C10062a.f26316b);
        super.m37826E();
    }

    @Override // p363t5.AbstractC10383c
    /* renamed from: U */
    public void mo8080U(EnumC2361b enumC2361b) {
        this.f27006C = enumC2361b;
        synchronized (this) {
            this.f27014F |= 2;
        }
        m37781c(C10062a.f26317c);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        boolean z;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.f27014F;
            this.f27014F = 0L;
        }
        RecyclerPickerDialogFragment recyclerPickerDialogFragment = this.f27005B;
        String str = null;
        EnumC2361b enumC2361b = this.f27006C;
        Float f = this.f27007D;
        if ((j & 9) == 0 || recyclerPickerDialogFragment == null) {
            z = false;
        } else {
            str = recyclerPickerDialogFragment.m9276b();
            z = recyclerPickerDialogFragment.m9275c();
        }
        int i4 = ((j & 10) > 0L ? 1 : ((j & 10) == 0L ? 0 : -1));
        if (i4 != 0) {
            boolean z2 = enumC2361b == EnumC2361b.CHECK_BOX;
            boolean z3 = enumC2361b == EnumC2361b.SWITCH;
            boolean z4 = enumC2361b == EnumC2361b.RADIO_BUTTON;
            if (i4 != 0) {
                j |= z2 ? 512L : 256L;
            }
            if ((j & 10) != 0) {
                j |= z3 ? 128L : 64L;
            }
            if ((j & 10) != 0) {
                j |= z4 ? 32L : 16L;
            }
            int i5 = z2 ? 0 : 4;
            i2 = z3 ? 0 : 4;
            i = z4 ? 0 : 4;
            i3 = i5;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        int i6 = ((12 & j) > 0L ? 1 : ((12 & j) == 0L ? 0 : -1));
        float m37825F = i6 != 0 ? ViewDataBinding.m37825F(f) : 0.0f;
        if ((9 & j) != 0) {
            C7624a.m17897a(this.f27008x, z);
            C7624a.m17897a(this.f27009y, z);
            C7624a.m17897a(this.f27010z, z);
            C7629e.m17885g(this.f27004A, str);
        }
        if ((j & 10) != 0) {
            this.f27008x.setVisibility(i3);
            this.f27009y.setVisibility(i);
            this.f27010z.setVisibility(i2);
        }
        if (i6 != 0) {
            C7634f.m17879e(this.f27004A, m37825F);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f27014F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f27014F = 8L;
        }
        m37826E();
    }

    private C10384d(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCheckBox) objArr[1], (MaterialRadioButton) objArr[2], (SwitchMaterial) objArr[3], (MaterialTextView) objArr[4]);
        this.f27014F = -1L;
        this.f27008x.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f27013E = constraintLayout;
        constraintLayout.setTag(null);
        this.f27009y.setTag(null);
        this.f27010z.setTag(null);
        this.f27004A.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
