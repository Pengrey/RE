package com.facebook.internal;

import com.facebook.C2290b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p482z4.C13636d;
import p482z4.C13637e;
import p482z4.FetchedAppGateKeepersManager;
import sd.StringsJVM;

/* renamed from: com.facebook.internal.c */
/* loaded from: classes.dex */
public final class FeatureManager {

    /* renamed from: b */
    public static final FeatureManager f6715b = new FeatureManager();

    /* renamed from: a */
    private static final Map f6716a = new HashMap();

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.facebook.internal.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2316a {
        /* renamed from: a */
        void mo17769a(boolean z);
    }

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.facebook.internal.c$b */
    /* loaded from: classes.dex */
    public enum EnumC2317b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        Share(33554432),
        Places(50331648);
        
        public static final C2318a Companion = new C2318a(null);
        private final int code;

        /* compiled from: FeatureManager.kt */
        /* renamed from: com.facebook.internal.c$b$a */
        /* loaded from: classes.dex */
        public static final class C2318a {
            private C2318a() {
            }

            /* renamed from: a */
            public final EnumC2317b m34001a(int i) {
                EnumC2317b[] values;
                for (EnumC2317b enumC2317b : EnumC2317b.values()) {
                    if (EnumC2317b.access$getCode$p(enumC2317b) == i) {
                        return enumC2317b;
                    }
                }
                return EnumC2317b.Unknown;
            }

            public /* synthetic */ C2318a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        EnumC2317b(int i) {
            this.code = i;
        }

        public static final /* synthetic */ int access$getCode$p(EnumC2317b enumC2317b) {
            return enumC2317b.code;
        }

        public final EnumC2317b getParent() {
            int i = this.code;
            if ((i & 255) > 0) {
                return Companion.m34001a(i & (-256));
            }
            if ((65280 & i) > 0) {
                return Companion.m34001a(i & (-65536));
            }
            if ((16711680 & i) > 0) {
                return Companion.m34001a(i & (-16777216));
            }
            return Companion.m34001a(0);
        }

        public final String toKey() {
            return "FBSDKFeature" + this;
        }

        public String toString() {
            switch (C13636d.f34658a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "PrivacyProtection";
                case 13:
                    return "SuggestedEvents";
                case 14:
                    return "IntelligentIntegrity";
                case 15:
                    return "ModelRequest";
                case 16:
                    return "EventDeactivation";
                case 17:
                    return "OnDeviceEventProcessing";
                case 18:
                    return "OnDevicePostInstallEventProcessing";
                case 19:
                    return "IAPLogging";
                case 20:
                    return "IAPLoggingLib2";
                case 21:
                    return "Monitoring";
                case 22:
                    return "LoginKit";
                case 23:
                    return "ChromeCustomTabsPrefetching";
                case 24:
                    return "IgnoreAppSwitchToLoggedOut";
                case 25:
                    return "ShareKit";
                case 26:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    /* compiled from: FeatureManager.kt */
    /* renamed from: com.facebook.internal.c$c */
    /* loaded from: classes.dex */
    public static final class C2319c implements FetchedAppGateKeepersManager.InterfaceC13638a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2316a f6717a;

        /* renamed from: b */
        final /* synthetic */ EnumC2317b f6718b;

        C2319c(InterfaceC2316a interfaceC2316a, EnumC2317b enumC2317b) {
            this.f6717a = interfaceC2316a;
            this.f6718b = enumC2317b;
        }

        /* renamed from: a */
        public void m34000a() {
            this.f6717a.mo17769a(FeatureManager.m34002g(this.f6718b));
        }
    }

    private FeatureManager() {
    }

    /* renamed from: a */
    public static final void m34008a(EnumC2317b enumC2317b, InterfaceC2316a interfaceC2316a) {
        Intrinsics.isThisObjectNull(enumC2317b, "feature");
        Intrinsics.isThisObjectNull(interfaceC2316a, "callback");
        FetchedAppGateKeepersManager.m745j(new C2319c(interfaceC2316a, enumC2317b));
    }

    /* renamed from: b */
    private final boolean m34007b(EnumC2317b enumC2317b) {
        switch (C13637e.f34659a[enumC2317b.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public static final void m34006c(EnumC2317b enumC2317b) {
        Intrinsics.isThisObjectNull(enumC2317b, "feature");
        C2290b.m34110e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(enumC2317b.toKey(), C2290b.m34098q()).apply();
    }

    /* renamed from: d */
    public static final EnumC2317b m34005d(String str) {
        boolean m8948C;
        Intrinsics.isThisObjectNull(str, "className");
        f6715b.m34003f();
        for (Map.Entry entry : f6716a.entrySet()) {
            EnumC2317b enumC2317b = (EnumC2317b) entry.getKey();
            for (String str2 : (String[]) entry.getValue()) {
                m8948C = StringsJVM.m8948C(str, str2, false, 2, null);
                if (m8948C) {
                    return enumC2317b;
                }
            }
        }
        return EnumC2317b.Unknown;
    }

    /* renamed from: e */
    private final boolean m34004e(EnumC2317b enumC2317b) {
        return FetchedAppGateKeepersManager.m749f(enumC2317b.toKey(), C2290b.m34109f(), m34007b(enumC2317b));
    }

    /* renamed from: f */
    private final synchronized void m34003f() {
        Map map = f6716a;
        if (map.isEmpty()) {
            map.put(EnumC2317b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(EnumC2317b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(EnumC2317b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(EnumC2317b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(EnumC2317b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(EnumC2317b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(EnumC2317b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(EnumC2317b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(EnumC2317b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(EnumC2317b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(EnumC2317b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(EnumC2317b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    /* renamed from: g */
    public static final boolean m34002g(EnumC2317b enumC2317b) {
        Intrinsics.isThisObjectNull(enumC2317b, "feature");
        if (EnumC2317b.Unknown == enumC2317b) {
            return false;
        }
        if (EnumC2317b.Core == enumC2317b) {
            return true;
        }
        String string = C2290b.m34110e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(enumC2317b.toKey(), null);
        if (string == null || !Intrinsics.equals(string, C2290b.m34098q())) {
            EnumC2317b parent = enumC2317b.getParent();
            if (parent == enumC2317b) {
                return f6715b.m34004e(enumC2317b);
            }
            return m34002g(parent) && f6715b.m34004e(enumC2317b);
        }
        return false;
    }
}
