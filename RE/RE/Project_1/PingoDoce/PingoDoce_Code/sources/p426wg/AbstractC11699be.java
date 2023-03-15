package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import java.util.List;
import kg.FriendImage;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* renamed from: wg.be */
/* loaded from: classes2.dex */
public abstract class AbstractC11699be extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f29963A;

    /* renamed from: B */
    protected ShoppingList f29964B;

    /* renamed from: C */
    protected List<FriendImage> f29965C;

    /* renamed from: D */
    protected Integer f29966D;

    /* renamed from: x */
    public final AbstractC12140zd f29967x;

    /* renamed from: y */
    public final TextView f29968y;

    /* renamed from: z */
    public final SwitchMaterial f29969z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11699be(Object obj, View view, int i, AbstractC12140zd abstractC12140zd, TextView textView, SwitchMaterial switchMaterial, TextView textView2) {
        super(obj, view, i);
        this.f29967x = abstractC12140zd;
        this.f29968y = textView;
        this.f29969z = switchMaterial;
        this.f29963A = textView2;
    }

    /* renamed from: Q */
    public static AbstractC11699be m4456Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4455R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11699be m4455R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11699be) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_shopping_list, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4416S(Integer num);

    /* renamed from: T */
    public abstract void mo4415T(List<FriendImage> list);

    /* renamed from: U */
    public abstract void mo4414U(ShoppingList shoppingList);
}
