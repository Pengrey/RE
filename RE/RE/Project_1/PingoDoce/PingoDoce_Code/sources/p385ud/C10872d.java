package p385ud;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import p468yc.C13183m;
import p468yc.C13186n;

/* renamed from: ud.d */
/* loaded from: classes2.dex */
public final class C10872d {
    private static volatile Choreographer choreographer;

    static {
        Object m1458a;
        try {
            C13183m.C13184a c13184a = C13183m.f34143w;
            m1458a = C13183m.m1458a(new C10868b(m6811a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m1458a = C13183m.m1458a(C13186n.m1454a(th2));
        }
        AbstractC10871c abstractC10871c = C13183m.m1456c(m1458a) ? null : m1458a;
    }

    /* renamed from: a */
    public static final Handler m6811a(Looper looper, boolean z) {
        int i;
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    /* renamed from: b */
    public static final AbstractC10871c m6810b(Handler handler, String str) {
        return new C10868b(handler, str);
    }
}
