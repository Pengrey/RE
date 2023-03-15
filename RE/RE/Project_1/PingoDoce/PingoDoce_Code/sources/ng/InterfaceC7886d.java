package ng;

/* renamed from: ng.d */
/* loaded from: classes2.dex */
public interface InterfaceC7886d {

    /* compiled from: AnalyticsTracker.kt */
    /* renamed from: ng.d$a */
    /* loaded from: classes2.dex */
    public static final class C7887a {
        /* renamed from: a */
        public static /* synthetic */ void m17629a(InterfaceC7886d interfaceC7886d, AnalyticEvents analyticEvents, EnumC7885c enumC7885c, EnumC7884b enumC7884b, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
            }
            if ((i & 2) != 0) {
                enumC7885c = null;
            }
            if ((i & 4) != 0) {
                enumC7884b = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            interfaceC7886d.mo17630a(analyticEvents, enumC7885c, enumC7884b, str);
        }
    }

    /* renamed from: a */
    void mo17630a(AnalyticEvents analyticEvents, EnumC7885c enumC7885c, EnumC7884b enumC7884b, String str);
}
