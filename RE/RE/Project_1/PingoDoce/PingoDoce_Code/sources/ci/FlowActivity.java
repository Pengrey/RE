package ci;

import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1440f0;
import ci.FlowViewModel;
import id.InterfaceC6108l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p468yc.C13182l;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseActivity;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: ci.m */
/* loaded from: classes2.dex */
public abstract class FlowActivity<ViewBinding extends ViewDataBinding, ViewModel extends FlowViewModel<F>, F extends FlowData> extends BaseActivity {

    /* renamed from: f0 */
    private FlowData f6188f0;

    /* compiled from: FlowActivity.kt */
    /* renamed from: ci.m$a */
    /* loaded from: classes2.dex */
    public static final class C2151a {
        private C2151a() {
        }

        public /* synthetic */ C2151a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowActivity.kt */
    /* renamed from: ci.m$b */
    /* loaded from: classes2.dex */
    public static final class C2152b extends AbstractC6438m implements InterfaceC6108l {
        C2152b() {
            super(1);
        }

        /* renamed from: a */
        public final void m34585a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            FlowActivity.this.m34591m1(c13182l);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m34585a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C2151a(null);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m34595i1(FlowActivity flowActivity, List list, InterfaceC2154o interfaceC2154o) {
        m34587p1(flowActivity, list, interfaceC2154o);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m34594j1(FlowActivity flowActivity, List list, InterfaceC2154o interfaceC2154o) {
        m34588o1(flowActivity, list, interfaceC2154o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m34588o1(FlowActivity flowActivity, List list, InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(flowActivity, "this$0");
        Intrinsics.isThisObjectNull(list, "$assignedFlows");
        Intrinsics.checkIfNull(interfaceC2154o, "event");
        flowActivity.m34586q1(interfaceC2154o, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m34587p1(FlowActivity flowActivity, List list, InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(flowActivity, "this$0");
        Intrinsics.isThisObjectNull(list, "$assignedFlows");
        Intrinsics.checkIfNull(interfaceC2154o, "event");
        flowActivity.m34586q1(interfaceC2154o, list);
    }

    /* renamed from: q1 */
    private final void m34586q1(InterfaceC2154o interfaceC2154o, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2154o interfaceC2154o2 = (InterfaceC2154o) it.next();
            if (Intrinsics.equals(interfaceC2154o2, interfaceC2154o)) {
                m34592l1(interfaceC2154o2);
                finish();
            }
        }
    }

    /* renamed from: k1 */
    protected List m34593k1() {
        List m197g;
        m197g = C13780s.m197g();
        return m197g;
    }

    /* renamed from: l1 */
    protected void m34592l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
    }

    /* renamed from: m1 */
    public abstract void m34591m1(C13182l c13182l);

    /* renamed from: n */
    public boolean m34590n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public void m34596P0(ViewDataBinding viewDataBinding, FlowViewModel flowViewModel) {
        Intrinsics.isThisObjectNull(viewDataBinding, "binding");
        Intrinsics.isThisObjectNull(flowViewModel, "viewModel");
        FlowData flowData = this.f6188f0;
        if (flowData != null) {
            if (flowData == null) {
                Intrinsics.throwUninitPropException("flowData");
                flowData = null;
            }
            flowViewModel.m34576U(flowData);
        }
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C2152b()));
        final List m34593k1 = m34593k1();
        C2153n.f6190a.m34583b().mo171i(m140g1(), new InterfaceC1440f0() { // from class: ci.l
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                FlowActivity.m34588o1(FlowActivity.this, m34593k1, (InterfaceC2154o) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        FlowData flowData = (FlowData) getIntent().getParcelableExtra("EXTRA_FOR_FLOW_DATA");
        if (flowData != null) {
            this.f6188f0 = flowData;
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDestroy() {
        C2153n c2153n = C2153n.f6190a;
        c2153n.m34584a().mo167o(this);
        c2153n.m34583b().mo167o(m140g1());
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        FlowData flowData = (FlowData) bundle.getParcelable("STATE_FOR_FLOW_DATA");
        if (flowData != null) {
            this.f6188f0 = flowData;
        }
        final List m34593k1 = m34593k1();
        C2153n.f6190a.m34584a().mo171i(this, new InterfaceC1440f0() { // from class: ci.k
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                FlowActivity.m34587p1(FlowActivity.this, m34593k1, (InterfaceC2154o) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "outState");
        FlowData flowData = this.f6188f0;
        if (flowData != null) {
            if (flowData == null) {
                Intrinsics.throwUninitPropException("flowData");
                flowData = null;
            }
            bundle.putParcelable("STATE_FOR_FLOW_DATA", flowData);
        }
        super.onSaveInstanceState(bundle);
    }
}
