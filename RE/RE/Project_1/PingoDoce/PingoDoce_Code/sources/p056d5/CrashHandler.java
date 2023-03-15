package p056d5;

import android.util.Log;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p027b5.ExceptionAnalyzer;
import p027b5.InstrumentData;
import p027b5.InstrumentUtility;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p297pd._Ranges;
import p489zc.AbstractC13762g0;
import p489zc._Collections;

/* renamed from: d5.a */
/* loaded from: classes.dex */
public final class CrashHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    private static CrashHandler f13012c;

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f13014a;

    /* renamed from: d */
    public static final C4740a f13013d = new C4740a(null);

    /* renamed from: b */
    private static final String f13011b = CrashHandler.class.getCanonicalName();

    /* compiled from: CrashHandler.kt */
    /* renamed from: d5.a$a */
    /* loaded from: classes.dex */
    public static final class C4740a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashHandler.kt */
        /* renamed from: d5.a$a$a */
        /* loaded from: classes.dex */
        public static final class C4741a implements GraphRequest.InterfaceC2278b {

            /* renamed from: a */
            final /* synthetic */ List f13015a;

            C4741a(List list) {
                this.f13015a = list;
            }

            /* renamed from: a */
            public final void mo15411a(GraphResponse graphResponse) {
                JSONObject m34081d;
                Intrinsics.isThisObjectNull(graphResponse, "response");
                try {
                    if (graphResponse.m34083b() == null && (m34081d = graphResponse.m34081d()) != null && m34081d.getBoolean("success")) {
                        for (InstrumentData instrumentData : this.f13015a) {
                            instrumentData.m35322a();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashHandler.kt */
        /* renamed from: d5.a$a$b */
        /* loaded from: classes.dex */
        public static final class C4742b<T> implements Comparator {

            /* renamed from: w */
            public static final C4742b f13016w = new C4742b();

            C4742b() {
            }

            /* renamed from: a */
            public final int compare(InstrumentData instrumentData, InstrumentData instrumentData2) {
                Intrinsics.checkIfNull(instrumentData2, "o2");
                return instrumentData.m35321b(instrumentData2);
            }
        }

        private C4740a() {
        }

        /* renamed from: b */
        private final void m26721b() {
            List m461h0;
            C8611f m14992q;
            if (Utility.m33978F()) {
                return;
            }
            File[] m35299j = InstrumentUtility.m35299j();
            ArrayList arrayList = new ArrayList(m35299j.length);
            for (File file : m35299j) {
                arrayList.add(InstrumentData.C1812a.m35312d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).m35317f()) {
                    arrayList2.add(obj);
                }
            }
            m461h0 = _Collections.m461h0(arrayList2, C4742b.f13016w);
            JSONArray jSONArray = new JSONArray();
            m14992q = _Ranges.m14992q(0, Math.min(m461h0.size(), 5));
            Iterator<Integer> it = m14992q.iterator();
            while (it.hasNext()) {
                jSONArray.put(m461h0.get(((AbstractC13762g0) it).mo404a()));
            }
            InstrumentUtility.m35297l("crash_reports", jSONArray, new C4741a(m461h0));
        }

        /* renamed from: a */
        public final synchronized void m26722a() {
            if (C2290b.m34106i()) {
                m26721b();
            }
            if (CrashHandler.m26725a() != null) {
                Log.w(CrashHandler.m26724b(), "Already enabled!");
                return;
            }
            CrashHandler.m26723c(new CrashHandler(Thread.getDefaultUncaughtExceptionHandler(), null));
            Thread.setDefaultUncaughtExceptionHandler(CrashHandler.m26725a());
        }

        public /* synthetic */ C4740a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    /* renamed from: a */
    public static final /* synthetic */ CrashHandler m26725a() {
        return f13012c;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m26724b() {
        return f13011b;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m26723c(CrashHandler crashHandler) {
        f13012c = crashHandler;
    }

    public void uncaughtException(Thread thread, Throwable th2) {
        Intrinsics.isThisObjectNull(thread, "t");
        Intrinsics.isThisObjectNull(th2, "e");
        if (InstrumentUtility.m35303f(th2)) {
            ExceptionAnalyzer.m35325b(th2);
            InstrumentData.C1812a.m35314b(th2, InstrumentData.EnumC1814c.CrashReport).m35316g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13014a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    private CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f13014a = uncaughtExceptionHandler;
    }
}
