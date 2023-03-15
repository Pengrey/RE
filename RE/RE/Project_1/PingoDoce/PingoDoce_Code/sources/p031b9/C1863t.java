package p031b9;

import java.io.PrintStream;

/* renamed from: b9.t */
/* loaded from: classes.dex */
public final class C1863t {

    /* renamed from: a */
    static final AbstractC1857n f5584a;

    static {
        AbstractC1857n c1861r;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            c1861r = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C1860q() : new C1861r() : new C1862s();
        } catch (Throwable th2) {
            PrintStream printStream = System.err;
            String name = C1861r.class.getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 133);
            sb2.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb2.append(name);
            sb2.append("will be used. The error is: ");
            printStream.println(sb2.toString());
            th2.printStackTrace(System.err);
            c1861r = new C1861r();
        }
        f5584a = c1861r;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    /* renamed from: a */
    public static void m35249a(Throwable th2, Throwable th3) {
        f5584a.mo35250a(th2, th3);
    }
}
