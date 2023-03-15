package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import p164ii.BabyClubViewModel;

/* renamed from: wg.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC11903n1 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31003A;

    /* renamed from: B */
    public final AbstractC11996rf f31004B;

    /* renamed from: C */
    public final LinearProgressIndicator f31005C;

    /* renamed from: D */
    public final MaterialButton f31006D;

    /* renamed from: E */
    protected BabyClubViewModel f31007E;

    /* renamed from: F */
    protected Boolean f31008F;

    /* renamed from: x */
    public final AbstractC11693b8 f31009x;

    /* renamed from: y */
    public final AbstractC12065v7 f31010y;

    /* renamed from: z */
    public final AbstractC12099x7 f31011z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11903n1(Object obj, View view, int i, AbstractC11693b8 abstractC11693b8, AbstractC12065v7 abstractC12065v7, AbstractC12099x7 abstractC12099x7, TextView textView, AbstractC11996rf abstractC11996rf, LinearProgressIndicator linearProgressIndicator, MaterialButton materialButton) {
        super(obj, view, i);
        this.f31009x = abstractC11693b8;
        this.f31010y = abstractC12065v7;
        this.f31011z = abstractC12099x7;
        this.f31003A = textView;
        this.f31004B = abstractC11996rf;
        this.f31005C = linearProgressIndicator;
        this.f31006D = materialButton;
    }
}
