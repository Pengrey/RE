package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.p5 */
/* loaded from: classes2.dex */
public abstract class AbstractC11946p5 extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialButton f31206x;

    /* renamed from: y */
    public final MaterialButton f31207y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11946p5(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.f31206x = materialButton;
        this.f31207y = materialButton2;
    }

    /* renamed from: Q */
    public static AbstractC11946p5 m3904Q(LayoutInflater layoutInflater) {
        return m3903R(layoutInflater, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11946p5 m3903R(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC11946p5) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.bottomsheet_for_checkout, null, false, obj);
    }
}
