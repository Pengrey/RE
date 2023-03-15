package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p005a4.C0020g;
import p096f4.C5403t;
import p116g4.AbstractC5604c;
import p130h4.C5848d;
import p130h4.C5852h;
import p356sf.C10200t;
import p356sf.InterfaceC10187e;

/* renamed from: com.airbnb.lottie.e */
/* loaded from: classes.dex */
public class C2202e {

    /* renamed from: a */
    private static final Map<String, C2232m<C2201d>> f6380a = new HashMap();

    /* renamed from: b */
    private static final byte[] f6381b = {80, 75, 3, 4};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$a */
    /* loaded from: classes.dex */
    public class C2203a implements InterfaceC2227h<C2201d> {

        /* renamed from: a */
        final /* synthetic */ String f6382a;

        C2203a(String str) {
            this.f6382a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC2227h
        /* renamed from: b */
        public void mo34441b(C2201d c2201d) {
            C2202e.f6380a.remove(this.f6382a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$b */
    /* loaded from: classes.dex */
    public class C2204b implements InterfaceC2227h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f6383a;

        C2204b(String str) {
            this.f6383a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC2227h
        /* renamed from: b */
        public void mo34441b(Throwable th2) {
            C2202e.f6380a.remove(this.f6383a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$c */
    /* loaded from: classes.dex */
    public class CallableC2205c implements Callable<C2231l<C2201d>> {

        /* renamed from: a */
        final /* synthetic */ Context f6384a;

        /* renamed from: b */
        final /* synthetic */ String f6385b;

        /* renamed from: c */
        final /* synthetic */ String f6386c;

        CallableC2205c(Context context, String str, String str2) {
            this.f6384a = context;
            this.f6385b = str;
            this.f6386c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2231l<C2201d> call() {
            C2231l<C2201d> m25970c = C2199c.m34432d(this.f6384a).m25970c(this.f6385b, this.f6386c);
            if (this.f6386c != null && m25970c.m34304b() != null) {
                C0020g.m42109b().m42108c(this.f6386c, m25970c.m34304b());
            }
            return m25970c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$d */
    /* loaded from: classes.dex */
    public class CallableC2206d implements Callable<C2231l<C2201d>> {

        /* renamed from: a */
        final /* synthetic */ Context f6387a;

        /* renamed from: b */
        final /* synthetic */ String f6388b;

        /* renamed from: c */
        final /* synthetic */ String f6389c;

        CallableC2206d(Context context, String str, String str2) {
            this.f6387a = context;
            this.f6388b = str;
            this.f6389c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2231l<C2201d> call() {
            return C2202e.m34403g(this.f6387a, this.f6388b, this.f6389c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$e */
    /* loaded from: classes.dex */
    public class CallableC2207e implements Callable<C2231l<C2201d>> {

        /* renamed from: a */
        final /* synthetic */ WeakReference f6390a;

        /* renamed from: b */
        final /* synthetic */ Context f6391b;

        /* renamed from: c */
        final /* synthetic */ int f6392c;

        /* renamed from: d */
        final /* synthetic */ String f6393d;

        CallableC2207e(WeakReference weakReference, Context context, int i, String str) {
            this.f6390a = weakReference;
            this.f6391b = context;
            this.f6392c = i;
            this.f6393d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2231l<C2201d> call() {
            Context context = (Context) this.f6390a.get();
            if (context == null) {
                context = this.f6391b;
            }
            return C2202e.m34394p(context, this.f6392c, this.f6393d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$f */
    /* loaded from: classes.dex */
    public class CallableC2208f implements Callable<C2231l<C2201d>> {

        /* renamed from: a */
        final /* synthetic */ InputStream f6394a;

        /* renamed from: b */
        final /* synthetic */ String f6395b;

        CallableC2208f(InputStream inputStream, String str) {
            this.f6394a = inputStream;
            this.f6395b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2231l<C2201d> call() {
            return C2202e.m34401i(this.f6394a, this.f6395b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$g */
    /* loaded from: classes.dex */
    public class CallableC2209g implements Callable<C2231l<C2201d>> {

        /* renamed from: a */
        final /* synthetic */ C2201d f6396a;

        CallableC2209g(C2201d c2201d) {
            this.f6396a = c2201d;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2231l<C2201d> call() {
            return new C2231l<>(this.f6396a);
        }
    }

    /* renamed from: b */
    private static C2232m<C2201d> m34408b(String str, Callable<C2231l<C2201d>> callable) {
        C2201d m42110a = str == null ? null : C0020g.m42109b().m42110a(str);
        if (m42110a != null) {
            return new C2232m<>(new CallableC2209g(m42110a));
        }
        if (str != null) {
            Map<String, C2232m<C2201d>> map = f6380a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C2232m<C2201d> c2232m = new C2232m<>(callable);
        if (str != null) {
            c2232m.m34298f(new C2203a(str));
            c2232m.m34299e(new C2204b(str));
            f6380a.put(str, c2232m);
        }
        return c2232m;
    }

    /* renamed from: c */
    private static C2226g m34407c(C2201d c2201d, String str) {
        for (C2226g c2226g : c2201d.m34422j().values()) {
            if (c2226g.m34312b().equals(str)) {
                return c2226g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C2232m<C2201d> m34406d(Context context, String str) {
        return m34405e(context, str, "asset_" + str);
    }

    /* renamed from: e */
    public static C2232m<C2201d> m34405e(Context context, String str, String str2) {
        return m34408b(str2, new CallableC2206d(context.getApplicationContext(), str, str2));
    }

    /* renamed from: f */
    public static C2231l<C2201d> m34404f(Context context, String str) {
        return m34403g(context, str, "asset_" + str);
    }

    /* renamed from: g */
    public static C2231l<C2201d> m34403g(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m34401i(context.getAssets().open(str), str2);
            }
            return m34391s(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C2231l<>(e);
        }
    }

    /* renamed from: h */
    public static C2232m<C2201d> m34402h(InputStream inputStream, String str) {
        return m34408b(str, new CallableC2208f(inputStream, str));
    }

    /* renamed from: i */
    public static C2231l<C2201d> m34401i(InputStream inputStream, String str) {
        return m34400j(inputStream, str, true);
    }

    /* renamed from: j */
    private static C2231l<C2201d> m34400j(InputStream inputStream, String str, boolean z) {
        try {
            return m34399k(AbstractC5604c.m23615P(C10200t.m8565c(C10200t.m8558j(inputStream))), str);
        } finally {
            if (z) {
                C5852h.m22888c(inputStream);
            }
        }
    }

    /* renamed from: k */
    public static C2231l<C2201d> m34399k(AbstractC5604c abstractC5604c, String str) {
        return m34398l(abstractC5604c, str, true);
    }

    /* renamed from: l */
    private static C2231l<C2201d> m34398l(AbstractC5604c abstractC5604c, String str, boolean z) {
        try {
            try {
                C2201d m24405a = C5403t.m24405a(abstractC5604c);
                if (str != null) {
                    C0020g.m42109b().m42108c(str, m24405a);
                }
                C2231l<C2201d> c2231l = new C2231l<>(m24405a);
                if (z) {
                    C5852h.m22888c(abstractC5604c);
                }
                return c2231l;
            } catch (Exception e) {
                C2231l<C2201d> c2231l2 = new C2231l<>(e);
                if (z) {
                    C5852h.m22888c(abstractC5604c);
                }
                return c2231l2;
            }
        } catch (Throwable th2) {
            if (z) {
                C5852h.m22888c(abstractC5604c);
            }
            throw th2;
        }
    }

    /* renamed from: m */
    public static C2232m<C2201d> m34397m(Context context, int i) {
        return m34396n(context, i, m34387w(context, i));
    }

    /* renamed from: n */
    public static C2232m<C2201d> m34396n(Context context, int i, String str) {
        return m34408b(str, new CallableC2207e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    /* renamed from: o */
    public static C2231l<C2201d> m34395o(Context context, int i) {
        return m34394p(context, i, m34387w(context, i));
    }

    /* renamed from: p */
    public static C2231l<C2201d> m34394p(Context context, int i, String str) {
        try {
            InterfaceC10187e m8565c = C10200t.m8565c(C10200t.m8558j(context.getResources().openRawResource(i)));
            if (m34388v(m8565c).booleanValue()) {
                return m34391s(new ZipInputStream(m8565c.mo8767C0()), str);
            }
            return m34401i(m8565c.mo8767C0(), str);
        } catch (Resources.NotFoundException e) {
            return new C2231l<>(e);
        }
    }

    /* renamed from: q */
    public static C2232m<C2201d> m34393q(Context context, String str) {
        return m34392r(context, str, "url_" + str);
    }

    /* renamed from: r */
    public static C2232m<C2201d> m34392r(Context context, String str, String str2) {
        return m34408b(str2, new CallableC2205c(context, str, str2));
    }

    /* renamed from: s */
    public static C2231l<C2201d> m34391s(ZipInputStream zipInputStream, String str) {
        try {
            return m34390t(zipInputStream, str);
        } finally {
            C5852h.m22888c(zipInputStream);
        }
    }

    /* renamed from: t */
    private static C2231l<C2201d> m34390t(ZipInputStream zipInputStream, String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C2201d c2201d = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c2201d = m34398l(AbstractC5604c.m23615P(C10200t.m8565c(C10200t.m8558j(zipInputStream))), null, false).m34304b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c2201d == null) {
                return new C2231l<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C2226g m34407c = m34407c(c2201d, (String) entry.getKey());
                if (m34407c != null) {
                    m34407c.m34308f(C5852h.m22879l((Bitmap) entry.getValue(), m34407c.m34309e(), m34407c.m34311c()));
                }
            }
            for (Map.Entry<String, C2226g> entry2 : c2201d.m34422j().entrySet()) {
                if (entry2.getValue().m34313a() == null) {
                    return new C2231l<>(new IllegalStateException("There is no image for " + entry2.getValue().m34312b()));
                }
            }
            if (str != null) {
                C0020g.m42109b().m42108c(str, c2201d);
            }
            return new C2231l<>(c2201d);
        } catch (IOException e) {
            return new C2231l<>(e);
        }
    }

    /* renamed from: u */
    private static boolean m34389u(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: v */
    private static Boolean m34388v(InterfaceC10187e interfaceC10187e) {
        try {
            InterfaceC10187e mo8753n0 = interfaceC10187e.mo8753n0();
            for (byte b : f6381b) {
                if (mo8753n0.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            mo8753n0.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C5848d.m22930b("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* renamed from: w */
    private static String m34387w(Context context, int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(m34389u(context) ? "_night_" : "_day_");
        sb2.append(i);
        return sb2.toString();
    }
}
