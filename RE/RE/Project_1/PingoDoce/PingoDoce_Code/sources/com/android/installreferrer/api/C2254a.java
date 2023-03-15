package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p194k4.C6593a;
import p250n6.InterfaceC7679a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.installreferrer.api.a */
/* loaded from: classes.dex */
public class C2254a extends InstallReferrerClient {

    /* renamed from: a */
    private int f6555a = 0;

    /* renamed from: b */
    private final Context f6556b;

    /* renamed from: c */
    private InterfaceC7679a f6557c;

    /* renamed from: d */
    private ServiceConnection f6558d;

    /* compiled from: InstallReferrerClientImpl.java */
    /* renamed from: com.android.installreferrer.api.a$b */
    /* loaded from: classes.dex */
    private final class ServiceConnectionC2256b implements ServiceConnection {

        /* renamed from: a */
        private final InstallReferrerStateListener f6559a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6593a.m20521a("InstallReferrerClient", "Install Referrer service connected.");
            C2254a.this.f6557c = InterfaceC7679a.AbstractBinderC7680a.m17727s(iBinder);
            C2254a.this.f6555a = 2;
            this.f6559a.mo34278a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C6593a.m20520b("InstallReferrerClient", "Install Referrer service disconnected.");
            C2254a.this.f6557c = null;
            C2254a.this.f6555a = 0;
            this.f6559a.mo34277b();
        }

        private ServiceConnectionC2256b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f6559a = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public C2254a(Context context) {
        this.f6556b = context.getApplicationContext();
    }

    /* renamed from: f */
    private boolean m34271f() {
        try {
            return this.f6556b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public ReferrerDetails mo34275a() throws RemoteException {
        if (m34270g()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f6556b.getPackageName());
            try {
                return new ReferrerDetails(this.f6557c.mo17726r1(bundle));
            } catch (RemoteException e) {
                C6593a.m20520b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f6555a = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: c */
    public void mo34274c(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (m34270g()) {
            C6593a.m20521a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.mo34278a(0);
            return;
        }
        int i = this.f6555a;
        if (i == 1) {
            C6593a.m20520b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.mo34278a(3);
        } else if (i == 3) {
            C6593a.m20520b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.mo34278a(3);
        } else {
            C6593a.m20521a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f6558d = new ServiceConnectionC2256b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f6556b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && m34271f()) {
                    if (this.f6556b.bindService(new Intent(intent), this.f6558d, 1)) {
                        C6593a.m20521a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    C6593a.m20520b("InstallReferrerClient", "Connection to service is blocked.");
                    this.f6555a = 0;
                    installReferrerStateListener.mo34278a(1);
                    return;
                }
                C6593a.m20520b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f6555a = 0;
                installReferrerStateListener.mo34278a(2);
                return;
            }
            this.f6555a = 0;
            C6593a.m20521a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.mo34278a(2);
        }
    }

    /* renamed from: g */
    public boolean m34270g() {
        return (this.f6555a != 2 || this.f6557c == null || this.f6558d == null) ? false : true;
    }
}
