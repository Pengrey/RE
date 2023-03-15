package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C2290b;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: com.facebook.internal.a */
/* loaded from: classes.dex */
public final class AttributionIdentifiers {

    /* renamed from: g */
    public static AttributionIdentifiers f6700g;

    /* renamed from: a */
    private String f6701a;

    /* renamed from: b */
    private long f6702b;

    /* renamed from: c */
    private String f6703c;

    /* renamed from: d */
    private String f6704d;

    /* renamed from: e */
    private boolean f6705e;

    /* renamed from: h */
    public static final C2311a f6706h = new C2311a(null);

    /* renamed from: f */
    private static final String f6707f = AttributionIdentifiers.class.getCanonicalName();

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.a$a */
    /* loaded from: classes.dex */
    public static final class C2311a {
        private C2311a() {
        }

        /* renamed from: a */
        private final AttributionIdentifiers m34026a(AttributionIdentifiers attributionIdentifiers) {
            AttributionIdentifiers.m34034f(attributionIdentifiers, System.currentTimeMillis());
            AttributionIdentifiers.f6700g = attributionIdentifiers;
            return attributionIdentifiers;
        }

        /* renamed from: b */
        private final AttributionIdentifiers m34025b(Context context) {
            AttributionIdentifiers m34024c = m34024c(context);
            if (m34024c == null) {
                AttributionIdentifiers m34023d = m34023d(context);
                return m34023d == null ? new AttributionIdentifiers() : m34023d;
            }
            return m34024c;
        }

