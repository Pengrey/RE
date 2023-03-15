package p426wg;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.vb */
/* loaded from: classes2.dex */
public abstract class AbstractC12069vb extends ViewDataBinding {

    /* renamed from: A */
    protected Bitmap f31734A;

    /* renamed from: x */
    public final MaterialCardView f31735x;

    /* renamed from: y */
    public final ImageView f31736y;

    /* renamed from: z */
    protected Boolean f31737z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12069vb(Object obj, View view, int i, MaterialCardView materialCardView, ImageView imageView, CardView cardView, ImageView imageView2) {
        super(obj, view, i);
        this.f31735x = materialCardView;
        this.f31736y = imageView2;
    }

    /* renamed from: Q */
    public abstract void mo3663Q(Bitmap bitmap);

    /* renamed from: R */
    public abstract void mo3662R(Boolean bool);
}
