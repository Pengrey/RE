package p083ed;

import p064dd.PlatformImplementations;
import p181jd.Intrinsics;

/* renamed from: ed.a */
/* loaded from: classes2.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: ed.a$a */
    /* loaded from: classes2.dex */
    public static final class C5031a {

        /* renamed from: a */
        public static final Integer f13959a;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        static {
            /*
                ed.a$a r0 = new ed.a$a
                r0.<init>()
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1d
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1d
                if (r2 == 0) goto L1d
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1d
                goto L1e
            L1d:
                r1 = r0
            L1e:
                if (r1 == 0) goto L2c
                int r2 = r1.intValue()
                if (r2 <= 0) goto L28
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2c
                r0 = r1
            L2c:
                p083ed.JDK7PlatformImplementations.C5031a.f13959a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p083ed.JDK7PlatformImplementations.C5031a.<clinit>():void");
        }

        private C5031a() {
        }
    }

    /* renamed from: c */
    private final boolean m25867c(int i) {
        Integer num = C5031a.f13959a;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: a */
    public void m25868a(Throwable th2, Throwable th3) {
        Intrinsics.isThisObjectNull(th2, "cause");
        Intrinsics.isThisObjectNull(th3, "exception");
        if (m25867c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.m26613a(th2, th3);
        }
    }
}
