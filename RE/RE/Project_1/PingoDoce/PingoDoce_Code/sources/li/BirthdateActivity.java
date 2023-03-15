package li;

import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import li.BirthdateViewModel;
import p047ce.FluidContentResizer;
import p181jd.Intrinsics;
import p426wg.AbstractC11879m;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: li.a */
/* loaded from: classes2.dex */
public abstract class BirthdateActivity<ViewModel extends BirthdateViewModel<F>, F extends FlowData> extends FlowActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public void m19419n1(AbstractC11879m abstractC11879m, BirthdateViewModel birthdateViewModel) {
        Intrinsics.isThisObjectNull(abstractC11879m, "binding");
        Intrinsics.isThisObjectNull(birthdateViewModel, "viewModel");
        super.m34589n1(abstractC11879m, birthdateViewModel);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_birthdate;
    }
}
