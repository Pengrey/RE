package p426wg;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.tb */
/* loaded from: classes2.dex */
public abstract class AbstractC12028tb extends ViewDataBinding {

    /* renamed from: A */
    public final LinearLayout f31538A;

    /* renamed from: B */
    public final LinearLayout f31539B;

    /* renamed from: C */
    public final TextView f31540C;

    /* renamed from: D */
    public final TextView f31541D;

    /* renamed from: E */
    protected Boolean f31542E;

    /* renamed from: F */
    protected Drawable f31543F;

    /* renamed from: G */
    protected String f31544G;

    /* renamed from: H */
    protected Boolean f31545H;

    /* renamed from: I */
    protected Boolean f31546I;

    /* renamed from: x */
    public final ImageView f31547x;

    /* renamed from: y */
    public final ImageView f31548y;

    /* renamed from: z */
    public final MaterialCardView f31549z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12028tb(Object obj, View view, int i, ImageView imageView, ImageView imageView2, MaterialCardView materialCardView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f31547x = imageView;
        this.f31548y = imageView2;
        this.f31549z = materialCardView;
        this.f31538A = linearLayout;
        this.f31539B = linearLayout2;
        this.f31540C = textView;
        this.f31541D = textView2;
    }

    /* renamed from: Q */
    public abstract void mo3713Q(Drawable drawable);

    /* renamed from: R */
    public abstract void mo3712R(String str);

    /* renamed from: S */
    public abstract void mo3711S(Boolean bool);

    /* renamed from: T */
    public abstract void mo3710T(Boolean bool);
}
