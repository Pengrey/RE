package p248n4;

import android.content.Context;
import android.util.Log;
import com.facebook.C2290b;
import com.facebook.internal.Utility;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p248n4.AccessTokenAppIdPair;
import p248n4.AppEvent;
import p377u4.AppEventUtility;

/* renamed from: n4.f */
/* loaded from: classes.dex */
public final class AppEventStore {

    /* renamed from: a */
    private static final String f20232a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppEventStore.kt */
    /* renamed from: n4.f$a */
    /* loaded from: classes.dex */
    public static final class C7656a extends ObjectInputStream {

        /* compiled from: AppEventStore.kt */
        /* renamed from: n4.f$a$a */
        /* loaded from: classes.dex */
        public static final class C7657a {
            private C7657a() {
            }

            public /* synthetic */ C7657a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C7657a(null);
        }

        public C7656a(InputStream inputStream) {
            super(inputStream);
        }

        protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            Intrinsics.checkIfNull(readClassDescriptor, "resultClassDescriptor");
            if (Intrinsics.equals(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                readClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.C7643b.class);
            } else if (Intrinsics.equals(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                readClassDescriptor = ObjectStreamClass.lookup(AppEvent.C7648b.class);
            }
            Intrinsics.checkIfNull(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    static {
        new AppEventStore();
        String name = AppEventStore.class.getName();
        Intrinsics.checkIfNull(name, "AppEventStore::class.java.name");
        f20232a = name;
    }

    private AppEventStore() {
    }

    /* renamed from: a */
    public static final synchronized void m17823a(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        synchronized (AppEventStore.class) {
            if (CrashShieldHandler.m25963d(AppEventStore.class)) {
                return;
            }
            Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.isThisObjectNull(sessionEventsState, "appEvents");
            AppEventUtility.m6946b();
            PersistedEvents m17821c = m17821c();
            m17821c.m17751a(accessTokenAppIdPair, sessionEventsState.m17745d());
            m17820d(m17821c);
        }
    }

    /* renamed from: b */
    public static final synchronized void m17822b(AppEventCollection appEventCollection) {
        synchronized (AppEventStore.class) {
            if (CrashShieldHandler.m25963d(AppEventStore.class)) {
                return;
            }
            Intrinsics.isThisObjectNull(appEventCollection, "eventsToPersist");
            AppEventUtility.m6946b();
            PersistedEvents m17821c = m17821c();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection.m17840f()) {
                SessionEventsState m17843c = appEventCollection.m17843c(accessTokenAppIdPair);
                if (m17843c != null) {
                    m17821c.m17751a(accessTokenAppIdPair, m17843c.m17745d());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            m17820d(m17821c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #10 {, blocks: (B:4:0x0003, B:9:0x000c, B:14:0x0030, B:15:0x0033, B:50:0x00a0, B:18:0x003e, B:29:0x005c, B:30:0x005f, B:33:0x006a, B:34:0x006e, B:36:0x0073, B:37:0x0076, B:41:0x0088, B:40:0x0081, B:43:0x008a, B:44:0x008d, B:47:0x0098), top: B:70:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.Context] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized p248n4.PersistedEvents m17821c() {
        /*
            java.lang.Class<n4.f> r0 = p248n4.AppEventStore.class
            monitor-enter(r0)
            boolean r1 = p076e5.CrashShieldHandler.m25963d(r0)     // Catch: java.lang.Throwable -> Lad
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return r2
        Lc:
            p377u4.AppEventUtility.m6946b()     // Catch: java.lang.Throwable -> La7
            android.content.Context r1 = com.facebook.C2290b.m34110e()     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53 java.io.FileNotFoundException -> L89
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            p181jd.Intrinsics.checkIfNull(r3, r4)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53 java.io.FileNotFoundException -> L89
            n4.f$a r4 = new n4.f$a     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53 java.io.FileNotFoundException -> L89
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53 java.io.FileNotFoundException -> L89
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53 java.io.FileNotFoundException -> L89
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53 java.io.FileNotFoundException -> L89
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L72 java.io.FileNotFoundException -> L8a
            if (r3 == 0) goto L46
            n4.n r3 = (p248n4.PersistedEvents) r3     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L72 java.io.FileNotFoundException -> L8a
            com.facebook.internal.Utility.m33953e(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> La7
            r1.delete()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> La7
            goto L9e
        L3d:
            r1 = move-exception
            java.lang.String r4 = p248n4.AppEventStore.f20232a     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch: java.lang.Throwable -> La7
            goto L9e
        L46:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L72 java.io.FileNotFoundException -> L8a
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L72 java.io.FileNotFoundException -> L8a
            throw r3     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L72 java.io.FileNotFoundException -> L8a
        L4e:
            r3 = move-exception
            goto L55
        L50:
            r3 = move-exception
            r4 = r2
            goto L73
        L53:
            r3 = move-exception
            r4 = r2
        L55:
            java.lang.String r5 = p248n4.AppEventStore.f20232a     // Catch: java.lang.Throwable -> L72
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L72
            com.facebook.internal.Utility.m33953e(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> La7
            r1.delete()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> La7
            goto L9d
        L69:
            r1 = move-exception
            java.lang.String r3 = p248n4.AppEventStore.f20232a     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L6e:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> La7
            goto L9d
        L72:
            r3 = move-exception
        L73:
            com.facebook.internal.Utility.m33953e(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            r1.delete()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> La7
            goto L88
        L80:
            r1 = move-exception
            java.lang.String r4 = p248n4.AppEventStore.f20232a     // Catch: java.lang.Throwable -> La7
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch: java.lang.Throwable -> La7
        L88:
            throw r3     // Catch: java.lang.Throwable -> La7
        L89:
            r4 = r2
        L8a:
            com.facebook.internal.Utility.m33953e(r4)     // Catch: java.lang.Throwable -> La7
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L97 java.lang.Throwable -> La7
            r1.delete()     // Catch: java.lang.Exception -> L97 java.lang.Throwable -> La7
            goto L9d
        L97:
            r1 = move-exception
            java.lang.String r3 = p248n4.AppEventStore.f20232a     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L6e
        L9d:
            r3 = r2
        L9e:
            if (r3 != 0) goto La5
            n4.n r3 = new n4.n     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
        La5:
            monitor-exit(r0)
            return r3
        La7:
            r1 = move-exception
            p076e5.CrashShieldHandler.m25965b(r1, r0)     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)
            return r2
        Lad:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p248n4.AppEventStore.m17821c():n4.n");
    }

    /* renamed from: d */
    public static final void m17820d(PersistedEvents persistedEvents) {
        ObjectOutputStream objectOutputStream;
        if (CrashShieldHandler.m25963d(AppEventStore.class)) {
            return;
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            Context m34110e = C2290b.m34110e();
            try {
                objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(m34110e.openFileOutput("AppEventsLogger.persistedevents", 0)));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectOutputStream.writeObject(persistedEvents);
                Utility.m33953e(objectOutputStream);
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                Log.w(f20232a, "Got unexpected exception while persisting events: ", th);
                try {
                    m34110e.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
                Utility.m33953e(objectOutputStream2);
            }
        } catch (Throwable th4) {
            CrashShieldHandler.m25965b(th4, AppEventStore.class);
        }
    }
}
