package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p069dl.UserDataViewModel;

/* renamed from: wg.l4 */
/* loaded from: classes2.dex */
public abstract class AbstractC11867l4 extends ViewDataBinding {

    /* renamed from: A */
    protected UserDataViewModel f30845A;

    /* renamed from: B */
    protected Boolean f30846B;

    /* renamed from: x */
    public final AbstractC11996rf f30847x;

    /* renamed from: y */
    public final TextInputEditText f30848y;

    /* renamed from: z */
    public final MaterialButton f30849z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11867l4(Object obj, View view, int i, TextView textView, TextInputLayout textInputLayout, AbstractC11996rf abstractC11996rf, TextInputEditText textInputEditText, MaterialButton materialButton) {
        super(obj, view, i);
        this.f30847x = abstractC11996rf;
        this.f30848y = textInputEditText;
        this.f30849z = materialButton;
    }

    /* renamed from: Q */
    public abstract void mo4023Q(Boolean bool);
}
