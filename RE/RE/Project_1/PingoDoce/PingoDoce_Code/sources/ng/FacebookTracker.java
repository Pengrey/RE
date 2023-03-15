package ng;

import android.os.Bundle;
import jm.C6537a;
import ng.AnalyticEvents;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;

/* renamed from: ng.e */
/* loaded from: classes2.dex */
public final class FacebookTracker implements InterfaceC7886d {

    /* renamed from: a */
    private final AppEventsLogger f20507a;

    public FacebookTracker(AppEventsLogger appEventsLogger) {
        Intrinsics.isThisObjectNull(appEventsLogger, "logger");
        this.f20507a = appEventsLogger;
    }

    /* renamed from: a */
    public void mo17630a(AnalyticEvents analyticEvents, EnumC7885c enumC7885c, EnumC7884b enumC7884b, String str) {
        Intrinsics.isThisObjectNull(analyticEvents, "event");
        Bundle bundle = new Bundle();
        if (enumC7885c != null) {
            bundle.putString("Category", enumC7885c.name());
        }
        if (enumC7884b != null) {
            bundle.putString("Action", enumC7884b.name());
        }
        if (!(str == null || str.length() == 0)) {
            bundle.putString("DataLayer", str);
        }
        if (!(analyticEvents instanceof AnalyticEvents.AbstractC7743d.C7748e)) {
            if (analyticEvents instanceof AnalyticEvents.AbstractC7743d.C7744a) {
                AppEventsLogger appEventsLogger = this.f20507a;
                String simpleName = analyticEvents.getClass().getSimpleName();
                AnalyticEvents.AbstractC7743d.C7744a c7744a = (AnalyticEvents.AbstractC7743d.C7744a) analyticEvents;
                String m17636b = c7744a.m17636b();
                String simpleName2 = c7744a.m17635c().getClass().getSimpleName();
                appEventsLogger.m17816d(simpleName + "_" + m17636b + "_" + simpleName2, bundle);
            } else if (analyticEvents instanceof AnalyticEvents.AbstractC7743d) {
                AppEventsLogger appEventsLogger2 = this.f20507a;
                String simpleName3 = analyticEvents.getClass().getSimpleName();
                String m17637b = ((AnalyticEvents.AbstractC7743d) analyticEvents).m17637b();
                appEventsLogger2.m17816d(simpleName3 + "_" + m17637b, bundle);
            } else if (analyticEvents instanceof AnalyticEvents.AbstractC7780f) {
                this.f20507a.m17816d(analyticEvents.getClass().getSimpleName(), bundle);
            } else {
                this.f20507a.m17816d(analyticEvents.getClass().getSimpleName(), bundle);
            }
        }
        String simpleName4 = analyticEvents.getClass().getSimpleName();
        C6537a.m20678a("ANALYTICS MANAGER - FACEBOOK LOGGED - " + simpleName4, new Object[0]);
    }
}
