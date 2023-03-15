package p233m4;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.Intrinsics;

/* renamed from: m4.c */
/* loaded from: classes.dex */
public class GraphRequestAsyncTask extends AsyncTask {

    /* renamed from: d */
    private static final String f18909d;

    /* renamed from: a */
    private Exception f18910a;

    /* renamed from: b */
    private final HttpURLConnection f18911b;

    /* renamed from: c */
    private final GraphRequestBatch f18912c;

    /* compiled from: GraphRequestAsyncTask.kt */
    /* renamed from: m4.c$a */
    /* loaded from: classes.dex */
    public static final class C7123a {
        private C7123a() {
        }

        public /* synthetic */ C7123a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7123a(null);
        f18909d = GraphRequestAsyncTask.class.getCanonicalName();
    }

    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
        this.f18911b = httpURLConnection;
        this.f18912c = graphRequestBatch;
    }

    /* renamed from: a */
    public List m19151a(Void... voidArr) {
        List m34155m;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(voidArr, "params");
            try {
                HttpURLConnection httpURLConnection = this.f18911b;
                if (httpURLConnection == null) {
                    m34155m = this.f18912c.m19136l();
                } else {
                    m34155m = GraphRequest.f6606s.m34155m(httpURLConnection, this.f18912c);
                }
                return m34155m;
            } catch (Exception e) {
                this.f18910a = e;
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: b */
    protected void m19150b(List list) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(list, "result");
            super.onPostExecute(list);
            Exception exc = this.f18910a;
            if (exc != null) {
                String str = f18909d;
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                Utility.m33973K(str, format);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            return m19151a((Void[]) objArr);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m19150b((List) obj);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    public void onPreExecute() {
        Handler handler;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (C2290b.m34097r()) {
                String str = f18909d;
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                Utility.m33973K(str, format);
            }
            if (this.f18912c.m19130v() == null) {
                if (Thread.currentThread() instanceof HandlerThread) {
                    handler = new Handler();
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                this.f18912c.m19141J(handler);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f18911b + ", requests: " + this.f18912c + "}";
        Intrinsics.checkIfNull(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(GraphRequestBatch graphRequestBatch) {
        this(null, graphRequestBatch);
        Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
    }
}
