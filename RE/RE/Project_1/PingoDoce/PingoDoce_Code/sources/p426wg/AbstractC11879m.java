package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import li.BirthdateViewModel;

/* renamed from: wg.m */
/* loaded from: classes2.dex */
public abstract class AbstractC11879m extends ViewDataBinding {

    /* renamed from: A */
    public final AbstractC11996rf f30892A;

    /* renamed from: B */
    public final MaterialButton f30893B;

    /* renamed from: C */
    protected BirthdateViewModel f30894C;

    /* renamed from: x */
    public final TextView f30895x;

    /* renamed from: y */
    public final TextView f30896y;

    /* renamed from: z */
    public final TextInputLayout f30897z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11879m(Object obj, View view, int i, TextView textView, View view2, TextView textView2, TextView textView3, TextInputLayout textInputLayout, AbstractC11996rf abstractC11996rf, MaterialButton materialButton) {
        super(obj, view, i);
        this.f30895x = textView;
        this.f30896y = textView2;
        this.f30897z = textInputLayout;
        this.f30892A = abstractC11996rf;
        this.f30893B = materialButton;
    }
}
