package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import java.util.List;
import kg.FriendImage;

/* renamed from: wg.zd */
/* loaded from: classes2.dex */
public abstract class AbstractC12140zd extends ViewDataBinding {

    /* renamed from: A */
    protected String f32062A;

    /* renamed from: B */
    protected boolean f32063B;

    /* renamed from: x */
    protected List<FriendImage> f32064x;

    /* renamed from: y */
    protected Integer f32065y;

    /* renamed from: z */
    protected boolean f32066z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12140zd(Object obj, View view, int i) {
        super(obj, view, i);
    }

    /* renamed from: Q */
    public static AbstractC12140zd m3566Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3565R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12140zd m3565R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12140zd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_shared_with, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3564S(Integer num);

    /* renamed from: T */
    public abstract void mo3563T(List<FriendImage> list);

    /* renamed from: U */
    public abstract void mo3562U(String str);

    /* renamed from: V */
    public abstract void mo3561V(boolean z);

    /* renamed from: W */
    public abstract void mo3560W(boolean z);
}
