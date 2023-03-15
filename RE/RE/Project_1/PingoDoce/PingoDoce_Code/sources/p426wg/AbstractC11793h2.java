package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import cl.OnboardingSuccessViewModel;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.h2 */
/* loaded from: classes2.dex */
public abstract class AbstractC11793h2 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30443A;

    /* renamed from: B */
    protected OnboardingSuccessViewModel f30444B;

    /* renamed from: x */
    public final MaterialButton f30445x;

    /* renamed from: y */
    public final AbstractC11996rf f30446y;

    /* renamed from: z */
    public final TextView f30447z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11793h2(Object obj, View view, int i, MaterialButton materialButton, AbstractC11996rf abstractC11996rf, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f30445x = materialButton;
        this.f30446y = abstractC11996rf;
        this.f30447z = textView;
        this.f30443A = textView2;
    }
}
