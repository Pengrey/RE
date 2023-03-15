package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wg.b8 */
/* loaded from: classes2.dex */
public abstract class AbstractC11693b8 extends ViewDataBinding {

    /* renamed from: A */
    protected Boolean f29944A;

    /* renamed from: B */
    protected String f29945B;

    /* renamed from: C */
    protected Boolean f29946C;

    /* renamed from: x */
    public final TextInputLayout f29947x;

    /* renamed from: y */
    public final TextInputEditText f29948y;

    /* renamed from: z */
    protected String f29949z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11693b8(Object obj, View view, int i, TextView textView, TextInputLayout textInputLayout, TextInputEditText textInputEditText) {
        super(obj, view, i);
        this.f29947x = textInputLayout;
        this.f29948y = textInputEditText;
    }

    /* renamed from: Q */
    public String m4463Q() {
        return this.f29949z;
    }

    /* renamed from: R */
    public abstract void mo4430R(String str);

    /* renamed from: S */
    public abstract void mo4429S(String str);

    /* renamed from: T */
    public abstract void mo4428T(Boolean bool);

    /* renamed from: U */
    public abstract void mo4427U(Boolean bool);
}
