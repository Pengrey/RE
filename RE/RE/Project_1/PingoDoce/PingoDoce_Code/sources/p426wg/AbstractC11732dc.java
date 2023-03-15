package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: wg.dc */
/* loaded from: classes2.dex */
public abstract class AbstractC11732dc extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialCardView f30115A;

    /* renamed from: B */
    public final TextView f30116B;

    /* renamed from: C */
    protected Banner f30117C;

    /* renamed from: x */
    public final TextView f30118x;

    /* renamed from: y */
    public final ImageButton f30119y;

    /* renamed from: z */
    public final ImageView f30120z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11732dc(Object obj, View view, int i, TextView textView, ImageButton imageButton, ImageView imageView, MaterialCardView materialCardView, TextView textView2) {
        super(obj, view, i);
        this.f30118x = textView;
        this.f30119y = imageButton;
        this.f30120z = imageView;
        this.f30115A = materialCardView;
        this.f30116B = textView2;
    }

    /* renamed from: Q */
    public static AbstractC11732dc m4404Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4403R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11732dc m4403R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11732dc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_banner_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4359S(Banner banner);
}
