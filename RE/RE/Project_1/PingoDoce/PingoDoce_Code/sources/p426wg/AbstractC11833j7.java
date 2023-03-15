package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.j7 */
/* loaded from: classes2.dex */
public abstract class AbstractC11833j7 extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f30677x;

    /* renamed from: y */
    protected LoyaltyCard f30678y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11833j7(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.f30677x = textView;
    }

    /* renamed from: Q */
    public abstract void mo4085Q(LoyaltyCard loyaltyCard);
}
