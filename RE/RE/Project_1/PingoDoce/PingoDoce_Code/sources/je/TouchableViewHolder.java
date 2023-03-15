package je;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import ie.BindableViewHolder;
import p181jd.Intrinsics;

/* renamed from: je.b */
/* loaded from: classes2.dex */
public abstract class TouchableViewHolder<ViewBinding extends ViewDataBinding> extends BindableViewHolder {

    /* renamed from: u */
    private boolean f17540u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchableViewHolder(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
        Intrinsics.isThisObjectNull(viewDataBinding, "binding");
        this.f17540u = true;
    }

    /* renamed from: O */
    public abstract View m20894O();

    /* renamed from: P */
    public abstract View m20893P();

    /* renamed from: Q */
    public final boolean m20892Q() {
        return this.f17540u;
    }

    /* renamed from: R */
    public final void m20891R(boolean z) {
        this.f17540u = z;
    }
}
