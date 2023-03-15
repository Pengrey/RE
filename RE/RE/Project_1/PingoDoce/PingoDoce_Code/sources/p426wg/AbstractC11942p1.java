package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel;

/* renamed from: wg.p1 */
/* loaded from: classes2.dex */
public abstract class AbstractC11942p1 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31181A;

    /* renamed from: B */
    public final AbstractC11996rf f31182B;

    /* renamed from: C */
    public final LinearProgressIndicator f31183C;

    /* renamed from: D */
    public final MaterialButton f31184D;

    /* renamed from: E */
    public final MaterialButton f31185E;

    /* renamed from: F */
    protected WineClubViewModel f31186F;

    /* renamed from: G */
    protected Boolean f31187G;

    /* renamed from: x */
    public final AbstractC11872l9 f31188x;

    /* renamed from: y */
    public final AbstractC11950p9 f31189y;

    /* renamed from: z */
    public final AbstractC11990r9 f31190z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11942p1(Object obj, View view, int i, AbstractC11872l9 abstractC11872l9, AbstractC11950p9 abstractC11950p9, AbstractC11990r9 abstractC11990r9, TextView textView, AbstractC11996rf abstractC11996rf, LinearProgressIndicator linearProgressIndicator, MaterialButton materialButton, MaterialButton materialButton2) {
        super(obj, view, i);
        this.f31188x = abstractC11872l9;
        this.f31189y = abstractC11950p9;
        this.f31190z = abstractC11990r9;
        this.f31181A = textView;
        this.f31182B = abstractC11996rf;
        this.f31183C = linearProgressIndicator;
        this.f31184D = materialButton;
        this.f31185E = materialButton2;
    }
}
