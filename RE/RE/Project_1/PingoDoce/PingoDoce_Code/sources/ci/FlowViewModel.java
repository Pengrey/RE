package ci;

import androidx.lifecycle.C1459l0;
import ki.NoConnectionViewModel;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: ci.p */
/* loaded from: classes2.dex */
public abstract class FlowViewModel<F extends FlowData> extends NoConnectionViewModel {

    /* renamed from: p */
    private FlowData f6195p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        m34579R();
    }

    /* renamed from: N */
    protected void m34580N() {
    }

    /* renamed from: R */
    public final void m34579R() {
        FlowData flowData = (FlowData) m20389h().m37005b("EXTRA_FOR_FLOW_DATA");
        if (flowData != null) {
            this.f6195p = flowData;
        }
    }

    /* renamed from: S */
    public FlowData m34578S() {
        if (!m34577T()) {
            m34579R();
        }
        FlowData flowData = this.f6195p;
        if (flowData == null) {
            Intrinsics.throwUninitPropException("flowData");
            return null;
        }
        return flowData;
    }

    /* renamed from: T */
    public final boolean m34577T() {
        return this.f6195p != null;
    }

    /* renamed from: U */
    public final void m34576U(FlowData flowData) {
        Intrinsics.isThisObjectNull(flowData, "flowData");
        this.f6195p = flowData;
    }
}
