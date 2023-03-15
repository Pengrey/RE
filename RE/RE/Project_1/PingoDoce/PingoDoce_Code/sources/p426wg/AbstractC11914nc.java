package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.remote.models.response.Flyer;

/* renamed from: wg.nc */
/* loaded from: classes2.dex */
public abstract class AbstractC11914nc extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialCardView f31059x;

    /* renamed from: y */
    protected Flyer f31060y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11914nc(Object obj, View view, int i, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.f31059x = materialCardView;
    }

    /* renamed from: Q */
    public static AbstractC11914nc m3975Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3974R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11914nc m3974R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11914nc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_flyer_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3919S(Flyer flyer);
}
