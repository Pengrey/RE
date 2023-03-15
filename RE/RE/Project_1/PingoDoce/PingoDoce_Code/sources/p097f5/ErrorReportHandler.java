package p097f5;

import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p027b5.InstrumentUtility;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p489zc.MutableCollectionsJVM;
import sd.C10156i;

/* renamed from: f5.b */
/* loaded from: classes.dex */
public final class ErrorReportHandler {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ErrorReportHandler.kt */
    /* renamed from: f5.b$a */
    /* loaded from: classes.dex */
    public static final class C5411a implements FilenameFilter {

        /* renamed from: a */
        public static final C5411a f14874a = new C5411a();

        C5411a() {
        }

        public final boolean accept(File file, String str) {
            Intrinsics.checkIfNull(str, "name");
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            return new C10156i(format).m9021d(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ErrorReportHandler.kt */
    /* renamed from: f5.b$b */
    /* loaded from: classes.dex */
    public static final class C5412b<T> implements Comparator {

        /* renamed from: w */
        public static final C5412b f14875w = new C5412b();

        C5412b() {
        }

        /* renamed from: a */
        public final int compare(ErrorReportData errorReportData, ErrorReportData errorReportData2) {
            Intrinsics.checkIfNull(errorReportData2, "o2");
            return errorReportData.m24391b(errorReportData2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ErrorReportHandler.kt */
    /* renamed from: f5.b$c */
    /* loaded from: classes.dex */
    public static final class C5413c implements GraphRequest.InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ ArrayList f14876a;

        C5413c(ArrayList arrayList) {
            this.f14876a = arrayList;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            JSONObject m34081d;
            Intrinsics.isThisObjectNull(graphResponse, "response");
            try {
                if (graphResponse.m34083b() == null && (m34081d = graphResponse.m34081d()) != null && m34081d.getBoolean("success")) {
                    for (ErrorReportData errorReportData : this.f14876a) {
                        errorReportData.m24392a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    static {
        new ErrorReportHandler();
    }

    private ErrorReportHandler() {
    }

    /* renamed from: a */
    public static final void m24387a() {
        if (C2290b.m34106i()) {
            m24384d();
        }
    }

    /* renamed from: b */
    public static final File[] m24386b() {
        File m35306c = InstrumentUtility.m35306c();
        if (m35306c != null) {
            File[] listFiles = m35306c.listFiles(C5411a.f14874a);
            Intrinsics.checkIfNull(listFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: c */
    public static final void m24385c(String str) {
        try {
            new ErrorReportData(str).m24388e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m24384d() {
        if (Utility.m33978F()) {
            return;
        }
        File[] m24386b = m24386b();
        ArrayList arrayList = new ArrayList();
        for (File file : m24386b) {
            ErrorReportData errorReportData = new ErrorReportData(file);
            if (errorReportData.m24389d()) {
                arrayList.add(errorReportData);
            }
        }
        MutableCollectionsJVM.m184t(arrayList, C5412b.f14875w);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        InstrumentUtility.m35297l("error_reports", jSONArray, new C5413c(arrayList));
    }
}
