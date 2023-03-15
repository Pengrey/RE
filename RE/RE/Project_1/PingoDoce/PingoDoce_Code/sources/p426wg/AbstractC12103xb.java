package p426wg;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import gi.BenefitViewState;

/* renamed from: wg.xb */
/* loaded from: classes2.dex */
public abstract class AbstractC12103xb extends ViewDataBinding {

    /* renamed from: A */
    public final AppCompatTextView f31885A;

    /* renamed from: B */
    public final AppCompatTextView f31886B;

    /* renamed from: C */
    public final View f31887C;

    /* renamed from: D */
    public final View f31888D;

    /* renamed from: E */
    protected BenefitViewState f31889E;

    /* renamed from: x */
    public final AppCompatImageView f31890x;

    /* renamed from: y */
    public final AppCompatImageView f31891y;

    /* renamed from: z */
    public final AppCompatImageView f31892z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12103xb(Object obj, View view, int i, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, Space space, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view2, View view3) {
        super(obj, view, i);
        this.f31890x = appCompatImageView;
        this.f31891y = appCompatImageView2;
        this.f31892z = appCompatImageView3;
        this.f31885A = appCompatTextView;
        this.f31886B = appCompatTextView2;
        this.f31887C = view2;
        this.f31888D = view3;
    }

    /* renamed from: Q */
    public abstract void mo3599Q(BenefitViewState benefitViewState);
}
