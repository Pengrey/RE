package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.C0955h;
import androidx.core.util.C1070c;
import androidx.core.util.C1076h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.h */
/* loaded from: classes.dex */
public final class C0955h {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3223a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C0960e, SparseArray<C0959d>> f3224b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3225c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.res.h$a */
    /* loaded from: classes.dex */
    static class C0956a {
        /* renamed from: a */
        static Drawable m38986a(Resources resources, int i, int i2) {
            return resources.getDrawableForDensity(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.res.h$b */
    /* loaded from: classes.dex */
    public static class C0957b {
        /* renamed from: a */
        static Drawable m38985a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        static Drawable m38984b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.res.h$c */
    /* loaded from: classes.dex */
    public static class C0958c {
        /* renamed from: a */
        static int m38983a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        static ColorStateList m38982b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.res.h$d */
    /* loaded from: classes.dex */
    public static class C0959d {

        /* renamed from: a */
        final ColorStateList f3226a;

        /* renamed from: b */
        final Configuration f3227b;

        /* renamed from: c */
        final int f3228c;

        C0959d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f3226a = colorStateList;
            this.f3227b = configuration;
            this.f3228c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.res.h$e */
    /* loaded from: classes.dex */
    public static final class C0960e {

        /* renamed from: a */
        final Resources f3229a;

        /* renamed from: b */
        final Resources.Theme f3230b;

        C0960e(Resources resources, Resources.Theme theme) {
            this.f3229a = resources;
            this.f3230b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0960e.class != obj.getClass()) {
                return false;
            }
            C0960e c0960e = (C0960e) obj;
            return this.f3229a.equals(c0960e.f3229a) && C1070c.m38634a(this.f3230b, c0960e.f3230b);
        }

        public int hashCode() {
            return C1070c.m38633b(this.f3229a, this.f3230b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.res.h$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0961f {
        /* renamed from: e */
        public static Handler m38977e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m38979c(final int i, Handler handler) {
            m38977e(handler).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    C0955h.AbstractC0961f.this.m38976f(i);
                }
            });
        }

        /* renamed from: d */
        public final void m38978d(final Typeface typeface, Handler handler) {
            m38977e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    C0955h.AbstractC0961f.this.m38975g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void m38976f(int i);

        /* renamed from: i */
        public abstract void m38975g(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: androidx.core.content.res.h$g */
    /* loaded from: classes.dex */
    public static final class C0962g {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.res.h$g$a */
        /* loaded from: classes.dex */
        static class C0963a {

            /* renamed from: a */
            private static final Object f3231a = new Object();

            /* renamed from: b */
            private static Method f3232b;

            /* renamed from: c */
            private static boolean f3233c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            static void m38973a(Resources.Theme theme) {
                synchronized (f3231a) {
                    if (!f3233c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f3232b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f3233c = true;
                    }
                    Method method = f3232b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f3232b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: androidx.core.content.res.h$g$b */
        /* loaded from: classes.dex */
        static class C0964b {
            /* renamed from: a */
            static void m38972a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m38974a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0964b.m38972a(theme);
            } else if (i >= 23) {
                C0963a.m38973a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m39000a(C0960e c0960e, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3225c) {
            WeakHashMap<C0960e, SparseArray<C0959d>> weakHashMap = f3224b;
            SparseArray<C0959d> sparseArray = weakHashMap.get(c0960e);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(c0960e, sparseArray);
            }
            sparseArray.append(i, new C0959d(colorStateList, c0960e.f3229a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    private static ColorStateList m38999b(C0960e c0960e, int i) {
        C0959d c0959d;
        Resources.Theme theme;
        synchronized (f3225c) {
            SparseArray<C0959d> sparseArray = f3224b.get(c0960e);
            if (sparseArray != null && sparseArray.size() > 0 && (c0959d = sparseArray.get(i)) != null) {
                if (c0959d.f3227b.equals(c0960e.f3229a.getConfiguration()) && (((theme = c0960e.f3230b) == null && c0959d.f3228c == 0) || (theme != null && c0959d.f3228c == theme.hashCode()))) {
                    return c0959d.f3226a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static Typeface m38998c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m38988m(context, i, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: d */
    public static ColorStateList m38997d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        C0960e c0960e = new C0960e(resources, theme);
        ColorStateList m38999b = m38999b(c0960e, i);
        if (m38999b != null) {
            return m38999b;
        }
        ColorStateList m38990k = m38990k(resources, i, theme);
        if (m38990k != null) {
            m39000a(c0960e, i, m38990k, theme);
            return m38990k;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return C0958c.m38982b(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    /* renamed from: e */
    public static Drawable m38996e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0957b.m38985a(resources, i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: f */
    public static Drawable m38995f(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C0957b.m38984b(resources, i, i2, theme);
        }
        if (i3 >= 15) {
            return C0956a.m38986a(resources, i, i2);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: g */
    public static Typeface m38994g(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m38988m(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: h */
    public static Typeface m38993h(Context context, int i, TypedValue typedValue, int i2, AbstractC0961f abstractC0961f) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m38988m(context, i, typedValue, i2, abstractC0961f, null, true, false);
    }

    /* renamed from: i */
    public static void m38992i(Context context, int i, AbstractC0961f abstractC0961f, Handler handler) throws Resources.NotFoundException {
        C1076h.m38619f(abstractC0961f);
        if (context.isRestricted()) {
            abstractC0961f.m38979c(-4, handler);
        } else {
            m38988m(context, i, new TypedValue(), 0, abstractC0961f, handler, false, false);
        }
    }

    /* renamed from: j */
    private static TypedValue m38991j() {
        ThreadLocal<TypedValue> threadLocal = f3223a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: k */
    private static ColorStateList m38990k(Resources resources, int i, Resources.Theme theme) {
        if (m38989l(resources, i)) {
            return null;
        }
        try {
            return C0944c.m39047a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: l */
    private static boolean m38989l(Resources resources, int i) {
        TypedValue m38991j = m38991j();
        resources.getValue(i, m38991j, true);
        int i2 = m38991j.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: m */
    private static Typeface m38988m(Context context, int i, TypedValue typedValue, int i2, AbstractC0961f abstractC0961f, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m38987n = m38987n(context, resources, typedValue, i, i2, abstractC0961f, handler, z, z2);
        if (m38987n == null && abstractC0961f == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m38987n;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m38987n(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0955h.AbstractC0961f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lbb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.m38979c(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C0975d.m38912f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.m38978d(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            androidx.core.content.res.e$b r2 = androidx.core.content.res.C0946e.m39026b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L58
            r11.m38979c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C0975d.m38915c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C0975d.m38914d(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.m38978d(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            goto L89
        L86:
            r11.m38979c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb5
        La0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb5:
            if (r11 == 0) goto Lba
            r11.m38979c(r15, r12)
        Lba:
            return r16
        Lbb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0955h.m38987n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
