package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wg.l9 */
/* loaded from: classes2.dex */
public abstract class AbstractC11872l9 extends ViewDataBinding {

    /* renamed from: A */
    protected String f30876A;

    /* renamed from: B */
    protected Boolean f30877B;

    /* renamed from: C */
    protected String f30878C;

    /* renamed from: x */
    public final TextView f30879x;

    /* renamed from: y */
    public final TextInputLayout f30880y;

    /* renamed from: z */
    protected boolean f30881z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11872l9(Object obj, View view, int i, TextView textView, View view2, TextView textView2, TextView textView3, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.f30879x = textView;
        this.f30880y = textInputLayout;
    }

    /* renamed from: Q */
    public String m4050Q() {
        return this.f30876A;
    }

    /* renamed from: R */
    public abstract void mo4001R(String str);

    /* renamed from: S */
    public abstract void mo4000S(String str);

    /* renamed from: T */
    public abstract void mo3999T(Boolean bool);

    /* renamed from: U */
    public abstract void mo3998U(boolean z);
}
