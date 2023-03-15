package p482z4;

import android.net.Uri;
import com.facebook.C2290b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* renamed from: z4.l */
/* loaded from: classes.dex */
public final class C13649l {

    /* renamed from: a */
    private static final String f34699a;

    /* renamed from: b */
    private static final List f34700b;

    /* renamed from: c */
    private static final List f34701c;

    /* renamed from: d */
    private static final Map f34702d;

    /* renamed from: e */
    private static final AtomicBoolean f34703e;

    /* renamed from: f */
    public static final C13649l f34704f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.kt */
    /* renamed from: z4.l$a */
    /* loaded from: classes.dex */
    public static final class C13650a extends AbstractC13653d {
        /* renamed from: b */
        public String m688b() {
            return "com.facebook.arstudio.player";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.kt */
    /* renamed from: z4.l$b */
    /* loaded from: classes.dex */
    public static final class C13651b extends AbstractC13653d {
        /* renamed from: b */
        public String m687b() {
            return "com.facebook.katana";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.kt */
    /* renamed from: z4.l$c */
    /* loaded from: classes.dex */
    public static final class C13652c extends AbstractC13653d {
        /* renamed from: b */
        public String m686b() {
            return "com.facebook.orca";
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* renamed from: z4.l$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC13653d {

        /* renamed from: a */
        private TreeSet f34705a;

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
            if (r1.isEmpty() == false) goto L4;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void m685a(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto Lf
                java.util.TreeSet r1 = r0.f34705a     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto Lf
                if (r1 == 0) goto Lf
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto L17
            Lf:
                z4.l r1 = p482z4.C13649l.f34704f     // Catch: java.lang.Throwable -> L19
                java.util.TreeSet r1 = p482z4.C13649l.m697a(r1, r0)     // Catch: java.lang.Throwable -> L19
                r0.f34705a = r1     // Catch: java.lang.Throwable -> L19
            L17:
                monitor-exit(r0)
                return
            L19:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p482z4.C13649l.AbstractC13653d.m685a(boolean):void");
        }

        /* renamed from: b */
        public abstract String m684b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.kt */
    /* renamed from: z4.l$e */
    /* loaded from: classes.dex */
    public static final class C13654e extends AbstractC13653d {
        /* renamed from: b */
        public String m683b() {
            return "com.facebook.wakizashi";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeProtocol.kt */
    /* renamed from: z4.l$f */
    /* loaded from: classes.dex */
    public static final class RunnableC13655f implements Runnable {

        /* renamed from: w */
        public static final RunnableC13655f f34706w = new RunnableC13655f();

        RunnableC13655f() {
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                for (AbstractC13653d abstractC13653d : C13649l.m696b(C13649l.f34704f)) {
                    abstractC13653d.m685a(true);
                }
                C13649l.m695c(C13649l.f34704f).set(false);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        C13649l c13649l = new C13649l();
        f34704f = c13649l;
        String name = C13649l.class.getName();
        Intrinsics.checkIfNull(name, "NativeProtocol::class.java.name");
        f34699a = name;
        f34700b = c13649l.m692f();
        f34701c = c13649l.m693e();
        f34702d = c13649l.m694d();
        f34703e = new AtomicBoolean(false);
    }

    private C13649l() {
    }

    /* renamed from: a */
    public static final /* synthetic */ TreeSet m697a(C13649l c13649l, AbstractC13653d abstractC13653d) {
        if (CrashShieldHandler.m25963d(C13649l.class)) {
            return null;
        }
        try {
            return c13649l.m690h(abstractC13653d);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13649l.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ List m696b(C13649l c13649l) {
        if (CrashShieldHandler.m25963d(C13649l.class)) {
            return null;
        }
        try {
            return f34700b;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13649l.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicBoolean m695c(C13649l c13649l) {
        if (CrashShieldHandler.m25963d(C13649l.class)) {
            return null;
        }
        try {
            return f34703e;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13649l.class);
            return null;
        }
    }

    /* renamed from: d */
    private final Map m694d() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C13652c());
            List list = f34700b;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f34701c);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    private final List m693e() {
        ArrayList m201c;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            m201c = C13780s.m201c(new C13650a());
            m201c.addAll(m692f());
            return m201c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: f */
    private final List m692f() {
        ArrayList m201c;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            m201c = C13780s.m201c(new C13651b(), new C13654e());
            return m201c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: g */
    private final Uri m691g(AbstractC13653d abstractC13653d) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + abstractC13653d.m684b() + ".provider.PlatformProvider/versions");
            Intrinsics.checkIfNull(parse, "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[Catch: all -> 0x009d, TRY_ENTER, TryCatch #6 {all -> 0x009d, blocks: (B:5:0x000c, B:35:0x0099, B:36:0x009c, B:30:0x0091), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073 A[EXC_TOP_SPLITTER, LOOP:0: B:43:0x0073->B:24:0x0079, LOOP_START, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.TreeSet m690h(p482z4.C13649l.AbstractC13653d r14) {
        /*
            r13 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = p076e5.CrashShieldHandler.m25963d(r13)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L9d
            r2.<init>()     // Catch: java.lang.Throwable -> L9d
            android.content.Context r4 = com.facebook.C2290b.m34110e()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r5 = "appContext"
            p181jd.Intrinsics.checkIfNull(r4, r5)     // Catch: java.lang.Throwable -> L9d
            android.content.ContentResolver r6 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L9d
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L9d
            android.net.Uri r7 = r13.m691g(r14)     // Catch: java.lang.Throwable -> L9d
            android.content.Context r4 = com.facebook.C2290b.m34110e()     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = "FacebookSdk.getApplicationContext()"
            p181jd.Intrinsics.checkIfNull(r4, r5)     // Catch: java.lang.Throwable -> L95
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r5.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r14 = r14.m684b()     // Catch: java.lang.Throwable -> L95
            r5.append(r14)     // Catch: java.lang.Throwable -> L95
            java.lang.String r14 = ".provider.PlatformProvider"
            r5.append(r14)     // Catch: java.lang.Throwable -> L95
            java.lang.String r14 = r5.toString()     // Catch: java.lang.Throwable -> L95
            r5 = 0
            android.content.pm.ProviderInfo r14 = r4.resolveContentProvider(r14, r5)     // Catch: java.lang.RuntimeException -> L4e java.lang.Throwable -> L95
            goto L55
        L4e:
            r14 = move-exception
            java.lang.String r4 = p482z4.C13649l.f34699a     // Catch: java.lang.Throwable -> L95
            android.util.Log.e(r4, r1, r14)     // Catch: java.lang.Throwable -> L95
            r14 = r3
        L55:
            if (r14 == 0) goto L8e
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.IllegalArgumentException -> L5f java.lang.SecurityException -> L65 java.lang.NullPointerException -> L6b java.lang.Throwable -> L95
            goto L71
        L5f:
            java.lang.String r14 = p482z4.C13649l.f34699a     // Catch: java.lang.Throwable -> L95
            android.util.Log.e(r14, r1)     // Catch: java.lang.Throwable -> L95
            goto L70
        L65:
            java.lang.String r14 = p482z4.C13649l.f34699a     // Catch: java.lang.Throwable -> L95
            android.util.Log.e(r14, r1)     // Catch: java.lang.Throwable -> L95
            goto L70
        L6b:
            java.lang.String r14 = p482z4.C13649l.f34699a     // Catch: java.lang.Throwable -> L95
            android.util.Log.e(r14, r1)     // Catch: java.lang.Throwable -> L95
        L70:
            r14 = r3
        L71:
            if (r14 == 0) goto L8f
        L73:
            boolean r1 = r14.moveToNext()     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L8f
            int r1 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L89
            int r1 = r14.getInt(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L89
            r2.add(r1)     // Catch: java.lang.Throwable -> L89
            goto L73
        L89:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto L97
        L8e:
            r14 = r3
        L8f:
            if (r14 == 0) goto L94
            r14.close()     // Catch: java.lang.Throwable -> L9d
        L94:
            return r2
        L95:
            r14 = move-exception
            r0 = r3
        L97:
            if (r0 == 0) goto L9c
            r0.close()     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r14     // Catch: java.lang.Throwable -> L9d
        L9d:
            r14 = move-exception
            p076e5.CrashShieldHandler.m25965b(r14, r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p482z4.C13649l.m690h(z4.l$d):java.util.TreeSet");
    }

    /* renamed from: i */
    public static final void m689i() {
        if (CrashShieldHandler.m25963d(C13649l.class)) {
            return;
        }
        try {
            if (f34703e.compareAndSet(false, true)) {
                C2290b.m34103l().execute(RunnableC13655f.f34706w);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13649l.class);
        }
    }
}
