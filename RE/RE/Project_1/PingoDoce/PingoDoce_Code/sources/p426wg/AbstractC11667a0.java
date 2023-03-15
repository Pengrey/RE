package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import p408vk.OnboardingEmailSentViewModel;

/* renamed from: wg.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11667a0 extends ViewDataBinding {

    /* renamed from: A */
    public final AbstractC11996rf f29809A;

    /* renamed from: B */
    public final TextView f29810B;

    /* renamed from: C */
    public final TextView f29811C;

    /* renamed from: D */
    public final ImageView f29812D;

    /* renamed from: E */
    protected OnboardingEmailSentViewModel f29813E;

    /* renamed from: x */
    public final MaterialButton f29814x;

    /* renamed from: y */
    public final MaterialButton f29815y;

    /* renamed from: z */
    public final MaterialButton f29816z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11667a0(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, AbstractC11996rf abstractC11996rf, TextView textView, TextView textView2, ImageView imageView) {
        super(obj, view, i);
        this.f29814x = materialButton;
        this.f29815y = materialButton2;
        this.f29816z = materialButton3;
        this.f29809A = abstractC11996rf;
        this.f29810B = textView;
        this.f29811C = textView2;
        this.f29812D = imageView;
    }
}
