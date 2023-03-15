package nc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import p272oc.C8060a;

/* renamed from: nc.b */
/* loaded from: classes2.dex */
public class C7696b {

    /* renamed from: a */
    private final Context f20296a;

    /* renamed from: b */
    private boolean f20297b = true;

    public C7696b(Context context) {
        this.f20296a = context;
    }

    /* renamed from: m */
    private boolean m17684m(List<String> list) {
        PackageManager packageManager = this.f20296a.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                C8060a.m17020b(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* renamed from: p */
    private String[] m17681p() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            C8060a.m17021a(e);
            return null;
        }
    }

    /* renamed from: q */
    private String[] m17680q() {
        try {
            InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream == null) {
                return null;
            }
            return new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            C8060a.m17021a(e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean m17696a() {
        return new RootBeerNative().m27491a();
    }

    /* renamed from: b */
    public boolean m17695b(String str) {
        String[] m17697a;
        boolean z = false;
        for (String str2 : C7695a.m17697a()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                C8060a.m17016f(str3 + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public boolean m17694c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ro.debuggable", "1");
        hashMap.put("ro.secure", "0");
        String[] m17680q = m17680q();
        if (m17680q == null) {
            return false;
        }
        boolean z = false;
        for (String str : m17680q) {
            for (String str2 : hashMap.keySet()) {
                if (str.contains(str2)) {
                    String str3 = "[" + ((String) hashMap.get(str2)) + "]";
                    if (str.contains(str3)) {
                        C8060a.m17016f(str2 + " = " + str3 + " detected!");
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    public boolean m17693d() {
        return m17695b("magisk");
    }

    /* renamed from: e */
    public boolean m17692e() {
        String str;
        String str2;
        String[] strArr;
        String[] m17681p = m17681p();
        int i = 0;
        if (m17681p == null) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        int length = m17681p.length;
        int i3 = 0;
        boolean z = false;
        while (i3 < length) {
            String str3 = m17681p[i3];
            String[] split = str3.split(" ");
            int i4 = 23;
            if ((i2 <= 23 && split.length < 4) || (i2 > 23 && split.length < 6)) {
                C8060a.m17020b("Error formatting mount line: " + str3);
            } else {
                if (i2 > 23) {
                    str = split[2];
                    str2 = split[5];
                } else {
                    str = split[1];
                    str2 = split[3];
                }
                String[] strArr2 = C7695a.f20295d;
                int length2 = strArr2.length;
                int i5 = i;
                while (i5 < length2) {
                    String str4 = strArr2[i5];
                    if (str.equalsIgnoreCase(str4)) {
                        if (Build.VERSION.SDK_INT > i4) {
                            str2 = str2.replace("(", BuildConfig.VERSION_NAME).replace(")", BuildConfig.VERSION_NAME);
                        }
                        String[] split2 = str2.split(",");
                        int length3 = split2.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            strArr = m17681p;
                            if (split2[i6].equalsIgnoreCase("rw")) {
                                C8060a.m17016f(str4 + " path is mounted with rw permissions! " + str3);
                                z = true;
                                break;
                            }
                            i6++;
                            m17681p = strArr;
                        }
                    }
                    strArr = m17681p;
                    i5++;
                    m17681p = strArr;
                    i4 = 23;
                }
            }
            i3++;
            m17681p = m17681p;
            i = 0;
        }
        return z;
    }

    /* renamed from: f */
    public boolean m17691f() {
        String[] m17697a;
        if (!m17696a()) {
            C8060a.m17020b("We could not load the native library to test for root");
            return false;
        }
        int length = C7695a.m17697a().length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = m17697a[i] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f20297b);
            return rootBeerNative.checkForRoot(strArr) > 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* renamed from: g */
    public boolean m17690g() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            boolean z = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null;
            process.destroy();
            return z;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    /* renamed from: h */
    public boolean m17689h() {
        return m17688i(null);
    }

    /* renamed from: i */
    public boolean m17688i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(C7695a.f20293b));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m17684m(arrayList);
    }

    /* renamed from: j */
    public boolean m17687j() {
        return m17686k(null);
    }

    /* renamed from: k */
    public boolean m17686k(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(C7695a.f20292a));
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return m17684m(arrayList);
    }

    /* renamed from: l */
    public boolean m17685l() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: n */
    public boolean m17683n() {
        return m17687j() || m17689h() || m17695b("su") || m17694c() || m17692e() || m17685l() || m17690g() || m17691f() || m17693d();
    }

    @Deprecated
    /* renamed from: o */
    public boolean m17682o() {
        return m17683n();
    }

    /* renamed from: r */
    public void m17679r(boolean z) {
        this.f20297b = z;
        C8060a.f20844a = z ? 5 : 0;
    }
}
