package p075e4;

import android.util.Pair;
import com.airbnb.lottie.C2201d;
import com.airbnb.lottie.C2202e;
import com.airbnb.lottie.C2231l;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p130h4.C5848d;

/* renamed from: e4.h */
/* loaded from: classes.dex */
public class C4985h {

    /* renamed from: a */
    private final C4984g f13910a;

    /* renamed from: b */
    private final InterfaceC4983f f13911b;

    public C4985h(C4984g c4984g, InterfaceC4983f interfaceC4983f) {
        this.f13910a = c4984g;
        this.f13911b = interfaceC4983f;
    }

    /* renamed from: a */
    private C2201d m25972a(String str, String str2) {
        Pair<EnumC4980c, InputStream> m25978a;
        C2231l<C2201d> m34401i;
        if (str2 == null || (m25978a = this.f13910a.m25978a(str)) == null) {
            return null;
        }
        EnumC4980c enumC4980c = (EnumC4980c) m25978a.first;
        InputStream inputStream = (InputStream) m25978a.second;
        if (enumC4980c == EnumC4980c.ZIP) {
            m34401i = C2202e.m34391s(new ZipInputStream(inputStream), str);
        } else {
            m34401i = C2202e.m34401i(inputStream, str);
        }
        if (m34401i.m34304b() != null) {
            return m34401i.m34304b();
        }
        return null;
    }

    /* renamed from: b */
    private C2231l<C2201d> m25971b(String str, String str2) {
        C5848d.m22931a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC4981d mo25979a = this.f13911b.mo25979a(str);
                if (mo25979a.mo25984V()) {
                    C2231l<C2201d> m25969d = m25969d(str, mo25979a.mo25983j(), mo25979a.mo25982s0(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(m25969d.m34304b() != null);
                    C5848d.m22931a(sb2.toString());
                    try {
                        mo25979a.close();
                    } catch (IOException e) {
                        C5848d.m22928d("LottieFetchResult close failed ", e);
                    }
                    return m25969d;
                }
                C2231l<C2201d> c2231l = new C2231l<>(new IllegalArgumentException(mo25979a.mo25981y0()));
                try {
                    mo25979a.close();
                } catch (IOException e2) {
                    C5848d.m22928d("LottieFetchResult close failed ", e2);
                }
                return c2231l;
            } catch (Exception e3) {
                C2231l<C2201d> c2231l2 = new C2231l<>(e3);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        C5848d.m22928d("LottieFetchResult close failed ", e4);
                    }
                }
                return c2231l2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    C5848d.m22928d("LottieFetchResult close failed ", e5);
                }
            }
            throw th2;
        }
    }

    /* renamed from: d */
    private C2231l<C2201d> m25969d(String str, InputStream inputStream, String str2, String str3) throws IOException {
        EnumC4980c enumC4980c;
        C2231l<C2201d> m25967f;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str.split("\\?")[0].endsWith(".lottie")) {
            C5848d.m22931a("Received json response.");
            enumC4980c = EnumC4980c.JSON;
            m25967f = m25968e(str, inputStream, str3);
        } else {
            C5848d.m22931a("Handling zip response.");
            enumC4980c = EnumC4980c.ZIP;
            m25967f = m25967f(str, inputStream, str3);
        }
        if (str3 != null && m25967f.m34304b() != null) {
            this.f13910a.m25974e(str, enumC4980c);
        }
        return m25967f;
    }

    /* renamed from: e */
    private C2231l<C2201d> m25968e(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return C2202e.m34401i(inputStream, null);
        }
        return C2202e.m34401i(new FileInputStream(new File(this.f13910a.m25973f(str, inputStream, EnumC4980c.JSON).getAbsolutePath())), str);
    }

    /* renamed from: f */
    private C2231l<C2201d> m25967f(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return C2202e.m34391s(new ZipInputStream(inputStream), null);
        }
        return C2202e.m34391s(new ZipInputStream(new FileInputStream(this.f13910a.m25973f(str, inputStream, EnumC4980c.ZIP))), str);
    }

    /* renamed from: c */
    public C2231l<C2201d> m25970c(String str, String str2) {
        C2201d m25972a = m25972a(str, str2);
        if (m25972a != null) {
            return new C2231l<>(m25972a);
        }
        C5848d.m22931a("Animation for " + str + " not found in cache. Fetching from network.");
        return m25971b(str, str2);
    }
}
