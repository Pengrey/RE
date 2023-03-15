package p090em;

import mg.AuthManager;
import mg.PushNotificationsManager;
import pt.pingodoce.app.services.PushNotificationMessagingService;

/* renamed from: em.h */
/* loaded from: classes2.dex */
public final class C5145h {
    /* renamed from: a */
    public static void m25560a(PushNotificationMessagingService pushNotificationMessagingService, AuthManager authManager) {
        pushNotificationMessagingService.f25088C = authManager;
    }

    /* renamed from: b */
    public static void m25559b(PushNotificationMessagingService pushNotificationMessagingService, PushNotificationsManager pushNotificationsManager) {
        pushNotificationMessagingService.f25089D = pushNotificationsManager;
    }
}
