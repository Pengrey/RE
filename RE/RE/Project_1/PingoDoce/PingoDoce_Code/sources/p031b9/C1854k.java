package p031b9;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.internal.C3929aq;
import com.google.android.play.core.tasks.C3973l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b9.k */
/* loaded from: classes.dex */
public final class C1854k<T extends IInterface> {

    /* renamed from: l */
    private static final Map<String, Handler> f5567l = new HashMap();

    /* renamed from: a */
    private final Context f5568a;

    /* renamed from: b */
    private final C1844a f5569b;

    /* renamed from: c */
    private final String f5570c;

    /* renamed from: e */
    private boolean f5572e;

    /* renamed from: f */
    private final Intent f5573f;

    /* renamed from: g */
    private final InterfaceC1850g<T> f5574g;

    /* renamed from: j */
    private ServiceConnection f5577j;

    /* renamed from: k */
    private T f5578k;

    /* renamed from: d */
    private final List<AbstractRunnableC1845b> f5571d = new ArrayList();

    /* renamed from: i */
    private final IBinder.DeathRecipient f5576i = new IBinder.DeathRecipient(this) { // from class: b9.c

        /* renamed from: a */
        private final C1854k f5559a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.f5559a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f5559a.m35263k();
        }
    };

    /* renamed from: h */
    private final WeakReference<InterfaceC1849f> f5575h = new WeakReference<>(null);

    public C1854k(Context context, C1844a c1844a, String str, Intent intent, InterfaceC1850g<T> interfaceC1850g) {
        this.f5568a = context;
        this.f5569b = c1844a;
        this.f5570c = str;
        this.f5573f = intent;
        this.f5574g = interfaceC1850g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ void m35269e(C1854k c1854k, AbstractRunnableC1845b abstractRunnableC1845b) {
        if (c1854k.f5578k != null || c1854k.f5572e) {
            if (!c1854k.f5572e) {
                abstractRunnableC1845b.run();
                return;
            }
            c1854k.f5569b.m35277f("Waiting to bind to the service.", new Object[0]);
            c1854k.f5571d.add(abstractRunnableC1845b);
            return;
        }
        c1854k.f5569b.m35277f("Initiate binding to the service.", new Object[0]);
        c1854k.f5571d.add(abstractRunnableC1845b);
        ServiceConnectionC1853j serviceConnectionC1853j = new ServiceConnectionC1853j(c1854k);
        c1854k.f5577j = serviceConnectionC1853j;
        c1854k.f5572e = true;
        if (c1854k.f5568a.bindService(c1854k.f5573f, serviceConnectionC1853j, 1)) {
            return;
        }
        c1854k.f5569b.m35277f("Failed to bind to the service.", new Object[0]);
        c1854k.f5572e = false;
        List<AbstractRunnableC1845b> list = c1854k.f5571d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3973l<?> m35275b = list.get(i).m35275b();
            if (m35275b != null) {
                m35275b.m28499d(new C3929aq());
            }
        }
        c1854k.f5571d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m35266h(AbstractRunnableC1845b abstractRunnableC1845b) {
        Handler handler;
        Map<String, Handler> map = f5567l;
        synchronized (map) {
            if (!map.containsKey(this.f5570c)) {
                HandlerThread handlerThread = new HandlerThread(this.f5570c, 10);
                handlerThread.start();
                map.put(this.f5570c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f5570c);
        }
        handler.post(abstractRunnableC1845b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* synthetic */ void m35260n(C1854k c1854k) {
        c1854k.f5569b.m35277f("linkToDeath", new Object[0]);
        try {
            c1854k.f5578k.asBinder().linkToDeath(c1854k.f5576i, 0);
        } catch (RemoteException e) {
            c1854k.f5569b.m35279d(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static /* synthetic */ void m35258p(C1854k c1854k) {
        c1854k.f5569b.m35277f("unlinkToDeath", new Object[0]);
        c1854k.f5578k.asBinder().unlinkToDeath(c1854k.f5576i, 0);
    }

    /* renamed from: b */
    public final void m35272b() {
        m35266h(new C1848e(this));
    }

    /* renamed from: c */
    public final void m35271c(AbstractRunnableC1845b abstractRunnableC1845b) {
        m35266h(new C1847d(this, abstractRunnableC1845b.m35275b(), abstractRunnableC1845b));
    }

    /* renamed from: f */
    public final T m35268f() {
        return this.f5578k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void m35263k() {
        this.f5569b.m35277f("reportBinderDeath", new Object[0]);
        InterfaceC1849f interfaceC1849f = this.f5575h.get();
        if (interfaceC1849f != null) {
            this.f5569b.m35277f("calling onBinderDied", new Object[0]);
            interfaceC1849f.m35274c();
            return;
        }
        this.f5569b.m35277f("%s : Binder has died.", this.f5570c);
        List<AbstractRunnableC1845b> list = this.f5571d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3973l<?> m35275b = list.get(i).m35275b();
            if (m35275b != null) {
                m35275b.m28499d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f5570c).concat(" : Binder has died.")));
            }
        }
        this.f5571d.clear();
    }
}
