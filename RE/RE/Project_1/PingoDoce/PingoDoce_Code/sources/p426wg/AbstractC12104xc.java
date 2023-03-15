package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: wg.xc */
/* loaded from: classes2.dex */
public abstract class AbstractC12104xc extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31893A;

    /* renamed from: B */
    public final TextView f31894B;

    /* renamed from: C */
    public final TextView f31895C;

    /* renamed from: D */
    public final RadioGroup f31896D;

    /* renamed from: E */
    protected LoyaltyCardResumeViewModel f31897E;

    /* renamed from: x */
    public final MaterialButton f31898x;

    /* renamed from: y */
    public final ImageView f31899y;

    /* renamed from: z */
    public final MaterialButton f31900z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12104xc(Object obj, View view, int i, MaterialButton materialButton, ImageView imageView, MaterialButton materialButton2, TextView textView, TextView textView2, TextView textView3, RadioGroup radioGroup) {
        super(obj, view, i);
        this.f31898x = materialButton;
        this.f31899y = imageView;
        this.f31900z = materialButton2;
        this.f31893A = textView;
        this.f31894B = textView2;
        this.f31895C = textView3;
        this.f31896D = radioGroup;
    }

    /* renamed from: Q */
    public abstract void mo3598Q(LoyaltyCardResumeViewModel loyaltyCardResumeViewModel);
}
