package pt.pingodoce.app.services;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import jm.C6537a;
import mg.AuthManager;
import mg.PushNotificationsManager;
import p181jd.Intrinsics;
import p384uc.C10865a;
import pt.pingodoce.app.data.local.models.egoi.EgoiPushData;

/* compiled from: PushNotificationMessagingService.kt */
/* loaded from: classes2.dex */
public final class PushNotificationMessagingService extends FirebaseMessagingService {

    /* renamed from: C */
    public AuthManager f25088C;

    /* renamed from: D */
    public PushNotificationsManager f25089D;

    /* renamed from: d */
    public void mo28021d(Intent intent) {
        int i;
        Intrinsics.isThisObjectNull(intent, "intent");
        super.mo28021d(intent);
        if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            Intrinsics.ifNullDoSomething(extras);
            C6537a.m20675d("Possible message from Egoi", new Object[0]);
            if (extras.containsKey("key") && Intrinsics.equals(extras.getString("key"), "E-GOI_PUSH")) {
                String string = extras.getString("title");
                String str = string == null ? BuildConfig.VERSION_NAME : string;
                Intrinsics.checkIfNull(str, "getString(\"title\") ?: \"\"");
                String string2 = extras.getString("body");
                String str2 = string2 == null ? BuildConfig.VERSION_NAME : string2;
                Intrinsics.checkIfNull(str2, "getString(\"body\") ?: \"\"");
                String string3 = extras.getString("contact-id");
                if (string3 == null) {
                    string3 = "000000";
                }
                String str3 = string3;
                Intrinsics.checkIfNull(str3, "getString(\"contact-id\") ?: \"000000\"");
                String string4 = extras.getString("message-hash");
                if (string4 == null) {
                    string4 = "0000";
                }
                String str4 = string4;
                Intrinsics.checkIfNull(str4, "getString(\"message-hash\") ?: \"0000\"");
                String string5 = extras.getString("device-id");
                if (string5 != null) {
                    Intrinsics.checkIfNull(string5, "getString(\"device-id\")");
                    i = Integer.parseInt(string5);
                } else {
                    i = 0;
                }
                String string6 = extras.getString("actions");
                if (string6 == null) {
                    string6 = BuildConfig.VERSION_NAME;
                }
                Intrinsics.checkIfNull(string6, "getString(\"actions\") ?: \"\"");
                EgoiPushData egoiPushData = new EgoiPushData(str, str2, str3, str4, i, string6);
                C6537a.m20675d("Message from Egoi: " + egoiPushData, new Object[0]);
                m10674u().m18429a(this, egoiPushData);
                return;
            }
            C6537a.m20675d("Possible message from Egoi: false alarm", new Object[0]);
        }
    }

    /* renamed from: o */
    public void mo28093o(RemoteMessage remoteMessage) {
        Intrinsics.isThisObjectNull(remoteMessage, "remoteMessage");
        C6537a.m20675d("Message from: %s", remoteMessage.m28087t());
        RemoteMessage.C4269a m28086v = remoteMessage.m28086v();
        if (m28086v != null) {
            C6537a.m20675d("Message title: %s", m28086v.m28083c());
            C6537a.m20675d("Message body: %s", m28086v.m28085a());
            C6537a.m20675d("Message data: %s", remoteMessage.m28088h());
            m10674u().m18428b(this, remoteMessage);
        }
    }

    public void onCreate() {
        super.onCreate();
        C10865a.m6825b(this);
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: q */
    public void mo28091q(String str) {
        Intrinsics.isThisObjectNull(str, "token");
        super.mo28091q(str);
        m10675t().m18897C(str);
    }

    /* renamed from: t */
    public final AuthManager m10675t() {
        AuthManager authManager = this.f25088C;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitPropException("authManager");
        return null;
    }

    /* renamed from: u */
    public final PushNotificationsManager m10674u() {
        PushNotificationsManager pushNotificationsManager = this.f25089D;
        if (pushNotificationsManager != null) {
            return pushNotificationsManager;
        }
        Intrinsics.throwUninitPropException("notificationsManager");
        return null;
    }
}
