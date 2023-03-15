package p177j9;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p136ha.InterfaceC5882b;

/* renamed from: j9.g */
/* loaded from: classes.dex */
public final class C6383g<T> {

    /* renamed from: a */
    private final T f17433a;

    /* renamed from: b */
    private final InterfaceC6386c<T> f17434b;

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: j9.g$b */
    /* loaded from: classes.dex */
    private static class C6385b implements InterfaceC6386c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f17435a;

        /* renamed from: b */
        private Bundle m21089b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f17435a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f17435a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p177j9.C6383g.InterfaceC6386c
        /* renamed from: c */
        public List<String> mo21087a(Context context) {
            Bundle m21089b = m21089b(context);
            if (m21089b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m21089b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m21089b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private C6385b(Class<? extends Service> cls) {
            this.f17435a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: j9.g$c */
    /* loaded from: classes.dex */
    interface InterfaceC6386c<T> {
        /* renamed from: a */
        List<String> mo21087a(T t);
    }

    C6383g(T t, InterfaceC6386c<T> interfaceC6386c) {
        this.f17433a = t;
        this.f17434b = interfaceC6386c;
    }

    /* renamed from: c */
    public static C6383g<Context> m21092c(Context context, Class<? extends Service> cls) {
        return new C6383g<>(context, new C6385b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static InterfaceC6388i m21091d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (InterfaceC6388i.class.isAssignableFrom(cls)) {
                return (InterfaceC6388i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    /* renamed from: b */
    public List<InterfaceC5882b<InterfaceC6388i>> m21093b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f17434b.mo21087a(this.f17433a)) {
            arrayList.add(new InterfaceC5882b() { // from class: j9.f
                @Override // p136ha.InterfaceC5882b
                public final Object get() {
                    InterfaceC6388i m21091d;
                    m21091d = C6383g.m21091d(str);
                    return m21091d;
                }
            });
        }
        return arrayList;
    }
}
