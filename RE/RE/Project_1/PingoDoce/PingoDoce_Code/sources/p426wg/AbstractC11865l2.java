package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.google.android.material.button.MaterialButton;
import p014aj.AbstractC0188n;

/* renamed from: wg.l2 */
/* loaded from: classes2.dex */
public abstract class AbstractC11865l2 extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f30834A;

    /* renamed from: B */
    public final TextView f30835B;

    /* renamed from: C */
    public final TextView f30836C;

    /* renamed from: D */
    public final AbstractC11996rf f30837D;

    /* renamed from: E */
    protected AbstractC0188n f30838E;

    /* renamed from: x */
    public final PinEntryEditText f30839x;

    /* renamed from: y */
    public final TextView f30840y;

    /* renamed from: z */
    public final ImageView f30841z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11865l2(Object obj, View view, int i, PinEntryEditText pinEntryEditText, TextView textView, ImageView imageView, MaterialButton materialButton, TextView textView2, TextView textView3, AbstractC11996rf abstractC11996rf) {
        super(obj, view, i);
        this.f30839x = pinEntryEditText;
        this.f30840y = textView;
        this.f30841z = imageView;
        this.f30834A = materialButton;
        this.f30835B = textView2;
        this.f30836C = textView3;
        this.f30837D = abstractC11996rf;
    }
}
