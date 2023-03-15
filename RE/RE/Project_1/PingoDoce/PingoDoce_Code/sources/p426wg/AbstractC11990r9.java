package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wg.r9 */
/* loaded from: classes2.dex */
public abstract class AbstractC11990r9 extends ViewDataBinding {

    /* renamed from: A */
    protected boolean f31384A;

    /* renamed from: B */
    protected Boolean f31385B;

    /* renamed from: C */
    protected String f31386C;

    /* renamed from: x */
    public final TextView f31387x;

    /* renamed from: y */
    public final TextInputLayout f31388y;

    /* renamed from: z */
    public final PlaceHolderRecyclerView f31389z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11990r9(Object obj, View view, int i, TextView textView, TextView textView2, TextInputLayout textInputLayout, PlaceHolderRecyclerView placeHolderRecyclerView) {
        super(obj, view, i);
        this.f31387x = textView;
        this.f31388y = textInputLayout;
        this.f31389z = placeHolderRecyclerView;
    }

    /* renamed from: Q */
    public abstract void mo3780Q(String str);

    /* renamed from: R */
    public abstract void mo3779R(Boolean bool);

    /* renamed from: S */
    public abstract void mo3778S(boolean z);
}
