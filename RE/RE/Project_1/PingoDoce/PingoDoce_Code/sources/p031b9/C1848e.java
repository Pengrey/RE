package p031b9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b9.e */
/* loaded from: classes.dex */
public final class C1848e extends AbstractRunnableC1845b {

    /* renamed from: x */
    final /* synthetic */ C1854k f5562x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1848e(C1854k c1854k) {
        this.f5562x = c1854k;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    public final void mo28521a() {
        IInterface iInterface;
        C1844a c1844a;
        Context context;
        ServiceConnection serviceConnection;
        iInterface = this.f5562x.f5578k;
        if (iInterface != null) {
            c1844a = this.f5562x.f5569b;
            c1844a.m35277f("Unbind from service.", new Object[0]);
            context = this.f5562x.f5568a;
            serviceConnection = this.f5562x.f5577j;
            context.unbindService(serviceConnection);
            this.f5562x.f5572e = false;
            this.f5562x.f5578k = null;
            this.f5562x.f5577j = null;
        }
    }
}
