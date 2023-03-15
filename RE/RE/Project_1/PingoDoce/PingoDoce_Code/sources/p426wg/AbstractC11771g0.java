package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import p088ek.IntroViewModel;

/* renamed from: wg.g0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11771g0 extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialButton f30351x;

    /* renamed from: y */
    public final MaterialButton f30352y;

    /* renamed from: z */
    protected IntroViewModel f30353z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11771g0(Object obj, View view, int i, ConstraintLayout constraintLayout, Guideline guideline, MaterialButton materialButton, TextView textView, MaterialButton materialButton2, TextView textView2) {
        super(obj, view, i);
        this.f30351x = materialButton;
        this.f30352y = materialButton2;
    }
}
