package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.t8 */
/* loaded from: classes2.dex */
public abstract class AbstractC12025t8 extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialCardView f31533x;

    /* renamed from: y */
    public final MaterialButton f31534y;

    /* renamed from: z */
    protected View.OnClickListener f31535z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12025t8(Object obj, View view, int i, MaterialCardView materialCardView, TextView textView, TextView textView2, ImageView imageView, MaterialButton materialButton) {
        super(obj, view, i);
        this.f31533x = materialCardView;
        this.f31534y = materialButton;
    }

    /* renamed from: Q */
    public abstract void mo3717Q(View.OnClickListener onClickListener);
}
