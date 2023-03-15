package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.local.models.stores.StoreSchedule;

/* renamed from: wg.xd */
/* loaded from: classes2.dex */
public abstract class AbstractC12105xd extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f31901x;

    /* renamed from: y */
    public final TextView f31902y;

    /* renamed from: z */
    protected StoreSchedule f31903z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12105xd(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f31901x = textView;
        this.f31902y = textView2;
    }

    /* renamed from: Q */
    public static AbstractC12105xd m3653Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3652R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12105xd m3652R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12105xd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_schedule_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3597S(StoreSchedule storeSchedule);
}
