package com.facebook;

import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p233m4.GraphRequestBatch;
import p482z4.Logger;
import p489zc.Iterables;

/* renamed from: com.facebook.c */
/* loaded from: classes.dex */
public final class GraphResponse {

    /* renamed from: a */
    private final JSONObject f6667a;

    /* renamed from: b */
    private final HttpURLConnection f6668b;

    /* renamed from: c */
    private final JSONObject f6669c;

    /* renamed from: d */
    private final JSONArray f6670d;

    /* renamed from: e */
    private final FacebookRequestError f6671e;

    /* renamed from: g */
    public static final C2302a f6666g = new C2302a(null);

    /* renamed from: f */
    private static final String f6665f = GraphResponse.class.getCanonicalName();

    /* compiled from: GraphResponse.kt */
    /* renamed from: com.facebook.c$a */
    /* loaded from: classes.dex */
    public static final class C2302a {
        private C2302a() {
        }

        /* renamed from: b */
        private final GraphResponse m34079b(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                FacebookRequestError m34219a = FacebookRequestError.f6596H.m34219a(jSONObject, obj2, httpURLConnection);
                if (m34219a != null) {
                    Log.e(m34074g(), m34219a.toString());
                    if (m34219a.m34227b() == 190 && Utility.m33979E(graphRequest.m34199l())) {
                        if (m34219a.m34222h() != 493) {
                            AccessToken.f6572L.m34229h(null);
                        } else {
                            AccessToken.C2265c c2265c = AccessToken.f6572L;
                            AccessToken m34232e = c2265c.m34232e();
                            if (m34232e != null && !m34232e.m34243t()) {
                                c2265c.m34233d();
                            }
                        }
                    }
                    return new GraphResponse(graphRequest, httpURLConnection, m34219a);
                }
                Object m33933y = Utility.m33933y(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (m33933y instanceof JSONObject) {
                    return new GraphResponse(graphRequest, httpURLConnection, m33933y.toString(), (JSONObject) m33933y);
                }
                if (m33933y instanceof JSONArray) {
                    return new GraphResponse(graphRequest, httpURLConnection, m33933y.toString(), (JSONArray) m33933y);
                }
                obj = JSONObject.NULL;
                Intrinsics.checkIfNull(obj, "JSONObject.NULL");
            }
            if (obj == JSONObject.NULL) {
                return new GraphResponse(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List m34078c(java.net.HttpURLConnection r9, java.util.List r10, java.lang.Object r11) throws com.facebook.FacebookException, org.json.JSONException {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
                r3 = 1
                if (r0 != r3) goto L51
                java.lang.Object r3 = r10.get(r2)
                com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                if (r9 == 0) goto L24
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                goto L26
            L24:
                r5 = 200(0xc8, float:2.8E-43)
            L26:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                goto L52
            L34:
                r4 = move-exception
                com.facebook.c r5 = new com.facebook.c
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r3, r9, r6)
                r1.add(r5)
                goto L51
            L43:
                r4 = move-exception
                com.facebook.c r5 = new com.facebook.c
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r3, r9, r6)
                r1.add(r5)
            L51:
                r5 = r11
            L52:
                boolean r3 = r5 instanceof org.json.JSONArray
                if (r3 == 0) goto La0
                r3 = r5
                org.json.JSONArray r3 = (org.json.JSONArray) r3
                int r4 = r3.length()
                if (r4 != r0) goto La0
                int r0 = r3.length()
            L63:
                if (r2 >= r0) goto L9f
                java.lang.Object r3 = r10.get(r2)
                com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
                r4 = r5
                org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: com.facebook.FacebookException -> L7f org.json.JSONException -> L8e
                java.lang.Object r4 = r4.get(r2)     // Catch: com.facebook.FacebookException -> L7f org.json.JSONException -> L8e
                java.lang.String r6 = "obj"
                p181jd.Intrinsics.checkIfNull(r4, r6)     // Catch: com.facebook.FacebookException -> L7f org.json.JSONException -> L8e
                com.facebook.c r4 = r8.m34079b(r3, r9, r4, r11)     // Catch: com.facebook.FacebookException -> L7f org.json.JSONException -> L8e
                r1.add(r4)     // Catch: com.facebook.FacebookException -> L7f org.json.JSONException -> L8e
                goto L9c
            L7f:
                r4 = move-exception
                com.facebook.c r6 = new com.facebook.c
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r4)
                r6.<init>(r3, r9, r7)
                r1.add(r6)
                goto L9c
            L8e:
                r4 = move-exception
                com.facebook.c r6 = new com.facebook.c
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r4)
                r6.<init>(r3, r9, r7)
                r1.add(r6)
            L9c:
                int r2 = r2 + 1
                goto L63
            L9f:
                return r1
            La0:
                com.facebook.FacebookException r9 = new com.facebook.FacebookException
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphResponse.C2302a.m34078c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        /* renamed from: a */
        public final List m34080a(List list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            int m186r;
            Intrinsics.isThisObjectNull(list, "requests");
            m186r = Iterables.m186r(list, 10);
            ArrayList arrayList = new ArrayList(m186r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        /* renamed from: d */
        public final List m34077d(InputStream inputStream, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) throws FacebookException, JSONException, IOException {
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            String m33970N = Utility.m33970N(inputStream);
            Logger.f34697f.m701d(EnumC2305f.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(m33970N.length()), m33970N);
            return m34076e(m33970N, httpURLConnection, graphRequestBatch);
        }

        /* renamed from: e */
        public final List m34076e(String str, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) throws FacebookException, JSONException, IOException {
            Intrinsics.isThisObjectNull(str, "responseString");
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            Intrinsics.checkIfNull(nextValue, "resultObject");
            List m34078c = m34078c(httpURLConnection, graphRequestBatch, nextValue);
            Logger.f34697f.m701d(EnumC2305f.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", graphRequestBatch.m19128y(), Integer.valueOf(str.length()), m34078c);
            return m34078c;
        }

        /* renamed from: f */
        public final List m34075f(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            List m34080a;
            Intrinsics.isThisObjectNull(httpURLConnection, "connection");
            Intrinsics.isThisObjectNull(graphRequestBatch, "requests");
            InputStream inputStream = null;
            try {
                try {
                } catch (FacebookException e) {
                    Logger.f34697f.m701d(EnumC2305f.REQUESTS, "Response", "Response <Error>: %s", e);
                    m34080a = m34080a(graphRequestBatch, httpURLConnection, e);
                } catch (Exception e2) {
                    Logger.f34697f.m701d(EnumC2305f.REQUESTS, "Response", "Response <Error>: %s", e2);
                    m34080a = m34080a(graphRequestBatch, httpURLConnection, new FacebookException(e2));
                }
                if (C2290b.m34096s()) {
                    if (httpURLConnection.getResponseCode() >= 400) {
                        inputStream = httpURLConnection.getErrorStream();
                    } else {
                        inputStream = httpURLConnection.getInputStream();
                    }
                    m34080a = m34077d(inputStream, httpURLConnection, graphRequestBatch);
                    return m34080a;
                }
                Log.e(m34074g(), "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } finally {
                Utility.m33953e(null);
            }
        }

        /* renamed from: g */
        public final String m34074g() {
            return GraphResponse.m34084a();
        }

        public /* synthetic */ C2302a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        Intrinsics.isThisObjectNull(graphRequest, "request");
        this.f6668b = httpURLConnection;
        this.f6669c = jSONObject;
        this.f6670d = jSONArray;
        this.f6671e = facebookRequestError;
        this.f6667a = jSONObject;
    }

    /* renamed from: a */
    public static final /* synthetic */ String m34084a() {
        return f6665f;
    }

    /* renamed from: b */
    public final FacebookRequestError m34083b() {
        return this.f6671e;
    }

    /* renamed from: c */
    public final JSONObject m34082c() {
        return this.f6669c;
    }

    /* renamed from: d */
    public final JSONObject m34081d() {
        return this.f6667a;
    }

    public String toString() {
        String str;
        try {
            C6429c0 c6429c0 = C6429c0.f17515a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f6668b;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            Intrinsics.checkIfNull(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f6669c + ", error: " + this.f6671e + "}";
        Intrinsics.checkIfNull(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        Intrinsics.isThisObjectNull(graphRequest, "request");
        Intrinsics.isThisObjectNull(str, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        Intrinsics.isThisObjectNull(graphRequest, "request");
        Intrinsics.isThisObjectNull(str, "rawResponse");
        Intrinsics.isThisObjectNull(jSONArray, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        Intrinsics.isThisObjectNull(graphRequest, "request");
        Intrinsics.isThisObjectNull(facebookRequestError, "error");
    }
}
