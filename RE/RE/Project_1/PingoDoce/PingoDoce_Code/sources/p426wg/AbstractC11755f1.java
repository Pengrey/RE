package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p473yi.VirtualCardDataConfirmationViewModel;

/* renamed from: wg.f1 */
/* loaded from: classes2.dex */
public abstract class AbstractC11755f1 extends ViewDataBinding {

    /* renamed from: A */
    protected VirtualCardDataConfirmationViewModel f30277A;

    /* renamed from: x */
    public final MaterialButton f30278x;

    /* renamed from: y */
    public final AbstractC11996rf f30279y;

    /* renamed from: z */
    public final TextInputEditText f30280z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11755f1(Object obj, View view, int i, MaterialButton materialButton, TextInputLayout textInputLayout, AbstractC11996rf abstractC11996rf, TextView textView, TextView textView2, TextInputEditText textInputEditText) {
        super(obj, view, i);
        this.f30278x = materialButton;
        this.f30279y = abstractC11996rf;
        this.f30280z = textInputEditText;
    }
}
