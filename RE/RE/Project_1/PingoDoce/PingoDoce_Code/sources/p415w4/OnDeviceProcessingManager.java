package p415w4;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.C2290b;
import com.facebook.internal.Utility;
import java.util.List;
import java.util.Set;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p248n4.AppEvent;
import p489zc.C13778q0;
import p489zc.CollectionsJVM;

/* renamed from: w4.a */
/* loaded from: classes.dex */
public final class OnDeviceProcessingManager {

    /* renamed from: a */
    private static final Set f29603a;

    /* renamed from: b */
    public static final OnDeviceProcessingManager f29604b = new OnDeviceProcessingManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnDeviceProcessingManager.kt */
    /* renamed from: w4.a$a */
    /* loaded from: classes.dex */
    public static final class RunnableC11564a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String f29605w;

        /* renamed from: x */
        final /* synthetic */ AppEvent f29606x;

        RunnableC11564a(String str, AppEvent appEvent) {
            this.f29605w = str;
            this.f29606x = appEvent;
        }

        public final void run() {
            List m202b;
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                String str = this.f29605w;
                m202b = CollectionsJVM.m202b(this.f29606x);
                RemoteServiceWrapper.m4694c(str, m202b);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnDeviceProcessingManager.kt */
    /* renamed from: w4.a$b */
    /* loaded from: classes.dex */
    public static final class RunnableC11565b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Context f29607w;

        /* renamed from: x */
        final /* synthetic */ String f29608x;

        /* renamed from: y */
        final /* synthetic */ String f29609y;

        RunnableC11565b(Context context, String str, String str2) {
            this.f29607w = context;
            this.f29608x = str;
            this.f29609y = str2;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f29607w.getSharedPreferences(this.f29608x, 0);
                String str = this.f29609y + "pingForOnDevice";
                if (sharedPreferences.getLong(str, 0L) == 0) {
                    RemoteServiceWrapper.m4692e(this.f29609y);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        Set m204f;
        m204f = C13778q0.m204f("fb_mobile_purchase", "StartTrial", "Subscribe");
        f29603a = m204f;
    }

    private OnDeviceProcessingManager() {
    }

    /* renamed from: a */
    private final boolean m4703a(AppEvent appEvent) {
        if (CrashShieldHandler.m25963d(this)) {
            return false;
        }
        try {
            return (appEvent.m17851h() ^ true) || (appEvent.m17851h() && f29603a.contains(appEvent.m17853f()));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m4702b() {
        if (CrashShieldHandler.m25963d(OnDeviceProcessingManager.class)) {
            return false;
        }
        try {
            if ((C2290b.m34100o(C2290b.m34110e()) || Utility.m33978F()) ? false : true) {
                return RemoteServiceWrapper.m4695b();
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, OnDeviceProcessingManager.class);
            return false;
        }
    }

    /* renamed from: c */
    public static final void m4701c(String str, AppEvent appEvent) {
        if (CrashShieldHandler.m25963d(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(str, "applicationId");
            Intrinsics.isThisObjectNull(appEvent, "event");
            if (f29604b.m4703a(appEvent)) {
                C2290b.m34103l().execute(new RunnableC11564a(str, appEvent));
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, OnDeviceProcessingManager.class);
        }
    }

    /* renamed from: d */
    public static final void m4700d(String str, String str2) {
        if (CrashShieldHandler.m25963d(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            Context m34110e = C2290b.m34110e();
            if (m34110e == null || str == null || str2 == null) {
                return;
            }
            C2290b.m34103l().execute(new RunnableC11565b(m34110e, str2, str));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, OnDeviceProcessingManager.class);
        }
    }
}
