package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.h7 */
/* loaded from: classes2.dex */
public abstract class AbstractC11798h7 extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f30456x;

    /* renamed from: y */
    public final TextView f30457y;

    /* renamed from: z */
    protected LoyaltyCard f30458z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11798h7(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.f30456x = textView;
        this.f30457y = textView3;
    }

    /* renamed from: Q */
    public abstract void mo4196Q(Boolean bool);

    /* renamed from: R */
    public abstract void mo4195R(LoyaltyCard loyaltyCard);
}
