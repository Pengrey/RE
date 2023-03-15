package p415w4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.C2290b;
import com.facebook.internal.Utility;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p076e5.CrashShieldHandler;
import p153i5.InterfaceC6017a;
import p181jd.Intrinsics;
import p377u4.AppEventUtility;
import p482z4.FacebookSignatureValidator;
import p489zc.C13780s;

/* renamed from: w4.c */
/* loaded from: classes.dex */
public final class RemoteServiceWrapper {

    /* renamed from: a */
    private static final String f29612a;

    /* renamed from: b */
    private static Boolean f29613b;

    /* renamed from: c */
    public static final RemoteServiceWrapper f29614c = new RemoteServiceWrapper();

    /* compiled from: RemoteServiceWrapper.kt */
    /* renamed from: w4.c$a */
    /* loaded from: classes.dex */
    public enum EnumC11566a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        
        private final String eventType;

        EnumC11566a(String str) {
            this.eventType = str;
        }

        public String toString() {
            return this.eventType;
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* renamed from: w4.c$b */
    /* loaded from: classes.dex */
    public static final class ServiceConnectionC11567b implements ServiceConnection {

        /* renamed from: a */
        private final CountDownLatch f29615a = new CountDownLatch(1);

        /* renamed from: b */
        private IBinder f29616b;

        /* renamed from: a */
        public final IBinder m4691a() throws InterruptedException {
            this.f29615a.await(5L, TimeUnit.SECONDS);
            return this.f29616b;
        }

        public void onNullBinding(ComponentName componentName) {
            Intrinsics.isThisObjectNull(componentName, "name");
            this.f29615a.countDown();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Intrinsics.isThisObjectNull(componentName, "name");
            Intrinsics.isThisObjectNull(iBinder, "serviceBinder");
            this.f29616b = iBinder;
            this.f29615a.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Intrinsics.isThisObjectNull(componentName, "name");
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* renamed from: w4.c$c */
    /* loaded from: classes.dex */
    public enum EnumC11568c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    static {
        String simpleName = RemoteServiceWrapper.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        f29612a = simpleName;
    }

    private RemoteServiceWrapper() {
    }

    /* renamed from: a */
    private final Intent m4696a(Context context) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && FacebookSignatureValidator.m755a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (FacebookSignatureValidator.m755a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m4695b() {
        if (CrashShieldHandler.m25963d(RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (f29613b == null) {
                Context m34110e = C2290b.m34110e();
                RemoteServiceWrapper remoteServiceWrapper = f29614c;
                Intrinsics.checkIfNull(m34110e, "context");
                f29613b = Boolean.valueOf(remoteServiceWrapper.m4696a(m34110e) != null);
            }
            Boolean bool = f29613b;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, RemoteServiceWrapper.class);
            return false;
        }
    }

    /* renamed from: c */
    public static final EnumC11568c m4694c(String str, List list) {
        if (CrashShieldHandler.m25963d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(str, "applicationId");
            Intrinsics.isThisObjectNull(list, "appEvents");
            return f29614c.m4693d(EnumC11566a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, RemoteServiceWrapper.class);
            return null;
        }
    }

    /* renamed from: d */
    private final EnumC11568c m4693d(EnumC11566a enumC11566a, String str, List list) {
        EnumC11568c enumC11568c;
        String str2;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            EnumC11568c enumC11568c2 = EnumC11568c.SERVICE_NOT_AVAILABLE;
            AppEventUtility.m6946b();
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "context");
            Intent m4696a = m4696a(m34110e);
            if (m4696a != null) {
                ServiceConnectionC11567b serviceConnectionC11567b = new ServiceConnectionC11567b();
                if (m34110e.bindService(m4696a, serviceConnectionC11567b, 1)) {
                    try {
                        IBinder m4691a = serviceConnectionC11567b.m4691a();
                        if (m4691a != null) {
                            InterfaceC6017a m22349s = InterfaceC6017a.AbstractBinderC6018a.m22349s(m4691a);
                            Bundle m4699a = RemoteServiceParametersHelper.m4699a(enumC11566a, str, list);
                            if (m4699a != null) {
                                m22349s.mo22347h0(m4699a);
                                String str3 = f29612a;
                                Utility.m33973K(str3, "Successfully sent events to the remote service: " + m4699a);
                            }
                            enumC11568c2 = EnumC11568c.OPERATION_SUCCESS;
                        }
                        m34110e.unbindService(serviceConnectionC11567b);
                        Utility.m33973K(f29612a, "Unbound from the remote service");
                        return enumC11568c2;
                    } catch (RemoteException e) {
                        enumC11568c = EnumC11568c.SERVICE_ERROR;
                        str2 = f29612a;
                        Utility.m33974J(str2, e);
                        m34110e.unbindService(serviceConnectionC11567b);
                        Utility.m33973K(str2, "Unbound from the remote service");
                        return enumC11568c;
                    } catch (InterruptedException e2) {
                        enumC11568c = EnumC11568c.SERVICE_ERROR;
                        str2 = f29612a;
                        Utility.m33974J(str2, e2);
                        m34110e.unbindService(serviceConnectionC11567b);
                        Utility.m33973K(str2, "Unbound from the remote service");
                        return enumC11568c;
                    }
                }
                return EnumC11568c.SERVICE_ERROR;
            }
            return enumC11568c2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    public static final EnumC11568c m4692e(String str) {
        List m197g;
        if (CrashShieldHandler.m25963d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(str, "applicationId");
            RemoteServiceWrapper remoteServiceWrapper = f29614c;
            EnumC11566a enumC11566a = EnumC11566a.MOBILE_APP_INSTALL;
            m197g = C13780s.m197g();
            return remoteServiceWrapper.m4693d(enumC11566a, str, m197g);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, RemoteServiceWrapper.class);
            return null;
        }
    }
}
