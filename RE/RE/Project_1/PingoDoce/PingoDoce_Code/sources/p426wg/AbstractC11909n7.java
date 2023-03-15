package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.n7 */
/* loaded from: classes2.dex */
public abstract class AbstractC11909n7 extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f31032x;

    /* renamed from: y */
    protected LoyaltyCard f31033y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11909n7(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f31032x = textView2;
    }

    /* renamed from: Q */
    public abstract void mo3938Q(LoyaltyCard loyaltyCard);
}
