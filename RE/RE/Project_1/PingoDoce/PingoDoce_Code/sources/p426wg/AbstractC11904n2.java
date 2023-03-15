package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel;

/* renamed from: wg.n2 */
/* loaded from: classes2.dex */
public abstract class AbstractC11904n2 extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f31012A;

    /* renamed from: B */
    public final TextView f31013B;

    /* renamed from: C */
    public final TextView f31014C;

    /* renamed from: D */
    public final TextView f31015D;

    /* renamed from: E */
    protected PinRecoverViewModel f31016E;

    /* renamed from: x */
    public final ImageView f31017x;

    /* renamed from: y */
    public final AbstractC11996rf f31018y;

    /* renamed from: z */
    public final ImageView f31019z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11904n2(Object obj, View view, int i, ImageView imageView, AbstractC11996rf abstractC11996rf, ImageView imageView2, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.f31017x = imageView;
        this.f31018y = abstractC11996rf;
        this.f31019z = imageView2;
        this.f31012A = materialButton;
        this.f31013B = textView;
        this.f31014C = textView3;
        this.f31015D = textView4;
    }
}
