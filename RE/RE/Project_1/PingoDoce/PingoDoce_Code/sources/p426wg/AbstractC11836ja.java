package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: wg.ja */
/* loaded from: classes2.dex */
public abstract class AbstractC11836ja extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30685A;

    /* renamed from: B */
    protected Boolean f30686B;

    /* renamed from: C */
    protected View.OnClickListener f30687C;

    /* renamed from: D */
    protected LoyaltyCard f30688D;

    /* renamed from: x */
    public final TextView f30689x;

    /* renamed from: y */
    public final ImageView f30690y;

    /* renamed from: z */
    public final TextView f30691z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11836ja(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.f30689x = textView;
        this.f30690y = imageView;
        this.f30691z = textView2;
        this.f30685A = textView5;
    }
}
