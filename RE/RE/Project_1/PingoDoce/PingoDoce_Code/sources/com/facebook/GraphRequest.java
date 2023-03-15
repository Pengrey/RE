package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p233m4.AccessTokenManager;
import p233m4.GraphRequestAsyncTask;
import p233m4.GraphRequestBatch;
import p233m4.InterfaceC7129h;
import p233m4.ProgressNoopOutputStream;
import p482z4.C13646i;
import p482z4.C13656n;
import p482z4.Logger;
import p482z4.Validate;
import p489zc._Arrays;
import sd.C10150d;
import sd.C10156i;
import sd.StringsJVM;

/* compiled from: GraphRequest.kt */
/* loaded from: classes.dex */
public final class GraphRequest {

    /* renamed from: n */
    private static final String f6601n;

    /* renamed from: o */
    private static final String f6602o;

    /* renamed from: p */
    private static String f6603p;

    /* renamed from: q */
    private static final Pattern f6604q;

    /* renamed from: r */
    private static volatile String f6605r;

    /* renamed from: s */
    public static final C2279c f6606s = new C2279c(null);

    /* renamed from: a */
    private AccessToken f6607a;

    /* renamed from: b */
    private String f6608b;

    /* renamed from: c */
    private JSONObject f6609c;

    /* renamed from: d */
    private String f6610d;

    /* renamed from: e */
    private String f6611e;

    /* renamed from: f */
    private boolean f6612f;

    /* renamed from: g */
    private Bundle f6613g;

    /* renamed from: h */
    private Object f6614h;

    /* renamed from: i */
    private String f6615i;

    /* renamed from: j */
    private InterfaceC2278b f6616j;

    /* renamed from: k */
    private EnumC2303d f6617k;

    /* renamed from: l */
    private boolean f6618l;

    /* renamed from: m */
    private String f6619m;

    /* compiled from: GraphRequest.kt */
    @Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0007B\u0011\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m20207d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "Landroid/os/Parcel;", "source", "<init>", "(Landroid/os/Parcel;)V", "b", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
    /* loaded from: classes.dex */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: w */
        private final String f6620w;

        /* renamed from: x */
        private final Parcelable f6621x;

        /* compiled from: GraphRequest.kt */
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        /* loaded from: classes.dex */
        public static final class C2275a implements Parcelable.Creator {
            C2275a() {
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                Intrinsics.isThisObjectNull(parcel, "source");
                return new ParcelableResourceWithMimeType(parcel, null);
            }

            /* renamed from: b */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        /* compiled from: GraphRequest.kt */
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$b */
        /* loaded from: classes.dex */
        public static final class C2276b {
            private C2276b() {
            }

            public /* synthetic */ C2276b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C2276b(null);
            new C2275a();
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* renamed from: a */
        public final String m34184a() {
            return this.f6620w;
        }

