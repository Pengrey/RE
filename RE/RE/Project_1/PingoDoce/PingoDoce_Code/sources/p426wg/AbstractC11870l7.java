package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.l7 */
/* loaded from: classes2.dex */
public abstract class AbstractC11870l7 extends ViewDataBinding {

    /* renamed from: x */
    public final ImageView f30867x;

    /* renamed from: y */
    protected LoyaltyCard f30868y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11870l7(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f30867x = imageView;
    }

    /* renamed from: Q */
    public abstract void mo4007Q(LoyaltyCard loyaltyCard);
}
