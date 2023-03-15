package p426wg;

import android.animation.TimeInterpolator;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import p241mi.BottomNavigationViewModel;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel;

/* renamed from: wg.z3 */
/* loaded from: classes2.dex */
public abstract class AbstractC12130z3 extends ViewDataBinding {

    /* renamed from: A */
    public final Group f32021A;

    /* renamed from: B */
    public final TextView f32022B;

    /* renamed from: C */
    public final ConstraintLayout f32023C;

    /* renamed from: D */
    public final AbstractC11917nf f32024D;

    /* renamed from: E */
    public final TextView f32025E;

    /* renamed from: F */
    public final TextView f32026F;

    /* renamed from: G */
    public final TextView f32027G;

    /* renamed from: H */
    protected TimeInterpolator f32028H;

    /* renamed from: I */
    protected TakeAwayLandingViewModel f32029I;

    /* renamed from: J */
    protected BottomNavigationViewModel f32030J;

    /* renamed from: x */
    public final Guideline f32031x;

    /* renamed from: y */
    public final AbstractC11761f7 f32032y;

    /* renamed from: z */
    public final AbstractC11835j9 f32033z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12130z3(Object obj, View view, int i, Guideline guideline, AbstractC11761f7 abstractC11761f7, AbstractC11835j9 abstractC11835j9, Group group, Guideline guideline2, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout, TextView textView4, AbstractC11917nf abstractC11917nf, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.f32031x = guideline;
        this.f32032y = abstractC11761f7;
        this.f32033z = abstractC11835j9;
        this.f32021A = group;
        this.f32022B = textView;
        this.f32023C = constraintLayout;
        this.f32024D = abstractC11917nf;
        this.f32025E = textView5;
        this.f32026F = textView6;
        this.f32027G = textView7;
    }

    /* renamed from: Q */
    public abstract void mo3576Q(TimeInterpolator timeInterpolator);

    /* renamed from: R */
    public abstract void mo3575R(BottomNavigationViewModel bottomNavigationViewModel);
}
