package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0946e;
import androidx.core.provider.C1038g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p301q.C9558g;

/* renamed from: androidx.core.graphics.f */
/* loaded from: classes.dex */
class C0991f extends C0995j {

    /* renamed from: b */
    private static final Class<?> f3294b;

    /* renamed from: c */
    private static final Constructor<?> f3295c;

    /* renamed from: d */
    private static final Method f3296d;

    /* renamed from: e */
    private static final Method f3297e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f3295c = constructor;
        f3294b = cls;
        f3296d = method2;
        f3297e = method;
    }

    /* renamed from: k */
    private static boolean m38829k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3296d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m38828l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3294b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3297e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m38827m() {
        Method method = f3296d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m38826n() {
        try {
            return f3295c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: b */
    public Typeface mo38808b(Context context, C0946e.C0949c c0949c, Resources resources, int i) {
        C0946e.C0950d[] m39018a;
        Object m38826n = m38826n();
        if (m38826n == null) {
            return null;
        }
        for (C0946e.C0950d c0950d : c0949c.m39018a()) {
            ByteBuffer m38792b = C0999k.m38792b(context, resources, c0950d.m39016b());
            if (m38792b == null || !m38829k(m38826n, m38792b, c0950d.m39015c(), c0950d.m39013e(), c0950d.m39012f())) {
                return null;
            }
        }
        return m38828l(m38826n);
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: c */
    public Typeface mo38807c(Context context, CancellationSignal cancellationSignal, C1038g.C1040b[] c1040bArr, int i) {
        Object m38826n = m38826n();
        if (m38826n == null) {
            return null;
        }
        C9558g c9558g = new C9558g();
        for (C1038g.C1040b c1040b : c1040bArr) {
            Uri m38697d = c1040b.m38697d();
            ByteBuffer byteBuffer = (ByteBuffer) c9558g.get(m38697d);
            if (byteBuffer == null) {
                byteBuffer = C0999k.m38788f(context, cancellationSignal, m38697d);
                c9558g.put(m38697d, byteBuffer);
            }
            if (byteBuffer == null || !m38829k(m38826n, byteBuffer, c1040b.m38698c(), c1040b.m38696e(), c1040b.m38695f())) {
                return null;
            }
        }
        Typeface m38828l = m38828l(m38826n);
        if (m38828l == null) {
            return null;
        }
        return Typeface.create(m38828l, i);
    }
}
