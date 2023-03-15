package p031b9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b9.j */
/* loaded from: classes.dex */
public final class ServiceConnectionC1853j implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C1854k f5566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC1853j(C1854k c1854k) {
        this.f5566a = c1854k;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1844a c1844a;
        c1844a = this.f5566a.f5569b;
        c1844a.m35277f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f5566a.m35266h(new C1851h(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1844a c1844a;
        c1844a = this.f5566a.f5569b;
        c1844a.m35277f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f5566a.m35266h(new C1852i(this));
    }
}
