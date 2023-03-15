package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import vi.LoyaltyCardInsertViewModel;

/* renamed from: wg.r0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11981r0 extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f31345A;

    /* renamed from: B */
    protected LoyaltyCardInsertViewModel f31346B;

    /* renamed from: C */
    protected Boolean f31347C;

    /* renamed from: x */
    public final TextInputEditText f31348x;

    /* renamed from: y */
    public final TextInputLayout f31349y;

    /* renamed from: z */
    public final AbstractC11996rf f31350z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11981r0(Object obj, View view, int i, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView, AbstractC11996rf abstractC11996rf, MaterialButton materialButton) {
        super(obj, view, i);
        this.f31348x = textInputEditText;
        this.f31349y = textInputLayout;
        this.f31350z = abstractC11996rf;
        this.f31345A = materialButton;
    }

    /* renamed from: Q */
    public abstract void mo3821Q(Boolean bool);
}
