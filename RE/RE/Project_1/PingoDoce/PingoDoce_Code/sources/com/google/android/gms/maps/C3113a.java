package com.google.android.gms.maps;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: com.google.android.gms.maps.a */
/* loaded from: classes.dex */
public final class C3113a {

    /* renamed from: a */
    private static final String f8233a = "a";
    @GuardedBy("MapsInitializer.class")

    /* renamed from: b */
    private static boolean f8234b = false;
    @GuardedBy("MapsInitializer.class")

    /* renamed from: c */
    private static EnumC3114a f8235c = EnumC3114a.LEGACY;

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: com.google.android.gms.maps.a$a */
    /* loaded from: classes.dex */
    public enum EnumC3114a {
        LEGACY,
        LATEST
    }

    private C3113a() {
    }

    /* renamed from: a */
    public static synchronized int m31568a(Context context) {
        int m31567b;
        synchronized (C3113a.class) {
            m31567b = m31567b(context, null, null);
        }
        return m31567b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|16|17|(10:19|(1:(1:22))|23|24|(1:26)|27|28|(1:30)|31|32)|36|23|24|(0)|27|28|(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        android.util.Log.e(com.google.android.gms.maps.C3113a.f8233a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: RemoteException -> 0x005b, all -> 0x0089, TryCatch #3 {RemoteException -> 0x005b, blocks: (B:21:0x0049, B:23:0x004f, B:24:0x0053), top: B:48:0x0049, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x001e, B:10:0x0025, B:11:0x0029, B:13:0x0038, B:15:0x003d, B:21:0x0049, B:23:0x004f, B:24:0x0053, B:28:0x0063, B:30:0x0076, B:27:0x005c, B:34:0x007e, B:35:0x0083, B:37:0x0085), top: B:47:0x0003, inners: #0, #1, #3 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int m31567b(android.content.Context r5, com.google.android.gms.maps.C3113a.EnumC3114a r6, com.google.android.gms.maps.InterfaceC3115b r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.a> r0 = com.google.android.gms.maps.C3113a.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.C2597i.m33075k(r5, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = com.google.android.gms.maps.C3113a.f8233a     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L89
            boolean r1 = com.google.android.gms.maps.C3113a.f8234b     // Catch: java.lang.Throwable -> L89
            r2 = 0
            if (r1 == 0) goto L25
            if (r7 == 0) goto L23
            com.google.android.gms.maps.a$a r5 = com.google.android.gms.maps.C3113a.f8235c     // Catch: java.lang.Throwable -> L89
            r7.m31566a(r5)     // Catch: java.lang.Throwable -> L89
        L23:
            monitor-exit(r0)
            return r2
        L25:
            x7.y r1 = p440x7.C12320w.m3088a(r5, r6)     // Catch: com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L84 java.lang.Throwable -> L89
            x7.a r3 = r1.mo3081d()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            p418w7.C11580b.m4678d(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            s7.f r3 = r1.mo3079l()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            p463y7.C13129b.m1562c(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            r3 = 1
            com.google.android.gms.maps.C3113a.f8234b = r3     // Catch: java.lang.Throwable -> L89
            r4 = 2
            if (r6 == 0) goto L48
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L49
            if (r6 == r3) goto L46
            goto L48
        L46:
            r3 = r4
            goto L49
        L48:
            r3 = r2
        L49:
            int r6 = r1.mo3082b()     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            if (r6 != r4) goto L53
            com.google.android.gms.maps.a$a r6 = com.google.android.gms.maps.C3113a.EnumC3114a.LATEST     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            com.google.android.gms.maps.C3113a.f8235c = r6     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
        L53:
            h7.b r5 = p133h7.BinderC5870d.m22835S1(r5)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            r1.mo3084A1(r5, r3)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            goto L63
        L5b:
            r5 = move-exception
            java.lang.String r6 = com.google.android.gms.maps.C3113a.f8233a     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L89
        L63:
            java.lang.String r5 = com.google.android.gms.maps.C3113a.f8233a     // Catch: java.lang.Throwable -> L89
            com.google.android.gms.maps.a$a r6 = com.google.android.gms.maps.C3113a.f8235c     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L7b
            com.google.android.gms.maps.a$a r5 = com.google.android.gms.maps.C3113a.f8235c     // Catch: java.lang.Throwable -> L89
            r7.m31566a(r5)     // Catch: java.lang.Throwable -> L89
        L7b:
            monitor-exit(r0)
            return r2
        L7d:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L89
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L89
            throw r6     // Catch: java.lang.Throwable -> L89
        L84:
            r5 = move-exception
            int r5 = r5.f7147w     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)
            return r5
        L89:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.C3113a.m31567b(android.content.Context, com.google.android.gms.maps.a$a, com.google.android.gms.maps.b):int");
    }
}
