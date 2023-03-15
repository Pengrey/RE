package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.n5 */
/* loaded from: classes.dex */
public final class C2889n5 {

    /* renamed from: f */
    static HashMap f7872f;

    /* renamed from: k */
    private static Object f7877k;

    /* renamed from: l */
    private static boolean f7878l;

    /* renamed from: a */
    public static final Uri f7867a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f7868b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f7869c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f7870d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    private static final AtomicBoolean f7871e = new AtomicBoolean();

    /* renamed from: g */
    static final HashMap f7873g = new HashMap();

    /* renamed from: h */
    static final HashMap f7874h = new HashMap();

    /* renamed from: i */
    static final HashMap f7875i = new HashMap();

    /* renamed from: j */
    static final HashMap f7876j = new HashMap();

    /* renamed from: m */
    static final String[] f7879m = new String[0];

    /* renamed from: a */
    public static String m32442a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C2889n5.class) {
            if (f7872f == null) {
                f7871e.set(false);
                f7872f = new HashMap();
                f7877k = new Object();
                f7878l = false;
                contentResolver.registerContentObserver(f7867a, true, new C2873m5(null));
            } else if (f7871e.getAndSet(false)) {
                f7872f.clear();
                f7873g.clear();
                f7874h.clear();
                f7875i.clear();
                f7876j.clear();
                f7877k = new Object();
                f7878l = false;
            }
            Object obj = f7877k;
            if (f7872f.containsKey(str)) {
                String str3 = (String) f7872f.get(str);
                if (str3 != null) {
                    r3 = str3;
                }
                return r3;
            }
            int length = f7879m.length;
            Cursor query = contentResolver.query(f7867a, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    m32440c(obj, str, null);
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                m32440c(obj, str, string);
                return string != null ? string : null;
            } finally {
                query.close();
            }
        }
    }

    /* renamed from: c */
    private static void m32440c(Object obj, String str, String str2) {
        synchronized (C2889n5.class) {
            if (obj == f7877k) {
                f7872f.put(str, str2);
            }
        }
    }
}
