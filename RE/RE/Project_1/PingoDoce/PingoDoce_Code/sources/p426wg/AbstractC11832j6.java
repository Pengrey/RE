package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: wg.j6 */
/* loaded from: classes2.dex */
public abstract class AbstractC11832j6 extends ViewDataBinding {

    /* renamed from: A */
    public final ConstraintLayout f30669A;

    /* renamed from: B */
    public final TextView f30670B;

    /* renamed from: C */
    public final FloatingActionButton f30671C;

    /* renamed from: D */
    public final LottieAnimationView f30672D;

    /* renamed from: E */
    public final TextView f30673E;

    /* renamed from: x */
    public final MaterialButton f30674x;

    /* renamed from: y */
    public final TextView f30675y;

    /* renamed from: z */
    public final MaterialButton f30676z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11832j6(Object obj, View view, int i, MaterialButton materialButton, TextView textView, TextView textView2, MaterialButton materialButton2, ConstraintLayout constraintLayout, TextView textView3, FloatingActionButton floatingActionButton, LottieAnimationView lottieAnimationView, TextView textView4) {
        super(obj, view, i);
        this.f30674x = materialButton;
        this.f30675y = textView2;
        this.f30676z = materialButton2;
        this.f30669A = constraintLayout;
        this.f30670B = textView3;
        this.f30671C = floatingActionButton;
        this.f30672D = lottieAnimationView;
        this.f30673E = textView4;
    }

    /* renamed from: Q */
    public static AbstractC11832j6 m4145Q(LayoutInflater layoutInflater) {
        return m4144R(layoutInflater, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11832j6 m4144R(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC11832j6) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.bottomsheet_for_voice_record, null, false, obj);
    }
}
