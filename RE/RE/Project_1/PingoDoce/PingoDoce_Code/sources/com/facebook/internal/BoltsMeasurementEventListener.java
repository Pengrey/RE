package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p248n4.InternalAppEventsLogger;
import p435x2.C12256a;
import sd.C10156i;

/* renamed from: com.facebook.internal.b */
/* loaded from: classes.dex */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: b */
    private static BoltsMeasurementEventListener f6711b;

    /* renamed from: a */
    private final Context f6714a;

    /* renamed from: d */
    public static final C2315a f6713d = new C2315a(null);

    /* renamed from: c */
    private static final String f6712c = "com.parse.bolts.measurement_event";

    /* compiled from: BoltsMeasurementEventListener.kt */
    /* renamed from: com.facebook.internal.b$a */
    /* loaded from: classes.dex */
    public static final class C2315a {
        private C2315a() {
        }

        /* renamed from: a */
        public final BoltsMeasurementEventListener m34009a(Context context) {
            Intrinsics.isThisObjectNull(context, "context");
            if (BoltsMeasurementEventListener.m34015a() != null) {
                return BoltsMeasurementEventListener.m34015a();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.m34014b(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.m34013c(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.m34015a();
        }

        public /* synthetic */ C2315a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkIfNull(applicationContext, "context.applicationContext");
        this.f6714a = applicationContext;
    }

    /* renamed from: a */
    public static final /* synthetic */ BoltsMeasurementEventListener m34015a() {
        if (CrashShieldHandler.m25963d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f6711b;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m34014b(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (CrashShieldHandler.m25963d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.m34010f();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, BoltsMeasurementEventListener.class);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m34013c(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (CrashShieldHandler.m25963d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            f6711b = boltsMeasurementEventListener;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, BoltsMeasurementEventListener.class);
        }
    }

    /* renamed from: d */
    private final void m34012d() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            C12256a m3182b = C12256a.m3182b(this.f6714a);
            Intrinsics.checkIfNull(m3182b, "LocalBroadcastManager.ge…tance(applicationContext)");
            m3182b.m3179e(this);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: e */
    public static final BoltsMeasurementEventListener m34011e(Context context) {
        if (CrashShieldHandler.m25963d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f6713d.m34009a(context);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    /* renamed from: f */
    private final void m34010f() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            C12256a m3182b = C12256a.m3182b(this.f6714a);
            Intrinsics.checkIfNull(m3182b, "LocalBroadcastManager.ge…tance(applicationContext)");
            m3182b.m3181c(this, new IntentFilter(f6712c));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    public final void finalize() throws Throwable {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m34012d();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bf_");
            sb2.append(intent != null ? intent.getStringExtra("event_name") : null);
            String sb3 = sb2.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> keySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (keySet != null) {
                for (String str : keySet) {
                    Intrinsics.checkIfNull(str, "key");
                    bundle.putString(new C10156i("[ -]*$").m9020e(new C10156i("^[ -]*").m9020e(new C10156i("[^0-9a-zA-Z _-]").m9020e(str, "-"), BuildConfig.VERSION_NAME), BuildConfig.VERSION_NAME), (String) bundleExtra.get(str));
                }
            }
            internalAppEventsLogger.m17760e(sb3, bundle);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
