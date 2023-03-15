package kh;

import android.content.Intent;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import li.BirthdateViewModel;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13195u;

/* renamed from: kh.d */
/* loaded from: classes2.dex */
public final class EditBirthDateViewModel extends BirthdateViewModel {

    /* renamed from: P */
    private C2381h f17961P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditBirthDateViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_update));
        this.f17961P = c2381h;
        m19413C0().mo166p(Boolean.FALSE);
    }

    /* renamed from: F0 */
    public Object m20360F0(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        String str = (String) m19402w0().mo172f();
        C13195u c13195u = null;
        if (str != null) {
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FOR_BIRTHDATE", str);
            C13195u c13195u2 = C13195u.f34156a;
            UiEventsLiveData.m19517m(uiEventsLiveData, 0, intent, 1, null);
            c13195u = c13195u2;
        }
        m34636d = C2116d.m34636d();
        return c13195u == m34636d ? c13195u : C13195u.f34156a;
    }

    /* renamed from: g0 */
    protected C2381h m20359g0() {
        return this.f17961P;
    }
}
