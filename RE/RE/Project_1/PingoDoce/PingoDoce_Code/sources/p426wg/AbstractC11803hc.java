package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.Benefit;

/* renamed from: wg.hc */
/* loaded from: classes2.dex */
public abstract class AbstractC11803hc extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30469A;

    /* renamed from: B */
    public final TextView f30470B;

    /* renamed from: C */
    protected Benefit f30471C;

    /* renamed from: x */
    public final TextView f30472x;

    /* renamed from: y */
    public final TextView f30473y;

    /* renamed from: z */
    public final MaterialCardView f30474z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11803hc(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, MaterialCardView materialCardView, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        super(obj, view, i);
        this.f30472x = textView;
        this.f30473y = textView2;
        this.f30474z = materialCardView;
        this.f30469A = textView3;
        this.f30470B = textView4;
    }
}
