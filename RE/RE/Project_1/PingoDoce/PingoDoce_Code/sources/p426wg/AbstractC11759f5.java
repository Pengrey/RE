package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.f5 */
/* loaded from: classes2.dex */
public abstract class AbstractC11759f5 extends ViewDataBinding {

    /* renamed from: A */
    protected String f30300A;

    /* renamed from: B */
    protected String f30301B;

    /* renamed from: x */
    public final ImageView f30302x;

    /* renamed from: y */
    public final TextView f30303y;

    /* renamed from: z */
    protected String f30304z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11759f5(Object obj, View view, int i, ImageView imageView, View view2, TextView textView) {
        super(obj, view, i);
        this.f30302x = imageView;
        this.f30303y = textView;
    }

    /* renamed from: Q */
    public static AbstractC11759f5 m4310Q(LayoutInflater layoutInflater) {
        return m4309R(layoutInflater, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11759f5 m4309R(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC11759f5) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.bottomsheet_for_badge_disclaimer, null, false, obj);
    }

    /* renamed from: S */
    public abstract void mo4269S(String str);

    /* renamed from: T */
    public abstract void mo4268T(String str);

    /* renamed from: U */
    public abstract void mo4267U(String str);
}
