package p318qh;

import android.content.Intent;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import mg.AnalyticsManager;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p278oi.EmailViewModel;
import p378u5.ResourcesProvider;
import p468yc.C13195u;

/* renamed from: qh.c */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceEditEmailViewModel extends EmailViewModel {

    /* renamed from: R */
    private C2381h f25602R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectronicInvoiceEditEmailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_update));
        this.f25602R = c2381h;
        C1436e0 m16936D0 = m16936D0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_electronic_input_email);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m16936D0.mo166p(string);
    }

    /* renamed from: H0 */
    public Object m10086H0(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        String str = (String) m16923x0().mo172f();
        C13195u c13195u = null;
        if (str != null) {
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FOR_EMAIL", str);
            C13195u c13195u2 = C13195u.f34156a;
            UiEventsLiveData.m19517m(uiEventsLiveData, 0, intent, 1, null);
            c13195u = c13195u2;
        }
        m34636d = C2116d.m34636d();
        return c13195u == m34636d ? c13195u : C13195u.f34156a;
    }

    /* renamed from: g0 */
    protected C2381h m10085g0() {
        return this.f25602R;
    }
}
