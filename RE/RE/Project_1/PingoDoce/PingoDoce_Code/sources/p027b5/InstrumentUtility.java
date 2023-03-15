package p027b5;

import android.content.Context;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import sd.C10150d;
import sd.C10156i;
import sd.StringsJVM;

/* renamed from: b5.f */
/* loaded from: classes.dex */
public final class InstrumentUtility {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentUtility.kt */
    /* renamed from: b5.f$a */
    /* loaded from: classes.dex */
    public static final class C1821a implements FilenameFilter {

        /* renamed from: a */
        public static final C1821a f5521a = new C1821a();

        C1821a() {
        }

        public final boolean accept(File file, String str) {
            Intrinsics.checkIfNull(str, "name");
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            return new C10156i(format).m9021d(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentUtility.kt */
    /* renamed from: b5.f$b */
    /* loaded from: classes.dex */
    public static final class C1822b implements FilenameFilter {

        /* renamed from: a */
        public static final C1822b f5522a = new C1822b();

        C1822b() {
        }

        public final boolean accept(File file, String str) {
            Intrinsics.checkIfNull(str, "name");
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            return new C10156i(format).m9021d(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InstrumentUtility.kt */
    /* renamed from: b5.f$c */
    /* loaded from: classes.dex */
    public static final class C1823c implements FilenameFilter {

        /* renamed from: a */
        public static final C1823c f5523a = new C1823c();

        C1823c() {
        }

        public final boolean accept(File file, String str) {
            Intrinsics.checkIfNull(str, "name");
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            return new C10156i(format).m9021d(str);
        }
    }

    static {
        new InstrumentUtility();
    }

    private InstrumentUtility() {
    }

    /* renamed from: a */
    public static final boolean m35308a(String str) {
        File m35306c = m35306c();
        if (m35306c == null || str == null) {
            return false;
        }
        return new File(m35306c, str).delete();
    }

    /* renamed from: b */
    public static final String m35307b(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        if (th2.getCause() == null) {
            return th2.toString();
        }
        return String.valueOf(th2.getCause());
    }

    /* renamed from: c */
    public static final File m35306c() {
        Context m34110e = C2290b.m34110e();
        Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
        File file = new File(m34110e.getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: d */
    public static final String m35305d(Thread thread) {
        Intrinsics.isThisObjectNull(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public static final String m35304e(Throwable th2) {
        Throwable th3 = null;
        if (th2 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: f */
    public static final boolean m35303f(Throwable th2) {
        StackTraceElement[] stackTrace;
        boolean m8948C;
        if (th2 == null) {
            return false;
        }
        Throwable th3 = null;
        while (th2 != null && th2 != th3) {
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                Intrinsics.checkIfNull(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                Intrinsics.checkIfNull(className, "element.className");
                m8948C = StringsJVM.m8948C(className, "com.facebook", false, 2, null);
                if (m8948C) {
                    return true;
                }
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m35302g(Thread thread) {
        StackTraceElement[] stackTrace;
        boolean m8948C;
        boolean m8948C2;
        boolean m8948C3;
        boolean m8948C4;
        boolean m8948C5;
        boolean m8948C6;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                Intrinsics.checkIfNull(stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                Intrinsics.checkIfNull(className, "element.className");
                m8948C = StringsJVM.m8948C(className, "com.facebook", false, 2, null);
                if (m8948C) {
                    String className2 = stackTraceElement.getClassName();
                    Intrinsics.checkIfNull(className2, "element.className");
                    m8948C2 = StringsJVM.m8948C(className2, "com.facebook.appevents.codeless", false, 2, null);
                    if (!m8948C2) {
                        String className3 = stackTraceElement.getClassName();
                        Intrinsics.checkIfNull(className3, "element.className");
                        m8948C6 = StringsJVM.m8948C(className3, "com.facebook.appevents.suggestedevents", false, 2, null);
                        if (!m8948C6) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    Intrinsics.checkIfNull(methodName, "element.methodName");
                    m8948C3 = StringsJVM.m8948C(methodName, "onClick", false, 2, null);
                    if (m8948C3) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        Intrinsics.checkIfNull(methodName2, "element.methodName");
                        m8948C4 = StringsJVM.m8948C(methodName2, "onItemClick", false, 2, null);
                        if (m8948C4) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            Intrinsics.checkIfNull(methodName3, "element.methodName");
                            m8948C5 = StringsJVM.m8948C(methodName3, "onTouch", false, 2, null);
                            if (!m8948C5) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final File[] m35301h() {
        File m35306c = m35306c();
        if (m35306c != null) {
            File[] listFiles = m35306c.listFiles(C1821a.f5521a);
            return listFiles != null ? listFiles : new File[0];
        }
        return new File[0];
    }

    /* renamed from: i */
    public static final File[] m35300i() {
        File m35306c = m35306c();
        if (m35306c != null) {
            File[] listFiles = m35306c.listFiles(C1822b.f5522a);
            return listFiles != null ? listFiles : new File[0];
        }
        return new File[0];
    }

    /* renamed from: j */
    public static final File[] m35299j() {
        File m35306c = m35306c();
        if (m35306c != null) {
            File[] listFiles = m35306c.listFiles(C1823c.f5523a);
            return listFiles != null ? listFiles : new File[0];
        }
        return new File[0];
    }

    /* renamed from: k */
    public static final JSONObject m35298k(String str, boolean z) {
        File m35306c = m35306c();
        if (m35306c != null && str != null) {
            try {
                return new JSONObject(Utility.m33970N(new FileInputStream(new File(m35306c, str))));
            } catch (Exception unused) {
                if (z) {
                    m35308a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public static final void m35297l(String str, JSONArray jSONArray, GraphRequest.InterfaceC2278b interfaceC2278b) {
        Intrinsics.isThisObjectNull(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            GraphRequest.C2279c c2279c = GraphRequest.f6606s;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C2290b.m34109f()}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            c2279c.m34144x(null, format, jSONObject, interfaceC2278b).m34200k();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: m */
    public static final void m35296m(String str, String str2) {
        File m35306c = m35306c();
        if (m35306c == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m35306c, str));
            byte[] bytes = str2.getBytes(C10150d.f26472b);
            Intrinsics.checkIfNull(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
