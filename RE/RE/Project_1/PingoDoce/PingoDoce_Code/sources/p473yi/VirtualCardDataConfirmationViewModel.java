package p473yi;

import android.view.View;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import mg.C7405s1;
import module.network.data.remote.models.user.User;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13925y2;
import pt.pingodoce.app.data.local.flows.VirtualCardFlowData;

/* renamed from: yi.e */
/* loaded from: classes2.dex */
public final class VirtualCardDataConfirmationViewModel extends FlowViewModel {

    /* renamed from: A */
    private final C1436e0 f34186A;

    /* renamed from: B */
    private final LiveData f34187B;

    /* renamed from: C */
    private final String f34188C;

    /* renamed from: D */
    private final C1430c0 f34189D;

    /* renamed from: E */
    private final LiveData f34190E;

    /* renamed from: F */
    private final InterfaceC6108l f34191F;

    /* renamed from: q */
    private final User f34192q;

    /* renamed from: r */
    private final C1436e0 f34193r;

    /* renamed from: s */
    private final C1436e0 f34194s;

    /* renamed from: t */
    private final C1436e0 f34195t;

    /* renamed from: u */
    private final C1430c0 f34196u;

    /* renamed from: v */
    private final C1430c0 f34197v;

    /* renamed from: w */
    private final LiveData f34198w;

    /* renamed from: x */
    private final C1436e0 f34199x;

    /* renamed from: y */
    private final LiveData f34200y;

    /* renamed from: z */
    private final LiveData f34201z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VirtualCardDataConfirmationViewModel.kt */
    /* renamed from: yi.e$a */
    /* loaded from: classes2.dex */
    public static final class C13448a extends AbstractC6438m implements InterfaceC6108l {
        C13448a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1382a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel = VirtualCardDataConfirmationViewModel.this;
            Object mo172f = VirtualCardDataConfirmationViewModel.this.m1389b0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            String str = (String) mo172f;
            T mo172f2 = VirtualCardDataConfirmationViewModel.this.m1388c0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f2);
            String str2 = (String) mo172f2;
            Object mo172f3 = VirtualCardDataConfirmationViewModel.this.m1386e0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f3);
            String str3 = (String) mo172f3;
            Object mo172f4 = VirtualCardDataConfirmationViewModel.this.m1390a0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f4);
            virtualCardDataConfirmationViewModel.m34576U(new VirtualCardFlowData(str, str2, str3, (String) mo172f4, false, false, false, null, 240, null));
            VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel2 = VirtualCardDataConfirmationViewModel.this;
            virtualCardDataConfirmationViewModel2.m120B(C13925y2.f35046a, virtualCardDataConfirmationViewModel2.m34578S());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1382a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCardDataConfirmationViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        User m18502h = c7405s1.m18502h();
        this.f34192q = m18502h;
        Intrinsics.ifNullDoSomething(m18502h);
        C1436e0 m37003d = c1459l0.m37003d("_firstName", m18502h.m18184i());
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(… userProfile!!.firstName)");
        this.f34193r = m37003d;
        Intrinsics.ifNullDoSomething(m18502h);
        C1436e0 m37003d2 = c1459l0.m37003d("_phoneNumber", m18502h.m18176v());
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…serProfile!!.phoneNumber)");
        this.f34194s = m37003d2;
        Intrinsics.ifNullDoSomething(m18502h);
        C1436e0 m37003d3 = c1459l0.m37003d("_email", m18502h.m18186f());
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(…il\", userProfile!!.email)");
        this.f34195t = m37003d3;
        C1430c0 c1430c0 = new C1430c0();
        this.f34196u = c1430c0;
        C1430c0 c1430c02 = new C1430c0();
        this.f34197v = c1430c02;
        this.f34198w = m37003d;
        Intrinsics.ifNullDoSomething(m18502h);
        C1436e0 m37003d4 = c1459l0.m37003d("_lastName", m18502h.m18181m());
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData(…, userProfile!!.lastName)");
        this.f34199x = m37003d4;
        this.f34200y = m37003d2;
        this.f34201z = m37003d3;
        C1436e0 c1436e0 = new C1436e0(Boolean.FALSE);
        this.f34186A = c1436e0;
        this.f34187B = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_error_field_mandatory);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        this.f34188C = string;
        this.f34189D = c1430c0;
        this.f34190E = c1430c02;
        CharSequence charSequence = (CharSequence) m37003d4.mo172f();
        c1430c02.mo166p(Boolean.valueOf(charSequence == null || charSequence.length() == 0));
        c1430c0.m37055q(m37003d4, new InterfaceC1440f0() { // from class: yi.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                VirtualCardDataConfirmationViewModel.m1393X(VirtualCardDataConfirmationViewModel.this, (String) obj);
            }
        });
        this.f34191F = BaseViewModel.m113I(this, 0L, new C13448a(), 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m1395V(VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel, String str) {
        m1393X(virtualCardDataConfirmationViewModel, str);
    }

    /* renamed from: W */
    public static /* synthetic */ void m1394W(VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel, View view) {
        m1383h0(virtualCardDataConfirmationViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m1393X(VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel, String str) {
        Intrinsics.isThisObjectNull(virtualCardDataConfirmationViewModel, "this$0");
        boolean z = false;
        virtualCardDataConfirmationViewModel.f34186A.mo166p(Boolean.valueOf(str == null || str.length() == 0));
        C1430c0 c1430c0 = virtualCardDataConfirmationViewModel.f34196u;
        if (str == null || str.length() == 0) {
            z = true;
        }
        c1430c0.mo166p(Boolean.valueOf(!z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m1383h0(VirtualCardDataConfirmationViewModel virtualCardDataConfirmationViewModel, View view) {
        Intrinsics.isThisObjectNull(virtualCardDataConfirmationViewModel, "this$0");
        virtualCardDataConfirmationViewModel.f34191F.mo9587d(C13195u.f34156a);
    }

    /* renamed from: Y */
    public final C1430c0 m1392Y() {
        return this.f34189D;
    }

    /* renamed from: Z */
    public final LiveData m1391Z() {
        return this.f34190E;
    }

    /* renamed from: a0 */
    public final LiveData m1390a0() {
        return this.f34201z;
    }

    /* renamed from: b0 */
    public final LiveData m1389b0() {
        return this.f34198w;
    }

    /* renamed from: c0 */
    public final C1436e0 m1388c0() {
        return this.f34199x;
    }

    /* renamed from: d0 */
    public final String m1387d0() {
        return this.f34188C;
    }

    /* renamed from: e0 */
    public final LiveData m1386e0() {
        return this.f34200y;
    }

    /* renamed from: f0 */
    public final LiveData m1385f0() {
        return this.f34187B;
    }

    /* renamed from: g0 */
    public final View.OnClickListener m1384g0() {
        return new View.OnClickListener() { // from class: yi.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualCardDataConfirmationViewModel.m1383h0(VirtualCardDataConfirmationViewModel.this, view);
            }
        };
    }
}
