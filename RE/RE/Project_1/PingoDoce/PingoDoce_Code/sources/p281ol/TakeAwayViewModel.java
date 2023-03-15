package p281ol;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import be.OperatorExtensions;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import java.util.ArrayList;
import mg.AnalyticsManager;
import mg.C7347m1;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import pl.TakeAwayCheckoutViewModel;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: ol.c */
/* loaded from: classes2.dex */
public abstract class TakeAwayViewModel extends TakeAwayCheckoutViewModel {

    /* renamed from: S */
    private final C7347m1 f21227S;

    /* renamed from: T */
    private final InterfaceC6108l f21228T;

    /* renamed from: U */
    private final C1436e0 f21229U;

    /* renamed from: V */
    private final C1436e0 f21230V;

    /* renamed from: W */
    private final C1436e0 f21231W;

    /* renamed from: X */
    private final C1436e0 f21232X;

    /* renamed from: Y */
    private final C1436e0 f21233Y;

    /* renamed from: Z */
    private final C1436e0 f21234Z;

    /* renamed from: a0 */
    private final C1436e0 f21235a0;

    /* renamed from: b0 */
    private boolean f21236b0;

    /* renamed from: c0 */
    private final LiveData f21237c0;

    /* renamed from: d0 */
    private final LiveData f21238d0;

    /* renamed from: e0 */
    private final LiveData f21239e0;

    /* renamed from: f0 */
    private final LiveData f21240f0;

    /* renamed from: g0 */
    private final LiveData f21241g0;

    /* renamed from: h0 */
    private final LiveData f21242h0;

