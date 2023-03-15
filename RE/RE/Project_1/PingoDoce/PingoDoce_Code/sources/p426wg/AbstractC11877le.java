package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;

/* renamed from: wg.le */
/* loaded from: classes2.dex */
public abstract class AbstractC11877le extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialCardView f30888x;

    /* renamed from: y */
    protected TakeAwayCategory f30889y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11877le(Object obj, View view, int i, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.f30888x = materialCardView;
    }

    /* renamed from: Q */
    public static AbstractC11877le m4043Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4042R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11877le m4042R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11877le) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_take_away_category, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3993S(TakeAwayCategory takeAwayCategory);
}
