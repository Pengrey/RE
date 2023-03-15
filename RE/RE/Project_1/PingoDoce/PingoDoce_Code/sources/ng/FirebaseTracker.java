package ng;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import jm.C6537a;
import ng.AnalyticEvents;
import p181jd.Intrinsics;

/* renamed from: ng.f */
/* loaded from: classes2.dex */
public final class FirebaseTracker implements InterfaceC7886d {

    /* renamed from: a */
    private final FirebaseAnalytics f20508a;

    public FirebaseTracker(FirebaseAnalytics firebaseAnalytics) {
        Intrinsics.isThisObjectNull(firebaseAnalytics, "logger");
        this.f20508a = firebaseAnalytics;
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
        if (analyticEvents instanceof AnalyticEvents.AbstractC7743d.C7748e) {
            this.f20508a.m28471a("session_r", bundle);
        } else if (analyticEvents instanceof AnalyticEvents.AbstractC7743d.C7744a) {
            FirebaseAnalytics firebaseAnalytics = this.f20508a;
            String m17640a = analyticEvents.m17640a();
            AnalyticEvents.AbstractC7743d.C7744a c7744a = (AnalyticEvents.AbstractC7743d.C7744a) analyticEvents;
            String m17636b = c7744a.m17636b();
            String simpleName = c7744a.m17635c().getClass().getSimpleName();
            firebaseAnalytics.m28471a(m17640a + "_" + m17636b + "_" + simpleName, bundle);
        } else if (analyticEvents instanceof AnalyticEvents.AbstractC7743d) {
            FirebaseAnalytics firebaseAnalytics2 = this.f20508a;
            String m17640a2 = analyticEvents.m17640a();
            String m17637b = ((AnalyticEvents.AbstractC7743d) analyticEvents).m17637b();
            firebaseAnalytics2.m28471a(m17640a2 + "_" + m17637b, bundle);
        } else if (analyticEvents instanceof AnalyticEvents.C7708a) {
            AnalyticEvents.C7708a c7708a = (AnalyticEvents.C7708a) analyticEvents;
            bundle.putString("path", c7708a.m17638c());
            bundle.putInt("error_code", c7708a.m17639b());
            this.f20508a.m28471a(analyticEvents.m17640a(), bundle);
        } else if (analyticEvents instanceof AnalyticEvents.AbstractC7780f) {
            this.f20508a.m28471a(analyticEvents.m17640a(), bundle);
        } else {
            this.f20508a.m28471a(analyticEvents.m17640a(), bundle);
        }
        String m17640a3 = analyticEvents.m17640a();
        C6537a.m20678a("ANALYTICS MANAGER - FIREBASE LOGGED - " + m17640a3, new Object[0]);
    }
}
