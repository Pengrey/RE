package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p009a8.C0076i;
import p009a8.C0086s;
import p009a8.InterfaceC0083p;
import p078e7.C5006g;
import p078e7.InterfaceC5003d;
import p485z7.C13730a;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.u2 */
/* loaded from: classes.dex */
public final class C2997u2 {

    /* renamed from: i */
    private static volatile C2997u2 f8021i;

    /* renamed from: a */
    private final String f8022a;

    /* renamed from: b */
    protected final InterfaceC5003d f8023b;

    /* renamed from: c */
    protected final ExecutorService f8024c;

    /* renamed from: d */
    private final C13730a f8025d;

    /* renamed from: e */
    private final List f8026e;

    /* renamed from: f */
    private int f8027f;

    /* renamed from: g */
    private boolean f8028g;

    /* renamed from: h */
    private volatile InterfaceC2757f1 f8029h;

    protected C2997u2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str != null && m32028m(str2, str3)) {
            this.f8022a = str;
        } else {
            this.f8022a = "FA";
        }
        this.f8023b = C5006g.m25911d();
        C3070z0.m31731a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2726d2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8024c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f8025d = new C13730a(this);
        this.f8026e = new ArrayList();
        try {
            if (C0086s.m41971b(context, "google_app_id", C0076i.m41978a(context)) != null && !m32032i()) {
                this.f8028g = true;
                Log.w(this.f8022a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m32028m(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f8022a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f8022a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        m32029l(new C2981t1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f8022a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2982t2(this));
        }
    }

    /* renamed from: i */
    protected static final boolean m32032i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m32031j(Exception exc, boolean z, boolean z2) {
        this.f8028g |= z;
        if (z) {
            Log.w(this.f8022a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m32040a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f8022a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: k */
    private final void m32030k(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m32029l(new C2790h2(this, l, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m32029l(AbstractRunnableC2822j2 abstractRunnableC2822j2) {
        this.f8024c.execute(abstractRunnableC2822j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m32028m(String str, String str2) {
        return (str2 == null || str == null || m32032i()) ? false : true;
    }

    /* renamed from: s */
    public static C2997u2 m32022s(Context context, String str, String str2, String str3, Bundle bundle) {
        C2597i.m33076j(context);
        if (f8021i == null) {
            synchronized (C2997u2.class) {
                if (f8021i == null) {
                    f8021i = new C2997u2(context, str, str2, str3, bundle);
                }
            }
        }
        return f8021i;
    }

    /* renamed from: D */
    public final void m32045D(String str) {
        m32029l(new C2996u1(this, str));
    }

    /* renamed from: E */
    public final void m32044E(String str, String str2, Bundle bundle) {
        m32029l(new C2933q1(this, str, str2, bundle));
    }

    /* renamed from: F */
    public final void m32043F(String str) {
        m32029l(new C3011v1(this, str));
    }

    /* renamed from: G */
    public final void m32042G(String str, Bundle bundle) {
        m32030k(null, str, bundle, false, true, null);
    }

    /* renamed from: H */
    public final void m32041H(String str, String str2, Bundle bundle) {
        m32030k(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m32040a(int i, String str, Object obj, Object obj2, Object obj3) {
        m32029l(new C2710c2(this, false, 5, str, obj, null, null));
    }

    /* renamed from: b */
    public final void m32039b(InterfaceC0083p interfaceC0083p) {
        C2597i.m33076j(interfaceC0083p);
        synchronized (this.f8026e) {
            for (int i = 0; i < this.f8026e.size(); i++) {
                if (interfaceC0083p.equals(((Pair) this.f8026e.get(i)).first)) {
                    Log.w(this.f8022a, "OnEventListener already registered.");
                    return;
                }
            }
            BinderC2838k2 binderC2838k2 = new BinderC2838k2(interfaceC0083p);
            this.f8026e.add(new Pair(interfaceC0083p, binderC2838k2));
            if (this.f8029h != null) {
                try {
                    this.f8029h.registerOnMeasurementEventListener(binderC2838k2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f8022a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m32029l(new C2774g2(this, binderC2838k2));
        }
    }

    /* renamed from: c */
    public final void m32038c(Bundle bundle) {
        m32029l(new C2917p1(this, bundle));
    }

    /* renamed from: d */
    public final void m32037d(Activity activity, String str, String str2) {
        m32029l(new C2965s1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void m32036e(boolean z) {
        m32029l(new C2758f2(this, z));
    }

    /* renamed from: f */
    public final void m32035f(String str, String str2, Object obj, boolean z) {
        m32029l(new C2806i2(this, str, str2, obj, z));
    }

    /* renamed from: n */
    public final int m32027n(String str) {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C2742e2(this, str, binderC2693b1));
        Integer num = (Integer) BinderC2693b1.m32893S1(binderC2693b1.m32892y(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: o */
    public final long m32026o() {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C3056y1(this, binderC2693b1));
        Long l = (Long) BinderC2693b1.m32893S1(binderC2693b1.m32892y(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f8023b.mo25914a()).nextLong();
            int i = this.f8027f + 1;
            this.f8027f = i;
            return nextLong + i;
        }
        return l.longValue();
    }

    /* renamed from: p */
    public final C13730a m32025p() {
        return this.f8025d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final InterfaceC2757f1 m32023r(Context context, boolean z) {
        try {
            return AbstractBinderC2741e1.asInterface(DynamiteModule.m32979e(context, DynamiteModule.f7572c, ModuleDescriptor.MODULE_ID).m32980d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m32031j(e, true, false);
            return null;
        }
    }

    /* renamed from: u */
    public final String m32020u() {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C3041x1(this, binderC2693b1));
        return binderC2693b1.m32894H(50L);
    }

    /* renamed from: v */
    public final String m32019v() {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C2678a2(this, binderC2693b1));
        return binderC2693b1.m32894H(500L);
    }

    /* renamed from: w */
    public final String m32018w() {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C3071z1(this, binderC2693b1));
        return binderC2693b1.m32894H(500L);
    }

    /* renamed from: x */
    public final String m32017x() {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C3026w1(this, binderC2693b1));
        return binderC2693b1.m32894H(500L);
    }

    /* renamed from: y */
    public final List m32016y(String str, String str2) {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C2949r1(this, str, str2, binderC2693b1));
        List list = (List) BinderC2693b1.m32893S1(binderC2693b1.m32892y(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: z */
    public final Map m32015z(String str, String str2, boolean z) {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        m32029l(new C2694b2(this, str, str2, z, binderC2693b1));
        Bundle m32892y = binderC2693b1.m32892y(5000L);
        if (m32892y != null && m32892y.size() != 0) {
            HashMap hashMap = new HashMap(m32892y.size());
            for (String str3 : m32892y.keySet()) {
                Object obj = m32892y.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
