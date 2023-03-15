package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.local.models.clubs.ClubBaby;

/* renamed from: wg.bc */
/* loaded from: classes2.dex */
public abstract class AbstractC11697bc extends ViewDataBinding {

    /* renamed from: x */
    public final ConstraintLayout f29955x;

    /* renamed from: y */
    public final ConstraintLayout f29956y;

    /* renamed from: z */
    protected ClubBaby f29957z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11697bc(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, View view2, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        super(obj, view, i);
        this.f29955x = constraintLayout;
        this.f29956y = constraintLayout3;
    }

    /* renamed from: Q */
    public static AbstractC11697bc m4460Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4459R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11697bc m4459R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11697bc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_baby_club_list, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4418S(ClubBaby clubBaby);
}
