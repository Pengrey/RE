package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import p343rk.SmsTokenViewModel;

/* renamed from: wg.p3 */
/* loaded from: classes2.dex */
public abstract class AbstractC11944p3 extends ViewDataBinding {

    /* renamed from: A */
    public final AbstractC11996rf f31195A;

    /* renamed from: B */
    public final TextView f31196B;

    /* renamed from: C */
    public final MaterialButton f31197C;

    /* renamed from: D */
    public final TextView f31198D;

    /* renamed from: E */
    protected SmsTokenViewModel f31199E;

    /* renamed from: x */
    public final PinEntryEditText f31200x;

    /* renamed from: y */
    public final TextInputLayout f31201y;

    /* renamed from: z */
    public final MaterialButton f31202z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11944p3(Object obj, View view, int i, PinEntryEditText pinEntryEditText, TextInputLayout textInputLayout, MaterialButton materialButton, AbstractC11996rf abstractC11996rf, TextView textView, MaterialButton materialButton2, TextView textView2) {
        super(obj, view, i);
        this.f31200x = pinEntryEditText;
        this.f31201y = textInputLayout;
        this.f31202z = materialButton;
        this.f31195A = abstractC11996rf;
        this.f31196B = textView;
        this.f31197C = materialButton2;
        this.f31198D = textView2;
    }
}
