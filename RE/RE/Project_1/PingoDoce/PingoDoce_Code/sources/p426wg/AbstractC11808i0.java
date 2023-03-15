package p426wg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.presentation.landing.lock.LockViewModel;

/* renamed from: wg.i0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11808i0 extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialCardView f30510A;

    /* renamed from: B */
    public final TextView f30511B;

    /* renamed from: C */
    public final ImageView f30512C;

    /* renamed from: D */
    public final MaterialButton f30513D;

    /* renamed from: E */
    public final MaterialCardView f30514E;

    /* renamed from: F */
    public final TextView f30515F;

    /* renamed from: G */
    public final ImageView f30516G;

    /* renamed from: H */
    public final AbstractC12028tb f30517H;

    /* renamed from: I */
    public final AbstractC12069vb f30518I;

    /* renamed from: J */
    protected LockViewModel f30519J;

    /* renamed from: K */
    protected Integer f30520K;

    /* renamed from: x */
    public final AbstractC11691b6 f30521x;

    /* renamed from: y */
    public final MaterialCardView f30522y;

    /* renamed from: z */
    public final FrameLayout f30523z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11808i0(Object obj, View view, int i, AbstractC11691b6 abstractC11691b6, MaterialCardView materialCardView, FrameLayout frameLayout, MaterialCardView materialCardView2, FrameLayout frameLayout2, TextView textView, TextView textView2, ImageView imageView, TextView textView3, MaterialButton materialButton, LinearLayout linearLayout, MaterialCardView materialCardView3, TextView textView4, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, AbstractC12028tb abstractC12028tb, AbstractC12069vb abstractC12069vb) {
        super(obj, view, i);
        this.f30521x = abstractC11691b6;
        this.f30522y = materialCardView;
        this.f30523z = frameLayout;
        this.f30510A = materialCardView2;
        this.f30511B = textView2;
        this.f30512C = imageView;
        this.f30513D = materialButton;
        this.f30514E = materialCardView3;
        this.f30515F = textView4;
        this.f30516G = imageView7;
        this.f30517H = abstractC12028tb;
        this.f30518I = abstractC12069vb;
    }

    /* renamed from: Q */
    public abstract void mo4166Q(Integer num);
}
