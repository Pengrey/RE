package p155i7;

import android.os.Looper;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: i7.b */
/* loaded from: classes.dex */
public final class C6043b {

    /* renamed from: a */
    private static volatile ClassLoader f16690a;

    /* renamed from: b */
    private static volatile Thread f16691b;

    /* renamed from: a */
    public static synchronized ClassLoader m22308a() {
        ClassLoader classLoader;
        synchronized (C6043b.class) {
            if (f16690a == null) {
                f16690a = m22307b();
            }
            classLoader = f16690a;
        }
        return classLoader;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m22307b() {
        synchronized (C6043b.class) {
            ClassLoader classLoader = null;
            if (f16691b == null) {
                f16691b = m22306c();
                if (f16691b == null) {
                    return null;
                }
            }
            synchronized (f16691b) {
                try {
                    classLoader = f16691b.getContextClassLoader();
                } catch (SecurityException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    private static synchronized Thread m22306c() {
        SecurityException e;
        C6042a c6042a;
        C6042a c6042a2;
        ThreadGroup threadGroup;
        synchronized (C6043b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            c6042a2 = null;
                            break;
                        }
                        c6042a2 = threadArr[i];
                        if ("GmsDynamite".equals(c6042a2.getName())) {
                            break;
                        }
                        i++;
                    }
                } catch (SecurityException e2) {
                    e = e2;
                    c6042a = null;
                }
                if (c6042a2 == null) {
                    try {
                        c6042a = new C6042a(threadGroup, "GmsDynamite");
                    } catch (SecurityException e3) {
                        e = e3;
                        c6042a = c6042a2;
                    }
                    try {
                        c6042a.setContextClassLoader(null);
                        c6042a.start();
                    } catch (SecurityException e4) {
                        e = e4;
                        String valueOf = String.valueOf(e.getMessage());
                        Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                        c6042a2 = c6042a;
                        return c6042a2;
                    }
                    c6042a2 = c6042a;
                }
            }
            return c6042a2;
        }
    }
}
