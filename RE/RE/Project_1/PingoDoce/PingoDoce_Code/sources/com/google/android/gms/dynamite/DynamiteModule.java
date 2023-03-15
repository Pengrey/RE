package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p078e7.C5005f;
import p133h7.BinderC5870d;
import p133h7.InterfaceC5867b;
import p155i7.C6043b;
import p155i7.C6045d;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: c */
    public static final InterfaceC2637a f7572c;

    /* renamed from: d */
    public static final InterfaceC2637a f7573d;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    private static Boolean f7574e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    private static String f7575f = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g */
    private static boolean f7576g = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    private static int f7577h = -1;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: l */
    private static C2652m f7581l;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: m */
    private static C2653n f7582m;

    /* renamed from: a */
    private final Context f7583a;

    /* renamed from: i */
    private static final ThreadLocal<C2650k> f7578i = new ThreadLocal<>();

    /* renamed from: j */
    private static final ThreadLocal<Long> f7579j = new C2641b();

    /* renamed from: k */
    private static final InterfaceC2637a.InterfaceC2638a f7580k = new C2642c();

    /* renamed from: b */
    public static final InterfaceC2637a f7571b = new C2643d();

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, C6045d c6045d) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th2, C6045d c6045d) {
            super(str, th2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2637a {

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        /* loaded from: classes.dex */
        public interface InterfaceC2638a {
            /* renamed from: a */
            int mo32971a(Context context, String str);

            /* renamed from: b */
            int mo32970b(Context context, String str, boolean z) throws LoadingException;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        /* loaded from: classes.dex */
        public static class C2639b {

            /* renamed from: a */
            public int f7584a = 0;

            /* renamed from: b */
            public int f7585b = 0;

            /* renamed from: c */
            public int f7586c = 0;
        }

        /* renamed from: a */
        C2639b mo32972a(Context context, String str, InterfaceC2638a interfaceC2638a) throws LoadingException;
    }

    static {
        new C2644e();
        new C2645f();
        f7572c = new C2646g();
        f7573d = new C2647h();
        new C2648i();
        new C2649j();
    }

    private DynamiteModule(Context context) {
        C2597i.m33076j(context);
        this.f7583a = context;
    }

    /* renamed from: a */
    public static int m32983a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".");
            sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!C13701c.m575a(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
                sb3.append("Module descriptor id '");
                sb3.append(valueOf);
                sb3.append("' didn't match expected id '");
                sb3.append(str);
                sb3.append("'");
                Log.e("DynamiteModule", sb3.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m32981c(Context context, String str) {
        return m32978f(context, str, false);
    }

    /* renamed from: e */
    public static DynamiteModule m32979e(Context context, InterfaceC2637a interfaceC2637a, String str) throws LoadingException {
        Boolean bool;
        InterfaceC5867b m32966U1;
        DynamiteModule dynamiteModule;
        C2653n c2653n;
        Boolean valueOf;
        InterfaceC5867b m32962H;
        ThreadLocal<C2650k> threadLocal = f7578i;
        C2650k c2650k = threadLocal.get();
        C2650k c2650k2 = new C2650k(null);
        threadLocal.set(c2650k2);
        ThreadLocal<Long> threadLocal2 = f7579j;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            InterfaceC2637a.C2639b mo32972a = interfaceC2637a.mo32972a(context, str, f7580k);
            int i = mo32972a.f7584a;
            int i2 = mo32972a.f7585b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i2);
            Log.i("DynamiteModule", sb2.toString());
            int i3 = mo32972a.f7586c;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (mo32972a.f7584a != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || mo32972a.f7585b != 0) {
                    if (i3 == -1) {
                        DynamiteModule m32976h = m32976h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = c2650k2.f7587a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(c2650k);
                        return m32976h;
                    } else if (i3 == 1) {
                        try {
                            int i4 = mo32972a.f7585b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    bool = f7574e;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str);
                                        sb3.append(", version >= ");
                                        sb3.append(i4);
                                        Log.i("DynamiteModule", sb3.toString());
                                        synchronized (DynamiteModule.class) {
                                            c2653n = f7582m;
                                        }
                                        if (c2653n != null) {
                                            C2650k c2650k3 = threadLocal.get();
                                            if (c2650k3 != null && c2650k3.f7587a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = c2650k3.f7587a;
                                                BinderC5870d.m22835S1(null);
                                                synchronized (DynamiteModule.class) {
                                                    valueOf = Boolean.valueOf(f7577h >= 2);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    m32962H = c2653n.m32961S1(BinderC5870d.m22835S1(applicationContext), str, i4, BinderC5870d.m22835S1(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    m32962H = c2653n.m32962H(BinderC5870d.m22835S1(applicationContext), str, i4, BinderC5870d.m22835S1(cursor2));
                                                }
                                                Context context2 = (Context) BinderC5870d.m22836H(m32962H);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i4);
                                        Log.i("DynamiteModule", sb4.toString());
                                        C2652m m32973k = m32973k(context);
                                        if (m32973k != null) {
                                            int m32969H = m32973k.m32969H();
                                            if (m32969H >= 3) {
                                                C2650k c2650k4 = threadLocal.get();
                                                if (c2650k4 != null) {
                                                    m32966U1 = m32973k.m32965V1(BinderC5870d.m22835S1(context), str, i4, BinderC5870d.m22835S1(c2650k4.f7587a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (m32969H == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                m32966U1 = m32973k.m32964W1(BinderC5870d.m22835S1(context), str, i4);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                m32966U1 = m32973k.m32966U1(BinderC5870d.m22835S1(context), str, i4);
                                            }
                                            if (BinderC5870d.m22836H(m32966U1) != null) {
                                                dynamiteModule = new DynamiteModule((Context) BinderC5870d.m22836H(m32966U1));
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = c2650k2.f7587a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(c2650k);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, null);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th2) {
                                C5005f.m25915a(context, th2);
                                throw new LoadingException("Failed to load remote module.", th2, null);
                            }
                        } catch (LoadingException e3) {
                            String valueOf2 = String.valueOf(e3.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i5 = mo32972a.f7584a;
                            if (i5 != 0 && interfaceC2637a.mo32972a(context, str, new C2651l(i5, 0)).f7586c == -1) {
                                DynamiteModule m32976h2 = m32976h(context, str);
                                if (longValue == 0) {
                                    f7579j.remove();
                                } else {
                                    f7579j.set(Long.valueOf(longValue));
                                }
                                Cursor cursor4 = c2650k2.f7587a;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                f7578i.set(c2650k);
                                return m32976h2;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                        }
                    } else {
                        StringBuilder sb5 = new StringBuilder(47);
                        sb5.append("VersionPolicy returned invalid code:");
                        sb5.append(i3);
                        throw new LoadingException(sb5.toString(), null);
                    }
                }
            }
            int i6 = mo32972a.f7584a;
            int i7 = mo32972a.f7585b;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 92);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i6);
            sb6.append(" and remote version is ");
            sb6.append(i7);
            sb6.append(".");
            throw new LoadingException(sb6.toString(), null);
        } catch (Throwable th3) {
            if (longValue == 0) {
                f7579j.remove();
            } else {
                f7579j.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = c2650k2.f7587a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f7578i.set(c2650k);
            throw th3;
        }
    }

    /* renamed from: f */
    public static int m32978f(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th2;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f7574e;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    m32975i(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else {
                            if (!f7576g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m32977g = m32977g(context, str, z);
                                        String str2 = f7575f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader m22308a = C6043b.m22308a();
                                            if (m22308a == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f7575f;
                                                    C2597i.m33076j(str3);
                                                    m22308a = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f7575f;
                                                    C2597i.m33076j(str4);
                                                    m22308a = new C2640a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m32975i(m22308a);
                                            declaredField.set(null, m22308a);
                                            f7574e = bool2;
                                            return m32977g;
                                        }
                                        return m32977g;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f7574e = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                int i = 0;
                if (booleanValue) {
                    try {
                        return m32977g(context, str, z);
                    } catch (LoadingException e3) {
                        String valueOf = String.valueOf(e3.getMessage());
                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                C2652m m32973k = m32973k(context);
                try {
                    if (m32973k != null) {
                        try {
                            int m32969H = m32973k.m32969H();
                            if (m32969H >= 3) {
                                C2650k c2650k = f7578i.get();
                                if (c2650k != null && (cursor = c2650k.f7587a) != null) {
                                    i = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) BinderC5870d.m22836H(m32973k.m32963X1(BinderC5870d.m22835S1(context), str, z, f7579j.get().longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                if (i2 <= 0 || !m32974j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            String valueOf2 = String.valueOf(e.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th2;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (m32969H == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = m32973k.m32967T1(BinderC5870d.m22835S1(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = m32973k.m32968S1(BinderC5870d.m22835S1(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return i;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            C5005f.m25915a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m32977g(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f7579j     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            if (r10 == 0) goto La0
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r11 == 0) goto La0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f7575f = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f7577h = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = r11
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.f7576g = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = m32974j(r10)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L8e:
            if (r11 != 0) goto L96
            if (r10 == 0) goto L95
            r10.close()
        L95:
            return r12
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L9e:
            r11 = move-exception
            goto Lb5
        La0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        Laf:
            r10 = move-exception
            r11 = r10
            goto Lc4
        Lb2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> Lc2
            if (r12 == 0) goto Lba
            throw r11     // Catch: java.lang.Throwable -> Lc2
        Lba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch: java.lang.Throwable -> Lc2
            throw r12     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r11 = move-exception
            r0 = r10
        Lc4:
            if (r0 == 0) goto Lc9
            r0.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m32977g(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: h */
    private static DynamiteModule m32976h(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: i */
    private static void m32975i(ClassLoader classLoader) throws LoadingException {
        C2653n c2653n;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c2653n = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C2653n) {
                    c2653n = (C2653n) queryLocalInterface;
                } else {
                    c2653n = new C2653n(iBinder);
                }
            }
            f7582m = c2653n;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: j */
    private static boolean m32974j(Cursor cursor) {
        C2650k c2650k = f7578i.get();
        if (c2650k == null || c2650k.f7587a != null) {
            return false;
        }
        c2650k.f7587a = cursor;
        return true;
    }

    /* renamed from: k */
    private static C2652m m32973k(Context context) {
        C2652m c2652m;
        synchronized (DynamiteModule.class) {
            C2652m c2652m2 = f7581l;
            if (c2652m2 != null) {
                return c2652m2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c2652m = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c2652m = queryLocalInterface instanceof C2652m ? (C2652m) queryLocalInterface : new C2652m(iBinder);
                }
                if (c2652m != null) {
                    f7581l = c2652m;
                    return c2652m;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    /* renamed from: b */
    public Context m32982b() {
        return this.f7583a;
    }

    /* renamed from: d */
    public IBinder m32980d(String str) throws LoadingException {
        try {
            return (IBinder) this.f7583a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }
}
