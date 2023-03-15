package p426wg;

import android.view.View;
import android.widget.Button;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel;

/* renamed from: wg.m0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11880m0 extends ViewDataBinding {

    /* renamed from: A */
    public final AbstractC11833j7 f30898A;

    /* renamed from: B */
    public final AbstractC11909n7 f30899B;

    /* renamed from: C */
    public final Button f30900C;

    /* renamed from: D */
    public final MaterialCardView f30901D;

    /* renamed from: E */
    public final MaterialCardView f30902E;

    /* renamed from: F */
    public final AbstractC11870l7 f30903F;

    /* renamed from: G */
    protected LoyaltyViewModel f30904G;

    /* renamed from: x */
    public final MaterialCardView f30905x;

    /* renamed from: y */
    public final MaterialCardView f30906y;

    /* renamed from: z */
    public final AbstractC11798h7 f30907z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11880m0(Object obj, View view, int i, MaterialCardView materialCardView, MaterialCardView materialCardView2, AbstractC11798h7 abstractC11798h7, AbstractC11833j7 abstractC11833j7, AbstractC11909n7 abstractC11909n7, Button button, MaterialCardView materialCardView3, MaterialCardView materialCardView4, Space space, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AbstractC11870l7 abstractC11870l7) {
        super(obj, view, i);
        this.f30905x = materialCardView;
        this.f30906y = materialCardView2;
        this.f30907z = abstractC11798h7;
        this.f30898A = abstractC11833j7;
        this.f30899B = abstractC11909n7;
        this.f30900C = button;
        this.f30901D = materialCardView3;
        this.f30902E = materialCardView4;
        this.f30903F = abstractC11870l7;
    }

    /* renamed from: Q */
    public abstract void mo3982Q(LoyaltyViewModel loyaltyViewModel);
}
