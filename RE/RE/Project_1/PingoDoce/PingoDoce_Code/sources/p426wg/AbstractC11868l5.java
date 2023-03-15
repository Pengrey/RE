package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import fi.BenefitsDetailsViewModel;
import pt.pingodoce.app.data.remote.models.response.Benefit;

/* renamed from: wg.l5 */
/* loaded from: classes2.dex */
public abstract class AbstractC11868l5 extends ViewDataBinding {

    /* renamed from: A */
    public final AbstractC11917nf f30850A;

    /* renamed from: B */
    public final AppCompatTextView f30851B;

    /* renamed from: C */
    public final AppCompatTextView f30852C;

    /* renamed from: D */
    public final AppCompatTextView f30853D;

    /* renamed from: E */
    public final AppCompatTextView f30854E;

    /* renamed from: F */
    public final AppCompatTextView f30855F;

    /* renamed from: G */
    public final AppCompatTextView f30856G;

    /* renamed from: H */
    protected Benefit f30857H;

    /* renamed from: I */
    protected BenefitsDetailsViewModel f30858I;

    /* renamed from: x */
    public final ExtendedFloatingActionButton f30859x;

    /* renamed from: y */
    public final ImageView f30860y;

    /* renamed from: z */
    public final AppCompatImageView f30861z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11868l5(Object obj, View view, int i, ExtendedFloatingActionButton extendedFloatingActionButton, MaterialCardView materialCardView, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AbstractC11917nf abstractC11917nf, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6) {
        super(obj, view, i);
        this.f30859x = extendedFloatingActionButton;
        this.f30860y = imageView;
        this.f30861z = appCompatImageView;
        this.f30850A = abstractC11917nf;
        this.f30851B = appCompatTextView;
        this.f30852C = appCompatTextView2;
        this.f30853D = appCompatTextView3;
        this.f30854E = appCompatTextView4;
        this.f30855F = appCompatTextView5;
        this.f30856G = appCompatTextView6;
    }

    /* renamed from: Q */
    public static AbstractC11868l5 m4052Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4051R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11868l5 m4051R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11868l5) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.bottomsheet_for_benefits_details, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4013S(Benefit benefit);

    /* renamed from: T */
    public abstract void mo4012T(BenefitsDetailsViewModel benefitsDetailsViewModel);
}
