package p064dd;

import java.lang.reflect.Method;
import p181jd.Intrinsics;
import p255nd.AbstractC7700c;
import p255nd.C7698b;

/* renamed from: dd.a */
/* loaded from: classes2.dex */
public class PlatformImplementations {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlatformImplementations.kt */
    /* renamed from: dd.a$a */
    /* loaded from: classes2.dex */
    public static final class C4783a {

        /* renamed from: a */
        public static final Method f13102a;

        /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[LOOP:0: B:3:0x0013->B:12:0x003c, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[EDGE_INSN: B:22:0x0040->B:14:0x0040 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                dd.a$a r0 = new dd.a$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p181jd.Intrinsics.checkIfNull(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L13:
                if (r4 >= r2) goto L3f
                r5 = r1[r4]
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = p181jd.Intrinsics.equals(r6, r7)
                if (r6 == 0) goto L38
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                p181jd.Intrinsics.checkIfNull(r6, r7)
                java.lang.Object r6 = p489zc.C13768k.m366L(r6)
                boolean r6 = p181jd.Intrinsics.equals(r6, r0)
                if (r6 == 0) goto L38
                r6 = 1
                goto L39
            L38:
                r6 = r3
            L39:
                if (r6 == 0) goto L3c
                goto L40
            L3c:
                int r4 = r4 + 1
                goto L13
            L3f:
                r5 = 0
            L40:
                p064dd.PlatformImplementations.C4783a.f13102a = r5
                int r0 = r1.length
            L43:
                if (r3 >= r0) goto L57
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = p181jd.Intrinsics.equals(r2, r4)
                if (r2 == 0) goto L54
                goto L57
            L54:
                int r3 = r3 + 1
                goto L43
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p064dd.PlatformImplementations.C4783a.<clinit>():void");
        }

        private C4783a() {
        }
    }

    /* renamed from: a */
    public void m26613a(Throwable th2, Throwable th3) {
        Intrinsics.isThisObjectNull(th2, "cause");
        Intrinsics.isThisObjectNull(th3, "exception");
        Method method = C4783a.f13102a;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    /* renamed from: b */
    public AbstractC7700c mo24303b() {
        return new C7698b();
    }
}
