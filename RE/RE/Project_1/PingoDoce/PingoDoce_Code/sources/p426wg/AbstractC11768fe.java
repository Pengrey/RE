package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.fe */
/* loaded from: classes2.dex */
public abstract class AbstractC11768fe extends ViewDataBinding {

    /* renamed from: x */
    protected String f30343x;

    /* renamed from: y */
    protected Integer f30344y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11768fe(Object obj, View view, int i) {
        super(obj, view, i);
    }

    /* renamed from: Q */
    public static AbstractC11768fe m4304Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4303R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11768fe m4303R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11768fe) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_shopping_list_item_category, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4239S(Integer num);

    /* renamed from: T */
    public abstract void mo4238T(String str);
}
