package p028b6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b6.e */
/* loaded from: classes.dex */
class C1828e implements InterfaceC1825b {

    /* renamed from: a */
    private final C1829a f5530a;

    /* renamed from: b */
    private final C1826c f5531b;

    /* renamed from: c */
    private final Map<String, InterfaceC1831g> f5532c;

    /* compiled from: MetadataBackendRegistry.java */
    /* renamed from: b6.e$a */
    /* loaded from: classes.dex */
    static class C1829a {

        /* renamed from: a */
        private final Context f5533a;

        /* renamed from: b */
        private Map<String, String> f5534b = null;

        C1829a(Context context) {
            this.f5533a = context;
        }

        /* renamed from: a */
        private Map<String, String> m35290a(Context context) {
            Bundle m35287d = m35287d(context);
            if (m35287d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m35287d.keySet()) {
                Object obj = m35287d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m35288c() {
            if (this.f5534b == null) {
                this.f5534b = m35290a(this.f5533a);
            }
            return this.f5534b;
        }

        /* renamed from: d */
        private static Bundle m35287d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC1824a m35289b(String str) {
            String str2 = m35288c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC1824a) Class.forName(str2).asSubclass(InterfaceC1824a.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1828e(Context context, C1826c c1826c) {
        this(new C1829a(context), c1826c);
    }

    @Override // p028b6.InterfaceC1825b
    /* renamed from: a */
    public synchronized InterfaceC1831g mo35291a(String str) {
        if (this.f5532c.containsKey(str)) {
            return this.f5532c.get(str);
        }
        InterfaceC1824a m35289b = this.f5530a.m35289b(str);
        if (m35289b == null) {
            return null;
        }
        InterfaceC1831g create = m35289b.create(this.f5531b.m35295a(str));
        this.f5532c.put(str, create);
        return create;
    }

    C1828e(C1829a c1829a, C1826c c1826c) {
        this.f5532c = new HashMap();
        this.f5530a = c1829a;
        this.f5531b = c1826c;
    }
}
