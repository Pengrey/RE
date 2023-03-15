package p426wg;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroViewModel;

/* renamed from: wg.z0 */
/* loaded from: classes2.dex */
public abstract class AbstractC12127z0 extends ViewDataBinding {

    /* renamed from: A */
    public final AbstractC12025t8 f32008A;

    /* renamed from: B */
    public final AbstractC12066v8 f32009B;

    /* renamed from: C */
    protected LoyaltyIntroViewModel f32010C;

    /* renamed from: x */
    public final ConstraintLayout f32011x;

    /* renamed from: y */
    public final AbstractC11917nf f32012y;

    /* renamed from: z */
    public final MaterialButton f32013z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12127z0(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, AbstractC11917nf abstractC11917nf, MaterialButton materialButton, AbstractC12025t8 abstractC12025t8, AbstractC12066v8 abstractC12066v8) {
        super(obj, view, i);
        this.f32011x = constraintLayout;
        this.f32012y = abstractC11917nf;
        this.f32013z = materialButton;
        this.f32008A = abstractC12025t8;
        this.f32009B = abstractC12066v8;
    }

    /* renamed from: Q */
    public abstract void mo3577Q(LoyaltyIntroViewModel loyaltyIntroViewModel);
}