    /* renamed from: i0 */
    private final LiveData f21243i0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TakeAwayViewModel.kt */
    /* renamed from: ol.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC8159a {
        DATE,
        TIME
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayViewModel.kt */
    /* renamed from: ol.c$b */
    /* loaded from: classes2.dex */
    public static final class C8160b extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: TakeAwayViewModel.kt */
        /* renamed from: ol.c$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8161a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f21245a;

            static {
                int[] iArr = new int[EnumC8159a.values().length];
                iArr[EnumC8159a.DATE.ordinal()] = 1;
                iArr[EnumC8159a.TIME.ordinal()] = 2;
                f21245a = iArr;
            }
        }

        C8160b() {
            super(1);
        }

        /* renamed from: a */
        public final void m16415a(EnumC8159a enumC8159a) {
            Intrinsics.isThisObjectNull(enumC8159a, "type");
            int i = C8161a.f21245a[enumC8159a.ordinal()];
            if (i == 1) {
                TakeAwayViewModel.m16418k1(TakeAwayViewModel.this, false, 1, null);
            } else if (i != 2) {
            } else {
                TakeAwayViewModel.m16416m1(TakeAwayViewModel.this, false, 1, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m16415a((EnumC8159a) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: TakeAwayViewModel.kt */
    /* renamed from: ol.c$c */
    /* loaded from: classes2.dex */
    public static final class C8162c implements UiWidgets.InterfaceC7044a {

        /* renamed from: b */
        final /* synthetic */ boolean f21247b;

        C8162c(boolean z) {
            this.f21247b = z;
        }

        /* renamed from: a */
        public void m16414a(boolean z) {
            if (z) {
                TakeAwayViewModel.m16441N0(TakeAwayViewModel.this).mo166p(Boolean.valueOf(this.f21247b));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider, analyticsManager, c7347m1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7347m1, "manager");
        this.f21227S = c7347m1;
        this.f21228T = OperatorExtensions.m35176e(0L, null, new C8160b(), 3, null);
        C1436e0 m37004c = c1459l0.m37004c("_store");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<Store>(\"_store\")");
        this.f21229U = m37004c;
        C1436e0 c1436e0 = new C1436e0(new ArrayList());
        this.f21230V = c1436e0;
        C1436e0 c1436e02 = new C1436e0(new ArrayList());
        this.f21231W = c1436e02;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_takeaway_date);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 c1436e03 = new C1436e0(string);
        this.f21232X = c1436e03;
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_takeaway_hour);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        C1436e0 c1436e04 = new C1436e0(string2);
        this.f21233Y = c1436e04;
        C1436e0 c1436e05 = new C1436e0();
        this.f21234Z = c1436e05;
        C1436e0 c1436e06 = new C1436e0();
        this.f21235a0 = c1436e06;
        this.f21237c0 = m37004c;
        this.f21238d0 = c1436e03;
        this.f21239e0 = c1436e04;
        this.f21240f0 = c1436e0;
        this.f21241g0 = c1436e02;
        this.f21242h0 = c1436e05;
        this.f21243i0 = c1436e06;
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m16443L0(TakeAwayViewModel takeAwayViewModel, View view) {
        m16431X0(takeAwayViewModel, view);
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m16442M0(TakeAwayViewModel takeAwayViewModel, View view) {
        m16429Z0(takeAwayViewModel, view);
    }

    /* renamed from: N0 */
    public static final /* synthetic */ C1436e0 m16441N0(TakeAwayViewModel takeAwayViewModel) {
        return takeAwayViewModel.f21234Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static final void m16431X0(TakeAwayViewModel takeAwayViewModel, View view) {
        Intrinsics.isThisObjectNull(takeAwayViewModel, "this$0");
        takeAwayViewModel.f21228T.mo9587d(EnumC8159a.DATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public static final void m16429Z0(TakeAwayViewModel takeAwayViewModel, View view) {
        Intrinsics.isThisObjectNull(takeAwayViewModel, "this$0");
        takeAwayViewModel.f21228T.mo9587d(EnumC8159a.TIME);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m16418k1(TakeAwayViewModel takeAwayViewModel, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleDatePicker");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        takeAwayViewModel.m16419j1(z);
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m16416m1(TakeAwayViewModel takeAwayViewModel, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleHourPicker");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        takeAwayViewModel.m16417l1(z);
    }

    /* renamed from: O0 */
    public final LiveData m16440O0() {
        return this.f21238d0;
    }

    /* renamed from: P0 */
    public final LiveData m16439P0() {
        return this.f21239e0;
    }

    /* renamed from: Q0 */
    public final LiveData m16438Q0() {
        return this.f21237c0;
    }

    /* renamed from: R0 */
    public final LiveData m16437R0() {
        return this.f21240f0;
    }

    /* renamed from: S0 */
    public final LiveData m16436S0() {
        return this.f21241g0;
    }

    /* renamed from: T0 */
    public final boolean m16435T0() {
        return this.f21236b0;
    }

    /* renamed from: U0 */
    public final LiveData m16434U0() {
        return this.f21242h0;
    }

    /* renamed from: V0 */
    public final LiveData m16433V0() {
        return this.f21243i0;
    }

    /* renamed from: W0 */
    public final View.OnClickListener m16432W0() {
        return new View.OnClickListener() { // from class: ol.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayViewModel.m16431X0(TakeAwayViewModel.this, view);
            }
        };
    }

    /* renamed from: Y0 */
    public final View.OnClickListener m16430Y0() {
        return new View.OnClickListener() { // from class: ol.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayViewModel.m16429Z0(TakeAwayViewModel.this, view);
            }
        };
    }

    /* renamed from: a1 */
    protected final void m16428a1() {
        C1436e0 c1436e0 = this.f21232X;
        String string = m20390g().m6899a().getString(C2336R.string.lbl_takeaway_date);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        c1436e0.mo166p(string);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b1 */
    public final void m16427b1() {
        m16428a1();
        m16426c1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c1 */
    public final void m16426c1() {
        C1436e0 c1436e0 = this.f21233Y;
        String string = m20390g().m6899a().getString(C2336R.string.lbl_takeaway_hour);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        c1436e0.mo166p(string);
    }

    /* renamed from: d1 */
    public void m16425d1(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        this.f21232X.mo166p(str);
        if (m34577T()) {
            ((TakeAwayFlowData) m34578S()).m14690a().m10856s(str);
        }
    }

    /* renamed from: e1 */
    public void m16424e1(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        this.f21233Y.mo166p(str);
        if (m34577T()) {
            ((TakeAwayFlowData) m34578S()).m14690a().m10857r(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f1 */
    public final void m16423f1(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "value");
        this.f21230V.mo166p(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g1 */
    public final void m16422g1(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "value");
        this.f21231W.mo166p(arrayList);
    }

    /* renamed from: h1 */
    public void m16421h1(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        this.f21229U.mo166p(store);
        if (m34577T()) {
            ((TakeAwayFlowData) m34578S()).m14690a().m10854v(store.m13710h());
            ((TakeAwayFlowData) m34578S()).m14690a().m10855t(store.m13713d());
        }
    }

    /* renamed from: i1 */
    public final void m16420i1(boolean z) {
        this.f21236b0 = z;
    }

    /* renamed from: j1 */
    protected final void m16419j1(boolean z) {
        if (this.f21236b0 && this.f21227S.m18685g() > 0) {
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            String string = m20390g().m6899a().getString(C2336R.string.dialog_alert_title);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            String string2 = m20390g().m6899a().getString(C2336R.string.dialog_take_away_reset);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            UiEventsLiveData.m19519k(uiEventsLiveData, string, string2, null, null, new C8162c(z), 12, null);
            return;
        }
        this.f21234Z.mo166p(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public final void m16417l1(boolean z) {
        this.f21235a0.mo166p(Boolean.valueOf(z));
    }
}
