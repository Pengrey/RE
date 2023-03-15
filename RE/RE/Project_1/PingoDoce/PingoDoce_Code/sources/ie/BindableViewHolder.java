package ie;

import android.content.Context;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p181jd.Intrinsics;

/* renamed from: ie.b */
/* loaded from: classes2.dex */
public abstract class BindableViewHolder<ViewBinding extends ViewDataBinding> extends RecyclerView.AbstractC1531c0 {

    /* renamed from: t */
    private final ViewDataBinding f16801t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindableViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding.m37802s());
        Intrinsics.isThisObjectNull(viewDataBinding, "binding");
        this.f16801t = viewDataBinding;
    }

    /* renamed from: M */
    public final ViewDataBinding m22151M() {
        return this.f16801t;
    }

    /* renamed from: N */
    public final Context m22150N() {
        Context context = this.f16801t.m37802s().getContext();
        Intrinsics.checkIfNull(context, "binding.root.context");
        return context;
    }
}
