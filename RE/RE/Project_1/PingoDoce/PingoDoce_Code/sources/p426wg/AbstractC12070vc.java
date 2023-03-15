package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.vc */
/* loaded from: classes2.dex */
public abstract class AbstractC12070vc extends ViewDataBinding {

    /* renamed from: x */
    protected String f31738x;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12070vc(Object obj, View view, int i) {
        super(obj, view, i);
    }

    /* renamed from: Q */
    public static AbstractC12070vc m3699Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3698R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12070vc m3698R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12070vc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_list_header, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3661S(String str);
}
