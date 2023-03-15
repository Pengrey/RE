package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.rd */
/* loaded from: classes2.dex */
public abstract class AbstractC11994rd extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f31392x;

    /* renamed from: y */
    protected String f31393y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11994rd(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.f31392x = textView;
    }

    /* renamed from: Q */
    public static AbstractC11994rd m3825Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3824R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11994rd m3824R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11994rd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_purchase_list_month, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3776S(String str);
}
