package p069dl;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import ki.SubmitAnimatedViewModel;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: dl.d */
/* loaded from: classes2.dex */
public abstract class UserDataViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f13350C;

    /* renamed from: D */
    private C2381h f13351D;

    /* renamed from: E */
    private final Void f13352E;

    /* renamed from: F */
    private final C1430c0 f13353F;

    /* renamed from: G */
    private final C1430c0 f13354G;

    /* renamed from: H */
    private final C1436e0 f13355H;

    /* renamed from: I */
    private final C1436e0 f13356I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDataViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f13350C = analyticsManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_advance));
        this.f13351D = c2381h;
        C1430c0 c1430c0 = new C1430c0();
        this.f13353F = c1430c0;
        this.f13354G = c1430c0;
        C1436e0 m37003d = c1459l0.m37003d("firstName", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<String>(\"firstName\",\"\")");
        this.f13355H = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("lastName", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"lastName\", \"\")");
        this.f13356I = m37003d2;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7785b0.f20409b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        c1430c0.m37055q(m37003d, new InterfaceC1440f0() { // from class: dl.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                UserDataViewModel.m26341w0(UserDataViewModel.this, (String) obj);
            }
        });
        c1430c0.m37055q(m37003d2, new InterfaceC1440f0() { // from class: dl.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                UserDataViewModel.m26340x0(UserDataViewModel.this, (String) obj);
            }
        });
    }

    /* renamed from: C0 */
    private final void m26346C0() {
        Boolean bool;
        m20319p0();
        C1430c0 c1430c0 = this.f13353F;
        String str = (String) this.f13355H.mo172f();
        if (str != null) {
            bool = Boolean.valueOf(str.length() > 0);
        } else {
            bool = Boolean.FALSE;
        }
        c1430c0.mo166p(bool);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m26343u0(UserDataViewModel userDataViewModel, String str) {
        m26341w0(userDataViewModel, str);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m26342v0(UserDataViewModel userDataViewModel, String str) {
        m26340x0(userDataViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m26341w0(UserDataViewModel userDataViewModel, String str) {
        Intrinsics.isThisObjectNull(userDataViewModel, "this$0");
        InterfaceC7886d.C7887a.m17629a(userDataViewModel.f13350C, AnalyticEvents.AbstractC7780f.C7791d0.f20415b, EnumC7885c.Input, EnumC7884b.Edit, null, 8, null);
        userDataViewModel.m26346C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m26340x0(UserDataViewModel userDataViewModel, String str) {
        Intrinsics.isThisObjectNull(userDataViewModel, "this$0");
        InterfaceC7886d.C7887a.m17629a(userDataViewModel.f13350C, AnalyticEvents.AbstractC7780f.C7849w1.f20473b, EnumC7885c.Input, EnumC7884b.Edit, null, 8, null);
        userDataViewModel.m26346C0();
    }

    /* renamed from: A0 */
    protected Void m26348A0() {
        return this.f13352E;
    }

    /* renamed from: B0 */
    public final C1436e0 m26347B0() {
        return this.f13356I;
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m26345f0() {
        return (Drawable) m26348A0();
    }

    /* renamed from: g0 */
    protected C2381h m26344g0() {
        return this.f13351D;
    }

    /* renamed from: y0 */
    public final C1430c0 m26339y0() {
        return this.f13354G;
    }

    /* renamed from: z0 */
    public final C1436e0 m26338z0() {
        return this.f13355H;
    }
}
