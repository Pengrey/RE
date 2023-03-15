package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p219l9.C7011f;

/* renamed from: com.google.firebase.crashlytics.internal.common.g */
/* loaded from: classes.dex */
public class C4196g {

    /* renamed from: a */
    private static final char[] f11445a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f11446b = -1;

    /* compiled from: CommonUtils.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.g$a */
    /* loaded from: classes.dex */
    enum EnumC4197a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, EnumC4197a> matcher;

        static {
            EnumC4197a enumC4197a = X86_32;
            EnumC4197a enumC4197a2 = ARMV6;
            EnumC4197a enumC4197a3 = ARMV7;
            EnumC4197a enumC4197a4 = ARM64;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", enumC4197a3);
            hashMap.put("armeabi", enumC4197a2);
            hashMap.put("arm64-v8a", enumC4197a4);
            hashMap.put("x86", enumC4197a);
        }

        static EnumC4197a getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C7011f.m19611f().m19608i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            EnumC4197a enumC4197a = matcher.get(str.toLowerCase(Locale.US));
            return enumC4197a == null ? UNKNOWN : enumC4197a;
        }
    }

    /* renamed from: A */
    public static String m28378A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : BuildConfig.VERSION_NAME;
    }

    /* renamed from: a */
    public static long m28377a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m28376b(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m28375c(Context context) {
        if (m28374d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m28374d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m28373e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C7011f.m19611f().m19612e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m28372f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    static long m28371g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * i;
    }

    /* renamed from: h */
    public static String m28370h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", BuildConfig.VERSION_NAME).toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : arrayList) {
            sb2.append(str2);
        }
        String sb3 = sb2.toString();
        if (sb3.length() > 0) {
            return m28352z(sb3);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m28369i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r3 == 0) goto L36
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            int r4 = r3.length     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r2 = r6
        L36:
            m28373e(r1, r0)
            goto L5f
        L3a:
            r7 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L5b
        L3e:
            r7 = move-exception
            r1 = r2
        L40:
            l9.f r3 = p219l9.C7011f.m19611f()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L59
            r3.m19612e(r6, r7)     // Catch: java.lang.Throwable -> L59
            goto L36
        L59:
            r6 = move-exception
            r2 = r1
        L5b:
            m28373e(r2, r0)
            throw r6
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C4196g.m28369i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m28368j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m28367k(Context context, String str, boolean z) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int m28361q = m28361q(context, str, "bool");
            if (m28361q > 0) {
                return resources.getBoolean(m28361q);
            }
            int m28361q2 = m28361q(context, str, "string");
            if (m28361q2 > 0) {
                return Boolean.parseBoolean(context.getString(m28361q2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static int m28366l() {
        return EnumC4197a.getValue().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: m */
    public static int m28365m(Context context) {
        boolean m28354x = m28354x(context);
        ?? r0 = m28354x;
        if (m28353y(context)) {
            r0 = (m28354x ? 1 : 0) | true;
        }
        return m28355w() ? r0 | 4 : r0;
    }

    /* renamed from: n */
    public static String m28364n(Context context) {
        int m28361q = m28361q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (m28361q == 0) {
            m28361q = m28361q(context, "com.crashlytics.android.build_id", "string");
        }
        if (m28361q != 0) {
            return context.getResources().getString(m28361q);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m28363o(Context context) {
        return (m28354x(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    /* renamed from: p */
    public static String m28362p(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    /* renamed from: q */
    public static int m28361q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m28362p(context));
    }

    /* renamed from: r */
    public static SharedPreferences m28360r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: s */
    public static synchronized long m28359s() {
        long j;
        synchronized (C4196g.class) {
            if (f11446b == -1) {
                long j2 = 0;
                String m28369i = m28369i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(m28369i)) {
                    String upperCase = m28369i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m28371g(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m28371g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m28371g(upperCase, "GB", 1073741824);
                        } else {
                            C7011f m19611f = C7011f.m19611f();
                            m19611f.m19606k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        C7011f m19611f2 = C7011f.m19611f();
                        m19611f2.m19612e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f11446b = j2;
            }
            j = f11446b;
        }
        return j;
    }

    /* renamed from: t */
    private static String m28358t(String str, String str2) {
        return m28357u(str.getBytes(), str2);
    }

    /* renamed from: u */
    private static String m28357u(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return m28356v(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19612e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return BuildConfig.VERSION_NAME;
        }
    }

    /* renamed from: v */
    public static String m28356v(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f11445a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: w */
    public static boolean m28355w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: x */
    public static boolean m28354x(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu") && string != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m28353y(Context context) {
        boolean m28354x = m28354x(context);
        String str = Build.TAGS;
        if ((m28354x || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !m28354x && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* renamed from: z */
    public static String m28352z(String str) {
        return m28358t(str, "SHA-1");
    }
}
