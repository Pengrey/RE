package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.C2386d;
import com.google.android.datatransport.runtime.backends.AbstractC2395d;
import com.google.android.datatransport.runtime.backends.AbstractC2397e;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4246a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.joda.time.DateTimeConstants;
import p007a6.AbstractC0046i;
import p007a6.C0045h;
import p028b6.InterfaceC1831g;
import p098f6.C5414a;
import p118g6.C5611b;
import p118g6.InterfaceC5610a;
import p216l6.InterfaceC6984a;
import p461y5.C13111b;
import p483z5.AbstractC13657a;
import p483z5.AbstractC13683j;
import p483z5.AbstractC13684k;
import p483z5.AbstractC13687l;
import p483z5.AbstractC13689m;
import p483z5.AbstractC13691n;
import p483z5.AbstractC13692o;
import p483z5.EnumC13696p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes.dex */
public final class C2386d implements InterfaceC1831g {

    /* renamed from: a */
    private final InterfaceC4246a f6965a;

    /* renamed from: b */
    private final ConnectivityManager f6966b;

    /* renamed from: c */
    private final Context f6967c;

    /* renamed from: d */
    final URL f6968d;

    /* renamed from: e */
    private final InterfaceC6984a f6969e;

    /* renamed from: f */
    private final InterfaceC6984a f6970f;

    /* renamed from: g */
    private final int f6971g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* loaded from: classes.dex */
    public static final class C2387a {

        /* renamed from: a */
        final URL f6972a;

        /* renamed from: b */
        final AbstractC13683j f6973b;

        /* renamed from: c */
        final String f6974c;

        C2387a(URL url, AbstractC13683j abstractC13683j, String str) {
            this.f6972a = url;
            this.f6973b = abstractC13683j;
            this.f6974c = str;
        }

