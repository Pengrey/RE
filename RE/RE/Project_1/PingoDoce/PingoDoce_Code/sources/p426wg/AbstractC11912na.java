package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.na */
/* loaded from: classes2.dex */
public abstract class AbstractC11912na extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f31056x;

    /* renamed from: y */
    protected LoyaltyCard f31057y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11912na(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.f31056x = textView;
    }

    /* renamed from: Q */
    public abstract void mo3922Q(LoyaltyCard loyaltyCard);
}
