package p097f5;

import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p027b5.InstrumentUtility;
import p181jd.Intrinsics;

/* renamed from: f5.a */
/* loaded from: classes.dex */
public final class ErrorReportData {

    /* renamed from: a */
    private String f14871a;

    /* renamed from: b */
    private String f14872b;

    /* renamed from: c */
    private Long f14873c;

    /* compiled from: ErrorReportData.kt */
    /* renamed from: f5.a$a */
    /* loaded from: classes.dex */
    public static final class C5410a {
        private C5410a() {
        }

        public /* synthetic */ C5410a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5410a(null);
    }

    public ErrorReportData(String str) {
        this.f14873c = Long.valueOf(System.currentTimeMillis() / ((long) DateTimeConstants.MILLIS_PER_SECOND));
        this.f14872b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.f14873c;
        Objects.requireNonNull(l, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkIfNull(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f14871a = stringBuffer2;
    }

    /* renamed from: a */
    public final void m24392a() {
        InstrumentUtility.m35308a(this.f14871a);
    }

    /* renamed from: b */
    public final int m24391b(ErrorReportData errorReportData) {
        Intrinsics.isThisObjectNull(errorReportData, "data");
        Long l = this.f14873c;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = errorReportData.f14873c;
            if (l2 != null) {
                return (l2.longValue() > longValue ? 1 : (l2.longValue() == longValue ? 0 : -1));
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: c */
    public final JSONObject m24390c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f14873c;
            if (l != null) {
                jSONObject.put("timestamp", l.longValue());
            }
            jSONObject.put("error_message", this.f14872b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m24389d() {
        return (this.f14872b == null || this.f14873c == null) ? false : true;
    }

    /* renamed from: e */
    public final void m24388e() {
        if (m24389d()) {
            InstrumentUtility.m35296m(this.f14871a, toString());
        }
    }

    public String toString() {
        JSONObject m24390c = m24390c();
        if (m24390c != null) {
            String jSONObject = m24390c.toString();
            Intrinsics.checkIfNull(jSONObject, "params.toString()");
            return jSONObject;
        }
        return super.toString();
    }

    public ErrorReportData(File file) {
        Intrinsics.isThisObjectNull(file, "file");
        String name = file.getName();
        Intrinsics.checkIfNull(name, "file.name");
        this.f14871a = name;
        JSONObject m35298k = InstrumentUtility.m35298k(name, true);
        if (m35298k != null) {
            this.f14873c = Long.valueOf(m35298k.optLong("timestamp", 0L));
            this.f14872b = m35298k.optString("error_message", null);
        }
    }
}
