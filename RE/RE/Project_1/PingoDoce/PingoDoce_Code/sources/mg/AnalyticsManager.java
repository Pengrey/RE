package mg;

import java.util.List;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;

/* renamed from: mg.a */
/* loaded from: classes2.dex */
public final class AnalyticsManager implements InterfaceC7886d {

    /* renamed from: a */
    private final List f19039a;

    public AnalyticsManager(List list) {
        Intrinsics.isThisObjectNull(list, "trackers");
        this.f19039a = list;
    }

    /* renamed from: a */
    public void mo17630a(AnalyticEvents analyticEvents, EnumC7885c enumC7885c, EnumC7884b enumC7884b, String str) {
        Intrinsics.isThisObjectNull(analyticEvents, "event");
        for (InterfaceC7886d interfaceC7886d : this.f19039a) {
            interfaceC7886d.mo17630a(analyticEvents, enumC7885c, enumC7884b, str);
        }
    }
}
