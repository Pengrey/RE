package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0946e;
import androidx.core.provider.C1038g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.e */
/* loaded from: classes.dex */
class C0990e extends C0995j {

    /* renamed from: b */
    private static Class<?> f3289b = null;

    /* renamed from: c */
    private static Constructor<?> f3290c = null;

    /* renamed from: d */
    private static Method f3291d = null;

    /* renamed from: e */
    private static Method f3292e = null;

    /* renamed from: f */
    private static boolean f3293f = false;

    /* renamed from: k */
    private static boolean m38834k(Object obj, String str, int i, boolean z) {
        m38831n();
        try {
            return ((Boolean) f3291d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface m38833l(Object obj) {
        m38831n();
        try {
            Object newInstance = Array.newInstance(f3289b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3292e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m38832m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m38831n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3293f) {
            return;
        }
        f3293f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f3290c = constructor;
        f3289b = cls;
        f3291d = method2;
        f3292e = method;
    }

    /* renamed from: o */
    private static Object m38830o() {
        m38831n();
        try {
            return f3290c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: b */
    public Typeface mo38808b(Context context, C0946e.C0949c c0949c, Resources resources, int i) {
        C0946e.C0950d[] m39018a;
        Object m38830o = m38830o();
        for (C0946e.C0950d c0950d : c0949c.m39018a()) {
            File m38789e = C0999k.m38789e(context);
            if (m38789e == null) {
                return null;
            }
            try {
                if (!C0999k.m38791c(m38789e, resources, c0950d.m39016b())) {
                    return null;
                }
                if (!m38834k(m38830o, m38789e.getPath(), c0950d.m39013e(), c0950d.m39012f())) {
                    return null;
                }
                m38789e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m38789e.delete();
            }
        }
        return m38833l(m38830o);
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: c */
    public Typeface mo38807c(Context context, CancellationSignal cancellationSignal, C1038g.C1040b[] c1040bArr, int i) {
        if (c1040bArr.length < 1) {
            return null;
        }
        C1038g.C1040b mo38802h = mo38802h(c1040bArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo38802h.m38697d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m38832m = m38832m(openFileDescriptor);
            if (m38832m != null && m38832m.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m38832m);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface mo38806d = super.mo38806d(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return mo38806d;
        } catch (IOException unused) {
            return null;
        }
    }
}
