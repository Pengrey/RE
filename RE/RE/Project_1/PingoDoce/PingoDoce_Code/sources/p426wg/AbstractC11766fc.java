package p426wg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: wg.fc */
/* loaded from: classes2.dex */
public abstract class AbstractC11766fc extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialCardView f30333A;

    /* renamed from: B */
    public final TextView f30334B;

    /* renamed from: C */
    protected Banner f30335C;

    /* renamed from: x */
    public final MaterialButton f30336x;

    /* renamed from: y */
    public final ImageButton f30337y;

    /* renamed from: z */
    public final ImageView f30338z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11766fc(Object obj, View view, int i, MaterialButton materialButton, ImageButton imageButton, ImageView imageView, MaterialCardView materialCardView, TextView textView) {
        super(obj, view, i);
        this.f30336x = materialButton;
        this.f30337y = imageButton;
        this.f30338z = imageView;
        this.f30333A = materialCardView;
        this.f30334B = textView;
    }

    /* renamed from: Q */
    public abstract void mo4246Q(Banner banner);
}
