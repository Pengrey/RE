package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import pl.TakeAwayCheckoutViewModel;

/* renamed from: wg.f6 */
/* loaded from: classes2.dex */
public abstract class AbstractC11760f6 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30305A;

    /* renamed from: B */
    public final MaterialButton f30306B;

    /* renamed from: C */
    public final RecyclerView f30307C;

    /* renamed from: D */
    protected TakeAwayCheckoutViewModel f30308D;

    /* renamed from: x */
    public final Toolbar f30309x;

    /* renamed from: y */
    public final ConstraintLayout f30310y;

    /* renamed from: z */
    public final TextView f30311z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11760f6(Object obj, View view, int i, Toolbar toolbar, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, MaterialButton materialButton, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f30309x = toolbar;
        this.f30310y = constraintLayout;
        this.f30311z = textView2;
        this.f30305A = textView3;
        this.f30306B = materialButton;
        this.f30307C = recyclerView;
    }

    /* renamed from: Q */
    public abstract void mo4266Q(TakeAwayCheckoutViewModel takeAwayCheckoutViewModel);
}
