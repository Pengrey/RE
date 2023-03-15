package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0946e;
import androidx.core.provider.C1038g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.g */
/* loaded from: classes.dex */
public class C0992g extends C0990e {

    /* renamed from: g */
    protected final Class<?> f3298g;

    /* renamed from: h */
    protected final Constructor<?> f3299h;

    /* renamed from: i */
    protected final Method f3300i;

    /* renamed from: j */
    protected final Method f3301j;

    /* renamed from: k */
    protected final Method f3302k;

    /* renamed from: l */
    protected final Method f3303l;

    /* renamed from: m */
    protected final Method f3304m;

    public C0992g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> m38815y = m38815y();
            constructor = m38814z(m38815y);
            method2 = m38817v(m38815y);
            method3 = m38816w(m38815y);
            method4 = m38825A(m38815y);
            method5 = m38818u(m38815y);
            method = mo38812x(m38815y);
            cls = m38815y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f3298g = cls;
        this.f3299h = constructor;
        this.f3300i = method2;
        this.f3301j = method3;
        this.f3302k = method4;
        this.f3303l = method5;
        this.f3304m = method;
    }

    /* renamed from: o */
    private Object m38824o() {
        try {
            return this.f3299h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m38823p(Object obj) {
        try {
            this.f3303l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m38822q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3300i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m38821r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f3301j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m38820s(Object obj) {
        try {
            return ((Boolean) this.f3302k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m38819t() {
        if (this.f3300i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f3300i != null;
    }

    /* renamed from: A */
    protected Method m38825A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // androidx.core.graphics.C0990e, androidx.core.graphics.C0995j
    /* renamed from: b */
    public Typeface mo38808b(Context context, C0946e.C0949c c0949c, Resources resources, int i) {
        C0946e.C0950d[] m39018a;
        if (!m38819t()) {
            return super.mo38808b(context, c0949c, resources, i);
        }
        Object m38824o = m38824o();
        if (m38824o == null) {
            return null;
        }
        for (C0946e.C0950d c0950d : c0949c.m39018a()) {
            if (!m38822q(context, m38824o, c0950d.m39017a(), c0950d.m39015c(), c0950d.m39013e(), c0950d.m39012f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0950d.m39014d()))) {
                m38823p(m38824o);
                return null;
            }
        }
        if (m38820s(m38824o)) {
            return mo38813l(m38824o);
        }
        return null;
    }

    @Override // androidx.core.graphics.C0990e, androidx.core.graphics.C0995j
    /* renamed from: c */
    public Typeface mo38807c(Context context, CancellationSignal cancellationSignal, C1038g.C1040b[] c1040bArr, int i) {
        Typeface mo38813l;
        if (c1040bArr.length < 1) {
            return null;
        }
        if (!m38819t()) {
            C1038g.C1040b mo38802h = mo38802h(c1040bArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo38802h.m38697d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo38802h.m38696e()).setItalic(mo38802h.m38695f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m38786h = C0999k.m38786h(context, c1040bArr, cancellationSignal);
        Object m38824o = m38824o();
        if (m38824o == null) {
            return null;
        }
        boolean z = false;
        for (C1038g.C1040b c1040b : c1040bArr) {
            ByteBuffer byteBuffer = m38786h.get(c1040b.m38697d());
            if (byteBuffer != null) {
                if (!m38821r(m38824o, byteBuffer, c1040b.m38698c(), c1040b.m38696e(), c1040b.m38695f() ? 1 : 0)) {
                    m38823p(m38824o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m38823p(m38824o);
            return null;
        } else if (m38820s(m38824o) && (mo38813l = mo38813l(m38824o)) != null) {
            return Typeface.create(mo38813l, i);
        } else {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0995j
    /* renamed from: e */
    public Typeface mo38805e(Context context, Resources resources, int i, String str, int i2) {
        if (!m38819t()) {
            return super.mo38805e(context, resources, i, str, i2);
        }
        Object m38824o = m38824o();
        if (m38824o == null) {
            return null;
        }
        if (!m38822q(context, m38824o, str, 0, -1, -1, null)) {
            m38823p(m38824o);
            return null;
        } else if (m38820s(m38824o)) {
            return mo38813l(m38824o);
        } else {
            return null;
        }
    }

    /* renamed from: l */
    protected Typeface mo38813l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3298g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3304m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: u */
    protected Method m38818u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    protected Method m38817v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    protected Method m38816w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    protected Method mo38812x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    protected Class<?> m38815y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    protected Constructor<?> m38814z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
