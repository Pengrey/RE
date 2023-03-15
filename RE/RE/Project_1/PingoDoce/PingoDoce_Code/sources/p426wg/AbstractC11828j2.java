package p426wg;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import p187jk.PhoneViewModel;

/* renamed from: wg.j2 */
/* loaded from: classes2.dex */
public abstract class AbstractC11828j2 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30625A;

    /* renamed from: B */
    public final AbstractC11996rf f30626B;

    /* renamed from: C */
    public final EditText f30627C;

    /* renamed from: D */
    public final MaterialButton f30628D;

    /* renamed from: E */
    public final TextInputLayout f30629E;

    /* renamed from: F */
    public final TextView f30630F;

    /* renamed from: G */
    protected PhoneViewModel f30631G;

    /* renamed from: x */
    public final CoordinatorLayout f30632x;

    /* renamed from: y */
    public final ConstraintLayout f30633y;

    /* renamed from: z */
    public final TextView f30634z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11828j2(Object obj, View view, int i, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, AbstractC11996rf abstractC11996rf, EditText editText, MaterialButton materialButton, TextInputLayout textInputLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.f30632x = coordinatorLayout;
        this.f30633y = constraintLayout;
        this.f30634z = textView;
        this.f30625A = textView2;
        this.f30626B = abstractC11996rf;
        this.f30627C = editText;
        this.f30628D = materialButton;
        this.f30629E = textInputLayout;
        this.f30630F = textView3;
    }
}
