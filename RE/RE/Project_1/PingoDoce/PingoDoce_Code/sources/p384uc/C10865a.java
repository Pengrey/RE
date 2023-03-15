package p384uc;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import dagger.android.InterfaceC4768a;
import p423wc.C11617f;

/* renamed from: uc.a */
/* loaded from: classes2.dex */
public final class C10865a {
    /* renamed from: a */
    public static void m6826a(Activity activity) {
        C11617f.m4589b(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof InterfaceC10866b) {
            m6824c(activity, (InterfaceC10866b) application);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), InterfaceC10866b.class.getCanonicalName()));
    }

    /* renamed from: b */
    public static void m6825b(Service service) {
        C11617f.m4589b(service, "service");
        Application application = service.getApplication();
        if (application instanceof InterfaceC10866b) {
            m6824c(service, (InterfaceC10866b) application);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), InterfaceC10866b.class.getCanonicalName()));
    }

    /* renamed from: c */
    private static void m6824c(Object obj, InterfaceC10866b interfaceC10866b) {
        InterfaceC4768a<Object> mo5749j = interfaceC10866b.mo5749j();
        C11617f.m4588c(mo5749j, "%s.androidInjector() returned null", interfaceC10866b.getClass());
        mo5749j.mo2889c(obj);
    }
}
