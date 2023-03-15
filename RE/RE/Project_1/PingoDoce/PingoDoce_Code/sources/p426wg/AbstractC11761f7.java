package p426wg;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import p241mi.BottomNavigationViewModel;

/* renamed from: wg.f7 */
/* loaded from: classes2.dex */
public abstract class AbstractC11761f7 extends ViewDataBinding {

    /* renamed from: x */
    public final BottomNavigationView f30312x;

    /* renamed from: y */
    protected boolean f30313y;

    /* renamed from: z */
    protected BottomNavigationViewModel f30314z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11761f7(Object obj, View view, int i, BottomNavigationView bottomNavigationView) {
        super(obj, view, i);
        this.f30312x = bottomNavigationView;
    }

    /* renamed from: Q */
    public abstract void mo4259Q(BottomNavigationViewModel bottomNavigationViewModel);

    /* renamed from: R */
    public abstract void mo4258R(boolean z);
}
