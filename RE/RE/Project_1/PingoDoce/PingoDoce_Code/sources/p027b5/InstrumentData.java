package p027b5;

import android.os.Build;
import com.facebook.internal.Utility;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* renamed from: b5.b */
/* loaded from: classes.dex */
public final class InstrumentData {

    /* renamed from: h */
    public static final C1813b f5506h = new C1813b(null);

    /* renamed from: a */
    private String f5507a;

    /* renamed from: b */
    private EnumC1814c f5508b;

    /* renamed from: c */
    private JSONArray f5509c;

    /* renamed from: d */
    private String f5510d;

    /* renamed from: e */
    private String f5511e;

    /* renamed from: f */
    private String f5512f;

    /* renamed from: g */
    private Long f5513g;

    /* compiled from: InstrumentData.kt */
    /* renamed from: b5.b$a */
    /* loaded from: classes.dex */
    public static final class C1812a {
        static {
            new C1812a();
        }

        private C1812a() {
        }

        /* renamed from: a */
        public static final InstrumentData m35315a(String str, String str2) {
            return new InstrumentData(str, str2, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public static final InstrumentData m35314b(Throwable th2, EnumC1814c enumC1814c) {
            Intrinsics.isThisObjectNull(enumC1814c, "t");
            return new InstrumentData(th2, enumC1814c, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static final InstrumentData m35313c(JSONArray jSONArray) {
            Intrinsics.isThisObjectNull(jSONArray, "features");
            return new InstrumentData(jSONArray, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static final InstrumentData m35312d(File file) {
            Intrinsics.isThisObjectNull(file, "file");
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: InstrumentData.kt */
    /* renamed from: b5.b$b */
    /* loaded from: classes.dex */
    public static final class C1813b {
        private C1813b() {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC1814c m35311a(C1813b c1813b, String str) {
            return c1813b.m35310b(str);
        }

        /* renamed from: b */
        private final EnumC1814c m35310b(String str) {
            boolean m8948C;
            boolean m8948C2;
            boolean m8948C3;
            boolean m8948C4;
            boolean m8948C5;
            m8948C = StringsJVM.m8948C(str, "crash_log_", false, 2, null);
            if (m8948C) {
                return EnumC1814c.CrashReport;
            }
            m8948C2 = StringsJVM.m8948C(str, "shield_log_", false, 2, null);
            if (m8948C2) {
                return EnumC1814c.CrashShield;
            }
            m8948C3 = StringsJVM.m8948C(str, "thread_check_log_", false, 2, null);
            if (m8948C3) {
                return EnumC1814c.ThreadCheck;
            }
            m8948C4 = StringsJVM.m8948C(str, "analysis_log_", false, 2, null);
            if (m8948C4) {
                return EnumC1814c.Analysis;
            }
            m8948C5 = StringsJVM.m8948C(str, "anr_log_", false, 2, null);
            if (m8948C5) {
                return EnumC1814c.AnrReport;
            }
            return EnumC1814c.Unknown;
        }

        public /* synthetic */ C1813b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: InstrumentData.kt */
    /* renamed from: b5.b$c */
    /* loaded from: classes.dex */
    public enum EnumC1814c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public final String getLogPrefix() {
            int i = C1815c.f5515b[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        public String toString() {
            int i = C1815c.f5514a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    /* renamed from: c */
    private final JSONObject m35320c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f5509c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f5513g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private final JSONObject m35319d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f5510d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f5513g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f5511e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f5512f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC1814c enumC1814c = this.f5508b;
            if (enumC1814c != null) {
                jSONObject.put("type", enumC1814c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private final JSONObject m35318e() {
        EnumC1814c enumC1814c = this.f5508b;
        if (enumC1814c == null) {
            return null;
        }
        int i = C1816d.f5517b[enumC1814c.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                return m35319d();
            }
            return null;
        }
        return m35320c();
    }

    /* renamed from: a */
    public final void m35322a() {
        InstrumentUtility.m35308a(this.f5507a);
    }

    /* renamed from: b */
    public final int m35321b(InstrumentData instrumentData) {
        Intrinsics.isThisObjectNull(instrumentData, "data");
        Long l = this.f5513g;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = instrumentData.f5513g;
            if (l2 != null) {
                return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: f */
    public final boolean m35317f() {
        EnumC1814c enumC1814c = this.f5508b;
        if (enumC1814c != null) {
            int i = C1816d.f5516a[enumC1814c.ordinal()];
            return i != 1 ? i != 2 ? ((i != 3 && i != 4 && i != 5) || this.f5512f == null || this.f5513g == null) ? false : true : (this.f5512f == null || this.f5511e == null || this.f5513g == null) ? false : true : (this.f5509c == null || this.f5513g == null) ? false : true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m35316g() {
        if (m35317f()) {
            InstrumentUtility.m35296m(this.f5507a, toString());
        }
    }

    public String toString() {
        JSONObject m35318e = m35318e();
        if (m35318e != null) {
            String jSONObject = m35318e.toString();
            Intrinsics.checkIfNull(jSONObject, "params.toString()");
            return jSONObject;
        }
        String jSONObject2 = new JSONObject().toString();
        Intrinsics.checkIfNull(jSONObject2, "JSONObject().toString()");
        return jSONObject2;
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th2, EnumC1814c enumC1814c, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, enumC1814c);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.f5508b = EnumC1814c.Analysis;
        this.f5513g = Long.valueOf(System.currentTimeMillis() / ((long) DateTimeConstants.MILLIS_PER_SECOND));
        this.f5509c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f5513g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkIfNull(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f5507a = stringBuffer2;
    }

    private InstrumentData(Throwable th2, EnumC1814c enumC1814c) {
        this.f5508b = enumC1814c;
        this.f5510d = Utility.m33943o();
        this.f5511e = InstrumentUtility.m35307b(th2);
        this.f5512f = InstrumentUtility.m35304e(th2);
        this.f5513g = Long.valueOf(System.currentTimeMillis() / ((long) DateTimeConstants.MILLIS_PER_SECOND));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC1814c.getLogPrefix());
        stringBuffer.append(String.valueOf(this.f5513g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkIfNull(stringBuffer2, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f5507a = stringBuffer2;
    }

    private InstrumentData(String str, String str2) {
        this.f5508b = EnumC1814c.AnrReport;
        this.f5510d = Utility.m33943o();
        this.f5511e = str;
        this.f5512f = str2;
        this.f5513g = Long.valueOf(System.currentTimeMillis() / ((long) DateTimeConstants.MILLIS_PER_SECOND));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f5513g));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkIfNull(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f5507a = stringBuffer2;
    }

    private InstrumentData(File file) {
        String name = file.getName();
        Intrinsics.checkIfNull(name, "file.name");
        this.f5507a = name;
        this.f5508b = C1813b.m35311a(f5506h, name);
        JSONObject m35298k = InstrumentUtility.m35298k(this.f5507a, true);
        if (m35298k != null) {
            this.f5513g = Long.valueOf(m35298k.optLong("timestamp", 0L));
            this.f5510d = m35298k.optString("app_version", null);
            this.f5511e = m35298k.optString("reason", null);
            this.f5512f = m35298k.optString("callstack", null);
            this.f5509c = m35298k.optJSONArray("feature_names");
        }
    }
}
