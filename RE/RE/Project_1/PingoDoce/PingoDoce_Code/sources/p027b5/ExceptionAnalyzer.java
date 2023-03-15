package p027b5;

import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p027b5.InstrumentData;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p233m4.GraphRequestBatch;

/* renamed from: b5.a */
/* loaded from: classes.dex */
public final class ExceptionAnalyzer {

    /* renamed from: a */
    private static boolean f5503a;

    /* renamed from: b */
    public static final ExceptionAnalyzer f5504b = new ExceptionAnalyzer();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionAnalyzer.kt */
    /* renamed from: b5.a$a */
    /* loaded from: classes.dex */
    public static final class C1811a implements GraphRequest.InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ InstrumentData f5505a;

        C1811a(InstrumentData instrumentData) {
            this.f5505a = instrumentData;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            JSONObject m34081d;
            Intrinsics.isThisObjectNull(graphResponse, "response");
            try {
                if (graphResponse.m34083b() == null && (m34081d = graphResponse.m34081d()) != null && m34081d.getBoolean("success")) {
                    this.f5505a.m35322a();
                }
            } catch (JSONException unused) {
            }
        }
    }

    private ExceptionAnalyzer() {
    }

    /* renamed from: a */
    public static final void m35326a() {
        f5503a = true;
        if (C2290b.m34106i()) {
            f5504b.m35323d();
        }
    }

    /* renamed from: b */
    public static final void m35325b(Throwable th2) {
        if (!f5503a || m35324c() || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkIfNull(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            Intrinsics.checkIfNull(stackTraceElement, "it");
            String className = stackTraceElement.getClassName();
            Intrinsics.checkIfNull(className, "it.className");
            FeatureManager.EnumC2317b m34005d = FeatureManager.m34005d(className);
            if (m34005d != FeatureManager.EnumC2317b.Unknown) {
                FeatureManager.m34006c(m34005d);
                hashSet.add(m34005d.toString());
            }
        }
        if (C2290b.m34106i() && (!hashSet.isEmpty())) {
            InstrumentData.C1812a.m35313c(new JSONArray((Collection) hashSet)).m35316g();
        }
    }

    /* renamed from: c */
    public static final boolean m35324c() {
        return false;
    }

    /* renamed from: d */
    public final void m35323d() {
        if (Utility.m33978F()) {
            return;
        }
        File[] m35300i = InstrumentUtility.m35300i();
        ArrayList arrayList = new ArrayList();
        for (File file : m35300i) {
            InstrumentData m35312d = InstrumentData.C1812a.m35312d(file);
            if (m35312d.m35317f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", m35312d.toString());
                    GraphRequest.C2279c c2279c = GraphRequest.f6606s;
                    C6429c0 c6429c0 = C6429c0.f17515a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C2290b.m34109f()}, 1));
                    Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                    arrayList.add(c2279c.m34144x(null, format, jSONObject, new C1811a(m35312d)));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new GraphRequestBatch(arrayList).m19134p();
    }
}