        /* renamed from: c */
        private final AttributionIdentifiers m34024c(Context context) {
            Object m33981C;
            try {
                if (m34020g(context)) {
                    Method m33935w = Utility.m33935w("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                    if (m33935w != null && (m33981C = Utility.m33981C(null, m33935w, context)) != null) {
                        Method m33936v = Utility.m33936v(m33981C.getClass(), "getId", new Class[0]);
                        Method m33936v2 = Utility.m33936v(m33981C.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                        if (m33936v != null && m33936v2 != null) {
                            AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                            AttributionIdentifiers.m34037c(attributionIdentifiers, (String) Utility.m33981C(m33981C, m33936v, new Object[0]));
                            Boolean bool = (Boolean) Utility.m33981C(m33981C, m33936v2, new Object[0]);
                            AttributionIdentifiers.m34033g(attributionIdentifiers, bool != null ? bool.booleanValue() : false);
                            return attributionIdentifiers;
                        }
                    }
                    return null;
                }
                return null;
            } catch (Exception e) {
                Utility.m33974J("android_id", e);
                return null;
            }
        }

        /* renamed from: d */
        private final AttributionIdentifiers m34023d(Context context) {
            ServiceConnectionC2314c serviceConnectionC2314c = new ServiceConnectionC2314c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, serviceConnectionC2314c, 1)) {
                    try {
                        C2312b c2312b = new C2312b(serviceConnectionC2314c.m34016a());
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        AttributionIdentifiers.m34037c(attributionIdentifiers, c2312b.m34018s());
                        AttributionIdentifiers.m34033g(attributionIdentifiers, c2312b.m34017y());
                        return attributionIdentifiers;
                    } catch (Exception e) {
                        Utility.m33974J("android_id", e);
                    } finally {
                        context.unbindService(serviceConnectionC2314c);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* renamed from: f */
        private final String m34021f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        /* renamed from: g */
        private final boolean m34020g(Context context) {
            Method m33935w = Utility.m33935w("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (m33935w != null) {
                Object m33981C = Utility.m33981C(null, m33935w, context);
                return (m33981C instanceof Integer) && !(Intrinsics.equals(m33981C, 0) ^ true);
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: all -> 0x00f0, Exception -> 0x00f2, TryCatch #5 {Exception -> 0x00f2, all -> 0x00f0, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005b, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0065, B:19:0x0072, B:48:0x00e8, B:49:0x00ef), top: B:65:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x00f0, Exception -> 0x00f2, TryCatch #5 {Exception -> 0x00f2, all -> 0x00f0, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005b, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0065, B:19:0x0072, B:48:0x00e8, B:49:0x00ef), top: B:65:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: all -> 0x00f0, Exception -> 0x00f2, TRY_LEAVE, TryCatch #5 {Exception -> 0x00f2, all -> 0x00f0, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005b, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0065, B:19:0x0072, B:48:0x00e8, B:49:0x00ef), top: B:65:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.internal.AttributionIdentifiers m34022e(android.content.Context r13) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.AttributionIdentifiers.C2311a.m34022e(android.content.Context):com.facebook.internal.a");
        }

        /* renamed from: h */
        public final boolean m34019h(Context context) {
            Intrinsics.isThisObjectNull(context, "context");
            AttributionIdentifiers m34022e = m34022e(context);
            return m34022e != null && m34022e.m34028l();
        }

        public /* synthetic */ C2311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.a$b */
    /* loaded from: classes.dex */
    public static final class C2312b implements IInterface {

        /* renamed from: a */
        private final IBinder f6708a;

        /* compiled from: AttributionIdentifiers.kt */
        /* renamed from: com.facebook.internal.a$b$a */
        /* loaded from: classes.dex */
        public static final class C2313a {
            private C2313a() {
            }

            public /* synthetic */ C2313a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C2313a(null);
        }

        public C2312b(IBinder iBinder) {
            Intrinsics.isThisObjectNull(iBinder, "binder");
            this.f6708a = iBinder;
        }

        public IBinder asBinder() {
            return this.f6708a;
        }

        /* renamed from: s */
        public final String m34018s() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkIfNull(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkIfNull(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f6708a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: y */
        public final boolean m34017y() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkIfNull(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkIfNull(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f6708a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.a$c */
    /* loaded from: classes.dex */
    public static final class ServiceConnectionC2314c implements ServiceConnection {

        /* renamed from: a */
        private final AtomicBoolean f6709a = new AtomicBoolean(false);

        /* renamed from: b */
        private final BlockingQueue f6710b = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder m34016a() throws InterruptedException {
            if (!this.f6709a.compareAndSet(true, true)) {
                Object take = this.f6710b.take();
                Intrinsics.checkIfNull(take, "queue.take()");
                return (IBinder) take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f6710b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ long m34039a(AttributionIdentifiers attributionIdentifiers) {
        return attributionIdentifiers.f6702b;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m34038b() {
        return f6707f;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m34037c(AttributionIdentifiers attributionIdentifiers, String str) {
        attributionIdentifiers.f6701a = str;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m34036d(AttributionIdentifiers attributionIdentifiers, String str) {
        attributionIdentifiers.f6704d = str;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m34035e(AttributionIdentifiers attributionIdentifiers, String str) {
        attributionIdentifiers.f6703c = str;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m34034f(AttributionIdentifiers attributionIdentifiers, long j) {
        attributionIdentifiers.f6702b = j;
    }

    /* renamed from: g */
    public static final /* synthetic */ void m34033g(AttributionIdentifiers attributionIdentifiers, boolean z) {
        attributionIdentifiers.f6705e = z;
    }

    /* renamed from: k */
    public static final AttributionIdentifiers m34029k(Context context) {
        return f6706h.m34022e(context);
    }

    /* renamed from: m */
    public static final boolean m34027m(Context context) {
        return f6706h.m34019h(context);
    }

    /* renamed from: h */
    public final String m34032h() {
        if (C2290b.m34095t() && C2290b.m34111d()) {
            return this.f6701a;
        }
        return null;
    }

    /* renamed from: i */
    public final String m34031i() {
        return this.f6704d;
    }

    /* renamed from: j */
    public final String m34030j() {
        return this.f6703c;
    }

    /* renamed from: l */
    public final boolean m34028l() {
        return this.f6705e;
    }
}
