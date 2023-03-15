package p426wg;

import ae.InterfaceC0131a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import p163ih.PurchasesRecentViewModel;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: wg.t6 */
/* loaded from: classes2.dex */
public abstract class AbstractC12023t6 extends ViewDataBinding {

    /* renamed from: A */
    protected InterfaceC0131a<Purchase> f31529A;

    /* renamed from: x */
    public final FrameLayout f31530x;

    /* renamed from: y */
    public final MaterialButton f31531y;

    /* renamed from: z */
    protected PurchasesRecentViewModel f31532z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12023t6(Object obj, View view, int i, FrameLayout frameLayout, MaterialButton materialButton) {
        super(obj, view, i);
        this.f31530x = frameLayout;
        this.f31531y = materialButton;
    }

    /* renamed from: Q */
    public abstract void mo3722Q(InterfaceC0131a<Purchase> interfaceC0131a);
}
