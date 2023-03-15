package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* loaded from: classes.dex */
public abstract class AbstractC2890n6 {

    /* renamed from: g */
    private static final Object f7880g = new Object();
    @Nullable

    /* renamed from: h */
    private static volatile AbstractC2858l6 f7881h;

    /* renamed from: i */
    private static final AtomicInteger f7882i;

    /* renamed from: j */
    public static final /* synthetic */ int f7883j = 0;

    /* renamed from: a */
    final C2842k6 f7884a;

    /* renamed from: b */
    final String f7885b;

    /* renamed from: c */
    private final Object f7886c;

    /* renamed from: d */
    private volatile int f7887d = -1;

    /* renamed from: e */
    private volatile Object f7888e;

    /* renamed from: f */
    private final boolean f7889f;

    static {
        new AtomicReference();
        new C2922p6(C2746e6.f7720a, null);
        f7882i = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC2890n6(C2842k6 c2842k6, String str, Object obj, boolean z, C2874m6 c2874m6) {
        if (c2842k6.f7814b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f7884a = c2842k6;
        this.f7885b = str;
        this.f7886c = obj;
        this.f7889f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m32436d() {
        f7882i.incrementAndGet();
    }

    /* renamed from: e */
    public static void m32435e(final Context context) {
        if (f7881h == null) {
            Object obj = f7880g;
            synchronized (obj) {
                if (f7881h == null) {
                    synchronized (obj) {
                        AbstractC2858l6 abstractC2858l6 = f7881h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (abstractC2858l6 == null || abstractC2858l6.mo32205a() != context) {
                            C2985t5.m32067e();
                            C2906o6.m32335c();
                            C2682a6.m32921e();
                            f7881h = new C2921p5(context, C3076z6.m31691a(new InterfaceC3016v6() { // from class: com.google.android.gms.internal.measurement.f6
                                @Override // com.google.android.gms.internal.measurement.InterfaceC3016v6
                                public final Object zza() {
                                    AbstractC2970s6 m32115c;
                                    AbstractC2970s6 m32115c2;
                                    Context context2 = context;
                                    int i = AbstractC2890n6.f7883j;
                                    String str = Build.TYPE;
                                    String str2 = Build.TAGS;
                                    if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                                        return AbstractC2970s6.m32115c();
                                    }
                                    if (C2905o5.m32337a() && !context2.isDeviceProtectedStorage()) {
                                        context2 = context2.createDeviceProtectedStorageContext();
                                    }
                                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        StrictMode.allowThreadDiskWrites();
                                        try {
                                            File file = new File(context2.getDir("phenotype_hermetic", 0), "overrides.txt");
                                            m32115c = file.exists() ? AbstractC2970s6.m32114d(file) : AbstractC2970s6.m32115c();
                                        } catch (RuntimeException e) {
                                            Log.e("HermeticFileOverrides", "no data dir", e);
                                            m32115c = AbstractC2970s6.m32115c();
                                        }
                                        if (m32115c.mo32005b()) {
                                            File file2 = (File) m32115c.mo32006a();
                                            try {
                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                try {
                                                    HashMap hashMap = new HashMap();
                                                    HashMap hashMap2 = new HashMap();
                                                    while (true) {
                                                        String readLine = bufferedReader.readLine();
                                                        if (readLine == null) {
                                                            break;
                                                        }
                                                        String[] split = readLine.split(" ", 3);
                                                        if (split.length != 3) {
                                                            Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                                                        } else {
                                                            String str3 = new String(split[0]);
                                                            String decode = Uri.decode(new String(split[1]));
                                                            String str4 = (String) hashMap2.get(split[2]);
                                                            if (str4 == null) {
                                                                String str5 = new String(split[2]);
                                                                str4 = Uri.decode(str5);
                                                                if (str4.length() < 1024 || str4 == str5) {
                                                                    hashMap2.put(str5, str4);
                                                                }
                                                            }
                                                            if (!hashMap.containsKey(str3)) {
                                                                hashMap.put(str3, new HashMap());
                                                            }
                                                            ((Map) hashMap.get(str3)).put(decode, str4);
                                                        }
                                                    }
                                                    String obj2 = file2.toString();
                                                    StringBuilder sb2 = new StringBuilder(obj2.length() + 7);
                                                    sb2.append("Parsed ");
                                                    sb2.append(obj2);
                                                    Log.i("HermeticFileOverrides", sb2.toString());
                                                    C2698b6 c2698b6 = new C2698b6(hashMap);
                                                    bufferedReader.close();
                                                    m32115c2 = AbstractC2970s6.m32114d(c2698b6);
                                                } catch (Throwable th2) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (Throwable th3) {
                                                        try {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                    throw th2;
                                                }
                                            } catch (IOException e2) {
                                                throw new RuntimeException(e2);
                                            }
                                        } else {
                                            m32115c2 = AbstractC2970s6.m32115c();
                                        }
                                        return m32115c2;
                                    } finally {
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                }
                            }));
                            f7882i.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    abstract Object mo32439a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0035, B:16:0x0041, B:18:0x004a, B:20:0x005c, B:22:0x0067, B:21:0x0061, B:49:0x00de, B:51:0x00ee, B:53:0x0102, B:54:0x0105, B:55:0x0109, B:37:0x00b6, B:39:0x00bc, B:43:0x00ce, B:45:0x00d4, B:48:0x00dc, B:42:0x00cc, B:24:0x006c, B:26:0x0072, B:28:0x0080, B:32:0x00a5, B:34:0x00af, B:30:0x0097, B:56:0x010e, B:57:0x0113, B:58:0x0114), top: B:65:0x0016 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m32438b() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2890n6.m32438b():java.lang.Object");
    }

    /* renamed from: c */
    public final String m32437c() {
        String str = this.f7884a.f7816d;
        return this.f7885b;
    }
}
