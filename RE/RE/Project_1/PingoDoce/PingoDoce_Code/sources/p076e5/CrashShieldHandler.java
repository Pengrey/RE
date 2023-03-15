package p076e5;

import android.os.Handler;
import android.os.Looper;
import com.facebook.C2290b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p027b5.ExceptionAnalyzer;
import p027b5.InstrumentData;
import p181jd.Intrinsics;

/* renamed from: e5.a */
/* loaded from: classes.dex */
public final class CrashShieldHandler {

    /* renamed from: a */
    private static final Set f13912a;

    /* renamed from: b */
    private static boolean f13913b;

    /* compiled from: CrashShieldHandler.kt */
    /* renamed from: e5.a$a */
    /* loaded from: classes.dex */
    public static final class RunnableC4986a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Throwable f13914w;

        RunnableC4986a(Throwable th2) {
            this.f13914w = th2;
        }

        public void run() {
            throw new RuntimeException(this.f13914w);
        }
    }

    static {
        new CrashShieldHandler();
        f13912a = Collections.newSetFromMap(new WeakHashMap());
    }

    private CrashShieldHandler() {
    }

    /* renamed from: a */
    public static final void m25966a() {
        f13913b = true;
    }

    /* renamed from: b */
    public static final void m25965b(Throwable th2, Object obj) {
        Intrinsics.isThisObjectNull(obj, "o");
        if (f13913b) {
            f13912a.add(obj);
            if (C2290b.m34106i()) {
                ExceptionAnalyzer.m35325b(th2);
                InstrumentData.C1812a.m35314b(th2, InstrumentData.EnumC1814c.CrashShield).m35316g();
            }
            m25962e(th2);
        }
    }

    /* renamed from: c */
    public static final boolean m25964c() {
        return false;
    }

    /* renamed from: d */
    public static final boolean m25963d(Object obj) {
        Intrinsics.isThisObjectNull(obj, "o");
        return f13912a.contains(obj);
    }

    /* renamed from: e */
    public static final void m25962e(Throwable th2) {
        if (m25964c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC4986a(th2));
        }
    }
}
