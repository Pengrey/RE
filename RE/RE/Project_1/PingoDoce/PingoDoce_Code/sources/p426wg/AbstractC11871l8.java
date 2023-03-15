package p426wg;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.l8 */
/* loaded from: classes2.dex */
public abstract class AbstractC11871l8 extends ViewDataBinding {

    /* renamed from: A */
    protected View.OnClickListener f30869A;

    /* renamed from: B */
    protected boolean f30870B;

    /* renamed from: C */
    protected Drawable f30871C;

    /* renamed from: D */
    protected boolean f30872D;

    /* renamed from: x */
    public final TextView f30873x;

    /* renamed from: y */
    public final MaterialButton f30874y;

    /* renamed from: z */
    public final MaterialButton f30875z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11871l8(Object obj, View view, int i, TextView textView, MaterialButton materialButton, MaterialButton materialButton2) {
        super(obj, view, i);
        this.f30873x = textView;
        this.f30874y = materialButton;
        this.f30875z = materialButton2;
    }

    /* renamed from: Q */
    public abstract void mo4005Q(boolean z);

    /* renamed from: R */
    public abstract void mo4004R(Drawable drawable);

    /* renamed from: S */
    public abstract void mo4003S(View.OnClickListener onClickListener);

    /* renamed from: T */
    public abstract void mo4002T(boolean z);
}
