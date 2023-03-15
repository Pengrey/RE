package p105fd;

import p083ed.JDK7PlatformImplementations;
import p255nd.AbstractC7700c;
import p273od.C8061a;

/* renamed from: fd.a */
/* loaded from: classes2.dex */
public class C5453a extends JDK7PlatformImplementations {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JDK8PlatformImplementations.kt */
    /* renamed from: fd.a$a */
    /* loaded from: classes2.dex */
    public static final class C5454a {

        /* renamed from: a */
        public static final Integer f15360a;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        static {
            /*
                fd.a$a r0 = new fd.a$a
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
                p105fd.C5453a.C5454a.f15360a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p105fd.C5453a.C5454a.<clinit>():void");
        }

        private C5454a() {
        }
    }

    /* renamed from: c */
    private final boolean m24302c(int i) {
        Integer num = C5454a.f15360a;
        return num == null || num.intValue() >= i;
    }

    @Override // p064dd.PlatformImplementations
    /* renamed from: b */
    public AbstractC7700c mo24303b() {
        return m24302c(24) ? new C8061a() : super.mo24303b();
    }
}
