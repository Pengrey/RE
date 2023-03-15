package p495zi;

import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.textfield.TextInputEditText;
import p047ce.FluidContentResizer;
import p181jd.Intrinsics;
import p426wg.AbstractC11982r1;
import p495zi.NifViewModel;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: zi.a */
/* loaded from: classes2.dex */
public abstract class NifActivity<ViewModel extends NifViewModel<F>, F extends FlowData> extends FlowActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public void m92n1(AbstractC11982r1 abstractC11982r1, NifViewModel nifViewModel) {
        Intrinsics.isThisObjectNull(abstractC11982r1, "binding");
        Intrinsics.isThisObjectNull(nifViewModel, "viewModel");
        super.m34589n1(abstractC11982r1, nifViewModel);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        TextInputEditText textInputEditText = abstractC11982r1.f31355z;
        Intrinsics.checkIfNull(textInputEditText, "binding.nifEditText");
        m148Y0(textInputEditText);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_nif;
    }
}
