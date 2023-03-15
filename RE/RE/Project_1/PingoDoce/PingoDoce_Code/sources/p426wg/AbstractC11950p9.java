package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wg.p9 */
/* loaded from: classes2.dex */
public abstract class AbstractC11950p9 extends ViewDataBinding {

    /* renamed from: A */
    protected Boolean f31214A;

    /* renamed from: B */
    protected String f31215B;

    /* renamed from: x */
    public final TextInputLayout f31216x;

    /* renamed from: y */
    public final PlaceHolderRecyclerView f31217y;

    /* renamed from: z */
    protected boolean f31218z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11950p9(Object obj, View view, int i, TextView textView, TextInputLayout textInputLayout, PlaceHolderRecyclerView placeHolderRecyclerView) {
        super(obj, view, i);
        this.f31216x = textInputLayout;
        this.f31217y = placeHolderRecyclerView;
    }

    /* renamed from: Q */
    public abstract void mo3844Q(String str);

    /* renamed from: R */
    public abstract void mo3843R(Boolean bool);

    /* renamed from: S */
    public abstract void mo3842S(boolean z);
}
