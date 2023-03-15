package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import fj.FiltersViewModel;

/* renamed from: wg.t5 */
/* loaded from: classes2.dex */
public abstract class AbstractC12022t5 extends ViewDataBinding {

    /* renamed from: A */
    public final ConstraintLayout f31519A;

    /* renamed from: B */
    public final RadioGroup f31520B;

    /* renamed from: C */
    public final RecyclerView f31521C;

    /* renamed from: D */
    public final SwitchCompat f31522D;

    /* renamed from: E */
    public final AbstractC12100x8 f31523E;

    /* renamed from: F */
    public final Toolbar f31524F;

    /* renamed from: G */
    protected FiltersViewModel f31525G;

    /* renamed from: x */
    public final ConstraintLayout f31526x;

    /* renamed from: y */
    public final MaterialButton f31527y;

    /* renamed from: z */
    public final MaterialButton f31528z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12022t5(Object obj, View view, int i, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout2, TextView textView, View view2, TextView textView2, TextView textView3, RadioGroup radioGroup, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, SwitchCompat switchCompat, AbstractC12100x8 abstractC12100x8, Toolbar toolbar) {
        super(obj, view, i);
        this.f31526x = constraintLayout;
        this.f31527y = materialButton;
        this.f31528z = materialButton2;
        this.f31519A = constraintLayout2;
        this.f31520B = radioGroup;
        this.f31521C = recyclerView;
        this.f31522D = switchCompat;
        this.f31523E = abstractC12100x8;
        this.f31524F = toolbar;
    }

    /* renamed from: Q */
    public static AbstractC12022t5 m3771Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3770R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12022t5 m3770R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12022t5) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.bottomsheet_for_filters, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3726S(FiltersViewModel filtersViewModel);
}
