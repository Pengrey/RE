package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.f8 */
/* loaded from: classes2.dex */
public abstract class AbstractC11762f8 extends ViewDataBinding {

    /* renamed from: A */
    protected View.OnClickListener f30315A;

    /* renamed from: x */
    public final MaterialCardView f30316x;

    /* renamed from: y */
    public final TextView f30317y;

    /* renamed from: z */
    public final MaterialButton f30318z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11762f8(Object obj, View view, int i, MaterialCardView materialCardView, TextView textView, TextView textView2, ImageView imageView, MaterialButton materialButton) {
        super(obj, view, i);
        this.f30316x = materialCardView;
        this.f30317y = textView;
        this.f30318z = materialButton;
    }

    /* renamed from: Q */
    public abstract void mo4255Q(View.OnClickListener onClickListener);
}
