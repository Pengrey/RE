package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: wg.d6 */
/* loaded from: classes2.dex */
public abstract class AbstractC11726d6 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30088A;

    /* renamed from: B */
    public final TextView f30089B;

    /* renamed from: C */
    public final TextView f30090C;

    /* renamed from: D */
    protected Store f30091D;

    /* renamed from: E */
    protected Integer f30092E;

    /* renamed from: F */
    protected String f30093F;

    /* renamed from: x */
    public final MaterialButton f30094x;

    /* renamed from: y */
    public final TextView f30095y;

    /* renamed from: z */
    public final TextView f30096z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11726d6(Object obj, View view, int i, MaterialButton materialButton, ImageView imageView, View view2, TextView textView, ImageView imageView2, TextView textView2, ImageView imageView3, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.f30094x = materialButton;
        this.f30095y = textView;
        this.f30096z = textView2;
        this.f30088A = textView3;
        this.f30089B = textView4;
        this.f30090C = textView5;
    }

    /* renamed from: Q */
    public abstract void mo4371Q(String str);

    /* renamed from: R */
    public abstract void mo4370R(Store store);

    /* renamed from: S */
    public abstract void mo4369S(Integer num);
}
