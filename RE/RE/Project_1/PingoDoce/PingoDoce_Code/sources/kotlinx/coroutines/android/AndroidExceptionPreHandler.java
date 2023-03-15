package kotlinx.coroutines.android;

import android.os.Build;
import bd.CoroutineContext;
import bd.CoroutineContextImpl;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: AndroidExceptionPreHandler.kt */
/* loaded from: classes2.dex */
public final class AndroidExceptionPreHandler extends CoroutineContextImpl implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f18136q);
        this._preHandler = this;
    }

    /* renamed from: D0 */
    private final Method m20172D0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* renamed from: q0 */
    public void mo20171q0(CoroutineContext coroutineContext, Throwable th2) {
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method m20172D0 = m20172D0();
            Object invoke = m20172D0 != null ? m20172D0.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
        }
    }
}
