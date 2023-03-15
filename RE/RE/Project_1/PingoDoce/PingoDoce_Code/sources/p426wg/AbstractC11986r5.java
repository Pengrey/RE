package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.r5 */
/* loaded from: classes2.dex */
public abstract class AbstractC11986r5 extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f31369x;

    /* renamed from: y */
    public final MaterialButton f31370y;

    /* renamed from: z */
    public final TextView f31371z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11986r5(Object obj, View view, int i, View view2, TextView textView, MaterialButton materialButton, TextView textView2) {
        super(obj, view, i);
        this.f31369x = textView;
        this.f31370y = materialButton;
        this.f31371z = textView2;
    }

    /* renamed from: Q */
    public static AbstractC11986r5 m3829Q(LayoutInflater layoutInflater) {
        return m3828R(layoutInflater, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11986r5 m3828R(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC11986r5) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.bottomsheet_for_disclaimer, null, false, obj);
    }
}
