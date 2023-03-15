package p396v3;

import android.os.SystemClock;
import java.io.File;

/* renamed from: v3.l */
/* loaded from: classes.dex */
final class C11102l {

    /* renamed from: a */
    public static final C11102l f28494a = new C11102l();

    /* renamed from: b */
    private static final File f28495b = new File("/proc/self/fd");

    /* renamed from: c */
    private static int f28496c = 30;

    /* renamed from: d */
    private static long f28497d = SystemClock.uptimeMillis();

    /* renamed from: e */
    private static boolean f28498e = true;

    private C11102l() {
    }

    /* renamed from: a */
    private final boolean m6125a() {
        int i = f28496c;
        f28496c = i + 1;
        return i >= 30 || SystemClock.uptimeMillis() > f28497d + ((long) 30000);
    }

    /* renamed from: b */
    public final synchronized boolean m6124b(InterfaceC11108q interfaceC11108q) {
        if (m6125a()) {
            f28496c = 0;
            f28497d = SystemClock.uptimeMillis();
            String[] list = f28495b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            boolean z = length < 800;
            f28498e = z;
            if (!z && interfaceC11108q != null && interfaceC11108q.m6116a() <= 5) {
                interfaceC11108q.m6115b("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
            }
        }
        return f28498e;
    }
}
