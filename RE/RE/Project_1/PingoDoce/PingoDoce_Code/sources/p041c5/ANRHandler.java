package p041c5;

import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p027b5.InstrumentData;
import p027b5.InstrumentUtility;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p297pd._Ranges;
import p489zc.AbstractC13762g0;
import p489zc._Collections;

/* renamed from: c5.b */
/* loaded from: classes.dex */
public final class ANRHandler {

    /* renamed from: a */
    private static final AtomicBoolean f6073a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ANRHandler.kt */
    /* renamed from: c5.b$a */
    /* loaded from: classes.dex */
    public static final class C2090a implements GraphRequest.InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ List f6074a;

        C2090a(List list) {
            this.f6074a = list;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            JSONObject m34081d;
            Intrinsics.isThisObjectNull(graphResponse, "response");
            try {
                if (graphResponse.m34083b() == null && (m34081d = graphResponse.m34081d()) != null && m34081d.getBoolean("success")) {
                    for (InstrumentData instrumentData : this.f6074a) {
                        instrumentData.m35322a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ANRHandler.kt */
    /* renamed from: c5.b$b */
    /* loaded from: classes.dex */
    public static final class C2091b<T> implements Comparator {

        /* renamed from: w */
        public static final C2091b f6075w = new C2091b();

        C2091b() {
        }

        /* renamed from: a */
        public final int compare(InstrumentData instrumentData, InstrumentData instrumentData2) {
            Intrinsics.checkIfNull(instrumentData2, "o2");
            return instrumentData.m35321b(instrumentData2);
        }
    }

    static {
        new ANRHandler();
        f6073a = new AtomicBoolean(false);
    }

    private ANRHandler() {
    }

    /* renamed from: a */
    public static final synchronized void m34701a() {
        synchronized (ANRHandler.class) {
            if (CrashShieldHandler.m25963d(ANRHandler.class)) {
                return;
            }
            if (f6073a.getAndSet(true)) {
                return;
            }
            if (C2290b.m34106i()) {
                m34700b();
            }
            C2088a.m34702b();
        }
    }

    /* renamed from: b */
    public static final void m34700b() {
        List m461h0;
        C8611f m14992q;
        if (CrashShieldHandler.m25963d(ANRHandler.class)) {
            return;
        }
        try {
            if (Utility.m33978F()) {
                return;
            }
            File[] m35301h = InstrumentUtility.m35301h();
            ArrayList arrayList = new ArrayList(m35301h.length);
            for (File file : m35301h) {
                arrayList.add(InstrumentData.C1812a.m35312d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).m35317f()) {
                    arrayList2.add(obj);
                }
            }
            m461h0 = _Collections.m461h0(arrayList2, C2091b.f6075w);
            JSONArray jSONArray = new JSONArray();
            m14992q = _Ranges.m14992q(0, Math.min(m461h0.size(), 5));
            Iterator<Integer> it = m14992q.iterator();
            while (it.hasNext()) {
                jSONArray.put(m461h0.get(((AbstractC13762g0) it).mo404a()));
            }
            InstrumentUtility.m35297l("anr_reports", jSONArray, new C2090a(m461h0));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ANRHandler.class);
        }
    }
}
