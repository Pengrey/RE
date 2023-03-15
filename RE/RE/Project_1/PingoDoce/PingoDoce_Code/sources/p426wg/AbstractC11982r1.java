package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import p495zi.NifViewModel;

/* renamed from: wg.r1 */
/* loaded from: classes2.dex */
public abstract class AbstractC11982r1 extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f31351A;

    /* renamed from: B */
    protected NifViewModel f31352B;

    /* renamed from: x */
    public final TextView f31353x;

    /* renamed from: y */
    public final AbstractC11996rf f31354y;

    /* renamed from: z */
    public final TextInputEditText f31355z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11982r1(Object obj, View view, int i, TextView textView, TextView textView2, AbstractC11996rf abstractC11996rf, TextInputEditText textInputEditText, MaterialButton materialButton) {
        super(obj, view, i);
        this.f31353x = textView;
        this.f31354y = abstractC11996rf;
        this.f31355z = textInputEditText;
        this.f31351A = materialButton;
    }
}
