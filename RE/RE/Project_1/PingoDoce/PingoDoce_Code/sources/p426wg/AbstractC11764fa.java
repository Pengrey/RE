package p426wg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;

/* renamed from: wg.fa */
/* loaded from: classes2.dex */
public abstract class AbstractC11764fa extends ViewDataBinding {

    /* renamed from: A */
    protected Integer f30327A;

    /* renamed from: B */
    protected String f30328B;

    /* renamed from: C */
    protected boolean f30329C;

    /* renamed from: x */
    public final MaterialCardView f30330x;

    /* renamed from: y */
    public final QuantityPickerView f30331y;

    /* renamed from: z */
    public final TextView f30332z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11764fa(Object obj, View view, int i, FrameLayout frameLayout, MaterialCardView materialCardView, QuantityPickerView quantityPickerView, TextView textView) {
        super(obj, view, i);
        this.f30330x = materialCardView;
        this.f30331y = quantityPickerView;
        this.f30332z = textView;
    }

    /* renamed from: Q */
    public abstract void mo4249Q(String str);

    /* renamed from: R */
    public abstract void mo4248R(Integer num);

    /* renamed from: S */
    public abstract void mo4247S(boolean z);
}