        /* renamed from: a */
        C2387a m33698a(URL url) {
            return new C2387a(url, this.f6973b, this.f6974c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* loaded from: classes.dex */
    public static final class C2388b {

        /* renamed from: a */
        final int f6975a;

        /* renamed from: b */
        final URL f6976b;

        /* renamed from: c */
        final long f6977c;

        C2388b(int i, URL url, long j) {
            this.f6975a = i;
            this.f6976b = url;
            this.f6977c = j;
        }
    }

    C2386d(Context context, InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, int i) {
        this.f6965a = AbstractC13683j.m633b();
        this.f6967c = context;
        this.f6966b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6968d = m33699n(C2383a.f6956c);
        this.f6969e = interfaceC6984a2;
        this.f6970f = interfaceC6984a;
        this.f6971g = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public C2388b m33708e(C2387a c2387a) throws IOException {
        C5414a.m24382a("CctTransportBackend", "Making request to: %s", c2387a.f6972a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c2387a.f6972a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f6971g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.2"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c2387a.f6974c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f6965a.mo28185b(c2387a.f6973b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C5414a.m24378e("CctTransportBackend", "Status Code: " + responseCode);
                C5414a.m24378e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C5414a.m24378e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C2388b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new C2388b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m33700m = m33700m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C2388b c2388b = new C2388b(responseCode, null, AbstractC13691n.m588b(new BufferedReader(new InputStreamReader(m33700m))).mo587c());
                    if (m33700m != null) {
                        m33700m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return c2388b;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e) {
            e = e;
            C5414a.m24380c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C2388b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            C5414a.m24380c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2388b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            C5414a.m24380c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C2388b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            C5414a.m24380c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C2388b(400, null, 0L);
        }
    }

    /* renamed from: f */
    private static int m33707f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC13692o.EnumC13694b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC13692o.EnumC13694b.COMBINED.getValue();
        }
        if (AbstractC13692o.EnumC13694b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    private static int m33706g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC13692o.EnumC13695c.NONE.getValue();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m33705h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C5414a.m24380c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private AbstractC13683j m33704i(AbstractC2395d abstractC2395d) {
        AbstractC13687l.AbstractC13688a m616j;
        HashMap hashMap = new HashMap();
        for (AbstractC0046i abstractC0046i : abstractC2395d.mo33695b()) {
            String mo42079j = abstractC0046i.mo42079j();
            if (!hashMap.containsKey(mo42079j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC0046i);
                hashMap.put(mo42079j, arrayList);
            } else {
                ((List) hashMap.get(mo42079j)).add(abstractC0046i);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC0046i abstractC0046i2 = (AbstractC0046i) ((List) entry.getValue()).get(0);
            AbstractC13689m.AbstractC13690a mo598b = AbstractC13689m.m607a().mo594f(EnumC13696p.DEFAULT).mo593g(this.f6970f.mo19644a()).mo592h(this.f6969e.mo19644a()).mo598b(AbstractC13684k.m631a().mo626c(AbstractC13684k.EnumC13686b.ANDROID_FIREBASE).mo627b(AbstractC13657a.m668a().mo635m(Integer.valueOf(abstractC0046i2.m42082g("sdk-version"))).mo638j(abstractC0046i2.m42087b("model")).mo642f(abstractC0046i2.m42087b("hardware")).mo644d(abstractC0046i2.m42087b("device")).mo636l(abstractC0046i2.m42087b("product")).mo637k(abstractC0046i2.m42087b("os-uild")).mo640h(abstractC0046i2.m42087b("manufacturer")).mo643e(abstractC0046i2.m42087b("fingerprint")).mo645c(abstractC0046i2.m42087b("country")).mo641g(abstractC0046i2.m42087b("locale")).mo639i(abstractC0046i2.m42087b("mcc_mnc")).mo646b(abstractC0046i2.m42087b("application_build")).mo647a()).mo628a());
            try {
                mo598b.m591i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                mo598b.m590j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC0046i abstractC0046i3 : (List) entry.getValue()) {
                C0045h mo42084e = abstractC0046i3.mo42084e();
                C13111b m42089b = mo42084e.m42089b();
                if (m42089b.equals(C13111b.m1584b("proto"))) {
                    m616j = AbstractC13687l.m616j(mo42084e.m42090a());
                } else if (m42089b.equals(C13111b.m1584b("json"))) {
                    m616j = AbstractC13687l.m617i(new String(mo42084e.m42090a(), Charset.forName("UTF-8")));
                } else {
                    C5414a.m24377f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", m42089b);
                }
                m616j.mo613c(abstractC0046i3.mo42083f()).mo612d(abstractC0046i3.mo42078k()).mo608h(abstractC0046i3.m42081h("tz-offset")).mo611e(AbstractC13692o.m586a().mo581c(AbstractC13692o.EnumC13695c.forNumber(abstractC0046i3.m42082g("net-type"))).mo582b(AbstractC13692o.EnumC13694b.forNumber(abstractC0046i3.m42082g("mobile-subtype"))).mo583a());
                if (abstractC0046i3.mo42085d() != null) {
                    m616j.mo614b(abstractC0046i3.mo42085d());
                }
                arrayList3.add(m616j.mo615a());
            }
            mo598b.mo597c(arrayList3);
            arrayList2.add(mo598b.mo599a());
        }
        return AbstractC13683j.m634a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m33703j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: k */
    static long m33702k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / DateTimeConstants.MILLIS_PER_SECOND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C2387a m33701l(C2387a c2387a, C2388b c2388b) {
        URL url = c2388b.f6976b;
        if (url != null) {
            C5414a.m24382a("CctTransportBackend", "Following redirect to: %s", url);
            return c2387a.m33698a(c2388b.f6976b);
        }
        return null;
    }

    /* renamed from: m */
    private static InputStream m33700m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: n */
    private static URL m33699n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // p028b6.InterfaceC1831g
    /* renamed from: a */
    public AbstractC2397e mo33712a(AbstractC2395d abstractC2395d) {
        AbstractC13683j m33704i = m33704i(abstractC2395d);
        URL url = this.f6968d;
        if (abstractC2395d.mo33694c() != null) {
            try {
                C2383a m33715e = C2383a.m33715e(abstractC2395d.mo33694c());
                r3 = m33715e.m33714f() != null ? m33715e.m33714f() : null;
                if (m33715e.m33713g() != null) {
                    url = m33699n(m33715e.m33713g());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC2397e.m33690a();
            }
        }
        try {
            C2388b c2388b = (C2388b) C5611b.m23577a(5, new C2387a(url, m33704i, r3), new InterfaceC5610a() { // from class: com.google.android.datatransport.cct.b
                @Override // p118g6.InterfaceC5610a
                /* renamed from: a */
                public final Object mo23578a(Object obj) {
                    C2386d.C2388b m33708e;
                    m33708e = C2386d.this.m33708e((C2386d.C2387a) obj);
                    return m33708e;
                }
            }, C2385c.f6964a);
            int i = c2388b.f6975a;
            if (i == 200) {
                return AbstractC2397e.m33686e(c2388b.f6977c);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                    return AbstractC2397e.m33687d();
                }
                return AbstractC2397e.m33690a();
            }
            return AbstractC2397e.m33685f();
        } catch (IOException e) {
            C5414a.m24380c("CctTransportBackend", "Could not make request to the backend", e);
            return AbstractC2397e.m33685f();
        }
    }

    @Override // p028b6.InterfaceC1831g
    /* renamed from: b */
    public AbstractC0046i mo33711b(AbstractC0046i abstractC0046i) {
        NetworkInfo activeNetworkInfo = this.f6966b.getActiveNetworkInfo();
        return abstractC0046i.m42077l().m42076a("sdk-version", Build.VERSION.SDK_INT).m42074c("model", Build.MODEL).m42074c("hardware", Build.HARDWARE).m42074c("device", Build.DEVICE).m42074c("product", Build.PRODUCT).m42074c("os-uild", Build.ID).m42074c("manufacturer", Build.MANUFACTURER).m42074c("fingerprint", Build.FINGERPRINT).m42075b("tz-offset", m33702k()).m42076a("net-type", m33706g(activeNetworkInfo)).m42076a("mobile-subtype", m33707f(activeNetworkInfo)).m42074c("country", Locale.getDefault().getCountry()).m42074c("locale", Locale.getDefault().getLanguage()).m42074c("mcc_mnc", m33703j(this.f6967c).getSimOperator()).m42074c("application_build", Integer.toString(m33705h(this.f6967c))).mo42073d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2386d(Context context, InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2) {
        this(context, interfaceC6984a, interfaceC6984a2, 40000);
    }
}
