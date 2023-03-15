package p397v4;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p297pd.C8611f;
import p297pd._Ranges;
import p362t4.C10380a;
import p377u4.FileDownloadTask;
import p460y4.C13103d;
import p489zc.AbstractC13762g0;
import p489zc.C13780s;
import p489zc.Iterables;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: v4.d */
/* loaded from: classes.dex */
public final class ModelManager {

    /* renamed from: b */
    private static final List f28537b;

    /* renamed from: c */
    private static final List f28538c;

    /* renamed from: d */
    public static final ModelManager f28539d = new ModelManager();

    /* renamed from: a */
    private static final Map f28536a = new ConcurrentHashMap();

    /* compiled from: ModelManager.kt */
    /* renamed from: v4.d$a */
    /* loaded from: classes.dex */
    public enum EnumC11117a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public final String toKey() {
            int i = C11116c.f28534a[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "app_event_pred";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "integrity_detect";
        }

        public final String toUseCase() {
            int i = C11116c.f28535b[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ModelManager.kt */
    /* renamed from: v4.d$b */
    /* loaded from: classes.dex */
    public static final class C11118b {

        /* renamed from: i */
        public static final C11119a f28540i = new C11119a(null);

        /* renamed from: a */
        private File f28541a;

        /* renamed from: b */
        private Model f28542b;

        /* renamed from: c */
        private Runnable f28543c;

        /* renamed from: d */
        private String f28544d;

        /* renamed from: e */
        private String f28545e;

        /* renamed from: f */
        private String f28546f;

        /* renamed from: g */
        private int f28547g;

        /* renamed from: h */
        private float[] f28548h;

        /* compiled from: ModelManager.kt */
        /* renamed from: v4.d$b$a */
        /* loaded from: classes.dex */
        public static final class C11119a {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ModelManager.kt */
            /* renamed from: v4.d$b$a$a */
            /* loaded from: classes.dex */
            public static final class C11120a implements FileDownloadTask.InterfaceC10836a {

                /* renamed from: a */
                final /* synthetic */ List f28549a;

                /* compiled from: ModelManager.kt */
                /* renamed from: v4.d$b$a$a$a */
                /* loaded from: classes.dex */
                static final class C11121a implements FileDownloadTask.InterfaceC10836a {

                    /* renamed from: a */
                    final /* synthetic */ C11118b f28550a;

                    /* renamed from: b */
                    final /* synthetic */ Model f28551b;

                    C11121a(C11118b c11118b, Model model) {
                        this.f28550a = c11118b;
                        this.f28551b = model;
                    }

                    /* renamed from: a */
                    public final void m6063a(File file) {
                        Intrinsics.isThisObjectNull(file, "file");
                        this.f28550a.m6072i(this.f28551b);
                        this.f28550a.m6070k(file);
                        Runnable m6080a = C11118b.m6080a(this.f28550a);
                        if (m6080a != null) {
                            m6080a.run();
                        }
                    }
                }

                C11120a(List list) {
                    this.f28549a = list;
                }

                /* renamed from: a */
                public final void m6064a(File file) {
                    Intrinsics.isThisObjectNull(file, "file");
                    Model m6099a = Model.f28521n.m6099a(file);
                    if (m6099a != null) {
                        for (C11118b c11118b : this.f28549a) {
                            C11119a.m6069a(C11118b.f28540i, c11118b.m6076e(), c11118b.m6074g() + "_" + c11118b.m6073h() + "_rule", new C11121a(c11118b, m6099a));
                        }
                    }
                }
            }

            private C11119a() {
            }

            /* renamed from: a */
            public static final /* synthetic */ void m6069a(C11119a c11119a, String str, String str2, FileDownloadTask.InterfaceC10836a interfaceC10836a) {
                c11119a.m6066d(str, str2, interfaceC10836a);
            }

            /* renamed from: c */
            private final void m6067c(String str, int i) {
                File[] listFiles;
                boolean m8948C;
                boolean m8948C2;
                File m6050a = C11126g.m6050a();
                if (m6050a == null || (listFiles = m6050a.listFiles()) == null) {
                    return;
                }
                if (listFiles.length == 0) {
                    return;
                }
                String str2 = str + "_" + i;
                for (File file : listFiles) {
                    Intrinsics.checkIfNull(file, "f");
                    String name = file.getName();
                    Intrinsics.checkIfNull(name, "name");
                    m8948C = StringsJVM.m8948C(name, str, false, 2, null);
                    if (m8948C) {
                        m8948C2 = StringsJVM.m8948C(name, str2, false, 2, null);
                        if (!m8948C2) {
                            file.delete();
                        }
                    }
                }
            }

            /* renamed from: d */
            private final void m6066d(String str, String str2, FileDownloadTask.InterfaceC10836a interfaceC10836a) {
                File file = new File(C11126g.m6050a(), str2);
                if (str != null && !file.exists()) {
                    new FileDownloadTask(str, file, interfaceC10836a).execute(new String[0]);
                } else {
                    interfaceC10836a.m6927a(file);
                }
            }

            /* renamed from: b */
            public final C11118b m6068b(JSONObject jSONObject) {
                String string;
                String string2;
                String optString;
                int i;
                float[] m6093e;
                if (jSONObject != null) {
                    try {
                        string = jSONObject.getString("use_case");
                        string2 = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i = jSONObject.getInt("version_id");
                        m6093e = ModelManager.m6093e(ModelManager.f28539d, jSONObject.getJSONArray("thresholds"));
                        Intrinsics.checkIfNull(string, "useCase");
                        Intrinsics.checkIfNull(string2, "assetUri");
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return new C11118b(string, string2, optString, i, m6093e);
            }

            /* renamed from: e */
            public final void m6065e(C11118b c11118b, List list) {
                Intrinsics.isThisObjectNull(c11118b, "master");
                Intrinsics.isThisObjectNull(list, "slaves");
                m6067c(c11118b.m6074g(), c11118b.m6073h());
                m6066d(c11118b.m6079b(), c11118b.m6074g() + "_" + c11118b.m6073h(), new C11120a(list));
            }

            public /* synthetic */ C11119a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C11118b(String str, String str2, String str3, int i, float[] fArr) {
            Intrinsics.isThisObjectNull(str, "useCase");
            Intrinsics.isThisObjectNull(str2, "assetUri");
            this.f28544d = str;
            this.f28545e = str2;
            this.f28546f = str3;
            this.f28547g = i;
            this.f28548h = fArr;
        }

        /* renamed from: a */
        public static final /* synthetic */ Runnable m6080a(C11118b c11118b) {
            return c11118b.f28543c;
        }

        /* renamed from: b */
        public final String m6079b() {
            return this.f28545e;
        }

        /* renamed from: c */
        public final Model m6078c() {
            return this.f28542b;
        }

        /* renamed from: d */
        public final File m6077d() {
            return this.f28541a;
        }

        /* renamed from: e */
        public final String m6076e() {
            return this.f28546f;
        }

        /* renamed from: f */
        public final float[] m6075f() {
            return this.f28548h;
        }

        /* renamed from: g */
        public final String m6074g() {
            return this.f28544d;
        }

        /* renamed from: h */
        public final int m6073h() {
            return this.f28547g;
        }

        /* renamed from: i */
        public final void m6072i(Model model) {
            this.f28542b = model;
        }

        /* renamed from: j */
        public final C11118b m6071j(Runnable runnable) {
            this.f28543c = runnable;
            return this;
        }

        /* renamed from: k */
        public final void m6070k(File file) {
            this.f28541a = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelManager.kt */
    /* renamed from: v4.d$c */
    /* loaded from: classes.dex */
    public static final class RunnableC11122c implements Runnable {

        /* renamed from: w */
        public static final RunnableC11122c f28552w = new RunnableC11122c();

        RunnableC11122c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x0077, Exception -> 0x007b, TryCatch #2 {Exception -> 0x007b, all -> 0x0077, blocks: (B:5:0x000b, B:7:0x001d, B:12:0x0027, B:14:0x0032, B:16:0x0040, B:18:0x0046, B:23:0x006d, B:20:0x004e, B:22:0x0056, B:13:0x002d), top: B:30:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r7 = this;
                java.lang.String r0 = "model_request_timestamp"
                java.lang.String r1 = "models"
                boolean r2 = p076e5.CrashShieldHandler.m25963d(r7)
                if (r2 == 0) goto Lb
                return
            Lb:
                android.content.Context r2 = com.facebook.C2290b.m34110e()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                r4 = 0
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                r3 = 0
                java.lang.String r3 = r2.getString(r1, r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                if (r3 == 0) goto L2d
                int r5 = r3.length()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                if (r5 != 0) goto L24
                r4 = 1
            L24:
                if (r4 == 0) goto L27
                goto L2d
            L27:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                goto L32
            L2d:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                r4.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
            L32:
                r5 = 0
                long r5 = r2.getLong(r0, r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                com.facebook.internal.c$b r3 = com.facebook.internal.FeatureManager.EnumC2317b.ModelRequest     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                boolean r3 = com.facebook.internal.FeatureManager.m34002g(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                if (r3 == 0) goto L4e
                int r3 = r4.length()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                if (r3 == 0) goto L4e
                v4.d r3 = p397v4.ModelManager.f28539d     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                boolean r3 = p397v4.ModelManager.m6094d(r3, r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                if (r3 != 0) goto L6d
            L4e:
                v4.d r3 = p397v4.ModelManager.f28539d     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                org.json.JSONObject r4 = p397v4.ModelManager.m6095c(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                if (r4 == 0) goto L76
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                r0.apply()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
            L6d:
                v4.d r0 = p397v4.ModelManager.f28539d     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                p397v4.ModelManager.m6097a(r0, r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                p397v4.ModelManager.m6096b(r0)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                goto L7b
            L76:
                return
            L77:
                r0 = move-exception
                p076e5.CrashShieldHandler.m25965b(r0, r7)
            L7b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p397v4.ModelManager.RunnableC11122c.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelManager.kt */
    /* renamed from: v4.d$d */
    /* loaded from: classes.dex */
    public static final class RunnableC11123d implements Runnable {

        /* renamed from: w */
        public static final RunnableC11123d f28553w = new RunnableC11123d();

        RunnableC11123d() {
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C13103d.m1605c();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelManager.kt */
    /* renamed from: v4.d$e */
    /* loaded from: classes.dex */
    public static final class RunnableC11124e implements Runnable {

        /* renamed from: w */
        public static final RunnableC11124e f28554w = new RunnableC11124e();

        RunnableC11124e() {
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C10380a.m8088a();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        List m194j;
        List m194j2;
        m194j = C13780s.m194j("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        f28537b = m194j;
        m194j2 = C13780s.m194j("none", "address", "health");
        f28538c = m194j2;
    }

    private ModelManager() {
    }

    /* renamed from: a */
    public static final /* synthetic */ void m6097a(ModelManager modelManager, JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return;
        }
        try {
            modelManager.m6092f(jSONObject);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m6096b(ModelManager modelManager) {
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return;
        }
        try {
            modelManager.m6090h();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ JSONObject m6095c(ModelManager modelManager) {
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.m6089i();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ boolean m6094d(ModelManager modelManager, long j) {
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return false;
        }
        try {
            return modelManager.m6086l(j);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
            return false;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ float[] m6093e(ModelManager modelManager, JSONArray jSONArray) {
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.m6085m(jSONArray);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
            return null;
        }
    }

    /* renamed from: f */
    private final void m6092f(JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    C11118b m6068b = C11118b.f28540i.m6068b(jSONObject.getJSONObject(keys.next()));
                    if (m6068b != null) {
                        f28536a.put(m6068b.m6074g(), m6068b);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: g */
    public static final void m6091g() {
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return;
        }
        try {
            Utility.m33963U(RunnableC11122c.f28552w);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
        }
    }

    /* renamed from: h */
    private final void m6090h() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i = 0;
            for (Map.Entry entry : f28536a.entrySet()) {
                String str2 = (String) entry.getKey();
                C11118b c11118b = (C11118b) entry.getValue();
                if (Intrinsics.equals(str2, EnumC11117a.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    str = c11118b.m6079b();
                    i = Math.max(i, c11118b.m6073h());
                    if (FeatureManager.m34002g(FeatureManager.EnumC2317b.SuggestedEvents) && m6087k()) {
                        arrayList.add(c11118b.m6071j(RunnableC11123d.f28553w));
                    }
                }
                if (Intrinsics.equals(str2, EnumC11117a.MTML_INTEGRITY_DETECT.toUseCase())) {
                    String m6079b = c11118b.m6079b();
                    int max = Math.max(i, c11118b.m6073h());
                    if (FeatureManager.m34002g(FeatureManager.EnumC2317b.IntelligentIntegrity)) {
                        arrayList.add(c11118b.m6071j(RunnableC11124e.f28554w));
                    }
                    str = m6079b;
                    i = max;
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            C11118b.f28540i.m6065e(new C11118b("MTML", str, null, i, null), arrayList);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: i */
    private final JSONObject m6089i() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest.C2279c c2279c = GraphRequest.f6606s;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%s/model_asset", Arrays.copyOf(new Object[]{C2290b.m34109f()}, 1));
            Intrinsics.checkIfNull(format, "java.lang.String.format(format, *args)");
            GraphRequest m34145w = c2279c.m34145w(null, format, null);
            m34145w.m34212D(true);
            m34145w.m34213C(bundle);
            JSONObject m34082c = m34145w.m34201j().m34082c();
            if (m34082c != null) {
                return m6084n(m34082c);
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: j */
    public static final File m6088j(EnumC11117a enumC11117a) {
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(enumC11117a, "task");
            C11118b c11118b = (C11118b) f28536a.get(enumC11117a.toUseCase());
            if (c11118b != null) {
                return c11118b.m6077d();
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
            return null;
        }
    }

    /* renamed from: k */
    private final boolean m6087k() {
        boolean m8922H;
        if (CrashShieldHandler.m25963d(this)) {
            return false;
        }
        try {
            Locale m33934x = Utility.m33934x();
            if (m33934x != null) {
                String language = m33934x.getLanguage();
                Intrinsics.checkIfNull(language, "locale.language");
                m8922H = C10171u.m8922H(language, "en", false, 2, null);
                if (!m8922H) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return false;
        }
    }

    /* renamed from: l */
    private final boolean m6086l(long j) {
        if (CrashShieldHandler.m25963d(this) || j == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j < ((long) 259200000);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return false;
        }
    }

    /* renamed from: m */
    private final float[] m6085m(JSONArray jSONArray) {
        if (CrashShieldHandler.m25963d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkIfNull(string, "jsonArray.getString(i)");
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: n */
    private final JSONObject m6084n(JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: o */
    public static final String[] m6083o(EnumC11117a enumC11117a, float[][] fArr, String[] strArr) {
        Model m6078c;
        if (CrashShieldHandler.m25963d(ModelManager.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(enumC11117a, "task");
            Intrinsics.isThisObjectNull(fArr, "denses");
            Intrinsics.isThisObjectNull(strArr, "texts");
            C11118b c11118b = (C11118b) f28536a.get(enumC11117a.toUseCase());
            if (c11118b == null || (m6078c = c11118b.m6078c()) == null) {
                return null;
            }
            float[] m6075f = c11118b.m6075f();
            int length = strArr.length;
            int length2 = fArr[0].length;
            MTensor mTensor = new MTensor(new int[]{length, length2});
            for (int i = 0; i < length; i++) {
                System.arraycopy(fArr[i], 0, mTensor.m6107a(), i * length2, length2);
            }
            MTensor m6100b = m6078c.m6100b(mTensor, strArr, enumC11117a.toKey());
            if (m6100b != null && m6075f != null) {
                if (!(m6100b.m6107a().length == 0)) {
                    if (!(m6075f.length == 0)) {
                        int i2 = C11125e.f28555a[enumC11117a.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                return f28539d.m6082p(m6100b, m6075f);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return f28539d.m6081q(m6100b, m6075f);
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, ModelManager.class);
            return null;
        }
    }

    /* renamed from: p */
    private final String[] m6082p(MTensor mTensor, float[] fArr) {
        C8611f m14992q;
        int m186r;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            float[] m6107a = mTensor.m6107a();
            if (m6106b2 != fArr.length) {
                return null;
            }
            m14992q = _Ranges.m14992q(0, m6106b);
            m186r = Iterables.m186r(m14992q, 10);
            ArrayList arrayList = new ArrayList(m186r);
            Iterator<Integer> it = m14992q.iterator();
            while (it.hasNext()) {
                int mo404a = ((AbstractC13762g0) it).mo404a();
                String str = "none";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (m6107a[(mo404a * m6106b2) + i2] >= fArr[i]) {
                        str = (String) f28538c.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: q */
    private final String[] m6081q(MTensor mTensor, float[] fArr) {
        C8611f m14992q;
        int m186r;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            float[] m6107a = mTensor.m6107a();
            if (m6106b2 != fArr.length) {
                return null;
            }
            m14992q = _Ranges.m14992q(0, m6106b);
            m186r = Iterables.m186r(m14992q, 10);
            ArrayList arrayList = new ArrayList(m186r);
            Iterator<Integer> it = m14992q.iterator();
            while (it.hasNext()) {
                int mo404a = ((AbstractC13762g0) it).mo404a();
                String str = "other";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (m6107a[(mo404a * m6106b2) + i2] >= fArr[i]) {
                        str = (String) f28537b.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }
}
