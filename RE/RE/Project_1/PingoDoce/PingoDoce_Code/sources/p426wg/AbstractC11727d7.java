package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.d7 */
/* loaded from: classes2.dex */
public abstract class AbstractC11727d7 extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialButton f30097x;

    /* renamed from: y */
    public final ConstraintLayout f30098y;

    /* renamed from: z */
    public final MaterialButton f30099z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11727d7(Object obj, View view, int i, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout, MaterialButton materialButton2) {
        super(obj, view, i);
        this.f30097x = materialButton;
        this.f30098y = constraintLayout;
        this.f30099z = materialButton2;
    }

    /* renamed from: Q */
    public static AbstractC11727d7 m4408Q(LayoutInflater layoutInflater) {
        return m4407R(layoutInflater, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11727d7 m4407R(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC11727d7) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_app_rating_dialog, null, false, obj);
    }
}
