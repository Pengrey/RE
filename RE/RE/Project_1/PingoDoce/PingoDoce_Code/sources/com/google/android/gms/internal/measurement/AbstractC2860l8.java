package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.l8 */
/* loaded from: classes.dex */
abstract class AbstractC2860l8 {

    /* renamed from: a */
    private static final Logger f7836a = Logger.getLogger(AbstractC3062y7.class.getName());

    /* renamed from: b */
    private static final String f7837b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    AbstractC2860l8() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2732d8 m32487b(Class cls) {
        String format;
        ClassLoader classLoader = AbstractC2860l8.class.getClassLoader();
        if (cls.equals(C2732d8.class)) {
            format = f7837b;
        } else if (cls.getPackage().equals(AbstractC2860l8.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (C2732d8) cls.cast(((AbstractC2860l8) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m32488a());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException(e);
                    } catch (NoSuchMethodException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (InvocationTargetException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC2860l8.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC2860l8) it.next()).m32488a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f7836a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C2732d8) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2732d8) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* renamed from: a */
    protected abstract C2732d8 m32488a();
}
