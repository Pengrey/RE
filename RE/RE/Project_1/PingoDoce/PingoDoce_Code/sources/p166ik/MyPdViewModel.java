package p166ik;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import ki.SubmitAnimatedViewModel;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: ik.b */
/* loaded from: classes2.dex */
public abstract class MyPdViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private C2381h f16960C;

    /* renamed from: D */
    private final Void f16961D;

    /* renamed from: E */
    private final C1430c0 f16962E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyPdViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_advance));
        this.f16960C = c2381h;
        this.f16962E = new C1430c0();
    }

    /* renamed from: v0 */
    static /* synthetic */ Object m21961v0(MyPdViewModel myPdViewModel, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m21960w0 = myPdViewModel.m21960w0(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m21960w0 == m34636d ? m21960w0 : C13195u.f34156a;
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m21965f0() {
        return (Drawable) m21962u0();
    }

    /* renamed from: g0 */
    protected C2381h m21964g0() {
        return this.f16960C;
    }

    /* renamed from: n0 */
    protected Object m21963n0(InterfaceC1886d interfaceC1886d) {
        return m21961v0(this, interfaceC1886d);
    }

    /* renamed from: u0 */
    protected Void m21962u0() {
        return this.f16961D;
    }

    /* renamed from: w0 */
    public abstract Object m21960w0(InterfaceC1886d interfaceC1886d);
}
