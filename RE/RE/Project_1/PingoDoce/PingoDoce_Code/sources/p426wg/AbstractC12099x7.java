package p426wg;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wg.x7 */
/* loaded from: classes2.dex */
public abstract class AbstractC12099x7 extends ViewDataBinding {

    /* renamed from: A */
    protected boolean f31870A;

    /* renamed from: B */
    protected boolean f31871B;

    /* renamed from: C */
    protected String f31872C;

    /* renamed from: D */
    protected Boolean f31873D;

    /* renamed from: E */
    protected String f31874E;

    /* renamed from: F */
    protected Boolean f31875F;

    /* renamed from: x */
    public final RadioButton f31876x;

    /* renamed from: y */
    public final TextInputLayout f31877y;

    /* renamed from: z */
    public final TextInputEditText f31878z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12099x7(Object obj, View view, int i, TextView textView, RadioButton radioButton, RadioButton radioButton2, TextView textView2, TextInputLayout textInputLayout, TextInputEditText textInputEditText, RadioGroup radioGroup) {
        super(obj, view, i);
        this.f31876x = radioButton2;
        this.f31877y = textInputLayout;
        this.f31878z = textInputEditText;
    }

    /* renamed from: Q */
    public boolean m3656Q() {
        return this.f31870A;
    }

    /* renamed from: R */
    public String m3655R() {
        return this.f31872C;
    }

    /* renamed from: S */
    public Boolean m3654S() {
        return this.f31875F;
    }

    /* renamed from: T */
    public abstract void mo3609T(boolean z);

    /* renamed from: U */
    public abstract void mo3608U(String str);

    /* renamed from: V */
    public abstract void mo3607V(String str);

    /* renamed from: W */
    public abstract void mo3606W(Boolean bool);

    /* renamed from: X */
    public abstract void mo3605X(Boolean bool);

    /* renamed from: Y */
    public abstract void mo3604Y(boolean z);
}
