package p069dl;

import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.textfield.TextInputEditText;
import p047ce.FluidContentResizer;
import p069dl.UserDataViewModel;
import p181jd.Intrinsics;
import p426wg.AbstractC11867l4;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: dl.a */
/* loaded from: classes2.dex */
public abstract class UserDataActivity<ViewModel extends UserDataViewModel<F>, F extends FlowData> extends FlowActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public void m26351n1(AbstractC11867l4 abstractC11867l4, UserDataViewModel userDataViewModel) {
        Intrinsics.isThisObjectNull(abstractC11867l4, "binding");
        Intrinsics.isThisObjectNull(userDataViewModel, "viewModel");
        super.m34589n1(abstractC11867l4, userDataViewModel);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        TextInputEditText textInputEditText = abstractC11867l4.f30848y;
        Intrinsics.checkIfNull(textInputEditText, "binding.firstnameEditText");
        m148Y0(textInputEditText);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_userdata_form;
    }
}
