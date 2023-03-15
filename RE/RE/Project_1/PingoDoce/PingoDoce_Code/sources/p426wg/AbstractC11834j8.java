package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.Flyer;

/* renamed from: wg.j8 */
/* loaded from: classes2.dex */
public abstract class AbstractC11834j8 extends ViewDataBinding {

    /* renamed from: A */
    protected Flyer f30679A;

    /* renamed from: x */
    public final ImageView f30680x;

    /* renamed from: y */
    public final TextView f30681y;

    /* renamed from: z */
    public final TextView f30682z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11834j8(Object obj, View view, int i, ImageView imageView, MaterialCardView materialCardView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f30680x = imageView;
        this.f30681y = textView;
        this.f30682z = textView2;
    }

    /* renamed from: Q */
    public static AbstractC11834j8 m4143Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4142R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11834j8 m4142R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11834j8) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_for_flyer, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4084S(Flyer flyer);
}
