package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wg.v7 */
/* loaded from: classes2.dex */
public abstract class AbstractC12065v7 extends ViewDataBinding {

    /* renamed from: A */
    protected String f31724A;

    /* renamed from: B */
    protected Boolean f31725B;

    /* renamed from: C */
    protected String f31726C;

    /* renamed from: x */
    public final TextView f31727x;

    /* renamed from: y */
    public final TextInputLayout f31728y;

    /* renamed from: z */
    protected boolean f31729z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12065v7(Object obj, View view, int i, TextView textView, View view2, TextView textView2, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.f31727x = textView;
        this.f31728y = textInputLayout;
    }

    /* renamed from: Q */
    public String m3700Q() {
        return this.f31724A;
    }

    /* renamed from: R */
    public abstract void mo3669R(String str);

    /* renamed from: S */
    public abstract void mo3668S(String str);

    /* renamed from: T */
    public abstract void mo3667T(Boolean bool);

    /* renamed from: U */
    public abstract void mo3666U(boolean z);
}
