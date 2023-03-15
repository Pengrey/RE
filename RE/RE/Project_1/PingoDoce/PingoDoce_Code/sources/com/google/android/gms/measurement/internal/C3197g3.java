package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.g3 */
/* loaded from: classes.dex */
public final class C3197g3 extends AbstractC3188f5 {

    /* renamed from: c */
    private char f8447c;

    /* renamed from: d */
    private long f8448d;

    /* renamed from: e */
    private String f8449e;

    /* renamed from: f */
    private final C3175e3 f8450f;

    /* renamed from: g */
    private final C3175e3 f8451g;

    /* renamed from: h */
    private final C3175e3 f8452h;

    /* renamed from: i */
    private final C3175e3 f8453i;

    /* renamed from: j */
    private final C3175e3 f8454j;

    /* renamed from: k */
    private final C3175e3 f8455k;

    /* renamed from: l */
    private final C3175e3 f8456l;

    /* renamed from: m */
    private final C3175e3 f8457m;

    /* renamed from: n */
    private final C3175e3 f8458n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3197g3(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8447c = (char) 0;
        this.f8448d = -1L;
        this.f8450f = new C3175e3(this, 6, false, false);
        this.f8451g = new C3175e3(this, 6, true, false);
        this.f8452h = new C3175e3(this, 6, false, true);
        this.f8453i = new C3175e3(this, 5, false, false);
        this.f8454j = new C3175e3(this, 5, true, false);
        this.f8455k = new C3175e3(this, 5, false, true);
        this.f8456l = new C3175e3(this, 4, false, false);
        this.f8457m = new C3175e3(this, 3, false, false);
        this.f8458n = new C3175e3(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static String m31342A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.VERSION_NAME;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        String m31341B = m31341B(z, obj);
        String m31341B2 = m31341B(z, obj2);
        String m31341B3 = m31341B(z, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m31341B)) {
            sb2.append(str2);
            sb2.append(m31341B);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m31341B2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(m31341B2);
        }
        if (!TextUtils.isEmpty(m31341B3)) {
            sb2.append(str3);
            sb2.append(m31341B3);
        }
        return sb2.toString();
    }

    /* renamed from: B */
    static String m31341B(boolean z, Object obj) {
        String str;
        String className;
        String str2 = BuildConfig.VERSION_NAME;
        if (obj == null) {
            return BuildConfig.VERSION_NAME;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder(str2.length() + 43 + str2.length());
            sb2.append(str2);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str2);
            sb2.append(round2);
            return sb2.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                StringBuilder sb3 = new StringBuilder(z ? th2.getClass().getName() : th2.toString());
                String m31336G = m31336G(C3242k4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m31336G(className).equals(m31336G)) {
                        sb3.append(": ");
                        sb3.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb3.toString();
            } else if (!(obj instanceof C3186f3)) {
                return z ? "-" : obj.toString();
            } else {
                str = ((C3186f3) obj).f8433a;
                return str;
            }
        }
    }

    /* renamed from: G */
    private static String m31336G(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public static Object m31324z(String str) {
        if (str == null) {
            return null;
        }
        return new C3186f3(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: C */
    public final String m31340C() {
        String str;
        synchronized (this) {
            if (this.f8449e == null) {
                if (this.f8410a.m31121Q() != null) {
                    this.f8449e = this.f8410a.m31121Q();
                } else {
                    this.f8449e = this.f8410a.m31094z().m31351w();
                }
            }
            C2597i.m33076j(this.f8449e);
            str = this.f8449e;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public final void m31337F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m31340C(), i)) {
            Log.println(i, m31340C(), m31342A(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        C2597i.m33076j(str);
        C3220i4 m31131G = this.f8410a.m31131G();
        if (m31131G == null) {
            Log.println(6, m31340C(), "Scheduler not set. Not logging error/warn");
        } else if (!m31131G.m31343n()) {
            Log.println(6, m31340C(), "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i >= 9) {
                i = 8;
            }
            m31131G.m31239z(new RunnableC3164d3(this, i, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3188f5
    /* renamed from: j */
    protected final boolean mo31007j() {
        return false;
    }

    /* renamed from: q */
    public final C3175e3 m31333q() {
        return this.f8457m;
    }

    /* renamed from: r */
    public final C3175e3 m31332r() {
        return this.f8450f;
    }

    /* renamed from: s */
    public final C3175e3 m31331s() {
        return this.f8452h;
    }

    /* renamed from: t */
    public final C3175e3 m31330t() {
        return this.f8451g;
    }

    /* renamed from: u */
    public final C3175e3 m31329u() {
        return this.f8456l;
    }

    /* renamed from: v */
    public final C3175e3 m31328v() {
        return this.f8458n;
    }

    /* renamed from: w */
    public final C3175e3 m31327w() {
        return this.f8453i;
    }

    /* renamed from: x */
    public final C3175e3 m31326x() {
        return this.f8455k;
    }

    /* renamed from: y */
    public final C3175e3 m31325y() {
        return this.f8454j;
    }
}
