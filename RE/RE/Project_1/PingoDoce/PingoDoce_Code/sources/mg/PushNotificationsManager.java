package mg;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.core.app.C0908j;
import androidx.core.content.C0928a;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.firebase.messaging.RemoteMessage;
import com.squareup.moshi.C4496p;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AnalyticEvents;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p489zc.C13769l0;
import pt.pingodoce.app.data.local.models.egoi.EgoiPushActions;
import pt.pingodoce.app.data.local.models.egoi.EgoiPushData;
import pt.pingodoce.app.data.local.models.p300goto.PushActionGotoType;
import pt.pingodoce.app.services.NotificationLandingActivity;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: mg.x0 */
/* loaded from: classes2.dex */
public final class PushNotificationsManager {

    /* renamed from: c */
    public static final C7473a f19758c = new C7473a(null);

    /* renamed from: a */
    private final ResourcesProvider f19759a;

    /* renamed from: b */
    private final AnalyticsManager f19760b;

    /* compiled from: PushNotificationsManager.kt */
    /* renamed from: mg.x0$a */
    /* loaded from: classes2.dex */
    public static final class C7473a {
        private C7473a() {
        }

        public /* synthetic */ C7473a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Map m18426a(String str) {
            String m8935y;
            List<String> m8883q0;
            boolean m8922H;
            List m8883q02;
            Map m334e;
            if (str == null || str.length() == 0) {
                m334e = C13769l0.m334e();
                return m334e;
            }
            m8935y = StringsJVM.m8935y(str, "http://", BuildConfig.VERSION_NAME, false, 4, null);
            m8883q0 = C10171u.m8883q0(m8935y, new String[]{"&"}, false, 0, 6, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : m8883q0) {
                m8922H = C10171u.m8922H(str2, "=", false, 2, null);
                if (m8922H) {
                    m8883q02 = C10171u.m8883q0(str2, new String[]{"="}, false, 0, 6, null);
                    linkedHashMap.put((String) m8883q02.get(0), (String) m8883q02.get(1));
                }
            }
            return linkedHashMap;
        }
    }

    public PushNotificationsManager(ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f19759a = resourcesProvider;
        this.f19760b = analyticsManager;
    }

    /* renamed from: c */
    private final void m18427c(Context context, Intent intent, String str, String str2) {
        if (context.getSystemService("notification") != null) {
            C0908j.C0916e m39172u = new C0908j.C0916e(context, "pd_default_channel").m39182k(str).m39183j(str2).m39172u(C2336R.C2337drawable.ic_notification);
            ResourcesProvider resourcesProvider = this.f19759a;
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(resourcesProvider.m6899a(), 2131951697).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            C0908j.C0916e m39184i = m39172u.m39185h(C0928a.m39113d(resourcesProvider.m6899a(), typedValue.resourceId)).m39170w(new C0908j.C0914c().m39195h(str2)).m39187f(true).m39171v(RingtoneManager.getDefaultUri(2)).m39174s(4).m39184i(PendingIntent.getActivity(context, 0, intent, 201326592));
            Intrinsics.checkIfNull(m39184i, "Builder(context, BuildCo…  )\n                    )");
            Object systemService = context.getSystemService("notification");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("pd_default_channel", "Pingo Doce", 3));
            }
            String packageName = context.getPackageName();
            notificationManager.notify(packageName + "_1", (int) System.currentTimeMillis(), m39184i.m39191b());
        }
    }

    /* renamed from: a */
    public final void m18429a(Context context, EgoiPushData egoiPushData) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(egoiPushData, "egoiPushData");
        Intent intent = new Intent(context, NotificationLandingActivity.class);
        intent.setFlags(131072);
        intent.putExtra("E-GOI_PUSH", new C4496p.C4497a().m27364a().m27369c(EgoiPushData.class).m27472h(egoiPushData));
        if (egoiPushData.m14583a().length() > 0) {
            EgoiPushActions egoiPushActions = (EgoiPushActions) new C4496p.C4497a().m27364a().m27369c(EgoiPushActions.class).m27476c(egoiPushData.m14583a());
            Map m18426a = f19758c.m18426a(egoiPushActions != null ? egoiPushActions.m14588b() : null);
            String str = (String) m18426a.get("goto");
            if (str != null) {
                intent.putExtra("goto", (Parcelable) PushActionGotoType.Companion.m14573a(str));
            }
            String str2 = (String) m18426a.get("gotoPayload");
            if (str2 != null) {
                intent.putExtra("gotoPayload", str2);
            }
        }
        m18427c(context, intent, egoiPushData.m14578f(), egoiPushData.m14582b());
    }

    /* renamed from: b */
    public final void m18428b(Context context, RemoteMessage remoteMessage) {
        String str;
        String m28085a;
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(remoteMessage, "remoteMessage");
        Intent intent = new Intent(context, NotificationLandingActivity.class);
        intent.setFlags(131072);
        boolean z = false;
        if (remoteMessage.m28088h().containsKey("goto")) {
            String str2 = remoteMessage.m28088h().get("goto");
            if (!(str2 == null || str2.length() == 0)) {
                intent.putExtra("goto", (Parcelable) PushActionGotoType.Companion.m14573a(str2));
                String str3 = remoteMessage.m28088h().get("gotoPayload");
                if (!(str3 == null || str3.length() == 0)) {
                    intent.putExtra("gotoPayload", str3);
                }
            }
        }
        if (remoteMessage.m28088h().containsKey("notificationId")) {
            String str4 = remoteMessage.m28088h().get("notificationId");
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            if (!z) {
                InterfaceC7886d.C7887a.m17629a(this.f19760b, new AnalyticEvents.AbstractC7743d.C7749f(str4), null, null, null, 14, null);
            }
        }
        RemoteMessage.C4269a m28086v = remoteMessage.m28086v();
        String str5 = BuildConfig.VERSION_NAME;
        if (m28086v == null || (str = m28086v.m28083c()) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        RemoteMessage.C4269a m28086v2 = remoteMessage.m28086v();
        if (m28086v2 != null && (m28085a = m28086v2.m28085a()) != null) {
            str5 = m28085a;
        }
        m18427c(context, intent, str, str5);
    }
}
