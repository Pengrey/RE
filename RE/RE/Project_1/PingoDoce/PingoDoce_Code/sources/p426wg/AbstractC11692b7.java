package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.b7 */
/* loaded from: classes2.dex */
public abstract class AbstractC11692b7 extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f29941x;

    /* renamed from: y */
    public final TextView f29942y;

    /* renamed from: z */
    protected LoyaltyCard f29943z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11692b7(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.f29941x = textView;
        this.f29942y = textView3;
    }

    /* renamed from: Q */
    public abstract void mo4432Q(LoyaltyCard loyaltyCard);
}
