package p278oi;

import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.textfield.TextInputEditText;
import p047ce.FluidContentResizer;
import p181jd.Intrinsics;
import p278oi.EmailViewModel;
import p426wg.AbstractC12107y;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: oi.a */
/* loaded from: classes2.dex */
public abstract class EmailActivity<ViewModel extends EmailViewModel<F>, F extends FlowData> extends FlowActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public void m16943n1(AbstractC12107y abstractC12107y, EmailViewModel emailViewModel) {
        Intrinsics.isThisObjectNull(abstractC12107y, "binding");
        Intrinsics.isThisObjectNull(emailViewModel, "viewModel");
        super.m34589n1(abstractC12107y, emailViewModel);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        TextInputEditText textInputEditText = abstractC12107y.f31917z;
        Intrinsics.checkIfNull(textInputEditText, "binding.emailEditText");
        m148Y0(textInputEditText);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_email;
    }
}
