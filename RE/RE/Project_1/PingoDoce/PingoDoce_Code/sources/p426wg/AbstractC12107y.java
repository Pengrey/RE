package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import p278oi.EmailViewModel;

/* renamed from: wg.y */
/* loaded from: classes2.dex */
public abstract class AbstractC12107y extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f31913A;

    /* renamed from: B */
    protected EmailViewModel f31914B;

    /* renamed from: x */
    public final TextView f31915x;

    /* renamed from: y */
    public final AbstractC11996rf f31916y;

    /* renamed from: z */
    public final TextInputEditText f31917z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12107y(Object obj, View view, int i, TextView textView, TextView textView2, AbstractC11996rf abstractC11996rf, TextInputEditText textInputEditText, MaterialButton materialButton) {
        super(obj, view, i);
        this.f31915x = textView;
        this.f31916y = abstractC11996rf;
        this.f31917z = textInputEditText;
        this.f31913A = materialButton;
    }
}
