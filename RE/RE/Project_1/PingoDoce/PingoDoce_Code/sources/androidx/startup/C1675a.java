package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p004a3.C0012b;
import p004a3.InterfaceC0011a;
import p025b3.C1795a;

/* renamed from: androidx.startup.a */
/* loaded from: classes.dex */
public final class C1675a {

    /* renamed from: d */
    private static volatile C1675a f5053d;

    /* renamed from: e */
    private static final Object f5054e = new Object();

    /* renamed from: c */
    final Context f5057c;

    /* renamed from: b */
    final Set<Class<? extends InterfaceC0011a<?>>> f5056b = new HashSet();

    /* renamed from: a */
    final Map<Class<?>, Object> f5055a = new HashMap();

    C1675a(Context context) {
        this.f5057c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C1675a m35759c(Context context) {
        if (f5053d == null) {
            synchronized (f5054e) {
                if (f5053d == null) {
                    f5053d = new C1675a(context);
                }
            }
        }
        return f5053d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m35761a() {
        try {
            try {
                C1795a.m35347a("Startup");
                Bundle bundle = this.f5057c.getPackageManager().getProviderInfo(new ComponentName(this.f5057c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f5057c.getString(C0012b.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (InterfaceC0011a.class.isAssignableFrom(cls)) {
                                this.f5056b.add(cls);
                                m35760b(cls, hashSet);
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                throw new StartupException(e);
            }
        } finally {
            C1795a.m35346b();
        }
    }

    /* renamed from: b */
    <T> T m35760b(Class<? extends InterfaceC0011a<?>> cls, Set<Class<?>> set) {
        T t;
        synchronized (f5054e) {
            if (C1795a.m35344d()) {
                C1795a.m35347a(cls.getSimpleName());
            }
            if (!set.contains(cls)) {
                if (!this.f5055a.containsKey(cls)) {
                    set.add(cls);
                    try {
                        InterfaceC0011a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends InterfaceC0011a<?>>> mo36912a = newInstance.mo36912a();
                        if (!mo36912a.isEmpty()) {
                            for (Class<? extends InterfaceC0011a<?>> cls2 : mo36912a) {
                                if (!this.f5055a.containsKey(cls2)) {
                                    m35760b(cls2, set);
                                }
                            }
                        }
                        t = (T) newInstance.mo36911b(this.f5057c);
                        set.remove(cls);
                        this.f5055a.put(cls, t);
                    } catch (Throwable th2) {
                        throw new StartupException(th2);
                    }
                } else {
                    t = (T) this.f5055a.get(cls);
                }
                C1795a.m35346b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
        return t;
    }
}
