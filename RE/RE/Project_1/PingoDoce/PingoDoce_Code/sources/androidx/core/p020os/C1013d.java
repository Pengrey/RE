package androidx.core.p020os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.d */
/* loaded from: classes.dex */
public final class C1013d {

    /* compiled from: HandlerCompat.java */
    /* renamed from: androidx.core.os.d$a */
    /* loaded from: classes.dex */
    private static class C1014a {
        /* renamed from: a */
        public static Handler m38750a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: a */
    public static Handler m38751a(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return C1014a.m38750a(looper);
        }
        if (i >= 17) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException e) {
                e = e;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                return new Handler(looper);
            } catch (InstantiationException e2) {
                e = e2;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                return new Handler(looper);
            } catch (NoSuchMethodException e3) {
                e = e3;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                return new Handler(looper);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
        }
        return new Handler(looper);
    }
}