        /* renamed from: b */
        public final Parcelable m34183b() {
            return this.f6621x;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.isThisObjectNull(parcel, "out");
            parcel.writeString(this.f6620w);
            parcel.writeParcelable(this.f6621x, i);
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f6620w = parcel.readString();
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
            this.f6621x = parcel.readParcelable(m34110e.getClassLoader());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$a */
    /* loaded from: classes.dex */
    public static final class C2277a {

        /* renamed from: a */
        private final GraphRequest f6622a;

        /* renamed from: b */
        private final Object f6623b;

        public C2277a(GraphRequest graphRequest, Object obj) {
            Intrinsics.isThisObjectNull(graphRequest, "request");
            this.f6622a = graphRequest;
            this.f6623b = obj;
        }

        /* renamed from: a */
        public final GraphRequest m34180a() {
            return this.f6622a;
        }

        /* renamed from: b */
        public final Object m34179b() {
            return this.f6623b;
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2278b {
        /* renamed from: a */
        void mo15411a(GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$c */
    /* loaded from: classes.dex */
    public static final class C2279c {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: GraphRequest.kt */
        /* renamed from: com.facebook.GraphRequest$c$a */
        /* loaded from: classes.dex */
        public static final class RunnableC2280a implements Runnable {

            /* renamed from: w */
            final /* synthetic */ ArrayList f6624w;

            /* renamed from: x */
            final /* synthetic */ GraphRequestBatch f6625x;

            RunnableC2280a(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
                this.f6624w = arrayList;
                this.f6625x = graphRequestBatch;
            }

            public final void run() {
                if (CrashShieldHandler.m25963d(this)) {
                    return;
                }
                try {
                    Iterator it = this.f6624w.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        Object obj = pair.second;
                        Intrinsics.checkIfNull(obj, "pair.second");
                        ((InterfaceC2278b) pair.first).mo15411a((GraphResponse) obj);
                    }
                    for (GraphRequestBatch.InterfaceC7124a interfaceC7124a : this.f6625x.m19129x()) {
                        interfaceC7124a.m19127a(this.f6625x);
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.m25965b(th2, this);
                }
            }
        }

        private C2279c() {
        }

        /* renamed from: A */
        private final void m34178A(String str, Object obj, InterfaceC2281d interfaceC2281d, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C6429c0 c6429c0 = C6429c0.f17515a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        Intrinsics.checkIfNull(opt, "jsonObject.opt(propertyName)");
                        m34178A(format, opt, interfaceC2281d, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    Intrinsics.checkIfNull(optString, "jsonObject.optString(\"id\")");
                    m34178A(str, optString, interfaceC2281d, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    Intrinsics.checkIfNull(optString2, "jsonObject.optString(\"url\")");
                    m34178A(str, optString2, interfaceC2281d, z);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkIfNull(jSONObject2, "jsonObject.toString()");
                    m34178A(str, jSONObject2, interfaceC2281d, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    C6429c0 c6429c02 = C6429c0.f17515a;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    Intrinsics.checkIfNull(format2, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i);
                    Intrinsics.checkIfNull(opt2, "jsonArray.opt(i)");
                    m34178A(format2, opt2, interfaceC2281d, z);
                }
            } else if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.TYPE.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkIfNull(format3, "iso8601DateFormat.format(date)");
                    interfaceC2281d.m34141a(str, format3);
                }
            } else {
                interfaceC2281d.m34141a(str, obj.toString());
            }
        }

        /* renamed from: B */
        private final void m34177B(GraphRequestBatch graphRequestBatch, Logger logger, int i, URL url, OutputStream outputStream, boolean z) {
            C2283f c2283f = new C2283f(outputStream, logger, z);
            if (i == 1) {
                GraphRequest m19132t = graphRequestBatch.m19132t(0);
                Map hashMap = new HashMap();
                for (String str : m19132t.m34193r().keySet()) {
                    Object obj = m19132t.m34193r().get(str);
                    if (m34147u(obj)) {
                        Intrinsics.checkIfNull(str, "key");
                        hashMap.put(str, new C2277a(m19132t, obj));
                    }
                }
                if (logger != null) {
                    logger.m711b("  Parameters:\n");
                }
                m34174E(m19132t.m34193r(), c2283f, m19132t);
                if (logger != null) {
                    logger.m711b("  Attachments:\n");
                }
                m34175D(hashMap, c2283f);
                JSONObject m34197n = m19132t.m34197n();
                if (m34197n != null) {
                    String path = url.getPath();
                    Intrinsics.checkIfNull(path, "url.path");
                    m34142z(m34197n, path, c2283f);
                    return;
                }
                return;
            }
            String m34154n = m34154n(graphRequestBatch);
            if (!(m34154n.length() == 0)) {
                c2283f.m34139a("batch_app_id", m34154n);
                Map hashMap2 = new HashMap();
                m34173F(c2283f, graphRequestBatch, hashMap2);
                if (logger != null) {
                    logger.m711b("  Attachments:\n");
                }
                m34175D(hashMap2, c2283f);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        /* renamed from: D */
        private final void m34175D(Map map, C2283f c2283f) {
            for (Map.Entry entry : map.entrySet()) {
                if (GraphRequest.f6606s.m34147u(((C2277a) entry.getValue()).m34179b())) {
                    c2283f.m34130j((String) entry.getKey(), ((C2277a) entry.getValue()).m34179b(), ((C2277a) entry.getValue()).m34180a());
                }
            }
        }

        /* renamed from: E */
        private final void m34174E(Bundle bundle, C2283f c2283f, GraphRequest graphRequest) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (m34146v(obj)) {
                    Intrinsics.checkIfNull(str, "key");
                    c2283f.m34130j(str, obj, graphRequest);
                }
            }
        }

        /* renamed from: F */
        private final void m34173F(C2283f c2283f, Collection collection, Map map) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                GraphRequest.m34205f((GraphRequest) it.next(), jSONArray, map);
            }
            c2283f.m34128l("batch", jSONArray, collection);
        }

        /* renamed from: H */
        private final void m34171H(HttpURLConnection httpURLConnection, boolean z) {
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", m34153o());
        }

        /* renamed from: a */
        public static final /* synthetic */ boolean m34167a(C2279c c2279c, Object obj) {
            return c2279c.m34147u(obj);
        }

        /* renamed from: b */
        public static final /* synthetic */ boolean m34166b(C2279c c2279c, Object obj) {
            return c2279c.m34146v(obj);
        }

        /* renamed from: c */
        public static final /* synthetic */ String m34165c(C2279c c2279c, Object obj) {
            return c2279c.m34143y(obj);
        }

        /* renamed from: d */
        public static final /* synthetic */ void m34164d(C2279c c2279c, JSONObject jSONObject, String str, InterfaceC2281d interfaceC2281d) {
            c2279c.m34142z(jSONObject, str, interfaceC2281d);
        }

        /* renamed from: e */
        private final HttpURLConnection m34163e(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", m34151q());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        /* renamed from: n */
        private final String m34154n(GraphRequestBatch graphRequestBatch) {
            String m19131u = graphRequestBatch.m19131u();
            if (m19131u == null || !(!graphRequestBatch.isEmpty())) {
                Iterator it = graphRequestBatch.iterator();
                while (it.hasNext()) {
                    AccessToken m34199l = ((GraphRequest) it.next()).m34199l();
                    if (m34199l != null) {
                        return m34199l.m34256b();
                    }
                }
                String m34210a = GraphRequest.m34210a();
                if (m34210a != null) {
                    if (m34210a.length() > 0) {
                        return m34210a;
                    }
                }
                String m34109f = C2290b.m34109f();
                Intrinsics.checkIfNull(m34109f, "FacebookSdk.getApplicationId()");
                return m34109f;
            }
            return m19131u;
        }

        /* renamed from: o */
        private final String m34153o() {
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.m34209b()}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            return format;
        }

        /* renamed from: q */
        private final String m34151q() {
            if (GraphRequest.m34207d() == null) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "11.1.1"}, 2));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                GraphRequest.m34204g(format);
                String m717a = C13646i.m717a();
                if (!Utility.m33977G(m717a)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.m34207d(), m717a}, 2));
                    Intrinsics.checkIfNull(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.m34204g(format2);
                }
            }
            return GraphRequest.m34207d();
        }

        /* renamed from: r */
        private final boolean m34150r(GraphRequestBatch graphRequestBatch) {
            for (GraphRequestBatch.InterfaceC7124a interfaceC7124a : graphRequestBatch.m19129x()) {
                if (interfaceC7124a instanceof GraphRequestBatch.InterfaceC7126c) {
                    return true;
                }
            }
            Iterator it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                if (((GraphRequest) it.next()).m34198m() instanceof InterfaceC2282e) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: s */
        private final boolean m34149s(GraphRequestBatch graphRequestBatch) {
            Iterator it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                for (String str : graphRequest.m34193r().keySet()) {
                    if (m34147u(graphRequest.m34193r().get(str))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: t */
        private final boolean m34148t(String str) {
            boolean m8948C;
            boolean m8948C2;
            Matcher matcher = GraphRequest.m34206e().matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkIfNull(str, "matcher.group(1)");
            }
            m8948C = StringsJVM.m8948C(str, "me/", false, 2, null);
            if (m8948C) {
                return true;
            }
            m8948C2 = StringsJVM.m8948C(str, "/me/", false, 2, null);
            return m8948C2;
        }

        /* renamed from: u */
        private final boolean m34147u(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* renamed from: v */
        private final boolean m34146v(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* renamed from: y */
        private final String m34143y(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (obj instanceof Date) {
                    String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkIfNull(format, "iso8601DateFormat.format(value)");
                    return format;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return obj.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m34142z(org.json.JSONObject r10, java.lang.String r11, com.facebook.GraphRequest.InterfaceC2281d r12) {
            /*
                r9 = this;
                boolean r0 = r9.m34148t(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r3 = r11
                int r0 = sd.C10163k.m8989U(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = sd.C10163k.m8989U(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = r1
                goto L24
            L23:
                r11 = r2
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = sd.C10163k.m8973q(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = r1
                goto L45
            L44:
                r5 = r2
            L45:
                java.lang.String r6 = "key"
                p181jd.Intrinsics.checkIfNull(r3, r6)
                java.lang.String r6 = "value"
                p181jd.Intrinsics.checkIfNull(r4, r6)
                r9.m34178A(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C2279c.m34142z(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$d):void");
        }

        /* renamed from: C */
        public final void m34176C(GraphRequestBatch graphRequestBatch, List list) {
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            Intrinsics.isThisObjectNull(list, "responses");
            int size = graphRequestBatch.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest m19132t = graphRequestBatch.m19132t(i);
                if (m19132t.m34198m() != null) {
                    arrayList.add(new Pair(m19132t.m34198m(), list.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                RunnableC2280a runnableC2280a = new RunnableC2280a(arrayList, graphRequestBatch);
                Handler m19130v = graphRequestBatch.m19130v();
                if (m19130v != null) {
                    m19130v.post(runnableC2280a);
                } else {
                    runnableC2280a.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m34172G(p233m4.GraphRequestBatch r14, java.net.HttpURLConnection r15) throws java.io.IOException, org.json.JSONException {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.C2279c.m34172G(m4.d, java.net.HttpURLConnection):void");
        }

        /* renamed from: I */
        public final boolean m34170I(GraphRequest graphRequest) {
            boolean m8948C;
            Intrinsics.isThisObjectNull(graphRequest, "request");
            String m34189v = graphRequest.m34189v();
            if (m34189v != null) {
                if (m34189v.length() == 0) {
                    return true;
                }
                m8948C = StringsJVM.m8948C(m34189v, "v", false, 2, null);
                if (m8948C) {
                    m34189v = m34189v.substring(1);
                    Intrinsics.checkIfNull(m34189v, "(this as java.lang.String).substring(startIndex)");
                }
                Object[] array = new C10156i("\\.").m9019f(m34189v, 0).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                if (strArr.length < 2 || Integer.parseInt(strArr[0]) <= 2) {
                    return Integer.parseInt(strArr[0]) >= 2 && Integer.parseInt(strArr[1]) >= 4;
                }
                return true;
            }
            return true;
        }

        /* renamed from: J */
        public final HttpURLConnection m34169J(GraphRequestBatch graphRequestBatch) {
            URL url;
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            m34168K(graphRequestBatch);
            try {
                if (graphRequestBatch.size() == 1) {
                    url = new URL(graphRequestBatch.m19132t(0).m34190u());
                } else {
                    url = new URL(C13656n.m679b());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = m34163e(url);
                    m34172G(graphRequestBatch, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    Utility.m33947k(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    Utility.m33947k(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        /* renamed from: K */
        public final void m34168K(GraphRequestBatch graphRequestBatch) {
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            Iterator it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (EnumC2303d.GET == graphRequest.m34194q()) {
                    Intrinsics.checkIfNull(graphRequest, "request");
                    if (m34170I(graphRequest) && (!graphRequest.m34193r().containsKey("fields") || Utility.m33977G(graphRequest.m34193r().getString("fields")))) {
                        Logger.C13648a c13648a = Logger.f34697f;
                        EnumC2305f enumC2305f = EnumC2305f.DEVELOPER_ERRORS;
                        Object[] objArr = new Object[1];
                        String m34196o = graphRequest.m34196o();
                        if (m34196o == null) {
                            m34196o = BuildConfig.VERSION_NAME;
                        }
                        objArr[0] = m34196o;
                        c13648a.m703b(enumC2305f, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", objArr);
                    }
                }
            }
        }

        /* renamed from: f */
        public final GraphResponse m34162f(GraphRequest graphRequest) {
            Intrinsics.isThisObjectNull(graphRequest, "request");
            List m34159i = m34159i(graphRequest);
            if (m34159i.size() == 1) {
                return (GraphResponse) m34159i.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        /* renamed from: g */
        public final List m34161g(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "requests");
            return m34160h(new GraphRequestBatch(collection));
        }

        /* renamed from: h */
        public final List m34160h(GraphRequestBatch graphRequestBatch) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List list;
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            Validate.m672f(graphRequestBatch, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = m34169J(graphRequestBatch);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                Utility.m33947k(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = m34155m(httpURLConnection, graphRequestBatch);
                } else {
                    List m34080a = GraphResponse.f6666g.m34080a(graphRequestBatch.m19149B(), null, new FacebookException(exc));
                    m34176C(graphRequestBatch, m34080a);
                    list = m34080a;
                }
                Utility.m33947k(httpURLConnection);
                return list;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection;
                Utility.m33947k(httpURLConnection2);
                throw th;
            }
        }

        /* renamed from: i */
        public final List m34159i(GraphRequest... graphRequestArr) {
            List m276R;
            Intrinsics.isThisObjectNull(graphRequestArr, "requests");
            m276R = _Arrays.m276R(graphRequestArr);
            return m34161g(m276R);
        }

        /* renamed from: j */
        public final GraphRequestAsyncTask m34158j(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "requests");
            return m34157k(new GraphRequestBatch(collection));
        }

        /* renamed from: k */
        public final GraphRequestAsyncTask m34157k(GraphRequestBatch graphRequestBatch) {
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            Validate.m672f(graphRequestBatch, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(graphRequestBatch);
            graphRequestAsyncTask.executeOnExecutor(C2290b.m34103l(), new Void[0]);
            return graphRequestAsyncTask;
        }

        /* renamed from: l */
        public final GraphRequestAsyncTask m34156l(GraphRequest... graphRequestArr) {
            List m276R;
            Intrinsics.isThisObjectNull(graphRequestArr, "requests");
            m276R = _Arrays.m276R(graphRequestArr);
            return m34158j(m276R);
        }

        /* renamed from: m */
        public final List m34155m(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            Intrinsics.isThisObjectNull(httpURLConnection, "connection");
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            List m34075f = GraphResponse.f6666g.m34075f(httpURLConnection, graphRequestBatch);
            Utility.m33947k(httpURLConnection);
            int size = graphRequestBatch.size();
            if (size == m34075f.size()) {
                m34176C(graphRequestBatch, m34075f);
                AccessTokenManager.f18884g.m19161e().m19176f();
                return m34075f;
            }
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(m34075f.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }

        /* renamed from: p */
        public final String m34152p() {
            return GraphRequest.m34208c();
        }

        /* renamed from: w */
        public final GraphRequest m34145w(AccessToken accessToken, String str, InterfaceC2278b interfaceC2278b) {
            return new GraphRequest(accessToken, str, null, null, interfaceC2278b, null, 32, null);
        }

        /* renamed from: x */
        public final GraphRequest m34144x(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC2278b interfaceC2278b) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, EnumC2303d.POST, interfaceC2278b, null, 32, null);
            graphRequest.m34215A(jSONObject);
            return graphRequest;
        }

        public /* synthetic */ C2279c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2281d {
        /* renamed from: a */
        void m34141a(String str, String str2);
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2282e extends InterfaceC2278b {
        /* renamed from: b */
        void m34140b(long j, long j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$f */
    /* loaded from: classes.dex */
    public static final class C2283f implements InterfaceC2281d {

        /* renamed from: a */
        private boolean f6626a;

        /* renamed from: b */
        private final boolean f6627b;

        /* renamed from: c */
        private final OutputStream f6628c;

        /* renamed from: d */
        private final Logger f6629d;

        public C2283f(OutputStream outputStream, Logger logger, boolean z) {
            Intrinsics.isThisObjectNull(outputStream, "outputStream");
            this.f6628c = outputStream;
            this.f6629d = logger;
            this.f6626a = true;
            this.f6627b = z;
        }

        /* renamed from: b */
        private final RuntimeException m34138b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void m34139a(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(str2, "value");
            m34134f(str, null, null);
            m34131i("%s", str2);
            m34129k();
            Logger logger = this.f6629d;
            if (logger != null) {
                logger.m709d("    " + str, str2);
            }
        }

        /* renamed from: c */
        public final void m34137c(String str, Object... objArr) {
            Intrinsics.isThisObjectNull(str, "format");
            Intrinsics.isThisObjectNull(objArr, "args");
            if (!this.f6627b) {
                if (this.f6626a) {
                    OutputStream outputStream = this.f6628c;
                    Charset charset = C10150d.f26472b;
                    byte[] bytes = "--".getBytes(charset);
                    Intrinsics.checkIfNull(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f6628c;
                    String m34209b = GraphRequest.m34209b();
                    Objects.requireNonNull(m34209b, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes2 = m34209b.getBytes(charset);
                    Intrinsics.checkIfNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    OutputStream outputStream3 = this.f6628c;
                    byte[] bytes3 = "\r\n".getBytes(charset);
                    Intrinsics.checkIfNull(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.f6626a = false;
                }
                OutputStream outputStream4 = this.f6628c;
                C6429c0 c6429c0 = C6429c0.f17515a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                Charset charset2 = C10150d.f26472b;
                Objects.requireNonNull(format, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes4 = format.getBytes(charset2);
                Intrinsics.checkIfNull(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            OutputStream outputStream5 = this.f6628c;
            C6429c0 c6429c02 = C6429c0.f17515a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            Intrinsics.checkIfNull(format2, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, "UTF-8");
            Intrinsics.checkIfNull(encode, "URLEncoder.encode(String… format, *args), \"UTF-8\")");
            Charset charset3 = C10150d.f26472b;
            Objects.requireNonNull(encode, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes5 = encode.getBytes(charset3);
            Intrinsics.checkIfNull(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: d */
        public final void m34136d(String str, Bitmap bitmap) {
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(bitmap, "bitmap");
            m34134f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f6628c);
            m34131i(BuildConfig.VERSION_NAME, new Object[0]);
            m34129k();
            Logger logger = this.f6629d;
            if (logger != null) {
                logger.m709d("    " + str, "<Image>");
            }
        }

        /* renamed from: e */
        public final void m34135e(String str, byte[] bArr) {
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(bArr, "bytes");
            m34134f(str, str, "content/unknown");
            this.f6628c.write(bArr);
            m34131i(BuildConfig.VERSION_NAME, new Object[0]);
            m34129k();
            Logger logger = this.f6629d;
            if (logger != null) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
                logger.m709d("    " + str, format);
            }
        }

        /* renamed from: f */
        public final void m34134f(String str, String str2, String str3) {
            if (!this.f6627b) {
                m34137c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m34137c("; filename=\"%s\"", str2);
                }
                m34131i(BuildConfig.VERSION_NAME, new Object[0]);
                if (str3 != null) {
                    m34131i("%s: %s", "Content-Type", str3);
                }
                m34131i(BuildConfig.VERSION_NAME, new Object[0]);
                return;
            }
            OutputStream outputStream = this.f6628c;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            Charset charset = C10150d.f26472b;
            Objects.requireNonNull(format, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = format.getBytes(charset);
            Intrinsics.checkIfNull(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: g */
        public final void m34133g(String str, Uri uri, String str2) {
            int m33948j;
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m34134f(str, str, str2);
            if (this.f6628c instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.f6628c).m19113c(Utility.m33942p(uri));
                m33948j = 0;
            } else {
                Context m34110e = C2290b.m34110e();
                Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
                m33948j = Utility.m33948j(m34110e.getContentResolver().openInputStream(uri), this.f6628c) + 0;
            }
            m34131i(BuildConfig.VERSION_NAME, new Object[0]);
            m34129k();
            Logger logger = this.f6629d;
            if (logger != null) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m33948j)}, 1));
                Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
                logger.m709d("    " + str, format);
            }
        }

        /* renamed from: h */
        public final void m34132h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int m33948j;
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m34134f(str, str, str2);
            OutputStream outputStream = this.f6628c;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).m19113c(parcelFileDescriptor.getStatSize());
                m33948j = 0;
            } else {
                m33948j = Utility.m33948j(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f6628c) + 0;
            }
            m34131i(BuildConfig.VERSION_NAME, new Object[0]);
            m34129k();
            Logger logger = this.f6629d;
            if (logger != null) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m33948j)}, 1));
                Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
                logger.m709d("    " + str, format);
            }
        }

        /* renamed from: i */
        public final void m34131i(String str, Object... objArr) {
            Intrinsics.isThisObjectNull(str, "format");
            Intrinsics.isThisObjectNull(objArr, "args");
            m34137c(str, Arrays.copyOf(objArr, objArr.length));
            if (this.f6627b) {
                return;
            }
            m34137c("\r\n", new Object[0]);
        }

        /* renamed from: j */
        public final void m34130j(String str, Object obj, GraphRequest graphRequest) {
            Intrinsics.isThisObjectNull(str, "key");
            OutputStream outputStream = this.f6628c;
            if (outputStream instanceof InterfaceC7129h) {
                Objects.requireNonNull(outputStream, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((InterfaceC7129h) outputStream).mo19110a(graphRequest);
            }
            C2279c c2279c = GraphRequest.f6606s;
            if (C2279c.m34166b(c2279c, obj)) {
                m34139a(str, C2279c.m34165c(c2279c, obj));
            } else if (obj instanceof Bitmap) {
                m34136d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                m34135e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                m34133g(str, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m34132h(str, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable m34183b = parcelableResourceWithMimeType.m34183b();
                String m34184a = parcelableResourceWithMimeType.m34184a();
                if (m34183b instanceof ParcelFileDescriptor) {
                    m34132h(str, (ParcelFileDescriptor) m34183b, m34184a);
                } else if (m34183b instanceof Uri) {
                    m34133g(str, (Uri) m34183b, m34184a);
                } else {
                    throw m34138b();
                }
            } else {
                throw m34138b();
            }
        }

        /* renamed from: k */
        public final void m34129k() {
            if (!this.f6627b) {
                m34131i("--%s", GraphRequest.m34209b());
                return;
            }
            OutputStream outputStream = this.f6628c;
            byte[] bytes = "&".getBytes(C10150d.f26472b);
            Intrinsics.checkIfNull(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: l */
        public final void m34128l(String str, JSONArray jSONArray, Collection collection) {
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(jSONArray, "requestJsonArray");
            Intrinsics.isThisObjectNull(collection, "requests");
            OutputStream outputStream = this.f6628c;
            if (!(outputStream instanceof InterfaceC7129h)) {
                String jSONArray2 = jSONArray.toString();
                Intrinsics.checkIfNull(jSONArray2, "requestJsonArray.toString()");
                m34139a(str, jSONArray2);
                return;
            }
            Objects.requireNonNull(outputStream, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            InterfaceC7129h interfaceC7129h = (InterfaceC7129h) outputStream;
            m34134f(str, null, null);
            m34137c("[", new Object[0]);
            Iterator it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                interfaceC7129h.mo19110a((GraphRequest) it.next());
                if (i > 0) {
                    m34137c(",%s", jSONObject.toString());
                } else {
                    m34137c("%s", jSONObject.toString());
                }
                i++;
            }
            m34137c("]", new Object[0]);
            Logger logger = this.f6629d;
            if (logger != null) {
                String jSONArray3 = jSONArray.toString();
                Intrinsics.checkIfNull(jSONArray3, "requestJsonArray.toString()");
                logger.m709d("    " + str, jSONArray3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$g */
    /* loaded from: classes.dex */
    public static final class C2284g implements InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2278b f6630a;

        C2284g(InterfaceC2278b interfaceC2278b) {
            this.f6630a = interfaceC2278b;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            Intrinsics.isThisObjectNull(graphResponse, "response");
            JSONObject m34082c = graphResponse.m34082c();
            JSONObject optJSONObject = m34082c != null ? m34082c.optJSONObject("__debug__") : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                    if (optString != null && optString2 != null) {
                        EnumC2305f enumC2305f = EnumC2305f.GRAPH_API_DEBUG_INFO;
                        if (Intrinsics.equals(optString2, "warning")) {
                            enumC2305f = EnumC2305f.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!Utility.m33977G(optString3)) {
                            optString = optString + " Link: " + optString3;
                        }
                        Logger.f34697f.m702c(enumC2305f, GraphRequest.f6606s.m34152p(), optString);
                    }
                }
            }
            InterfaceC2278b interfaceC2278b = this.f6630a;
            if (interfaceC2278b != null) {
                interfaceC2278b.mo15411a(graphResponse);
            }
        }
    }

    /* compiled from: GraphRequest.kt */
    /* renamed from: com.facebook.GraphRequest$h */
    /* loaded from: classes.dex */
    public static final class C2285h implements InterfaceC2281d {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6631a;

        C2285h(ArrayList arrayList) {
            this.f6631a = arrayList;
        }

        /* renamed from: a */
        public void m34127a(String str, String str2) throws IOException {
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(str2, "value");
            ArrayList arrayList = this.f6631a;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
            Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        String simpleName = GraphRequest.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "GraphRequest::class.java.simpleName");
        f6601n = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkIfNull(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "buffer.toString()");
        f6602o = sb3;
        f6604q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC2303d enumC2303d, InterfaceC2278b interfaceC2278b, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : enumC2303d, (i & 16) != 0 ? null : interfaceC2278b, (i & 32) != 0 ? null : str2);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m34210a() {
        return f6603p;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m34209b() {
        return f6602o;
    }

    /* renamed from: c */
    public static final /* synthetic */ String m34208c() {
        return f6601n;
    }

    /* renamed from: d */
    public static final /* synthetic */ String m34207d() {
        return f6605r;
    }

    /* renamed from: e */
    public static final /* synthetic */ Pattern m34206e() {
        return f6604q;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m34205f(GraphRequest graphRequest, JSONArray jSONArray, Map map) {
        graphRequest.m34186y(jSONArray, map);
    }

    /* renamed from: g */
    public static final /* synthetic */ void m34204g(String str) {
        f6605r = str;
    }

    /* renamed from: h */
    private final void m34203h() {
        AccessToken accessToken = this.f6607a;
        Bundle bundle = this.f6613g;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String m34246n = accessToken.m34246n();
                Logger.f34697f.m700e(m34246n);
                bundle.putString("access_token", m34246n);
            }
        } else if (!this.f6618l && !bundle.containsKey("access_token")) {
            String m34109f = C2290b.m34109f();
            String m34105j = C2290b.m34105j();
            if (!Utility.m33977G(m34109f) && !Utility.m33977G(m34105j)) {
                bundle.putString("access_token", m34109f + '|' + m34105j);
            } else {
                Utility.m33973K(f6601n, "Warning: Request without access token missing application ID or client token.");
            }
        }
        if (!bundle.containsKey("access_token") && Utility.m33977G(C2290b.m34105j())) {
            Log.w(f6601n, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        if (C2290b.m34093v(EnumC2305f.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C2290b.m34093v(EnumC2305f.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* renamed from: i */
    private final String m34202i(String str, boolean z) {
        if (z || this.f6617k != EnumC2303d.POST) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : this.f6613g.keySet()) {
                Object obj = this.f6613g.get(str2);
                if (obj == null) {
                    obj = BuildConfig.VERSION_NAME;
                }
                C2279c c2279c = f6606s;
                if (C2279c.m34166b(c2279c, obj)) {
                    buildUpon.appendQueryParameter(str2, C2279c.m34165c(c2279c, obj).toString());
                } else if (this.f6617k != EnumC2303d.GET) {
                    C6429c0 c6429c0 = C6429c0.f17515a;
                    String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                    Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
                    throw new IllegalArgumentException(format);
                }
            }
            String builder = buildUpon.toString();
            Intrinsics.checkIfNull(builder, "uriBuilder.toString()");
            return builder;
        }
        return str;
    }

    /* renamed from: p */
    private final String m34195p() {
        if (f6604q.matcher(this.f6608b).matches()) {
            return this.f6608b;
        }
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f6615i, this.f6608b}, 2));
        Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: w */
    public static final GraphRequest m34188w(AccessToken accessToken, String str, InterfaceC2278b interfaceC2278b) {
        return f6606s.m34145w(accessToken, str, interfaceC2278b);
    }

    /* renamed from: x */
    public static final GraphRequest m34187x(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC2278b interfaceC2278b) {
        return f6606s.m34144x(accessToken, str, jSONObject, interfaceC2278b);
    }

    /* renamed from: y */
    private final void m34186y(JSONArray jSONArray, Map map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f6610d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f6612f);
        }
        String str2 = this.f6611e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String m34192s = m34192s();
        jSONObject.put("relative_url", m34192s);
        jSONObject.put("method", this.f6617k);
        AccessToken accessToken = this.f6607a;
        if (accessToken != null) {
            Logger.f34697f.m700e(accessToken.m34246n());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f6613g.keySet()) {
            Object obj = this.f6613g.get(str3);
            if (C2279c.m34167a(f6606s, obj)) {
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                Intrinsics.checkIfNull(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new C2277a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f6609c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            C2279c.m34164d(f6606s, jSONObject2, m34192s, new C2285h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: A */
    public final void m34215A(JSONObject jSONObject) {
        this.f6609c = jSONObject;
    }

    /* renamed from: B */
    public final void m34214B(EnumC2303d enumC2303d) {
        if (this.f6619m != null && enumC2303d != EnumC2303d.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (enumC2303d == null) {
            enumC2303d = EnumC2303d.GET;
        }
        this.f6617k = enumC2303d;
    }

    /* renamed from: C */
    public final void m34213C(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "<set-?>");
        this.f6613g = bundle;
    }

    /* renamed from: D */
    public final void m34212D(boolean z) {
        this.f6618l = z;
    }

    /* renamed from: E */
    public final void m34211E(Object obj) {
        this.f6614h = obj;
    }

    /* renamed from: j */
    public final GraphResponse m34201j() {
        return f6606s.m34162f(this);
    }

    /* renamed from: k */
    public final GraphRequestAsyncTask m34200k() {
        return f6606s.m34156l(this);
    }

    /* renamed from: l */
    public final AccessToken m34199l() {
        return this.f6607a;
    }

    /* renamed from: m */
    public final InterfaceC2278b m34198m() {
        return this.f6616j;
    }

    /* renamed from: n */
    public final JSONObject m34197n() {
        return this.f6609c;
    }

    /* renamed from: o */
    public final String m34196o() {
        return this.f6608b;
    }

    /* renamed from: q */
    public final EnumC2303d m34194q() {
        return this.f6617k;
    }

    /* renamed from: r */
    public final Bundle m34193r() {
        return this.f6613g;
    }

    /* renamed from: s */
    public final String m34192s() {
        if (this.f6619m == null) {
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{C13656n.m679b(), m34195p()}, 2));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            m34203h();
            Uri parse = Uri.parse(m34202i(format, true));
            Intrinsics.checkIfNull(parse, "uri");
            String format2 = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            Intrinsics.checkIfNull(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    /* renamed from: t */
    public final Object m34191t() {
        return this.f6614h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.f6607a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f6608b);
        sb2.append(", graphObject: ");
        sb2.append(this.f6609c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f6617k);
        sb2.append(", parameters: ");
        sb2.append(this.f6613g);
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb3;
    }

    /* renamed from: u */
    public final String m34190u() {
        String m679b;
        boolean m8944p;
        String str = this.f6619m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f6608b;
        if (this.f6617k == EnumC2303d.POST && str2 != null) {
            m8944p = StringsJVM.m8944p(str2, "/videos", false, 2, null);
            if (m8944p) {
                m679b = C13656n.m678c();
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format("%s/%s", Arrays.copyOf(new Object[]{m679b, m34195p()}, 2));
                Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
                m34203h();
                return m34202i(format, false);
            }
        }
        m679b = C13656n.m679b();
        C6429c0 c6429c02 = C6429c0.f17515a;
        String format2 = String.format("%s/%s", Arrays.copyOf(new Object[]{m679b, m34195p()}, 2));
        Intrinsics.checkIfNull(format2, "java.lang.String.format(format, *args)");
        m34203h();
        return m34202i(format2, false);
    }

    /* renamed from: v */
    public final String m34189v() {
        return this.f6615i;
    }

    /* renamed from: z */
    public final void m34185z(InterfaceC2278b interfaceC2278b) {
        if (!C2290b.m34093v(EnumC2305f.GRAPH_API_DEBUG_INFO) && !C2290b.m34093v(EnumC2305f.GRAPH_API_DEBUG_WARNING)) {
            this.f6616j = interfaceC2278b;
        } else {
            this.f6616j = new C2284g(interfaceC2278b);
        }
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, EnumC2303d enumC2303d, InterfaceC2278b interfaceC2278b, String str2) {
        this.f6612f = true;
        this.f6607a = accessToken;
        this.f6608b = str;
        this.f6615i = str2;
        m34185z(interfaceC2278b);
        m34214B(enumC2303d);
        if (bundle != null) {
            this.f6613g = new Bundle(bundle);
        } else {
            this.f6613g = new Bundle();
        }
        if (this.f6615i == null) {
            this.f6615i = C2290b.m34102m();
        }
    }
}
