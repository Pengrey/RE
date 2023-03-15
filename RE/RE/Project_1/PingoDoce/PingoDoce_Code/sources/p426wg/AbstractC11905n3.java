package p426wg;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.button.MaterialButton;
import ml.C7517n;

/* renamed from: wg.n3 */
/* loaded from: classes2.dex */
public abstract class AbstractC11905n3 extends ViewDataBinding {

    /* renamed from: A */
    protected Float f31020A;

    /* renamed from: B */
    protected C7517n f31021B;

    /* renamed from: x */
    public final Guideline f31022x;

    /* renamed from: y */
    public final MaterialButton f31023y;

    /* renamed from: z */
    public final PlaceHolderRecyclerView f31024z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11905n3(Object obj, View view, int i, Guideline guideline, MaterialButton materialButton, PlaceHolderRecyclerView placeHolderRecyclerView) {
        super(obj, view, i);
        this.f31022x = guideline;
        this.f31023y = materialButton;
        this.f31024z = placeHolderRecyclerView;
    }

    /* renamed from: Q */
    public abstract void mo3947Q(Float f);
}
